package ME.APM.VSQ.ESI.SVQ.search;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CaiJPanel extends JPanel implements MouseListener, KeyListener, ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CaiJPanel(JTextField name){
		this.setLayout(null);
		this.setBounds(0, 0, 780, 610);
		this.setBackground(Color.BLACK);
//		//copy tab
		JLabel ��������= new JLabel("�������ģ�֮�����������չһ��Ӧ���� @^_^@ ");  
		��������.setForeground(Color.orange);
		��������.setBounds(10, 5, 400, 50);
		this.add(��������);
		
		JLabel ����ƴ��= new JLabel("����ƴ����֮�����������չһ��Ӧ���� @^_^@ ");  
		����ƴ��.setForeground(Color.WHITE);
		����ƴ��.setBounds(10, 5+ 25, 400, 50);
		this.add(����ƴ��);

		JLabel �������= new JLabel("������ͣ�֮�����������չһ��Ӧ���� @^_^@ ");  
		�������.setForeground(Color.WHITE);
		�������.setBounds(10, 5+ 50, 400, 50);
		this.add(�������);
		
		JLabel ���﷭��= new JLabel("���﷭�룺֮�����������չһ��Ӧ���� @^_^@ ");  
		���﷭��.setForeground(Color.WHITE);
		���﷭��.setBounds(10, 5+ 75, 400, 50);
		this.add(���﷭��);
		
		JLabel ͬ�����= new JLabel("ͬ����֮�����������չһ��Ӧ���� @^_^@ ");  
		ͬ�����.setForeground(Color.WHITE);
		ͬ�����.setBounds(10, 5+ 100, 400, 50);
		this.add(ͬ�����);
		
		JLabel �������= new JLabel("������֮�����������չһ��Ӧ���� @^_^@ ");  
		�������.setForeground(Color.WHITE);
		�������.setBounds(10, 5+ 125, 400, 50);
		this.add(�������);
		
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