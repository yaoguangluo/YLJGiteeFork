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

public class KuangJPanel extends JPanel implements MouseListener, KeyListener, ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public KuangJPanel(JTextField name){
		this.setLayout(null);
		this.setBounds(0, 0, 780, 610);
		this.setBackground(Color.BLACK);
		//copy tab
		JLabel ڿ��= new JLabel("ڿ��:");  
		ڿ��.setForeground(Color.WHITE);
		ڿ��.setBounds(10+110+110, 20+350, 100, 50);
		JCheckBox ڿ��_box= new JCheckBox();
		ڿ��_box.setBounds(10+60+110+110, 33+350, 20, 20);
		ڿ��_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(ڿ��_box.isSelected()) {
					if(!name.getText().contains("ڿ��")) {
						name.setText(name.getText()+" ڿ��");
					}
				}else {
					if(name.getText().contains("ڿ��")) {
						name.setText(name.getText().replace("ڿ��", ""));
					}
				}
				
			}
		});
		this.add(ڿ��);
		this.add(ڿ��_box);	
				//copy tab
				JLabel �ķ�= new JLabel("�ķ�:");  
				�ķ�.setForeground(Color.WHITE);
				�ķ�.setBounds(10+110+110+440, 20+250, 100, 50);
				JCheckBox �ķ�_box= new JCheckBox();
				�ķ�_box.setBounds(10+60+110+110+440, 33+250, 20, 20);
				�ķ�_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(�ķ�_box.isSelected()) {
							if(!name.getText().contains("�ķ�")) {
								name.setText(name.getText()+" �ķ�");
							}
						}else {
							if(name.getText().contains("�ķ�")) {
								name.setText(name.getText().replace("�ķ�", ""));
							}
						}
						
					}
				});
				this.add(�ķ�);
				this.add(�ķ�_box);	
				//copy tab
				JLabel Ƣ������= new JLabel("Ƣ������:");  
				Ƣ������.setForeground(Color.WHITE);
				Ƣ������.setBounds(10+110+110+220, 20+300, 100, 50);
				JCheckBox Ƣ������_box= new JCheckBox();
				Ƣ������_box.setBounds(10+60+110+110+220, 33+300, 20, 20);
				Ƣ������_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Ƣ������_box.isSelected()) {
							if(!name.getText().contains("Ƣ������")) {
								name.setText(name.getText()+" Ƣ������");
							}
						}else {
							if(name.getText().contains("Ƣ������")) {
								name.setText(name.getText().replace("Ƣ������", ""));
							}
						}
						
					}
				});
				this.add(Ƣ������);
				this.add(Ƣ������_box);	
				//copy tab
				JLabel ��ŭ= new JLabel("��ŭ:");  
				��ŭ.setForeground(Color.WHITE);
				��ŭ.setBounds(10+110+110+440, 20+425, 100, 50);
				JCheckBox ��ŭ_box= new JCheckBox();
				��ŭ_box.setBounds(10+60+110+110+440, 33+425, 20, 20);
				��ŭ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(��ŭ_box.isSelected()) {
							if(!name.getText().contains("��ŭ")) {
								name.setText(name.getText()+" ��ŭ");
							}
						}else {
							if(name.getText().contains("��ŭ")) {
								name.setText(name.getText().replace("��ŭ", ""));
							}
						}
						
					}
				});
				this.add(��ŭ);
				this.add(��ŭ_box);	
				//copy tab
				JLabel ��Ц= new JLabel("��Ц:");  
				��Ц.setForeground(Color.WHITE);
				��Ц.setBounds(10+110+110+110, 20, 100, 50);
				JCheckBox ��Ц_box= new JCheckBox();
				��Ц_box.setBounds(10+60+110+110+110, 33, 20, 20);
				��Ц_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(��Ц_box.isSelected()) {
							if(!name.getText().contains("��Ц")) {
								name.setText(name.getText()+" ��Ц");
							}
						}else {
							if(name.getText().contains("��Ц")) {
								name.setText(name.getText().replace("��Ц", ""));
							}
						}
						
					}
				});
				this.add(��Ц);
				this.add(��Ц_box);
				//copy tab
				JLabel �տ�= new JLabel("�տ�:");  
				�տ�.setForeground(Color.WHITE);
				�տ�.setBounds(10+110+110+110, 20+25, 100, 50);
				JCheckBox �տ�_box= new JCheckBox();
				�տ�_box.setBounds(10+60+110+110+110, 33+25, 20, 20);
				�տ�_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(�տ�_box.isSelected()) {
							if(!name.getText().contains("�տ�")) {
								name.setText(name.getText()+" �տ�");
							}
						}else {
							if(name.getText().contains("�տ�")) {
								name.setText(name.getText().replace("�տ�", ""));
							}
						}
						
					}
				});
				this.add(�տ�);
				this.add(�տ�_box);
				//copy tab
				JLabel ���= new JLabel("���:");  
				���.setForeground(Color.WHITE);
				���.setBounds(10+110+110+110, 20+50, 100, 50);
				JCheckBox ���_box= new JCheckBox();
				���_box.setBounds(10+60+110+110+110, 33+50, 20, 20);
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
				JLabel ʧ�ķ�= new JLabel("ʧ�ķ�:");  
				ʧ�ķ�.setForeground(Color.WHITE);
				ʧ�ķ�.setBounds(10+110+110+110, 20+75, 100, 50);
				JCheckBox ʧ�ķ�_box= new JCheckBox();
				ʧ�ķ�_box.setBounds(10+60+110+110+110, 33+75, 20, 20);
				ʧ�ķ�_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ʧ�ķ�_box.isSelected()) {
							if(!name.getText().contains("ʧ�ķ�")) {
								name.setText(name.getText()+" ʧ�ķ�");
							}
						}else {
							if(name.getText().contains("ʧ�ķ�")) {
								name.setText(name.getText().replace("ʧ�ķ�", ""));
							}
						}
						
					}
				});
				this.add(ʧ�ķ�);
				this.add(ʧ�ķ�_box);
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
				JLabel ��������= new JLabel("��������:");  
				��������.setForeground(Color.WHITE);
				��������.setBounds(10+110+110+110, 20+125, 100, 50);
				JCheckBox ��������_box= new JCheckBox();
				��������_box.setBounds(10+60+110+110+110, 33+125, 20, 20);
				��������_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(��������_box.isSelected()) {
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
				this.add(��������);
				this.add(��������_box);
				//copy tab
				JLabel ��ǿ= new JLabel("��ǿ:");  
				��ǿ.setForeground(Color.WHITE);
				��ǿ.setBounds(10+110+110+110, 20+150, 100, 50);
				JCheckBox ��ǿ_box= new JCheckBox();
				��ǿ_box.setBounds(10+60+110+110+110, 33+150, 20, 20);
				��ǿ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(��ǿ_box.isSelected()) {
							if(!name.getText().contains("��ǿ")) {
								name.setText(name.getText()+" ��ǿ");
							}
						}else {
							if(name.getText().contains("��ǿ")) {
								name.setText(name.getText().replace("��ǿ", ""));
							}
						}
						
					}
				});
				this.add(��ǿ);
				this.add(��ǿ_box);
				//copy tab
				JLabel �嶯= new JLabel("�嶯:");  
				�嶯.setForeground(Color.WHITE);
				�嶯.setBounds(10+110+110+110, 20+175, 100, 50);
				JCheckBox �嶯_box= new JCheckBox();
				�嶯_box.setBounds(10+60+110+110+110, 33+175, 20, 20);
				�嶯_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(�嶯_box.isSelected()) {
							if(!name.getText().contains("�嶯")) {
								name.setText(name.getText()+" �嶯");
							}
						}else {
							if(name.getText().contains("�嶯")) {
								name.setText(name.getText().replace("�嶯", ""));
							}
						}
						
					}
				});
				this.add(�嶯);
				this.add(�嶯_box);
				//copy tab
				JLabel ţ�Ǽ�= new JLabel("ţ�Ǽ�:");  
				ţ�Ǽ�.setForeground(Color.WHITE);
				ţ�Ǽ�.setBounds(10+110+110+110, 20+200, 100, 50);
				JCheckBox ţ�Ǽ�_box= new JCheckBox();
				ţ�Ǽ�_box.setBounds(10+60+110+110+110, 33+200, 20, 20);
				ţ�Ǽ�_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ţ�Ǽ�_box.isSelected()) {
							if(!name.getText().contains("ţ�Ǽ�")) {
								name.setText(name.getText()+" ţ�Ǽ�");
							}
						}else {
							if(name.getText().contains("ţ�Ǽ�")) {
								name.setText(name.getText().replace("ţ�Ǽ�", ""));
							}
						}
						
					}
				});
				this.add(ţ�Ǽ�);
				this.add(ţ�Ǽ�_box);
				//copy tab
				JLabel ����ð��= new JLabel("����ð��:");  
				����ð��.setForeground(Color.WHITE);
				����ð��.setBounds(10+110+110+110, 20+225, 100, 50);
				JCheckBox ����ð��_box= new JCheckBox();
				����ð��_box.setBounds(10+60+110+110+110, 33+225, 20, 20);
				����ð��_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(����ð��_box.isSelected()) {
							if(!name.getText().contains("����ð��")) {
								name.setText(name.getText()+" ����ð��");
							}
						}else {
							if(name.getText().contains("����ð��")) {
								name.setText(name.getText().replace("����ð��", ""));
							}
						}
						
					}
				});
				this.add(����ð��);
				this.add(����ð��_box);
				//copy tab
				JLabel ����= new JLabel("����:");  
				����.setForeground(Color.WHITE);
				����.setBounds(10+110+110+110, 20+250, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110+110, 33+250, 20, 20);
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
				JLabel �������= new JLabel("�������:");  
				�������.setForeground(Color.WHITE);
				�������.setBounds(10+110+110+110, 20+275, 100, 50);
				JCheckBox �������_box= new JCheckBox();
				�������_box.setBounds(10+60+110+110+110, 33+275, 20, 20);
				�������_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(�������_box.isSelected()) {
							if(!name.getText().contains("�������")) {
								name.setText(name.getText()+" �������");
							}
						}else {
							if(name.getText().contains("�������")) {
								name.setText(name.getText().replace("�������", ""));
							}
						}
						
					}
				});
				this.add(�������);
				this.add(�������_box);
				
				
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