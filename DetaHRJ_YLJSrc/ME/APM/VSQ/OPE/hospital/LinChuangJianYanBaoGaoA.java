package ME.APM.VSQ.OPE.hospital;

import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Iterator;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import MVQ.button.DetaButton;
import MVQ.label.DetaIndexLabel;
import MVQ.label.DetaLabel;

public class LinChuangJianYanBaoGaoA extends JPanel implements MouseListener, KeyListener
, ActionListener, MouseMotionListener{
	//����׼����ҽѧ���鱨��ĵ�λ���и�ʽ�� �淶��,���¿�ʼ 20210401
	//������
	public List<DetaLabel> jFrameList;
	public boolean target= false;
	private static final long serialVersionUID = 1L;
	public LinChuangJianYanBaoGaoA(JTextPane name, List<DetaLabel> jFrameListRefer){
		this.setLayout(null);
		this.setBounds(0, 0, 1180, 610);
		this.setBackground(Color.BLACK);
		this.jFrameList= jFrameListRefer;
		this.addMouseMotionListener(this);
		//1���� ������� �ұ������
		JLabel ��Ͻ��= new JLabel("��Ͻ��:");  
		��Ͻ��.setForeground(Color.WHITE);
		��Ͻ��.setBounds(10, 20+ 300+ 90, 100, 20);
		JTextField ��Ͻ��_box= new JTextField();
		��Ͻ��_box.setBounds(10, 33+ 325+ 90, 1070, 120);
		��Ͻ��_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
			}
		});
		this.add(��Ͻ��);
		this.add(��Ͻ��_box);	
		
		DetaButton ���= new DetaButton ("���", 100,50, Color.gray);	
		//JButton ���= new JButton("���");  
		���.setForeground(Color.black);
		���.setBounds(10+70, 20+ 300+ 90, 100, 30);
		���.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				��Ͻ��_box.removeAll();
			}
		});
		this.add(���);	

		DetaButton ��ӡ= new DetaButton ("��ӡ", 100,50, Color.red);	
		//JButton ��ӡ= new JButton("��ӡ");  
		��ӡ.setForeground(Color.black);
		��ӡ.setBounds(10+70+120, 20+ 300+ 90, 100, 30);
		��ӡ.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				//��Ͻ��_box.removeAll();
			}
		});
		this.add(��ӡ);	


		DetaButton �༭ҳ= new DetaButton ("�༭ҳ", 100,50, Color.orange);	
		//JButton �༭ҳ= new JButton("�༭ҳ");  
		�༭ҳ.setForeground(Color.black);
		�༭ҳ.setBounds(10+ 70+ 120+ 120, 20+ 300+ 90, 100, 30);
		�༭ҳ.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				//��Ͻ��_box.removeAll();
			}
		});
		this.add(�༭ҳ);

		DetaButton ����= new DetaButton ("����", 100,50, Color.blue);	
		//JButton ����= new JButton("����");  
		����.setForeground(Color.black);
		����.setBounds(10+ 70+ 120+ 120+ 120, 20+ 300+ 90, 100, 30);
		����.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				//��Ͻ��_box.removeAll();
			}
		});
		this.add(����);	

		DetaButton �Ƽ�����= new DetaButton ("�Ƽ�����", 100,50, Color.pink);	
		//	JButton �Ƽ�����= new JButton("�Ƽ�����");  
		�Ƽ�����.setForeground(Color.black);
		�Ƽ�����.setBounds(10+ 70+ 120+ 120+ 120+ 120, 20+ 300+ 90, 100, 30);
		�Ƽ�����.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				//��Ͻ��_box.removeAll();
			}
		});
		this.add(�Ƽ�����);	

		DetaButton ����ͼƬ= new DetaButton ("����ͼƬ", 100,50, Color.pink);	
		//	JButton �Ƽ�����= new JButton("�Ƽ�����");  
		����ͼƬ.setForeground(Color.black);
		����ͼƬ.setBounds(10+ 70+ 120+ 120+ 120+ 120+ 120, 20+ 300+ 90, 100, 30);
		����ͼƬ.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				//��Ͻ��_box.removeAll();
			}
		});
		this.add(����ͼƬ);	

		DetaButton ɨ��ͼƬ= new DetaButton ("ɨ��ͼƬ", 100,50, Color.pink);	
		//	JButton �Ƽ�����= new JButton("�Ƽ�����");  
		ɨ��ͼƬ.setForeground(Color.black);
		ɨ��ͼƬ.setBounds(10+ 70+ 120+ 120+ 120+ 120+ 120+ 120, 20+ 300+ 90, 100, 30);
		ɨ��ͼƬ.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				//��Ͻ��_box.removeAll();
			}
		});
		this.add(ɨ��ͼƬ);	

		DetaButton �������ձ���= new DetaButton ("�������ձ���", 100,50, Color.pink);	
		//	JButton �Ƽ�����= new JButton("�Ƽ�����");  
		�������ձ���.setForeground(Color.black);
		�������ձ���.setBounds(10+ 70+ 120+ 120+ 120+ 120+ 120+ 120+ 120, 20+ 300+ 90, 150, 30);
		�������ձ���.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				//��Ͻ��_box.removeAll();
			}
		});
		this.add(�������ձ���);	

		//index
		JLabel ����= new JLabel("���� : ");  
		����.setForeground(Color.WHITE);
		����.setBounds(0, 1, 35, 25);  
		this.add(����);

		String ����s= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i= 0; i< ����s.length(); i++) {
			DetaIndexLabel ����temp= new DetaIndexLabel(" "+ ����s.charAt(i)+ " ", jFrameList);  
			����temp.setForeground(Color.WHITE);
			����temp.setBounds(10+ 25*(i+ 1), 1, 25, 25);  
			����temp.setIndex(""+ ����s.charAt(i));
			this.add(����temp);
		}
			
		//copy tab
		DetaLabel baiDanBai= new DetaLabel("�׵���alb:");  
		baiDanBai.setForeground(Color.WHITE);
		baiDanBai.setBounds(10, 32+ 25*0, 100, 25);  
		baiDanBai.indexString= "BDAL";
		baiDanBai.setTag("��ҽ���飺�׵���ALB->�ٴ�����:�������߲��۲�ָ���������߲��۲�ָ��->ʵ���Ҽ��:Ѫ3350-4765mg/dl�Լ�Һ13.4-23.7mg/dl", true);
		jFrameList.add(baiDanBai);
		JTextField baiDanBai_box= new JTextField();
		baiDanBai_box.setBounds(10+ 110, 33+ 0, 80, 20);
		baiDanBai_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				String temp= baiDanBai_box.getText();
				double temp_double= Double.valueOf(temp.isEmpty()?"0":temp);
				String report= "�������߲��۲�ָ���������߲��۲�ָ���쳣";
				if(temp_double< 4765&& temp_double> 3350) {
					��Ͻ��_box.setText(��Ͻ��_box.getText().contains(report)
							? ��Ͻ��_box.getText(): ��Ͻ��_box.getText()+ report);	
				}else {
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(report, ""));	
				}	
			}
		});
		this.add(baiDanBai);
		this.add(baiDanBai_box);	

		DetaLabel �Ҹ����԰�= new DetaLabel("�Ҹ����԰�hbcab:");
		�Ҹ����԰�.setForeground(Color.WHITE);
		�Ҹ����԰�.indexString= "YGLDBHBCAB";
		�Ҹ����԰�.setBounds(10, 32+ 25*1, 100, 25);
		�Ҹ����԰�.setTag("��ҽ���飺�Ҹ����԰�HbcAb->�ٴ�����:->ʵ���Ҽ��:����", true);
		jFrameList.add(�Ҹ����԰�);
		JTextField �Ҹ����԰�_box= new JTextField();
		�Ҹ����԰�_box.setBounds(10+ 110, 33+ 25*1, 80, 20);
		�Ҹ����԰�_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				String temp= �Ҹ����԰�_box.getText();
				//double temp_double= Double.valueOf(temp);
				String report= "�Ҹ�����";
				if(temp.contains("��")) {
					��Ͻ��_box.setText(��Ͻ��_box.getText().contains(report)
							? ��Ͻ��_box.getText(): ��Ͻ��_box.getText()+ report);	
				}else {
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(report, ""));	
				}	
			}
		});
		this.add(�Ҹ����԰�);
		this.add(�Ҹ����԰�_box);	
		DetaLabel ������ʵ��= new DetaLabel("������ʵ��:");
		������ʵ��.indexString= "TNLSY";
		������ʵ��.setForeground(Color.WHITE);
		������ʵ��.setBounds(10, 32+ 25*2, 100, 25);
		jFrameList.add(������ʵ��);
		JTextField ������ʵ��_box= new JTextField();
		������ʵ��_box.setBounds(10+ 110, 33+ 25*2, 80, 20);
		������ʵ��_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				String temp= ������ʵ��_box.getText();
				double temp_double= Double.valueOf(temp);
				String report= "���򲡼�����ָ���쳣";
				if(temp_double> 140&& temp_double< 50) {
					��Ͻ��_box.setText(��Ͻ��_box.getText().contains(report)
							? ��Ͻ��_box.getText(): ��Ͻ��_box.getText()+ report);	
				}else {
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(report, ""));	
				}	
			}
		});
		this.add(������ʵ��);
		this.add(������ʵ��_box);	

		DetaLabel ���澵��= new DetaLabel("���澵��:");
		���澵��.setForeground(Color.WHITE);
		���澵��.setBounds(10, 32+ 25* 3, 100, 20);jFrameList.add(���澵��);
		���澵��.indexString= "MCJ";
		JTextField ���澵��_box= new JTextField();
		���澵��_box.setBounds(10+ 110, 33+ 25* 3, 80, 20);
		���澵��_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				String temp= ���澵��_box.getText();
				//double temp_double= Double.valueOf(temp);
				String report= "�����Ⱦ����";
				if(temp.contains("��")) {
					��Ͻ��_box.setText(��Ͻ��_box.getText().contains(report)
							? ��Ͻ��_box.getText(): ��Ͻ��_box.getText()+ report);	
				}else {
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(report, ""));	
				}	
			}
		});
		this.add(���澵��);
		this.add(���澵��_box);	

		DetaLabel �Բ�֧ԭ��= new DetaLabel("�Բ�֧ԭ���⣨uu��:");
		�Բ�֧ԭ��.setForeground(Color.WHITE);
		�Բ�֧ԭ��.setBounds(10, 32+ 25*4, 100, 20);jFrameList.add(�Բ�֧ԭ��);
		�Բ�֧ԭ��.indexString= "XBZYTU";
		JTextField �Բ�֧ԭ��_box= new JTextField();
		�Բ�֧ԭ��_box.setBounds(10+ 110, 33+ 25*4, 80, 20);
		�Բ�֧ԭ��_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				String temp= �Բ�֧ԭ��_box.getText();
				//double temp_double= Double.valueOf(temp);
				String report= "�Բ�֧ԭ���Ⱦ����";
				if(temp.contains("��")) {
					��Ͻ��_box.setText(��Ͻ��_box.getText().contains(report)
							? ��Ͻ��_box.getText(): ��Ͻ��_box.getText()+ report);	
				}else {
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(report, ""));	
				}	
			}
		});
		this.add(�Բ�֧ԭ��);
		this.add(�Բ�֧ԭ��_box);	

		DetaLabel ���ܶ�֬����= new DetaLabel("���ܶ�֬����ldl-c:");  
		���ܶ�֬����.setForeground(Color.WHITE);
		���ܶ�֬����.setBounds(10, 32+ 25*5, 100, 20);jFrameList.add(���ܶ�֬����);
		���ܶ�֬����.indexString= "DMZBLDLC";
		JTextField ���ܶ�֬����_box= new JTextField();
		���ܶ�֬����_box.setBounds(10+ 110, 33+ 25*5, 80, 20);
		���ܶ�֬����_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				String temp=���ܶ�֬����_box.getText();
				double temp_double= Double.valueOf(temp);
				String report= "ͬѪ���ܵ��̴��ⶨָ���쳣";
				if(temp_double> 120&& temp_double< 40) {
					��Ͻ��_box.setText(��Ͻ��_box.getText().contains(report)
							? ��Ͻ��_box.getText(): ��Ͻ��_box.getText()+ report);	
				}else {
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(report, ""));	
				}	
			}
		});
		this.add(���ܶ�֬����);
		this.add(���ܶ�֬����_box);	

		//7
		DetaLabel Ѫ��= new DetaLabel("Ѫ��nh3:");  
		Ѫ��.setForeground(Color.WHITE);
		Ѫ��.setBounds(10, 32+ 25*6, 100, 20);jFrameList.add(Ѫ��);
		Ѫ��.indexString= "XANH";
		JTextField Ѫ��_box= new JTextField();
		Ѫ��_box.setBounds(10+ 110, 33+ 25*6, 80, 20);
		Ѫ��_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				String temp= Ѫ��_box.getText();
				double temp_double= Double.valueOf(temp);
				String report= "���ߣ����ڸλ��ԣ���֢���ף��ݿˡ�";
				if(temp_double< 100) {
					��Ͻ��_box.setText(��Ͻ��_box.getText().contains(report)
							? ��Ͻ��_box.getText(): ��Ͻ��_box.getText()+ report);	
				}else {
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(report, ""));	
				}	
			}
		});
		this.add(Ѫ��);
		this.add(Ѫ��_box);	
		//8
		DetaLabel �ȵ��ؿ���= new DetaLabel("�ȵ��ؿ���ins-ab:");  
		�ȵ��ؿ���.setForeground(Color.WHITE);
		�ȵ��ؿ���.setBounds(10, 32+ 25*7, 100, 20);jFrameList.add(�ȵ��ؿ���);
		�ȵ��ؿ���.indexString= "YDSKTINSAB";
		JTextField �ȵ��ؿ���_box= new JTextField();
		�ȵ��ؿ���_box.setBounds(10+ 110, 33+ 25*7, 80, 20);
		�ȵ��ؿ���_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				String temp= �ȵ��ؿ���_box.getText();
				double temp_double= Double.valueOf(temp);
				String report= "�ȵ��صֿ�ָ���쳣";
				if(temp_double> 10) {
					��Ͻ��_box.setText(��Ͻ��_box.getText().contains(report)
							? ��Ͻ��_box.getText(): ��Ͻ��_box.getText()+ report);	
				}else {
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(report, ""));	
				}	
			}
		});
		this.add(�ȵ��ؿ���);
		this.add(�ȵ��ؿ���_box);	
		//9
		DetaLabel ����= new DetaLabel("�أ��򣩼أ���:");  
		����.setForeground(Color.WHITE);
		����.setBounds(10, 32+ 25*8, 100, 20);jFrameList.add(����);
		����.indexString= "KAJN";
		JTextField ����_box= new JTextField();
		����_box.setBounds(10+ 110, 33+ 25*8, 80, 20);
		����_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				String temp= ����_box.getText();
				double temp_double= Double.valueOf(temp);
				String report= "��ʹ������ʱ�������й���࣬ԭ����ȩ��ͪ����֢�������й���ӡ�ָ���쳣";
				if(temp_double> 100&& temp_double< 25) {
					��Ͻ��_box.setText(��Ͻ��_box.getText().contains(report)
							? ��Ͻ��_box.getText(): ��Ͻ��_box.getText()+ report);	
				}else {
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(report, ""));	
				}	
			}
		});
		this.add(����);
		this.add(����_box);	
		//10
		DetaLabel ��= new DetaLabel("��ip:");  
		��.setForeground(Color.WHITE);
		��.setBounds(10, 32+ 25*9, 100, 20);jFrameList.add(��);
		��.indexString= "LIP";
		JTextField ��_box= new JTextField();
		��_box.setBounds(10+ 110, 33+ 25*9, 80, 20);
		��_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				String temp= ��_box.getText();
				double temp_double= Double.valueOf(temp.isEmpty()?"0":temp);
				String reportz= "�����ߣ����ڼ�״���ٻ��ܼ��ˣ������������ܲ�ȫ����֢�������������������ڡ�";
				String reportj= "�׽��ͣ����ڼ׿�����л�����ж���¥������ǲ���������˥�ߣ����ڸ�к�����ղ�����";

				if(temp_double> 5) {
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(reportz, ""));	
					��Ͻ��_box.setText(��Ͻ��_box.getText().contains(reportz)
							? ��Ͻ��_box.getText(): ��Ͻ��_box.getText()+ reportz);	
				}else if(temp_double< 2.5) {	
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(reportj, ""));	
					��Ͻ��_box.setText(��Ͻ��_box.getText().contains(reportj)
							? ��Ͻ��_box.getText(): ��Ͻ��_box.getText()+ reportj);	
				}else {
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(reportz, ""));	
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(reportj, ""));		
				}	
			}
		});
		this.add(��);
		this.add(��_box);	
		//11
		DetaLabel ����= new DetaLabel("�ȣ����ȣ���:");  
		����.setForeground(Color.WHITE);
		����.setBounds(10, 32+ 25*10, 100, 20);jFrameList.add(����);
		����.indexString= "CLN";
		JTextField ����_box= new JTextField();
		����_box.setBounds(10+ 110, 33+ 25*10, 80, 20);
		����_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				String temp= ����_box.getText();
				double temp_double= Double.valueOf(temp);
				String report= "һ������£����������ȱ������ƽ�⣬����������NaCL��KCL�����ȱ����Ƹ�"
						+ "���෴�����������������Σ����Ʊ����ȸߡ�";
				if(temp_double> 250&& temp_double< 110) {
					��Ͻ��_box.setText(��Ͻ��_box.getText().contains(report)
							? ��Ͻ��_box.getText(): ��Ͻ��_box.getText()+ report);	
				}else {
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(report, ""));	
				}	

			}
		});
		this.add(����);
		this.add(����_box);	
		//12
		DetaLabel ���Ƶ���= new DetaLabel("���Ƶ���ttnt:");  
		���Ƶ���.setForeground(Color.WHITE);
		���Ƶ���.setBounds(10, 32+ 25*11, 100, 20);jFrameList.add(���Ƶ���);
		���Ƶ���.indexString= "JGDBTTNT";
		JTextField ���Ƶ���_box= new JTextField();
		���Ƶ���_box.setBounds(10+ 110, 33+ 25*11, 80, 20);
		���Ƶ���_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				String temp= ���Ƶ���_box.getText();
				double temp_double= Double.valueOf(temp);
				String report= "����ļ�����������ָ�꣬ͬʱ�������жϲ��ȶ��Ľ�ʹ����Ԥ���һ����Ҫָ���쳣";
				if(temp_double>= 0.05) {
					��Ͻ��_box.setText(��Ͻ��_box.getText().contains(report)
							? ��Ͻ��_box.getText(): ��Ͻ��_box.getText()+ report);	
				}else {
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(report, ""));	
				}	
			}
		});
		this.add(���Ƶ���);
		this.add(���Ƶ���_box);	
		//13
		DetaLabel ����= new DetaLabel("�ƣ����ƣ���:");  
		����.setForeground(Color.WHITE);
		����.setBounds(10, 32+ 25*12, 100, 20);jFrameList.add(����);
		����.indexString= "NA";
		JTextField ����_box= new JTextField();
		����_box.setBounds(10+ 110, 33+ 25*12, 80, 20);
		����_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				String temp= ����_box.getText();
				double temp_double= Double.valueOf(temp);
				String reportz= "�ж��Ƿ��д����εĶ�ʧ���ж�Ż�£���к���ߵĵ����ƽ�⣬������ϵͳ�������Գ�Ѫ����֢����������С�������𺦻����������ࡣ";
				String reportj= "���Ƶ͡�";

				if(temp_double> 260) {
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(reportz, ""));	
					��Ͻ��_box.setText(��Ͻ��_box.getText().contains(reportz)
							? ��Ͻ��_box.getText(): ��Ͻ��_box.getText()+ reportz);	
				}else if(temp_double< 130) {	
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(reportj, ""));	
					��Ͻ��_box.setText(��Ͻ��_box.getText().contains(reportj)
							? ��Ͻ��_box.getText(): ��Ͻ��_box.getText()+ reportj);	
				}else {
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(reportz, ""));	
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(reportj, ""));		
				}	
			}
		});
		this.add(����);
		this.add(����_box);	
		//14
		DetaLabel ��������ø= new DetaLabel("��������øalp:");  
		��������ø.setForeground(Color.WHITE);
		��������ø.setBounds(10, 32+ 25*13, 100, 20);jFrameList.add(��������ø);
		��������ø.indexString= "JXLSMALP";
		JTextField ��������ø_box= new JTextField();
		��������ø_box.setBounds(10+ 110, 33+ 25*13, 80, 20);
		��������ø_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				String temp= ��������ø_box.getText();
				double temp_double= Double.valueOf(temp);
				String reportz= "��������ø���ߣ������ڸΰ�����Ӳ���������Ի��㣬�����Ի����͸��ף���ϸ���������ۼ������ͯ����";
				String reportj= "��������ø�͡�";

				if(temp_double> 110) {
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(reportz, ""));	
					��Ͻ��_box.setText(��Ͻ��_box.getText().contains(reportz)
							? ��Ͻ��_box.getText(): ��Ͻ��_box.getText()+ reportz);	
				}else if(temp_double< 20) {	
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(reportj, ""));	
					��Ͻ��_box.setText(��Ͻ��_box.getText().contains(reportj)
							? ��Ͻ��_box.getText(): ��Ͻ��_box.getText()+ reportj);	
				}else {
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(reportz, ""));	
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(reportj, ""));		
				}	
			}
		});
		this.add(��������ø);
		this.add(��������ø_box);	
		//
		addSecondColomns(��Ͻ��_box, jFrameList);
		addThirdColomns(��Ͻ��_box, jFrameList);
		addFourthColomns(��Ͻ��_box, jFrameList);
		addFifthColomns(��Ͻ��_box, jFrameList);
		this.validate();
	}
	private void addFifthColomns(JTextField ��Ͻ��_box, List<DetaLabel> jFrameList) {
		// TODO Auto-generated method stub
		//copy tab
		DetaLabel Ѫ��͸ѹѪosm= new DetaLabel("Ѫ��͸ѹѪosm:");  
		Ѫ��͸ѹѪosm.setForeground(Color.WHITE);
		Ѫ��͸ѹѪosm.setBounds(10+220*4, 32+ 0, 100, 20);jFrameList.add(Ѫ��͸ѹѪosm);
		Ѫ��͸ѹѪosm.indexString= "XSTYOM";
		JTextField Ѫ��͸ѹѪosm_box= new JTextField();
		Ѫ��͸ѹѪosm_box.setBounds(10+ 110+220*4, 33+ 0, 80, 20);
		Ѫ��͸ѹѪosm_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				String temp= Ѫ��͸ѹѪosm_box.getText();
				double temp_double= Double.valueOf(temp);
				String reportz= "��ӦѪ�����ʷ��Ӽ������������ߡ�";
				String reportj= "��ӦѪ�����ʷ��Ӽ������������͡�";

				if(temp_double> 310) {
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(reportz, ""));	
					��Ͻ��_box.setText(��Ͻ��_box.getText().contains(reportz)
							? ��Ͻ��_box.getText(): ��Ͻ��_box.getText()+ reportz);	
				}else if(temp_double< 280) {	
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(reportj, ""));	
					��Ͻ��_box.setText(��Ͻ��_box.getText().contains(reportj)
							? ��Ͻ��_box.getText(): ��Ͻ��_box.getText()+ reportj);	
				}else {
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(reportz, ""));	
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(reportj, ""));		
				}	
			}
		});
		this.add(Ѫ��͸ѹѪosm);
		this.add(Ѫ��͸ѹѪosm_box);	

		DetaLabel ���������= new DetaLabel("���������cor:");  
		���������.setForeground(Color.WHITE);
		���������.setBounds(10+220*4, 32+ 25*1, 100, 20);jFrameList.add(���������);
		���������.indexString= "JGQCLOR";
		JTextField ���������_box= new JTextField();
		���������_box.setBounds(10+ 110+220*4, 33+ 25*1, 80, 20);
		���������_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				String temp= ���������_box.getText();
				double temp_double= Double.valueOf(temp);
				String reportz= "��������ʸߡ�";
				String reportj= "��������ʵ͡�";

				if(temp_double> 120) {
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(reportz, ""));	
					��Ͻ��_box.setText(��Ͻ��_box.getText().contains(reportz)
							? ��Ͻ��_box.getText(): ��Ͻ��_box.getText()+ reportz);	
				}else if(temp_double< 75) {	
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(reportj, ""));	
					��Ͻ��_box.setText(��Ͻ��_box.getText().contains(reportj)
							? ��Ͻ��_box.getText(): ��Ͻ��_box.getText()+ reportj);	
				}else {
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(reportz, ""));	
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(reportj, ""));		
				}	
			}
		});
		this.add(���������);
		this.add(���������_box);	

		DetaLabel Ѫ��ͭ= new DetaLabel("Ѫ����ͭcu:");  
		Ѫ��ͭ.setForeground(Color.WHITE);
		Ѫ��ͭ.setBounds(10+220*4, 32+ 25*2, 100, 20);jFrameList.add(Ѫ��ͭ);
		Ѫ��ͭ.indexString= "XTNCU";
		JTextField Ѫ��ͭ_box= new JTextField();
		Ѫ��ͭ_box.setBounds(10+ 110+220*4, 33+ 25*2, 80, 20);
		Ѫ��ͭ_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				String temp= Ѫ��ͭ_box.getText();
				double temp_double= Double.valueOf(temp);
				String reportz= "Ѫ����ͭ ���ߣ����ڶ�����������Ӳ�����׿�����˵ȡ�";
				String reportj= "Ѫ����ͭ ���ͣ�����������ͭ���ռ������л�ϰ��������ۺ�֢���ζ�״�˱��ԡ�";

				if(temp_double> 150) {
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(reportz, ""));	
					��Ͻ��_box.setText(��Ͻ��_box.getText().contains(reportz)
							? ��Ͻ��_box.getText(): ��Ͻ��_box.getText()+ reportz);	
				}else if(temp_double< 80) {	
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(reportj, ""));	
					��Ͻ��_box.setText(��Ͻ��_box.getText().contains(reportj)
							? ��Ͻ��_box.getText(): ��Ͻ��_box.getText()+ reportj);	
				}else {
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(reportz, ""));	
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(reportj, ""));		
				}	
			}
		});
		this.add(Ѫ��ͭ);
		this.add(Ѫ��ͭ_box);	

		DetaLabel �������igg= new DetaLabel("�������igg:");  
		�������igg.setForeground(Color.WHITE);
		�������igg.setBounds(10+ 220*4, 32+ 25* 3, 100, 20);jFrameList.add(�������igg);
		�������igg.indexString= "ZFQDIG";
		JTextField �������igg_box= new JTextField();
		�������igg_box.setBounds(10+ 110+220*4, 33+ 25* 3, 80, 20);
		�������igg_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				String temp= �������igg_box.getText();
				//double temp_double= Double.valueOf(temp);
				String report= "�������߲��۲�ָ������";
				if(temp.contains("��")) {
					��Ͻ��_box.setText(��Ͻ��_box.getText().contains(report)
							? ��Ͻ��_box.getText(): ��Ͻ��_box.getText()+ report);	
				}else {
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(report, ""));	
				}	
			}
		});
		this.add(�������igg);
		this.add(�������igg_box);	

		DetaLabel ��״���ټ���pth= new DetaLabel("��״���ټ���pth:");  
		��״���ټ���pth.setForeground(Color.WHITE);
		��״���ټ���pth.setBounds(10+220*4, 32+ 25*4, 100, 20);jFrameList.add(��״���ټ���pth);
		��״���ټ���pth.indexString= "JZPXSPTH";
		JTextField ��״���ټ���pth_box= new JTextField();
		��״���ټ���pth_box.setBounds(10+ 110+220*4, 33+ 25*4, 80, 20);
		��״���ټ���pth_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				String temp= ��״���ټ���pth_box.getText();
				double temp_double= Double.valueOf(temp);
				String reportz= "�ⶨ��״���ٹ��ܹ��ʹ��ܡ�";
				String reportj= "�ⶨ��״���ٹ��ܹ������ɡ�";

				if(temp_double>72) {
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(reportz, ""));	
					��Ͻ��_box.setText(��Ͻ��_box.getText().contains(reportz)
							? ��Ͻ��_box.getText(): ��Ͻ��_box.getText()+ reportz);	
				}else if(temp_double< 12) {	
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(reportj, ""));	
					��Ͻ��_box.setText(��Ͻ��_box.getText().contains(reportj)
							? ��Ͻ��_box.getText(): ��Ͻ��_box.getText()+ reportj);	
				}else {
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(reportz, ""));	
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(reportj, ""));		
				}	
			}
		});
		this.add(��״���ټ���pth);
		this.add(��״���ټ���pth_box);	

		DetaLabel �ǻ���������= new DetaLabel("��3-������4-�ǻ��������ᣨvma��:");  
		�ǻ���������.setForeground(Color.WHITE);
		�ǻ���������.setBounds(10+220*4, 32+ 25*5, 100, 20);jFrameList.add(�ǻ���������);
		�ǻ���������.indexString= "NYQJKXRSVMA";
		JTextField �ǻ���������_box= new JTextField();
		�ǻ���������_box.setBounds(10+ 110+220*4, 33+ 25*5, 80, 20);
		�ǻ���������_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				String temp= �ǻ���������_box.getText();
				double temp_double= Double.valueOf(temp);
				String reportz= "��3-������4-�ǻ��������ᣨvma�����ߡ�";
				String reportj= "��3-������4-�ǻ��������ᣨvma�����͡�";

				if(temp_double>13) {
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(reportz, ""));	
					��Ͻ��_box.setText(��Ͻ��_box.getText().contains(reportz)
							? ��Ͻ��_box.getText(): ��Ͻ��_box.getText()+ reportz);	
				}else if(temp_double< 3.5) {	
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(reportj, ""));	
					��Ͻ��_box.setText(��Ͻ��_box.getText().contains(reportj)
							? ��Ͻ��_box.getText(): ��Ͻ��_box.getText()+ reportj);	
				}else {
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(reportz, ""));	
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(reportj, ""));		
				}	
			}
		});
		this.add(�ǻ���������);
		this.add(�ǻ���������_box);	

		//7
		DetaLabel ��֬����ap0= new DetaLabel("��֬����ap0alap0al:");  
		��֬����ap0.setForeground(Color.WHITE);
		��֬����ap0.setBounds(10+220*4, 32+ 25*6, 100, 20);jFrameList.add(��֬����ap0);
		��֬����ap0.indexString= "ZDBAPL";
		JTextField ��֬����ap0_box= new JTextField();
		��֬����ap0_box.setBounds(10+ 110+220*4, 33+ 25*6, 80, 20);
		��֬����ap0_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				String temp= ��֬����ap0_box.getText();
				double temp_double= Double.valueOf(temp);
				String reportz= "��֬���׹��ߡ�";
				String reportj= "��֬���׽��ͣ������ڸ�֬Ѫ֢�����Ĳ�����ʵ���Բ��䡣";

				if(temp_double>13) {
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(reportz, ""));	
					��Ͻ��_box.setText(��Ͻ��_box.getText().contains(reportz)
							? ��Ͻ��_box.getText(): ��Ͻ��_box.getText()+ reportz);	
				}else if(temp_double< 3.5) {	
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(reportj, ""));	
					��Ͻ��_box.setText(��Ͻ��_box.getText().contains(reportj)
							? ��Ͻ��_box.getText(): ��Ͻ��_box.getText()+ reportj);	
				}else {
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(reportz, ""));	
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(reportj, ""));		
				}	
			}
		});
		this.add(��֬����ap0);
		this.add(��֬����ap0_box);	
		//8
		DetaLabel ���Ƶ���itni= new DetaLabel("���Ƶ���itni:");  
		���Ƶ���itni.setForeground(Color.WHITE);
		���Ƶ���itni.setBounds(10+220*4, 32+ 25*7, 100, 20);jFrameList.add(���Ƶ���itni);
		���Ƶ���itni.indexString= "JGDBIYNT";
		JTextField ���Ƶ���itni_box= new JTextField();
		���Ƶ���itni_box.setBounds(10+ 110+220*4, 33+ 25*7, 80, 20);
		���Ƶ���itni_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				String temp= ���Ƶ���itni_box.getText();
				double temp_double= Double.valueOf(temp);
				String reportz= "ͬTNI������ļ�����������ָ�꣬ͬʱ�������жϲ��ȶ��Ľ�ʹ����Ԥ���һ����Ҫָ�ꡣ";
				String reportj= "���Ƶ��׹��͡�";

				if(temp_double>0.05) {
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(reportz, ""));	
					��Ͻ��_box.setText(��Ͻ��_box.getText().contains(reportz)
							? ��Ͻ��_box.getText(): ��Ͻ��_box.getText()+ reportz);	
				}else if(temp_double< 0) {	
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(reportj, ""));	
					��Ͻ��_box.setText(��Ͻ��_box.getText().contains(reportj)
							? ��Ͻ��_box.getText(): ��Ͻ��_box.getText()+ reportj);	
				}else {
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(reportz, ""));	
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(reportj, ""));		
				}	

			}
		});
		this.add(���Ƶ���itni);
		this.add(���Ƶ���itni_box);	
		//9
		DetaLabel �ȴ�������= new DetaLabel("�ȴ�������as-d��øȾɫ:");  
		�ȴ�������.setForeground(Color.WHITE);
		�ȴ�������.setBounds(10+220*4, 32+ 25*8, 100, 20);jFrameList.add(�ȴ�������);
		�ȴ�������.indexString= "LCSNFADZMR";
		JTextField �ȴ�������_box= new JTextField();
		�ȴ�������_box.setBounds(10+ 110+220*4, 33+ 25*8, 80, 20);
		�ȴ�������_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				String temp= �ȴ�������_box.getText();
				//double temp_double= Double.valueOf(temp);
				String report= "��Ѫ��";
				if(temp.contains("��")) {
					��Ͻ��_box.setText(��Ͻ��_box.getText().contains(report)
							? ��Ͻ��_box.getText(): ��Ͻ��_box.getText()+ report);	
				}else {
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(report, ""));	
				}	
			}
		});
		this.add(�ȴ�������);
		this.add(�ȴ�������_box);	
		//10
		DetaLabel ����lact= new DetaLabel("����lact:");  
		����lact.setForeground(Color.WHITE);
		����lact.setBounds(10+220*4, 32+ 25*9, 100, 20);jFrameList.add(����lact);
		����lact.indexString= "RSLACT";
		JTextField ����lact_box= new JTextField();
		����lact_box.setBounds(10+ 110+220*4, 33+ 25*9, 80, 20);
		����lact_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				String temp= ����lact_box.getText();
				double temp_double= Double.valueOf(temp);
				String reportz= "����LACT���ߡ�����ȱ�������ж����ݿˣ�����ƶѪ���ι��ܲ�ȫ�����⾷�Σ����򲡣������˶�";
				String reportj= "";

				if(temp_double>18) {
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(reportz, ""));	
					��Ͻ��_box.setText(��Ͻ��_box.getText().contains(reportz)
							? ��Ͻ��_box.getText(): ��Ͻ��_box.getText()+ reportz);	
				}else if(temp_double< 5.4) {	
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(reportj, ""));	
					��Ͻ��_box.setText(��Ͻ��_box.getText().contains(reportj)
							? ��Ͻ��_box.getText(): ��Ͻ��_box.getText()+ reportj);	
				}else {
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(reportz, ""));	
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(reportj, ""));		
				}	
			}
		});
		this.add(����lact);
		this.add(����lact_box);	
		//11
		DetaLabel ������ǿ�ԭ= new DetaLabel("������ǿ�ԭ242���ca242:");  
		������ǿ�ԭ.setForeground(Color.WHITE);
		������ǿ�ԭ.setBounds(10+220*4, 32+ 25*10, 100, 20);jFrameList.add(������ǿ�ԭ);
		������ǿ�ԭ.indexString= "ZLBJKYCA";
		JTextField ������ǿ�ԭ_box= new JTextField();
		������ǿ�ԭ_box.setBounds(10+ 110+220*4, 33+ 25*10, 80, 20);
		������ǿ�ԭ_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				String temp= ������ǿ�ԭ_box.getText();
				double temp_double= Double.valueOf(temp);
				String reportz= "";
				String reportj= "��Ҫ�������ٰ�����ֱ��������������";

				if(temp_double> 260) {
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(reportz, ""));	
					��Ͻ��_box.setText(��Ͻ��_box.getText().contains(reportz)
							? ��Ͻ��_box.getText(): ��Ͻ��_box.getText()+ reportz);	
				}else if(temp_double< 22) {	
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(reportj, ""));	
					��Ͻ��_box.setText(��Ͻ��_box.getText().contains(reportj)
							? ��Ͻ��_box.getText(): ��Ͻ��_box.getText()+ reportj);	
				}else {
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(reportz, ""));	
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(reportj, ""));		
				}	
			}
		});
		this.add(������ǿ�ԭ);
		this.add(������ǿ�ԭ_box);	
		//12
		DetaLabel ��ca= new DetaLabel("��ca:");  
		��ca.setForeground(Color.WHITE);
		��ca.setBounds(10+220*4, 32+ 25*11, 100, 20);jFrameList.add(��ca);
		��ca.indexString= "GCA";
		JTextField ��ca_box= new JTextField();
		��ca_box.setBounds(10+ 110+220*4, 33+ 25*11, 80, 20);
		��ca_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(��ca_box
						, "���ͣ�������ά����Dȱ������¥������ǲ���С������鴤֢������������ɣ���״���ٹ��ܼ��ˣ��������ף���֢���͸���ʳ�����ղ���" 
						, "���ߣ����ڹ���������״���ٻ��ܿ��������Թ�ή����������Ƥ֬���ܼ��˼�ά����D��������ȡ�"
						, "" 
						,8.5 ,11, ��Ͻ��_box
						, "");
			}
		});
		this.add(��ca);
		this.add(��ca_box);	
		//13
		DetaLabel ����ϸ����Ⱦ��������= new DetaLabel("����ϸ����Ⱦ��������-1��mip-1��:");  
		����ϸ����Ⱦ��������.setForeground(Color.WHITE);
		����ϸ����Ⱦ��������.setBounds(10+220*4, 32+ 25*12, 100, 20);jFrameList.add(����ϸ����Ⱦ��������);
		����ϸ����Ⱦ��������.indexString= "JSXBGRQHYZBMIP";
		JTextField ����ϸ����Ⱦ��������_box= new JTextField();
		����ϸ����Ⱦ��������_box.setBounds(10+ 110+220*4, 33+ 25*12, 80, 20);
		����ϸ����Ⱦ��������_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(����ϸ����Ⱦ��������);
		this.add(����ϸ����Ⱦ��������_box);	
		//14
		DetaLabel �ǹ̴�17= new DetaLabel("��17-�ǹ̴�17-oh:");  
		�ǹ̴�17.setForeground(Color.WHITE);
		�ǹ̴�17.setBounds(10+220*4, 32+ 25*13, 100, 20);jFrameList.add(�ǹ̴�17);
		�ǹ̴�17.indexString= "QGCOH";
		JTextField �ǹ̴�17_box= new JTextField();
		�ǹ̴�17_box.setBounds(10+ 110+ 220* 4, 33+ 25* 13, 80, 20);
		�ǹ̴�17_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(�ǹ̴�17_box
						, "���ͣ���������Ƥ�ʹ��ܲ�ȫ���簢��ɭ�ϲ���" 
						, "���ߣ����ڿ������ۺ�֢������֢���׿���������Ƥ���ܿ�������������������������"
						, "" ,3 ,11, ��Ͻ��_box, "");
			}
		});
		this.add(�ǹ̴�17);
		this.add(�ǹ̴�17_box);	
	}

	protected void printValue(JTextField ���ӡ������_box, String minString, String maxString, String elseString
			, double min, double max, JTextField ��Ͻ��_box, String yinyang) {
		//��״̬��
		String temp= ���ӡ������_box.getText();
		//double temp_double= Double.valueOf(temp);
		if(yinyang.contains("�� ")||yinyang.contains("��")) {
			if(temp.contains(yinyang)) {
				��Ͻ��_box.setText(��Ͻ��_box.getText().contains(elseString)
						? ��Ͻ��_box.getText(): ��Ͻ��_box.getText()+ elseString);	
			}else {
				��Ͻ��_box.setText(��Ͻ��_box.getText().replace(elseString, ""));	
			}
			return;
		}
		if(temp.isEmpty()) {
			��Ͻ��_box.setText(��Ͻ��_box.getText().replace(maxString, "").replace(minString, ""));	
			return;
		}
		//��״̬��
		double temp_double= Double.valueOf(temp);
		if(temp_double> max) {
			��Ͻ��_box.setText(��Ͻ��_box.getText().replace(maxString, "").replace(minString, ""));	
			��Ͻ��_box.setText(��Ͻ��_box.getText().contains(maxString)
					? ��Ͻ��_box.getText(): ��Ͻ��_box.getText()+ maxString);	
		}else if(temp_double< min) {	
			��Ͻ��_box.setText(��Ͻ��_box.getText().replace(maxString, "").replace(minString, ""));	
			��Ͻ��_box.setText(��Ͻ��_box.getText().contains(minString)
					? ��Ͻ��_box.getText(): ��Ͻ��_box.getText()+ minString);	
		}else {
			��Ͻ��_box.setText(��Ͻ��_box.getText().replace(maxString, "").replace(minString, ""));	
		}
	}
	void addFourthColomns(JTextField ��Ͻ��_box, List<DetaLabel> jFrameList) {
		// TODO Auto-generated method stub
		//copy tab
		DetaLabel ldhͬ��øis= new DetaLabel("ldhͬ��øis0-ldh:");  
		ldhͬ��øis.setForeground(Color.WHITE);
		ldhͬ��øis.setBounds(10+220*3, 32+ 0, 100, 20);jFrameList.add(ldhͬ��øis);
		ldhͬ��øis.indexString= "LDHTGMIS";
		JTextField ldhͬ��øis_box= new JTextField();
		ldhͬ��øis_box.setBounds(10+ 110+220*3, 33+ 0, 80, 20);
		ldhͬ��øis_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(ldhͬ��øis);
		this.add(ldhͬ��øis_box);	

		DetaLabel �ȵ���ins= new DetaLabel("�ȵ���ins:");  
		�ȵ���ins.setForeground(Color.WHITE);
		�ȵ���ins.setBounds(10+220*3, 32+ 25*1, 100, 20);jFrameList.add(�ȵ���ins);
		�ȵ���ins.indexString= "YDSIN";
		JTextField �ȵ���ins_box= new JTextField();
		�ȵ���ins_box.setBounds(10+ 110+220*3, 33+ 25*1, 80, 20);
		�ȵ���ins_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(�ȵ���ins);
		this.add(�ȵ���ins_box);	

		DetaLabel ͬt= new DetaLabel("ͬt:");  
		ͬt.setForeground(Color.WHITE);
		ͬt.setBounds(10+220*3, 32+ 25*2, 100, 20);jFrameList.add(ͬt);
		ͬt.indexString= "T";
		JTextField ͬt_box= new JTextField();
		ͬt_box.setBounds(10+ 110+220*3, 33+ 25*2, 80, 20);
		ͬt_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(ͬt);
		this.add(ͬt_box);	

		DetaLabel ���øamy= new DetaLabel("���øamy:");  
		���øamy.setForeground(Color.WHITE);
		���øamy.setBounds(10+220*3, 32+ 25* 3, 100, 20);jFrameList.add(���øamy);
		���øamy.indexString= "DMFAY";
		JTextField ���øamy_box= new JTextField();
		���øamy_box.setBounds(10+ 110+220*3, 33+ 25* 3, 80, 20);
		���øamy_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(���øamy_box
						, "���ͣ����ڸ��༲������ΰ�����Ӳ����"
						, "���ߣ����ڼ����������ף����ٰ�������������θ���ף������裬�����ף���Һ���׵ȡ�" 
						,"" ,110 ,110, ��Ͻ��_box, "");
			}
		});
		this.add(���øamy);
		this.add(���øamy_box);	

		DetaLabel ��������øldh= new DetaLabel("��������øldh:");  
		��������øldh.setForeground(Color.WHITE);
		��������øldh.setBounds(10+220*3, 32+ 25*4, 100, 20);jFrameList.add(��������øldh);
		��������øldh.indexString= "RSTQMLDH";
		JTextField ��������øldh_box= new JTextField();
		��������øldh_box.setBounds(10+ 110+220*3, 33+ 25*4, 80, 20);
		��������øldh_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(��������øldh);
		this.add(��������øldh_box);	

		DetaLabel ��tron= new DetaLabel("��tron:");  
		��tron.setForeground(Color.WHITE);
		��tron.setBounds(10+220*3, 32+ 25*5, 100, 20);jFrameList.add(��tron);
		��tron.indexString= "TRON";
		JTextField ��tron_box= new JTextField();
		��tron_box.setBounds(10+ 110+220*3, 33+ 25*5, 80, 20);
		��tron_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(��tron);
		this.add(��tron_box);	

		//7
		DetaLabel ��������ø�;�ʯ��= new DetaLabel("��������ø�;�ʯ��l+:");  
		��������ø�;�ʯ��.setForeground(Color.WHITE);
		��������ø�;�ʯ��.setBounds(10+220*3, 32+ 25*6, 100, 20);jFrameList.add(��������ø�;�ʯ��);
		��������ø�;�ʯ��.indexString= "SXLMJH";
		JTextField ��������ø�;�ʯ��_box= new JTextField();
		��������ø�;�ʯ��_box.setBounds(10+ 110+220*3, 33+ 25*6, 80, 20);
		��������ø�;�ʯ��_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(��������ø�;�ʯ��);
		this.add(��������ø�;�ʯ��_box);	
		//8
		DetaLabel ��ϸ���̼�����= new DetaLabel("��ϸ���̼�����g-csf:");  
		��ϸ���̼�����.setForeground(Color.WHITE);
		��ϸ���̼�����.setBounds(10+220*3, 32+ 25*7, 100, 20);jFrameList.add(��ϸ���̼�����);
		��ϸ���̼�����.indexString= "LXBCJYZ";
		JTextField ��ϸ���̼�����_box= new JTextField();
		��ϸ���̼�����_box.setBounds(10+ 110+220*3, 33+ 25*7, 80, 20);
		��ϸ���̼�����_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(��ϸ���̼�����);
		this.add(��ϸ���̼�����_box);	
		//9
		DetaLabel �Ƽ���el= new DetaLabel("�Ƽ���el:");  
		�Ƽ���el.setForeground(Color.WHITE);
		�Ƽ���el.setBounds(10+220*3, 32+ 25*8, 100, 20);jFrameList.add(�Ƽ���el);
		�Ƽ���el.indexString= "CJSEL";
		JTextField �Ƽ���el_box= new JTextField();
		�Ƽ���el_box.setBounds(10+ 110+220*3, 33+ 25*8, 80, 20);
		�Ƽ���el_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(�Ƽ���el);
		this.add(�Ƽ���el_box);	
		//10
		DetaLabel ͬ��øck_mb= new DetaLabel("ͬ��øck-mb:");  
		ͬ��øck_mb.setForeground(Color.WHITE);
		ͬ��øck_mb.setBounds(10+220*3, 32+ 25*9, 100, 20);jFrameList.add(ͬ��øck_mb);
		ͬ��øck_mb.indexString= "TGMCKB";
		JTextField ͬ��øck_mb_box= new JTextField();
		ͬ��øck_mb_box.setBounds(10+ 110+220*3, 33+ 25*9, 80, 20);
		ͬ��øck_mb_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(ͬ��øck_mb);
		this.add(ͬ��øck_mb_box);	
		//11
		DetaLabel ����͸ѹ��= new DetaLabel("����͸ѹ��osm:");  
		����͸ѹ��.setForeground(Color.WHITE);
		����͸ѹ��.setBounds(10+220*3, 32+ 25*10, 100, 20);jFrameList.add(����͸ѹ��);
		����͸ѹ��.indexString= "NSTY";
		JTextField ����͸ѹ��_box= new JTextField();
		����͸ѹ��_box.setBounds(10+ 110+220*3, 33+ 25*10, 80, 20);
		����͸ѹ��_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(����͸ѹ��_box
						, "ϡ�ͣ��ɷ�ӦԶ����С�ܵ�Ũ��ϡ��֢�ȼ�������ϼ��������"
						, "Ũ���ɷ�ӦԶ����С�ܵ�Ũ��ϡ��֢�ȼ�������ϼ��������" 
						, "" 
						,600, 800, ��Ͻ��_box
						, "");
			}
		});
		this.add(����͸ѹ��);
		this.add(����͸ѹ��_box);	
		//12
		DetaLabel ���ӡ������= new DetaLabel("���ӡ������tb-poc:");  
		���ӡ������.setForeground(Color.WHITE);
		���ӡ������.setBounds(10+220*3, 32+ 25*11, 100, 20);jFrameList.add(���ӡ������);
		���ӡ������.indexString= "JHYJS";
		JTextField ���ӡ������_box= new JTextField();
		���ӡ������_box.setBounds(10+ 110+220*3, 33+ 25*11, 80, 20);
		���ӡ������_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(���ӡ������);
		this.add(���ӡ������_box);	
		//13
		DetaLabel �����Ѱ���= new DetaLabel("�����Ѱ���ada:");  
		�����Ѱ���.setForeground(Color.WHITE);
		�����Ѱ���.setBounds(10+220*3, 32+ 25*12, 100, 20);jFrameList.add(�����Ѱ���);
		�����Ѱ���.indexString= "XGTAS";
		JTextField �����Ѱ���_box= new JTextField();
		�����Ѱ���_box.setBounds(10+ 110+220*3, 33+ 25*12, 80, 20);
		�����Ѱ���_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(�����Ѱ���);
		this.add(�����Ѱ���_box);	
		//14
		DetaLabel ����ʪ������= new DetaLabel("����ʪ������:");  
		����ʪ������.setForeground(Color.WHITE);
		����ʪ������.setBounds(10+220*3, 32+ 25*13, 100, 20);jFrameList.add(����ʪ������);
		����ʪ������.indexString= "JRSYCB";
		JTextField ����ʪ������_box= new JTextField();
		����ʪ������_box.setBounds(10+ 110+220*3, 33+ 25*13, 80, 20);
		����ʪ������_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(����ʪ������);
		this.add(����ʪ������_box);	
	}

	private void addThirdColomns(JTextField ��Ͻ��_box, List<DetaLabel> jFrameList) {
		// TODO Auto-generated method stub
		//copy tab
		DetaLabel �괯����sarcoptes= new DetaLabel("�괯����sarcoptesscabidiexamination:");  
		�괯����sarcoptes.setForeground(Color.WHITE);
		�괯����sarcoptes.setBounds(10+220*2, 32+ 0, 100, 20);jFrameList.add(�괯����sarcoptes);
		�괯����sarcoptes.indexString= "JCSAROPTESBIDXN";
		JTextField �괯����sarcoptes_box= new JTextField();
		�괯����sarcoptes_box.setBounds(10+ 110+220*2, 33+ 0, 80, 20);
		�괯����sarcoptes_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(�괯����sarcoptes);
		this.add(�괯����sarcoptes_box);	

		DetaLabel ��ɫ���������= new DetaLabel("��ɫ���������:");  
		��ɫ���������.setForeground(Color.WHITE);
		��ɫ���������.setBounds(10+220*2, 32+ 25*1, 100, 20);jFrameList.add(��ɫ���������);
		��ɫ���������.indexString= "BSNZJKT";
		JTextField ��ɫ���������_box= new JTextField();
		��ɫ���������_box.setBounds(10+ 110+220*2, 33+ 25*1, 80, 20);
		��ɫ���������_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(��ɫ���������);
		this.add(��ɫ���������_box);	

		DetaLabel �ܵ�����= new DetaLabel("�ܵ�����tbil:");  
		�ܵ�����.setForeground(Color.WHITE);
		�ܵ�����.setBounds(10+220*2, 32+ 25*2, 100, 20);jFrameList.add(�ܵ�����);
		�ܵ�����.indexString= "ZDHBIL";
		JTextField �ܵ�����_box= new JTextField();
		�ܵ�����_box.setBounds(10+ 110+220*2, 33+ 25*2, 80, 20);
		�ܵ�����_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(�ܵ�����);
		this.add(�ܵ�����_box);	

		DetaLabel ֱ�ӵ�����= new DetaLabel("ֱ�ӵ�����dbil:");  
		ֱ�ӵ�����.setForeground(Color.WHITE);
		ֱ�ӵ�����.setBounds(10+220*2, 32+ 25* 3, 100, 20);jFrameList.add(ֱ�ӵ�����);
		ֱ�ӵ�����.indexString= "ZJDHBIL";
		JTextField ֱ�ӵ�����_box= new JTextField();
		ֱ�ӵ�����_box.setBounds(10+ 110+220*2, 33+ 25* 3, 80, 20);
		ֱ�ӵ�����_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(ֱ�ӵ�����_box
						, ""
						, "���ߣ������������Ի��㣬�ΰ�����ͷ������ʯ֢��" 
						, "" 
						,0, 0.4, ��Ͻ��_box
						, "");
			}
		});
		this.add(ֱ�ӵ�����);
		this.add(ֱ�ӵ�����_box);	

		DetaLabel ��������= new DetaLabel("��������patchtest:");  
		��������.setForeground(Color.WHITE);
		��������.setBounds(10+220*2, 32+ 25*4, 100, 20);jFrameList.add(��������);
		��������.indexString= "BTSY";
		JTextField ��������_box= new JTextField();
		��������_box.setBounds(10+ 110+220*2, 33+ 25*4, 80, 20);
		��������_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(��������);
		this.add(��������_box);	

		DetaLabel Ѫþ= new DetaLabel("Ѫþmg:");  
		Ѫþ.setForeground(Color.WHITE);
		Ѫþ.setBounds(10+220*2, 32+ 25*5, 100, 20);jFrameList.add(Ѫþ);
		Ѫþ.indexString= "XMG";
		JTextField Ѫþ_box= new JTextField();
		Ѫþ_box.setBounds(10+ 110+220*2, 33+ 25*5, 80, 20);
		Ѫþ_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(Ѫþ);
		this.add(Ѫþ_box);	

		//7
		DetaLabel �׸ο���= new DetaLabel("�׸ο���-igmhav-igmigmhav-igm:");  
		�׸ο���.setForeground(Color.WHITE);
		�׸ο���.setBounds(10+220*2, 32+ 25*6, 100, 20);jFrameList.add(�׸ο���);
		�׸ο���.indexString= "JGKT";
		JTextField �׸ο���_box= new JTextField();
		�׸ο���_box.setBounds(10+ 110+220*2, 33+ 25*6, 80, 20);
		�׸ο���_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(�׸ο���);
		this.add(�׸ο���_box);	
		//8
		DetaLabel ���ἤø= new DetaLabel("���ἤøck:");  
		���ἤø.setForeground(Color.WHITE);
		���ἤø.setBounds(10+220*2, 32+ 25*7, 100, 20);jFrameList.add(���ἤø);
		���ἤø.indexString= "JSJM";
		JTextField ���ἤø_box= new JTextField();
		���ἤø_box.setBounds(10+ 110+220*2, 33+ 25*7, 80, 20);
		���ἤø_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(���ἤø_box
						, "����"
						, "���ߣ��Ĺ�4-6Сʱ��ʼ���ߣ�18-36Сʱ�ɴ�����ֵ��20-30����Ϊ��߷壬2-4��ָ����������⣬�������ļ��ף�Ƥ���ף��������ˣ���Ӫ���������İ��ף���Ѫ�����⼰���������ȶ�����ʹCK����" 
						, "" 
						, 25, 200, ��Ͻ��_box
						, "");
			}
		});
		this.add(���ἤø);
		this.add(���ἤø_box);	
		//9
		DetaLabel ���̴�= new DetaLabel("���̴�tc:");  
		���̴�.setForeground(Color.WHITE);
		���̴�.setBounds(10+220*2, 32+ 25*8, 100, 20);jFrameList.add(���̴�);
		���̴�.indexString= "DGC";
		JTextField ���̴�_box= new JTextField();
		���̴�_box.setBounds(10+ 110+220*2, 33+ 25*8, 80, 20);
		���̴�_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(���̴�);
		this.add(���̴�_box);	
		//10
		DetaLabel ���ܶ�֬����= new DetaLabel("���ܶ�֬����hdl-c:");  
		���ܶ�֬����.setForeground(Color.WHITE);
		���ܶ�֬����.setBounds(10+220*2, 32+ 25*9, 100, 20);jFrameList.add(���ܶ�֬����);
		���ܶ�֬����.indexString= "GMDB";
		JTextField ���ܶ�֬����_box= new JTextField();
		���ܶ�֬����_box.setBounds(10+ 110+220*2, 33+ 25*9, 80, 20);
		���ܶ�֬����_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(���ܶ�֬����_box
						, "���ͣ�������Ѫ�ܲ������Ĳ�����TGѪ֢�����ؼ��������������̣�ȱ���˶��ȡ�"
						, "" 
						, "" 
						,35, 70, ��Ͻ��_box
						, "");

			}
		});
		this.add(���ܶ�֬����);
		this.add(���ܶ�֬����_box);	
		//11
		DetaLabel rents= new DetaLabel("rents:");  
		rents.setForeground(Color.WHITE);
		rents.setBounds(10+220*2, 32+ 25*10, 100, 20);jFrameList.add(rents);
		rents.indexString= "RENT";
		JTextField rents_box= new JTextField();
		rents_box.setBounds(10+ 110+220*2, 33+ 25*10, 80, 20);
		rents_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(rents);
		this.add(rents_box);	
		//12
		DetaLabel ����= new DetaLabel("����cre:");  
		����.setForeground(Color.WHITE);
		����.setBounds(10+220*2, 32+ 25*11, 100, 20);jFrameList.add(����);
		����.indexString= "JGCRE";
		JTextField ����_box= new JTextField();
		����_box.setBounds(10+ 110+220*2, 33+ 25*11, 80, 20);
		����_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(����);
		this.add(����_box);	
		//13
		DetaLabel ��ϸ������= new DetaLabel("��ϸ������igm���嶨��cmc:");  
		��ϸ������.setForeground(Color.WHITE);
		��ϸ������.setBounds(10+220*2, 32+ 25*12, 100, 20);jFrameList.add(��ϸ������);
		��ϸ������.indexString= "JXBD";
		JTextField ��ϸ������_box= new JTextField();
		��ϸ������_box.setBounds(10+ 110+220*2, 33+ 25*12, 80, 20);
		��ϸ������_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(��ϸ������);
		this.add(��ϸ������_box);	
		//14
		DetaLabel Ҷ��= new DetaLabel("Ҷ��:");  
		Ҷ��.setForeground(Color.WHITE);
		Ҷ��.setBounds(10+220*2, 32+ 25*13, 100, 20);jFrameList.add(Ҷ��);
		Ҷ��.indexString= "YS";
		JTextField Ҷ��_box= new JTextField();
		Ҷ��_box.setBounds(10+ 110+220*2, 33+ 25*13, 80, 20);
		Ҷ��_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(Ҷ��_box
						, "���ͣ�ƶѪ��"
						, "" 
						, "" 
						, 3, 17, ��Ͻ��_box
						, "");
			}
		});
		this.add(Ҷ��);
		this.add(Ҷ��_box);	
	}

	private void addSecondColomns(JTextField ��Ͻ��_box, List<DetaLabel> jFrameList) {
		// TODO Auto-generated method stub
		//copy tab
		DetaLabel ����= new DetaLabel("�ף���:");  
		����.setForeground(Color.WHITE);
		����.setBounds(10+220*1, 32+ 0, 100, 20);jFrameList.add(����);
		����.indexString= "LN";
		JTextField ����_box= new JTextField();
		����_box.setBounds(10+ 110+220*1, 33+ 0, 80, 20);
		����_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(����_box
						, "���ͣ����ڼ�״���ٻ��ܼ��ˣ������������֢"
						, "���ߣ����ڼ�״���ٻ��ܿ���" 
						, "" 
						,23, 48, ��Ͻ��_box
						, "");
			}
		});
		this.add(����);
		this.add(����_box);	

		DetaLabel ����ϸ��Դ��= new DetaLabel("����ϸ��Դ������-1sdf-1:");  
		����ϸ��Դ��.setForeground(Color.WHITE);
		����ϸ��Դ��.setBounds(10+220*1, 32+ 25*1, 100, 20);jFrameList.add(����ϸ��Դ��);
		����ϸ��Դ��.indexString= "JZXBY";
		JTextField ����ϸ��Դ��_box= new JTextField();
		����ϸ��Դ��_box.setBounds(10+ 110+220*1, 33+ 25*1, 80, 20);
		����ϸ��Դ��_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(����ϸ��Դ��);
		this.add(����ϸ��Դ��_box);	

		DetaLabel ��֬����= new DetaLabel("��֬����eapoe:");  
		��֬����.setForeground(Color.WHITE);
		��֬����.setBounds(10+220*1, 32+ 25*2, 100, 20);jFrameList.add(��֬����);
		��֬����.indexString= "ZDBEAPOE";
		JTextField ��֬����_box= new JTextField();
		��֬����_box.setBounds(10+ 110+220*1, 33+ 25*2, 80, 20);
		��֬����_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(��֬����);
		this.add(��֬����_box);	

		DetaLabel ��������= new DetaLabel("��������tg:");  
		��������.setForeground(Color.WHITE);
		��������.setBounds(10+220*1, 32+ 25* 3, 100, 20);jFrameList.add(��������);
		��������.indexString= "GYSZ";
		JTextField ��������_box= new JTextField();
		��������_box.setBounds(10+ 110+220*1, 33+ 25* 3, 80, 20);
		��������_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(��������_box
						, "���ͣ����ڼ׿���������Ƥ�ʹ��ܵ��£���ʵ���Բ��䣬ԭ���Ԧ�֬����ȱ�������ղ�����"
						, "���ߣ������Ŵ�����ʳ���ػ�̷���ĳЩ�����������򲡣������ȡ�" 
						, "" 
						,50, 150, ��Ͻ��_box
						, "");
			}
		});
		this.add(��������);
		this.add(��������_box);	

		DetaLabel ��ˮ= new DetaLabel("cl����ˮ��:");  
		��ˮ.setForeground(Color.WHITE);
		��ˮ.setBounds(10+220*1, 32+ 25*4, 100, 20);jFrameList.add(��ˮ);
		��ˮ.indexString= "CLXS";
		JTextField ��ˮ_box= new JTextField();
		��ˮ_box.setBounds(10+ 110+220*1, 33+ 25*4, 80, 20);
		��ˮ_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(��ˮ_box
						, "���ͣ������ڽ������Ĥ�ף���ŧ����Ĥ��"
						, "��֢�����Լ�Һ�Ȼ��ﳤ��" 
						, "" 
						,119, 129, ��Ͻ��_box
						, "");
			}
		});
		this.add(��ˮ);
		this.add(��ˮ_box);	

		DetaLabel ����ϸ����Ⱦ= new DetaLabel("����ϸ����Ⱦ��������-1��mip-1��:");  
		����ϸ����Ⱦ.setForeground(Color.WHITE);
		����ϸ����Ⱦ.setBounds(10+220*1, 32+ 25*5, 100, 20);jFrameList.add(����ϸ����Ⱦ);
		����ϸ����Ⱦ.indexString= "JSXBGRAMIP";
		JTextField ����ϸ����Ⱦ_box= new JTextField();
		����ϸ����Ⱦ_box.setBounds(10+ 110+220*1, 33+ 25*5, 80, 20);
		����ϸ����Ⱦ_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(����ϸ����Ⱦ);
		this.add(����ϸ����Ⱦ_box);	

		//7
		DetaLabel ��na= new DetaLabel("��na:");  
		��na.setForeground(Color.WHITE);
		��na.setBounds(10+220*1, 32+ 25*6, 100, 20);jFrameList.add(��na);
		��na.indexString= "NA";
		JTextField ��na_box= new JTextField();
		��na_box.setBounds(10+ 110+220*1, 33+ 25*6, 80, 20);
		��na_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(��na_box
						, "���ͣ�1.��Ƥ�ʹ��ܲ�ȫ����֢�������ף����򲡡�2.θ����������Ż�¼���к��3.�������ع��ࡣ"
						, "���ߣ�1.������ˮ���������������գ����ˣ������Զ���2.������Ƥ�ʹ��ܿ�����ԭ�����̷���ȩ��ͪ���ಡ��" 
						, "" 
						,135, 145, ��Ͻ��_box
						, "");
			}
		});
		this.add(��na);
		this.add(��na_box);	
		//8
		DetaLabel ͪ��̴�= new DetaLabel("��17-ͪ��̴�17-ks:");  
		ͪ��̴�.setForeground(Color.WHITE);
		ͪ��̴�.setBounds(10+220*1, 32+ 25*7, 100, 20);jFrameList.add(ͪ��̴�);
		ͪ��̴�.indexString= "NTLGCKS";
		JTextField ͪ��̴�_box= new JTextField();
		ͪ��̴�_box.setBounds(10+ 110+220*1, 33+ 25*7, 80, 20);
		ͪ��̴�_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(ͪ��̴�_box
						, "���ͣ���������Ƥ�ʹ��ܲ�ȫ���簢��ɭ�ϲ��ȡ�"
						, "���ߣ����ڿ������ۺ�֢������֢���׿���������Ƥ���ܿ�������������������������" 
						, "" 
						,3, 11, ��Ͻ��_box
						, "");
			}
		});
		this.add(ͪ��̴�);
		this.add(ͪ��̴�_box);	
		//9
		DetaLabel ��֭��= new DetaLabel("��֭��tba:");  
		��֭��.setForeground(Color.WHITE);
		��֭��.setBounds(10+220*1, 32+ 25*8, 100, 20);jFrameList.add(��֭��);
		��֭��.indexString= "DZSTBA";
		JTextField ��֭��_box= new JTextField();
		��֭��_box.setBounds(10+ 110+220*1, 33+ 25*8, 80, 20);
		��֭��_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(��֭��_box
						, ""
						, "���ߣ������Ը��ף���Ӳ���������Ի��㼰ҩ���������ʱ��" 
						, "" 
						,0, 10, ��Ͻ��_box
						, "");
			}
		});
		this.add(��֭��);
		this.add(��֭��_box);	
		//10
		DetaLabel Ѫ��ά����= new DetaLabel("Ѫ��ά����b12vb12:");  
		Ѫ��ά����.setForeground(Color.WHITE);
		Ѫ��ά����.setBounds(10+220*1, 32+ 25*9, 100, 20);jFrameList.add(Ѫ��ά����);
		Ѫ��ά����.indexString= "XJWSSBV";
		JTextField Ѫ��ά����_box= new JTextField();
		Ѫ��ά����_box.setBounds(10+ 110+220*1, 33+ 25*9, 80, 20);
		Ѫ��ά����_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(Ѫ��ά����);
		this.add(Ѫ��ά����_box);	
		//11
		DetaLabel Ѫ��= new DetaLabel("Ѫ��glu:");  
		Ѫ��.setForeground(Color.WHITE);
		Ѫ��.setBounds(10+220*1, 32+ 25*10, 100, 20);jFrameList.add(Ѫ��);
		Ѫ��.indexString= "XTGLU";
		JTextField Ѫ��_box= new JTextField();
		Ѫ��_box.setBounds(10+ 110+220*1, 33+ 25*10, 80, 20);
		Ѫ��_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(Ѫ��_box
						, "����"
						, "���ߣ�ĳЩ�������أ��������ţ�����1-2Сʱ����ע���������غ󣬲��������߼��ڸ������򲡣����������ף��Ĺ����׿�������ǰҶ������ϸ������­�ڳ�Ѫ��­���˵ȡ�" 
						, "" 
						,70, 110, ��Ͻ��_box
						, "");
			}
		});
		this.add(Ѫ��);
		this.add(Ѫ��_box);	
		//12
		DetaLabel Сʱ�ϳ���= new DetaLabel("24Сʱ�ϳ���igg:");  
		Сʱ�ϳ���.setForeground(Color.WHITE);
		Сʱ�ϳ���.setBounds(10+220*1, 32+ 25*11, 100, 20);jFrameList.add(Сʱ�ϳ���);
		Сʱ�ϳ���.indexString= "XSHCLIG";
		JTextField Сʱ�ϳ���_box= new JTextField();
		Сʱ�ϳ���_box.setBounds(10+ 110+220*1, 33+ 25*11, 80, 20);
		Сʱ�ϳ���_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(Сʱ�ϳ���_box
						, "�������߲��۲�ָ���"
						, "�������߲��۲�ָ���" 
						, "" 
						,3, 9, ��Ͻ��_box
						, "");
			}
		});
		this.add(Сʱ�ϳ���);
		this.add(Сʱ�ϳ���_box);	
		//13
		DetaLabel �ȱ�ת��ø= new DetaLabel("�ȱ�ת��øalt:");  
		�ȱ�ת��ø.setForeground(Color.WHITE);
		�ȱ�ת��ø.setBounds(10+220*1, 32+ 25*12, 100, 20);jFrameList.add(�ȱ�ת��ø);
		�ȱ�ת��ø.indexString= "GBZAMALT";
		JTextField �ȱ�ת��ø_box= new JTextField();
		�ȱ�ת��ø_box.setBounds(10+ 110+220*1, 33+ 25*12, 80, 20);
		�ȱ�ת��ø_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(�ȱ�ת��ø_box
						, ""
						, "���ߣ������ڼ����Ը��ף�ҩ���Ը����ˣ�֬���Σ���Ӳ�����Ĺ������������ȡ�" 
						, "" 
						,5, 40, ��Ͻ��_box
						, "");
			}
		});
		this.add(�ȱ�ת��ø);
		this.add(�ȱ�ת��ø_box);	
		//14
		DetaLabel �ȵ�ϸ������= new DetaLabel("�ȵ�ϸ������ica:");  
		�ȵ�ϸ������.setForeground(Color.WHITE);
		�ȵ�ϸ������.setBounds(10+220*1, 32+ 25*13, 100, 20);jFrameList.add(�ȵ�ϸ������);
		�ȵ�ϸ������.indexString= "YDXBICA";
		JTextField �ȵ�ϸ������_box= new JTextField();
		�ȵ�ϸ������_box.setBounds(10+ 110+220*1, 33+ 25*13, 80, 20);
		�ȵ�ϸ������_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(�ȵ�ϸ������);
		this.add(�ȵ�ϸ������_box);	
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
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@SuppressWarnings("deprecation")
	@Override
	public void mouseMoved(MouseEvent e) {
		if(!DetaLabelStables.stableImages.target) {
			return;
		}
		if(!jFrameList.isEmpty()) {
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& detaLabel.frameTag.isShowing()) {
					detaLabel.frameTag.hide();
					detaLabel.validate();
				}
			}
			DetaLabelStables.stableImages.setTarget(false);
		}
	}	
}
