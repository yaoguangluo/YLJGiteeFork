package ME.APM.VSQ.OPE.hospital;

import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class NeiKeJPanel  extends JPanel implements MouseListener, KeyListener, ActionListener{

		private static final long serialVersionUID= 1L;
		public NeiKeJPanel(JTextPane name){
			this.setLayout(null);
			this.setBounds(0, 0, 1180, 610);
			this.setBackground(Color.BLACK);
			
			//1���� ������� �ұ������
			JLabel ��Ͻ��= new JLabel("��Ͻ�� :");  
			��Ͻ��.setForeground(Color.WHITE);
			��Ͻ��.setBounds(10, 20+ 300+ 90, 100, 50);
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
			
			
			//copy tab
			JLabel baiDanBai= new JLabel("�׵���alb :");  
			baiDanBai.setForeground(Color.WHITE);
			baiDanBai.setBounds(10, 20+ 0, 100, 50);
			JTextField baiDanBai_box= new JTextField();
			baiDanBai_box.setBounds(10+ 110, 33+ 0, 80, 20);
			baiDanBai_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//��״̬��

				}
			});
			this.add(baiDanBai);
			this.add(baiDanBai_box);	
			
			JLabel label2= new JLabel("�Ҹ����԰�hbcab:");  
			label2.setForeground(Color.WHITE);
			label2.setBounds(10, 20+ 25*1, 100, 50);
			JTextField label2_box= new JTextField();
			label2_box.setBounds(10+ 110, 33+ 25*1, 80, 20);
			label2_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//��״̬��

				}
			});
			this.add(label2);
			this.add(label2_box);	

			JLabel label3= new JLabel("������ʵ�� :");  
			label3.setForeground(Color.WHITE);
			label3.setBounds(10, 20+ 25*2, 100, 50);
			JTextField label3_box= new JTextField();
			label3_box.setBounds(10+ 110, 33+ 25*2, 80, 20);
			label3_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//��״̬��

				}
			});
			this.add(label3);
			this.add(label3_box);	
			
			JLabel label4= new JLabel("���澵�� :");  
			label4.setForeground(Color.WHITE);
			label4.setBounds(10, 20+ 25* 3, 100, 50);
			JTextField label4_box= new JTextField();
			label4_box.setBounds(10+ 110, 33+ 25* 3, 80, 20);
			label4_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//��״̬��

				}
			});
			this.add(label4);
			this.add(label4_box);	
			
			JLabel label5= new JLabel("�Բ�֧ԭ���⣨uu�� :");  
			label5.setForeground(Color.WHITE);
			label5.setBounds(10, 20+ 25*4, 100, 50);
			JTextField label5_box= new JTextField();
			label5_box.setBounds(10+ 110, 33+ 25*4, 80, 20);
			label5_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//��״̬��

				}
			});
			this.add(label5);
			this.add(label5_box);	
			
			JLabel label6= new JLabel("���ܶ�֬����ldl-c :");  
			label6.setForeground(Color.WHITE);
			label6.setBounds(10, 20+ 25*5, 100, 50);
			JTextField label6_box= new JTextField();
			label6_box.setBounds(10+ 110, 33+ 25*5, 80, 20);
			label6_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//��״̬��

				}
			});
			this.add(label6);
			this.add(label6_box);	
			
			//7
			JLabel label7= new JLabel("Ѫ��nh3 :");  
			label7.setForeground(Color.WHITE);
			label7.setBounds(10, 20+ 25*6, 100, 50);
			JTextField label7_box= new JTextField();
			label7_box.setBounds(10+ 110, 33+ 25*6, 80, 20);
			label7_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//��״̬��

				}
			});
			this.add(label7);
			this.add(label7_box);	
			//8
			JLabel label68= new JLabel("�ȵ��ؿ���ins-ab :");  
			label68.setForeground(Color.WHITE);
			label68.setBounds(10, 20+ 25*7, 100, 50);
			JTextField label68_box= new JTextField();
			label68_box.setBounds(10+ 110, 33+ 25*7, 80, 20);
			label68_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//��״̬��

				}
			});
			this.add(label68);
			this.add(label68_box);	
			//9
			JLabel label69= new JLabel("�أ��򣩼أ��� :");  
			label69.setForeground(Color.WHITE);
			label69.setBounds(10, 20+ 25*8, 100, 50);
			JTextField label69_box= new JTextField();
			label69_box.setBounds(10+ 110, 33+ 25*8, 80, 20);
			label69_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//��״̬��

				}
			});
			this.add(label69);
			this.add(label69_box);	
			//10
			JLabel label610= new JLabel("��ip :");  
			label610.setForeground(Color.WHITE);
			label610.setBounds(10, 20+ 25*9, 100, 50);
			JTextField label610_box= new JTextField();
			label610_box.setBounds(10+ 110, 33+ 25*9, 80, 20);
			label610_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//��״̬��

				}
			});
			this.add(label610);
			this.add(label610_box);	
			//11
			JLabel label611= new JLabel("�ȣ����ȣ���:");  
			label611.setForeground(Color.WHITE);
			label611.setBounds(10, 20+ 25*10, 100, 50);
			JTextField label611_box= new JTextField();
			label611_box.setBounds(10+ 110, 33+ 25*10, 80, 20);
			label611_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//��״̬��

				}
			});
			this.add(label611);
			this.add(label611_box);	
			//12
			JLabel label612= new JLabel("���Ƶ���ttnt :");  
			label612.setForeground(Color.WHITE);
			label612.setBounds(10, 20+ 25*11, 100, 50);
			JTextField label612_box= new JTextField();
			label612_box.setBounds(10+ 110, 33+ 25*11, 80, 20);
			label612_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//��״̬��

				}
			});
			this.add(label612);
			this.add(label612_box);	
			//13
			JLabel label613= new JLabel("�ƣ����ƣ��� :");  
			label613.setForeground(Color.WHITE);
			label613.setBounds(10, 20+ 25*12, 100, 50);
			JTextField label613_box= new JTextField();
			label613_box.setBounds(10+ 110, 33+ 25*12, 80, 20);
			label613_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//��״̬��

				}
			});
			this.add(label613);
			this.add(label613_box);	
			//14
			JLabel label614= new JLabel("��������øalp :");  
			label614.setForeground(Color.WHITE);
			label614.setBounds(10, 20+ 25*13, 100, 50);
			JTextField label614_box= new JTextField();
			label614_box.setBounds(10+ 110, 33+ 25*13, 80, 20);
			label614_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//��״̬��

				}
			});
			this.add(label614);
			this.add(label614_box);	
			//
			addSecondColomns();
			addThirdColomns();
			addFourthColomns();
			addFifthColomns();
		}
		private void addFifthColomns() {
			// TODO Auto-generated method stub
			//copy tab
			JLabel baiDanBai222223= new JLabel("Ѫ��͸ѹѪosm:");  
			baiDanBai222223.setForeground(Color.WHITE);
			baiDanBai222223.setBounds(10+220*4, 20+ 0, 100, 50);
			JTextField baiDanBai222223_box= new JTextField();
			baiDanBai222223_box.setBounds(10+ 110+220*4, 33+ 0, 80, 20);
			baiDanBai222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//��״̬��

				}
			});
			this.add(baiDanBai222223);
			this.add(baiDanBai222223_box);	
			
			JLabel label2222223= new JLabel("���������cor:");  
			label2222223.setForeground(Color.WHITE);
			label2222223.setBounds(10+220*4, 20+ 25*1, 100, 50);
			JTextField label2222223_box= new JTextField();
			label2222223_box.setBounds(10+ 110+220*4, 33+ 25*1, 80, 20);
			label2222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//��״̬��

				}
			});
			this.add(label2222223);
			this.add(label2222223_box);	

			JLabel label3222223= new JLabel("Ѫ����ͭ cu:");  
			label3222223.setForeground(Color.WHITE);
			label3222223.setBounds(10+220*4, 20+ 25*2, 100, 50);
			JTextField label3222223_box= new JTextField();
			label3222223_box.setBounds(10+ 110+220*4, 33+ 25*2, 80, 20);
			label3222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//��״̬��

				}
			});
			this.add(label3222223);
			this.add(label3222223_box);	
			
			JLabel label4222223= new JLabel("������� igg:");  
			label4222223.setForeground(Color.WHITE);
			label4222223.setBounds(10+220*4, 20+ 25* 3, 100, 50);
			JTextField label4222223_box= new JTextField();
			label4222223_box.setBounds(10+ 110+220*4, 33+ 25* 3, 80, 20);
			label4222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//��״̬��

				}
			});
			this.add(label4222223);
			this.add(label4222223_box);	
			
			JLabel label5222223= new JLabel("��״���ټ��� pth:");  
			label5222223.setForeground(Color.WHITE);
			label5222223.setBounds(10+220*4, 20+ 25*4, 100, 50);
			JTextField label5222223_box= new JTextField();
			label5222223_box.setBounds(10+ 110+220*4, 33+ 25*4, 80, 20);
			label5222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//��״̬��

				}
			});
			this.add(label5222223);
			this.add(label5222223_box);	
			
			JLabel label6222223= new JLabel("��3-������4-�ǻ��������ᣨvma��:");  
			label6222223.setForeground(Color.WHITE);
			label6222223.setBounds(10+220*4, 20+ 25*5, 100, 50);
			JTextField label6222223_box= new JTextField();
			label6222223_box.setBounds(10+ 110+220*4, 33+ 25*5, 80, 20);
			label6222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//��״̬��

				}
			});
			this.add(label6222223);
			this.add(label6222223_box);	
			
			//7
			JLabel label7222223= new JLabel("��֬����ap0alap0 al:");  
			label7222223.setForeground(Color.WHITE);
			label7222223.setBounds(10+220*4, 20+ 25*6, 100, 50);
			JTextField label7222223_box= new JTextField();
			label7222223_box.setBounds(10+ 110+220*4, 33+ 25*6, 80, 20);
			label7222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//��״̬��

				}
			});
			this.add(label7222223);
			this.add(label7222223_box);	
			//8
			JLabel label68222223= new JLabel("���Ƶ���i tni:");  
			label68222223.setForeground(Color.WHITE);
			label68222223.setBounds(10+220*4, 20+ 25*7, 100, 50);
			JTextField label68222223_box= new JTextField();
			label68222223_box.setBounds(10+ 110+220*4, 33+ 25*7, 80, 20);
			label68222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//��״̬��

				}
			});
			this.add(label68222223);
			this.add(label68222223_box);	
			//9
			JLabel label69222223= new JLabel("�ȴ�������as-d��øȾɫ:");  
			label69222223.setForeground(Color.WHITE);
			label69222223.setBounds(10+220*4, 20+ 25*8, 100, 50);
			JTextField label69222223_box= new JTextField();
			label69222223_box.setBounds(10+ 110+220*4, 33+ 25*8, 80, 20);
			label69222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//��״̬��

				}
			});
			this.add(label69222223);
			this.add(label69222223_box);	
			//10
			JLabel label610222223= new JLabel("���� lact:");  
			label610222223.setForeground(Color.WHITE);
			label610222223.setBounds(10+220*4, 20+ 25*9, 100, 50);
			JTextField label610222223_box= new JTextField();
			label610222223_box.setBounds(10+ 110+220*4, 33+ 25*9, 80, 20);
			label610222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//��״̬��

				}
			});
			this.add(label610222223);
			this.add(label610222223_box);	
			//11
			JLabel label611222223= new JLabel("������ǿ�ԭ242��� ca242 :");  
			label611222223.setForeground(Color.WHITE);
			label611222223.setBounds(10+220*4, 20+ 25*10, 100, 50);
			JTextField label611222223_box= new JTextField();
			label611222223_box.setBounds(10+ 110+220*4, 33+ 25*10, 80, 20);
			label611222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//��״̬��

				}
			});
			this.add(label611222223);
			this.add(label611222223_box);	
			//12
			JLabel label612222223= new JLabel("�� ca:");  
			label612222223.setForeground(Color.WHITE);
			label612222223.setBounds(10+220*4, 20+ 25*11, 100, 50);
			JTextField label612222223_box= new JTextField();
			label612222223_box.setBounds(10+ 110+220*4, 33+ 25*11, 80, 20);
			label612222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//��״̬��

				}
			});
			this.add(label612222223);
			this.add(label612222223_box);	
			//13
			JLabel label613222223= new JLabel("����ϸ����Ⱦ��������-1�� mip-1��:");  
			label613222223.setForeground(Color.WHITE);
			label613222223.setBounds(10+220*4, 20+ 25*12, 100, 50);
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
			JLabel label614222223= new JLabel("��17-�ǹ̴� 17-oh:");  
			label614222223.setForeground(Color.WHITE);
			label614222223.setBounds(10+220*4, 20+ 25*13, 100, 50);
			JTextField label614222223_box= new JTextField();
			label614222223_box.setBounds(10+ 110+220*4, 33+ 25*13, 80, 20);
			label614222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//��״̬��

				}
			});
			this.add(label614222223);
			this.add(label614222223_box);	
		}
		
		void addFourthColomns() {
			// TODO Auto-generated method stub
			//copy tab
			JLabel baiDanBai222223= new JLabel("ldhͬ��øis0-ldh :");  
			baiDanBai222223.setForeground(Color.WHITE);
			baiDanBai222223.setBounds(10+220*3, 20+ 0, 100, 50);
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
			
			JLabel label2222223= new JLabel("�ȵ���ins :");  
			label2222223.setForeground(Color.WHITE);
			label2222223.setBounds(10+220*3, 20+ 25*1, 100, 50);
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

			JLabel label3222223= new JLabel("ͬ t:");  
			label3222223.setForeground(Color.WHITE);
			label3222223.setBounds(10+220*3, 20+ 25*2, 100, 50);
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
			
			JLabel label4222223= new JLabel("���ø amy:");  
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
			
			JLabel label5222223= new JLabel("��������ø ldh:");  
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
			
			JLabel label6222223= new JLabel("�� tron:");  
			label6222223.setForeground(Color.WHITE);
			label6222223.setBounds(10+220*3, 20+ 25*5, 100, 50);
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
			JLabel label7222223= new JLabel("��������ø�;�ʯ��l+:");  
			label7222223.setForeground(Color.WHITE);
			label7222223.setBounds(10+220*3, 20+ 25*6, 100, 50);
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
			JLabel label68222223= new JLabel("��ϸ���̼�����g-csf:");  
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
			JLabel label69222223= new JLabel("�Ƽ��� el:");  
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
			JLabel label610222223= new JLabel("ͬ��øck-mb:");  
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
			JLabel label611222223= new JLabel("����͸ѹ��osm:");  
			label611222223.setForeground(Color.WHITE);
			label611222223.setBounds(10+220*3, 20+ 25*10, 100, 50);
			JTextField label611222223_box= new JTextField();
			label611222223_box.setBounds(10+ 110+220*3, 33+ 25*10, 80, 20);
			label611222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//��״̬��

				}
			});
			this.add(label611222223);
			this.add(label611222223_box);	
			//12
			JLabel label612222223= new JLabel("���ӡ������tb-poc:");  
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
			JLabel label613222223= new JLabel("�����Ѱ��� ada :");  
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
			JLabel label614222223= new JLabel("����ʪ������:");  
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
		
		private void addThirdColomns() {
			// TODO Auto-generated method stub
			//copy tab
			JLabel baiDanBai222223= new JLabel("���ž���ԭ���:");  
			baiDanBai222223.setForeground(Color.WHITE);
			baiDanBai222223.setBounds(10+220*2, 20+ 0, 100, 50);
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
			
			JLabel label2222223= new JLabel("�������ȡ��cultureoffungi :");  
			label2222223.setForeground(Color.WHITE);
			label2222223.setBounds(10+220*2, 20+ 25*1, 100, 50);
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

			JLabel label3222223= new JLabel("ת��øggt :");  
			label3222223.setForeground(Color.WHITE);
			label3222223.setBounds(10+220*2, 20+ 25*2, 100, 50);
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
			
			JLabel label4222223= new JLabel("�����黯���immunohistophathol-ogicstain :");  
			label4222223.setForeground(Color.WHITE);
			label4222223.setBounds(10+220*2, 20+ 25* 3, 100, 50);
			JTextField label4222223_box= new JTextField();
			label4222223_box.setBounds(10+ 110+220*2, 33+ 25* 3, 80, 20);
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
			label5222223.setBounds(10+220*2, 20+ 25*4, 100, 50);
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
			
			JLabel label6222223= new JLabel("���ʼ��Ե���mbp :");  
			label6222223.setForeground(Color.WHITE);
			label6222223.setBounds(10+220*2, 20+ 25*5, 100, 50);
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
			JLabel label7222223= new JLabel("Ƥ��������dermatopathologicalexamination :");  
			label7222223.setForeground(Color.WHITE);
			label7222223.setBounds(10+220*2, 20+ 25*6, 100, 50);
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
			JLabel label68222223= new JLabel("Ѫ����пzn :");  
			label68222223.setForeground(Color.WHITE);
			label68222223.setBounds(10+220*2, 20+ 25*7, 100, 50);
			JTextField label68222223_box= new JTextField();
			label68222223_box.setBounds(10+ 110+220*2, 33+ 25*7, 80, 20);
			label68222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//��״̬��

				}
			});
			this.add(label68222223);
			this.add(label68222223_box);	
			//9
			JLabel label69222223= new JLabel("��Ƥ�ʴ���Ƥ�ʴ� :");  
			label69222223.setForeground(Color.WHITE);
			label69222223.setBounds(10+220*2, 20+ 25*8, 100, 50);
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
			JLabel label610222223= new JLabel("��ɫ�������ԭ:");  
			label610222223.setForeground(Color.WHITE);
			label610222223.setBounds(10+220*2, 20+ 25*9, 100, 50);
			JTextField label610222223_box= new JTextField();
			label610222223_box.setBounds(10+ 110+220*2, 33+ 25*9, 80, 20);
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
			label611222223.setBounds(10+220*2, 20+ 25*10, 100, 50);
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
			JLabel label612222223= new JLabel("������-1ps-1:");  
			label612222223.setForeground(Color.WHITE);
			label612222223.setBounds(10+220*2, 20+ 25*11, 100, 50);
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
			JLabel label613222223= new JLabel("�ܵ���tp:");  
			label613222223.setForeground(Color.WHITE);
			label613222223.setBounds(10+220*2, 20+ 25*12, 100, 50);
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
			JLabel label614222223= new JLabel("����֧ԭ��igg:");  
			label614222223.setForeground(Color.WHITE);
			label614222223.setBounds(10+220*2, 20+ 25*13, 100, 50);
			JTextField label614222223_box= new JTextField();
			label614222223_box.setBounds(10+ 110+220*2, 33+ 25*13, 80, 20);
			label614222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//��״̬��

				}
			});
			this.add(label614222223);
			this.add(label614222223_box);	
		}
		
		private void addSecondColomns() {
			// TODO Auto-generated method stub
			//copy tab
			JLabel baiDanBai22= new JLabel("���������ȡ��cultureofneisseriagonorrhoen:");  
			baiDanBai22.setForeground(Color.WHITE);
			baiDanBai22.setBounds(10+220*1, 20+ 0, 100, 50);
			JTextField baiDanBai22_box= new JTextField();
			baiDanBai22_box.setBounds(10+ 110+220*1, 33+ 0, 80, 20);
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
			label222.setBounds(10+220*1, 20+ 25*1, 100, 50);
			JTextField label222_box= new JTextField();
			label222_box.setBounds(10+ 110+220*1, 33+ 25*1, 80, 20);
			label222_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//��״̬��

				}
			});
			this.add(label222);
			this.add(label222_box);	

			JLabel label322= new JLabel("ѪС��ۼ�:");  
			label322.setForeground(Color.WHITE);
			label322.setBounds(10+220*1, 20+ 25*2, 100, 50);
			JTextField label322_box= new JTextField();
			label322_box.setBounds(10+ 110+220*1, 33+ 25*2, 80, 20);
			label322_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//��״̬��

				}
			});
			this.add(label322);
			this.add(label322_box);	
			
			JLabel label422= new JLabel("�Ȳ�ת��øast:");  
			label422.setForeground(Color.WHITE);
			label422.setBounds(10+220*1, 20+ 25* 3, 100, 50);
			JTextField label422_box= new JTextField();
			label422_box.setBounds(10+ 110+220*1, 33+ 25* 3, 80, 20);
			label422_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//��״̬��

				}
			});
			this.add(label422);
			this.add(label422_box);	
			
			JLabel label522= new JLabel("�׸ο���-igmhav-igm:");  
			label522.setForeground(Color.WHITE);
			label522.setBounds(10+220*1, 20+ 25*4, 100, 50);
			JTextField label522_box= new JTextField();
			label522_box.setBounds(10+ 110+220*1, 33+ 25*4, 80, 20);
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
			label622.setBounds(10+220*1, 20+ 25*5, 100, 50);
			JTextField label622_box= new JTextField();
			label622_box.setBounds(10+ 110+220*1, 33+ 25*5, 80, 20);
			label622_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//��״̬��

				}
			});
			this.add(label622);
			this.add(label622_box);	
			
			//7
			JLabel label722= new JLabel("֬��ølipase:");  
			label722.setForeground(Color.WHITE);
			label722.setBounds(10+220*1, 20+ 25*6, 100, 50);
			JTextField label722_box= new JTextField();
			label722_box.setBounds(10+ 110+220*1, 33+ 25*6, 80, 20);
			label722_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//��״̬��

				}
			});
			this.add(label722);
			this.add(label722_box);	
			//8
			JLabel label6822= new JLabel("Ѫ��Ҷ��ⶨfa:");  
			label6822.setForeground(Color.WHITE);
			label6822.setBounds(10+220*1, 20+ 25*7, 100, 50);
			JTextField label6822_box= new JTextField();
			label6822_box.setBounds(10+ 110+220*1, 33+ 25*7, 80, 20);
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
			label6922.setBounds(10+220*1, 20+ 25*8, 100, 50);
			JTextField label6922_box= new JTextField();
			label6922_box.setBounds(10+ 110+220*1, 33+ 25*8, 80, 20);
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
			label61022.setBounds(10+220*1, 20+ 25*9, 100, 50);
			JTextField label61022_box= new JTextField();
			label61022_box.setBounds(10+ 110+220*1, 33+ 25*9, 80, 20);
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
			label61122.setBounds(10+220*1, 20+ 25*10, 100, 50);
			JTextField label61122_box= new JTextField();
			label61122_box.setBounds(10+ 110+220*1, 33+ 25*10, 80, 20);
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
			label61222.setBounds(10+220*1, 20+ 25*11, 100, 50);
			JTextField label61222_box= new JTextField();
			label61222_box.setBounds(10+ 110+220*1, 33+ 25*11, 80, 20);
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
			label61322.setBounds(10+220*1, 20+ 25*12, 100, 50);
			JTextField label61322_box= new JTextField();
			label61322_box.setBounds(10+ 110+220*1, 33+ 25*12, 80, 20);
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
			label61422.setBounds(10+220*1, 20+ 25*13, 100, 50);
			JTextField label61422_box= new JTextField();
			label61422_box.setBounds(10+ 110+220*1, 33+ 25*13, 80, 20);
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
	}
