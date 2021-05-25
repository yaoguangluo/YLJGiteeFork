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

public class QitaJPanel extends JPanel implements MouseListener, KeyListener, ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public QitaJPanel(JTextField name){
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
		//
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
				xiongtong.setBounds(10, 45+25+100+25+150, 100, 50);
				JCheckBox xiongtong_box= new JCheckBox();
				xiongtong_box.setBounds(10+60, 58+25+100+25+150, 20, 20);
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
				JLabel ����= new JLabel("����:");  
				����.setForeground(Color.WHITE);
				����.setBounds(10+110, 20+350, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110, 33+350, 20, 20);
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
				����.setBounds(10+110, 20+375, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110, 33+375, 20, 20);
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
				JLabel �λ�= new JLabel("�λ�:");  
				�λ�.setForeground(Color.WHITE);
				�λ�.setBounds(10+110, 20+475, 100, 50);
				JCheckBox �λ�_box= new JCheckBox();
				�λ�_box.setBounds(10+60+110, 33+475, 20, 20);
				�λ�_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(�λ�_box.isSelected()) {
							if(!name.getText().contains("�λ�")) {
								name.setText(name.getText()+" �λ�");
							}
						}else {
							if(name.getText().contains("�λ�")) {
								name.setText(name.getText().replace("�λ�", ""));
							}
						}
						
					}
				});
				this.add(�λ�);
				this.add(�λ�_box);	
				//copy tab
				JLabel ����= new JLabel("����:");  
				����.setForeground(Color.WHITE);
				����.setBounds(10+110, 20+500, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110, 33+500, 20, 20);
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
				����.setBounds(10+110+110, 20+0, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110, 33+0, 20, 20);
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
				����.setBounds(10+110+110, 20+25, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110, 33+25, 20, 20);
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
				����.setBounds(10+110+110, 20+50, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110, 33+50, 20, 20);
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
				JLabel �з�= new JLabel("�з�:");  
				�з�.setForeground(Color.WHITE);
				�з�.setBounds(10+110+110, 20+75, 100, 50);
				JCheckBox �з�_box= new JCheckBox();
				�з�_box.setBounds(10+60+110+110, 33+75, 20, 20);
				�з�_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(�з�_box.isSelected()) {
							if(!name.getText().contains("�з�")) {
								name.setText(name.getText()+" �з�");
							}
						}else {
							if(name.getText().contains("�з�")) {
								name.setText(name.getText().replace("�з�", ""));
							}
						}
						
					}
				});
				this.add(�з�);
				this.add(�з�_box);	
				//copy tab
				JLabel ƫ̱= new JLabel("ƫ̱:");  
				ƫ̱.setForeground(Color.WHITE);
				ƫ̱.setBounds(10+110+110, 20+100, 100, 50);
				JCheckBox ƫ̱_box= new JCheckBox();
				ƫ̱_box.setBounds(10+60+110+110, 33+100, 20, 20);
				ƫ̱_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ƫ̱_box.isSelected()) {
							if(!name.getText().contains("ƫ̱")) {
								name.setText(name.getText()+" ƫ̱");
							}
						}else {
							if(name.getText().contains("ƫ̱")) {
								name.setText(name.getText().replace("ƫ̱", ""));
							}
						}
						
					}
				});
				this.add(ƫ̱);
				this.add(ƫ̱_box);	
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
				JLabel ����= new JLabel("����:");  
				����.setForeground(Color.WHITE);
				����.setBounds(10+110+110, 20+250, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110, 33+250, 20, 20);
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
				JLabel ʧ��= new JLabel("ʧ��:");  
				ʧ��.setForeground(Color.WHITE);
				ʧ��.setBounds(10+110+110, 20+375, 100, 50);
				JCheckBox ʧ��_box= new JCheckBox();
				ʧ��_box.setBounds(10+60+110+110, 33+375, 20, 20);
				ʧ��_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ʧ��_box.isSelected()) {
							if(!name.getText().contains("ʧ��")) {
								name.setText(name.getText()+" ʧ��");
							}
						}else {
							if(name.getText().contains("ʧ��")) {
								name.setText(name.getText().replace("ʧ��", ""));
							}
						}
						
					}
				});
				this.add(ʧ��);
				this.add(ʧ��_box);	
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
				JLabel ����= new JLabel("����:");  
				����.setForeground(Color.WHITE);
				����.setBounds(10+110+110, 20+425, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110, 33+425, 20, 20);
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
				JLabel ��θ= new JLabel("��θ:");  
				��θ.setForeground(Color.WHITE);
				��θ.setBounds(10+110+110, 20+450, 100, 50);
				JCheckBox ��θ_box= new JCheckBox();
				��θ_box.setBounds(10+60+110+110, 33+450, 20, 20);
				��θ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(��θ_box.isSelected()) {
							if(!name.getText().contains("��θ")) {
								name.setText(name.getText()+" ��θ");
							}
						}else {
							if(name.getText().contains("��θ")) {
								name.setText(name.getText().replace("��θ", ""));
							}
						}
						
					}
				});
				this.add(��θ);
				this.add(��θ_box);	
				//copy tab
				JLabel Ż��= new JLabel("Ż��:");  
				Ż��.setForeground(Color.WHITE);
				Ż��.setBounds(10+110+110, 20+475, 100, 50);
				JCheckBox Ż��_box= new JCheckBox();
				Ż��_box.setBounds(10+60+110+110, 33+475, 20, 20);
				Ż��_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Ż��_box.isSelected()) {
							if(!name.getText().contains("Ż��")) {
								name.setText(name.getText()+" Ż��");
							}
						}else {
							if(name.getText().contains("Ż��")) {
								name.setText(name.getText().replace("Ż��", ""));
							}
						}
						
					}
				});
				this.add(Ż��);
				this.add(Ż��_box);	
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
				JLabel �°�ĭ= new JLabel("�°�ĭ:");  
				�°�ĭ.setForeground(Color.WHITE);
				�°�ĭ.setBounds(10+110+110+110, 20+0, 100, 50);
				JCheckBox �°�ĭ_box= new JCheckBox();
				�°�ĭ_box.setBounds(10+60+110+110+110, 33+0, 20, 20);
				�°�ĭ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(�°�ĭ_box.isSelected()) {
							if(!name.getText().contains("�°�ĭ")) {
								name.setText(name.getText()+" �°�ĭ");
							}
						}else {
							if(name.getText().contains("�°�ĭ")) {
								name.setText(name.getText().replace("�°�ĭ", ""));
							}
						}
						
					}
				});
				this.add(�°�ĭ);
				this.add(�°�ĭ_box);	
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
				JLabel ֧ԭ�岡= new JLabel("֧ԭ�岡:");  
				֧ԭ�岡.setForeground(Color.WHITE);
				֧ԭ�岡.setBounds(10+110+110+110, 20+250, 100, 50);
				JCheckBox ֧ԭ�岡_box= new JCheckBox();
				֧ԭ�岡_box.setBounds(10+60+110+110+110, 33+250, 20, 20);
				֧ԭ�岡_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(֧ԭ�岡_box.isSelected()) {
							if(!name.getText().contains("֧ԭ�岡")) {
								name.setText(name.getText()+" ֧ԭ�岡");
							}
						}else {
							if(name.getText().contains("֧ԭ�岡")) {
								name.setText(name.getText().replace("֧ԭ�岡", ""));
							}
						}
						
					}
				});
				this.add(֧ԭ�岡);
				this.add(֧ԭ�岡_box);	
				//copy tab
				JLabel ��ԭ�岡= new JLabel("��ԭ�岡:");  
				��ԭ�岡.setForeground(Color.WHITE);
				��ԭ�岡.setBounds(10+110+110+110, 20+275, 100, 50);
				JCheckBox ��ԭ�岡_box= new JCheckBox();
				��ԭ�岡_box.setBounds(10+60+110+110+110, 33+275, 20, 20);
				��ԭ�岡_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(��ԭ�岡_box.isSelected()) {
							if(!name.getText().contains("��ԭ�岡")) {
								name.setText(name.getText()+" ��ԭ�岡");
							}
						}else {
							if(name.getText().contains("��ԭ�岡")) {
								name.setText(name.getText().replace("��ԭ�岡", ""));
							}
						}
						
					}
				});
				this.add(��ԭ�岡);
				this.add(��ԭ�岡_box);	
				//copy tab
				JLabel ������Ⱦ= new JLabel("������Ⱦ:");  
				������Ⱦ.setForeground(Color.WHITE);
				������Ⱦ.setBounds(10+110+110+110, 20+300, 100, 50);
				JCheckBox ������Ⱦ_box= new JCheckBox();
				������Ⱦ_box.setBounds(10+60+110+110+110, 33+300, 20, 20);
				������Ⱦ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(������Ⱦ_box.isSelected()) {
							if(!name.getText().contains("������Ⱦ")) {
								name.setText(name.getText()+" ������Ⱦ");
							}
						}else {
							if(name.getText().contains("������Ⱦ")) {
								name.setText(name.getText().replace("������Ⱦ", ""));
							}
						}
						
					}
				});
				this.add(������Ⱦ);
				this.add(������Ⱦ_box);	
				//copy tab
				JLabel ��Ȯ����= new JLabel("��Ȯ����:");  
				��Ȯ����.setForeground(Color.WHITE);
				��Ȯ����.setBounds(10+110+110+110, 20+325, 100, 50);
				JCheckBox ��Ȯ����_box= new JCheckBox();
				��Ȯ����_box.setBounds(10+60+110+110+110, 33+325, 20, 20);
				��Ȯ����_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(��Ȯ����_box.isSelected()) {
							if(!name.getText().contains("��Ȯ����")) {
								name.setText(name.getText()+" ��Ȯ����");
							}
						}else {
							if(name.getText().contains("��Ȯ����")) {
								name.setText(name.getText().replace("��Ȯ����", ""));
							}
						}
						
					}
				});
				this.add(��Ȯ����);
				this.add(��Ȯ����_box);	
				//copy tab
				JLabel ������= new JLabel("������:");  
				������.setForeground(Color.WHITE);
				������.setBounds(10+110+110+110, 20+350, 100, 50);
				JCheckBox ������_box= new JCheckBox();
				������_box.setBounds(10+60+110+110+110, 33+350, 20, 20);
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
				����.setBounds(10+110+110+110, 20+375, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110+110, 33+375, 20, 20);
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
				��������.setBounds(10+110+110+110, 20+400, 100, 50);
				JCheckBox ��������_box= new JCheckBox();
				��������_box.setBounds(10+60+110+110+110, 33+400, 20, 20);
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
				JLabel ����= new JLabel("����:");  
				����.setForeground(Color.WHITE);
				����.setBounds(10+110+110+110, 20+450, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110+110, 33+450, 20, 20);
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
				JLabel �Ѳ�= new JLabel("�Ѳ�:");  
				�Ѳ�.setForeground(Color.WHITE);
				�Ѳ�.setBounds(10+110+110+110, 20+475, 100, 50);
				JCheckBox �Ѳ�_box= new JCheckBox();
				�Ѳ�_box.setBounds(10+60+110+110+110, 33+475, 20, 20);
				�Ѳ�_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(�Ѳ�_box.isSelected()) {
							if(!name.getText().contains("�Ѳ�")) {
								name.setText(name.getText()+" �Ѳ�");
							}
						}else {
							if(name.getText().contains("�Ѳ�")) {
								name.setText(name.getText().replace("�Ѳ�", ""));
							}
						}
						
					}
				});
				this.add(�Ѳ�);
				this.add(�Ѳ�_box);	
				//copy tab
				JLabel ����= new JLabel("����:");  
				����.setForeground(Color.WHITE);
				����.setBounds(10+110+110+110, 20+500, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110+110, 33+500, 20, 20);
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
				����.setBounds(10+110+110+220, 20+0, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110+220, 33+0, 20, 20);
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
				����.setBounds(10+110+110+220, 20+25, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110+220, 33+25, 20, 20);
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
				����.setBounds(10+110+110+220, 20+50, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110+220, 33+50, 20, 20);
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
				JLabel ��Ŀ= new JLabel("��Ŀ:");  
				��Ŀ.setForeground(Color.WHITE);
				��Ŀ.setBounds(10+110+110+220, 20+75, 100, 50);
				JCheckBox ��Ŀ_box= new JCheckBox();
				��Ŀ_box.setBounds(10+60+110+110+220, 33+75, 20, 20);
				��Ŀ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(��Ŀ_box.isSelected()) {
							if(!name.getText().contains("��Ŀ")) {
								name.setText(name.getText()+" ��Ŀ");
							}
						}else {
							if(name.getText().contains("��Ŀ")) {
								name.setText(name.getText().replace("��Ŀ", ""));
							}
						}
						
					}
				});
				this.add(��Ŀ);
				this.add(��Ŀ_box);	
				//copy tab
				JLabel ���= new JLabel("���:");  
				���.setForeground(Color.WHITE);
				���.setBounds(10+110+110+220, 20+100, 100, 50);
				JCheckBox ���_box= new JCheckBox();
				���_box.setBounds(10+60+110+110+220, 33+100, 20, 20);
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
				JLabel Ӫ��= new JLabel("Ӫ��:");  
				Ӫ��.setForeground(Color.WHITE);
				Ӫ��.setBounds(10+110+110+220, 20+150, 100, 50);
				JCheckBox Ӫ��_box= new JCheckBox();
				Ӫ��_box.setBounds(10+60+110+110+220, 33+150, 20, 20);
				Ӫ��_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Ӫ��_box.isSelected()) {
							if(!name.getText().contains("Ӫ��")) {
								name.setText(name.getText()+" Ӫ��");
							}
						}else {
							if(name.getText().contains("Ӫ��")) {
								name.setText(name.getText().replace("Ӫ��", ""));
							}
						}
						
					}
				});
				this.add(Ӫ��);
				this.add(Ӫ��_box);	
				//copy tab
				JLabel ����= new JLabel("����:");  
				����.setForeground(Color.WHITE);
				����.setBounds(10+110+110+220, 20+175, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110+220, 33+175, 20, 20);
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
				JLabel �¾�����= new JLabel("�¾�����:");  
				�¾�����.setForeground(Color.WHITE);
				�¾�����.setBounds(10+110+110+220, 20+200, 100, 50);
				JCheckBox �¾�����_box= new JCheckBox();
				�¾�����_box.setBounds(10+60+110+110+220, 33+200, 20, 20);
				�¾�����_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(�¾�����_box.isSelected()) {
							if(!name.getText().contains("�¾�����")) {
								name.setText(name.getText()+" �¾�����");
							}
						}else {
							if(name.getText().contains("�¾�����")) {
								name.setText(name.getText().replace("�¾�����", ""));
							}
						}
						
					}
				});
				this.add(�¾�����);
				this.add(�¾�����_box);	
				//copy tab
				JLabel ȸĿ= new JLabel("ȸĿ:");  
				ȸĿ.setForeground(Color.WHITE);
				ȸĿ.setBounds(10+110+110+220, 20+225, 100, 50);
				JCheckBox ȸĿ_box= new JCheckBox();
				ȸĿ_box.setBounds(10+60+110+110+220, 33+225, 20, 20);
				ȸĿ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ȸĿ_box.isSelected()) {
							if(!name.getText().contains("ȸĿ")) {
								name.setText(name.getText()+" ȸĿ");
							}
						}else {
							if(name.getText().contains("ȸĿ")) {
								name.setText(name.getText().replace("ȸĿ", ""));
							}
						}
						
					}
				});
				this.add(ȸĿ);
				this.add(ȸĿ_box);	
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
				JLabel ��������= new JLabel("��������:");  
				��������.setForeground(Color.WHITE);
				��������.setBounds(10+110+110+220, 20+275, 100, 50);
				JCheckBox ��������_box= new JCheckBox();
				��������_box.setBounds(10+60+110+110+220, 33+275, 20, 20);
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
				JLabel ����ʯ= new JLabel("����ʯ:");  
				����ʯ.setForeground(Color.WHITE);
				����ʯ.setBounds(10+110+110+220, 20+350, 100, 50);
				JCheckBox ����ʯ_box= new JCheckBox();
				����ʯ_box.setBounds(10+60+110+110+220, 33+350, 20, 20);
				����ʯ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(����ʯ_box.isSelected()) {
							if(!name.getText().contains("����ʯ")) {
								name.setText(name.getText()+" ����ʯ");
							}
						}else {
							if(name.getText().contains("����ʯ")) {
								name.setText(name.getText().replace("����ʯ", ""));
							}
						}
						
					}
				});
				this.add(����ʯ);
				this.add(����ʯ_box);	
				//copy tab
				JLabel ����ʯ= new JLabel("����ʯ:");  
				����ʯ.setForeground(Color.WHITE);
				����ʯ.setBounds(10+110+110+220, 20+375, 100, 50);
				JCheckBox ����ʯ_box= new JCheckBox();
				����ʯ_box.setBounds(10+60+110+110+220, 33+375, 20, 20);
				����ʯ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(����ʯ_box.isSelected()) {
							if(!name.getText().contains("����ʯ")) {
								name.setText(name.getText()+" ����ʯ");
							}
						}else {
							if(name.getText().contains("����ʯ")) {
								name.setText(name.getText().replace("����ʯ", ""));
							}
						}
						
					}
				});
				this.add(����ʯ);
				this.add(����ʯ_box);	
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
				JLabel ��©= new JLabel("��©:");  
				��©.setForeground(Color.WHITE);
				��©.setBounds(10+110+110+220, 20+450, 100, 50);
				JCheckBox ��©_box= new JCheckBox();
				��©_box.setBounds(10+60+110+110+220, 33+450, 20, 20);
				��©_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(��©_box.isSelected()) {
							if(!name.getText().contains("��©")) {
								name.setText(name.getText()+" ��©");
							}
						}else {
							if(name.getText().contains("��©")) {
								name.setText(name.getText().replace("��©", ""));
							}
						}
						
					}
				});
				this.add(��©);
				this.add(��©_box);	
				
				//copy tab
				JLabel ��ʳ= new JLabel("��ʳ:");  
				��ʳ.setForeground(Color.WHITE);
				��ʳ.setBounds(10+110+110+220, 20+475, 100, 50);
				JCheckBox ��ʳ_box= new JCheckBox();
				��ʳ_box.setBounds(10+60+110+110+220, 33+475, 20, 20);
				��ʳ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(��ʳ_box.isSelected()) {
							if(!name.getText().contains("��ʳ")) {
								name.setText(name.getText()+" ��ʳ");
							}
						}else {
							if(name.getText().contains("��ʳ")) {
								name.setText(name.getText().replace("��ʳ", ""));
							}
						}
						
					}
				});
				this.add(��ʳ);
				this.add(��ʳ_box);	
				//copy tab
				JLabel ��ʳ= new JLabel("��ʳ:");  
				��ʳ.setForeground(Color.WHITE);
				��ʳ.setBounds(10+110+110+220, 20+500, 100, 50);
				JCheckBox ��ʳ_box= new JCheckBox();
				��ʳ_box.setBounds(10+60+110+110+220, 33+500, 20, 20);
				��ʳ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(��ʳ_box.isSelected()) {
							if(!name.getText().contains("��ʳ")) {
								name.setText(name.getText()+" ��ʳ");
							}
						}else {
							if(name.getText().contains("��ʳ")) {
								name.setText(name.getText().replace("��ʳ", ""));
							}
						}
						
					}
				});
				this.add(��ʳ);
				this.add(��ʳ_box);	
				//copy tab
				JLabel ��ʳ= new JLabel("��ʳ:");  
				��ʳ.setForeground(Color.WHITE);
				��ʳ.setBounds(10+110+110+330, 20+0, 100, 50);
				JCheckBox ��ʳ_box= new JCheckBox();
				��ʳ_box.setBounds(10+60+110+110+330, 33+0, 20, 20);
				��ʳ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(��ʳ_box.isSelected()) {
							if(!name.getText().contains("��ʳ")) {
								name.setText(name.getText()+" ��ʳ");
							}
						}else {
							if(name.getText().contains("��ʳ")) {
								name.setText(name.getText().replace("��ʳ", ""));
							}
						}
						
					}
				});
				this.add(��ʳ);
				this.add(��ʳ_box);	
				//copy tab
				JLabel ������ʳ= new JLabel("������ʳ:");  
				������ʳ.setForeground(Color.WHITE);
				������ʳ.setBounds(10+110+110+330, 20+25, 100, 50);
				JCheckBox ������ʳ_box= new JCheckBox();
				������ʳ_box.setBounds(10+60+110+110+330, 33+25, 20, 20);
				������ʳ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(������ʳ_box.isSelected()) {
							if(!name.getText().contains("������ʳ")) {
								name.setText(name.getText()+" ������ʳ");
							}
						}else {
							if(name.getText().contains("������ʳ")) {
								name.setText(name.getText().replace("������ʳ", ""));
							}
						}
						
					}
				});
				this.add(������ʳ);
				this.add(������ʳ_box);	
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
				JLabel ��������= new JLabel("��������:");  
				��������.setForeground(Color.WHITE);
				��������.setBounds(10+110+110+330, 20+100, 100, 50);
				JCheckBox ��������_box= new JCheckBox();
				��������_box.setBounds(10+60+110+110+330, 33+100, 20, 20);
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
				JLabel �ڳ�= new JLabel("�ڳ�:");  
				�ڳ�.setForeground(Color.WHITE);
				�ڳ�.setBounds(10+110+110+330, 20+125, 100, 50);
				JCheckBox �ڳ�_box= new JCheckBox();
				�ڳ�_box.setBounds(10+60+110+110+330, 33+125, 20, 20);
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
				JLabel ����= new JLabel("����:");  
				����.setForeground(Color.WHITE);
				����.setBounds(10+110+110+330, 20+150, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110+330, 33+150, 20, 20);
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
				JLabel ��˯= new JLabel("��˯:");  
				��˯.setForeground(Color.WHITE);
				��˯.setBounds(10+110+110+330, 20+175, 100, 50);
				JCheckBox ��˯_box= new JCheckBox();
				��˯_box.setBounds(10+60+110+110+330, 33+175, 20, 20);
				��˯_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(��˯_box.isSelected()) {
							if(!name.getText().contains("��˯")) {
								name.setText(name.getText()+" ��˯");
							}
						}else {
							if(name.getText().contains("��˯")) {
								name.setText(name.getText().replace("��˯", ""));
							}
						}
						
					}
				});
				this.add(��˯);
				this.add(��˯_box);	
				//copy tab
				JLabel ����= new JLabel("����:");  
				����.setForeground(Color.WHITE);
				����.setBounds(10+110+110+330, 20+200, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110+330, 33+200, 20, 20);
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
				JLabel ����ˮ= new JLabel("����ˮ:");  
				����ˮ.setForeground(Color.WHITE);
				����ˮ.setBounds(10+110+110+330, 20+225, 100, 50);
				JCheckBox ����ˮ_box= new JCheckBox();
				����ˮ_box.setBounds(10+60+110+110+330, 33+225, 20, 20);
				����ˮ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(����ˮ_box.isSelected()) {
							if(!name.getText().contains("����ˮ")) {
								name.setText(name.getText()+" ����ˮ");
							}
						}else {
							if(name.getText().contains("����ˮ")) {
								name.setText(name.getText().replace("����ˮ", ""));
							}
						}
						
					}
				});
				this.add(����ˮ);
				this.add(����ˮ_box);	
				//copy tab
				JLabel �վ�= new JLabel("�վ�:");  
				�վ�.setForeground(Color.WHITE);
				�վ�.setBounds(10+110+110+330, 20+250, 100, 50);
				JCheckBox �վ�_box= new JCheckBox();
				�վ�_box.setBounds(10+60+110+110+330, 33+250, 20, 20);
				�վ�_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(�վ�_box.isSelected()) {
							if(!name.getText().contains("�վ�")) {
								name.setText(name.getText()+" �վ�");
							}
						}else {
							if(name.getText().contains("�վ�")) {
								name.setText(name.getText().replace("�վ�", ""));
							}
						}
						
					}
				});
				this.add(�վ�);
				this.add(�վ�_box);	
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
				����.setBounds(10+110+110+330, 20+400, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110+330, 33+400, 20, 20);
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
				JLabel ��֢= new JLabel("��֢:");  
				��֢.setForeground(Color.WHITE);
				��֢.setBounds(10+110+110+330, 20+425, 100, 50);
				JCheckBox ��֢_box= new JCheckBox();
				��֢_box.setBounds(10+60+110+110+330, 33+425, 20, 20);
				��֢_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(��֢_box.isSelected()) {
							if(!name.getText().contains("��֢")) {
								name.setText(name.getText()+" ��֢");
							}
						}else {
							if(name.getText().contains("��֢")) {
								name.setText(name.getText().replace("��֢", ""));
							}
						}
						
					}
				});
				this.add(��֢);
				this.add(��֢_box);	
				//copy tab
				JLabel ����= new JLabel("����:");  
				����.setForeground(Color.WHITE);
				����.setBounds(10+110+110+330, 20+450, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110+330, 33+450, 20, 20);
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
				JLabel �ݿ�= new JLabel("�ݿ�:");  
				�ݿ�.setForeground(Color.WHITE);
				�ݿ�.setBounds(10+110+110+330, 20+475, 100, 50);
				JCheckBox �ݿ�_box= new JCheckBox();
				�ݿ�_box.setBounds(10+60+110+110+330, 33+475, 20, 20);
				�ݿ�_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(�ݿ�_box.isSelected()) {
							if(!name.getText().contains("�ݿ�")) {
								name.setText(name.getText()+" �ݿ�");
							}
						}else {
							if(name.getText().contains("�ݿ�")) {
								name.setText(name.getText().replace("�ݿ�", ""));
							}
						}
						
					}
				});
				this.add(�ݿ�);
				this.add(�ݿ�_box);	
				//copy tab
				JLabel ���۲�= new JLabel("���۲�:");  
				���۲�.setForeground(Color.WHITE);
				���۲�.setBounds(10+110+110+330, 20+500, 100, 50);
				JCheckBox ���۲�_box= new JCheckBox();
				���۲�_box.setBounds(10+60+110+110+330, 33+500, 20, 20);
				���۲�_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(���۲�_box.isSelected()) {
							if(!name.getText().contains("���۲�")) {
								name.setText(name.getText()+" ���۲�");
							}
						}else {
							if(name.getText().contains("���۲�")) {
								name.setText(name.getText().replace("���۲�", ""));
							}
						}
						
					}
				});
				this.add(���۲�);
				this.add(���۲�_box);	
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
				JLabel ʧ�߲���= new JLabel("ʧ�߲���:");  
				ʧ�߲���.setForeground(Color.WHITE);
				ʧ�߲���.setBounds(10+110+110+440, 20+25, 100, 50);
				JCheckBox ʧ�߲���_box= new JCheckBox();
				ʧ�߲���_box.setBounds(10+60+110+110+440, 33+25, 20, 20);
				ʧ�߲���_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ʧ�߲���_box.isSelected()) {
							if(!name.getText().contains("ʧ�߲���")) {
								name.setText(name.getText()+" ʧ�߲���");
							}
						}else {
							if(name.getText().contains("ʧ�߲���")) {
								name.setText(name.getText().replace("ʧ�߲���", ""));
							}
						}
						
					}
				});
				this.add(ʧ�߲���);
				this.add(ʧ�߲���_box);	
				//copy tab
				JLabel ����= new JLabel("����:");  
				����.setForeground(Color.WHITE);
				����.setBounds(10+110+110+440, 20+50, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110+440, 33+50, 20, 20);
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
				JLabel ����= new JLabel("����:");  
				����.setForeground(Color.WHITE);
				����.setBounds(10+110+110+440, 20+150, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110+440, 33+150, 20, 20);
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
				JLabel ʧ��= new JLabel("ʧ��:");  
				ʧ��.setForeground(Color.WHITE);
				ʧ��.setBounds(10+110+110+440, 20+275, 100, 50);
				JCheckBox ʧ��_box= new JCheckBox();
				ʧ��_box.setBounds(10+60+110+110+440, 33+275, 20, 20);
				ʧ��_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ʧ��_box.isSelected()) {
							if(!name.getText().contains("ʧ��")) {
								name.setText(name.getText()+" ʧ��");
							}
						}else {
							if(name.getText().contains("ʧ��")) {
								name.setText(name.getText().replace("ʧ��", ""));
							}
						}
						
					}
				});
				this.add(ʧ��);
				this.add(ʧ��_box);	
				//copy tab
				JLabel ����= new JLabel("����:");  
				����.setForeground(Color.WHITE);
				����.setBounds(10+110+110+440, 20+300, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110+440, 33+300, 20, 20);
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
				JLabel ��= new JLabel("��:");  
				��.setForeground(Color.WHITE);
				��.setBounds(10+110+110+440, 20+325, 100, 50);
				JCheckBox ��_box= new JCheckBox();
				��_box.setBounds(10+60+110+110+440, 33+325, 20, 20);
				��_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(��_box.isSelected()) {
							if(!name.getText().contains("��")) {
								name.setText(name.getText()+" ��");
							}
						}else {
							if(name.getText().contains("��")) {
								name.setText(name.getText().replace("��", ""));
							}
						}
						
					}
				});
				this.add(��);
				this.add(��_box);	
				//copy tab
				JLabel ����= new JLabel("����:");  
				����.setForeground(Color.WHITE);
				����.setBounds(10+110+110+440, 20+350, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110+440, 33+350, 20, 20);
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
				JLabel ƣ��= new JLabel("ƣ��:");  
				ƣ��.setForeground(Color.WHITE);
				ƣ��.setBounds(10+110+110+440, 20+450, 100, 50);
				JCheckBox ƣ��_box= new JCheckBox();
				ƣ��_box.setBounds(10+60+110+110+440, 33+450, 20, 20);
				ƣ��_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ƣ��_box.isSelected()) {
							if(!name.getText().contains("ƣ��")) {
								name.setText(name.getText()+" ƣ��");
							}
						}else {
							if(name.getText().contains("ƣ��")) {
								name.setText(name.getText().replace("ƣ��", ""));
							}
						}
						
					}
				});
				this.add(ƣ��);
				this.add(ƣ��_box);	
				//copy tab
				JLabel ����= new JLabel("����:");  
				����.setForeground(Color.WHITE);
				����.setBounds(10+110+110+440, 20+475, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110+440, 33+475, 20, 20);
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
				����.setBounds(10+110+110+440, 20+500, 100, 50);
				JCheckBox ����_box= new JCheckBox();
				����_box.setBounds(10+60+110+110+440, 33+500, 20, 20);
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