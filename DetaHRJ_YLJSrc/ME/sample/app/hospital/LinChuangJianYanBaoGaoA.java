package ME.sample.app.hospital;

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

import comp.detaButton.DetaButton;
import comp.detaLabel.DetaLabel;

public class LinChuangJianYanBaoGaoA extends JPanel implements MouseListener, KeyListener
, ActionListener, MouseMotionListener{
	//����׼����ҽѧ���鱨��ĵ�λ���и�ʽ�� �淶��,���¿�ʼ 20210401
	//������
	public List<DetaLabel> jFrameList;
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

		//copy tab
		DetaLabel baiDanBai= new DetaLabel("�׵���alb:");  
		baiDanBai.setForeground(Color.WHITE);
		baiDanBai.setBounds(10, 32+ 25*0, 100, 25);  
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
		�Ҹ����԰�.setBounds(10, 32+ 25*1, 100, 25);
		�Ҹ����԰�.setTag("��ҽ���飺�Ҹ����԰�HbcAb->�ٴ�����:->ʵ���Ҽ��:����", true);
		
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
		������ʵ��.setForeground(Color.WHITE);
		������ʵ��.setBounds(10, 32+ 25*2, 100, 25);
		
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
	}
	private void addFifthColomns(JTextField ��Ͻ��_box, List<DetaLabel> jFrameList) {
		// TODO Auto-generated method stub
		//copy tab
		DetaLabel baiDanBai222223= new DetaLabel("Ѫ��͸ѹѪosm:");  
		baiDanBai222223.setForeground(Color.WHITE);
		baiDanBai222223.setBounds(10+220*4, 32+ 0, 100, 20);jFrameList.add(baiDanBai222223);
		
		JTextField baiDanBai222223_box= new JTextField();
		baiDanBai222223_box.setBounds(10+ 110+220*4, 33+ 0, 80, 20);
		baiDanBai222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				String temp= baiDanBai222223_box.getText();
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
		this.add(baiDanBai222223);
		this.add(baiDanBai222223_box);	

		DetaLabel label2222223= new DetaLabel("���������cor:");  
		label2222223.setForeground(Color.WHITE);
		label2222223.setBounds(10+220*4, 32+ 25*1, 100, 20);jFrameList.add(label2222223);
		
		JTextField label2222223_box= new JTextField();
		label2222223_box.setBounds(10+ 110+220*4, 33+ 25*1, 80, 20);
		label2222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				String temp= label2222223_box.getText();
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
		this.add(label2222223);
		this.add(label2222223_box);	

		DetaLabel label3222223= new DetaLabel("Ѫ����ͭcu:");  
		label3222223.setForeground(Color.WHITE);
		label3222223.setBounds(10+220*4, 32+ 25*2, 100, 20);jFrameList.add(label3222223);
		
		JTextField label3222223_box= new JTextField();
		label3222223_box.setBounds(10+ 110+220*4, 33+ 25*2, 80, 20);
		label3222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				String temp= label3222223_box.getText();
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
		this.add(label3222223);
		this.add(label3222223_box);	

		DetaLabel label4222223= new DetaLabel("�������igg:");  
		label4222223.setForeground(Color.WHITE);
		label4222223.setBounds(10+ 220*4, 32+ 25* 3, 100, 20);jFrameList.add(label4222223);
		
		JTextField label4222223_box= new JTextField();
		label4222223_box.setBounds(10+ 110+220*4, 33+ 25* 3, 80, 20);
		label4222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				String temp= label4222223_box.getText();
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
		this.add(label4222223);
		this.add(label4222223_box);	

		DetaLabel label5222223= new DetaLabel("��״���ټ���pth:");  
		label5222223.setForeground(Color.WHITE);
		label5222223.setBounds(10+220*4, 32+ 25*4, 100, 20);jFrameList.add(label5222223);
		
		JTextField label5222223_box= new JTextField();
		label5222223_box.setBounds(10+ 110+220*4, 33+ 25*4, 80, 20);
		label5222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				String temp= label5222223_box.getText();
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
		this.add(label5222223);
		this.add(label5222223_box);	

		DetaLabel label6222223= new DetaLabel("��3-������4-�ǻ��������ᣨvma��:");  
		label6222223.setForeground(Color.WHITE);
		label6222223.setBounds(10+220*4, 32+ 25*5, 100, 20);jFrameList.add(label6222223);
		
		JTextField label6222223_box= new JTextField();
		label6222223_box.setBounds(10+ 110+220*4, 33+ 25*5, 80, 20);
		label6222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				String temp= label6222223_box.getText();
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
		this.add(label6222223);
		this.add(label6222223_box);	

		//7
		DetaLabel label7222223= new DetaLabel("��֬����ap0alap0al:");  
		label7222223.setForeground(Color.WHITE);
		label7222223.setBounds(10+220*4, 32+ 25*6, 100, 20);jFrameList.add(label7222223);
		
		JTextField label7222223_box= new JTextField();
		label7222223_box.setBounds(10+ 110+220*4, 33+ 25*6, 80, 20);
		label7222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				String temp= label7222223_box.getText();
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
		this.add(label7222223);
		this.add(label7222223_box);	
		//8
		DetaLabel label68222223= new DetaLabel("���Ƶ���itni:");  
		label68222223.setForeground(Color.WHITE);
		label68222223.setBounds(10+220*4, 32+ 25*7, 100, 20);jFrameList.add(label68222223);
		
		JTextField label68222223_box= new JTextField();
		label68222223_box.setBounds(10+ 110+220*4, 33+ 25*7, 80, 20);
		label68222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				String temp= label68222223_box.getText();
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
		this.add(label68222223);
		this.add(label68222223_box);	
		//9
		DetaLabel label69222223= new DetaLabel("�ȴ�������as-d��øȾɫ:");  
		label69222223.setForeground(Color.WHITE);
		label69222223.setBounds(10+220*4, 32+ 25*8, 100, 20);jFrameList.add(label69222223);
		
		JTextField label69222223_box= new JTextField();
		label69222223_box.setBounds(10+ 110+220*4, 33+ 25*8, 80, 20);
		label69222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				String temp= label69222223_box.getText();
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
		this.add(label69222223);
		this.add(label69222223_box);	
		//10
		DetaLabel label610222223= new DetaLabel("����lact:");  
		label610222223.setForeground(Color.WHITE);
		label610222223.setBounds(10+220*4, 32+ 25*9, 100, 20);jFrameList.add(label610222223);
		
		JTextField label610222223_box= new JTextField();
		label610222223_box.setBounds(10+ 110+220*4, 33+ 25*9, 80, 20);
		label610222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				String temp= label7222223_box.getText();
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
		this.add(label610222223);
		this.add(label610222223_box);	
		//11
		DetaLabel label611222223= new DetaLabel("������ǿ�ԭ242���ca242:");  
		label611222223.setForeground(Color.WHITE);
		label611222223.setBounds(10+220*4, 32+ 25*10, 100, 20);jFrameList.add(label611222223);
		
		JTextField label611222223_box= new JTextField();
		label611222223_box.setBounds(10+ 110+220*4, 33+ 25*10, 80, 20);
		label611222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				String temp= label611222223_box.getText();
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
		this.add(label611222223);
		this.add(label611222223_box);	
		//12
		DetaLabel label612222223= new DetaLabel("��ca:");  
		label612222223.setForeground(Color.WHITE);
		label612222223.setBounds(10+220*4, 32+ 25*11, 100, 20);jFrameList.add(label612222223);
		
		JTextField label612222223_box= new JTextField();
		label612222223_box.setBounds(10+ 110+220*4, 33+ 25*11, 80, 20);
		label612222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(label612222223_box
						, "���ͣ�������ά����Dȱ������¥������ǲ���С������鴤֢������������ɣ���״���ٹ��ܼ��ˣ��������ף���֢���͸���ʳ�����ղ���" 
						, "���ߣ����ڹ���������״���ٻ��ܿ��������Թ�ή����������Ƥ֬���ܼ��˼�ά����D��������ȡ�"
						, "" 
						,8.5 ,11, ��Ͻ��_box
						, "");
			}
		});
		this.add(label612222223);
		this.add(label612222223_box);	
		//13
		DetaLabel label613222223= new DetaLabel("����ϸ����Ⱦ��������-1��mip-1��:");  
		label613222223.setForeground(Color.WHITE);
		label613222223.setBounds(10+220*4, 32+ 25*12, 100, 20);jFrameList.add(label613222223);
		
		JTextField label613222223_box= new JTextField();
		label613222223_box.setBounds(10+ 110+220*4, 33+ 25*12, 80, 20);
		label613222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label613222223);
		this.add(label613222223_box);	
		//14
		DetaLabel label614222223= new DetaLabel("��17-�ǹ̴�17-oh:");  
		label614222223.setForeground(Color.WHITE);
		label614222223.setBounds(10+220*4, 32+ 25*13, 100, 20);jFrameList.add(label614222223);
		
		JTextField label614222223_box= new JTextField();
		label614222223_box.setBounds(10+ 110+ 220* 4, 33+ 25* 13, 80, 20);
		label614222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(label614222223_box
						, "���ͣ���������Ƥ�ʹ��ܲ�ȫ���簢��ɭ�ϲ���" 
						, "���ߣ����ڿ������ۺ�֢������֢���׿���������Ƥ���ܿ�������������������������"
						, "" ,3 ,11, ��Ͻ��_box, "");
			}
		});
		this.add(label614222223);
		this.add(label614222223_box);	
	}

	protected void printValue(JTextField label612222223_box, String minString, String maxString, String elseString
			, double min, double max, JTextField ��Ͻ��_box, String yinyang) {
		//��״̬��
		String temp= label612222223_box.getText();
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
		DetaLabel baiDanBai222223= new DetaLabel("ldhͬ��øis0-ldh:");  
		baiDanBai222223.setForeground(Color.WHITE);
		baiDanBai222223.setBounds(10+220*3, 32+ 0, 100, 20);jFrameList.add(baiDanBai222223);
		JTextField baiDanBai222223_box= new JTextField();
		baiDanBai222223_box.setBounds(10+ 110+220*3, 33+ 0, 80, 20);
		baiDanBai222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(baiDanBai222223);
		this.add(baiDanBai222223_box);	

		DetaLabel label2222223= new DetaLabel("�ȵ���ins:");  
		label2222223.setForeground(Color.WHITE);
		label2222223.setBounds(10+220*3, 32+ 25*1, 100, 20);jFrameList.add(label2222223);
		JTextField label2222223_box= new JTextField();
		label2222223_box.setBounds(10+ 110+220*3, 33+ 25*1, 80, 20);
		label2222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label2222223);
		this.add(label2222223_box);	

		DetaLabel label3222223= new DetaLabel("ͬt:");  
		label3222223.setForeground(Color.WHITE);
		label3222223.setBounds(10+220*3, 32+ 25*2, 100, 20);jFrameList.add(label3222223);
		JTextField label3222223_box= new JTextField();
		label3222223_box.setBounds(10+ 110+220*3, 33+ 25*2, 80, 20);
		label3222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label3222223);
		this.add(label3222223_box);	

		DetaLabel label4222223= new DetaLabel("���øamy:");  
		label4222223.setForeground(Color.WHITE);
		label4222223.setBounds(10+220*3, 32+ 25* 3, 100, 20);jFrameList.add(label4222223);
		JTextField label4222223_box= new JTextField();
		label4222223_box.setBounds(10+ 110+220*3, 33+ 25* 3, 80, 20);
		label4222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(label4222223_box
						, "���ͣ����ڸ��༲������ΰ�����Ӳ����"
						, "���ߣ����ڼ����������ף����ٰ�������������θ���ף������裬�����ף���Һ���׵ȡ�" 
						,"" ,110 ,110, ��Ͻ��_box, "");
			}
		});
		this.add(label4222223);
		this.add(label4222223_box);	

		DetaLabel label5222223= new DetaLabel("��������øldh:");  
		label5222223.setForeground(Color.WHITE);
		label5222223.setBounds(10+220*3, 32+ 25*4, 100, 20);jFrameList.add(label5222223);
		JTextField label5222223_box= new JTextField();
		label5222223_box.setBounds(10+ 110+220*3, 33+ 25*4, 80, 20);
		label5222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label5222223);
		this.add(label5222223_box);	

		DetaLabel label6222223= new DetaLabel("��tron:");  
		label6222223.setForeground(Color.WHITE);
		label6222223.setBounds(10+220*3, 32+ 25*5, 100, 20);jFrameList.add(label6222223);
		JTextField label6222223_box= new JTextField();
		label6222223_box.setBounds(10+ 110+220*3, 33+ 25*5, 80, 20);
		label6222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label6222223);
		this.add(label6222223_box);	

		//7
		DetaLabel label7222223= new DetaLabel("��������ø�;�ʯ��l+:");  
		label7222223.setForeground(Color.WHITE);
		label7222223.setBounds(10+220*3, 32+ 25*6, 100, 20);jFrameList.add(label7222223);
		JTextField label7222223_box= new JTextField();
		label7222223_box.setBounds(10+ 110+220*3, 33+ 25*6, 80, 20);
		label7222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label7222223);
		this.add(label7222223_box);	
		//8
		DetaLabel label68222223= new DetaLabel("��ϸ���̼�����g-csf:");  
		label68222223.setForeground(Color.WHITE);
		label68222223.setBounds(10+220*3, 32+ 25*7, 100, 20);jFrameList.add(label68222223);
		JTextField label68222223_box= new JTextField();
		label68222223_box.setBounds(10+ 110+220*3, 33+ 25*7, 80, 20);
		label68222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label68222223);
		this.add(label68222223_box);	
		//9
		DetaLabel label69222223= new DetaLabel("�Ƽ���el:");  
		label69222223.setForeground(Color.WHITE);
		label69222223.setBounds(10+220*3, 32+ 25*8, 100, 20);jFrameList.add(label69222223);
		JTextField label69222223_box= new JTextField();
		label69222223_box.setBounds(10+ 110+220*3, 33+ 25*8, 80, 20);
		label69222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label69222223);
		this.add(label69222223_box);	
		//10
		DetaLabel label610222223= new DetaLabel("ͬ��øck-mb:");  
		label610222223.setForeground(Color.WHITE);
		label610222223.setBounds(10+220*3, 32+ 25*9, 100, 20);jFrameList.add(label610222223);
		JTextField label610222223_box= new JTextField();
		label610222223_box.setBounds(10+ 110+220*3, 33+ 25*9, 80, 20);
		label610222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label610222223);
		this.add(label610222223_box);	
		//11
		DetaLabel label611222223= new DetaLabel("����͸ѹ��osm:");  
		label611222223.setForeground(Color.WHITE);
		label611222223.setBounds(10+220*3, 32+ 25*10, 100, 20);jFrameList.add(label611222223);
		JTextField label611222223_box= new JTextField();
		label611222223_box.setBounds(10+ 110+220*3, 33+ 25*10, 80, 20);
		label611222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(label611222223_box
						, "ϡ�ͣ��ɷ�ӦԶ����С�ܵ�Ũ��ϡ��֢�ȼ�������ϼ��������"
						, "Ũ���ɷ�ӦԶ����С�ܵ�Ũ��ϡ��֢�ȼ�������ϼ��������" 
						, "" 
						,600, 800, ��Ͻ��_box
						, "");
			}
		});
		this.add(label611222223);
		this.add(label611222223_box);	
		//12
		DetaLabel label612222223= new DetaLabel("���ӡ������tb-poc:");  
		label612222223.setForeground(Color.WHITE);
		label612222223.setBounds(10+220*3, 32+ 25*11, 100, 20);jFrameList.add(label612222223);
		JTextField label612222223_box= new JTextField();
		label612222223_box.setBounds(10+ 110+220*3, 33+ 25*11, 80, 20);
		label612222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label612222223);
		this.add(label612222223_box);	
		//13
		DetaLabel label613222223= new DetaLabel("�����Ѱ���ada:");  
		label613222223.setForeground(Color.WHITE);
		label613222223.setBounds(10+220*3, 32+ 25*12, 100, 20);jFrameList.add(label613222223);
		JTextField label613222223_box= new JTextField();
		label613222223_box.setBounds(10+ 110+220*3, 33+ 25*12, 80, 20);
		label613222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label613222223);
		this.add(label613222223_box);	
		//14
		DetaLabel label614222223= new DetaLabel("����ʪ������:");  
		label614222223.setForeground(Color.WHITE);
		label614222223.setBounds(10+220*3, 32+ 25*13, 100, 20);jFrameList.add(label614222223);
		JTextField label614222223_box= new JTextField();
		label614222223_box.setBounds(10+ 110+220*3, 33+ 25*13, 80, 20);
		label614222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label614222223);
		this.add(label614222223_box);	
	}

	private void addThirdColomns(JTextField ��Ͻ��_box, List<DetaLabel> jFrameList) {
		// TODO Auto-generated method stub
		//copy tab
		DetaLabel baiDanBai222223= new DetaLabel("�괯����sarcoptesscabidiexamination:");  
		baiDanBai222223.setForeground(Color.WHITE);
		baiDanBai222223.setBounds(10+220*2, 32+ 0, 100, 20);jFrameList.add(baiDanBai222223);
		JTextField baiDanBai222223_box= new JTextField();
		baiDanBai222223_box.setBounds(10+ 110+220*2, 33+ 0, 80, 20);
		baiDanBai222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(baiDanBai222223);
		this.add(baiDanBai222223_box);	

		DetaLabel label2222223= new DetaLabel("��ɫ���������:");  
		label2222223.setForeground(Color.WHITE);
		label2222223.setBounds(10+220*2, 32+ 25*1, 100, 20);jFrameList.add(label2222223);
		JTextField label2222223_box= new JTextField();
		label2222223_box.setBounds(10+ 110+220*2, 33+ 25*1, 80, 20);
		label2222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label2222223);
		this.add(label2222223_box);	

		DetaLabel label3222223= new DetaLabel("�ܵ�����tbil:");  
		label3222223.setForeground(Color.WHITE);
		label3222223.setBounds(10+220*2, 32+ 25*2, 100, 20);jFrameList.add(label3222223);
		JTextField label3222223_box= new JTextField();
		label3222223_box.setBounds(10+ 110+220*2, 33+ 25*2, 80, 20);
		label3222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label3222223);
		this.add(label3222223_box);	

		DetaLabel label4222223= new DetaLabel("ֱ�ӵ�����dbil:");  
		label4222223.setForeground(Color.WHITE);
		label4222223.setBounds(10+220*2, 32+ 25* 3, 100, 20);jFrameList.add(label4222223);
		JTextField label4222223_box= new JTextField();
		label4222223_box.setBounds(10+ 110+220*2, 33+ 25* 3, 80, 20);
		label4222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(label4222223_box
						, ""
						, "���ߣ������������Ի��㣬�ΰ�����ͷ������ʯ֢��" 
						, "" 
						,0, 0.4, ��Ͻ��_box
						, "");
			}
		});
		this.add(label4222223);
		this.add(label4222223_box);	

		DetaLabel label5222223= new DetaLabel("��������patchtest:");  
		label5222223.setForeground(Color.WHITE);
		label5222223.setBounds(10+220*2, 32+ 25*4, 100, 20);jFrameList.add(label5222223);
		JTextField label5222223_box= new JTextField();
		label5222223_box.setBounds(10+ 110+220*2, 33+ 25*4, 80, 20);
		label5222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label5222223);
		this.add(label5222223_box);	

		DetaLabel label6222223= new DetaLabel("Ѫþmg:");  
		label6222223.setForeground(Color.WHITE);
		label6222223.setBounds(10+220*2, 32+ 25*5, 100, 20);jFrameList.add(label6222223);
		JTextField label6222223_box= new JTextField();
		label6222223_box.setBounds(10+ 110+220*2, 33+ 25*5, 80, 20);
		label6222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label6222223);
		this.add(label6222223_box);	

		//7
		DetaLabel label7222223= new DetaLabel("�׸ο���-igmhav-igmigmhav-igm:");  
		label7222223.setForeground(Color.WHITE);
		label7222223.setBounds(10+220*2, 32+ 25*6, 100, 20);jFrameList.add(label7222223);
		JTextField label7222223_box= new JTextField();
		label7222223_box.setBounds(10+ 110+220*2, 33+ 25*6, 80, 20);
		label7222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label7222223);
		this.add(label7222223_box);	
		//8
		DetaLabel label68222223= new DetaLabel("���ἤøck:");  
		label68222223.setForeground(Color.WHITE);
		label68222223.setBounds(10+220*2, 32+ 25*7, 100, 20);jFrameList.add(label68222223);
		JTextField label68222223_box= new JTextField();
		label68222223_box.setBounds(10+ 110+220*2, 33+ 25*7, 80, 20);
		label68222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(label68222223_box
						, "����"
						, "���ߣ��Ĺ�4-6Сʱ��ʼ���ߣ�18-36Сʱ�ɴ�����ֵ��20-30����Ϊ��߷壬2-4��ָ����������⣬�������ļ��ף�Ƥ���ף��������ˣ���Ӫ���������İ��ף���Ѫ�����⼰���������ȶ�����ʹCK����" 
						, "" 
						, 25, 200, ��Ͻ��_box
						, "");
			}
		});
		this.add(label68222223);
		this.add(label68222223_box);	
		//9
		DetaLabel label69222223= new DetaLabel("���̴�tc:");  
		label69222223.setForeground(Color.WHITE);
		label69222223.setBounds(10+220*2, 32+ 25*8, 100, 20);jFrameList.add(label69222223);
		JTextField label69222223_box= new JTextField();
		label69222223_box.setBounds(10+ 110+220*2, 33+ 25*8, 80, 20);
		label69222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label69222223);
		this.add(label69222223_box);	
		//10
		DetaLabel label610222223= new DetaLabel("���ܶ�֬����hdl-c:");  
		label610222223.setForeground(Color.WHITE);
		label610222223.setBounds(10+220*2, 32+ 25*9, 100, 20);jFrameList.add(label610222223);
		JTextField label610222223_box= new JTextField();
		label610222223_box.setBounds(10+ 110+220*2, 33+ 25*9, 80, 20);
		label610222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(label610222223_box
						, "���ͣ�������Ѫ�ܲ������Ĳ�����TGѪ֢�����ؼ��������������̣�ȱ���˶��ȡ�"
						, "" 
						, "" 
						,35, 70, ��Ͻ��_box
						, "");

			}
		});
		this.add(label610222223);
		this.add(label610222223_box);	
		//11
		DetaLabel label611222223= new DetaLabel("rents:");  
		label611222223.setForeground(Color.WHITE);
		label611222223.setBounds(10+220*2, 32+ 25*10, 100, 20);jFrameList.add(label611222223);
		JTextField label611222223_box= new JTextField();
		label611222223_box.setBounds(10+ 110+220*2, 33+ 25*10, 80, 20);
		label611222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label611222223);
		this.add(label611222223_box);	
		//12
		DetaLabel label612222223= new DetaLabel("����cre:");  
		label612222223.setForeground(Color.WHITE);
		label612222223.setBounds(10+220*2, 32+ 25*11, 100, 20);jFrameList.add(label612222223);
		JTextField label612222223_box= new JTextField();
		label612222223_box.setBounds(10+ 110+220*2, 33+ 25*11, 80, 20);
		label612222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label612222223);
		this.add(label612222223_box);	
		//13
		DetaLabel label613222223= new DetaLabel("��ϸ������igm���嶨��cmc:");  
		label613222223.setForeground(Color.WHITE);
		label613222223.setBounds(10+220*2, 32+ 25*12, 100, 20);jFrameList.add(label613222223);
		JTextField label613222223_box= new JTextField();
		label613222223_box.setBounds(10+ 110+220*2, 33+ 25*12, 80, 20);
		label613222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label613222223);
		this.add(label613222223_box);	
		//14
		DetaLabel label614222223= new DetaLabel("Ҷ��:");  
		label614222223.setForeground(Color.WHITE);
		label614222223.setBounds(10+220*2, 32+ 25*13, 100, 20);jFrameList.add(label614222223);
		JTextField label614222223_box= new JTextField();
		label614222223_box.setBounds(10+ 110+220*2, 33+ 25*13, 80, 20);
		label614222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(label614222223_box
						, "���ͣ�ƶѪ��"
						, "" 
						, "" 
						, 3, 17, ��Ͻ��_box
						, "");
			}
		});
		this.add(label614222223);
		this.add(label614222223_box);	
	}

	private void addSecondColomns(JTextField ��Ͻ��_box, List<DetaLabel> jFrameList) {
		// TODO Auto-generated method stub
		//copy tab
		DetaLabel baiDanBai22= new DetaLabel("�ף���:");  
		baiDanBai22.setForeground(Color.WHITE);
		baiDanBai22.setBounds(10+220*1, 32+ 0, 100, 20);jFrameList.add(baiDanBai22);
		JTextField baiDanBai22_box= new JTextField();
		baiDanBai22_box.setBounds(10+ 110+220*1, 33+ 0, 80, 20);
		baiDanBai22_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(baiDanBai22_box
						, "���ͣ����ڼ�״���ٻ��ܼ��ˣ������������֢"
						, "���ߣ����ڼ�״���ٻ��ܿ���" 
						, "" 
						,23, 48, ��Ͻ��_box
						, "");
			}
		});
		this.add(baiDanBai22);
		this.add(baiDanBai22_box);	

		DetaLabel ����ϸ��Դ��= new DetaLabel("����ϸ��Դ������-1sdf-1:");  
		����ϸ��Դ��.setForeground(Color.WHITE);
		����ϸ��Դ��.setBounds(10+220*1, 32+ 25*1, 100, 20);jFrameList.add(����ϸ��Դ��);
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
		JTextField �ȵ�ϸ������_box= new JTextField();
		�ȵ�ϸ������_box.setBounds(10+ 110+220*1, 33+ 25*13, 80, 20);
		�ȵ�ϸ������_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(�ȵ�ϸ������);
		this.add(�ȵ�ϸ������);	
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
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@SuppressWarnings("deprecation")
	@Override
	public void mouseMoved(MouseEvent e) {
//		if(!jFrameList.isEmpty()) {
//			for(int i=0;i<jFrameList.size();i++) {
//				JFrame jFrame= jFrameList.get(i);
//				if(null!= jFrame&& jFrame.isShowing()) {
//					jFrame.hide();
//				}
//			}
//			//			Iterator<JFrame> iterator= jFrameList.iterator();
//			//			while(iterator.hasNext()) {
//			//				JFrame jFrame= iterator.next();
//			//				if(null!= jFrame&& jFrame.isShowing()) {
//			//					jFrame.hide();
//			//				}
//			//			}
//		}
		// TODO Auto-generated method stub
		if(!jFrameList.isEmpty()) {
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& detaLabel.frameTag.isShowing()) {
					detaLabel.frameTag.hide();
					detaLabel.validate();
				}
			}
		}
	}	
}
