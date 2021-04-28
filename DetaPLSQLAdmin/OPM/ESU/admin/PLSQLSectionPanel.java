package OPM.ESU.admin;
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
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import ME.APM.VSQ.App;
import MVQ.slider.DetaSlider;

public class PLSQLSectionPanel extends JPanel implements MouseListener, KeyListener, ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID= 1L;
	public String[] tabNames= {"��ҩ����", "���ݷ���", "��������", "��������",
			"���Ŷݼ�", "��ҽ�ڿ�", "��ҽ��������", "��ҽ���",
			"�ż�����", "��ҽ��ֳ", "��ҽ����", "��ҽ����",
			"�����", "��ҽ����", "��ҩ����", "�༭ҳ",
			"����ɭ���ڿ�","��ٿ�","�п�","�����","��Ⱦ��","��������",
			"�����","�����","�����","�ִ�����","��ҽѧ","������","��ҽ����","�Ŵ�ѧ"};
	public JCheckBox jlabel_box[];
	public boolean[] tabNamesHook= new boolean[30];
	public boolean isConfig= true;
	public JCheckBox jlabel_end_boxs;
	public JCheckBox jlabel_end_boxs1;
	public JCheckBox jlabel_end_boxs2;
	public JCheckBox jlabel_end_boxs3;
	public JCheckBox jlabel_peizhi_di25;
	public JTextPane jTextPane;
	public JCheckBox jlabel_peizhi_di2511;
	@SuppressWarnings("unused")
	private JCheckBox jlabel_peizhi_di2512;
	@SuppressWarnings("unused")
	private JCheckBox jlabel_peizhi_di2513;
//	private JComponent jlabelpeizhi2255;
//	private JComponent jlabelpeizhi2256;
//	private JComponent jlabelpeizhi2257;
	@SuppressWarnings("unused")
	private JCheckBox jlabel_peizhi_di2515;
    private JCheckBox jlabel_end_boxs31;
	private App appInThisClass;
	public PLSQLSectionPanel(App app){
		appInThisClass= app;
		jlabel_box= new JCheckBox[30];
		this.setLayout(null);
		this.setBounds(0, 0, 800, 600);
		this.setBackground(Color.BLACK);
		//copy tab
		JLabel jlabel= new JLabel("��ȡ���ݿ�"+ ":");  
		jlabel.setForeground(Color.white);
		jlabel.setBounds(10+ 0* 150, 20+ 25* 0, 100, 50);
		JCheckBox jlabel_end_box= new JCheckBox();
		jlabel_end_box.setBounds(10+ 85+ 0* 150, 33+ 25* 0, 20, 20);
		jlabel_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(jlabel_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {

					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {

					}
				}
				
			}
		});
		this.add(jlabel);
		this.add(jlabel_end_box);	
		
		JLabel jlabel1 = new JLabel("��ȡTXT"+ ":");  
		jlabel1.setForeground(Color.white);
		jlabel1.setBounds(10 + 1* 150, 20+ 25* 0, 100, 50);
		JCheckBox jlabel1_end_box= new JCheckBox();
		jlabel1_end_box.setBounds(10+ 85+ 1* 150, 33+ 25* 0, 20, 20);
		jlabel1_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(jlabel1_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
				
			}
		});
		this.add(jlabel1);
		this.add(jlabel1_end_box);	
		
		//�й��ɵ�01���ֺ�׺�һ��Ժ�����Ż�. ������
		JLabel jlabel10 = new JLabel("�����"+ ":");  
		jlabel10.setForeground(Color.white);
		jlabel10.setBounds(10 + 0* 150, 20+ 25* 1, 100, 50);
		JCheckBox jlabel10_end_box= new JCheckBox();
		jlabel10_end_box.setBounds(10+ 85+ 0* 150, 33+ 25* 1, 20, 20);
		jlabel10_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(jlabel10_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
				
			}
		});
		this.add(jlabel10);
		this.add(jlabel10_end_box);	
		
		JLabel jlabel11= new JLabel("����ORM"+ ":");  
		jlabel11.setForeground(Color.white);
		jlabel11.setBounds(10 + 1* 150, 20+ 25* 1, 100, 50);
		JCheckBox jlabel11_end_box= new JCheckBox();
		jlabel11_end_box.setBounds(10+ 85+ 1* 150, 33+ 25* 1, 20, 20);
		jlabel11_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(jlabel11_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
				
			}
		});
		this.add(jlabel11);
		this.add(jlabel11_end_box);	
		
		
		JLabel jlabel21 = new JLabel("��д����ģʽ"+ ":");  
		jlabel21.setForeground(Color.white);
		jlabel21.setBounds(10 + 2* 150, 20+ 25* 0, 100, 50);
		JCheckBox jlabel21_end_box= new JCheckBox();
		jlabel21_end_box.setBounds(10+ 85+ 2* 150, 33+ 25* 0, 20, 20);
		jlabel21_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(jlabel21_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
				
			}
		});
		this.add(jlabel21);
		this.add(jlabel21_end_box);	
		
		JLabel jlabel22 = new JLabel("ҽѧ����޸�"+ ":");  
		jlabel22.setForeground(Color.white);
		jlabel22.setBounds(10 + 2* 150, 20+ 25* 1, 100, 50);
		JCheckBox jlabel22_end_box= new JCheckBox();
		jlabel22_end_box.setBounds(10+ 85+ 2* 150, 33+ 25* 1, 20, 20);
		jlabel22_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(jlabel22_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
				
			}
		});
		this.add(jlabel22);
		this.add(jlabel22_end_box);	
		
		JLabel jlabel30 = new JLabel("Ԫ������"+ ":");  
		jlabel30.setForeground(Color.white);
		jlabel30.setBounds(10 + 0* 150, 20+ 25* 2, 100, 50);
		JCheckBox jlabel30_end_box= new JCheckBox();
		jlabel30_end_box.setBounds(10+ 85+ 0* 150, 33+ 25* 2, 20, 20);
		jlabel30_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(jlabel30_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
			}
		});
		this.add(jlabel30);
		this.add(jlabel30_end_box);	
		
		JLabel jlabel31= new JLabel("Ԫ������"+ ":");  
		jlabel31.setForeground(Color.white);
		jlabel31.setBounds(10+ 1* 150, 20+ 25* 2, 100, 50);
		JCheckBox jlabel31_end_box= new JCheckBox();
		jlabel31_end_box.setBounds(10+ 85+ 1* 150, 33+ 25* 2, 20, 20);
		jlabel31_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(jlabel31_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
			}
		});
		this.add(jlabel31);
		this.add(jlabel31_end_box);	
		
		JLabel jlabel32= new JLabel("Ԫ������"+ ":");  
		jlabel32.setForeground(Color.white);
		jlabel32.setBounds(10+ 2* 150, 20+ 25* 2, 100, 50);
		JCheckBox jlabel32_end_box= new JCheckBox();
		jlabel32_end_box.setBounds(10+ 85+ 2* 150, 33+ 25* 2, 20, 20);
		jlabel32_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(jlabel32_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
			}
		});
		this.add(jlabel32);
		this.add(jlabel32_end_box);	
		
		//�ȱ�ģʽ
		JLabel jlabel40= new JLabel("�ȱ�ģʽ"+ ":");  
		jlabel40.setForeground(Color.white);
		jlabel40.setBounds(10+ 0* 150, 20+ 25* 3, 100, 50);
		JCheckBox jlabel40_end_box= new JCheckBox();
		jlabel40_end_box.setBounds(10+ 85+ 0* 150, 33+ 25* 3, 20, 20);
		jlabel40_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(jlabel40_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
			}
		});
		this.add(jlabel40);
		this.add(jlabel40_end_box);	
		//binlog
		JLabel Binlog= new JLabel("Binlog"+ ":");  
		Binlog.setForeground(Color.white);
		Binlog.setBounds(10+ 0* 150, 20+ 25* 4, 100, 50);
		JCheckBox Binlog_end_box= new JCheckBox();
		Binlog_end_box.setBounds(10+ 85+ 0* 150, 33+ 25* 4, 20, 20);
		Binlog_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(Binlog_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
			}
		});
		this.add(Binlog);
		this.add(Binlog_end_box);	
		//rollbackģʽ
		JLabel Rollback= new JLabel("Rollback"+ ":");  
		Rollback.setForeground(Color.white);
		Rollback.setBounds(10+ 0* 150, 20+ 25* 5, 100, 50);
		JCheckBox Rollback_end_box= new JCheckBox();
		Rollback_end_box.setBounds(10+ 85+ 0* 150, 33+ 25* 5, 20, 20);
		Rollback_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(Rollback_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
			}
		});
		this.add(Rollback);
		this.add(Rollback_end_box);	
		//����ģʽ
		JLabel ����ģʽ= new JLabel("����ģʽ"+ ":");  
		����ģʽ.setForeground(Color.white);
		����ģʽ.setBounds(10+ 0* 150, 20+ 25* 6, 100, 50);
		JCheckBox ����ģʽ_end_box= new JCheckBox();
		����ģʽ_end_box.setBounds(10+ 85+ 0* 150, 33+ 25* 6, 20, 20);
		����ģʽ_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(����ģʽ_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
			}
		});
		this.add(����ģʽ);
		this.add(����ģʽ_end_box);	
		//queryģʽ
		JLabel Queryģʽ= new JLabel("Queryģʽ"+ ":");  
		Queryģʽ.setForeground(Color.white);
		Queryģʽ.setBounds(10+ 0* 150, 20+ 25* 7, 100, 50);
		JCheckBox Queryģʽ_end_box= new JCheckBox();
		Queryģʽ_end_box.setBounds(10+ 85+ 0* 150, 33+ 25* 7, 20, 20);
		Queryģʽ_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(Queryģʽ_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
			}
		});
		this.add(Queryģʽ);
		this.add(Queryģʽ_end_box);	
		//�쳣��¼ģʽ
		JLabel �쳣��¼ģʽ= new JLabel("�쳣��¼ģʽ"+ ":");  
		�쳣��¼ģʽ.setForeground(Color.white);
		�쳣��¼ģʽ.setBounds(10+ 0* 150, 20+ 25* 8, 100, 50);
		JCheckBox �쳣��¼ģʽ_end_box= new JCheckBox();
		�쳣��¼ģʽ_end_box.setBounds(10+ 85+ 0* 150, 33+ 25* 8, 20, 20);
		�쳣��¼ģʽ_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(�쳣��¼ģʽ_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
			}
		});
		this.add(�쳣��¼ģʽ);
		this.add(�쳣��¼ģʽ_end_box);	
		//����ģʽ
		
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