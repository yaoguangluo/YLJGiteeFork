package ME.APM.VSQ.OPE.config;
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

public class YangJPanel extends JPanel implements MouseListener, KeyListener, ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public YangJPanel(JTextField name){
		this.setLayout(null);
		this.setBounds(0, 0, 780, 610);
		this.setBackground(Color.BLACK);

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
				JLabel ���ɹ���= new JLabel("���ɹ���:");  
				���ɹ���.setForeground(Color.WHITE);
				���ɹ���.setBounds(10, 20+25, 100, 50);
				JCheckBox ���ɹ���_box= new JCheckBox();
				���ɹ���_box.setBounds(10+60, 33+25, 20, 20);
				���ɹ���_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(���ɹ���_box.isSelected()) {
							if(!name.getText().contains("���ɹ���")) {
								name.setText(name.getText()+" ���ɹ���");
							}
						}else {
							if(name.getText().contains("���ɹ���")) {
								name.setText(name.getText().replace("���ɹ���", ""));
							}
						}
						
					}
				});
				this.add(���ɹ���);
				this.add(���ɹ���_box);	
				//copy tab
				JLabel Ƥ��= new JLabel("Ƥ��:");  
				Ƥ��.setForeground(Color.WHITE);
				Ƥ��.setBounds(10, 20+50, 100, 50);
				JCheckBox Ƥ��_box= new JCheckBox();
				Ƥ��_box.setBounds(10+60, 33+50, 20, 20);
				Ƥ��_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Ƥ��_box.isSelected()) {
							if(!name.getText().contains("Ƥ��")) {
								name.setText(name.getText()+" Ƥ��");
							}
						}else {
							if(name.getText().contains("Ƥ��")) {
								name.setText(name.getText().replace("Ƥ��", ""));
							}
						}
						
					}
				});
				this.add(Ƥ��);
				this.add(Ƥ��_box);	
				//copy tab
				JLabel �Ӵ���= new JLabel("�Ӵ���:");  
				�Ӵ���.setForeground(Color.WHITE);
				�Ӵ���.setBounds(10, 20+75, 100, 50);
				JCheckBox �Ӵ���_box= new JCheckBox();
				�Ӵ���_box.setBounds(10+60, 33+75, 20, 20);
				�Ӵ���_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(�Ӵ���_box.isSelected()) {
							if(!name.getText().contains("�Ӵ���")) {
								name.setText(name.getText()+" �Ӵ���");
							}
						}else {
							if(name.getText().contains("�Ӵ���")) {
								name.setText(name.getText().replace("�Ӵ���", ""));
							}
						}
						
					}
				});
				this.add(�Ӵ���);
				this.add(�Ӵ���_box);	
				//copy tab
				JLabel ����= new JLabel("����:");  
				����.setForeground(Color.WHITE);
				����.setBounds(10, 20+100, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60, 33+100, 20, 20);
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
				����.setBounds(10, 20+125, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60, 33+125, 20, 20);
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
				JLabel ��۽�= new JLabel("��۽�:");  
				��۽�.setForeground(Color.WHITE);
				��۽�.setBounds(10, 20+150, 100, 50);
				JCheckBox ��۽�_box= new JCheckBox();
				��۽�_box.setBounds(10+60, 33+150, 20, 20);
				��۽�_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(��۽�_box.isSelected()) {
							if(!name.getText().contains("��۽�")) {
								name.setText(name.getText()+" ��۽�");
							}
						}else {
							if(name.getText().contains("��۽�")) {
								name.setText(name.getText().replace("��۽�", ""));
							}
						}
						
					}
				});
				this.add(��۽�);
				this.add(��۽�_box);	
				//copy tab
				JLabel ����= new JLabel("����:");  
				����.setForeground(Color.WHITE);
				����.setBounds(10, 20+175, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60, 33+175, 20, 20);
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
				JLabel �����= new JLabel("�����:");  
				�����.setForeground(Color.WHITE);
				�����.setBounds(10, 20+200, 100, 50);
				JCheckBox �����_box= new JCheckBox();
				�����_box.setBounds(10+60, 33+200, 20, 20);
				�����_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(�����_box.isSelected()) {
							if(!name.getText().contains("�����")) {
								name.setText(name.getText()+" �����");
							}
						}else {
							if(name.getText().contains("�����")) {
								name.setText(name.getText().replace("�����", ""));
							}
						}
						
					}
				});
				this.add(�����);
				this.add(�����_box);	
				//copy tab
				JLabel ����= new JLabel("����:");  
				����.setForeground(Color.WHITE);
				����.setBounds(10, 20+225, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60, 33+225, 20, 20);
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
				JLabel ��ֳ����= new JLabel("��ֳ����:");  
				��ֳ����.setForeground(Color.WHITE);
				��ֳ����.setBounds(10, 20+250, 100, 50);
				JCheckBox ��ֳ����_box= new JCheckBox();
				��ֳ����_box.setBounds(10+60, 33+250, 20, 20);
				��ֳ����_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(��ֳ����_box.isSelected()) {
							if(!name.getText().contains("��ֳ����")) {
								name.setText(name.getText()+" ��ֳ����");
							}
						}else {
							if(name.getText().contains("��ֳ����")) {
								name.setText(name.getText().replace("��ֳ����", ""));
							}
						}
						
					}
				});
				this.add(��ֳ����);
				this.add(��ֳ����_box);	
				//copy tab
				JLabel Ҹ����= new JLabel("Ҹ����:");  
				Ҹ����.setForeground(Color.WHITE);
				Ҹ����.setBounds(10, 20+275, 100, 50);
				JCheckBox Ҹ����_box= new JCheckBox();
				Ҹ����_box.setBounds(10+60, 33+275, 20, 20);
				Ҹ����_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Ҹ����_box.isSelected()) {
							if(!name.getText().contains("Ҹ����")) {
								name.setText(name.getText()+" Ҹ����");
							}
						}else {
							if(name.getText().contains("Ҹ����")) {
								name.setText(name.getText().replace("Ҹ����", ""));
							}
						}
						
					}
				});
				this.add(Ҹ����);
				this.add(Ҹ����_box);	
				//copy tab
				JLabel ����= new JLabel("����:");  
				����.setForeground(Color.WHITE);
				����.setBounds(10, 20+300, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60, 33+300, 20, 20);
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
				����.setBounds(10, 20+325, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60, 33+325, 20, 20);
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