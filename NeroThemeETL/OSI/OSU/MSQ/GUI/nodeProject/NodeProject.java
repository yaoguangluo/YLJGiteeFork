package OSI.OSU.MSQ.GUI.nodeProject;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
public class NodeProject extends JScrollPane {
	private static final long serialVersionUID= 866589699634559456L;
	private ImageIcon images;
	public Image newImg;
	public MyPanel jPanel;
	public Image img;
	public NodeProject() {
		images= new ImageIcon(this.getClass().getResource("etl.png"));
		img= images.getImage(); 
		jPanel= new MyPanel();
		jPanel.repaint();
		// jPanel.setPreferredSize(new Dimension(200,200));
		this.setViewportView(jPanel);
	}
	public void addimg() {
		images= new ImageIcon(this.getClass().getResource("etl.png"));
		img= images.getImage(); 
	}
	public class MyPanel extends JPanel {	
		public Image newimg;
		private static final long serialVersionUID = 1L;
		public MyPanel(){
			setLayout(null);
		}
		public void paint(Graphics g) {
			((Graphics2D) g).drawImage(newimg, 0, 0, this);
		}
	}
}