package OSI.OSU.SI.OVI.OVQ.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.chuFangWuXingShowH;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.ScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.*;
public class ChuFangWuXingShowHView extends OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ{
	private static final long serialVersionUID = 1L;
	public JButton button;
	public String path;
	public ChuFangWuXingShowHView(){
		super();
	}
	public void view() throws Exception{
		try {
			scrollPane = new ScrollPane();
			panel=new Panel(){
				private static final long serialVersionUID = 1L;
				public void paint(Graphics g){
					ImageIcon image =new ImageIcon(getClass().getResource("bagua_ljbz.png"));
					Image im = image.getImage();
					g.drawImage(im,0,0,this);
					g.drawString(""+((topMapOut.containsKey("������")?topMapOut.get("������"):0)
							+(topMapOut.containsKey("������")?topMapOut.get("������"):0)
							+(topMapOut.containsKey("������")?topMapOut.get("������"):0)
							+(topMapOut.containsKey("��̫��")?topMapOut.get("��̫��"):0)
							), 320-30, 15);	
					
					g.drawString(""+((topMapOut.containsKey("������")?topMapOut.get("������"):0)
							
							), 20, 70);	 
					
					g.drawString(""+((topMapOut.containsKey("������")?topMapOut.get("������"):0)

							), 20, 210);	 
					
					g.drawString(""+((topMapOut.containsKey("������")?topMapOut.get("������"):0)
							+(topMapOut.containsKey("������")?topMapOut.get("������"):0)
							), 50, 350);	 
					
					
					g.drawString(""+((topMapOut.containsKey("������")?topMapOut.get("������"):0)
							+(topMapOut.containsKey("��̫��")?topMapOut.get("��̫��"):0)
							+(topMapOut.containsKey("������")?topMapOut.get("������"):0)
							), 320-30, 300);	 
					
					g.drawString(""+((topMapOut.containsKey("������")?topMapOut.get("������"):0)
							), 500, 300);	 
					
					g.drawString(""+((topMapOut.containsKey("��̫��")?topMapOut.get("��̫��"):0)
							), 550, 210);	 
					
					g.drawString(""+((topMapOut.containsKey("��̫��")?topMapOut.get("��̫��"):0)
							), 500-30, 70);	 
				}	
			};	
			scrollPane.add(panel);
			add(scrollPane);
			close = false;
			
		}catch(Exception e) {
		}
		
	}
	@Override
	public OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ clone() {
		objectView = (OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ)super.clone();  
		return objectView;  
	}  
}
