package AVQ.PVU.vedio;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import MVQ.filenameFilter.TXTFilter;

public class PlayerControl{
	int[] control; 
	public JSlider sliderx;
	Map<Integer, BufferedImage> flipImage;
	public PlayerControl(int[] control, Map<Integer, BufferedImage> flipImage) {
		super();
		this.control= control;
		this.flipImage= flipImage;
	}
	
	public void run(){
		Box mainBox= new Box(BoxLayout.Y_AXIS);
		//�����ؼ�
		Box slideBox= new Box(BoxLayout.X_AXIS);
		sliderx= new JSlider(0, control[5]); 
		sliderx.setSnapToTicks(true);  
		sliderx.setPaintTicks(true);  
		//sliderx.setMajorTickSpacing(1);  
		sliderx.setMinorTickSpacing(1);  
		sliderx.addChangeListener(new ChangeListener() {    
					public void stateChanged(ChangeEvent event) {    
						JSlider source= (JSlider) event.getSource();  
						control[6]= source.getValue();
					}
				});
		
		sliderx.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				JSlider source= (JSlider) arg0.getSource();  
				if(1== control[1]) {
					control[6]= source.getValue()+ 1;
				}else if(1== control[2]){
					control[6]= source.getValue()- 1;
				}
				control[7]= 1;
			}
		});
		slideBox.add(sliderx); 
		//BOX
		Box processBox= new Box(BoxLayout.X_AXIS);
		//buttonADD= new JButton("��ӵ��༭ҳ");
		JButton buttonPlayer=new JButton("����");
		buttonPlayer.setBounds(0, 0, 135, 30);
		buttonPlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				control[0]=1;
				if(control[1]== 0&&	control[2]== 0) {
					control[2]= 1;
				}
				if(control[3]== 0&&	control[4]== 0) {
					control[3]= 1;
				}
			}
		});
		JButton buttonPause= new JButton("��ͣ");
		buttonPause.setBounds(35, 0, 135, 30);
		buttonPause.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				control[0]= 0;
			}
		});
		JButton buttonRollback=new JButton("����");
		buttonRollback.setBounds(70, 0, 135, 30);
		buttonRollback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				control[0]= 1;
				control[1]= 0;
				control[3]= 1;
				control[4]= 0;
				control[2]= 1;
			}
		});
		JButton buttonReDo= new JButton("����");
		buttonReDo.setBounds(105, 0, 135, 30);
		buttonReDo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				control[0]= 1;
				control[3]= 1;
				control[4]= 0;
				control[1]= 1;
				control[2]= 0;
			}
		});
		JButton buttonFast= new JButton("���");
		buttonFast.setBounds(140, 0, 135, 30);
		buttonFast.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				control[4]= 0;
				if(control[3]== 0) {
					control[3]= 1;
				}else if(control[3]== 1) {
					control[3]= 2;
				}else if(control[3]== 2) {
					control[3]= 3;
				}else if(control[3]== 3) {
					control[3]= 1;
				}
			}
		});
		JButton buttonSlow= new JButton("����");
		buttonSlow.setBounds(175, 0, 135, 30);
		buttonSlow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				control[3]= 0;
				if(control[4]== 0) {
					control[4]= 1;
				}else if(control[4]== 1) {
					control[4]= 2;
				}else if(control[4]== 2) {
					control[4]= 3;
				}else if(control[4]== 3) {
					control[4]= 1;
				}
			}
		});
		JButton buttonSave=new JButton("���浱ǰ֡");
		buttonSave.setBounds(210, 0, 135, 30);
		buttonSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(0== control[0]) {
					//��ȡͼƬ
					//���������
					if(null== flipImage) {
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
						if(null== flipImage) {
							return;
						}
						ImageIO.write(flipImage.get(control[6]), "png", outputBin);	
					} catch (IOException writePngError) {
						System.out.println(filepath);
					}	
					//���ͼƬ
				}
			}
		});
		
		JButton buttonNew= new JButton("����Ϊһ���µ���Ƶ");
		buttonNew.setBounds(245, 0, 135, 30);
		buttonNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(0== control[0]) {
					if(flipImage.size()<= 0) {
						return;
					}
					FileDialog filedialog= new FileDialog(new Frame(), "���뵽����", FileDialog.LOAD);
					filedialog.setFilenameFilter(new TXTFilter("lyg"));
					filedialog.setVisible(true);
					String filepath= filedialog.getDirectory() + filedialog.getFile();
					System.out.println(filepath);
					File outputBin= new File(filepath+ ".lyg");
				//	Iterator<int[][]> iterator= flipImage.keySet().iterator();
					Iterator<Integer> iterator= flipImage.keySet().iterator();
					try {
						FileOutputStream wr= new FileOutputStream(outputBin);
						//дͷ�� ����
						if(iterator.hasNext()) {
							BufferedImage bufferedImage= flipImage.get(iterator.next());
							//int[][] bufferedImage= v; 
							int width= bufferedImage.getWidth();
							int height= bufferedImage.getHeight();
							int flips=flipImage.size();
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
									int pix= bufferedImage.getRGB(j, i);	
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
								bufferedImage= flipImage.get(iterator.next());
							    //int[][] flipImage= iterator.next(); 
								for(int i= 0; i< height; i++){
									for(int j= 0; j< width; j++){
										int pix= bufferedImage.getRGB(j, i);	
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
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		processBox.add(buttonPlayer);
		processBox.add(buttonPause);
		processBox.add(buttonRollback);
		processBox.add(buttonReDo);
		processBox.add(buttonFast);
		processBox.add(buttonSlow);
		processBox.add(buttonSave);
		processBox.add(buttonNew);
		JFrame jframeControl= new JFrame();
		jframeControl.setLocation(200, 675);
		jframeControl.setSize(640, 150);
		jframeControl.setResizable(true);
		ScrollPane scrollPaneControl= new ScrollPane();
		mainBox.add(slideBox);
		mainBox.add(processBox);
		scrollPaneControl.add(mainBox);
		scrollPaneControl.validate();
		jframeControl.add(scrollPaneControl);
		jframeControl.setBackground(Color.red);
		jframeControl.setVisible(true);
		jframeControl.validate();
	}
}