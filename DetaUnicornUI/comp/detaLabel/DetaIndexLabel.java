package comp.detaLabel;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;

import ME.sample.app.hospital.DetaLabelStables;

public class DetaIndexLabel extends JLabel implements MouseListener{
	private static final long serialVersionUID = 1L;
	public String tagName= "";
	public Box box;
	//����Ƭ��������, ֮����庯������
	public JFrame frameTag= new JFrame("��ʾ��");
	public boolean ShowTag= false;
	public boolean inited= false;
	public int openx=0;
	public int openy=0;
	public int closex=0;
	public int closey=0;
	public boolean isIndex= false;

	//������
	//Ϊ�˱��⻨��,Ӱ�����, �߼����Ϊ�����,����ƶ������ر�.
	public DetaIndexLabel(String name ) { 
		super(name); 
		this.setForeground(Color.lightGray);
		this.setBackground(Color.black);
		this.addMouseListener(this);
	}


	public void setTag(String string, boolean True) {
		
	}

	public void setIndex(String string) {
		DetaLabelStables.stableImages.setIndexString(string);
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		
	}
}