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

public class ChouchuJPanel extends JPanel implements MouseListener, KeyListener, ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ChouchuJPanel(JTextField name){
		this.setLayout(null);
		this.setBounds(0, 0, 780, 610);
		this.setBackground(Color.BLACK);
		//
		//copy tab
				JLabel ���= new JLabel("���:");  
				���.setForeground(Color.WHITE);
				���.setBounds(10, 20, 100, 50);
				JCheckBox ���_box= new JCheckBox();
				���_box.setBounds(10+60, 33, 20, 20);
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
				JLabel ��֫�鴤= new JLabel("��֫�鴤:");  
				��֫�鴤.setForeground(Color.WHITE);
				��֫�鴤.setBounds(10+110, 20+400, 100, 50);
				JCheckBox ��֫�鴤_box= new JCheckBox();
				��֫�鴤_box.setBounds(10+60+110, 33+400, 20, 20);
				��֫�鴤_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(��֫�鴤_box.isSelected()) {
							if(!name.getText().contains("��֫�鴤")) {
								name.setText(name.getText()+" ��֫�鴤");
							}
						}else {
							if(name.getText().contains("��֫�鴤")) {
								name.setText(name.getText().replace("��֫�鴤", ""));
							}
						}
						
					}
				});
				this.add(��֫�鴤);
				this.add(��֫�鴤_box);	
				//copy tab
				JLabel ���= new JLabel("���:");  
				���.setForeground(Color.WHITE);
				���.setBounds(10+110, 20+425, 100, 50);
				JCheckBox ���_box= new JCheckBox();
				���_box.setBounds(10+60+110, 33+425, 20, 20);
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
				����.setBounds(10+110, 20+450, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110, 33+450, 20, 20);
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
				�����.setBounds(10+110+110, 20+325, 100, 50);
				JCheckBox �����_box= new JCheckBox();
				�����_box.setBounds(10+60+110+110, 33+325, 20, 20);
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
				����.setBounds(10+110+110+440, 20+0, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110+440, 33+0, 20, 20);
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
				����.setBounds(10+110+110+440, 20+75, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110+440, 33+75, 20, 20);
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
				���.setBounds(10+110+110+440, 20+125, 100, 50);
				JCheckBox ���_box= new JCheckBox();
				���_box.setBounds(10+60+110+110+440, 33+125, 20, 20);
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
				JLabel �ļ�= new JLabel("�ļ�:");  
				�ļ�.setForeground(Color.WHITE);
				�ļ�.setBounds(10+110+110+440, 20+225, 100, 50);
				JCheckBox �ļ�_box= new JCheckBox();
				�ļ�_box.setBounds(10+60+110+110+440, 33+225, 20, 20);
				�ļ�_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(�ļ�_box.isSelected()) {
							if(!name.getText().contains("�ļ�")) {
								name.setText(name.getText()+" �ļ�");
							}
						}else {
							if(name.getText().contains("�ļ�")) {
								name.setText(name.getText().replace("�ļ�", ""));
							}
						}
						
					}
				});
				this.add(�ļ�);
				this.add(�ļ�_box);	
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