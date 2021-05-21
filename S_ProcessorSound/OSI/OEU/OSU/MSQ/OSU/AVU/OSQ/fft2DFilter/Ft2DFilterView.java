package OSI.OEU.OSU.MSQ.OSU.AVU.OSQ.fft2DFilter;
import java.awt.Color;


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Panel;
import java.awt.ScrollPane;


import java.awt.image.BufferedImage;
import java.util.Vector;

import javax.swing.JButton;

import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.*;



public class Ft2DFilterView extends OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ
{
	private static final long serialVersionUID = 1L;
	public JButton button;
	public String path;
	@SuppressWarnings("rawtypes")
	public Vector lines = new Vector();
	public Ft2DFilterView()
	{
 	}
	public void view() throws Exception
	{
		scrollPane = new ScrollPane();
		lygout.toHead();
		panel=new Panel()
		{
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@SuppressWarnings("unused")
			public void paint(Graphics g) {

		     	 Dimension d = this.getSize();
		          int w = 500;
		          int h = 500;
		         // System.out.println(d.width+"**"+d.height);
		          int INFOPAD = 15;
		          //Graphics g= getGraphics(); 
		          Graphics2D g2 = (Graphics2D) g;
		          g2.setBackground(Color.white);
		          g2.clearRect(0, 0, w, h);
		          g2.setColor(Color.white);
		          g2.fillRect(0, h-INFOPAD, w, INFOPAD);
		              if (lygout.adataFrame.audiofft != null) 
		              {
		                      // .. render sampling graph ..
		                      g2.setColor(Color.black);
		                      
		                      /*
		                      for(int i = 0; i < lygout.adataFrame.audiofft[0].length-1; i++) 
		                      {
		                	  //System.out.println(v.getX1()+"|"+v.getY1()+"|"+v.getX2()+"|"+v.getY2());
		                    	  int x0=(int)lygout.adataFrame.audiofft[0][i].getImaginary();
		                    	  int y0=(int)lygout.adataFrame.audiofft[0][i].getReal();
		                    	  int x1=(int)lygout.adataFrame.audiofft[0][i+1].getImaginary();
		                    	  int y1=(int)lygout.adataFrame.audiofft[0][i+1].getReal();
		                	  
		                    	  
		                    	  g2.drawLine(Math.abs(x0/1024), Math.abs(y0/1024), Math.abs(x1/1024), Math.abs(y1/1024));
		                	  
		                      }
		                      */
		                      
		                      BufferedImage image = new BufferedImage(lygout.fftmatrix[0].length, lygout.fftmatrix.length, BufferedImage.TYPE_INT_RGB);
		    			      for (int i = 0; i < image.getHeight(); ++i) {
		    			    	    for (int j1 = 0; j1 < image.getWidth(); ++j1) {
		    			    	    	int val = (int) lygout.fftmatrix[i][j1];
		    			    			int pixel = (val << 16) | (val << 8) | (val);
		    			    			image.setRGB(j1, i, pixel);
		    			    		}
		    			      }
		    			       Image im=(Image)image;
		    		           g2.drawImage(im,0,0,this);	
		                      
		                      
		            
		                      
		                      
		                      
		              }
		     }
		};	
		//
		scrollPane.add(panel);
		add(scrollPane);
		close=false;
	}
	    @Override  
	    public OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ clone() {   
	        objectView = (OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ)super.clone();  
	        return objectView;  
	    }  
	
	
}
