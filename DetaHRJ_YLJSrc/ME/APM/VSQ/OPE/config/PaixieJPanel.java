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

public class PaixieJPanel extends JPanel implements MouseListener, KeyListener, ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PaixieJPanel(JTextField name){
		this.setLayout(null);
		this.setBounds(0, 0, 780, 610);
		this.setBackground(Color.BLACK);
		
			
		
				//copy tab
				JLabel ��Ѫ= new JLabel("��Ѫ:");  
				��Ѫ.setForeground(Color.WHITE);
				��Ѫ.setBounds(10+110+110, 20+125, 100, 50);
				JCheckBox ��Ѫ_box= new JCheckBox();
				��Ѫ_box.setBounds(10+60+110+110, 33+125, 20, 20);
				��Ѫ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(��Ѫ_box.isSelected()) {
							if(!name.getText().contains("��Ѫ")) {
								name.setText(name.getText()+" ��Ѫ");
							}
						}else {
							if(name.getText().contains("��Ѫ")) {
								name.setText(name.getText().replace("��Ѫ", ""));
							}
						}
						
					}
				});
				this.add(��Ѫ);
				this.add(��Ѫ_box);	
				//copy tab
				JLabel ���= new JLabel("���:");  
				���.setForeground(Color.WHITE);
				���.setBounds(10+110+110, 20+150, 100, 50);
				JCheckBox ���_box= new JCheckBox();
				���_box.setBounds(10+60+110+110, 33+150, 20, 20);
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
				JLabel ����= new JLabel("����:");  
				����.setForeground(Color.WHITE);
				����.setBounds(10+110+110, 20+175, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110, 33+175, 20, 20);
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
				����.setBounds(10+110+110, 20+200, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110, 33+200, 20, 20);
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
				����.setBounds(10+110+110, 20+225, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110, 33+225, 20, 20);
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
				JLabel ƨ��= new JLabel("ƨ��:");  
				ƨ��.setForeground(Color.WHITE);
				ƨ��.setBounds(10+110+110, 20+275, 100, 50);
				JCheckBox ƨ��_box= new JCheckBox();
				ƨ��_box.setBounds(10+60+110+110, 33+275, 20, 20);
				ƨ��_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ƨ��_box.isSelected()) {
							if(!name.getText().contains("ƨ��")) {
								name.setText(name.getText()+" ƨ��");
							}
						}else {
							if(name.getText().contains("ƨ��")) {
								name.setText(name.getText().replace("ƨ��", ""));
							}
						}
						
					}
				});
				this.add(ƨ��);
				this.add(ƨ��_box);	
			
			
			
				//copy tab
				JLabel ��Ѫ= new JLabel("��Ѫ:");  
				��Ѫ.setForeground(Color.WHITE);
				��Ѫ.setBounds(10+110+110+330, 20+300, 100, 50);
				JCheckBox ��Ѫ_box= new JCheckBox();
				��Ѫ_box.setBounds(10+60+110+110+330, 33+300, 20, 20);
				��Ѫ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(��Ѫ_box.isSelected()) {
							if(!name.getText().contains("��Ѫ")) {
								name.setText(name.getText()+" ��Ѫ");
							}
						}else {
							if(name.getText().contains("��Ѫ")) {
								name.setText(name.getText().replace("��Ѫ", ""));
							}
						}
						
					}
				});
				this.add(��Ѫ);
				this.add(��Ѫ_box);	
			
				//copy tab
				JLabel �ഺ��= new JLabel("�ഺ��:");  
				�ഺ��.setForeground(Color.WHITE);
				�ഺ��.setBounds(10+110+110+330, 20+375, 100, 50);
				JCheckBox �ഺ��_box= new JCheckBox();
				�ഺ��_box.setBounds(10+60+110+110+330, 33+375, 20, 20);
				�ഺ��_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(�ഺ��_box.isSelected()) {
							if(!name.getText().contains("�ഺ��")) {
								name.setText(name.getText()+" �ഺ��");
							}
						}else {
							if(name.getText().contains("�ഺ��")) {
								name.setText(name.getText().replace("�ഺ��", ""));
							}
						}
						
					}
				});
				this.add(�ഺ��);
				this.add(�ഺ��_box);	
				
				//copy tab
				JLabel ����= new JLabel("����:");  
				����.setForeground(Color.WHITE);
				����.setBounds(10+110+110+440, 20+100, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110+440, 33+100, 20, 20);
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
				JLabel С���ʹ= new JLabel("С���ʹ:");  
				С���ʹ.setForeground(Color.WHITE);
				С���ʹ.setBounds(10+110+110+440, 20+375, 100, 50);
				JCheckBox С���ʹ_box= new JCheckBox();
				С���ʹ_box.setBounds(10+60+110+110+440, 33+375, 20, 20);
				С���ʹ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(С���ʹ_box.isSelected()) {
							if(!name.getText().contains("С���ʹ")) {
								name.setText(name.getText()+" С���ʹ");
							}
						}else {
							if(name.getText().contains("С���ʹ")) {
								name.setText(name.getText().replace("С���ʹ", ""));
							}
						}
						
					}
				});
				this.add(С���ʹ);
				this.add(С���ʹ_box);		
				//copy tab
				JLabel ����= new JLabel("����:");  
				����.setForeground(Color.WHITE);
				����.setBounds(10+110+110+440, 20+400, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110+440, 33+400, 20, 20);
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
				����.setBounds(10+110+110+110, 20, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110+110, 33, 20, 20);
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
				JLabel ��Ѫ= new JLabel("��Ѫ:");  
				��Ѫ.setForeground(Color.WHITE);
				��Ѫ.setBounds(10+110+110+110, 20+25, 100, 50);
				JCheckBox ��Ѫ_box= new JCheckBox();
				��Ѫ_box.setBounds(10+60+110+110+110, 33+25, 20, 20);
				��Ѫ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(��Ѫ_box.isSelected()) {
							if(!name.getText().contains("��Ѫ")) {
								name.setText(name.getText()+" ��Ѫ");
							}
						}else {
							if(name.getText().contains("��Ѫ")) {
								name.setText(name.getText().replace("��Ѫ", ""));
							}
						}
						
					}
				});
				this.add(��Ѫ);
				this.add(��Ѫ_box);
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
				JLabel �����= new JLabel("�����:");  
				�����.setForeground(Color.WHITE);
				�����.setBounds(10+110+110+110, 20+100, 100, 50);
				JCheckBox �����_box= new JCheckBox();
				�����_box.setBounds(10+60+110+110+110, 33+100, 20, 20);
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
				JLabel ���= new JLabel("���:");  
				���.setForeground(Color.WHITE);
				���.setBounds(10+110+110+110, 20+125, 100, 50);
				JCheckBox ���_box= new JCheckBox();
				���_box.setBounds(10+60+110+110+110, 33+125, 20, 20);
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
				���.setBounds(10+110+110+110, 20+150, 100, 50);
				JCheckBox ���_box= new JCheckBox();
				���_box.setBounds(10+60+110+110+110, 33+150, 20, 20);
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
				JLabel �ڳ�= new JLabel("�ڳ�:");  
				�ڳ�.setForeground(Color.WHITE);
				�ڳ�.setBounds(10+110+110+110, 20+175, 100, 50);
				JCheckBox �ڳ�_box= new JCheckBox();
				�ڳ�_box.setBounds(10+60+110+110+110, 33+175, 20, 20);
				�ڳ�_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(�ڳ�_box.isSelected()) {
							if(!name.getText().contains("�ڳ�")) {
								name.setText(name.getText()+" �ڳ�");
							}
						}else {
							if(name.getText().contains("�ڳ�")) {
								name.setText(name.getText().replace("�ڳ�", ""));
							}
						}
						
					}
				});
				this.add(�ڳ�);
				this.add(�ڳ�_box);
				
				//copy tab
				JLabel ƨ��= new JLabel("ƨ��:");  
				ƨ��.setForeground(Color.WHITE);
				ƨ��.setBounds(10+110+110+110, 20+200, 100, 50);
				JCheckBox ƨ��_box= new JCheckBox();
				ƨ��_box.setBounds(10+60+110+110+110, 33+200, 20, 20);
				ƨ��_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ƨ��_box.isSelected()) {
							if(!name.getText().contains("ƨ��")) {
								name.setText(name.getText()+" ƨ��");
							}
						}else {
							if(name.getText().contains("ƨ��")) {
								name.setText(name.getText().replace("ƨ��", ""));
							}
						}
						
					}
				});
				this.add(ƨ��);
				this.add(ƨ��_box);
				//copy tab
				JLabel ����= new JLabel("����:");  
				����.setForeground(Color.WHITE);
				����.setBounds(10+110+110+110, 20+225, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110+110, 33+225, 20, 20);
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
				JLabel ��ɧ= new JLabel("��ɧ:");  
				��ɧ.setForeground(Color.WHITE);
				��ɧ.setBounds(10+110+110+110, 20+250, 100, 50);
				JCheckBox ��ɧ_box= new JCheckBox();
				��ɧ_box.setBounds(10+60+110+110+110, 33+250, 20, 20);
				��ɧ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(��ɧ_box.isSelected()) {
							if(!name.getText().contains("��ɧ")) {
								name.setText(name.getText()+" ��ɧ");
							}
						}else {
							if(name.getText().contains("��ɧ")) {
								name.setText(name.getText().replace("��ɧ", ""));
							}
						}
						
					}
				});
				this.add(��ɧ);
				this.add(��ɧ_box);
				
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