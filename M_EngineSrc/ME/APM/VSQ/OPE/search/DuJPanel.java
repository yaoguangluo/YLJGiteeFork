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

public class DuJPanel extends JPanel implements MouseListener, KeyListener, ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DuJPanel(JTextField name){
		this.setLayout(null);
		this.setBounds(0, 0, 780, 610);
		this.setBackground(Color.BLACK);

				//copy tab
				JLabel ���߶�= new JLabel("���߶�:");  
				���߶�.setForeground(Color.WHITE);
				���߶�.setBounds(10+110+110+220, 20+125, 100, 50);
				JCheckBox ���߶�_box= new JCheckBox();
				���߶�_box.setBounds(10+60+110+110+220, 33+125, 20, 20);
				���߶�_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(���߶�_box.isSelected()) {
							if(!name.getText().contains("���߶�")) {
								name.setText(name.getText()+" ���߶�");
							}
						}else {
							if(name.getText().contains("���߶�")) {
								name.setText(name.getText().replace("���߶�", ""));
							}
						}
						
					}
				});
				this.add(���߶�);
				this.add(���߶�_box);	

				//copy tab
				JLabel �ж�= new JLabel("�ж�:");  
				�ж�.setForeground(Color.WHITE);
				�ж�.setBounds(10+110+110+330, 20+275, 100, 50);
				JCheckBox �ж�_box= new JCheckBox();
				�ж�_box.setBounds(10+60+110+110+330, 33+275, 20, 20);
				�ж�_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(�ж�_box.isSelected()) {
							if(!name.getText().contains("�ж�")) {
								name.setText(name.getText()+" �ж�");
							}
						}else {
							if(name.getText().contains("�ж�")) {
								name.setText(name.getText().replace("�ж�", ""));
							}
						}
						
					}
				});
				this.add(�ж�);
				this.add(�ж�_box);	
				
				//copy tab
				JLabel ���ж�= new JLabel("���ж�:");  
				���ж�.setForeground(Color.WHITE);
				���ж�.setBounds(10+110+110+110, 20, 100, 50);
				JCheckBox ���ж�_box= new JCheckBox();
				���ж�_box.setBounds(10+60+110+110+110, 33, 20, 20);
				���ж�_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(���ж�_box.isSelected()) {
							if(!name.getText().contains("���ж�")) {
								name.setText(name.getText()+" ���ж�");
							}
						}else {
							if(name.getText().contains("���ж�")) {
								name.setText(name.getText().replace("���ж�", ""));
							}
						}
						
					}
				});
				this.add(���ж�);
				this.add(���ж�_box);
				//copy tab
				JLabel ���ж�= new JLabel("���ж�:");  
				���ж�.setForeground(Color.WHITE);
				���ж�.setBounds(10+110+110+110, 20+25, 100, 50);
				JCheckBox ���ж�_box= new JCheckBox();
				���ж�_box.setBounds(10+60+110+110+110, 33+25, 20, 20);
				���ж�_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(���ж�_box.isSelected()) {
							if(!name.getText().contains("���ж�")) {
								name.setText(name.getText()+" ���ж�");
							}
						}else {
							if(name.getText().contains("���ж�")) {
								name.setText(name.getText().replace("���ж�", ""));
							}
						}
						
					}
				});
				this.add(���ж�);
				this.add(���ж�_box);
				//copy tab
				JLabel ���ж�= new JLabel("���ж�:");  
				���ж�.setForeground(Color.WHITE);
				���ж�.setBounds(10+110+110+110, 20+50, 100, 50);
				JCheckBox ���ж�_box= new JCheckBox();
				���ж�_box.setBounds(10+60+110+110+110, 33+50, 20, 20);
				���ж�_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(���ж�_box.isSelected()) {
							if(!name.getText().contains("���ж�")) {
								name.setText(name.getText()+" ���ж�");
							}
						}else {
							if(name.getText().contains("���ж�")) {
								name.setText(name.getText().replace("���ж�", ""));
							}
						}
						
					}
				});
				this.add(���ж�);
				this.add(���ж�_box);
				//copy tab
				JLabel ˮ�ж�= new JLabel("ˮ�ж�:");  
				ˮ�ж�.setForeground(Color.WHITE);
				ˮ�ж�.setBounds(10+110+110+110, 20+75, 100, 50);
				JCheckBox ˮ�ж�_box= new JCheckBox();
				ˮ�ж�_box.setBounds(10+60+110+110+110, 33+75, 20, 20);
				ˮ�ж�_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ˮ�ж�_box.isSelected()) {
							if(!name.getText().contains("ˮ�ж�")) {
								name.setText(name.getText()+" ˮ�ж�");
							}
						}else {
							if(name.getText().contains("ˮ�ж�")) {
								name.setText(name.getText().replace("ˮ�ж�", ""));
							}
						}
						
					}
				});
				this.add(ˮ�ж�);
				this.add(ˮ�ж�_box);
				
				//copy tab
				JLabel Ǧ�ж�= new JLabel("Ǧ�ж�:");  
				Ǧ�ж�.setForeground(Color.WHITE);
				Ǧ�ж�.setBounds(10+110+110+110, 20+100, 100, 50);
				JCheckBox Ǧ�ж�_box= new JCheckBox();
				Ǧ�ж�_box.setBounds(10+60+110+110+110, 33+100, 20, 20);
				Ǧ�ж�_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Ǧ�ж�_box.isSelected()) {
							if(!name.getText().contains("Ǧ�ж�")) {
								name.setText(name.getText()+" Ǧ�ж�");
							}
						}else {
							if(name.getText().contains("Ǧ�ж�")) {
								name.setText(name.getText().replace("Ǧ�ж�", ""));
							}
						}
						
					}
				});
				this.add(Ǧ�ж�);
				this.add(Ǧ�ж�_box);
				//copy tab
				JLabel ���ж�= new JLabel("���ж�:");  
				���ж�.setForeground(Color.WHITE);
				���ж�.setBounds(10+110+110+110, 20+125, 100, 50);
				JCheckBox ���ж�_box= new JCheckBox();
				���ж�_box.setBounds(10+60+110+110+110, 33+125, 20, 20);
				���ж�_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(���ж�_box.isSelected()) {
							if(!name.getText().contains("���ж�")) {
								name.setText(name.getText()+" ���ж�");
							}
						}else {
							if(name.getText().contains("���ж�")) {
								name.setText(name.getText().replace("���ж�", ""));
							}
						}
						
					}
				});
				this.add(���ж�);
				this.add(���ж�_box);
				//copy tab
				JLabel ���ж�= new JLabel("���ж�:");  
				���ж�.setForeground(Color.WHITE);
				���ж�.setBounds(10+110+110+110, 20+150, 100, 50);
				JCheckBox ���ж�_box= new JCheckBox();
				���ж�_box.setBounds(10+60+110+110+110, 33+150, 20, 20);
				���ж�_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(���ж�_box.isSelected()) {
							if(!name.getText().contains("���ж�")) {
								name.setText(name.getText()+" ���ж�");
							}
						}else {
							if(name.getText().contains("���ж�")) {
								name.setText(name.getText().replace("���ж�", ""));
							}
						}
						
					}
				});
				this.add(���ж�);
				this.add(���ж�_box);
				//copy tab
				JLabel ���ж�= new JLabel("���ж�:");  
				���ж�.setForeground(Color.WHITE);
				���ж�.setBounds(10+110+110+110, 20+175, 100, 50);
				JCheckBox ���ж�_box= new JCheckBox();
				���ж�_box.setBounds(10+60+110+110+110, 33+175, 20, 20);
				���ж�_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(���ж�_box.isSelected()) {
							if(!name.getText().contains("���ж�")) {
								name.setText(name.getText()+" ���ж�");
							}
						}else {
							if(name.getText().contains("���ж�")) {
								name.setText(name.getText().replace("���ж�", ""));
							}
						}
						
					}
				});
				this.add(���ж�);
				this.add(���ж�_box);
				//copy tab
				JLabel ù�ж�= new JLabel("ù�ж�:");  
				ù�ж�.setForeground(Color.WHITE);
				ù�ж�.setBounds(10+110+110+110, 20+200, 100, 50);
				JCheckBox ù�ж�_box= new JCheckBox();
				ù�ж�_box.setBounds(10+60+110+110+110, 33+200, 20, 20);
				ù�ж�_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ù�ж�_box.isSelected()) {
							if(!name.getText().contains("ù�ж�")) {
								name.setText(name.getText()+" ù�ж�");
							}
						}else {
							if(name.getText().contains("ù�ж�")) {
								name.setText(name.getText().replace("ù�ж�", ""));
							}
						}
						
					}
				});
				this.add(ù�ж�);
				this.add(ù�ж�_box);
				//copy tab
				JLabel �����Զ�= new JLabel("�����Զ�:");  
				�����Զ�.setForeground(Color.WHITE);
				�����Զ�.setBounds(10+110+110+110, 20+225, 100, 50);
				JCheckBox �����Զ�_box= new JCheckBox();
				�����Զ�_box.setBounds(10+60+110+110+110, 33+225, 20, 20);
				�����Զ�_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(�����Զ�_box.isSelected()) {
							if(!name.getText().contains("�����Զ�")) {
								name.setText(name.getText()+" �����Զ�");
							}
						}else {
							if(name.getText().contains("�����Զ�")) {
								name.setText(name.getText().replace("�����Զ�", ""));
							}
						}
						
					}
				});
				this.add(�����Զ�);
				this.add(�����Զ�_box);
					
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