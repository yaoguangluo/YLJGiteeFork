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

public class ChuangJPanel extends JPanel implements MouseListener, KeyListener, ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ChuangJPanel(JTextField name){
		this.setLayout(null);
		this.setBounds(0, 0, 780, 610);
		this.setBackground(Color.BLACK);
		
		
				//copy tab
				JLabel �̴�= new JLabel("�̴�:");  
				�̴�.setForeground(Color.WHITE);
				�̴�.setBounds(10+110+110, 20+300, 100, 50);
				JCheckBox �̴�_box= new JCheckBox();
				�̴�_box.setBounds(10+60+110+110, 33+300, 20, 20);
				�̴�_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(�̴�_box.isSelected()) {
							if(!name.getText().contains("�̴�")) {
								name.setText(name.getText()+" �̴�");
							}
						}else {
							if(name.getText().contains("�̴�")) {
								name.setText(name.getText().replace("�̴�", ""));
							}
						}
						
					}
				});
				this.add(�̴�);
				this.add(�̴�_box);	
			
				//copy tab
				JLabel ŧѪ= new JLabel("ŧѪ:");  
				ŧѪ.setForeground(Color.WHITE);
				ŧѪ.setBounds(10+110+110+110, 20+50, 100, 50);
				JCheckBox ŧѪ_box= new JCheckBox();
				ŧѪ_box.setBounds(10+60+110+110+110, 33+50, 20, 20);
				ŧѪ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ŧѪ_box.isSelected()) {
							if(!name.getText().contains("ŧѪ")) {
								name.setText(name.getText()+" ŧѪ");
							}
						}else {
							if(name.getText().contains("ŧѪ")) {
								name.setText(name.getText().replace("ŧѪ", ""));
							}
						}
						
					}
				});
				this.add(ŧѪ);
				this.add(ŧѪ_box);	
				//copy tab
				JLabel Ƥ��= new JLabel("Ƥ��:");  
				Ƥ��.setForeground(Color.WHITE);
				Ƥ��.setBounds(10+110+110+110, 20+75, 100, 50);
				JCheckBox Ƥ��_box= new JCheckBox();
				Ƥ��_box.setBounds(10+60+110+110+110, 33+75, 20, 20);
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
				JLabel ����= new JLabel("����:");  
				����.setForeground(Color.WHITE);
				����.setBounds(10+110+110+110, 20+125, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110+110, 33+125, 20, 20);
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
				����.setBounds(10+110+110+110, 20+150, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110+110, 33+150, 20, 20);
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
				JLabel ʪ��= new JLabel("ʪ��:");  
				ʪ��.setForeground(Color.WHITE);
				ʪ��.setBounds(10+110+110+110, 20+175, 100, 50);
				JCheckBox ʪ��_box= new JCheckBox();
				ʪ��_box.setBounds(10+60+110+110+110, 33+175, 20, 20);
				ʪ��_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ʪ��_box.isSelected()) {
							if(!name.getText().contains("ʪ��")) {
								name.setText(name.getText()+" ʪ��");
							}
						}else {
							if(name.getText().contains("ʪ��")) {
								name.setText(name.getText().replace("ʪ��", ""));
							}
						}
						
					}
				});
				this.add(ʪ��);
				this.add(ʪ��_box);	
				//copy tab
				JLabel ����= new JLabel("����:");  
				����.setForeground(Color.WHITE);
				����.setBounds(10+110+110+110, 20+200, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110+110, 33+200, 20, 20);
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
				JLabel ÷��= new JLabel("÷��:");  
				÷��.setForeground(Color.WHITE);
				÷��.setBounds(10+110+110+110, 20+225, 100, 50);
				JCheckBox ÷��_box= new JCheckBox();
				÷��_box.setBounds(10+60+110+110+110, 33+225, 20, 20);
				÷��_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(÷��_box.isSelected()) {
							if(!name.getText().contains("÷��")) {
								name.setText(name.getText()+" ÷��");
							}
						}else {
							if(name.getText().contains("÷��")) {
								name.setText(name.getText().replace("÷��", ""));
							}
						}
						
					}
				});
				this.add(÷��);
				this.add(÷��_box);	
			
				
				//copy tab
				JLabel Ӹ��ŧ��= new JLabel("Ӹ��ŧ��:");  
				Ӹ��ŧ��.setForeground(Color.WHITE);
				Ӹ��ŧ��.setBounds(10+110+110+220, 20+250, 100, 50);
				JCheckBox Ӹ��ŧ��_box= new JCheckBox();
				Ӹ��ŧ��_box.setBounds(10+60+110+110+220, 33+250, 20, 20);
				Ӹ��ŧ��_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Ӹ��ŧ��_box.isSelected()) {
							if(!name.getText().contains("Ӹ��ŧ��")) {
								name.setText(name.getText()+" Ӹ��ŧ��");
							}
						}else {
							if(name.getText().contains("Ӹ��ŧ��")) {
								name.setText(name.getText().replace("Ӹ��ŧ��", ""));
							}
						}
						
					}
				});
				this.add(Ӹ��ŧ��);
				this.add(Ӹ��ŧ��_box);	
			
				//copy tab
				JLabel ����= new JLabel("����:");  
				����.setForeground(Color.WHITE);
				����.setBounds(10+110+110+220, 20+325, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110+220, 33+325, 20, 20);
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
				JLabel ˮ��= new JLabel("ˮ��:");  
				ˮ��.setForeground(Color.WHITE);
				ˮ��.setBounds(10+110+110+330, 20+50, 100, 50);
				JCheckBox ˮ��_box= new JCheckBox();
				ˮ��_box.setBounds(10+60+110+110+330, 33+50, 20, 20);
				ˮ��_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ˮ��_box.isSelected()) {
							if(!name.getText().contains("ˮ��")) {
								name.setText(name.getText()+" ˮ��");
							}
						}else {
							if(name.getText().contains("ˮ��")) {
								name.setText(name.getText().replace("ˮ��", ""));
							}
						}
						
					}
				});
				this.add(ˮ��);
				this.add(ˮ��_box);	
				//copy tab
				JLabel ����= new JLabel("����:");  
				����.setForeground(Color.WHITE);
				����.setBounds(10+110+110+330, 20+75, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110+330, 33+75, 20, 20);
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
				JLabel �യ= new JLabel("�യ:");  
				�യ.setForeground(Color.WHITE);
				�യ.setBounds(10+110+110+440, 20+200, 100, 50);
				JCheckBox �യ_box= new JCheckBox();
				�യ_box.setBounds(10+60+110+110+440, 33+200, 20, 20);
				�യ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(�യ_box.isSelected()) {
							if(!name.getText().contains("�യ")) {
								name.setText(name.getText()+" �യ");
							}
						}else {
							if(name.getText().contains("�യ")) {
								name.setText(name.getText().replace("�യ", ""));
							}
						}
						
					}
				});
				this.add(�യ);
				this.add(�യ_box);	
				//copy tab
				JLabel ����= new JLabel("����:");  
				����.setForeground(Color.WHITE);
				����.setBounds(10+110+110, 20, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110, 33, 20, 20);
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
				������.setBounds(10+110+110, 20+25, 100, 50);
				JCheckBox ������_box= new JCheckBox();
				������_box.setBounds(10+60+110+110, 33+25, 20, 20);
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
				JLabel Ƥ��= new JLabel("Ƥ��:");  
				Ƥ��.setForeground(Color.WHITE);
				Ƥ��.setBounds(10+110+110, 20+50, 100, 50);
				JCheckBox Ƥ��_box= new JCheckBox();
				Ƥ��_box.setBounds(10+60+110+110, 33+50, 20, 20);
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
				JLabel ����= new JLabel("����:");  
				����.setForeground(Color.WHITE);
				����.setBounds(10+110+110, 20+75, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110, 33+75, 20, 20);
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
				JLabel ���˷�= new JLabel("���˷�:");  
				���˷�.setForeground(Color.WHITE);
				���˷�.setBounds(10+110+110, 20+100, 100, 50);
				JCheckBox ���˷�_box= new JCheckBox();
				���˷�_box.setBounds(10+60+110+110, 33+100, 20, 20);
				���˷�_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(���˷�_box.isSelected()) {
							if(!name.getText().contains("���˷�")) {
								name.setText(name.getText()+" ���˷�");
							}
						}else {
							if(name.getText().contains("���˷�")) {
								name.setText(name.getText().replace("���˷�", ""));
							}
						}
						
					}
				});
				this.add(���˷�);
				this.add(���˷�_box);
				//copy tab
				JLabel ����ҧ��= new JLabel("����ҧ��:");  
				����ҧ��.setForeground(Color.WHITE);
				����ҧ��.setBounds(10+110+110, 20+125, 100, 50);
				JCheckBox ����ҧ��_box= new JCheckBox();
				����ҧ��_box.setBounds(10+ 60+ 110+ 110, 33+ 125, 20, 20);
				����ҧ��_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(����ҧ��_box.isSelected()) {
							if(!name.getText().contains("����ҧ��")) {
								name.setText(name.getText()+" ����ҧ��");
							}
						}else {
							if(name.getText().contains("����ҧ��")) {
								name.setText(name.getText().replace("����ҧ��", ""));
							}
						}
						
					}
				});
				this.add(����ҧ��);
				this.add(����ҧ��_box);
				//copy tab
				JLabel ����= new JLabel("����:");  
				����.setForeground(Color.WHITE);
				����.setBounds(10+110+110, 20+150, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110, 33+150, 20, 20);
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
				JLabel �ô�����= new JLabel("�ô�����:");  
				�ô�����.setForeground(Color.WHITE);
				�ô�����.setBounds(10+110+110, 20+175, 100, 50);
				JCheckBox �ô�����_box= new JCheckBox();
				�ô�����_box.setBounds(10+60+110+110, 33+175, 20, 20);
				�ô�����_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(�ô�����_box.isSelected()) {
							if(!name.getText().contains("�ô�����")) {
								name.setText(name.getText()+" �ô�����");
							}
						}else {
							if(name.getText().contains("�ô�����")) {
								name.setText(name.getText().replace("�ô�����", ""));
							}
						}
						
					}
				});
				this.add(�ô�����);
				this.add(�ô�����_box);
				
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