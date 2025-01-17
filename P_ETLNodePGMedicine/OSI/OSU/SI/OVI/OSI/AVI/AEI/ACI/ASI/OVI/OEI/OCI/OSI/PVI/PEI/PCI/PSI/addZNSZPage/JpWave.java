package OSI.OSU.SI.OVI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addZNSZPage;

import java.awt.event.ActionEvent;


import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JPanel;

public class JpWave extends JPanel implements Runnable{
	/**
	 * ����������
	 */
	private static final long serialVersionUID = 1L;
	LYGFileIO lYGFileIO;
	Thread thread;
	public Object bootSound=0;
	public int reg= 0;
	public JpWave(LYGFileIO toplygin){
		lYGFileIO= toplygin;	 
		JButton j= new JButton("play bytes");
		j.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  reg= 1;
				  bootSound= 1;
				  thread= new Thread(JpWave.this);
				  thread.setPriority(Thread.MIN_PRIORITY);
				  thread.start();	  
			}
		});
		j.setSize(100,30);
		
		JButton j1= new JButton("close");
		j1.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				  reg= 0;
				  bootSound= 0;
				  thread.stop();
				  thread=null;
			}
		});
		j1.setSize(100,30);
		
		
		JButton j2= new JButton("play array");
		j2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				  reg= 2;
				  bootSound= 2;
				  thread= new Thread(JpWave.this);
				  thread.setPriority(Thread.MIN_PRIORITY);
				  thread.start();	  
			}
		});
		j2.setSize(100, 30);
		
		
		JButton j3= new JButton("play master");
		j3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  reg= 3;
				  bootSound= 3;
				  thread= new Thread(JpWave.this);
				  thread.setPriority(Thread.MIN_PRIORITY);
				  thread.start();	  
			}
		});
		j3.setSize(100, 30);
		
		JButton j4 = new JButton("play slave");
		j4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  reg=4;
				  bootSound= 4;
				  thread = new Thread(JpWave.this);
				  thread.setPriority(Thread.MIN_PRIORITY);
				  thread.start();	  
			}
		});
		j4.setSize(100,30);
		
		
		JButton j5= new JButton("play fftarray");
		j5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				  reg= 5;
				  bootSound= 5;
				  thread= new Thread(JpWave.this);
				  thread.setPriority(Thread.MIN_PRIORITY);
				  thread.start();	  
			}
		});
		j5.setSize(100,30);
		
		this.add(j);	
		this.add(j1);
		this.add(j2);
		this.add(j3);
		this.add(j4);
		this.add(j5);
	} 
	
	public void run(){
		 if(reg==1){
			 lYGFileIO.toHead();	 
			 if(lYGFileIO.adataFrame!=null){
				try {
					new SoundPlay().Play(lYGFileIO.adataFrame);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			 lYGFileIO.toHead();
			 return;
		 }
		 if(reg==2){
			 lYGFileIO.toHead();	 
			 if(lYGFileIO.adataFrame!=null){
				new SoundPlay().PlayArray(lYGFileIO.adataFrame);
			}
			 lYGFileIO.toHead();
			 return;
		 }
		 
		 if(reg==3){
			 lYGFileIO.toHead();	 
			 if(lYGFileIO.adataFrame!=null){
				new SoundPlay().PlayMasterArray(lYGFileIO.adataFrame);
			}
			 lYGFileIO.toHead();
			 return;
		 }
		 
		 if(reg==4){
			 lYGFileIO.toHead();	 
			 if(lYGFileIO.adataFrame!=null){
				new SoundPlay().PlaySlaveArray(lYGFileIO.adataFrame);
			}
			 lYGFileIO.toHead();
			 return;
		 }
		 
		 if(reg==5){
			 try {
				Thread.sleep(10);
			 } catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			 }
			 lYGFileIO.toHead();	 
			 if(lYGFileIO.adataFrame!=null){
				try {
					SoundPlay soundPlay= new SoundPlay();
					soundPlay.PlayFftArray(lYGFileIO.adataFrame, lYGFileIO, this, bootSound);
					Thread thread= new Thread(soundPlay);
					thread.setPriority(Thread.MIN_PRIORITY);
					thread.start();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }
			 lYGFileIO.toHead();
			 return;
		 }
	}

}
