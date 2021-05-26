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

import ME.APM.VSQ.App;
import MVQ.button.DetaButton;
import MVQ.label.DetaIndexLabel;
import MVQ.label.DetaLabel;

public class LinChuangJianYanBaoGaoB  extends JPanel implements MouseListener, KeyListener, ActionListener, MouseMotionListener{

	private static final long serialVersionUID= 1L;
	public List<DetaLabel> jFrameList;
	public JTextField ��Ͻ��_box;
	public LinChuangJianYanBaoGaoB(JTextPane name, App app, List<DetaLabel> jFrameListRefer){
		this.setLayout(null);
		this.setBounds(0, 0, 1180, 610);
		this.setBackground(Color.BLACK);	
		this.addMouseMotionListener(this);
		this.jFrameList= jFrameListRefer;
		//1���� ������� �ұ������
		//1���� ������� �ұ������
		DetaLabel ��Ͻ��= new DetaLabel("��Ͻ��:");  
		��Ͻ��.setForeground(Color.white);
		��Ͻ��.setBounds(10, 20+ 300+ 90, 100, 20);
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
	
		// TODO Auto-generated method stub
		//copy tab
		DetaLabel ȫѪ��= new DetaLabel("ȫѪ��:");  
		ȫѪ��.setForeground(Color.WHITE);
		ȫѪ��.setBounds(10+220*0, 32+ 0, 100, 20); ȫѪ��.indexString= "QXND"; jFrameList.add(ȫѪ��);
		JTextField ȫѪ��_box= new JTextField();
		ȫѪ��_box.setBounds(10+ 110+220*0, 33+ 0, 80, 20);
		ȫѪ��_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				String temp= ȫѪ��_box.getText();
				��Ͻ��_box.setText(��Ͻ��_box.getText()+ temp);
			}
		});
		this.add(ȫѪ��);
		this.add(ȫѪ��_box);	

		DetaLabel ������ǿ�ԭ242���= new DetaLabel("������ǿ�ԭ242���ca242:");  
		������ǿ�ԭ242���.setForeground(Color.WHITE);
		������ǿ�ԭ242���.setBounds(10+220*0, 32+ 25*1, 100, 20); ������ǿ�ԭ242���.indexString= "ZLBJKYC"; jFrameList.add(������ǿ�ԭ242���);
		JTextField ������ǿ�ԭ242���_box= new JTextField();
		������ǿ�ԭ242���_box.setBounds(10+ 110+220*0, 33+ 25*1, 80, 20);
		������ǿ�ԭ242���_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(������ǿ�ԭ242���);
		this.add(������ǿ�ԭ242���_box);	

		DetaLabel ����ԭ���= new DetaLabel("����ԭ��⣨1�������颡��2�������颢��3��ʳ���颣��4��ʳ���颤ivtivt-��ivt-��ivt-��ivt-��:");  
		����ԭ���.setForeground(Color.WHITE);
		����ԭ���.setBounds(10+220*0, 32+ 25*2, 100, 20); ����ԭ���.indexString= "GMYJC"; jFrameList.add(����ԭ���);
		JTextField ����ԭ���_box= new JTextField();
		����ԭ���_box.setBounds(10+ 110+220*0, 33+ 25*2, 80, 20);
		����ԭ���_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(����ԭ���);
		this.add(����ԭ���_box);	

		DetaLabel ��ca= new DetaLabel("��ca:");  
		��ca.setForeground(Color.WHITE);
		��ca.setBounds(10+220*0, 32+ 25* 3, 100, 20); ��ca.indexString= "GCA"; jFrameList.add(��ca);
		JTextField ��ca_box= new JTextField();
		��ca_box.setBounds(10+ 110+220*0, 33+ 25* 3, 80, 20);
		��ca_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(��ca);
		this.add(��ca_box);	

		DetaLabel ����ϸ����Ⱦ��������= new DetaLabel("����ϸ����Ⱦ��������-1��mip-1��:");  
		����ϸ����Ⱦ��������.setForeground(Color.WHITE);
		����ϸ����Ⱦ��������.setBounds(10+220*0, 32+ 25*4, 100, 20); ����ϸ����Ⱦ��������.indexString= "JSXBGRQHYZ"; jFrameList.add(����ϸ����Ⱦ��������);
		JTextField ����ϸ����Ⱦ��������_box= new JTextField();
		����ϸ����Ⱦ��������_box.setBounds(10+ 110+220*0, 33+ 25*4, 80, 20);
		����ϸ����Ⱦ��������_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(����ϸ����Ⱦ��������);
		this.add(����ϸ����Ⱦ��������_box);	

		DetaLabel �ǹ̴�17= new DetaLabel("��17-�ǹ̴�17-oh:");  
		�ǹ̴�17.setForeground(Color.WHITE);
		�ǹ̴�17.setBounds(10+220*0, 32+ 25*5, 100, 20); �ǹ̴�17.indexString= "NQGCOH"; jFrameList.add(�ǹ̴�17);
		JTextField �ǹ̴�17_box= new JTextField();
		�ǹ̴�17_box.setBounds(10+ 110+220*0, 33+ 25*5, 80, 20);
		�ǹ̴�17_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(�ǹ̴�17);
		this.add(�ǹ̴�17_box);	

		//7
		DetaLabel �ٻ���������= new DetaLabel("�ٻ���������lh:");  
		�ٻ���������.setForeground(Color.WHITE);
		�ٻ���������.setBounds(10+220*0, 32+ 25*6, 100, 20); �ٻ���������.indexString= "CHTSLH"; jFrameList.add(�ٻ���������);
		JTextField �ٻ���������_box= new JTextField();
		�ٻ���������_box.setBounds(10+ 110+220*0, 33+ 25*6, 80, 20);
		�ٻ���������_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(�ٻ���������);
		this.add(�ٻ���������_box);	
		//8
		DetaLabel �Ҹα��濹ԭ= new DetaLabel("�Ҹα��濹ԭhbsag:");  
		�Ҹα��濹ԭ.setForeground(Color.WHITE);
		�Ҹα��濹ԭ.setBounds(10+220*0, 32+ 25*7, 100, 20); �Ҹα��濹ԭ.indexString= "YGBMKHSAG"; jFrameList.add(�Ҹα��濹ԭ);
		JTextField �Ҹα��濹ԭ_box= new JTextField();
		�Ҹα��濹ԭ_box.setBounds(10+ 110+220*0, 33+ 25*7, 80, 20);
		�Ҹα��濹ԭ_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(�Ҹα��濹ԭ);
		this.add(�Ҹα��濹ԭ_box);	
		//9
		DetaLabel ë�ҳ澵��demo= new DetaLabel("ë�ҳ澵��demodexfolliculorumexamination:");  
		ë�ҳ澵��demo.setForeground(Color.WHITE);
		ë�ҳ澵��demo.setBounds(10+220*0, 32+ 25*8, 100, 20); ë�ҳ澵��demo.indexString= "MNCJDEOXFLURATI"; jFrameList.add(ë�ҳ澵��demo);
		JTextField ë�ҳ澵��demo_box= new JTextField();
		ë�ҳ澵��demo_box.setBounds(10+ 110+220*0, 33+ 25*8, 80, 20);
		ë�ҳ澵��demo_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(ë�ҳ澵��demo);
		this.add(ë�ҳ澵��demo_box);	
		//10
		DetaLabel ��������Ƥ�ʼ���= new DetaLabel("��������Ƥ�ʼ���acth:");  
		��������Ƥ�ʼ���.setForeground(Color.WHITE);
		��������Ƥ�ʼ���.setBounds(10+220*0, 32+ 25*9, 100, 20); ��������Ƥ�ʼ���.indexString= "CSXPZJACTH"; jFrameList.add(��������Ƥ�ʼ���);
		JTextField ��������Ƥ�ʼ���_box= new JTextField();
		��������Ƥ�ʼ���_box.setBounds(10+ 110+220*0, 33+ 25*9, 80, 20);
		��������Ƥ�ʼ���_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(��������Ƥ�ʼ���);
		this.add(��������Ƥ�ʼ���_box);	
		//11
		DetaLabel ������igm= new DetaLabel("������igm,�������Զ���toxo:");  
		������igm.setForeground(Color.WHITE);
		������igm.setBounds(10+220*0, 32+ 25*10, 100, 20); ������igm.indexString= "GXTIMKDO"; jFrameList.add(������igm);
		JTextField ������igm_box= new JTextField();
		������igm_box.setBounds(10+ 110+220*0, 33+ 25*10, 80, 20);
		������igm_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(������igm);
		this.add(������igm_box);	
		//12
		DetaLabel ��֬����ap0bap0b= new DetaLabel("��֬����ap0bap0b:");  
		��֬����ap0bap0b.setForeground(Color.WHITE);
		��֬����ap0bap0b.setBounds(10+220*0, 32+ 25*11, 100, 20); ��֬����ap0bap0b.indexString= "ZDBAPB"; jFrameList.add(��֬����ap0bap0b);
		JTextField ��֬����ap0bap0b_box= new JTextField();
		��֬����ap0bap0b_box.setBounds(10+ 110+220*0, 33+ 25*11, 80, 20);
		��֬����ap0bap0b_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(��֬����ap0bap0b_box
						, "���ͣ������ڸ�ʵ���Բ���"
						, "���ߣ������ڸ�֬Ѫ֢�����Ĳ�����м����" 
						, "" 
						,75, 123, ��Ͻ��_box
						, "");
			}
		});
		this.add(��֬����ap0bap0b);
		this.add(��֬����ap0bap0b_box);	
		//13
		DetaLabel ����uric= new DetaLabel("����uric:");  
		����uric.setForeground(Color.WHITE);
		����uric.setBounds(10+220*0, 32+ 25*12, 100, 20); ����uric.indexString= "NSURIC"; jFrameList.add(����uric);
		JTextField ����uric_box= new JTextField();
		����uric_box.setBounds(10+ 110+220*0, 33+ 25*12, 80, 20);
		����uric_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(����uric_box
						, "���ͣ����ڶ���ƶѪ��������Ƥ�ʼ��ص�ҩ�����ƺ�"
						, "���ߣ�����ʹ�磬�����Ѫ������ϸ������֢���෢�Թ���������������С�����ס�" 
						, "" 
						,2.5, 7.7, ��Ͻ��_box
						, "");
			}
		});
		this.add(����uric);
		this.add(����uric_box);	
		//14
		DetaLabel �ȸ�����= new DetaLabel("�ȸ�����:");  
		�ȸ�����.setForeground(Color.WHITE);
		�ȸ�����.setBounds(10+220*0, 32+ 25*13, 100, 20); �ȸ�����.indexString= "YGTS"; jFrameList.add(�ȸ�����);
		JTextField �ȸ�����_box= new JTextField();
		�ȸ�����_box.setBounds(10+ 110+220*0, 33+ 25*13, 80, 20);
		�ȸ�����_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(�ȸ�����_box
						, ":�ⶨ�ȵ�aϸ�����ܹ���"
						, ":�ⶨ�ȵ�aϸ�����ܹ���" 
						, "" 
						,40, 130, ��Ͻ��_box
						, "");
			}
		});
		this.add(�ȸ�����);
		this.add(�ȸ�����_box);	
		//
		addSecondColomns(��Ͻ��_box, jFrameList);
		addThirdColomns(��Ͻ��_box, jFrameList);
		addFourthColomns(��Ͻ��_box, jFrameList);
		addFifthColomns(��Ͻ��_box, jFrameList);
		this.validate();
	}
	private void addFifthColomns(JTextField ��Ͻ��_box2, List<DetaLabel> jFrameList) {
		// TODO Auto-generated method stub
		//copy tab
		DetaLabel ���ž���ԭ���= new DetaLabel("���ž���ԭ���:");  
		���ž���ԭ���.setForeground(Color.WHITE);
		���ž���ԭ���.setBounds(10+220*1, 32+ 0, 100, 20); ���ž���ԭ���.indexString= "JTKYC"; jFrameList.add(���ž���ԭ���);
		JTextField ���ž���ԭ���_box= new JTextField();
		���ž���ԭ���_box.setBounds(10+ 110+220*1, 33+ 0, 80, 20);
		���ž���ԭ���_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(���ž���ԭ���);
		this.add(���ž���ԭ���_box);	

		DetaLabel �������ȡ��= new DetaLabel("�������ȡ��cultureoffungi:");  
		�������ȡ��.setForeground(Color.WHITE);
		�������ȡ��.setBounds(10+220*1, 32+ 25*1, 100, 20); �������ȡ��.indexString= "ZJPYQCULTEROFNGI"; jFrameList.add(�������ȡ��);
		JTextField �������ȡ��_box= new JTextField();
		�������ȡ��_box.setBounds(10+ 110+220*1, 33+ 25*1, 80, 20);
		�������ȡ��_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(�������ȡ��);
		this.add(�������ȡ��_box);	

		DetaLabel ת��øggt= new DetaLabel("ת��øggt:");  
		ת��øggt.setForeground(Color.WHITE);
		ת��øggt.setBounds(10+220*1, 32+ 25*2, 100, 20); ת��øggt.indexString= "ZTMGT"; jFrameList.add(ת��øggt);
		JTextField ת��øggt_box= new JTextField();
		ת��øggt_box.setBounds(10+ 110+220*1, 33+ 25*2, 80, 20);
		ת��øggt_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(ת��øggt_box
						, ""
						, "���ߣ�������ԭ���Ի�ת���Ըΰ������Ը��ף����Ը��׻�ڣ���Ӳ�������������׼�����˥�ߵ�" 
						, "" 
						,8, 50, ��Ͻ��_box
						, "");
			}
		});
		this.add(ת��øggt);
		this.add(ת��øggt_box);	

		DetaLabel �����黯���= new DetaLabel("�����黯���immunohistophathol-ogicstain:");  
		�����黯���.setForeground(Color.WHITE);
		�����黯���.setBounds(10+220*1, 32+ 25* 3, 100, 20); �����黯���.indexString= "MYZHCimmunohistophathologicstain".toUpperCase(); jFrameList.add(�����黯���);
		JTextField �����黯���_box= new JTextField();
		�����黯���_box.setBounds(10+ 110+220*1, 33+ 25* 3, 80, 20);
		�����黯���_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(�����黯���);
		this.add(�����黯���_box);	

		DetaLabel �����յ�ѪС��ۼ�����= new DetaLabel("�����յ�ѪС��ۼ����ܲ��ԣ�mulitipleagentplateletaggregationtest��4-pagt:");  
		�����յ�ѪС��ۼ�����.setForeground(Color.WHITE);
		�����յ�ѪС��ۼ�����.setBounds(10+220*1, 32+ 25*4, 100, 20); 
		�����յ�ѪС��ۼ�����.indexString= "SXYDBJGNmulitipleagentplateletaggregationtest".toUpperCase(); jFrameList.add(�����յ�ѪС��ۼ�����);
		JTextField �����յ�ѪС��ۼ�����_box= new JTextField();
		�����յ�ѪС��ۼ�����_box.setBounds(10+ 110+220*1, 33+ 25*4, 80, 20);
		�����յ�ѪС��ۼ�����_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(�����յ�ѪС��ۼ�����);
		this.add(�����յ�ѪС��ۼ�����_box);	

		DetaLabel ���ʼ��Ե���= new DetaLabel("���ʼ��Ե���mbp:");  
		���ʼ��Ե���.setForeground(Color.WHITE);
		���ʼ��Ե���.setBounds(10+220*1, 32+ 25*5, 100, 20); ���ʼ��Ե���.indexString= "SJXDBMP"; jFrameList.add(���ʼ��Ե���);
		JTextField ���ʼ��Ե���_box= new JTextField();
		���ʼ��Ե���_box.setBounds(10+ 110+220*1, 33+ 25*5, 80, 20);
		���ʼ��Ե���_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(���ʼ��Ե���);
		this.add(���ʼ��Ե���_box);	

		//7
		DetaLabel Ƥ��������= new DetaLabel("Ƥ��������dermatopathologicalexamination:");  
		Ƥ��������.setForeground(Color.WHITE);
		Ƥ��������.setBounds(10+220*1, 32+ 25*6, 100, 20); 
		Ƥ��������.indexString= "PFBHJdermatopathologicalexamination".toUpperCase(); jFrameList.add(Ƥ��������);
		JTextField Ƥ��������_box= new JTextField();
		Ƥ��������_box.setBounds(10+ 110+220*1, 33+ 25*6, 80, 20);
		Ƥ��������_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(Ƥ��������);
		this.add(Ƥ��������_box);	
		//8
		DetaLabel Ѫ��п= new DetaLabel("Ѫ����пzn:");  
		Ѫ��п.setForeground(Color.WHITE);
		Ѫ��п.setBounds(10+220*1, 32+ 25*7, 100, 20); Ѫ��п.indexString= "XNZN"; jFrameList.add(Ѫ��п);
		JTextField Ѫ��п_box = new JTextField();
		Ѫ��п_box.setBounds(10+ 110+220*1, 33+ 25*7, 80, 20);
		Ѫ��п_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(Ѫ��п_box
						, "���ͣ����ڼ����Ը��ף���Ӳ�����������Ĺ���ƶѪ����ͯȱп֢����֢������"
						, "���ߣ�����п�ж����׿���X���������" 
						, "" 
						,50, 140, ��Ͻ��_box
						, "");
			}
		});
		this.add(Ѫ��п);
		this.add(Ѫ��п_box);	
		//9
		DetaLabel ��Ƥ�ʴ���Ƥ�ʴ�= new DetaLabel("��Ƥ�ʴ���Ƥ�ʴ�:");  
		��Ƥ�ʴ���Ƥ�ʴ�.setForeground(Color.WHITE);
		��Ƥ�ʴ���Ƥ�ʴ�.setBounds(10+220*1, 32+ 25*8, 100, 20); ��Ƥ�ʴ���Ƥ�ʴ�.indexString= "NPZC"; jFrameList.add(��Ƥ�ʴ���Ƥ�ʴ�);
		JTextField ��Ƥ�ʴ���Ƥ�ʴ�_box= new JTextField();
		��Ƥ�ʴ���Ƥ�ʴ�_box.setBounds(10+ 110+220*1, 33+ 25*8, 80, 20);
		��Ƥ�ʴ���Ƥ�ʴ�_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(��Ƥ�ʴ���Ƥ�ʴ�_box
						, "�ⶨ������Ƥ�ʹ��ܹ���"
						, "�ⶨ������Ƥ�ʹ��ܹ���" 
						, "" 
						,10, 80, ��Ͻ��_box
						, "");
			}
		});
		this.add(��Ƥ�ʴ���Ƥ�ʴ�);
		this.add(��Ƥ�ʴ���Ƥ�ʴ�_box);	
		//10
		DetaLabel ��ɫ�������ԭ= new DetaLabel("��ɫ�������ԭ:");  
		��ɫ�������ԭ.setForeground(Color.WHITE);
		��ɫ�������ԭ.setBounds(10+220*1, 32+ 25*9, 100, 20); ��ɫ�������ԭ.indexString= "BSNZJKY"; jFrameList.add(��ɫ�������ԭ);
		JTextField ��ɫ�������ԭ_box= new JTextField();
		��ɫ�������ԭ_box.setBounds(10+ 110+220*1, 33+ 25*9, 80, 20);
		��ɫ�������ԭ_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(��ɫ�������ԭ);
		this.add(��ɫ�������ԭ_box);	
		//11
		DetaLabel �Ҹ����԰�hbeab= new DetaLabel("�Ҹ����԰�hbeab:");  
		�Ҹ����԰�hbeab.setForeground(Color.WHITE);
		�Ҹ����԰�hbeab.setBounds(10+220*1, 32+ 25*10, 100, 20); �Ҹ����԰�hbeab.indexString= "YGLDBHEA"; jFrameList.add(�Ҹ����԰�hbeab);
		JTextField �Ҹ����԰�hbeab_box= new JTextField();
		�Ҹ����԰�hbeab_box.setBounds(10+ 110+220*1, 33+ 25*10, 80, 20);
		�Ҹ����԰�hbeab_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(�Ҹ����԰�hbeab);
		this.add(�Ҹ����԰�hbeab_box);	
		//12
		DetaLabel ������= new DetaLabel("������-1ps-1:");  
		������.setForeground(Color.WHITE);
		������.setBounds(10+220*1, 32+ 25*11, 100, 20); ������.indexString= "ZLSP"; jFrameList.add(������);
		JTextField ������_box= new JTextField();
		������_box.setBounds(10+ 110+220*1, 33+ 25*11, 80, 20);
		������_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(������);
		this.add(������_box);	
		//13
		DetaLabel �ܵ���tp= new DetaLabel("�ܵ���tp:");  
		�ܵ���tp.setForeground(Color.WHITE);
		�ܵ���tp.setBounds(10+220*1, 32+ 25*12, 100, 20); �ܵ���tp.indexString= "ZDBTP"; jFrameList.add(�ܵ���tp);
		JTextField �ܵ���tp_box= new JTextField();
		�ܵ���tp_box.setBounds(10+ 110+220*1, 33+ 25*12, 80, 20);
		�ܵ���tp_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(�ܵ���tp_box
						, "���ͣ������ڶ�����������֢��ˣ�Ӫ���������ϰ�����Ӳ���������ۺ�֢�����ˣ�ʧѪ"
						, "���ߣ������ڸ߶���ˮ֢���縹й��Ž�£��ݿˣ����ȣ����෢�Թ�����" 
						, "" 
						,6.0, 8.0, ��Ͻ��_box
						, "");
			}
		});
		this.add(�ܵ���tp);
		this.add(�ܵ���tp_box);	
		//14
		DetaLabel ����֧ԭ��igg= new DetaLabel("����֧ԭ��igg:");  
		����֧ԭ��igg.setForeground(Color.WHITE);
		����֧ԭ��igg.setBounds(10+220*1, 32+ 25*13, 100, 20); ����֧ԭ��igg.indexString= "FYZTIG"; jFrameList.add(����֧ԭ��igg);
		JTextField ����֧ԭ��igg_box= new JTextField();
		����֧ԭ��igg_box.setBounds(10+ 110+220*1, 33+ 25*13, 80, 20);
		����֧ԭ��igg_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(����֧ԭ��igg);
		this.add(����֧ԭ��igg_box);	
	}

	void addFourthColomns(JTextField ��Ͻ��_box2, List<DetaLabel> jFrameList) {
		// TODO Auto-generated method stub
		//copy tab
		DetaLabel ���������ȡ��= new DetaLabel("���������ȡ��cultureofneisseriagonorrhoen:");  
		���������ȡ��.setForeground(Color.WHITE);
		���������ȡ��.setBounds(10+220*2, 32+ 0, 100, 20); 
		���������ȡ��.indexString= "LQJPYCcultureofneisseriagonorrhoen".toUpperCase(); jFrameList.add(���������ȡ��);
		JTextField ���������ȡ��_box= new JTextField();
		���������ȡ��_box.setBounds(10+ 110+220*2, 33+ 0, 80, 20);
		���������ȡ��_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(���������ȡ��);
		this.add(���������ȡ��_box);	

		DetaLabel ������= new DetaLabel("���ᣨ��:");  
		������.setForeground(Color.WHITE);
		������.setBounds(10+220*2, 32+ 25*1, 100, 20); ������.indexString= "NS"; jFrameList.add(������);
		JTextField ������_box= new JTextField();
		������_box.setBounds(10+ 110+220*2, 33+ 25*1, 80, 20);
		������_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(������_box
						, ""
						, "ʹ��" 
						, "" 
						,0.2 , 2.0, ��Ͻ��_box
						, "");
			}
		});
		this.add(������);
		this.add(������_box);	

		DetaLabel ѪС��ۼ�= new DetaLabel("ѪС��ۼ�:");  
		ѪС��ۼ�.setForeground(Color.WHITE);
		ѪС��ۼ�.setBounds(10+220*2, 32+ 25*2, 100, 20); ѪС��ۼ�.indexString= "XBJ"; jFrameList.add(ѪС��ۼ�);
		JTextField ѪС��ۼ�_box= new JTextField();
		ѪС��ۼ�_box.setBounds(10+ 110+220*2, 33+ 25*2, 80, 20);
		ѪС��ۼ�_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(ѪС��ۼ�_box
						, "ѪС�幦�ܹ���"
						, "ѪС�幦�ܹ���" 
						, "" 
						, 25, 55, ��Ͻ��_box
						, "");
			}
		});
		this.add(ѪС��ۼ�);
		this.add(ѪС��ۼ�_box);	

		DetaLabel �Ȳ�ת��ø= new DetaLabel("�Ȳ�ת��øast:");  
		�Ȳ�ת��ø.setForeground(Color.WHITE);
		�Ȳ�ת��ø.setBounds(10+220*2, 32+ 25* 3, 100, 20); �Ȳ�ת��ø.indexString= "GCZAMST"; jFrameList.add(�Ȳ�ת��ø);
		JTextField �Ȳ�ת��ø_box= new JTextField();
		�Ȳ�ת��ø_box.setBounds(10+ 110+220*2, 33+ 25* 3, 80, 20);
		�Ȳ�ת��ø_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(�Ȳ�ת��ø_box
						, ""
						, "���ߣ��������Ĺ��������Ը��ף��ж��Ը��ף��Ĺ��ܲ�ȫ��Ƥ���׵�" 
						, "" 
						,8, 40, ��Ͻ��_box
						, "");
			}
		});
		this.add(�Ȳ�ת��ø);
		this.add(�Ȳ�ת��ø_box);	

		DetaLabel �׸ο���= new DetaLabel("�׸ο���-igmhav-igm:");  
		�׸ο���.setForeground(Color.WHITE);
		�׸ο���.setBounds(10+220*2, 32+ 25*4, 100, 20); 
		�׸ο���.indexString= "JGKTigmhav".toUpperCase(); jFrameList.add(�׸ο���);
		JTextField �׸ο���_box= new JTextField();
		�׸ο���_box.setBounds(10+ 110+220*2, 33+ 25*4, 80, 20);
		�׸ο���_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(�׸ο���);
		this.add(�׸ο���_box);	

		DetaLabel ��������gh= new DetaLabel("��������gh:");  
		��������gh.setForeground(Color.WHITE);
		��������gh.setBounds(10+220*2, 32+ 25*5, 100, 20); ��������gh.indexString= "SZJGH"; jFrameList.add(��������gh);
		JTextField ��������gh_box= new JTextField();
		��������gh_box.setBounds(10+ 110+220*2, 33+ 25*5, 80, 20);
		��������gh_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬�� ng/ml
				String temp= ��������gh_box.getText();
				double temp_double= Double.valueOf(temp);
				if(temp_double>5|| temp_double<0.06) {
					��Ͻ��_box.setText(��Ͻ��_box.getText().contains("���֫�˷ʴ�֢��������")
							? ��Ͻ��_box.getText(): ��Ͻ��_box.getText()+ "���֫�˷ʴ�֢��������");	
				}else {
					��Ͻ��_box.setText(��Ͻ��_box.getText().replace("���֫�˷ʴ�֢��������", ""));	
				}		
			}
		});
		this.add(��������gh);
		this.add(��������gh_box);	

		//7
		DetaLabel ֬��ølipase= new DetaLabel("֬��ølipase:");  
		֬��ølipase.setForeground(Color.WHITE);
		֬��ølipase.setBounds(10+220*2, 32+ 25*6, 100, 20); ֬��ølipase.indexString= "ZFMLIPASE"; jFrameList.add(֬��ølipase);
		JTextField ֬��ølipase_box= new JTextField();
		֬��ølipase_box.setBounds(10+ 110+220*2, 33+ 25*6, 80, 20);
		֬��ølipase_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				//���ߣ����ڼ����������ף����ٰ�������������θ���ף������裬�����ף���Һ���׵ȡ����ͣ����ڸ��༲������ΰ�����Ӳ����
				//��״̬��
				String temp= ֬��ølipase_box.getText();
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
		this.add(֬��ølipase);
		this.add(֬��ølipase_box);	
		//8
		DetaLabel Ѫ��Ҷ��ⶨ= new DetaLabel("Ѫ��Ҷ��ⶨfa:");  
		Ѫ��Ҷ��ⶨ.setForeground(Color.WHITE);
		Ѫ��Ҷ��ⶨ.setBounds(10+220*2, 32+ 25*7, 100, 20); Ѫ��Ҷ��ⶨ.indexString= "XJYSCDFA"; jFrameList.add(Ѫ��Ҷ��ⶨ);
		JTextField Ѫ��Ҷ��ⶨ_box= new JTextField();
		Ѫ��Ҷ��ⶨ_box.setBounds(10+ 110+220*2, 33+ 25*7, 80, 20);
		Ѫ��Ҷ��ⶨ_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(Ѫ��Ҷ��ⶨ);
		this.add(Ѫ��Ҷ��ⶨ_box);	
		//9
		DetaLabel ͬ��øck_mm= new DetaLabel("ͬ��øck-mm:");  
		ͬ��øck_mm.setForeground(Color.WHITE);
		ͬ��øck_mm.setBounds(10+220*2, 32+ 25*8, 100, 20); ͬ��øck_mm.indexString= "TGMCK"; jFrameList.add(ͬ��øck_mm);
		JTextField ͬ��øck_mm_box= new JTextField();
		ͬ��øck_mm_box.setBounds(10+ 110+220*2, 33+ 25*8, 80, 20);
		ͬ��øck_mm_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(ͬ��øck_mm);
		this.add(ͬ��øck_mm_box);	
		//10
		DetaLabel ��������ø˫Ⱦɫ= new DetaLabel("��������ø˫Ⱦɫ:");  
		��������ø˫Ⱦɫ.setForeground(Color.WHITE);
		��������ø˫Ⱦɫ.setBounds(10+220*2, 32+ 25*9, 100, 20); ��������ø˫Ⱦɫ.indexString= "TYXZMSR"; jFrameList.add(��������ø˫Ⱦɫ);
		JTextField ��������ø˫Ⱦɫ_box= new JTextField();
		��������ø˫Ⱦɫ_box.setBounds(10+ 110+220*2, 33+ 25*9, 80, 20);
		��������ø˫Ⱦɫ_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(��������ø˫Ⱦɫ);
		this.add(��������ø˫Ⱦɫ_box);	
		//11
		DetaLabel ��Ⱦɫ= new DetaLabel("��Ⱦɫ:");  
		��Ⱦɫ.setForeground(Color.WHITE);
		��Ⱦɫ.setBounds(10+220*2, 32+ 25*10, 100, 20); ��Ⱦɫ.indexString= "TRS"; jFrameList.add(��Ⱦɫ);
		JTextField ��Ⱦɫ_box= new JTextField();
		��Ⱦɫ_box.setBounds(10+ 110+220*2, 33+ 25*10, 80, 20);
		��Ⱦɫ_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(��Ⱦɫ);
		this.add(��Ⱦɫ_box);	
		//12
		DetaLabel ��K= new DetaLabel("��K:");  
		��K.setForeground(Color.WHITE);
		��K.setBounds(10+220*2, 32+ 25*11, 100, 20); ��K.indexString= "JK"; jFrameList.add(��K);
		JTextField ��K_box= new JTextField();
		��K_box.setBounds(10+ 110+220*2, 33+ 25*11, 80, 20);
		��K_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(��K);
		this.add(��K_box);	
		//13
		DetaLabel �Ҹ����԰�hbeag= new DetaLabel("�Ҹ����԰�hbeag:");  
		�Ҹ����԰�hbeag.setForeground(Color.WHITE);
		�Ҹ����԰�hbeag.setBounds(10+220*2, 32+ 25*12, 100, 20); �Ҹ����԰�hbeag.indexString= "YGLDBHEAG"; jFrameList.add(�Ҹ����԰�hbeag);
		JTextField �Ҹ����԰�hbeag_box= new JTextField();
		�Ҹ����԰�hbeag_box.setBounds(10+ 110+220*2, 33+ 25*12, 80, 20);
		�Ҹ����԰�hbeag_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(�Ҹ����԰�hbeag);
		this.add(�Ҹ����԰�hbeag_box);	
		//14
		DetaLabel ����������øȾɫ= new DetaLabel("��-����������øȾɫ:");  
		����������øȾɫ.setForeground(Color.WHITE);
		����������øȾɫ.setBounds(10+220*2, 32+ 25*13, 100, 20); ����������øȾɫ.indexString= "CSNFZMR"; jFrameList.add(����������øȾɫ);
		JTextField ����������øȾɫ_box= new JTextField();
		����������øȾɫ_box.setBounds(10+ 110+220*2, 33+ 25*13, 80, 20);
		����������øȾɫ_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(����������øȾɫ);
		this.add(����������øȾɫ_box);	
	}

	private void addThirdColomns(JTextField ��Ͻ��_box2, List<DetaLabel> jFrameList) {
		// TODO Auto-generated method stub
		//copy tab
		DetaLabel Ѫ��ͬ�Ͱ��װ���= new DetaLabel("Ѫ��ͬ�Ͱ��װ���hcy:");  
		Ѫ��ͬ�Ͱ��װ���.setForeground(Color.WHITE);
		Ѫ��ͬ�Ͱ��װ���.setBounds(10+220*3, 32+ 0, 100, 20); Ѫ��ͬ�Ͱ��װ���.indexString= "XJTBGASHCY"; jFrameList.add(Ѫ��ͬ�Ͱ��װ���);
		Ѫ��ͬ�Ͱ��װ���.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
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
		JTextField Ѫ��ͬ�Ͱ��װ���_box= new JTextField();
		Ѫ��ͬ�Ͱ��װ���_box.setBounds(10+ 110+220*3, 33+ 0, 80, 20);
		Ѫ��ͬ�Ͱ��װ���_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(Ѫ��ͬ�Ͱ��װ���_box
						, "����Ѫ�ܲ�����Σ������"
						, "" 
						, "" 
						,15, 9990, ��Ͻ��_box
						, "");
			}
		});
		this.add(Ѫ��ͬ�Ͱ��װ���);
		this.add(Ѫ��ͬ�Ͱ��װ���_box);	

		DetaLabel ��΢���׵�����й��= new DetaLabel("��΢���׵�����й��uaer:");  
		��΢���׵�����й��.setForeground(Color.WHITE);
		��΢���׵�����й��.setBounds(10+220*3, 32+ 25*1, 100, 20); ��΢���׵�����й��.indexString= "NWLBDPXUAER"; jFrameList.add(��΢���׵�����й��);
		JTextField ��΢���׵�����й��_box= new JTextField();
		��΢���׵�����й��_box.setBounds(10+ 110+220*3, 33+ 25*1, 80, 20);
		��΢���׵�����й��_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(��΢���׵�����й��_box
						, ""
						, "������������� ����" 
						, "" 
						,0, 20, ��Ͻ��_box
						, "");
			}
		});
		this.add(��΢���׵�����й��);
		this.add(��΢���׵�����й��_box);	

		DetaLabel ��cl= new DetaLabel("��cl:");  
		��cl.setForeground(Color.WHITE);
		��cl.setBounds(10+220*3, 32+ 25*2, 100, 20); ��cl.indexString= "CL"; jFrameList.add(��cl);
		JTextField ��cl_box= new JTextField();
		��cl_box.setBounds(10+ 110+220*3, 33+ 25*2, 80, 20);
		��cl_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(��cl_box
						, "���ͣ����ڵ���Ѫ֢������Ż�£���к��θҺ��Һ��֭Һ������ʧ�������ܼ��˼�����ɭ�ϲ���"
						, "���ߣ����ڸ���Ѫ֢���������ж�����������ˮ�����������������" 
						, "" 
						,96, 106, ��Ͻ��_box
						, "");
			}
		});
		this.add(��cl);
		this.add(��cl_box);	

		DetaLabel ��ϴҺ������balf= new DetaLabel("��ϴҺ������balf:");  
		��ϴҺ������balf.setForeground(Color.WHITE);
		��ϴҺ������balf.setBounds(10+220*3, 32+ 25* 3, 100, 20); ��ϴҺ������balf.indexString= "GXYCGJCBALF"; jFrameList.add(��ϴҺ������balf);
		JTextField ��ϴҺ������balf_box= new JTextField();
		��ϴҺ������balf_box.setBounds(10+ 110+220*3, 33+ 25* 3, 80, 20);
		��ϴҺ������balf_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(��ϴҺ������balf);
		this.add(��ϴҺ������balf_box);	

		DetaLabel �������������= new DetaLabel("�������������:");  
		�������������.setForeground(Color.WHITE);
		�������������.setBounds(10+220*3, 32+ 25*4, 100, 20); �������������.indexString= "HXDBJC"; jFrameList.add(�������������);
		JTextField �������������_box= new JTextField();
		�������������_box.setBounds(10+ 110+220*3, 33+ 25*4, 80, 20);
		�������������_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(�������������);
		this.add(�������������_box);	

		DetaLabel ������= new DetaLabel("��������:");  
		������.setForeground(Color.WHITE);
		������.setBounds(10+220*3, 32+ 25*5, 100, 20); ������.indexString= "JGN"; jFrameList.add(������);
		JTextField ������_box= new JTextField();
		������_box.setBounds(10+ 110+220*3, 33+ 25*5, 80, 20);
		������_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(������_box
						, "���ͣ����������ܲ�ȫ����Ѫ֢"
						, "���ߣ��������˷磬�˺���Ƥ���ס�" 
						, "" 
						,98, 230, ��Ͻ��_box
						, "");
			}
		});
		this.add(������);
		this.add(������_box);	

		//7
		DetaLabel �����򵰰�gigg= new DetaLabel("�����򵰰�gigg:");  
		�����򵰰�gigg.setForeground(Color.WHITE);
		�����򵰰�gigg.setBounds(10+220*3, 32+ 25*6, 100, 20); �����򵰰�gigg.indexString= "MYQDBGI"; jFrameList.add(�����򵰰�gigg);
		JTextField �����򵰰�gigg_box= new JTextField();
		�����򵰰�gigg_box.setBounds(10+ 110+220*3, 33+ 25*6, 80, 20);
		�����򵰰�gigg_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(�����򵰰�gigg_box
						, "���ͣ����߲�"
						, "����" 
						, "" 
						,90, 209, ��Ͻ��_box
						, "");
			}
		});
		this.add(�����򵰰�gigg);
		this.add(�����򵰰�gigg_box);	
		//8
		DetaLabel ��ˮldh= new DetaLabel("��ˮldh:");  
		��ˮldh.setForeground(Color.WHITE);
		��ˮldh.setBounds(10+220*3, 32+ 25*7, 100, 20); ��ˮldh.indexString= "XSLDH"; jFrameList.add(��ˮldh);
		JTextField ��ˮldh_box= new JTextField();
		��ˮldh_box.setBounds(10+ 110+220*3, 33+ 25*7, 80, 20);
		��ˮldh_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(��ˮldh);
		this.add(��ˮldh_box);	
		//9
		DetaLabel �ٽ���������fsm= new DetaLabel("�ٽ���������fsm:");  
		�ٽ���������fsm.setForeground(Color.WHITE);
		�ٽ���������fsm.setBounds(10+220*3, 32+ 25*8, 100, 20); �ٽ���������fsm.indexString= "CJPSFM"; jFrameList.add(�ٽ���������fsm);
		JTextField �ٽ���������fsm_box= new JTextField();
		�ٽ���������fsm_box.setBounds(10+ 110+220*3, 33+ 25*8, 80, 20);
		�ٽ���������fsm_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(�ٽ���������fsm);
		this.add(�ٽ���������fsm_box);	
		//10
		DetaLabel d������= new DetaLabel("d-�����壨d-dimer��:");  
		d������.setForeground(Color.WHITE);
		d������.setBounds(10+220*3, 32+ 25*9, 100, 20); d������.indexString= "DEJTDIMER"; jFrameList.add(d������);
		JTextField d������_box= new JTextField();
		d������_box.setBounds(10+ 110+220*3, 33+ 25*9, 80, 20);
		d������_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(d������);
		this.add(d������_box);	
		//11
		DetaLabel ��ӵ�����= new DetaLabel("��ӵ�����ibil:");  
		��ӵ�����.setForeground(Color.WHITE);
		��ӵ�����.setBounds(10+220*3, 32+ 25*10, 100, 20); ��ӵ�����.indexString= "JDHZIBIL"; jFrameList.add(��ӵ�����);
		JTextField ��ӵ�����_box= new JTextField();
		��ӵ�����_box.setBounds(10+ 110+220*3, 33+ 25*10, 80, 20);
		��ӵ�����_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(��ӵ�����_box
						, ""
						, ":���ߣ�������Ѫ�Ի��㣬���������㣬Ѫ�Ͳ�������Ѫ��Ӧ" 
						, "" 
						,0.1, 0.7, ��Ͻ��_box
						, "");
			}
		});
		this.add(��ӵ�����);
		this.add(��ӵ�����_box);	
		//12
		DetaLabel tϸ����Ⱥ�ⶨ= new DetaLabel("tϸ����Ⱥ�ⶨ:");  
		tϸ����Ⱥ�ⶨ.setForeground(Color.WHITE);
		tϸ����Ⱥ�ⶨ.setBounds(10+220*3, 32+ 25*11, 100, 20); tϸ����Ⱥ�ⶨ.indexString= "TXBYQCD"; jFrameList.add(tϸ����Ⱥ�ⶨ);
		JTextField tϸ����Ⱥ�ⶨ_box= new JTextField();
		tϸ����Ⱥ�ⶨ_box.setBounds(10+ 110+220*3, 33+ 25*11, 80, 20);
		tϸ����Ⱥ�ⶨ_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(tϸ����Ⱥ�ⶨ);
		this.add(tϸ����Ⱥ�ⶨ_box);	
		//13
		DetaLabel ����= new DetaLabel("����:");  
		����.setForeground(Color.WHITE);
		����.setBounds(10+220*3, 32+ 25*12, 100, 20); ����.indexString= "YH"; jFrameList.add(����);
		JTextField ����_box= new JTextField();
		����_box.setBounds(10+ 110+220*3, 33+ 25*12, 80, 20);
		����_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(����);
		this.add(����_box);	
		//14
		DetaLabel setSet= new DetaLabel("set:");  
		setSet.setForeground(Color.WHITE);
		setSet.setBounds(10+220*3, 32+ 25*13, 100, 20); setSet.indexString= "SET"; jFrameList.add(setSet);
		JTextField setSet_box= new JTextField();
		setSet_box.setBounds(10+ 110+220*3, 33+ 25*13, 80, 20);
		setSet_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(setSet);
		this.add(setSet_box);	
	}

	private void addSecondColomns(JTextField ��Ͻ��_box2, List<DetaLabel> jFrameList) {
		// TODO Auto-generated method stub
		//copy tab
		DetaLabel ̥���ǵ���̥���ǵ���= new DetaLabel("̥���ǵ���̥���ǵ���:");  
		̥���ǵ���̥���ǵ���.setForeground(Color.WHITE);
		̥���ǵ���̥���ǵ���.setBounds(10+220*4, 32+ 0, 100, 20); ̥���ǵ���̥���ǵ���.indexString= "TPDB"; jFrameList.add(̥���ǵ���̥���ǵ���);
		JTextField ̥���ǵ���̥���ǵ���_box= new JTextField();
		̥���ǵ���̥���ǵ���_box.setBounds(10+ 110+220*4, 33+ 0, 80, 20);
		̥���ǵ���̥���ǵ���_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(̥���ǵ���̥���ǵ���);
		this.add(̥���ǵ���̥���ǵ���_box);	

		DetaLabel ����ϸ����ѧ��������= new DetaLabel("����ϸ����ѧ��������-1mcp-1:");  
		����ϸ����ѧ��������.setForeground(Color.WHITE);
		����ϸ����ѧ��������.setBounds(10+220*4, 32+ 25*1, 100, 20); ����ϸ����ѧ��������.indexString= "DHXBHQHYZMCP"; jFrameList.add(����ϸ����ѧ��������);
		JTextField ����ϸ����ѧ��������_box= new JTextField();
		����ϸ����ѧ��������_box.setBounds(10+ 110+220*4, 33+ 25*1, 80, 20);
		����ϸ����ѧ��������_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(����ϸ����ѧ��������);
		this.add(����ϸ����ѧ��������_box);	

		DetaLabel ����ϸ����̬ѧ��ϼ��= new DetaLabel("����ϸ����̬ѧ��ϼ��:");  
		����ϸ����̬ѧ��ϼ��.setForeground(Color.WHITE);
		����ϸ����̬ѧ��ϼ��.setBounds(10+220*4, 32+ 25*2, 100, 20); ����ϸ����̬ѧ��ϼ��.indexString= "GSXBTZDJC"; jFrameList.add(����ϸ����̬ѧ��ϼ��);
		JTextField ����ϸ����̬ѧ��ϼ��_box= new JTextField();
		����ϸ����̬ѧ��ϼ��_box.setBounds(10+ 110+220*4, 33+ 25*2, 80, 20);
		����ϸ����̬ѧ��ϼ��_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(����ϸ����̬ѧ��ϼ��);
		this.add(����ϸ����̬ѧ��ϼ��_box);	

		DetaLabel ���ʼ��Ե��׿���= new DetaLabel("���ʼ��Ե��׿���mbp:");  
		���ʼ��Ե��׿���.setForeground(Color.WHITE);
		���ʼ��Ե��׿���.setBounds(10+220*4, 32+ 25* 3, 100, 20); ���ʼ��Ե��׿���.indexString= "SXJDBKTMBP"; jFrameList.add(���ʼ��Ե��׿���);
		JTextField ���ʼ��Ե��׿���_box= new JTextField();
		���ʼ��Ե��׿���_box.setBounds(10+ 110+220*4, 33+ 25* 3, 80, 20);
		���ʼ��Ե��׿���_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(���ʼ��Ե��׿���);
		this.add(���ʼ��Ե��׿���_box);	

		DetaLabel �Ƕ�������ø= new DetaLabel("�Ƕ�������øhbdh:");  
		�Ƕ�������ø.setForeground(Color.WHITE);
		�Ƕ�������ø.setBounds(10+220*4, 32+ 25*4, 100, 20); �Ƕ�������ø.indexString= "QDSZTMHBDH"; jFrameList.add(�Ƕ�������ø);
		JTextField �Ƕ�������ø_box= new JTextField();
		�Ƕ�������ø_box.setBounds(10+ 110+ 220* 4, 33+ 25*4, 80, 20);
		�Ƕ�������ø_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(�Ƕ�������ø_box
						, ""
						, "��Ϊ�����Ĺ���ϵ�һ��ָ�꣬��LDH������ͬ���ڼ����Ĺ�ʱ��ø��ѪҺ��ά�ָ�ֵ���ɴ�2�����ҡ�" 
						, "" 
						,80, 220, ��Ͻ��_box
						, "");

			}
		});
		this.add(�Ƕ�������ø);
		this.add(�Ƕ�������ø_box);	

		DetaLabel ��c= new DetaLabel("c-��c-p:");  
		��c.setForeground(Color.WHITE);
		��c.setBounds(10+220*4, 32+ 25*5, 100, 20); ��c.indexString= "TCP"; jFrameList.add(��c);
		JTextField ��c_box= new JTextField();
		��c_box.setBounds(10+ 110+220*4, 33+ 25*5, 80, 20);
		��c_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(��c);
		this.add(��c_box);	

		//7
		DetaLabel �Բ���ԭ����ټ��= new DetaLabel("�Բ���ԭ����ټ�⣨ct��:");  
		�Բ���ԭ����ټ��.setForeground(Color.WHITE);
		�Բ���ԭ����ټ��.setBounds(10+220*4, 32+ 25*6, 100, 20); �Բ���ԭ����ټ��.indexString= "XBYTKSJC"; jFrameList.add(�Բ���ԭ����ټ��);
		JTextField �Բ���ԭ����ټ��_box= new JTextField();
		�Բ���ԭ����ټ��_box.setBounds(10+ 110+220*4, 33+ 25*6, 80, 20);
		�Բ���ԭ����ټ��_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(�Բ���ԭ����ټ��);
		this.add(�Բ���ԭ����ټ��_box);	
		//8
		DetaLabel �߿���= new DetaLabel("�߿���phl:");  
		�߿���.setForeground(Color.WHITE);
		�߿���.setBounds(10+220*4, 32+ 25*7, 100, 20); �߿���.indexString= "CKSPHL"; jFrameList.add(�߿���);
		JTextField �߿���_box= new JTextField();
		�߿���_box.setBounds(10+ 110+220*4, 33+ 25*7, 80, 20);
		�߿���_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(�߿���);
		this.add(�߿���_box);	
		//9
		DetaLabel ����޺�ϸ������= new DetaLabel("����޺�ϸ�����������������:");  
		����޺�ϸ������.setForeground(Color.WHITE);
		����޺�ϸ������.setBounds(10+220*4, 32+ 25*8, 100, 20); ����޺�ϸ������.indexString= "GSJHXBDL"; jFrameList.add(����޺�ϸ������);
		JTextField ����޺�ϸ������_box= new JTextField();
		����޺�ϸ������_box.setBounds(10+ 110+220*4, 33+ 25*8, 80, 20);
		����޺�ϸ������_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(����޺�ϸ������);
		this.add(����޺�ϸ������_box);	
		//10
		DetaLabel Ѫ�����������ӷ���= new DetaLabel("Ѫ�����������ӷ���:");  
		Ѫ�����������ӷ���.setForeground(Color.WHITE);
		Ѫ�����������ӷ���.setBounds(10+220*4, 32+ 25*9, 100, 20); Ѫ�����������ӷ���.indexString= "XQFXJLZ"; jFrameList.add(Ѫ�����������ӷ���);
		JTextField Ѫ�����������ӷ���_box= new JTextField();
		Ѫ�����������ӷ���_box.setBounds(10+ 110+220*4, 33+ 25*9, 80, 20);
		Ѫ�����������ӷ���_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(Ѫ�����������ӷ���);
		this.add(Ѫ�����������ӷ���_box);	
		//11
		DetaLabel �Լ�Һ������= new DetaLabel("�Լ�Һ������:");  
		�Լ�Һ������.setForeground(Color.WHITE);
		�Լ�Һ������.setBounds(10+220*4, 32+ 25*10, 100, 20); �Լ�Һ������.indexString= "NJYSHT"; jFrameList.add(�Լ�Һ������);
		JTextField �Լ�Һ������_box= new JTextField();
		�Լ�Һ������_box.setBounds(10+ 110+220*4, 33+ 25*10, 80, 20);
		�Լ�Һ������_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(�Լ�Һ������);
		this.add(�Լ�Һ������_box);	
		//12***********************************
		DetaLabel Ѫ�ܽ�����ת��ø= new DetaLabel("Ѫ�ܽ�����ת��øsace:");  
		Ѫ�ܽ�����ת��ø.setForeground(Color.WHITE);
		Ѫ�ܽ�����ת��ø.setBounds(10+220*4, 32+ 25*11, 100, 20); Ѫ�ܽ�����ת��ø.indexString= "XGJZSHMACE"; jFrameList.add(Ѫ�ܽ�����ת��ø);
		JTextField Ѫ�ܽ�����ת��ø_box= new JTextField();
		Ѫ�ܽ�����ת��ø_box.setBounds(10+ 110+220*4, 33+ 25*11, 80, 20);
		Ѫ�ܽ�����ת��ø_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��
				printValue(Ѫ�ܽ�����ת��ø_box
						, ""
						, "��ڲ����ν��" 
						, "" 
						, 20, 40, ��Ͻ��_box
						, "");
			}
		});
		this.add(Ѫ�ܽ�����ת��ø);
		this.add(Ѫ�ܽ�����ת��ø_box);	
		//13
		DetaLabel ��ԪȾɫ= new DetaLabel("��ԪȾɫ:");  
		��ԪȾɫ.setForeground(Color.WHITE);
		��ԪȾɫ.setBounds(10+220*4, 32+ 25*12, 100, 20); ��ԪȾɫ.indexString= "TYRS"; jFrameList.add(��ԪȾɫ);
		JTextField ��ԪȾɫ_box= new JTextField();
		��ԪȾɫ_box.setBounds(10+ 110+220*4, 33+ 25*12, 80, 20);
		��ԪȾɫ_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(��ԪȾɫ);
		this.add(��ԪȾɫ_box);	
		//14
		DetaLabel �Լ�Һϸ��ѧ���= new DetaLabel("�Լ�Һϸ��ѧ���:");  
		�Լ�Һϸ��ѧ���.setForeground(Color.WHITE);
		�Լ�Һϸ��ѧ���.setBounds(10+220*4, 32+ 25*13, 100, 20); �Լ�Һϸ��ѧ���.indexString= "NJYXBJC"; jFrameList.add(�Լ�Һϸ��ѧ���);
		JTextField �Լ�Һϸ��ѧ���_box= new JTextField();
		�Լ�Һϸ��ѧ���_box.setBounds(10+ 110+220*4, 33+ 25*13, 80, 20);
		�Լ�Һϸ��ѧ���_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��״̬��

			}
		});
		this.add(�Լ�Һϸ��ѧ���);
		this.add(�Լ�Һϸ��ѧ���_box);	
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
			DetaLabelStables.stableImages.setTarget(false);;
		}
	}
}
