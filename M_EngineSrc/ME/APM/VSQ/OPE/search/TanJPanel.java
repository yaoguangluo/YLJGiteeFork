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

public class TanJPanel extends JPanel implements MouseListener, KeyListener, ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TanJPanel(JTextField name){
		this.setLayout(null);
		this.setBounds(0, 0, 780, 610);
		this.setBackground(Color.BLACK);
	
				//copy tab
				JLabel nongtan= new JLabel("Ũ̵:");  
				nongtan.setForeground(Color.WHITE);
				nongtan.setBounds(10, 45+25+25+25, 100, 50);
				JCheckBox nongtan_box= new JCheckBox();
				nongtan_box.setBounds(10+60, 58+25+25+25, 20, 20);
				nongtan_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(nongtan_box.isSelected()) {
							if(!name.getText().contains("Ũ̵")) {
								name.setText(name.getText()+" Ũ̵");
							}
						}else {
							if(name.getText().contains("Ũ̵")) {
								name.setText(name.getText().replace("Ũ̵", ""));
							}
						}
						
					}
				});
				this.add(nongtan);
				this.add(nongtan_box);
				
				//copy tab
				JLabel huangtan= new JLabel("��̵:");  
				huangtan.setForeground(Color.WHITE);
				huangtan.setBounds(10, 45+25+75, 100, 50);
				JCheckBox huangtan_box= new JCheckBox();
				huangtan_box.setBounds(10+60, 58+25+75, 20, 20);
				huangtan_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(huangtan_box.isSelected()) {
							if(!name.getText().contains("��̵")) {
								name.setText(name.getText()+" ��̵");
							}
						}else {
							if(name.getText().contains("��̵")) {
								name.setText(name.getText().replace("��̵", ""));
							}
						}
						
					}
				});
				this.add(huangtan);
				this.add(huangtan_box);
				//copy tab
				JLabel baitan= new JLabel("��̵:");  
				baitan.setForeground(Color.WHITE);
				baitan.setBounds(10, 45+25+100, 100, 50);
				JCheckBox baitan_box= new JCheckBox();
				baitan_box.setBounds(10+60, 58+25+100, 20, 20);
				baitan_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(baitan_box.isSelected()) {
							if(!name.getText().contains("��̵")) {
								name.setText(name.getText()+" ��̵");
							}
						}else {
							if(name.getText().contains("��̵")) {
								name.setText(name.getText().replace("��̵", ""));
							}
						}
						
					}
				});
				this.add(baitan);
				this.add(baitan_box);
				//copy tab
				JLabel duotan= new JLabel("��̵:");  
				duotan.setForeground(Color.WHITE);
				duotan.setBounds(10, 45+25+125, 100, 50);
				JCheckBox duotan_box= new JCheckBox();
				duotan_box.setBounds(10+60, 58+25+125, 20, 20);
				duotan_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(duotan_box.isSelected()) {
							if(!name.getText().contains("��̵")) {
								name.setText(name.getText()+" ��̵");
							}
						}else {
							if(name.getText().contains("��̵")) {
								name.setText(name.getText().replace("��̵", ""));
							}
						}
						
					}
				});
				this.add(duotan);
				this.add(duotan_box);
				//copy tab
				JLabel shaotan= new JLabel("��̵:");  
				shaotan.setForeground(Color.WHITE);
				shaotan.setBounds(10, 45+25+100+25+25, 100, 50);
				JCheckBox shaotan_box= new JCheckBox();
				shaotan_box.setBounds(10+60, 58+25+100+25+25, 20, 20);
				shaotan_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(shaotan_box.isSelected()) {
							if(!name.getText().contains("��̵")) {
								name.setText(name.getText()+" ��̵");
							}
						}else {
							if(name.getText().contains("��̵")) {
								name.setText(name.getText().replace("��̵", ""));
							}
						}
						
					}
				});
				this.add(shaotan);
				this.add(shaotan_box);
				//copy tab
				JLabel chouyan= new JLabel("��̵:");  
				chouyan.setForeground(Color.WHITE);
				chouyan.setBounds(10, 45+25+100+25+50, 100, 50);
				JCheckBox chouyan_box= new JCheckBox();
				chouyan_box.setBounds(10+60, 58+25+100+25+50, 20, 20);
				chouyan_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(chouyan_box.isSelected()) {
							if(!name.getText().contains("��̵")) {
								name.setText(name.getText()+" ��̵");
							}
						}else {
							if(name.getText().contains("��̵")) {
								name.setText(name.getText().replace("��̵", ""));
							}
						}
						
					}
				});
				this.add(chouyan);
				this.add(chouyan_box);
				//copy tab
				JLabel xitan= new JLabel("ϡ̵:");  
				xitan.setForeground(Color.WHITE);
				xitan.setBounds(10, 45+25+100+25+75, 100, 50);
				JCheckBox xitan_box= new JCheckBox();
				xitan_box.setBounds(10+60, 58+25+100+25+75, 20, 20);
				xitan_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(xitan_box.isSelected()) {
							if(!name.getText().contains("ϡ̵")) {
								name.setText(name.getText()+" ϡ̵");
							}
						}else {
							if(name.getText().contains("ϡ̵")) {
								name.setText(name.getText().replace("ϡ̵", ""));
							}
						}
						
					}
				});
				this.add(xitan);
				this.add(xitan_box);

				//copy tab
				JLabel �к�= new JLabel("�к�:");  
				�к�.setForeground(Color.WHITE);
				�к�.setBounds(10+110, 20+75, 100, 50);
				JCheckBox �к�_box= new JCheckBox();
				�к�_box.setBounds(10+60+110, 33+75, 20, 20);
				�к�_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(�к�_box.isSelected()) {
							if(!name.getText().contains("�к�")) {
								name.setText(name.getText()+" �к�");
							}
						}else {
							if(name.getText().contains("�к�")) {
								name.setText(name.getText().replace("�к�", ""));
							}
						}
						
					}
				});
				this.add(�к�);
				this.add(�к�_box);	
				//copy tab
				JLabel �޺�= new JLabel("�޺�:");  
				�޺�.setForeground(Color.WHITE);
				�޺�.setBounds(10+110, 20+100, 100, 50);
				JCheckBox �޺�_box= new JCheckBox();
				�޺�_box.setBounds(10+60+110, 33+100, 20, 20);
				�޺�_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(�޺�_box.isSelected()) {
							if(!name.getText().contains("�޺�")) {
								name.setText(name.getText()+" �޺�");
							}
						}else {
							if(name.getText().contains("�޺�")) {
								name.setText(name.getText().replace("�޺�", ""));
							}
						}
						
					}
				});
				this.add(�޺�);
				this.add(�޺�_box);	
				//copy tab
				JLabel ����= new JLabel("����:");  
				����.setForeground(Color.WHITE);
				����.setBounds(10+110, 20+125, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110, 33+125, 20, 20);
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
				JLabel �Ժ�= new JLabel("�Ժ�:");  
				�Ժ�.setForeground(Color.WHITE);
				�Ժ�.setBounds(10+ 110, 20+ 150, 100, 50);
				JCheckBox �Ժ�_box= new JCheckBox();
				�Ժ�_box.setBounds(10+ 60+ 110, 33+ 150, 20, 20);
				�Ժ�_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(�Ժ�_box.isSelected()) {
							if(!name.getText().contains("�Ժ�")) {
								name.setText(name.getText()+" �Ժ�");
							}
						}else {
							if(name.getText().contains("�Ժ�")) {
								name.setText(name.getText().replace("�Ժ�", ""));
							}
						}
						
					}
				});
				this.add(�Ժ�);
				this.add(�Ժ�_box);	

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