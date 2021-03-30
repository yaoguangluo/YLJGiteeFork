package PEI.thread;
import java.awt.Color;
import java.awt.Container;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JSlider;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.ASQ.PSU.OCI.tinos.engine.analysis.Analyzer;

import AVQ.OEQ.cap.Monitor;
import AVQ.PVU.vedio.PlayerControl;
import AVQ.PVU.vedio.PlayerShow;
import ME.sample.App;
import comp.filenameFilter.TXTFilter;
import comp.jbutton.DetaButton;
public class MakeContainerZNXZ extends Thread implements Runnable{
	public Container jpanelThird;
	public App u;
	public JTabbedPane jTabbedpane;
	public List<String> tabNames;
	public Analyzer analyzer;
	public Thread thread;
	public Map<String, String> pos;
	public Map<String, String> pose;
	public Map<String, String> etc;
	public Map<String, String> cte;
	public MakeContainerZNXZ(Analyzer analyzer, Container jpanelThird, App u2
			, JTabbedPane jTabbedpane, List<String> tabNames2, Map<String, String> pos
			, Map<String, String> pose, Map<String, String> etc, Map<String, String> cte) {
		super();
		this.jpanelThird= jpanelThird;
		this.u= u2;
		this.tabNames= tabNames2;
		this.jTabbedpane= jTabbedpane;
		this.analyzer= analyzer;
		this.pos= pos;
		this.pose= pose;
		this.etc= etc;
		this.cte= cte;	
	}
	public void run(){ 
		try {
			jTabbedpane.validate();
			Thread.sleep(1000*5);
			jpanelThird.setLayout(null);
			jpanelThird.setBounds(0, 0, 1490, 980);	
			u.m = new Monitor();
			u.m.setVisible(true);
			u.m.init();
			u.m.sliderx = new JSlider(0,360);
			u.m.sliderx.setSnapToTicks(true);
			u.m.sliderx.setPaintTicks(true);
			u.m.sliderx.setMajorTickSpacing(5);
			u.m.sliderx.setMinorTickSpacing(1);
			u.m.sliderx.setBackground(Color.black);
			u.m.sliderx.setForeground(Color.white);
			u.m.sliderx.addChangeListener( 
					new ChangeListener() {
						public void stateChanged(ChangeEvent event)  {    
							JSlider source = (JSlider) event.getSource();  
							u.m.facx = source.getValue();  
						}
					});  

			u.m.slidery = new JSlider(0,360);
			u.m.slidery.setSnapToTicks(true);
			u.m.slidery.setPaintTicks(true);
			u.m.slidery.setMajorTickSpacing(5);
			u.m.slidery.setMinorTickSpacing(1);
			u.m.slidery.setBackground(Color.black);
			u.m.slidery.setForeground(Color.white);
			u.m.slidery.addChangeListener( 
					new ChangeListener() {
						public void stateChanged(ChangeEvent event)  {    
							JSlider source = (JSlider) event.getSource();  
							u.m.facy = source.getValue();  
						}
					});  

			u.m.sliderz = new JSlider(0,360);
			u.m.sliderz.setSnapToTicks(true);
			u.m.sliderz.setPaintTicks(true);
			u.m.sliderz.setMajorTickSpacing(5);
			u.m.sliderz.setMinorTickSpacing(1);
			u.m.sliderz.setBackground(Color.black);
			u.m.sliderz.setForeground(Color.white);
			u.m.sliderz.addChangeListener( 
					new ChangeListener() {
						public void stateChanged(ChangeEvent event)  {    
							JSlider source = (JSlider) event.getSource();  
							u.m.facz = source.getValue(); 
						}
					});  
			u.m.slidert = new JSlider(0,100);
			u.m.slidert.setSnapToTicks(true);
			u.m.slidert.setPaintTicks(true);
			u.m.slidert.setMajorTickSpacing(5);
			u.m.slidert.setMinorTickSpacing(1);
			u.m.slidert.setBackground(Color.black);
			u.m.slidert.setForeground(Color.white);
			u.m.slidert.addChangeListener( 
					new ChangeListener() {
						public void stateChanged(ChangeEvent event)  {    
							JSlider source = (JSlider) event.getSource();  
							u.m.fact = source.getValue();  
							System.out.println(u.m.fact);
						}
					});  
			u.m.sliderl = new JSlider(0,360);
			u.m.sliderl.setSnapToTicks(true);
			u.m.sliderl.setPaintTicks(true);
			u.m.sliderl.setMajorTickSpacing(5);
			u.m.sliderl.setMinorTickSpacing(1);
			u.m.sliderl.setBackground(Color.black);
			u.m.sliderl.setForeground(Color.white);
			u.m.sliderl.addChangeListener( 
					new ChangeListener() {
						public void stateChanged(ChangeEvent event)  {    
							JSlider source = (JSlider) event.getSource();  
							u.m.facl = source.getValue();  
						}
					});  

			u.m.bt00 = new DetaButton ("��ʼ������",100,50, Color.red);
			u.m.bt00.addActionListener( 
					new ActionListener()  {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							u.m.isRedButton = false;
							u.m.isGreenButton = false;
							u.m.isBlueButton = false;
							u.m.isStreButton = false;
							u.m.isSblButton = false;
							u.m.isRcaButton = false;
							u.m.isPcaButton = false;
							u.m.isPcfButton = false;	
							u.m.isStop = false;	
							u.m.recordStop = true;	
							u.m.imageList.clear();	
							u.m.bt01.setLabel("��ɫ���׹�");
							u.m.bt02.setLabel("��ɫ���׹�");
							u.m.bt03.setLabel("��ɫ���׹�");
							u.m.bt10.setLabel("�������");
							u.m.bt11.setLabel("�������");
							u.m.bt12.setLabel("�������˹�");
							u.m.bt13.setLabel("�ɷݷ�����");
							u.m.bt20.setLabel("�ɷݹ��˹�");
							u.m.bt20.setLabel("��ͣ������");
							u.m.bt31.setLabel("��ʼ¼����");
							u.m.facx=7;
							u.m.facy=100;
							u.m.facz=0;
							u.m.fact=0;
							u.m.facl=3;
							u.m.facr=0;
							u.m.facg=0;
							u.m.facb=0;
						}
					});

			u.m.bt01= new DetaButton ("��ɫ���׹�",100,50, Color.red);
			u.m.bt01.addActionListener( 
					new ActionListener()  {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isRedButton==false) {
								u.m.isRedButton=true;
								u.m.bt01.setLabel("��ɫ���׿�");
							}else {
								u.m.isRedButton=false;
								u.m.bt01.setLabel("��ɫ���׹�");
							}
						}
					});

			u.m.bt02= new DetaButton ("��ɫ���׹�",100,50, Color.green);
			u.m.bt02.addActionListener( 
					new ActionListener()  {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isGreenButton==false) {
								u.m.isGreenButton=true;
								u.m.bt02.setLabel("��ɫ���׿�");
							}else {
								u.m.isGreenButton=false;
								u.m.bt02.setLabel("��ɫ���׹�");
							}
						}
					});

			u.m.bt03= new DetaButton ("��ɫ���׹�",100,50, Color.blue);
			u.m.bt03.addActionListener( 
					new ActionListener()  {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isBlueButton==false) {
								u.m.isBlueButton=true;
								u.m.bt03.setLabel("��ɫ���׿�");
							}else {
								u.m.isBlueButton=false;
								u.m.bt03.setLabel("��ɫ���׹�");
							}
						}
					});

			u.m.bt10= new DetaButton ("�������",100,50, Color.magenta);
			u.m.bt10.addActionListener( 
					new ActionListener()  {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isStreButton== false) {
								u.m.isStreButton= true;
								u.m.bt10.setLabel("�����쿪");
							}else {
								u.m.isStreButton= false;
								u.m.bt10.setLabel("�������");
							}
						}
					});

			u.m.bt11= new DetaButton("�������", 100, 50, Color.pink);
			u.m.bt11.addActionListener( 
					new ActionListener(){    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isSblButton== false){
								u.m.isSblButton= true;
								u.m.bt11.setLabel("�����⿪");
							}else {
								u.m.isSblButton= false;
								u.m.bt11.setLabel("�������");
							}
						}
					});

			u.m.bt12= new DetaButton ("�������˹�",100,50, Color.pink);
			u.m.bt12.addActionListener( 
					new ActionListener()  {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isRcaButton==false) {
								u.m.isRcaButton=true;
								u.m.bt12.setLabel("�������˿�");
							}else {
								u.m.isRcaButton=false;
								u.m.bt12.setLabel("�������˹�");
							}
						}
					});

			u.m.bt13= new DetaButton ("�ɷݷ�����",100,50, Color.pink);
			u.m.bt13.addActionListener( 
					new ActionListener()  {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isPcaButton==false) {
								u.m.isPcaButton=true;
								u.m.bt13.setLabel("�ɷݷ�����");
							}else {
								u.m.isPcaButton=false;
								u.m.bt13.setLabel("�ɷݷ�����");
							}
						}
					});

			u.m.bt20= new DetaButton ("�ɷݹ��˹�",100,50, Color.pink);
			u.m.bt20.addActionListener( 
					new ActionListener()  {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isPcfButton==false) {
								u.m.isPcfButton=true;
								u.m.bt20.setLabel("�ɷݹ��˿�");
							}else {
								u.m.isPcfButton=false;
								u.m.bt20.setLabel("�ɷݹ��˹�");
							}
						}
					});

			u.m.bt21= new DetaButton ("��̬�ü���",100,50, Color.pink);
			u.m.bt21.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});

			u.m.bt22= new DetaButton ("��ͣ������",100,50, Color.pink);
			u.m.bt22.addActionListener(
					new ActionListener(){
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isStop == false) {
								u.m.isStop = true;
								u.m.bt22.setLabel("��ͣ������");
							}else {
								u.m.isStop = false;
								u.m.bt22.setLabel("��ͣ������");
							}
						}
					});

			u.m.bt23= new DetaButton ("�����ͼƬ",100,50, Color.pink);
			u.m.bt23.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							//��ȡͼƬ
							//���������
							if(null== u.m.imageForOutput) {
								return;
							}
							//get path
							FileDialog filedialog= new FileDialog(new Frame(), "���뵽����", FileDialog.LOAD);
							filedialog.setFilenameFilter(new TXTFilter("png"));
							filedialog.setVisible(true);
							String filepath= filedialog.getDirectory() + filedialog.getFile();
							System.out.println(filepath);
							try {
								File outputBin = new File(filepath+ ".png");
								if(null== u.m.imageForOutput) {
									return;
								}
								ImageIO.write(u.m.imageForOutput, "png", outputBin);	
							} catch (IOException writePngError) {
								System.out.println(filepath);
							}	
							//���ͼƬ
						}
					});

			u.m.bt30= new DetaButton ("¼��������",100,50, Color.pink);
			u.m.bt30.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
						}
					});

			u.m.bt31= new DetaButton ("��ʼ¼����",100,50, Color.pink);
			u.m.bt31.addActionListener( 
					new ActionListener() {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.recordStop == true) {
								u.m.recordStop = false;
								u.m.bt31.setLabel("��ͣ¼����");
							}else {
								u.m.recordStop = true;
								u.m.bt31.setLabel("��ʼ¼����");
							}
						}
					});

			u.m.bt32 = new DetaButton ("����������",100,50, Color.pink);
			u.m.bt32.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							if(u.m.imageList.size()<= 0|| !u.m.recordStop) {
								return;
							}
							FileDialog filedialog= new FileDialog(new Frame(), "���뵽����", FileDialog.LOAD);
							filedialog.setFilenameFilter(new TXTFilter("lyg"));
							filedialog.setVisible(true);
							String filepath= filedialog.getDirectory() + filedialog.getFile();
							System.out.println(filepath);
							File outputBin= new File(filepath+ ".lyg");
							Iterator<int[][]> iterator= u.m.imageList.iterator();
							try {
								FileOutputStream wr= new FileOutputStream(outputBin);
								//дͷ�� ����
								if(iterator.hasNext()) {
									int[][] bufferedImage= iterator.next(); 
									int width= bufferedImage.length;
									int height= bufferedImage[0].length;
									int flips= u.m.imageList.size();
									byte[] flipBytes= new byte[height* width* 4];
									
									byte[] widthBytes= new byte[4];
									widthBytes[0]=(byte)(width&0xff);
									widthBytes[1]=(byte)(width>>8&0xff);
									widthBytes[2]=(byte)(width>>16&0xff);
									widthBytes[3]=(byte)(width>>24&0xff);
									wr.write(widthBytes);
									
									byte[] heightBytes= new byte[4];
									heightBytes[0]=(byte)(height&0xff);
									heightBytes[1]=(byte)(height>>8&0xff);
									heightBytes[2]=(byte)(height>>16&0xff);
									heightBytes[3]=(byte)(height>>24&0xff);
									wr.write(heightBytes);
									
									byte[] flipsBytes= new byte[4];
									flipsBytes[0]=(byte)(flips&0xff);
									flipsBytes[1]=(byte)(flips>>8&0xff);
									flipsBytes[2]=(byte)(flips>>16&0xff);
									flipsBytes[3]=(byte)(flips>>24&0xff);
									wr.write(flipsBytes);
									//дͷ��
									for(int i= 0; i< height; i++){
										for(int j= 0; j< width; j++){
											int pix= bufferedImage[j][i];	
											flipBytes[i* (width* 4)+ j* 4+ 0]= (byte)(pix    &0xff);
											flipBytes[i* (width* 4)+ j* 4+ 1]= (byte)(pix>>8 &0xff);
											flipBytes[i* (width* 4)+ j* 4+ 2]= (byte)(pix>>16&0xff);
											flipBytes[i* (width* 4)+ j* 4+ 3]= (byte)(pix>>24&0xff);
											
										}
									}
									wr.write(flipBytes);
									wr.flush();
									//д����
									while(iterator.hasNext()) {
										//д����ÿһ֡
										int[][] flipImage= iterator.next(); 
										for(int i= 0; i< height; i++){
											for(int j= 0; j< width; j++){
												int pix= flipImage[j][i];	
												//byte[] flip=new byte[4];
												flipBytes[i* (width* 4)+ j* 4+ 0]= (byte)(pix    &0xff);
												flipBytes[i* (width* 4)+ j* 4+ 1]= (byte)(pix>>8 &0xff);
												flipBytes[i* (width* 4)+ j* 4+ 2]= (byte)(pix>>16&0xff);
												flipBytes[i* (width* 4)+ j* 4+ 3]= (byte)(pix>>24&0xff);
											}
										}
										wr.write(flipBytes);
										wr.flush();
									}
								}
								wr.close();
								u.m.imageList.clear();
							} catch (FileNotFoundException e1) {
								e1.printStackTrace();
							} catch (IOException e1) {
								e1.printStackTrace();
							}
						}
					});

			u.m.bt33= new DetaButton ("��ȡ¼����",100,50, Color.pink);
			u.m.bt33.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							FileDialog filedialog= new FileDialog(new Frame(), "��ȡlyg ��Ƶ�ļ�", FileDialog.LOAD);
							filedialog.setFilenameFilter(new TXTFilter("lyg"));
							filedialog.setVisible(true);
							String filepath= filedialog.getDirectory() + filedialog.getFile();
							System.out.println(filepath);
							File inputBin= new File(filepath);
							//��ȡͷ
							//ArrayList<BufferedImage> arrayList=new ArrayList<>();
							//��ȡ��
							try {
								@SuppressWarnings("resource")
								RandomAccessFile randomAccessFile= new RandomAccessFile(inputBin, "r");
								byte[] width= new byte[4];
								int w3= 0;
								int w2= 0;
								int w1= 0;
								int w0= 0;
								if (randomAccessFile.read(width) != 0) {  
									//bytes to int
									w3= (int)width[3]<<24 &0xff000000;
									w2= (int)width[2]<<16&0x00ff0000;
									w1= (int)width[1]<<8&0x0000ff00;
									w0= (int)width[0]&0x000000ff;
								}
								final int widthInt=  w3|w2|w1|w0;
								//��ȡ��
								byte[] height= new byte[4];
								int h3= 0;
								int h2= 0;
								int h1= 0;
								int h0= 0;
								if (randomAccessFile.read(height) != 0) {  
									//bytes to int
									h3= (int)height[3]<<24 &0xff000000;
									h2= (int)height[2]<<16 &0x00ff0000;
									h1= (int)height[1]<<8 &0x0000ff00;
									h0= (int)height[0] &0x000000ff;

								}
								final int heightInt= h3|h2|h1|h0;
								//��ȡ֡��
								byte[] flips= new byte[4];
								int f3= 0;
								int f2= 0;
								int f1= 0;
								int f0= 0;
								if (randomAccessFile.read(flips) != 0) {  
									//bytes to int
									f3= (int)flips[3]<<24 &0xff000000;
									f2= (int)flips[2]<<16 &0x00ff0000;
									f1= (int)flips[1]<<8 &0x0000ff00;
									f0= (int)flips[0] &0x000000ff;
								}	
								final int flipsInt= f3|f2|f1|f0;
								//��ʼ��
								Map<Integer, BufferedImage> flipImage= new HashMap<>();
								for(int i= 0; i< flipsInt; i++) {
									byte[] filp= new byte[widthInt* heightInt* 4];
									try {
										if (randomAccessFile.read(filp)!= 0) {  
											//filp to image
											BufferedImage image= new BufferedImage(widthInt, heightInt, BufferedImage.TYPE_INT_RGB);
											for(int h= 0; h< heightInt; h++) {
												for(int w= 0; w< widthInt; w++) {
													int p3= (int)filp[h* (widthInt* 4)+ w* 4+ 3]<< 24& 0xff000000;
													int p2= (int)filp[h* (widthInt* 4)+ w* 4+ 2]<< 16& 0x00ff0000;
													int p1= (int)filp[h* (widthInt* 4)+ w* 4+ 1]<< 8 & 0x0000ff00;
													int p0= (int)filp[h* (widthInt* 4)+ w* 4+ 0]     & 0x000000ff;
													int pix= p3|p2|p1|p0;
													image.setRGB(w, h, pix);
												}
											}												
											flipImage.put(i, image);
										}
									} catch (IOException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
								}
								int[] control= new int[8];
								control[5]= flipImage.size();
								PlayerControl playerControl= new PlayerControl(control, flipImage);
								playerControl.run();
								PlayerShow playerShow= new PlayerShow(playerControl, widthInt
										, heightInt, flipImage, control);
								playerShow.start();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}

					});

			u.m.bt43 = new DetaButton ("��˹�׷���",100,50, Color.pink);
			u.m.bt43.addActionListener( 
					new ActionListener()  {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isbt43Stop== false) {
								u.m.isbt43Stop= true;
								u.m.bt43.setLabel("��˹�׿���");
							}else {
								u.m.isbt43Stop= false;
								u.m.bt43.setLabel("��˹�׹ر�");
							}
						}
					});

			u.m.bt42= new DetaButton ("������˹��",100,50, Color.pink);
			u.m.bt42.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
						}
					});

			u.m.bt41= new DetaButton ("������˹��",100,50, Color.pink);
			u.m.bt41.addActionListener( 
					new ActionListener() {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isbt41Stop== false) {
								u.m.isbt41Stop= true;
								u.m.bt41.setLabel("������˹��");
							}else {
								u.m.isbt41Stop= false;
								u.m.bt41.setLabel("������˹��");
							}
						}
					});

			u.m.bt40= new DetaButton ("���Ը���Ҷ",100,50, Color.pink);
			u.m.bt40.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});

			u.m.bt50= new DetaButton ("ŷ�������",100,50, Color.pink);
			u.m.bt50.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});

			u.m.bt51= new DetaButton ("Ƥ֬��͸��",100,50, Color.pink);
			u.m.bt51.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});

			u.m.bt52= new DetaButton ("����ɫ����",100,50, Color.pink);
			u.m.bt52.addActionListener( 
					new ActionListener()  {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isbt52Stop== false) {
								u.m.isbt52Stop= true;
								u.m.bt52.setLabel("����������");
								u.m.facr=130;
								u.m.facg=110;
								u.m.facb=160;
							}else {
								u.m.isbt52Stop= false;
								u.m.bt52.setLabel("����������");
								u.m.facr=0;
								u.m.facg=0;
								u.m.facb=0;
							}
						}
					});

			u.m.bt53= new DetaButton ("����������",100,50, Color.pink);
			u.m.bt53.addActionListener( 
					new ActionListener() {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isbt53Stop== false) {
								u.m.isbt53Stop= true;
								u.m.bt53.setLabel("����������");
							}else {
								u.m.isbt53Stop= false;
								u.m.bt53.setLabel("����������");
							}
						}
					});

			u.m.bt60 = new DetaButton ("����ɫ����",100,50, Color.pink);
			u.m.bt60.addActionListener( 
					new ActionListener()  {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isbt60Stop== false) {
								u.m.isbt60Stop= true;
								u.m.bt60.setLabel("����������");
								u.m.facr=146;
								u.m.facg=126;
								u.m.facb=126;
							}else {
								u.m.isbt60Stop= false;
								u.m.bt60.setLabel("����������");
								u.m.facr=0;
								u.m.facg=0;
								u.m.facb=0;
							}
						}
					});

			u.m.bt61 = new DetaButton ("�˿���֢״",100,50, Color.pink);
			u.m.bt61.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});


			u.m.bt1 = new DetaButton ("�߻��ɷ�",100,50, Color.pink);
			u.m.bt1.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});

			u.m.bt62 = new DetaButton ("��˼�ر�",100,50, Color.pink);
			u.m.bt62.addActionListener( 
					new ActionListener()  {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isbt62Stop== false) {
								u.m.isbt62Stop= true;
								u.m.bt62.setLabel("��˼����");
							}else {
								u.m.isbt62Stop= false;
								u.m.bt62.setLabel("��˼�ر�");
							}
						}
					});

			u.m.bt63 = new DetaButton ("����ɫ����",100,50, Color.pink);
			u.m.bt63.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});

			u.m.bt70 = new DetaButton ("����ɫ����",100,50, Color.pink);
			u.m.bt70.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});

			u.m.bt71 = new DetaButton ("����ɫ����",100,50, Color.pink);
			u.m.bt71.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});


			u.m.bt72 = new DetaButton ("����ɫ����",100,50, Color.pink);
			u.m.bt72.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});

			u.m.bt73= new DetaButton ("������ɫ��",100,50, Color.white);
			u.m.bt73.addActionListener( 
					new ActionListener()  {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isbt73Stop== false) {
								u.m.isbt73Stop= true;
								u.m.bt73.setLabel("������ɫ��");
								u.m.facr=145;
								u.m.facg=115;
								u.m.facb=95;
							}else {
								u.m.isbt73Stop= false;
								u.m.bt73.setLabel("������ɫ��");
								u.m.facr=0;
								u.m.facg=0;
								u.m.facb=0;
							}
						}
					});

			u.m.bt80 = new DetaButton("������ɫ��",100,50, Color.blue);
			u.m.bt80.addActionListener( 
					new ActionListener()  {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isbt80Stop== false) {
								u.m.isbt80Stop= true;
								u.m.bt80.setLabel("������ɫ��");
								u.m.facr=205;
								u.m.facg=125;
								u.m.facb=140;
							}else {
								u.m.isbt80Stop= false;
								u.m.bt80.setLabel("������ɫ��");
								u.m.facr=0;
								u.m.facg=0;
								u.m.facb=0;
							}
						}
					});
			
			u.m.bt81 = new DetaButton ("������ɫ��",100,50, Color.magenta);
			u.m.bt81.addActionListener( 
					new ActionListener()  {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isbt81Stop== false) {
								u.m.isbt81Stop= true;
								u.m.bt81.setLabel("������ɫ��");
								u.m.facr=140;
								u.m.facg=200;
								u.m.facb=135;
							}else {
								u.m.isbt81Stop= false;
								u.m.bt81.setLabel("������ɫ��");
								u.m.facr=0;
								u.m.facg=0;
								u.m.facb=0;
							}
						}
					});
			
			
			u.m.bt82= new DetaButton ("������ɫ��",100,50, Color.yellow);
			u.m.bt82.addActionListener( 
					new ActionListener() {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isbt82Stop== false) {
								u.m.isbt82Stop= true;
								u.m.bt82.setLabel("������ɫ��");
								u.m.facr= 160;
								u.m.facg= 110;
								u.m.facb= 160;
							}else {
								u.m.isbt82Stop= false;
								u.m.bt82.setLabel("������ɫ��");
								u.m.facr= 0;
								u.m.facg= 0;
								u.m.facb= 0;
							}
						}
					});
			
			u.m.bt83= new DetaButton ("������ɫ��",100,50, Color.red);
			u.m.bt83.addActionListener( 
					new ActionListener() {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isbt83Stop== false) {
								u.m.isbt83Stop= true;
								u.m.bt83.setLabel("������ɫ��");
								u.m.facr= 100;
								u.m.facg= 125;
								u.m.facb= 135;
							}else {
								u.m.isbt83Stop= false;
								u.m.bt83.setLabel("������ɫ��");
								u.m.facr= 0;
								u.m.facg= 0;
								u.m.facb= 0;
							}
						}
					});

			u.m.bt84= new DetaButton ("�ϴ���Ƶ��",100,50, Color.pink);
			u.m.bt84.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							
						}
					});
			
			u.m.bt85= new DetaButton ("�ϴ���Ƶ��",100,50, Color.pink);
			u.m.bt85.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							
						}
					});
			
			u.m.bt86= new DetaButton ("�ϴ�ͼƬ��",100,50, Color.pink);
			u.m.bt86.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							
						}
					});
			
			u.m.bt87= new DetaButton ("�ϴ��ĵ���",100,50, Color.pink);
			u.m.bt87.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							
						}
					});
			
			u.m.bt88= new DetaButton ("ʶ���۾���",100,50, Color.pink);
			u.m.bt88.addActionListener( 
					new ActionListener() {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isbt88Stop== false) {
								u.m.isbt88Stop= true;
								u.m.bt88.setLabel("ʶ���۾���");
							}else {
								u.m.isbt88Stop= false;
								u.m.bt88.setLabel("ʶ���۾���");
							}
						}
					});
			
			u.m.bt89= new DetaButton ("ʶ����ӹ�",100,50, Color.pink);
			u.m.bt89.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							
						}
					});
			
			
			u.m.bt90= new DetaButton ("ʶ����ٹ�",100,50, Color.pink);
			u.m.bt90.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							
						}
					});
			
			u.m.bt91= new DetaButton ("ʶ����͹�",100,50, Color.pink);
			u.m.bt91.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							
						}
					});
			
			u.m.bt111= new DetaButton("����ͼƬ��",100,50, Color.pink);
			u.m.bt111.addActionListener( 
					new ActionListener() {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isStop == false) {
								u.m.isStop = true;
								u.m.bt111.setLabel("����ͼƬ��");
								FileDialog filedialog= new FileDialog(new Frame(), "��ͼƬ�ļ�", FileDialog.LOAD);
								filedialog.setFilenameFilter(new TXTFilter("jpg"));
								filedialog.setVisible(true);
								String filepath= filedialog.getDirectory() + filedialog.getFile();
								System.out.println(filepath);
								File inputBin= new File(filepath);
								try {
									u.tempBufferedImage= ImageIO.read(inputBin);
//									Image img= image.getScaledInstance(u.m.imageForOutput.getWidth()
//											, u.m.imageForOutput.getHeight(), java.awt.Image.SCALE_SMOOTH);
//									u.m.imageForOutput.getGraphics().drawImage(img, 0, 0, null);
//									u.m.getGraphics().drawImage(img, 0, 0, 900, 680, u.m);// ���ͼ���ļ�
									if(null== u.tempBufferedImage) {
										return;
									}
									u.m.stopBufferedImage= u.tempBufferedImage;
									u.m.img= u.m.stopBufferedImage.getScaledInstance(u.m.imageForOutput.getWidth()
												, u.m.imageForOutput.getHeight(), java.awt.Image.SCALE_SMOOTH);
									u.m.imageForOutput.getGraphics().drawImage(u.m.img, 0, 0, null);	
									u.m.getGraphics().drawImage(u.m.img, 0, 0, 900, 680, u.m);// ���ͼ���ļ�
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								//imge format
								//leftPanel.img= image.getScaledInstance(605, 365, java.awt.Image.SCALE_SMOOTH);
							}else {
								u.m.isStop = false;
								u.m.bt111.setLabel("����ͼƬ��");
							}	
						}
					});
			u.m.bt112= new DetaButton ("ͼ��������", 100,50, Color.pink);
			u.m.bt112.addActionListener( 
					new ActionListener() {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isStop== false) {
								u.m.isStop= true;
								u.m.bt22.setLabel("����ͼƬ��");
								if(null== u.tempBufferedImage) {
									return;
								}
								u.m.stopBufferedImage= u.tempBufferedImage;
								u.m.img= u.m.stopBufferedImage.getScaledInstance(u.m.imageForOutput.getWidth()
											, u.m.imageForOutput.getHeight(), java.awt.Image.SCALE_SMOOTH);
								u.m.imageForOutput.getGraphics().drawImage(u.m.img, 0, 0, null);	
								u.m.getGraphics().drawImage(u.m.img, 0, 0, 900, 680, u.m);// ���ͼ���ļ�
							}else {
								u.m.isStop = false;
								u.m.bt22.setLabel("����ͼƬ��");
							}	
						}
					});
			u.m.bt113= new DetaButton ("�������ر�",100,50, Color.pink);
			u.m.bt113.addActionListener( 
					new ActionListener() {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isbt113Stop== false) {
								u.m.isbt113Stop= true;
								u.m.bt113.setLabel("����������");
							}else {
								u.m.isbt113Stop= false;
								u.m.bt113.setLabel("�������ر�");
							}
						}
					});
			u.m.bt114= new DetaButton ("�������ر�",100,50, Color.pink);
			u.m.bt114.addActionListener( 
					new ActionListener() {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isbt114Stop== false) {
								u.m.isbt114Stop= true;
								u.m.bt114.setLabel("����������");
							}else {
								u.m.isbt114Stop= false;
								u.m.bt114.setLabel("�������ر�");
							}
						}
					});
			
			u.m.bt121= new DetaButton ("�ĸ�ʴ�ر�",100,50, Color.pink);
			u.m.bt121.addActionListener( 
					new ActionListener() { 
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isbt121Stop== false) {
								u.m.isbt121Stop= true;
								u.m.bt121.setLabel("�ĸ�ʴ����");
							}else {
								u.m.isbt121Stop= false;
								u.m.bt121.setLabel("�ĸ�ʴ�ر�");
							}
						}
					});
			u.m.bt122= new DetaButton ("�Ĵ߻��ر�",100,50, Color.pink);
			u.m.bt122.addActionListener( 
					new ActionListener() {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isbt122Stop== false) {
								u.m.isbt122Stop= true;
								u.m.bt122.setLabel("�Ĵ߻�����");
							}else {
								u.m.isbt122Stop= false;
								u.m.bt122.setLabel("�Ĵ߻��ر�");
							}
						}
					});
			u.m.bt123= new DetaButton ("��˿���ر�",100,50, Color.pink);
			u.m.bt123.addActionListener( 
					new ActionListener() {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isbt123Stop== false) {
								u.m.isbt123Stop= true;
								u.m.bt123.setLabel("��˿������");
							}else {
								u.m.isbt123Stop= false;
								u.m.bt123.setLabel("��˿���ر�");
							}
						}
					});
			u.m.bt124= new DetaButton ("����ӹ���",100,50, Color.pink);
			u.m.bt124.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							
						}
					});
			
			
			u.m.bt131= new DetaButton ("����ӹ���",100,50, Color.pink);
			u.m.bt131.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							
						}
					});
			u.m.bt132= new DetaButton ("����ӹ���",100,50, Color.pink);
			u.m.bt132.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							
						}
					});
			u.m.bt133= new DetaButton ("����ӹ���",100,50, Color.pink);
			u.m.bt133.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							
						}
					});
			u.m.bt134= new DetaButton ("����ӹ���",100,50, Color.pink);
			u.m.bt134.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							
						}
					});
			
			
			u.m.bt141= new DetaButton ("����ӹ���",100,50, Color.pink);
			u.m.bt141.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							
						}
					});
			u.m.bt142= new DetaButton ("����ӹ���",100,50, Color.pink);
			u.m.bt142.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							
						}
					});
			u.m.bt143= new DetaButton ("����ӹ���",100,50, Color.pink);
			u.m.bt143.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							
						}
					});
			u.m.bt144= new DetaButton ("����ӹ���",100,50, Color.pink);
			u.m.bt144.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							
						}
					});
			
			u.m.bt151= new DetaButton ("����ӹ���",100,50, Color.pink);
			u.m.bt151.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							
						}
					});
			u.m.bt152= new DetaButton ("����ӹ���",100,50, Color.pink);
			u.m.bt152.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							
						}
					});
			u.m.bt153= new DetaButton ("����ӹ���",100,50, Color.pink);
			u.m.bt153.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							
						}
					});
			u.m.bt154= new DetaButton ("����ӹ���",100,50, Color.pink);
			u.m.bt154.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							
						}
					});
			
			u.m.bt92= new DetaButton ("���Ŷ�ý��",100,50, Color.orange);
			u.m.bt92.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							FileDialog filedialog= new FileDialog(new Frame(), "���Ŷ�ý��", FileDialog.LOAD);
						//	filedialog.setFilenameFilter(new TXTFilter("lyg"));
							filedialog.setVisible(true);
							String filepath= filedialog.getDirectory() + filedialog.getFile();
							System.out.println(filepath);
						//	File inputBin= new File(filepath);
							//
							try {
								Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler "+filepath);
							} catch (IOException e1) {	
								jTabbedpane.validate();
							}
						}
					});
			
			
			u.m.bt2 = new DetaButton ("���Ը�ʴ",100,50, Color.pink);
			u.m.bt2.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});

			u.m.bt3= new DetaButton ("�����ɷ�",100,50, Color.pink);
			u.m.bt3.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});

			u.m.bt4= new DetaButton ("�����ɷ�",100,50, Color.pink);
			u.m.bt4.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});

			u.m.bt5 = new DetaButton ("�����ɷ�",100,50, Color.pink);
			u.m.bt5.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});


			u.m.btr = new DetaButton ("ӫ���׺�",100,50, Color.red);
			u.m.btr.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});

			u.m.btg = new DetaButton ("ӫ������",100,50, Color.green);
			u.m.btg.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});

			u.m.btb = new DetaButton ("ӫ������",100,50, Color.blue);
			u.m.btb.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});

			u.m.sliderr = new JSlider(0,255);
			u.m.sliderr.setSnapToTicks(true);
			u.m.sliderr.setPaintTicks(true);
			u.m.sliderr.setMajorTickSpacing(5);
			u.m.sliderr.setMinorTickSpacing(0);
			u.m.sliderr.setBackground(Color.black);
			u.m.sliderr.setForeground(Color.red);
			u.m.sliderr.addChangeListener( 
					new ChangeListener() {
						public void stateChanged(ChangeEvent event)  {    
							JSlider source = (JSlider) event.getSource();  
							u.m.facr = source.getValue();  
							System.out.println(u.m.facr);
						}
					});

			u.m.sliderg = new JSlider(0,255);
			u.m.sliderg.setSnapToTicks(true);
			u.m.sliderg.setPaintTicks(true);
			u.m.sliderg.setMajorTickSpacing(5);
			u.m.sliderg.setMinorTickSpacing(0);
			u.m.sliderg.setBackground(Color.black);
			u.m.sliderg.setForeground(Color.green);
			u.m.sliderg.addChangeListener( 
					new ChangeListener() {
						public void stateChanged(ChangeEvent event)  {    
							JSlider source = (JSlider) event.getSource();  
							u.m.facg = source.getValue();  
							System.out.println(u.m.facg);
						}
					});

			u.m.sliderb = new JSlider(0,255);
			u.m.sliderb.setSnapToTicks(true);
			u.m.sliderb.setPaintTicks(true);
			u.m.sliderb.setMajorTickSpacing(5);
			u.m.sliderb.setMinorTickSpacing(0);
			u.m.sliderb.setBackground(Color.black);
			u.m.sliderb.setForeground(Color.blue);
			u.m.sliderb.addChangeListener( 
					new ChangeListener() {
						public void stateChanged(ChangeEvent event)  {    
							JSlider source = (JSlider) event.getSource();  
							u.m.facb = source.getValue();  
							System.out.println(u.m.facb);
						}
					});  
			u.m.br.add(u.m.btr);
			u.m.br.add(u.m.sliderr);
			u.m.sliderBox.add(u.m.br);

			u.m.bg.add(u.m.btg);
			u.m.bg.add(u.m.sliderg);
			u.m.sliderBox.add(u.m.bg);

			u.m.bb.add(u.m.btb);
			u.m.bb.add(u.m.sliderb);
			u.m.sliderBox.add(u.m.bb);

			u.m.b1.add(u.m.bt1);
			u.m.b1.add(u.m.sliderx);
			u.m.sliderBox.add(u.m.b1);

			u.m.b2.add(u.m.bt2);
			u.m.b2.add(u.m.slidery);
			u.m.sliderBox.add(u.m.b2);

			u.m.b3.add(u.m.bt3);
			u.m.b3.add(u.m.sliderz);
			u.m.sliderBox.add(u.m.b3);

			u.m.b4.add(u.m.bt4);
			u.m.b4.add(u.m.slidert);
			u.m.sliderBox.add(u.m.b4);

			u.m.b5.add(u.m.bt5);
			u.m.b5.add(u.m.sliderl);
			u.m.sliderBox.add(u.m.b5);

			u.m.buttonBox0.add(u.m.bt00);
			u.m.buttonBox0.add(u.m.bt01);
			u.m.buttonBox0.add(u.m.bt02);
			u.m.buttonBox0.add(u.m.bt03);
			u.m.sliderBox.add(u.m.buttonBox0);

			u.m.buttonBox1.add(u.m.bt10);
			u.m.buttonBox1.add(u.m.bt11);
			u.m.buttonBox1.add(u.m.bt12);
			u.m.buttonBox1.add(u.m.bt13);
			u.m.sliderBox.add(u.m.buttonBox1);

			u.m.buttonBox2.add(u.m.bt20);
			u.m.buttonBox2.add(u.m.bt21);
			u.m.buttonBox2.add(u.m.bt22);
			u.m.buttonBox2.add(u.m.bt23);
			u.m.sliderBox.add(u.m.buttonBox2);

			u.m.buttonBox3.add(u.m.bt30);
			u.m.buttonBox3.add(u.m.bt31);
			u.m.buttonBox3.add(u.m.bt32);
			u.m.buttonBox3.add(u.m.bt33);
			u.m.sliderBox.add(u.m.buttonBox3);

			u.m.buttonBox4.add(u.m.bt40);
			u.m.buttonBox4.add(u.m.bt41);
			u.m.buttonBox4.add(u.m.bt42);
			u.m.buttonBox4.add(u.m.bt43);
			u.m.sliderBox.add(u.m.buttonBox4);

			u.m.buttonBox5.add(u.m.bt50);
			u.m.buttonBox5.add(u.m.bt51);
			u.m.buttonBox5.add(u.m.bt52);
			u.m.buttonBox5.add(u.m.bt53);
			u.m.sliderBox.add(u.m.buttonBox5);

			u.m.buttonBox6.add(u.m.bt60);
			u.m.buttonBox6.add(u.m.bt61);
			u.m.buttonBox6.add(u.m.bt62);
			u.m.buttonBox6.add(u.m.bt63);
			u.m.sliderBox.add(u.m.buttonBox6);

			u.m.buttonBox7.add(u.m.bt70);
			u.m.buttonBox7.add(u.m.bt71);
			u.m.buttonBox7.add(u.m.bt72);
			u.m.buttonBox7.add(u.m.bt73);
			u.m.sliderBox.add(u.m.buttonBox7);
			
			u.m.buttonBox8.add(u.m.bt80);
			u.m.buttonBox8.add(u.m.bt81);
			u.m.buttonBox8.add(u.m.bt82);
			u.m.buttonBox8.add(u.m.bt83);
			u.m.sliderBox.add(u.m.buttonBox8);
			
			u.m.buttonBox9.add(u.m.bt84);
			u.m.buttonBox9.add(u.m.bt85);
			u.m.buttonBox9.add(u.m.bt86);
			u.m.buttonBox9.add(u.m.bt87);
			u.m.sliderBox.add(u.m.buttonBox9);

			u.m.buttonBox10.add(u.m.bt88);
			u.m.buttonBox10.add(u.m.bt89);
			u.m.buttonBox10.add(u.m.bt90);
			u.m.buttonBox10.add(u.m.bt92);
			
			u.m.buttonBox11.add(u.m.bt111);
			u.m.buttonBox11.add(u.m.bt112);
			u.m.buttonBox11.add(u.m.bt113);
			u.m.buttonBox11.add(u.m.bt114);
			
			u.m.buttonBox12.add(u.m.bt121);
			u.m.buttonBox12.add(u.m.bt122);
			u.m.buttonBox12.add(u.m.bt123);
			u.m.buttonBox12.add(u.m.bt124);
			
			u.m.buttonBox13.add(u.m.bt131);
			u.m.buttonBox13.add(u.m.bt132);
			u.m.buttonBox13.add(u.m.bt133);
			u.m.buttonBox13.add(u.m.bt134);
			
			u.m.buttonBox14.add(u.m.bt141);
			u.m.buttonBox14.add(u.m.bt142);
			u.m.buttonBox14.add(u.m.bt143);
			u.m.buttonBox14.add(u.m.bt144);
			
			u.m.buttonBox15.add(u.m.bt151);
			u.m.buttonBox15.add(u.m.bt152);
			u.m.buttonBox15.add(u.m.bt153);
			u.m.buttonBox15.add(u.m.bt154);
			
			u.m.sliderBox.add(u.m.buttonBox10);
			u.m.sliderBox.add(u.m.buttonBox11);
			u.m.sliderBox.add(u.m.buttonBox12);
			u.m.sliderBox.add(u.m.buttonBox13);
		//	u.m.sliderBox.add(u.m.buttonBox14);

			u.m.sliderBox.setBounds(910, 15, 400, 750);
			jpanelThird.add(u.m);
			jpanelThird.add(u.m.sliderBox);
			jpanelThird.setName(tabNames.get(2));
			jTabbedpane.addTab(tabNames.get(2), new ImageIcon(), jpanelThird, "����");// �����һ��ҳ��  
			Color[] colors= new Color[3];
			colors[0]=new Color(253,233,254);
			colors[1]=new Color(233,254,234);
			colors[2]=new Color(255,251,232);
			jTabbedpane.setBackgroundAt(jTabbedpane.getTabCount()- 1, colors[jTabbedpane.getTabCount()%3]);
			jTabbedpane.validate();	
			while(0 == u.m.stop) {
				Thread.sleep(50);
				Graphics g =u.m.getGraphics();
				if(g!=null) {
					u.m.paint(g);
				}	 
			} 
		}catch (InterruptedException e) {
			jTabbedpane.validate();
		}
	}
}