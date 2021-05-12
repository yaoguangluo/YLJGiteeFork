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

public class ReJPanel extends JPanel implements MouseListener, KeyListener, ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ReJPanel(JTextField name){
		this.setLayout(null);
		this.setBounds(0, 0, 780, 610);
		this.setBackground(Color.BLACK);
		//
		JLabel hotqichuan_filter= new JLabel("����:");  
		hotqichuan_filter.setForeground(Color.WHITE);
		hotqichuan_filter.setBounds(10, 20, 100, 50);
		JCheckBox hotqichuan_filter_box= new JCheckBox();
		hotqichuan_filter_box.setBounds(10+60, 33, 20, 20);
		hotqichuan_filter_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(hotqichuan_filter_box.isSelected()) {
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
		this.add(hotqichuan_filter);
		this.add(hotqichuan_filter_box);
		
		//copy tab
		JLabel ����= new JLabel("����:");  
		����.setForeground(Color.WHITE);
		����.setBounds(10+110+110+110, 20+25, 100, 50);
		JCheckBox ����_box= new JCheckBox();
		����_box.setBounds(10+60+110+110+110, 33+25, 20, 20);
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
				����.setBounds(10+110+110+110, 20+50, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110+110, 33+50, 20, 20);
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
				����.setBounds(10+110+110+110, 20+75, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110+110, 33+75, 20, 20);
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
				����.setBounds(10+110+110+110, 20+100, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110+110, 33+100, 20, 20);
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
				JLabel ������= new JLabel("������:");  
				������.setForeground(Color.WHITE);
				������.setBounds(10+110+110+110, 20+125, 100, 50);
				JCheckBox ������_box= new JCheckBox();
				������_box.setBounds(10+60+110+110+110, 33+125, 20, 20);
				������_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(������_box.isSelected()) {
							if(!name.getText().contains("������")) {
								name.setText(name.getText()+" ������");
							}
						}else {
							if(name.getText().contains("������")) {
								name.setText(name.getText().replace("������", ""));
							}
						}
						
					}
				});
				this.add(������);
				this.add(������_box);
				//copy tab
				JLabel ��ָ��= new JLabel("��ָ��:");  
				��ָ��.setForeground(Color.WHITE);
				��ָ��.setBounds(10+110+110+110, 20+150, 100, 50);
				JCheckBox ��ָ��_box= new JCheckBox();
				��ָ��_box.setBounds(10+60+110+110+110, 33+150, 20, 20);
				��ָ��_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(��ָ��_box.isSelected()) {
							if(!name.getText().contains("��ָ��")) {
								name.setText(name.getText()+" ��ָ��");
							}
						}else {
							if(name.getText().contains("��ָ��")) {
								name.setText(name.getText().replace("��ָ��", ""));
							}
						}
						
					}
				});
				this.add(��ָ��);
				this.add(��ָ��_box);
				//copy tab
				JLabel ����= new JLabel("����:");  
				����.setForeground(Color.WHITE);
				����.setBounds(10+110+110+110, 20+175, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110+110, 33+175, 20, 20);
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
				JLabel ������= new JLabel("������:");  
				������.setForeground(Color.WHITE);
				������.setBounds(10+110+110+110, 20+200, 100, 50);
				JCheckBox ������_box= new JCheckBox();
				������_box.setBounds(10+60+110+110+110, 33+200, 20, 20);
				������_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(������_box.isSelected()) {
							if(!name.getText().contains("������")) {
								name.setText(name.getText()+" ������");
							}
						}else {
							if(name.getText().contains("������")) {
								name.setText(name.getText().replace("������", ""));
							}
						}
						
					}
				});
				this.add(������);
				this.add(������_box);
				//copy tab
				JLabel ȫ����= new JLabel("ȫ����:");  
				ȫ����.setForeground(Color.WHITE);
				ȫ����.setBounds(10+110+110+110, 20+225, 100, 50);
				JCheckBox ȫ����_box= new JCheckBox();
				ȫ����_box.setBounds(10+60+110+110+110, 33+225, 20, 20);
				ȫ����_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ȫ����_box.isSelected()) {
							if(!name.getText().contains("ȫ����")) {
								name.setText(name.getText()+" ȫ����");
							}
						}else {
							if(name.getText().contains("ȫ����")) {
								name.setText(name.getText().replace("ȫ����", ""));
							}
						}
						
					}
				});
				this.add(ȫ����);
				this.add(ȫ����_box);
				//copy tab
				JLabel ��ͷ��= new JLabel("��ͷ��:");  
				��ͷ��.setForeground(Color.WHITE);
				��ͷ��.setBounds(10+110+110+110, 20+250, 100, 50);
				JCheckBox ��ͷ��_box= new JCheckBox();
				��ͷ��_box.setBounds(10+60+110+110+110, 33+250, 20, 20);
				��ͷ��_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(��ͷ��_box.isSelected()) {
							if(!name.getText().contains("��ͷ��")) {
								name.setText(name.getText()+" ��ͷ��");
							}
						}else {
							if(name.getText().contains("��ͷ��")) {
								name.setText(name.getText().replace("��ͷ��", ""));
							}
						}
						
					}
				});
				this.add(��ͷ��);
				this.add(��ͷ��_box);
				
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