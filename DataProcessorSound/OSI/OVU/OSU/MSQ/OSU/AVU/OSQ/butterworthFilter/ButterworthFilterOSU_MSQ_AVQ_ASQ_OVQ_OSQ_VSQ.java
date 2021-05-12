package OSI.OVU.OSU.MSQ.OSU.AVU.OSQ.butterworthFilter;
import java.awt.Color;


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;


import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.geom.Line2D;


import java.util.Vector;

import javax.swing.JButton;

import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.*;
import PEU.P.sound.*;
public class ButterworthFilterOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ extends OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ{
	private static final long serialVersionUID = 1L;
	public JButton button;
	public String path;
	@SuppressWarnings("rawtypes")
	public Vector lines = new Vector();
	public ButterworthFilterOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ(){
	}
	public void view() throws Exception{
		scrollPane = new ScrollPane();
		SoundWaveVector sv=new SoundWaveVector();
		lines= sv.getVectorLines(aisout);
		aisout = new BytestoAIS().getAIS(sv.audioData,aisout);

		panel=new Panel(){
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@SuppressWarnings("unused")
			public void paint(Graphics g) {

				Dimension d = this.getSize();
				int w = 800;
				int h = 600;
				// System.out.println(d.width+"**"+d.height);
				int INFOPAD = 15;
				//Graphics g= getGraphics();  
				Graphics2D g2 = (Graphics2D) g;
				g2.setBackground(Color.white);
				g2.clearRect(0, 0, w, h);
				g2.setColor(Color.white);
				g2.fillRect(0, h-INFOPAD, w, INFOPAD);
				if (aisout != null) {
					// .. render sampling graph ..
					g2.setColor(Color.black);
					for (int i = 1; i < lines.size(); i++) {
						Line2D v=(Line2D) lines.get(i);
						//System.out.println(v.getX1()+"|"+v.getY1()+"|"+v.getX2()+"|"+v.getY2());
						g2.draw((Line2D) lines.get(i));
					}
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
