package ME.APM.VSQ;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import ME.S.stables.PathLinkFile;
import ME.APM.VSQ.ESI.SVQ.search.CaiJPanel;
public class TagSearch extends ScrollPane implements MouseListener, KeyListener, ActionListener{	
	private static final long serialVersionUID= 1L;
	public void init(JTextField name){
		PathLinkFile.DNA_PDN.put(this.getClass().getCanonicalName(), true);
		JTabbedPane jTabbedpane= new JTabbedPane();
		Container �������Container= new Container();
		CaiJPanel �������JPanel= new CaiJPanel(name);
		�������Container.setLayout(null);
		�������Container.setBounds(0, 0, 1490, 980);
		�������Container.add(�������JPanel);
		jTabbedpane.addTab("�������", new ImageIcon(), �������Container, "���ʻ�Ľ�����ϸ���͡�");
		jTabbedpane.setMnemonicAt(0, KeyEvent.VK_0); 
		
		Container �²�����Container= new Container();
		CaiJPanel �²�����JPanel= new CaiJPanel(name);
		�²�����Container.setLayout(null);
		�²�����Container.setBounds(0, 0, 1490, 980);
		�²�����Container.add(�²�����JPanel);
		jTabbedpane.addTab("�²�����", new ImageIcon(), �²�����Container, "�²�����");
		jTabbedpane.setMnemonicAt(1, KeyEvent.VK_1); 
		
		Container ��������Container= new Container();
		CaiJPanel ��������JPanel= new CaiJPanel(name);
		��������Container.setLayout(null);
		��������Container.setBounds(0, 0, 1490, 980);
		��������Container.add(��������JPanel);
		jTabbedpane.addTab("��������", new ImageIcon(), ��������Container, "��������");
		jTabbedpane.setMnemonicAt(2, KeyEvent.VK_2); 
		
		Container ��������Container= new Container();
		CaiJPanel ��������JPanel= new CaiJPanel(name);
		��������Container.setLayout(null);
		��������Container.setBounds(0, 0, 1490, 980);
		��������Container.add(��������JPanel);
		jTabbedpane.addTab("��������", new ImageIcon(), ��������Container, "��������");
		jTabbedpane.setMnemonicAt(3, KeyEvent.VK_3); 
		
		Container �������Container= new Container();
		CaiJPanel �������JPanel= new CaiJPanel(name);
		�������Container.setLayout(null);
		�������Container.setBounds(0, 0, 1490, 980);
		�������Container.add(�������JPanel);
		jTabbedpane.addTab("�������", new ImageIcon(), �������Container, "�������");
		jTabbedpane.setMnemonicAt(4, KeyEvent.VK_4);
		
		this.setPreferredSize(new Dimension(450, 300));
		this.add(jTabbedpane);
		this.setBounds(0, 0, 455, 305);
		this.setVisible(true);
		this.validate();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
		
}