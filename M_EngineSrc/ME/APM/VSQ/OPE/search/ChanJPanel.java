package ME.APM.VSQ.OPE.search;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ChanJPanel extends JPanel implements MouseListener, KeyListener, ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ChanJPanel(JTextField name){
		this.setLayout(null);
		this.setBounds(0, 0, 780, 610);
		this.setBackground(Color.BLACK);
		//copy tab
		JLabel ͣ��= new JLabel("ͣ��:");  
		ͣ��.setForeground(Color.WHITE);
		ͣ��.setBounds(10+110+110+440, 20+0, 100, 50);
		JCheckBox ͣ��_box= new JCheckBox();
		ͣ��_box.setBounds(10+60+110+110+440, 33+0, 20, 20);
		ͣ��_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(ͣ��_box.isSelected()) {
					if(!name.getText().contains("ͣ��")) {
						name.setText(name.getText()+" ͣ��");
					}
				}else {
					if(name.getText().contains("ͣ��")) {
						name.setText(name.getText().replace("ͣ��", ""));
					}
				}
				
			}
		});
		this.add(ͣ��);
		this.add(ͣ��_box);	
		
		//copy tab
		JLabel �پ�= new JLabel("�پ�:");  
		�پ�.setForeground(Color.WHITE);
		�پ�.setBounds(10+110+110+440, 20+25, 100, 50);
		JCheckBox �پ�_box= new JCheckBox();
		�پ�_box.setBounds(10+60+110+110+440, 33+25, 20, 20);
		�پ�_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(�پ�_box.isSelected()) {
					if(!name.getText().contains("�پ�")) {
						name.setText(name.getText()+" �پ�");
					}
				}else {
					if(name.getText().contains("�پ�")) {
						name.setText(name.getText().replace("�پ�", ""));
					}
				}
				
			}
		});
		this.add(�پ�);
		this.add(�پ�_box);	
		//copy tab
		JLabel �¾�����= new JLabel("�¾�����:");  
		�¾�����.setForeground(Color.WHITE);
		�¾�����.setBounds(10+110+110+440, 20+75, 100, 50);
		JCheckBox �¾�����_box= new JCheckBox();
		�¾�����_box.setBounds(10+60+110+110+440, 33+75, 20, 20);
		�¾�����_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(�¾�����_box.isSelected()) {
					if(!name.getText().contains("�¾�����")) {
						name.setText(name.getText()+" �¾�����");
					}
				}else {
					if(name.getText().contains("�¾�����")) {
						name.setText(name.getText().replace("�¾�����", ""));
					}
				}
				
			}
		});
		this.add(�¾�����);
		this.add(�¾�����_box);	
		//copy tab
		JLabel ��Ѫ����= new JLabel("��Ѫ����:");  
		��Ѫ����.setForeground(Color.WHITE);
		��Ѫ����.setBounds(10+110+110+440, 20+100, 100, 50);
		JCheckBox ��Ѫ����_box= new JCheckBox();
		��Ѫ����_box.setBounds(10+60+110+110+440, 33+100, 20, 20);
		��Ѫ����_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(��Ѫ����_box.isSelected()) {
					if(!name.getText().contains("��Ѫ����")) {
						name.setText(name.getText()+" ��Ѫ����");
					}
				}else {
					if(name.getText().contains("��Ѫ����")) {
						name.setText(name.getText().replace("��Ѫ����", ""));
					}
				}
				
			}
		});
		this.add(��Ѫ����);
		this.add(��Ѫ����_box);	
		
		//copy tab
		JLabel ʹ��= new JLabel("ʹ��:");  
		ʹ��.setForeground(Color.WHITE);
		ʹ��.setBounds(10+110+110+440, 20+125, 100, 50);
		JCheckBox ʹ��_box= new JCheckBox();
		ʹ��_box.setBounds(10+60+110+110+440, 33+125, 20, 20);
		ʹ��_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(ʹ��_box.isSelected()) {
					if(!name.getText().contains("ʹ��")) {
						name.setText(name.getText()+" ʹ��");
					}
				}else {
					if(name.getText().contains("ʹ��")) {
						name.setText(name.getText().replace("ʹ��", ""));
					}
				}
				
			}
		});
		this.add(ʹ��);
		this.add(ʹ��_box);	
		//copy tab
		JLabel ���Ҿ���= new JLabel("���Ҿ���:");  
		���Ҿ���.setForeground(Color.WHITE);
		���Ҿ���.setBounds(10+110+110+440, 20+150, 100, 50);
		JCheckBox ���Ҿ���_box= new JCheckBox();
		���Ҿ���_box.setBounds(10+60+110+110+440, 33+150, 20, 20);
		���Ҿ���_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(���Ҿ���_box.isSelected()) {
					if(!name.getText().contains("��������")) {
						name.setText(name.getText()+" ��������");
					}
				}else {
					if(name.getText().contains("��������")) {
						name.setText(name.getText().replace("��������", ""));
					}
				}
				
			}
		});
		this.add(���Ҿ���);
		this.add(���Ҿ���_box);	
		//copy tab
		JLabel ����= new JLabel("����:");  
		����.setForeground(Color.WHITE);
		����.setBounds(10+110+110+440, 20+175, 100, 50);
		JCheckBox ����_box= new JCheckBox();
		����_box.setBounds(10+60+110+110+440, 33+175, 20, 20);
		����_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(����_box.isSelected()) {
					if(!name.getText().contains("����")) {
						name.setText(name.getText()+" ����");
					}
				}else {
					if(name.getText().contains("����")) {
						name.setText(name.getText().replace("����", ""));
					}
				}
				
			}
		});
		this.add(����);
		this.add(����_box);	
		//copy tab
		JLabel �Ѳ�= new JLabel("�Ѳ�:");  
		�Ѳ�.setForeground(Color.WHITE);
		�Ѳ�.setBounds(10+110+110+440, 20+200, 100, 50);
		JCheckBox �Ѳ�_box= new JCheckBox();
		�Ѳ�_box.setBounds(10+60+110+110+440, 33+200, 20, 20);
		�Ѳ�_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(�Ѳ�_box.isSelected()) {
					if(!name.getText().contains("�Ѳ�")) {
						name.setText(name.getText()+" �Ѳ�");
					}
				}else {
					if(name.getText().contains("�Ѳ�")) {
						name.setText(name.getText().replace("�Ѳ�", ""));
					}
				}
				
			}
		});
		this.add(�Ѳ�);
		this.add(�Ѳ�_box);	
		//copy tab
		JLabel ����= new JLabel("����:");  
		����.setForeground(Color.WHITE);
		����.setBounds(10+110+110+440, 20+225, 100, 50);
		JCheckBox ����_box= new JCheckBox();
		����_box.setBounds(10+60+110+110+440, 33+225, 20, 20);
		����_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(����_box.isSelected()) {
					if(!name.getText().contains("����")) {
						name.setText(name.getText()+" ����");
					}
				}else {
					if(name.getText().contains("����")) {
						name.setText(name.getText().replace("����", ""));
					}
				}
				
			}
		});
		this.add(����);
		this.add(����_box);	
		//copy tab
		JLabel ����= new JLabel("����:");  
		����.setForeground(Color.WHITE);
		����.setBounds(10, 20, 100, 50);
		JCheckBox ����_box= new JCheckBox();
		����_box.setBounds(10+60, 33, 20, 20);
		����_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(����_box.isSelected()) {
					if(!name.getText().contains("����")) {
						name.setText(name.getText()+" ����");
					}
				}else {
					if(name.getText().contains("����")) {
						name.setText(name.getText().replace("����", ""));
					}
				}
				
			}
		});
		this.add(����);
		this.add(����_box);	
		//copy tab
		JLabel ����= new JLabel("����:");  
		����.setForeground(Color.WHITE);
		����.setBounds(10, 20+25, 100, 50);
		JCheckBox ����_box= new JCheckBox();
		����_box.setBounds(10+60, 33+25, 20, 20);
		����_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(����_box.isSelected()) {
					if(!name.getText().contains("����")) {
						name.setText(name.getText()+" ����");
					}
				}else {
					if(name.getText().contains("����")) {
						name.setText(name.getText().replace("����", ""));
					}
				}
				
			}
		});
		this.add(����);
		this.add(����_box);	
		//copy tab
		JLabel ���= new JLabel("���:");  
		���.setForeground(Color.WHITE);
		���.setBounds(10, 20+25+25, 100, 50);
		JCheckBox ���_box= new JCheckBox();
		���_box.setBounds(10+60, 33+25+25, 20, 20);
		���_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(���_box.isSelected()) {
					if(!name.getText().contains("���")) {
						name.setText(name.getText()+" ���");
					}
				}else {
					if(name.getText().contains("���")) {
						name.setText(name.getText().replace("���", ""));
					}
				}
				
			}
		});
		this.add(���);
		this.add(���_box);	
		//copy tab
		JLabel ���= new JLabel("���:");  
		���.setForeground(Color.WHITE);
		���.setBounds(10, 20+25+25+25, 100, 50);
		JCheckBox ���_box= new JCheckBox();
		���_box.setBounds(10+60, 33+25+25+25, 20, 20);
		���_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(���_box.isSelected()) {
					if(!name.getText().contains("���")) {
						name.setText(name.getText()+" ���");
					}
				}else {
					if(name.getText().contains("���")) {
						name.setText(name.getText().replace("���", ""));
					}
				}
				
			}
		});
		this.add(���);
		this.add(���_box);	
		//copy tab
		JLabel ��̥= new JLabel("��̥:");  
		��̥.setForeground(Color.WHITE);
		��̥.setBounds(10, 20+25+25+25+25, 100, 50);
		JCheckBox ��̥_box= new JCheckBox();
		��̥_box.setBounds(10+60, 33+25+25+25+25, 20, 20);
		��̥_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(��̥_box.isSelected()) {
					if(!name.getText().contains("��̥")) {
						name.setText(name.getText()+" ��̥");
					}
				}else {
					if(name.getText().contains("��̥")) {
						name.setText(name.getText().replace("��̥", ""));
					}
				}
				
			}
		});
		this.add(��̥);
		this.add(��̥_box);	
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