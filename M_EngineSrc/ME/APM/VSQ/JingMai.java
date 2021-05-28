package ME.APM.VSQ;

import java.awt.Dimension;  

import java.awt.Graphics;  
import java.awt.Graphics2D;  
import java.awt.Image;  
import java.awt.Panel;  
import java.awt.image.BufferedImage;  
import javax.swing.ImageIcon;  
import ME.S.stables.PathLinkFile;
public class JingMai extends Panel{  
	private static final long serialVersionUID = 1L;
	public ImageIcon png1 = new ImageIcon(getClass().getResource("�������İ���.png"));  
	public ImageIcon png2 = new ImageIcon(getClass().getResource("������������.png"));  
	public ImageIcon png3 = new ImageIcon(getClass().getResource("�������ľ�.png"));  
	public ImageIcon png4 = new ImageIcon(getClass().getResource("��̫��С����.png"));  
	public ImageIcon png5 = new ImageIcon(getClass().getResource("��̫���ξ�.png"));  
	public ImageIcon png6 = new ImageIcon(getClass().getResource("�������󳦾�.png"));  
	public ImageIcon png7 = new ImageIcon(getClass().getResource("�������ξ�.png"));  
	public ImageIcon png8 = new ImageIcon(getClass().getResource("����������.png"));
	public ImageIcon png9 = new ImageIcon(getClass().getResource("����������.png"));  
	public ImageIcon png10 = new ImageIcon(getClass().getResource("��̫�����׾�.png"));  
	public ImageIcon png11 = new ImageIcon(getClass().getResource("��̫��Ƣ��.png"));  
	public ImageIcon png12 = new ImageIcon(getClass().getResource("������θ��.png"));  

	private final Image screenImage = new BufferedImage(800, 600, 2);  

	private final Graphics2D screenGraphic = (Graphics2D) screenImage  
			.getGraphics();  

	private Image backgroundImage;  

	public JingMai() {  
		PathLinkFile.DNA_PDN.put(this.getClass().getCanonicalName(), true);
		loadImage();  
		// �趨�����ڱ�����  
		setFocusable(true);  
		// �趨��ʼ����ʱ����С,�����Ȳ���ͼƬ�Ĵ�С  
		setPreferredSize(new Dimension(800,600));  
		// ���Ʊ���  
		drawView();  
	}  

	/** 
	 * ����ͼ�� 
	 */  
	private void loadImage() {  
		//��õ�ǰ���Ӧ�����λ��image�ļ����µı���ͼ��  
		//��ͼ��ʵ������backgroundImage  
		backgroundImage = png1.getImage();  
	}  

	private void drawView() {  
		screenGraphic.drawImage(backgroundImage, 0, 0, null);  
	}  

	public void paint(Graphics g) {  
		g.drawImage(screenImage, 0, 0, null);  
	}  

}  