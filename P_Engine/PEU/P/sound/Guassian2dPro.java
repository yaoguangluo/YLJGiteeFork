package PEU.P.sound;
import java.awt.Dimension;
import java.awt.geom.Line2D;
import java.awt.geom.Line2D.Double;
import java.util.Vector;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;

import PEU.P.movie.LYGFileIO;

public class Guassian2dPro{
	Vector<Double> lines= new Vector<Double>();
	byte[] audioBytes;
	public double []guassian;
	AudioFormat af;
	AudioInputStream ais;
	@SuppressWarnings("rawtypes")
	public Vector getVectorLines(AudioInputStream ais1){
		ais=ais1;
		lines.removeAllElements();  // clear the old vector
		af = ais.getFormat();
		audioBytes=null;
		if (audioBytes == null)  {
			try {
				audioBytes = new byte[(int) (ais.getFrameLength() *af.getFrameSize())];
				System.out.println("audiobyte length:"+audioBytes.length);
				ais.read(audioBytes);
			} catch (Exception ex) { 
				//reportStatus(ex.toString());
				return null; 
			}
		}
		Dimension d = new Dimension(800,600);
		int w = d.width;
		int h = d.height-15;
		int[] audioData = null;
		if (af.getSampleSizeInBits() == 16) {
			int nlengthInSamples = audioBytes.length / 2;
			audioData = new int[nlengthInSamples];
			if (af.isBigEndian()) {
				for (int i = 0; i < nlengthInSamples; i++) {
					/* First byte is MSB (high order) */
					int MSB = (int) audioBytes[2*i];
					/* Second byte is LSB (low order) */
					int LSB = (int) audioBytes[2*i+1];
					audioData[i] = MSB << 8 | (255 & LSB);
				}
			} else {
				for (int i = 0; i < nlengthInSamples; i++) {
					/* First byte is LSB (low order) */
					int LSB = (int) audioBytes[2*i];
					/* Second byte is MSB (high order) */
					int MSB = (int) audioBytes[2*i+1];
					audioData[i] = MSB << 8 | (255 & LSB);
				}
			}
		} else if (af.getSampleSizeInBits() == 8)  {
			int nlengthInSamples = audioBytes.length;
			audioData = new int[nlengthInSamples];
			if (af.getEncoding().toString().startsWith("PCM_SIGN")) {
				for (int i = 0; i < audioBytes.length; i++) {
					audioData[i] = audioBytes[i];
				}
			} else {
				for (int i = 0; i < audioBytes.length; i++){
					audioData[i] = audioBytes[i] - 128;
				}
			}
		}
		System.out.println(audioBytes.length);
		System.out.println(af.getFrameSize());        
		double []gua=new double[5];
		double sig=1.6;
		double t = 0;
		double sumhere = 0;
		for(int l = 0; l<5; ++l){    	    
			t = (Math.pow(l-(5/2), 2))/(Math.pow(sig, 2));
			t = Math.exp(-t); 
			t = (1*t)/(2*Math.PI*Math.pow(sig, 2));
			gua[l] = t;
			sumhere = sumhere + gua[l];
		}	 

		System.out.println("--->"+sumhere); 	
		//--normalization      
		double sum1=0;
		for(int j=0; j<5; ++j)  {
			gua[j] = gua[j]/sumhere;
			sum1 = sum1 + gua[j];
		}

		//--end of producing gaussian matrix
		System.out.println("gaussian sum: " + sum1);
		guassian=new double[audioData.length];
		double sum=0;
		for(int i=2;i<audioData.length-2;i++) {  
			sum=0;
			for(int j=-2;j<3;j++){
				sum = sum + (audioData[i+j]* gua[j+2]);	
			}
			guassian[i]=sum;
		}
		double y_last = 0;
		System.out.println(w);
		System.out.println(audioData.length);
		int frames_per_pixel = audioBytes.length / af.getFrameSize()/w;
		byte my_byte = 0;
		int idx=0;
		int numChannels = af.getChannels();
		for (double x = 0; x < w && audioData != null; x++)  {
			idx = (int) (frames_per_pixel * numChannels * x);
			if (af.getSampleSizeInBits() == 8)   {
				my_byte = (byte) guassian[idx];
			} else {
				my_byte = (byte)(128*guassian[idx]/32768);
			}
			double y_new = (double)(h*(128-my_byte)/256);
			lines.add(new Line2D.Double(x, y_last,x,y_new));
			y_last=y_new;
		}
		return lines;
	}
	@SuppressWarnings("rawtypes")
	public Vector getVectorLines(LYGFileIO toplygin) {
		toplygin.init();	 
		if(toplygin.adataFrame!=null){
			this.getVectorLines(toplygin.adataFrame.audioIS);
			while(toplygin.adataFrame.next!=null)
			{
				toplygin.adataFrame=toplygin.adataFrame.next;
				this.getVectorLines(toplygin.adataFrame.audioIS);
			}
		}
		toplygin.init();
		// TODO Auto-generated method stub
		return null;
	}
}