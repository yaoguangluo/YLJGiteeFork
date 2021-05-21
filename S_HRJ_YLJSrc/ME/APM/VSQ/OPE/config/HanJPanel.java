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

public class HanJPanel extends JPanel implements MouseListener, KeyListener, ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HanJPanel(JTextField name){
		this.setLayout(null);
		this.setBounds(0, 0, 780, 610);
		this.setBackground(Color.BLACK);
		
		//copy tab
		JLabel bisai= new JLabel("����:");  
		bisai.setForeground(Color.WHITE);
		bisai.setBounds(10, 20, 100, 50);
		JCheckBox bisai_box= new JCheckBox();
		bisai_box.setBounds(10+60, 33, 20, 20);
		bisai_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(bisai_box.isSelected()) {
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
		this.add(bisai);
		this.add(bisai_box);
		
		//copy tab
				JLabel biti= new JLabel("����:");  
				biti.setForeground(Color.WHITE);
				biti.setBounds(10, 20+25, 100, 50);
				JCheckBox biti_box= new JCheckBox();
				biti_box.setBounds(10+60, 33+25, 20, 20);
				biti_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(biti_box.isSelected()) {
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
				this.add(biti);
				this.add(biti_box);
		
		//copy tab
				JLabel kesou= new JLabel("����:");  
				kesou.setForeground(Color.WHITE);
				kesou.setBounds(10, 45+25+25, 100, 50);
				JCheckBox kesou_box= new JCheckBox();
				kesou_box.setBounds(10+60, 58+25+25, 20, 20);
				kesou_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(kesou_box.isSelected()) {
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
				this.add(kesou);
				this.add(kesou_box);
				
				//copy tab
				JLabel η��= new JLabel("η��:");  
				η��.setForeground(Color.WHITE);
				η��.setBounds(10, 45+25+50, 100, 50);
				JCheckBox η��_box= new JCheckBox();
				η��_box.setBounds(10+60, 58+25+50, 20, 20);
				η��_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(η��_box.isSelected()) {
							if(!name.getText().contains("η��")) {
								name.setText(name.getText()+" η��");
							}
						}else {
							if(name.getText().contains("η��")) {
								name.setText(name.getText().replace("η��", ""));
							}
						}
						
					}
				});
				this.add(η��);
				this.add(η��_box);
				
				
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
				����.setBounds(10+110+110+110, 20+25+25, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110+110, 33+25+25, 20, 20);
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
				����.setBounds(10+110+110+110, 20+25+25+25, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110+110, 33+25+25+25, 20, 20);
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
				����.setBounds(10+110+110+110, 20+25+25+25+25+25, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110+110, 33+25+25+25+25+25, 20, 20);
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
				JLabel ��ֺ��= new JLabel("��ֺ��:");  
				��ֺ��.setForeground(Color.WHITE);
				��ֺ��.setBounds(10+110+110+110, 20+25+25+25+25+25+25, 100, 50);
				JCheckBox ��ֺ��_box= new JCheckBox();
				��ֺ��_box.setBounds(10+60+110+110+110, 33+25+25+25+25+25+25, 20, 20);
				��ֺ��_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(��ֺ��_box.isSelected()) {
							if(!name.getText().contains("��ֺ��")) {
								name.setText(name.getText()+" ��ֺ��");
							}
						}else {
							if(name.getText().contains("��ֺ��")) {
								name.setText(name.getText().replace("��ֺ��", ""));
							}
						}
					}
				});
				this.add(��ֺ��);
				this.add(��ֺ��_box);
				
				//copy tab
				JLabel ����= new JLabel("����:");  
				����.setForeground(Color.WHITE);
				����.setBounds(10+110+110+110, 20+25+25+25+25+75, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110+110, 33+25+25+25+25+75, 20, 20);
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
				������.setBounds(10+110+110+110, 20+25+25+25+25, 100, 50);
				JCheckBox ������_box= new JCheckBox();
				������_box.setBounds(10+60+110+110+110, 33+25+25+25+25, 20, 20);
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
				JLabel ����= new JLabel("����:");  
				����.setForeground(Color.WHITE);
				����.setBounds(10+110+110+440, 20+25, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110+440, 33+25, 20, 20);
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
				������.setBounds(10+110+110+440, 20+50, 100, 50);
				JCheckBox ������_box= new JCheckBox();
				������_box.setBounds(10+60+110+110+440, 33+50, 20, 20);
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
				JLabel ��֫����= new JLabel("��֫����:");  
				��֫����.setForeground(Color.WHITE);
				��֫����.setBounds(10+110+110+440, 20+275, 100, 50);
				JCheckBox ��֫����_box= new JCheckBox();
				��֫����_box.setBounds(10+60+110+110+440, 33+275, 20, 20);
				��֫����_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(��֫����_box.isSelected()) {
							if(!name.getText().contains("��֫����")) {
								name.setText(name.getText()+" ��֫����");
							}
						}else {
							if(name.getText().contains("��֫����")) {
								name.setText(name.getText().replace("��֫����", ""));
							}
						}
						
					}
				});
				this.add(��֫����);
				this.add(��֫����_box);	
				
				//copy tab
				JLabel ͷ��= new JLabel("ͷ��:");  
				ͷ��.setForeground(Color.WHITE);
				ͷ��.setBounds(10+110+110+440, 20+75, 100, 50);
				JCheckBox ͷ��_box= new JCheckBox();
				ͷ��_box.setBounds(10+60+110+110+440, 33+75, 20, 20);
				ͷ��_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ͷ��_box.isSelected()) {
							if(!name.getText().contains("ͷ��")) {
								name.setText(name.getText()+" ͷ��");
							}
						}else {
							if(name.getText().contains("ͷ��")) {
								name.setText(name.getText().replace("ͷ��", ""));
							}
						}
						
					}
				});
				this.add(ͷ��);
				this.add(ͷ��_box);	
				
				//copy tab
				JLabel ϥ����= new JLabel("ϥ����:");  
				ϥ����.setForeground(Color.WHITE);
				ϥ����.setBounds(10+110+110+440, 20+100, 100, 50);
				JCheckBox ϥ����_box= new JCheckBox();
				ϥ����_box.setBounds(10+60+110+110+440, 33+100, 20, 20);
				ϥ����_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ϥ����_box.isSelected()) {
							if(!name.getText().contains("ϥ����")) {
								name.setText(name.getText()+" ϥ����");
							}
						}else {
							if(name.getText().contains("ϥ����")) {
								name.setText(name.getText().replace("ϥ����", ""));
							}
						}
						
					}
				});
				this.add(ϥ����);
				this.add(ϥ����_box);	
				
				//copy tab
				JLabel ��ָ��= new JLabel("��ָ��:");  
				��ָ��.setForeground(Color.WHITE);
				��ָ��.setBounds(10+110+110+440, 20+125, 100, 50);
				JCheckBox ��ָ��_box= new JCheckBox();
				��ָ��_box.setBounds(10+60+110+110+440, 33+125, 20, 20);
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
				JLabel �ؽ���= new JLabel("�ؽ���:");  
				�ؽ���.setForeground(Color.WHITE);
				�ؽ���.setBounds(10+110+110+440, 20+150, 100, 50);
				JCheckBox �ؽ���_box= new JCheckBox();
				�ؽ���_box.setBounds(10+60+110+110+440, 33+150, 20, 20);
				�ؽ���_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(�ؽ���_box.isSelected()) {
							if(!name.getText().contains("�ؽ���")) {
								name.setText(name.getText()+" �ؽ���");
							}
						}else {
							if(name.getText().contains("�ؽ���")) {
								name.setText(name.getText().replace("�ؽ���", ""));
							}
						}
						
					}
				});
				this.add(�ؽ���);
				this.add(�ؽ���_box);	
				
				//copy tab
				JLabel �о���= new JLabel("�о���:");  
				�о���.setForeground(Color.WHITE);
				�о���.setBounds(10+110+110+440, 20+175, 100, 50);
				JCheckBox �о���_box= new JCheckBox();
				�о���_box.setBounds(10+60+110+110+440, 33+175, 20, 20);
				�о���_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(�о���_box.isSelected()) {
							if(!name.getText().contains("�о���")) {
								name.setText(name.getText()+" �о���");
							}
						}else {
							if(name.getText().contains("�о���")) {
								name.setText(name.getText().replace("�о���", ""));
							}
						}
						
					}
				});
				this.add(�о���);
				this.add(�о���_box);	
		
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