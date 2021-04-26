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

public class TongJPanel extends JPanel implements MouseListener, KeyListener, ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TongJPanel(JTextField name){
		this.setLayout(null);
		this.setBounds(0, 0, 780, 610);
		this.setBackground(Color.BLACK);
		
		JLabel shentongqichuan_filter= new JLabel("��ʹ:");  
		shentongqichuan_filter.setForeground(Color.WHITE);
		shentongqichuan_filter.setBounds(10, 45, 100, 50);
		JCheckBox shentongqichuan_filter_box= new JCheckBox();
		shentongqichuan_filter_box.setBounds(10+60, 58, 20, 20);
		shentongqichuan_filter_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(shentongqichuan_filter_box.isSelected()) {
					if(!name.getText().contains("��ʹ")) {
						name.setText(name.getText()+" ��ʹ");
					}
				}else {
					if(name.getText().contains("��ʹ")) {
						name.setText(name.getText().replace("��ʹ", ""));
					}
				}
				
			}
		});
		this.add(shentongqichuan_filter);
		this.add(shentongqichuan_filter_box);
		//
		JLabel etoutongqichuan_filter= new JLabel("��ͷʹ:");  
		etoutongqichuan_filter.setForeground(Color.WHITE);
		etoutongqichuan_filter.setBounds(10, 45+25, 100, 50);
		JCheckBox etoutongqichuan_filter_box= new JCheckBox();
		etoutongqichuan_filter_box.setBounds(10+60, 58+25, 20, 20);
		etoutongqichuan_filter_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(etoutongqichuan_filter_box.isSelected()) {
					if(!name.getText().contains("��ͷʹ")) {
						name.setText(name.getText()+" ��ͷʹ");
					}
				}else {
					if(name.getText().contains("��ͷʹ")) {
						name.setText(name.getText().replace("��ͷʹ", ""));
					}
				}
				
			}
		});
		this.add(etoutongqichuan_filter);
		this.add(etoutongqichuan_filter_box);
		

			
				//copy tab
				JLabel toutong= new JLabel("ͷʹ:");  
				toutong.setForeground(Color.WHITE);
				toutong.setBounds(10, 45+25+100+25+100, 100, 50);
				JCheckBox toutong_box= new JCheckBox();
				toutong_box.setBounds(10+60, 58+25+100+25+100, 20, 20);
				toutong_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(toutong_box.isSelected()) {
							if(!name.getText().contains("ͷʹ")) {
								name.setText(name.getText()+" ͷʹ");
							}
						}else {
							if(name.getText().contains("ͷʹ")) {
								name.setText(name.getText().replace("ͷʹ", ""));
							}
						}
						
					}
				});
				this.add(toutong);
				this.add(toutong_box);
				//copy tab
				JLabel bozitong= new JLabel("����ʹ:");  
				bozitong.setForeground(Color.WHITE);
				bozitong.setBounds(10, 45+25+100+25+125, 100, 50);
				JCheckBox bozitong_box= new JCheckBox();
				bozitong_box.setBounds(10+60, 58+25+100+25+125, 20, 20);
				bozitong_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(bozitong_box.isSelected()) {
							if(!name.getText().contains("����ʹ")) {
								name.setText(name.getText()+" ����ʹ");
							}
						}else {
							if(name.getText().contains("����ʹ")) {
								name.setText(name.getText().replace("����ʹ", ""));
							}
						}
						
					}
				});
				this.add(bozitong);
				this.add(bozitong_box);
				//copy tab
				JLabel xiongtong= new JLabel("��ʹ:");  
				xiongtong.setForeground(Color.WHITE);
				xiongtong.setBounds(10+440, 45+25+100+25+150, 100, 50);
				JCheckBox xiongtong_box= new JCheckBox();
				xiongtong_box.setBounds(10+60+440, 58+25+100+25+150, 20, 20);
				xiongtong_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(xiongtong_box.isSelected()) {
							if(!name.getText().contains("��ʹ")) {
								name.setText(name.getText()+" ��ʹ");
							}
						}else {
							if(name.getText().contains("��ʹ")) {
								name.setText(name.getText().replace("��ʹ", ""));
							}
						}
						
					}
				});
				this.add(xiongtong);
				this.add(xiongtong_box);
				//copy tab
				JLabel futong= new JLabel("��ʹ:");  
				futong.setForeground(Color.WHITE);
				futong.setBounds(10, 45+25+100+25+150, 100, 50);
				JCheckBox futong_box= new JCheckBox();
				futong_box.setBounds(10+60, 58+25+100+25+150, 20, 20);
				futong_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(futong_box.isSelected()) {
							if(!name.getText().contains("��ʹ")) {
								name.setText(name.getText()+" ��ʹ");
							}
						}else {
							if(name.getText().contains("��ʹ")) {
								name.setText(name.getText().replace("��ʹ", ""));
							}
						}
						
					}
				});
				this.add(futong);
				this.add(futong_box);
				//copy tab
				JLabel �ؽ�ʹ= new JLabel("�ؽ�ʹ:");  
				�ؽ�ʹ.setForeground(Color.WHITE);
				�ؽ�ʹ.setBounds(10, 45+25+100+25+175, 100, 50);
				JCheckBox �ؽ�ʹ_box= new JCheckBox();
				�ؽ�ʹ_box.setBounds(10+60, 58+25+100+25+175, 20, 20);
				�ؽ�ʹ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(�ؽ�ʹ_box.isSelected()) {
							if(!name.getText().contains("�ؽ�ʹ")) {
								name.setText(name.getText()+" �ؽ�ʹ");
							}
						}else {
							if(name.getText().contains("�ؽ�ʹ")) {
								name.setText(name.getText().replace("�ؽ�ʹ", ""));
							}
						}
						
					}
				});
				this.add(�ؽ�ʹ);
				this.add(�ؽ�ʹ_box);
				//copy tab
				JLabel ��ʹ= new JLabel("��ʹ:");  
				��ʹ.setForeground(Color.WHITE);
				��ʹ.setBounds(10, 45+25+100+25+200, 100, 50);
				JCheckBox ��ʹ_box= new JCheckBox();
				��ʹ_box.setBounds(10+60, 58+25+100+25+200, 20, 20);
				��ʹ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(��ʹ_box.isSelected()) {
							if(!name.getText().contains("��ʹ")) {
								name.setText(name.getText()+" ��ʹ");
							}
						}else {
							if(name.getText().contains("��ʹ")) {
								name.setText(name.getText().replace("��ʹ", ""));
							}
						}
						
					}
				});
				this.add(��ʹ);
				this.add(��ʹ_box);
				//copy tab
				JLabel ��ʹ= new JLabel("��ʹ:");  
				��ʹ.setForeground(Color.WHITE);
				��ʹ.setBounds(10, 45+25+100+25+225, 100, 50);
				JCheckBox ��ʹ_box= new JCheckBox();
				��ʹ_box.setBounds(10+60, 58+25+100+25+225, 20, 20);
				��ʹ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(��ʹ_box.isSelected()) {
							if(!name.getText().contains("��ʹ")) {
								name.setText(name.getText()+" ��ʹ");
							}
						}else {
							if(name.getText().contains("��ʹ")) {
								name.setText(name.getText().replace("��ʹ", ""));
							}
						}
						
					}
				});
				this.add(��ʹ);
				this.add(��ʹ_box);
				//copy tab
				JLabel ��ʹ= new JLabel("��ʹ:");  
				��ʹ.setForeground(Color.WHITE);
				��ʹ.setBounds(10, 45+25+100+25+250, 100, 50);
				JCheckBox ��ʹ_box= new JCheckBox();
				��ʹ_box.setBounds(10+60, 58+25+100+25+250, 20, 20);
				��ʹ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(��ʹ_box.isSelected()) {
							if(!name.getText().contains("��ʹ")) {
								name.setText(name.getText()+" ��ʹ");
							}
						}else {
							if(name.getText().contains("��ʹ")) {
								name.setText(name.getText().replace("��ʹ", ""));
							}
						}
						
					}
				});
				this.add(��ʹ);
				this.add(��ʹ_box);
				//copy tab
				JLabel ��ʹ= new JLabel("��ʹ:");  
				��ʹ.setForeground(Color.WHITE);
				��ʹ.setBounds(10, 45+25+100+25+275, 100, 50);
				JCheckBox ��ʹ_box= new JCheckBox();
				��ʹ_box.setBounds(10+60, 58+25+100+25+275, 20, 20);
				��ʹ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(��ʹ_box.isSelected()) {
							if(!name.getText().contains("��ʹ")) {
								name.setText(name.getText()+" ��ʹ");
							}
						}else {
							if(name.getText().contains("��ʹ")) {
								name.setText(name.getText().replace("��ʹ", ""));
							}
						}
						
					}
				});
				this.add(��ʹ);
				this.add(��ʹ_box);
				//copy tab
				JLabel ��ʹ= new JLabel("��ʹ:");  
				��ʹ.setForeground(Color.WHITE);
				��ʹ.setBounds(10, 45+25+100+25+300, 100, 50);
				JCheckBox ��ʹ_box= new JCheckBox();
				��ʹ_box.setBounds(10+60, 58+25+100+25+300, 20, 20);
				��ʹ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(��ʹ_box.isSelected()) {
							if(!name.getText().contains("��ʹ")) {
								name.setText(name.getText()+" ��ʹ");
							}
						}else {
							if(name.getText().contains("��ʹ")) {
								name.setText(name.getText().replace("��ʹ", ""));
							}
						}
						
					}
				});
				this.add(��ʹ);
				this.add(��ʹ_box);
				//copy tab
				JLabel ����ʹ= new JLabel("����ʹ:");  
				����ʹ.setForeground(Color.WHITE);
				����ʹ.setBounds(10, 45+25+100+25+325, 100, 50);
				JCheckBox ����ʹ_box= new JCheckBox();
				����ʹ_box.setBounds(10+60, 58+25+100+25+325, 20, 20);
				����ʹ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(����ʹ_box.isSelected()) {
							if(!name.getText().contains("����ʹ")) {
								name.setText(name.getText()+" ����ʹ");
							}
						}else {
							if(name.getText().contains("����ʹ")) {
								name.setText(name.getText().replace("����ʹ", ""));
							}
						}
						
					}
				});
				this.add(����ʹ);
				this.add(����ʹ_box);
				//copy tab
				JLabel ѹʹ= new JLabel("ѹʹ:");  
				ѹʹ.setForeground(Color.WHITE);
				ѹʹ.setBounds(10+110, 20+0, 100, 50);
				JCheckBox ѹʹ_box= new JCheckBox();
				ѹʹ_box.setBounds(10+60+110, 33+0, 20, 20);
				ѹʹ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ѹʹ_box.isSelected()) {
							if(!name.getText().contains("ѹʹ")) {
								name.setText(name.getText()+" ѹʹ");
							}
						}else {
							if(name.getText().contains("ѹʹ")) {
								name.setText(name.getText().replace("ѹʹ", ""));
							}
						}
						
					}
				});
				this.add(ѹʹ);
				this.add(ѹʹ_box);
				//copy tab
				JLabel ��ʹ= new JLabel("��ʹ:");  
				��ʹ.setForeground(Color.WHITE);
				��ʹ.setBounds(10+110, 20+25, 100, 50);
				JCheckBox ��ʹ_box= new JCheckBox();
				��ʹ_box.setBounds(10+60+110, 33+25, 20, 20);
				��ʹ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(��ʹ_box.isSelected()) {
							if(!name.getText().contains("��ʹ")) {
								name.setText(name.getText()+" ��ʹ");
							}
						}else {
							if(name.getText().contains("��ʹ")) {
								name.setText(name.getText().replace("��ʹ", ""));
							}
						}
						
					}
				});
				this.add(��ʹ);
				this.add(��ʹ_box);	
				//copy tab
				JLabel ��ʹ= new JLabel("��ʹ:");  
				��ʹ.setForeground(Color.WHITE);
				��ʹ.setBounds(10+110, 20+50, 100, 50);
				JCheckBox ��ʹ_box= new JCheckBox();
				��ʹ_box.setBounds(10+60+110, 33+50, 20, 20);
				��ʹ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(��ʹ_box.isSelected()) {
							if(!name.getText().contains("��ʹ")) {
								name.setText(name.getText()+" ��ʹ");
							}
						}else {
							if(name.getText().contains("��ʹ")) {
								name.setText(name.getText().replace("��ʹ", ""));
							}
						}
						
					}
				});
				this.add(��ʹ);
				this.add(��ʹ_box);	
			
				//copy tab
				JLabel ��ʹ= new JLabel("��ʹ:");  
				��ʹ.setForeground(Color.WHITE);
				��ʹ.setBounds(10+110, 20+175, 100, 50);
				JCheckBox ��ʹ_box= new JCheckBox();
				��ʹ_box.setBounds(10+60+110, 33+175, 20, 20);
				��ʹ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(��ʹ_box.isSelected()) {
							if(!name.getText().contains("��ʹ")) {
								name.setText(name.getText()+" ��ʹ");
							}
						}else {
							if(name.getText().contains("��ʹ")) {
								name.setText(name.getText().replace("��ʹ", ""));
							}
						}
						
					}
				});
				this.add(��ʹ);
				this.add(��ʹ_box);	
				//copy tab
				JLabel ��ʹ= new JLabel("��ʹ:");  
				��ʹ.setForeground(Color.WHITE);
				��ʹ.setBounds(10+110, 20+200, 100, 50);
				JCheckBox ��ʹ_box= new JCheckBox();
				��ʹ_box.setBounds(10+60+110, 33+200, 20, 20);
				��ʹ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(��ʹ_box.isSelected()) {
							if(!name.getText().contains("��ʹ")) {
								name.setText(name.getText()+" ��ʹ");
							}
						}else {
							if(name.getText().contains("��ʹ")) {
								name.setText(name.getText().replace("��ʹ", ""));
							}
						}
						
					}
				});
				this.add(��ʹ);
				this.add(��ʹ_box);	
				//copy tab
				JLabel ��ʹ= new JLabel("��ʹ:");  
				��ʹ.setForeground(Color.WHITE);
				��ʹ.setBounds(10+110, 20+225, 100, 50);
				JCheckBox ��ʹ_box= new JCheckBox();
				��ʹ_box.setBounds(10+60+110, 33+225, 20, 20);
				��ʹ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(��ʹ_box.isSelected()) {
							if(!name.getText().contains("��ʹ")) {
								name.setText(name.getText()+" ��ʹ");
							}
						}else {
							if(name.getText().contains("��ʹ")) {
								name.setText(name.getText().replace("��ʹ", ""));
							}
						}
						
					}
				});
				this.add(��ʹ);
				this.add(��ʹ_box);	
				//copy tab
				JLabel ��ʹ= new JLabel("��ʹ:");  
				��ʹ.setForeground(Color.WHITE);
				��ʹ.setBounds(10+110, 20+250, 100, 50);
				JCheckBox ��ʹ_box= new JCheckBox();
				��ʹ_box.setBounds(10+60+110, 33+250, 20, 20);
				��ʹ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(��ʹ_box.isSelected()) {
							if(!name.getText().contains("��ʹ")) {
								name.setText(name.getText()+" ��ʹ");
							}
						}else {
							if(name.getText().contains("��ʹ")) {
								name.setText(name.getText().replace("��ʹ", ""));
							}
						}
						
					}
				});
				this.add(��ʹ);
				this.add(��ʹ_box);	
				//copy tab
				JLabel ָ��ʹ= new JLabel("ָ��ʹ:");  
				ָ��ʹ.setForeground(Color.WHITE);
				ָ��ʹ.setBounds(10+110, 20+275, 100, 50);
				JCheckBox ָ��ʹ_box= new JCheckBox();
				ָ��ʹ_box.setBounds(10+60+110, 33+275, 20, 20);
				ָ��ʹ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ָ��ʹ_box.isSelected()) {
							if(!name.getText().contains("ָ��ʹ")) {
								name.setText(name.getText()+" ָ��ʹ");
							}
						}else {
							if(name.getText().contains("ָ��ʹ")) {
								name.setText(name.getText().replace("ָ��ʹ", ""));
							}
						}
						
					}
				});
				this.add(ָ��ʹ);
				this.add(ָ��ʹ_box);	
				//copy tab
				JLabel ����ʹ= new JLabel("����ʹ:");  
				����ʹ.setForeground(Color.WHITE);
				����ʹ.setBounds(10+110, 20+300, 100, 50);
				JCheckBox ����ʹ_box= new JCheckBox();
				����ʹ_box.setBounds(10+60+110, 33+300, 20, 20);
				����ʹ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(����ʹ_box.isSelected()) {
							if(!name.getText().contains("����ʹ")) {
								name.setText(name.getText()+" ����ʹ");
							}
						}else {
							if(name.getText().contains("����ʹ")) {
								name.setText(name.getText().replace("����ʹ", ""));
							}
						}
						
					}
				});
				this.add(����ʹ);
				this.add(����ʹ_box);	
				//copy tab
				JLabel ��ֺʹ= new JLabel("��ֺʹ:");  
				��ֺʹ.setForeground(Color.WHITE);
				��ֺʹ.setBounds(10+110, 20+325, 100, 50);
				JCheckBox ��ֺʹ_box= new JCheckBox();
				��ֺʹ_box.setBounds(10+60+110, 33+325, 20, 20);
				��ֺʹ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(��ֺʹ_box.isSelected()) {
							if(!name.getText().contains("��ֺʹ")) {
								name.setText(name.getText()+" ��ֺʹ");
							}
						}else {
							if(name.getText().contains("��ֺʹ")) {
								name.setText(name.getText().replace("��ֺʹ", ""));
							}
						}
						
					}
				});
				this.add(��ֺʹ);
				this.add(��ֺʹ_box);	
			
				//copy tab
				JLabel ɤʹ= new JLabel("ɤʹ:");  
				ɤʹ.setForeground(Color.WHITE);
				ɤʹ.setBounds(10+110+110, 20+400, 100, 50);
				JCheckBox ɤʹ_box= new JCheckBox();
				ɤʹ_box.setBounds(10+60+110+110, 33+400, 20, 20);
				ɤʹ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ɤʹ_box.isSelected()) {
							if(!name.getText().contains("ɤʹ")) {
								name.setText(name.getText()+" ɤʹ");
							}
						}else {
							if(name.getText().contains("ɤʹ")) {
								name.setText(name.getText().replace("ɤʹ", ""));
							}
						}
						
					}
				});
				this.add(ɤʹ);
				this.add(ɤʹ_box);	
				
				//copy tab
				JLabel ��ʹ= new JLabel("��ʹ:");  
				��ʹ.setForeground(Color.WHITE);
				��ʹ.setBounds(10+110+110+110, 20+425, 100, 50);
				JCheckBox ��ʹ_box= new JCheckBox();
				��ʹ_box.setBounds(10+60+110+110+110, 33+425, 20, 20);
				��ʹ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(��ʹ_box.isSelected()) {
							if(!name.getText().contains("��ʹ")) {
								name.setText(name.getText()+" ��ʹ");
							}
						}else {
							if(name.getText().contains("��ʹ")) {
								name.setText(name.getText().replace("��ʹ", ""));
							}
						}
						
					}
				});
				this.add(��ʹ);
				this.add(��ʹ_box);	
			
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
				JLabel ��ʹ= new JLabel("��ʹ:");  
				��ʹ.setForeground(Color.WHITE);
				��ʹ.setBounds(10, 20, 100, 50);
				JCheckBox ��ʹ_box= new JCheckBox();
				��ʹ_box.setBounds(10+60, 33, 20, 20);
				��ʹ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(��ʹ_box.isSelected()) {
							if(!name.getText().contains("��ʹ")) {
								name.setText(name.getText()+" ��ʹ");
							}
						}else {
							if(name.getText().contains("��ʹ")) {
								name.setText(name.getText().replace("��ʹ", ""));
							}
						}
						
					}
				});
				this.add(��ʹ);
				this.add(��ʹ_box);
				
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