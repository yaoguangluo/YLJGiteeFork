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

public class XueJPanel extends JPanel implements MouseListener, KeyListener, ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public XueJPanel(JTextField name){
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
				JLabel ��Ѫ= new JLabel("��Ѫ:");  
				��Ѫ.setForeground(Color.WHITE);
				��Ѫ.setBounds(10+110+110, 20+500, 100, 50);
				JCheckBox ��Ѫ_box= new JCheckBox();
				��Ѫ_box.setBounds(10+60+110+110, 33+500, 20, 20);
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
				JLabel ��Ѫѹ= new JLabel("��Ѫѹ:");  
				��Ѫѹ.setForeground(Color.WHITE);
				��Ѫѹ.setBounds(10+110+110+220, 20+400, 100, 50);
				JCheckBox ��Ѫѹ_box= new JCheckBox();
				��Ѫѹ_box.setBounds(10+60+110+110+220, 33+400, 20, 20);
				��Ѫѹ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(��Ѫѹ_box.isSelected()) {
							if(!name.getText().contains("��Ѫѹ")) {
								name.setText(name.getText()+" ��Ѫѹ");
							}
						}else {
							if(name.getText().contains("��Ѫѹ")) {
								name.setText(name.getText().replace("��Ѫѹ", ""));
							}
						}
						
					}
				});
				this.add(��Ѫѹ);
				this.add(��Ѫѹ_box);	
				//copy tab
				JLabel ��Ѫѹ= new JLabel("��Ѫѹ:");  
				��Ѫѹ.setForeground(Color.WHITE);
				��Ѫѹ.setBounds(10+110+110+220, 20+425, 100, 50);
				JCheckBox ��Ѫѹ_box= new JCheckBox();
				��Ѫѹ_box.setBounds(10+60+110+110+220, 33+425, 20, 20);
				��Ѫѹ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(��Ѫѹ_box.isSelected()) {
							if(!name.getText().contains("��Ѫѹ")) {
								name.setText(name.getText()+" ��Ѫѹ");
							}
						}else {
							if(name.getText().contains("��Ѫѹ")) {
								name.setText(name.getText().replace("��Ѫѹ", ""));
							}
						}
						
					}
				});
				this.add(��Ѫѹ);
				this.add(��Ѫѹ_box);	

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
				JLabel ֹѪ= new JLabel("ֹѪ:");  
				ֹѪ.setForeground(Color.WHITE);
				ֹѪ.setBounds(10+110+110+330, 20+325, 100, 50);
				JCheckBox ֹѪ_box= new JCheckBox();
				ֹѪ_box.setBounds(10+60+110+110+330, 33+325, 20, 20);
				ֹѪ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ֹѪ_box.isSelected()) {
							if(!name.getText().contains("ֹѪ")) {
								name.setText(name.getText()+" ֹѪ");
							}
						}else {
							if(name.getText().contains("ֹѪ")) {
								name.setText(name.getText().replace("ֹѪ", ""));
							}
						}
						
					}
				});
				this.add(ֹѪ);
				this.add(ֹѪ_box);	
				//copy tab
				JLabel ƶѪ= new JLabel("ƶѪ:");  
				ƶѪ.setForeground(Color.WHITE);
				ƶѪ.setBounds(10+110+110+330, 20+350, 100, 50);
				JCheckBox ƶѪ_box= new JCheckBox();
				ƶѪ_box.setBounds(10+60+110+110+330, 33+350, 20, 20);
				ƶѪ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ƶѪ_box.isSelected()) {
							if(!name.getText().contains("ƶѪ")) {
								name.setText(name.getText()+" ƶѪ");
							}
						}else {
							if(name.getText().contains("ƶѪ")) {
								name.setText(name.getText().replace("ƶѪ", ""));
							}
						}
						
					}
				});
				this.add(ƶѪ);
				this.add(ƶѪ_box);	

				//copy tab
				JLabel ��Ѫ= new JLabel("��Ѫ:");  
				��Ѫ.setForeground(Color.WHITE);
				��Ѫ.setBounds(10+110+110+440, 20+175, 100, 50);
				JCheckBox ��Ѫ_box= new JCheckBox();
				��Ѫ_box.setBounds(10+60+110+110+440, 33+175, 20, 20);
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
				JLabel Ѫ��= new JLabel("Ѫ��:");  
				Ѫ��.setForeground(Color.WHITE);
				Ѫ��.setBounds(10+110, 20, 100, 50);
				JCheckBox Ѫ��_box= new JCheckBox();
				Ѫ��_box.setBounds(10+60+110, 33, 20, 20);
				Ѫ��_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Ѫ��_box.isSelected()) {
							if(!name.getText().contains("Ѫ��")) {
								name.setText(name.getText()+" Ѫ��");
							}
						}else {
							if(name.getText().contains("Ѫ��")) {
								name.setText(name.getText().replace("Ѫ��", ""));
							}
						}
						
					}
				});
				this.add(Ѫ��);
				this.add(Ѫ��_box);
				//copy tab
				JLabel Ѫ��= new JLabel("Ѫ��:");  
				Ѫ��.setForeground(Color.WHITE);
				Ѫ��.setBounds(10+110, 20+25, 100, 50);
				JCheckBox Ѫ��_box= new JCheckBox();
				Ѫ��_box.setBounds(10+60+110, 33+25, 20, 20);
				Ѫ��_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Ѫ��_box.isSelected()) {
							if(!name.getText().contains("Ѫ��")) {
								name.setText(name.getText()+" Ѫ��");
							}
						}else {
							if(name.getText().contains("Ѫ��")) {
								name.setText(name.getText().replace("Ѫ��", ""));
							}
						}
						
					}
				});
				this.add(Ѫ��);
				this.add(Ѫ��_box);
				//copy tab
				JLabel Ѫ��= new JLabel("Ѫ��:");  
				Ѫ��.setForeground(Color.WHITE);
				Ѫ��.setBounds(10+110, 20+50, 100, 50);
				JCheckBox Ѫ��_box= new JCheckBox();
				Ѫ��_box.setBounds(10+60+110, 33+50, 20, 20);
				Ѫ��_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Ѫ��_box.isSelected()) {
							if(!name.getText().contains("Ѫ��")) {
								name.setText(name.getText()+" Ѫ��");
							}
						}else {
							if(name.getText().contains("Ѫ��")) {
								name.setText(name.getText().replace("Ѫ��", ""));
							}
						}
						
					}
				});
				this.add(Ѫ��);
				this.add(Ѫ��_box);
				//copy tab
				JLabel ��Ѫ��ֹ= new JLabel("��Ѫ��ֹ:");  
				��Ѫ��ֹ.setForeground(Color.WHITE);
				��Ѫ��ֹ.setBounds(10+110, 20+75, 100, 50);
				JCheckBox ��Ѫ��ֹ_box= new JCheckBox();
				��Ѫ��ֹ_box.setBounds(10+60+110, 33+75, 20, 20);
				��Ѫ��ֹ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(��Ѫ��ֹ_box.isSelected()) {
							if(!name.getText().contains("��Ѫ��ֹ")) {
								name.setText(name.getText()+" ��Ѫ��ֹ");
							}
						}else {
							if(name.getText().contains("��Ѫ��ֹ")) {
								name.setText(name.getText().replace("��Ѫ��ֹ", ""));
							}
						}
						
					}
				});
				this.add(��Ѫ��ֹ);
				this.add(��Ѫ��ֹ_box);
					
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