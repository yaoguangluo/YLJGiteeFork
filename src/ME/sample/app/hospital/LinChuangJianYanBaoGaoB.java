package ME.sample.app.hospital;

import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import ME.sample.App;
import comp.jbutton.DetaButton;

public class LinChuangJianYanBaoGaoB  extends JPanel implements MouseListener, KeyListener, ActionListener{

	private static final long serialVersionUID= 1L;
	public JTextField ��Ͻ��_box;
	public LinChuangJianYanBaoGaoB(JTextPane name, App app){
		this.setLayout(null);
		this.setBounds(0, 0, 1180, 610);
		this.setBackground(Color.BLACK);	
		
		//1���� ������� �ұ������
		//1���� ������� �ұ������
		JLabel ��Ͻ��= new JLabel("��Ͻ�� :");  
		��Ͻ��.setForeground(Color.white);
		��Ͻ��.setBounds(10, 20+ 300+ 90, 100, 50);
		��Ͻ��_box= new JTextField();
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

		// TODO Auto-generated method stub
		//copy tab
		JLabel baiDanBai22= new JLabel("ȫѪ��:");  
		baiDanBai22.setForeground(Color.WHITE);
		baiDanBai22.setBounds(10+220*0, 20+ 0, 100, 50);
		JTextField baiDanBai22_box= new JTextField();
		baiDanBai22_box.setBounds(10+ 110+220*0, 33+ 0, 80, 20);
		baiDanBai22_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				String temp= baiDanBai22_box.getText();
				��Ͻ��_box.setText(��Ͻ��_box.getText()+ temp);
			}
		});
		this.add(baiDanBai22);
		this.add(baiDanBai22_box);	

		JLabel label222= new JLabel("������ǿ�ԭ242���ca242:");  
		label222.setForeground(Color.WHITE);
		label222.setBounds(10+220*0, 20+ 25*1, 100, 50);
		JTextField label222_box= new JTextField();
		label222_box.setBounds(10+ 110+220*0, 33+ 25*1, 80, 20);
		label222_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label222);
		this.add(label222_box);	

		JLabel label322= new JLabel("����ԭ��⣨1�������颡��2�������颢��3��ʳ���颣��4��ʳ���颤ivtivt-��ivt-��ivt-��ivt-�� :");  
		label322.setForeground(Color.WHITE);
		label322.setBounds(10+220*0, 20+ 25*2, 100, 50);
		JTextField label322_box= new JTextField();
		label322_box.setBounds(10+ 110+220*0, 33+ 25*2, 80, 20);
		label322_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label322);
		this.add(label322_box);	

		JLabel label422= new JLabel("��ca:");  
		label422.setForeground(Color.WHITE);
		label422.setBounds(10+220*0, 20+ 25* 3, 100, 50);
		JTextField label422_box= new JTextField();
		label422_box.setBounds(10+ 110+220*0, 33+ 25* 3, 80, 20);
		label422_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label422);
		this.add(label422_box);	

		JLabel label522= new JLabel("����ϸ����Ⱦ��������-1��mip-1��:");  
		label522.setForeground(Color.WHITE);
		label522.setBounds(10+220*0, 20+ 25*4, 100, 50);
		JTextField label522_box= new JTextField();
		label522_box.setBounds(10+ 110+220*0, 33+ 25*4, 80, 20);
		label522_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label522);
		this.add(label522_box);	

		JLabel label622= new JLabel("��17-�ǹ̴�17-oh :");  
		label622.setForeground(Color.WHITE);
		label622.setBounds(10+220*0, 20+ 25*5, 100, 50);
		JTextField label622_box= new JTextField();
		label622_box.setBounds(10+ 110+220*0, 33+ 25*5, 80, 20);
		label622_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label622);
		this.add(label622_box);	

		//7
		JLabel label722= new JLabel("�ٻ���������lh :");  
		label722.setForeground(Color.WHITE);
		label722.setBounds(10+220*0, 20+ 25*6, 100, 50);
		JTextField label722_box= new JTextField();
		label722_box.setBounds(10+ 110+220*0, 33+ 25*6, 80, 20);
		label722_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label722);
		this.add(label722_box);	
		//8
		JLabel label6822= new JLabel("�Ҹα��濹ԭhbsag:");  
		label6822.setForeground(Color.WHITE);
		label6822.setBounds(10+220*0, 20+ 25*7, 100, 50);
		JTextField label6822_box= new JTextField();
		label6822_box.setBounds(10+ 110+220*0, 33+ 25*7, 80, 20);
		label6822_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label6822);
		this.add(label6822_box);	
		//9
		JLabel label6922= new JLabel("ë�ҳ澵��demodexfolliculorumexamination :");  
		label6922.setForeground(Color.WHITE);
		label6922.setBounds(10+220*0, 20+ 25*8, 100, 50);
		JTextField label6922_box= new JTextField();
		label6922_box.setBounds(10+ 110+220*0, 33+ 25*8, 80, 20);
		label6922_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label6922);
		this.add(label6922_box);	
		//10
		JLabel label61022= new JLabel("��������Ƥ�ʼ���acth :");  
		label61022.setForeground(Color.WHITE);
		label61022.setBounds(10+220*0, 20+ 25*9, 100, 50);
		JTextField label61022_box= new JTextField();
		label61022_box.setBounds(10+ 110+220*0, 33+ 25*9, 80, 20);
		label61022_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label61022);
		this.add(label61022_box);	
		//11
		JLabel label61122= new JLabel("������igm,�������Զ���toxo:");  
		label61122.setForeground(Color.WHITE);
		label61122.setBounds(10+220*0, 20+ 25*10, 100, 50);
		JTextField label61122_box= new JTextField();
		label61122_box.setBounds(10+ 110+220*0, 33+ 25*10, 80, 20);
		label61122_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label61122);
		this.add(label61122_box);	
		//12
		JLabel label61222= new JLabel("��֬����ap0bap0b:");  
		label61222.setForeground(Color.WHITE);
		label61222.setBounds(10+220*0, 20+ 25*11, 100, 50);
		JTextField label61222_box= new JTextField();
		label61222_box.setBounds(10+ 110+220*0, 33+ 25*11, 80, 20);
		label61222_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(label61222_box
						, "���ͣ������ڸ�ʵ���Բ���"
						, "���ߣ������ڸ�֬Ѫ֢�����Ĳ�����м����" 
						, "" 
						,75, 123, ��Ͻ��_box
						, "");
			}
		});
		this.add(label61222);
		this.add(label61222_box);	
		//13
		JLabel label61322= new JLabel("����uric :");  
		label61322.setForeground(Color.WHITE);
		label61322.setBounds(10+220*0, 20+ 25*12, 100, 50);
		JTextField label61322_box= new JTextField();
		label61322_box.setBounds(10+ 110+220*0, 33+ 25*12, 80, 20);
		label61322_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(label61322_box
						, "���ͣ����ڶ���ƶѪ��������Ƥ�ʼ��ص�ҩ�����ƺ�"
						, "���ߣ�����ʹ�磬�����Ѫ������ϸ������֢���෢�Թ���������������С�����ס�" 
						, "" 
						,2.5, 7.7, ��Ͻ��_box
						, "");
			}
		});
		this.add(label61322);
		this.add(label61322_box);	
		//14
		JLabel label61422= new JLabel("�ȸ����� :");  
		label61422.setForeground(Color.WHITE);
		label61422.setBounds(10+220*0, 20+ 25*13, 100, 50);
		JTextField label61422_box= new JTextField();
		label61422_box.setBounds(10+ 110+220*0, 33+ 25*13, 80, 20);
		label61422_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(label61422_box
						, ":�ⶨ�ȵ�aϸ�����ܹ���"
						, ":�ⶨ�ȵ�aϸ�����ܹ���" 
						, "" 
						,40, 130, ��Ͻ��_box
						, "");
			}
		});
		this.add(label61422);
		this.add(label61422_box);	
		//
		addSecondColomns(��Ͻ��_box);
		addThirdColomns(��Ͻ��_box);
		addFourthColomns(��Ͻ��_box);
		addFifthColomns(��Ͻ��_box);
	}
	private void addFifthColomns(JTextField ��Ͻ��_box2) {
		// TODO Auto-generated method stub
		//copy tab
		JLabel baiDanBai222223= new JLabel("���ž���ԭ���:");  
		baiDanBai222223.setForeground(Color.WHITE);
		baiDanBai222223.setBounds(10+220*1, 20+ 0, 100, 50);
		JTextField baiDanBai222223_box= new JTextField();
		baiDanBai222223_box.setBounds(10+ 110+220*1, 33+ 0, 80, 20);
		baiDanBai222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(baiDanBai222223);
		this.add(baiDanBai222223_box);	

		JLabel label2222223= new JLabel("�������ȡ��cultureoffungi :");  
		label2222223.setForeground(Color.WHITE);
		label2222223.setBounds(10+220*1, 20+ 25*1, 100, 50);
		JTextField label2222223_box= new JTextField();
		label2222223_box.setBounds(10+ 110+220*1, 33+ 25*1, 80, 20);
		label2222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label2222223);
		this.add(label2222223_box);	

		JLabel label3222223= new JLabel("ת��øggt :");  
		label3222223.setForeground(Color.WHITE);
		label3222223.setBounds(10+220*1, 20+ 25*2, 100, 50);
		JTextField label3222223_box= new JTextField();
		label3222223_box.setBounds(10+ 110+220*1, 33+ 25*2, 80, 20);
		label3222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(label3222223_box
						, ""
						, "���ߣ�������ԭ���Ի�ת���Ըΰ������Ը��ף����Ը��׻�ڣ���Ӳ�������������׼�����˥�ߵ�" 
						, "" 
						,8, 50, ��Ͻ��_box
						, "");
			}
		});
		this.add(label3222223);
		this.add(label3222223_box);	

		JLabel label4222223= new JLabel("�����黯���immunohistophathol-ogicstain :");  
		label4222223.setForeground(Color.WHITE);
		label4222223.setBounds(10+220*1, 20+ 25* 3, 100, 50);
		JTextField label4222223_box= new JTextField();
		label4222223_box.setBounds(10+ 110+220*1, 33+ 25* 3, 80, 20);
		label4222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label4222223);
		this.add(label4222223_box);	

		JLabel label5222223= new JLabel("�����յ�ѪС��ۼ����ܲ��ԣ�mulitipleagentplateletaggregationtest��4-pagt :");  
		label5222223.setForeground(Color.WHITE);
		label5222223.setBounds(10+220*1, 20+ 25*4, 100, 50);
		JTextField label5222223_box= new JTextField();
		label5222223_box.setBounds(10+ 110+220*1, 33+ 25*4, 80, 20);
		label5222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label5222223);
		this.add(label5222223_box);	

		JLabel label6222223= new JLabel("���ʼ��Ե���mbp :");  
		label6222223.setForeground(Color.WHITE);
		label6222223.setBounds(10+220*1, 20+ 25*5, 100, 50);
		JTextField label6222223_box= new JTextField();
		label6222223_box.setBounds(10+ 110+220*1, 33+ 25*5, 80, 20);
		label6222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label6222223);
		this.add(label6222223_box);	

		//7
		JLabel label7222223= new JLabel("Ƥ��������dermatopathologicalexamination :");  
		label7222223.setForeground(Color.WHITE);
		label7222223.setBounds(10+220*1, 20+ 25*6, 100, 50);
		JTextField label7222223_box= new JTextField();
		label7222223_box.setBounds(10+ 110+220*1, 33+ 25*6, 80, 20);
		label7222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label7222223);
		this.add(label7222223_box);	
		//8
		JLabel label68222223= new JLabel("Ѫ����пzn :");  
		label68222223.setForeground(Color.WHITE);
		label68222223.setBounds(10+220*1, 20+ 25*7, 100, 50);
		JTextField label68222223_box= new JTextField();
		label68222223_box.setBounds(10+ 110+220*1, 33+ 25*7, 80, 20);
		label68222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(label68222223_box
						, "���ͣ����ڼ����Ը��ף���Ӳ�����������Ĺ���ƶѪ����ͯȱп֢����֢������"
						, "���ߣ�����п�ж����׿���X���������" 
						, "" 
						,50, 140, ��Ͻ��_box
						, "");
			}
		});
		this.add(label68222223);
		this.add(label68222223_box);	
		//9
		JLabel label69222223= new JLabel("��Ƥ�ʴ���Ƥ�ʴ� :");  
		label69222223.setForeground(Color.WHITE);
		label69222223.setBounds(10+220*1, 20+ 25*8, 100, 50);
		JTextField label69222223_box= new JTextField();
		label69222223_box.setBounds(10+ 110+220*1, 33+ 25*8, 80, 20);
		label69222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(label69222223_box
						, "�ⶨ������Ƥ�ʹ��ܹ���"
						, "�ⶨ������Ƥ�ʹ��ܹ���" 
						, "" 
						,10, 80, ��Ͻ��_box
						, "");
			}
		});
		this.add(label69222223);
		this.add(label69222223_box);	
		//10
		JLabel label610222223= new JLabel("��ɫ�������ԭ:");  
		label610222223.setForeground(Color.WHITE);
		label610222223.setBounds(10+220*1, 20+ 25*9, 100, 50);
		JTextField label610222223_box= new JTextField();
		label610222223_box.setBounds(10+ 110+220*1, 33+ 25*9, 80, 20);
		label610222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label610222223);
		this.add(label610222223_box);	
		//11
		JLabel label611222223= new JLabel("�Ҹ����԰�hbeab :");  
		label611222223.setForeground(Color.WHITE);
		label611222223.setBounds(10+220*1, 20+ 25*10, 100, 50);
		JTextField label611222223_box= new JTextField();
		label611222223_box.setBounds(10+ 110+220*1, 33+ 25*10, 80, 20);
		label611222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label611222223);
		this.add(label611222223_box);	
		//12
		JLabel label612222223= new JLabel("������-1ps-1:");  
		label612222223.setForeground(Color.WHITE);
		label612222223.setBounds(10+220*1, 20+ 25*11, 100, 50);
		JTextField label612222223_box= new JTextField();
		label612222223_box.setBounds(10+ 110+220*1, 33+ 25*11, 80, 20);
		label612222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label612222223);
		this.add(label612222223_box);	
		//13
		JLabel label613222223= new JLabel("�ܵ���tp:");  
		label613222223.setForeground(Color.WHITE);
		label613222223.setBounds(10+220*1, 20+ 25*12, 100, 50);
		JTextField label613222223_box= new JTextField();
		label613222223_box.setBounds(10+ 110+220*1, 33+ 25*12, 80, 20);
		label613222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(label613222223_box
						, "���ͣ������ڶ�����������֢��ˣ�Ӫ���������ϰ�����Ӳ���������ۺ�֢�����ˣ�ʧѪ"
						, "���ߣ������ڸ߶���ˮ֢���縹й��Ž�£��ݿˣ����ȣ����෢�Թ�����" 
						, "" 
						,6.0, 8.0, ��Ͻ��_box
						, "");
			}
		});
		this.add(label613222223);
		this.add(label613222223_box);	
		//14
		JLabel label614222223= new JLabel("����֧ԭ��igg:");  
		label614222223.setForeground(Color.WHITE);
		label614222223.setBounds(10+220*1, 20+ 25*13, 100, 50);
		JTextField label614222223_box= new JTextField();
		label614222223_box.setBounds(10+ 110+220*1, 33+ 25*13, 80, 20);
		label614222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label614222223);
		this.add(label614222223_box);	
	}

	void addFourthColomns(JTextField ��Ͻ��_box2) {
		// TODO Auto-generated method stub
		//copy tab
		JLabel baiDanBai22= new JLabel("���������ȡ��cultureofneisseriagonorrhoen:");  
		baiDanBai22.setForeground(Color.WHITE);
		baiDanBai22.setBounds(10+220*2, 20+ 0, 100, 50);
		JTextField baiDanBai22_box= new JTextField();
		baiDanBai22_box.setBounds(10+ 110+220*2, 33+ 0, 80, 20);
		baiDanBai22_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(baiDanBai22);
		this.add(baiDanBai22_box);	

		JLabel label222= new JLabel("���ᣨ��:");  
		label222.setForeground(Color.WHITE);
		label222.setBounds(10+220*2, 20+ 25*1, 100, 50);
		JTextField label222_box= new JTextField();
		label222_box.setBounds(10+ 110+220*2, 33+ 25*1, 80, 20);
		label222_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(label222_box
						, ""
						, "ʹ��" 
						, "" 
						,0.2 , 2.0, ��Ͻ��_box
						, "");
			}
		});
		this.add(label222);
		this.add(label222_box);	

		JLabel label322= new JLabel("ѪС��ۼ�:");  
		label322.setForeground(Color.WHITE);
		label322.setBounds(10+220*2, 20+ 25*2, 100, 50);
		JTextField label322_box= new JTextField();
		label322_box.setBounds(10+ 110+220*2, 33+ 25*2, 80, 20);
		label322_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(label322_box
						, "ѪС�幦�ܹ���"
						, "ѪС�幦�ܹ���" 
						, "" 
						, 25, 55, ��Ͻ��_box
						, "");
			}
		});
		this.add(label322);
		this.add(label322_box);	

		JLabel label422= new JLabel("�Ȳ�ת��øast:");  
		label422.setForeground(Color.WHITE);
		label422.setBounds(10+220*2, 20+ 25* 3, 100, 50);
		JTextField label422_box= new JTextField();
		label422_box.setBounds(10+ 110+220*2, 33+ 25* 3, 80, 20);
		label422_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(label422_box
						, ""
						, "���ߣ��������Ĺ��������Ը��ף��ж��Ը��ף��Ĺ��ܲ�ȫ��Ƥ���׵�" 
						, "" 
						,8, 40, ��Ͻ��_box
						, "");
			}
		});
		this.add(label422);
		this.add(label422_box);	

		JLabel label522= new JLabel("�׸ο���-igmhav-igm:");  
		label522.setForeground(Color.WHITE);
		label522.setBounds(10+220*2, 20+ 25*4, 100, 50);
		JTextField label522_box= new JTextField();
		label522_box.setBounds(10+ 110+220*2, 33+ 25*4, 80, 20);
		label522_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label522);
		this.add(label522_box);	

		JLabel label622= new JLabel("��������gh:");  
		label622.setForeground(Color.WHITE);
		label622.setBounds(10+220*2, 20+ 25*5, 100, 50);
		JTextField label622_box= new JTextField();
		label622_box.setBounds(10+ 110+220*2, 33+ 25*5, 80, 20);
		label622_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬�� ng/ml
				String temp= label622_box.getText();
				double temp_double= Double.valueOf(temp);
				if(temp_double>5|| temp_double<0.06) {
					��Ͻ��_box.setText(��Ͻ��_box.getText().contains("���֫�˷ʴ�֢��������")
							? ��Ͻ��_box.getText(): ��Ͻ��_box.getText()+ "���֫�˷ʴ�֢��������");	
				}else {
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace("���֫�˷ʴ�֢��������", ""));	
				}		
			}
		});
		this.add(label622);
		this.add(label622_box);	

		//7
		JLabel label722= new JLabel("֬��ølipase:");  
		label722.setForeground(Color.WHITE);
		label722.setBounds(10+220*2, 20+ 25*6, 100, 50);
		JTextField label722_box= new JTextField();
		label722_box.setBounds(10+ 110+220*2, 33+ 25*6, 80, 20);
		label722_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				//���ߣ����ڼ����������ף����ٰ�������������θ���ף������裬�����ף���Һ���׵ȡ����ͣ����ڸ��༲������ΰ�����Ӳ����
				//��״̬��
				String temp= label722_box.getText();
				double temp_double= Double.valueOf(temp);
				String report= "���ߣ����ڼ����������ף����ٰ�������������θ���ף������裬�����ף���Һ���׵ȡ����ͣ����ڸ��༲������ΰ�����Ӳ����";
				if(temp_double>40) {
					��Ͻ��_box.setText(��Ͻ��_box.getText().contains(report)
							? ��Ͻ��_box.getText(): ��Ͻ��_box.getText()+ report);	
				}else {
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace(report, ""));	
				}		

			}
		});
		this.add(label722);
		this.add(label722_box);	
		//8
		JLabel label6822= new JLabel("Ѫ��Ҷ��ⶨfa:");  
		label6822.setForeground(Color.WHITE);
		label6822.setBounds(10+220*2, 20+ 25*7, 100, 50);
		JTextField label6822_box= new JTextField();
		label6822_box.setBounds(10+ 110+220*2, 33+ 25*7, 80, 20);
		label6822_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label6822);
		this.add(label6822_box);	
		//9
		JLabel label6922= new JLabel("ck-mmͬ��ø:");  
		label6922.setForeground(Color.WHITE);
		label6922.setBounds(10+220*2, 20+ 25*8, 100, 50);
		JTextField label6922_box= new JTextField();
		label6922_box.setBounds(10+ 110+220*2, 33+ 25*8, 80, 20);
		label6922_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label6922);
		this.add(label6922_box);	
		//10
		JLabel label61022= new JLabel("��������ø˫Ⱦɫ:");  
		label61022.setForeground(Color.WHITE);
		label61022.setBounds(10+220*2, 20+ 25*9, 100, 50);
		JTextField label61022_box= new JTextField();
		label61022_box.setBounds(10+ 110+220*2, 33+ 25*9, 80, 20);
		label61022_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label61022);
		this.add(label61022_box);	
		//11
		JLabel label61122= new JLabel("��Ⱦɫ:");  
		label61122.setForeground(Color.WHITE);
		label61122.setBounds(10+220*2, 20+ 25*10, 100, 50);
		JTextField label61122_box= new JTextField();
		label61122_box.setBounds(10+ 110+220*2, 33+ 25*10, 80, 20);
		label61122_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label61122);
		this.add(label61122_box);	
		//12
		JLabel label61222= new JLabel("��Ⱦɫ:");  
		label61222.setForeground(Color.WHITE);
		label61222.setBounds(10+220*2, 20+ 25*11, 100, 50);
		JTextField label61222_box= new JTextField();
		label61222_box.setBounds(10+ 110+220*2, 33+ 25*11, 80, 20);
		label61222_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label61222);
		this.add(label61222_box);	
		//13
		JLabel label61322= new JLabel("�Ҹ����԰�hbeag:");  
		label61322.setForeground(Color.WHITE);
		label61322.setBounds(10+220*2, 20+ 25*12, 100, 50);
		JTextField label61322_box= new JTextField();
		label61322_box.setBounds(10+ 110+220*2, 33+ 25*12, 80, 20);
		label61322_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label61322);
		this.add(label61322_box);	
		//14
		JLabel label61422= new JLabel("��-����������øȾɫ :");  
		label61422.setForeground(Color.WHITE);
		label61422.setBounds(10+220*2, 20+ 25*13, 100, 50);
		JTextField label61422_box= new JTextField();
		label61422_box.setBounds(10+ 110+220*2, 33+ 25*13, 80, 20);
		label61422_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label61422);
		this.add(label61422_box);	
	}

	private void addThirdColomns(JTextField ��Ͻ��_box2) {
		// TODO Auto-generated method stub
		//copy tab
		JLabel baiDanBai222223= new JLabel("Ѫ��ͬ�Ͱ��װ���hcy:");  
		baiDanBai222223.setForeground(Color.WHITE);
		baiDanBai222223.setBounds(10+220*3, 20+ 0, 100, 50);
		baiDanBai222223.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JLabel ��λ= new JLabel("�׵���alb :");  
				��λ.setForeground(Color.WHITE);
				��λ.setBounds(10, 20+ 0, 100, 50);
				add(��λ);		
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		JTextField baiDanBai222223_box= new JTextField();
		baiDanBai222223_box.setBounds(10+ 110+220*3, 33+ 0, 80, 20);
		baiDanBai222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(baiDanBai222223_box
						, "����Ѫ�ܲ�����Σ������"
						, "" 
						, "" 
						,15, 9990, ��Ͻ��_box
						, "");
			}
		});
		this.add(baiDanBai222223);
		this.add(baiDanBai222223_box);	

		JLabel label2222223= new JLabel("��΢���׵�����й��uaer :");  
		label2222223.setForeground(Color.WHITE);
		label2222223.setBounds(10+220*3, 20+ 25*1, 100, 50);
		JTextField label2222223_box= new JTextField();
		label2222223_box.setBounds(10+ 110+220*3, 33+ 25*1, 80, 20);
		label2222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(label2222223_box
						, ""
						, "������������� ����" 
						, "" 
						,0, 20, ��Ͻ��_box
						, "");
			}
		});
		this.add(label2222223);
		this.add(label2222223_box);	

		JLabel label3222223= new JLabel("��cl :");  
		label3222223.setForeground(Color.WHITE);
		label3222223.setBounds(10+220*3, 20+ 25*2, 100, 50);
		JTextField label3222223_box= new JTextField();
		label3222223_box.setBounds(10+ 110+220*3, 33+ 25*2, 80, 20);
		label3222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(label2222223_box
						, "���ͣ����ڵ���Ѫ֢������Ż�£���к��θҺ��Һ��֭Һ������ʧ�������ܼ��˼�����ɭ�ϲ���"
						, "���ߣ����ڸ���Ѫ֢���������ж�����������ˮ�����������������" 
						, "" 
						,96, 106, ��Ͻ��_box
						, "");
			}
		});
		this.add(label3222223);
		this.add(label3222223_box);	

		JLabel label4222223= new JLabel("��ϴҺ������balf :");  
		label4222223.setForeground(Color.WHITE);
		label4222223.setBounds(10+220*3, 20+ 25* 3, 100, 50);
		JTextField label4222223_box= new JTextField();
		label4222223_box.setBounds(10+ 110+220*3, 33+ 25* 3, 80, 20);
		label4222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label4222223);
		this.add(label4222223_box);	

		JLabel label5222223= new JLabel("�������������:");  
		label5222223.setForeground(Color.WHITE);
		label5222223.setBounds(10+220*3, 20+ 25*4, 100, 50);
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

		JLabel label6222223= new JLabel("�������� :");  
		label6222223.setForeground(Color.WHITE);
		label6222223.setBounds(10+220*3, 20+ 25*5, 100, 50);
		JTextField label6222223_box= new JTextField();
		label6222223_box.setBounds(10+ 110+220*3, 33+ 25*5, 80, 20);
		label6222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(label6222223_box
						, "���ͣ����������ܲ�ȫ����Ѫ֢"
						, "���ߣ��������˷磬�˺���Ƥ���ס�" 
						, "" 
						,98, 230, ��Ͻ��_box
						, "");
			}
		});
		this.add(label6222223);
		this.add(label6222223_box);	

		//7
		JLabel label7222223= new JLabel("Ѫ�����򵰰�gigg :");  
		label7222223.setForeground(Color.WHITE);
		label7222223.setBounds(10+220*3, 20+ 25*6, 100, 50);
		JTextField label7222223_box= new JTextField();
		label7222223_box.setBounds(10+ 110+220*3, 33+ 25*6, 80, 20);
		label7222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(label6222223_box
						, "���ͣ����߲�"
						, "����" 
						, "" 
						,90, 209, ��Ͻ��_box
						, "");
			}
		});
		this.add(label7222223);
		this.add(label7222223_box);	
		//8
		JLabel label68222223= new JLabel("��ˮldh:");  
		label68222223.setForeground(Color.WHITE);
		label68222223.setBounds(10+220*3, 20+ 25*7, 100, 50);
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
		JLabel label69222223= new JLabel("�ٽ���������fsm :");  
		label69222223.setForeground(Color.WHITE);
		label69222223.setBounds(10+220*3, 20+ 25*8, 100, 50);
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
		JLabel label610222223= new JLabel("d-�����壨d-dimer��:");  
		label610222223.setForeground(Color.WHITE);
		label610222223.setBounds(10+220*3, 20+ 25*9, 100, 50);
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
		JLabel label611222223= new JLabel("��ӵ�����ibil :");  
		label611222223.setForeground(Color.WHITE);
		label611222223.setBounds(10+220*3, 20+ 25*10, 100, 50);
		JTextField label611222223_box= new JTextField();
		label611222223_box.setBounds(10+ 110+220*3, 33+ 25*10, 80, 20);
		label611222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(label611222223_box
						, ""
						, ":���ߣ�������Ѫ�Ի��㣬���������㣬Ѫ�Ͳ�������Ѫ��Ӧ" 
						, "" 
						,0.1, 0.7, ��Ͻ��_box
						, "");
			}
		});
		this.add(label611222223);
		this.add(label611222223_box);	
		//12
		JLabel label612222223= new JLabel("tϸ����Ⱥ�ⶨ:");  
		label612222223.setForeground(Color.WHITE);
		label612222223.setBounds(10+220*3, 20+ 25*11, 100, 50);
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
		JLabel label613222223= new JLabel("����:");  
		label613222223.setForeground(Color.WHITE);
		label613222223.setBounds(10+220*3, 20+ 25*12, 100, 50);
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
		JLabel label614222223= new JLabel("set:");  
		label614222223.setForeground(Color.WHITE);
		label614222223.setBounds(10+220*3, 20+ 25*13, 100, 50);
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

	private void addSecondColomns(JTextField ��Ͻ��_box2) {
		// TODO Auto-generated method stub
		//copy tab
		JLabel baiDanBai22= new JLabel("̥���ǵ���̥���ǵ���:");  
		baiDanBai22.setForeground(Color.WHITE);
		baiDanBai22.setBounds(10+220*4, 20+ 0, 100, 50);
		JTextField baiDanBai22_box= new JTextField();
		baiDanBai22_box.setBounds(10+ 110+220*4, 33+ 0, 80, 20);
		baiDanBai22_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(baiDanBai22);
		this.add(baiDanBai22_box);	

		JLabel label222= new JLabel("����ϸ����ѧ��������-1mcp-1 :");  
		label222.setForeground(Color.WHITE);
		label222.setBounds(10+220*4, 20+ 25*1, 100, 50);
		JTextField label222_box= new JTextField();
		label222_box.setBounds(10+ 110+220*4, 33+ 25*1, 80, 20);
		label222_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label222);
		this.add(label222_box);	

		JLabel label322= new JLabel("����ϸ����̬ѧ��ϼ��:");  
		label322.setForeground(Color.WHITE);
		label322.setBounds(10+220*4, 20+ 25*2, 100, 50);
		JTextField label322_box= new JTextField();
		label322_box.setBounds(10+ 110+220*4, 33+ 25*2, 80, 20);
		label322_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label322);
		this.add(label322_box);	

		JLabel label422= new JLabel("���ʼ��Ե��׿���mbp:");  
		label422.setForeground(Color.WHITE);
		label422.setBounds(10+220*4, 20+ 25* 3, 100, 50);
		JTextField label422_box= new JTextField();
		label422_box.setBounds(10+ 110+220*4, 33+ 25* 3, 80, 20);
		label422_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label422);
		this.add(label422_box);	

		JLabel label522= new JLabel("�Ƕ�������øhbdh :");  
		label522.setForeground(Color.WHITE);
		label522.setBounds(10+220*4, 20+ 25*4, 100, 50);
		JTextField label522_box= new JTextField();
		label522_box.setBounds(10+ 110+ 220* 4, 33+ 25*4, 80, 20);
		label522_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(label522_box
						, ""
						, "��Ϊ�����Ĺ���ϵ�һ��ָ�꣬��LDH������ͬ���ڼ����Ĺ�ʱ��ø��ѪҺ��ά�ָ�ֵ���ɴ�2�����ҡ�" 
						, "" 
						,80, 220, ��Ͻ��_box
						, "");

			}
		});
		this.add(label522);
		this.add(label522_box);	

		JLabel label622= new JLabel("c-��c-p:");  
		label622.setForeground(Color.WHITE);
		label622.setBounds(10+220*4, 20+ 25*5, 100, 50);
		JTextField label622_box= new JTextField();
		label622_box.setBounds(10+ 110+220*4, 33+ 25*5, 80, 20);
		label622_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label622);
		this.add(label622_box);	

		//7
		JLabel label722= new JLabel("�Բ���ԭ����ټ�⣨ct��:");  
		label722.setForeground(Color.WHITE);
		label722.setBounds(10+220*4, 20+ 25*6, 100, 50);
		JTextField label722_box= new JTextField();
		label722_box.setBounds(10+ 110+220*4, 33+ 25*6, 80, 20);
		label722_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label722);
		this.add(label722_box);	
		//8
		JLabel label6822= new JLabel("�߿���phl :");  
		label6822.setForeground(Color.WHITE);
		label6822.setBounds(10+220*4, 20+ 25*7, 100, 50);
		JTextField label6822_box= new JTextField();
		label6822_box.setBounds(10+ 110+220*4, 33+ 25*7, 80, 20);
		label6822_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label6822);
		this.add(label6822_box);	
		//9
		JLabel label6922= new JLabel("����޺�ϸ�����������������:");  
		label6922.setForeground(Color.WHITE);
		label6922.setBounds(10+220*4, 20+ 25*8, 100, 50);
		JTextField label6922_box= new JTextField();
		label6922_box.setBounds(10+ 110+220*4, 33+ 25*8, 80, 20);
		label6922_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label6922);
		this.add(label6922_box);	
		//10
		JLabel label61022= new JLabel("Ѫ�����������ӷ���:");  
		label61022.setForeground(Color.WHITE);
		label61022.setBounds(10+220*4, 20+ 25*9, 100, 50);
		JTextField label61022_box= new JTextField();
		label61022_box.setBounds(10+ 110+220*4, 33+ 25*9, 80, 20);
		label61022_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label61022);
		this.add(label61022_box);	
		//11
		JLabel label61122= new JLabel("�Լ�Һ������:");  
		label61122.setForeground(Color.WHITE);
		label61122.setBounds(10+220*4, 20+ 25*10, 100, 50);
		JTextField label61122_box= new JTextField();
		label61122_box.setBounds(10+ 110+220*4, 33+ 25*10, 80, 20);
		label61122_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label61122);
		this.add(label61122_box);	
		//12***********************************
		JLabel label61222= new JLabel("Ѫ�ܽ�����ת��øsace:");  
		label61222.setForeground(Color.WHITE);
		label61222.setBounds(10+220*4, 20+ 25*11, 100, 50);
		JTextField label61222_box= new JTextField();
		label61222_box.setBounds(10+ 110+220*4, 33+ 25*11, 80, 20);
		label61222_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(label61222_box
						, ""
						, "��ڲ����ν��" 
						, "" 
						, 20, 40, ��Ͻ��_box
						, "");
			}
		});
		this.add(label61222);
		this.add(label61222_box);	
		//13
		JLabel label61322= new JLabel("��ԪȾɫ:");  
		label61322.setForeground(Color.WHITE);
		label61322.setBounds(10+220*4, 20+ 25*12, 100, 50);
		JTextField label61322_box= new JTextField();
		label61322_box.setBounds(10+ 110+220*4, 33+ 25*12, 80, 20);
		label61322_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label61322);
		this.add(label61322_box);	
		//14
		JLabel label61422= new JLabel("�Լ�Һϸ��ѧ���:");  
		label61422.setForeground(Color.WHITE);
		label61422.setBounds(10+220*4, 20+ 25*13, 100, 50);
		JTextField label61422_box= new JTextField();
		label61422_box.setBounds(10+ 110+220*4, 33+ 25*13, 80, 20);
		label61422_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(label61422);
		this.add(label61422_box);	
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
}
