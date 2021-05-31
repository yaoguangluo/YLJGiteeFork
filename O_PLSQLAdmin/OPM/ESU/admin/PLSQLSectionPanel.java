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
import javax.swing.JTextField;
import javax.swing.JTextPane;

import ME.APM.VSQ.App;

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
	@SuppressWarnings("unused")
	private App appInThisClass;
	public PLSQLSectionPanel(App app){
		appInThisClass= app;
		jlabel_box= new JCheckBox[30];
		this.setLayout(null);
		this.setBounds(0, 0, 800, 600);
		this.setBackground(Color.BLACK);
		//copy tab
		JLabel ��ȡ���ݿ�= new JLabel("��ȡ���ݿ�"+ ":");  
		��ȡ���ݿ�.setForeground(Color.white);
		��ȡ���ݿ�.setBounds(10+ 0* 150, 20+ 25* 0, 100, 50);
		JCheckBox ��ȡ���ݿ�_end_box= new JCheckBox();
		��ȡ���ݿ�_end_box.setBounds(10+ 85+ 0* 150, 33+ 25* 0, 20, 20);
		��ȡ���ݿ�_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(��ȡ���ݿ�_end_box.isSelected()) {
					appInThisClass.bootDBInBaseWay= true;
				}else {
					appInThisClass.bootDBInBaseWay= false;
				}

			}
		});
		this.add(��ȡ���ݿ�);
		this.add(��ȡ���ݿ�_end_box);	
		
		JLabel ��ȡTXT = new JLabel("��ȡTXT"+ ":");  
		��ȡTXT.setForeground(Color.white);
		��ȡTXT.setBounds(10 + 1* 150, 20+ 25* 0, 100, 50);
		JCheckBox ��ȡTXT_end_box= new JCheckBox();
		��ȡTXT_end_box.setBounds(10+ 85+ 1* 150, 33+ 25* 0, 20, 20);
		��ȡTXT_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(��ȡTXT_end_box.isSelected()) {
						appInThisClass.bootDBInTXTWay= true;
				}else {
					appInThisClass.bootDBInTXTWay= false;
				}
				
			}
		});
		this.add(��ȡTXT);
		this.add(��ȡTXT_end_box);	
		
		//�й��ɵ�01���ֺ�׺�һ��Ժ�����Ż�. ������
		JLabel ����� = new JLabel("�����"+ ":");  
		�����.setForeground(Color.white);
		�����.setBounds(10 + 0* 150, 20+ 25* 1, 100, 50);
		JCheckBox �����_end_box= new JCheckBox();
		�����_end_box.setBounds(10+ 85+ 0* 150, 33+ 25* 1, 20, 20);
		�����_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(�����_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
				
			}
		});
		this.add(�����);
		this.add(�����_end_box);	
		
		JLabel ����ORM= new JLabel("����ORM"+ ":");  
		����ORM.setForeground(Color.white);
		����ORM.setBounds(10 + 1* 150, 20+ 25* 1, 100, 50);
		JCheckBox ����ORM_end_box= new JCheckBox();
		����ORM_end_box.setBounds(10+ 85+ 1* 150, 33+ 25* 1, 20, 20);
		����ORM_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(����ORM_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
				
			}
		});
		this.add(����ORM);
		this.add(����ORM_end_box);	
		
		
		JLabel ��ȡREST = new JLabel("��ȡRESTģʽ"+ ":");  
		��ȡREST.setForeground(Color.white);
		��ȡREST.setBounds(10 + 2* 150, 20+ 25* 0, 100, 50);
		JCheckBox ��ȡREST_end_box= new JCheckBox();
		��ȡREST_end_box.setBounds(10+ 85+ 2* 150, 33+ 25* 0, 20, 20);
		��ȡREST_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(��ȡREST_end_box.isSelected()) {
					appInThisClass.bootDBInWebWay= true;
				}else {
					appInThisClass.bootDBInWebWay= false;
				}
			}
		});
		this.add(��ȡREST);
		this.add(��ȡREST_end_box);	
		
		JLabel ҽѧ����޸� = new JLabel("ҽѧ����޸�"+ ":");  
		ҽѧ����޸�.setForeground(Color.white);
		ҽѧ����޸�.setBounds(10 + 2* 150, 20+ 25* 1, 100, 50);
		JCheckBox ҽѧ����޸�_end_box= new JCheckBox();
		ҽѧ����޸�_end_box.setBounds(10+ 85+ 2* 150, 33+ 25* 1, 20, 20);
		ҽѧ����޸�_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(ҽѧ����޸�_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
				
			}
		});
		this.add(ҽѧ����޸�);
		this.add(ҽѧ����޸�_end_box);	
		
		JLabel Ԫ������ = new JLabel("Ԫ������"+ ":");  
		Ԫ������.setForeground(Color.white);
		Ԫ������.setBounds(10 + 0* 150, 20+ 25* 2, 100, 50);
		JCheckBox Ԫ������_end_box= new JCheckBox();
		Ԫ������_end_box.setBounds(10+ 85+ 0* 150, 33+ 25* 2, 20, 20);
		Ԫ������_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(Ԫ������_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
			}
		});
		this.add(Ԫ������);
		this.add(Ԫ������_end_box);	
		
		JLabel Ԫ������= new JLabel("Ԫ������"+ ":");  
		Ԫ������.setForeground(Color.white);
		Ԫ������.setBounds(10+ 1* 150, 20+ 25* 2, 100, 50);
		JCheckBox Ԫ������_end_box= new JCheckBox();
		Ԫ������_end_box.setBounds(10+ 85+ 1* 150, 33+ 25* 2, 20, 20);
		Ԫ������_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(Ԫ������_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
			}
		});
		this.add(Ԫ������);
		this.add(Ԫ������_end_box);	
		
		JLabel Ԫ������= new JLabel("Ԫ������"+ ":");  
		Ԫ������.setForeground(Color.white);
		Ԫ������.setBounds(10+ 2* 150, 20+ 25* 2, 100, 50);
		JCheckBox Ԫ������_end_box= new JCheckBox();
		Ԫ������_end_box.setBounds(10+ 85+ 2* 150, 33+ 25* 2, 20, 20);
		Ԫ������_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(Ԫ������_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
			}
		});
		this.add(Ԫ������);
		this.add(Ԫ������_end_box);	
		
		//�ȱ�ģʽ
		JLabel �ȱ�ģʽ= new JLabel("�ȱ�ģʽ"+ ":");  
		�ȱ�ģʽ.setForeground(Color.white);
		�ȱ�ģʽ.setBounds(10+ 0* 150, 20+ 25* 3, 100, 50);
		JCheckBox �ȱ�ģʽ_end_box= new JCheckBox();
		�ȱ�ģʽ_end_box.setBounds(10+ 85+ 0* 150, 33+ 25* 3, 20, 20);
		�ȱ�ģʽ_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(�ȱ�ģʽ_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
			}
		});
		this.add(�ȱ�ģʽ);
		this.add(�ȱ�ģʽ_end_box);	
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
		
		
		JLabel ��д����ģʽ = new JLabel("��д����ģʽ"+ ":");  
		��д����ģʽ.setForeground(Color.white);
		��д����ģʽ.setBounds(10+ 1* 150, 20+ 25* 3, 100, 50);
		JCheckBox ��д����ģʽ_end_box= new JCheckBox();
		��д����ģʽ_end_box.setBounds(10+ 85+ 1* 150, 33+ 25* 3, 20, 20);
		��д����ģʽ_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(��д����ģʽ_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
				
			}
		});
		this.add(��д����ģʽ);
		this.add(��д����ģʽ_end_box);	
		
		
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
		JLabel ����ģʽ= new JLabel("����ģʽ"+ ":");  
		����ģʽ.setForeground(Color.white);
		����ģʽ.setBounds(10+ 0* 150, 20+ 25* 9, 100, 50);
		JCheckBox ����ģʽ_end_box= new JCheckBox();
		����ģʽ_end_box.setBounds(10+ 85+ 0* 150, 33+ 25* 9, 20, 20);
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
		//WEBģʽ
		JLabel WEBģʽ= new JLabel("WEBģʽ"+ ":");  
		WEBģʽ.setForeground(Color.white);
		WEBģʽ.setBounds(10+ 0* 150, 20+ 25* 10, 100, 50);
		JCheckBox WEBģʽ_end_box= new JCheckBox();
		WEBģʽ_end_box.setBounds(10+ 85+ 0* 150, 33+ 25* 10, 20, 20);
		WEBģʽ_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(WEBģʽ_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
			}
		});
		this.add(WEBģʽ);
		this.add(WEBģʽ_end_box);	
		//������
		JLabel ������ģʽ= new JLabel("������ģʽ"+ ":");  
		������ģʽ.setForeground(Color.white);
		������ģʽ.setBounds(10+ 0* 150, 20+ 25* 11, 100, 50);
		JCheckBox ������ģʽ_end_box= new JCheckBox();
		������ģʽ_end_box.setBounds(10+ 85+ 0* 150, 33+ 25* 11, 20, 20);
		������ģʽ_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(������ģʽ_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
			}
		});
		this.add(������ģʽ);
		this.add(������ģʽ_end_box);	
		
		
		JLabel ���ݿ������ļ���ַ= new JLabel("���ݿ������ļ���ַ"+ ":");  
		���ݿ������ļ���ַ.setForeground(Color.white);
		���ݿ������ļ���ַ.setBounds(10+ 0* 150, 20+ 25* 13, 150, 50);
		
		JTextField ���ݿ������ļ���ַJTextField= new JTextField();
		���ݿ������ļ���ַJTextField.setBounds(10+ 0* 150+ 160, 20+ 25* 13, 550, 50);
		���ݿ������ļ���ַJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.dbConfigPath= ���ݿ������ļ���ַJTextField.getText().trim();
			}
		});
		���ݿ������ļ���ַJTextField.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				appInThisClass.dbConfigPath= ���ݿ������ļ���ַJTextField.getText().trim();
			}
			
		});
		���ݿ������ļ���ַJTextField.setText("C:/DBconfig.lyg");
		appInThisClass.dbConfigPath= "C:/DBconfig.lyg";
		this.add(���ݿ������ļ���ַ);
		this.add(���ݿ������ļ���ַJTextField);	
		
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