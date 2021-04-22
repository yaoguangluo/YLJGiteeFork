package OSI.OSU.MSV.PCS.controller;
import java.io.IOException;
import java.net.ServerSocket;

import javax.swing.JTextPane;

import ME.sample.App;
import OSI.OSU.MS.VPC.process.TimeProcess;
import OSI.OSU.MS.VPC.sleeper.Sleeper;
import OSI.OSU.MS.VPC.sleeper.SleeperHall;
import OSI.OSU.MS.plsql.cache.DetaDBBufferCacheManager;
import OSI.OSU.MS.vpcs.hall.DatabaseLogHall;
import OSI.OSU.VPC.common.utils.DetaUtil;
import OSI.OSU.config.Config;
import OSI.OSU.plsql.stable.StableData;
public class ServerInitController {
	private static ServerSocket server;
	//private static Properties properties;
	private static int port;
//	private App app;
	static {
		//properties = new Properties();
//		try {
//			properties.load(new FileInputStream
//					(new File("src/main/resources/property.proterties")));
//			System.out.println("----����VPCS���ݿ��������Դ����:�ɹ���");
//		}catch (IOException e) {
//			e.printStackTrace();
//		}
	}

	public static void initService(JTextPane jTextPane) throws IOException {
		try {
			//port= Integer.parseInt(properties.getProperty(StableData.TCP_PORT));
			port= Config.detaVPCSDBPort;
			server= new ServerSocket(port);
			System.out.println("----����VPCS���ݿ�������˿�����:" + port);
			if(jTextPane!= null) {
				String text= jTextPane.getText();
				text="\r\n"+ "----����VPCS���ݿ�������˿�����:" + port+ text;
				text="\r\n"+ "..."+ text;
				jTextPane.setText(text);
			}
			DetaUtil.initDB();
			System.out.println("----����VPCS���ݿ������DMAȷ��:�ɹ���");
			if(jTextPane!= null) {
				String text= jTextPane.getText();
				text="\r\n"+ "----����VPCS���ݿ������DMAȷ��:�ɹ���"+ text;
				text="\r\n"+ "...";
				jTextPane.setText(text);
			}
			RequestFilterController.initBlockList();
			System.out.println("----����VPCS���ݿ������IP���˷�������:�ɹ���");
			if(jTextPane!= null) {
				String text= jTextPane.getText();
				text="\r\n"+ "----����VPCS���ݿ������IP���˷�������:�ɹ���"+ text;
				text="\r\n"+ "...";
				jTextPane.setText(text);
			}
			DetaDBBufferCacheManager.reflection();
			System.out.println("----����VPCS���ݿ�����������������ӳ�����:�ɹ���");
			if(jTextPane!= null) {
				String text= jTextPane.getText();
				text="\r\n"+ "----����VPCS���ݿ�����������������ӳ�����:�ɹ���"+ text;
				text="\r\n"+ "...";
				jTextPane.setText(text);
			}
			DatabaseLogHall.createBinLogHall();
			System.out.println("----����VPCS���ݿ�����������������ӳ�����:�ɹ���");
			if(jTextPane!= null) {
				String text= jTextPane.getText();
				text="\r\n"+ "----����VPCS���ݿ�����������������ӳ�����:�ɹ���"+ text;;
				text="\r\n"+ "...";
				jTextPane.setText(text);
			}
			//			BootBackup.bootBackupByUsingGzip(CacheManager
			//.getCacheInfo("LogPath").getValue().toString()+"/zipCover");
			//			UnZip.unZipWithPath("C:/DetaLog/zipCover/zip_1549583065203.zip"
			//, "C:/DetaLog/zipCover/cover");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void haoHiYooFaker(SleeperHall sleeperHall) {
		sleeperHall.callSkivvy(); 
	}

	public static void initServer(App app) throws IOException {
		System.out.println("----DETA VPCS--1.8");
		System.out.println("----Author: ������");
		System.out.println("----������������������޹�˾��Դ��Ŀ");
		if(app.appConfig.SectionJPanel.jTextPane!= null) {
			String text= app.appConfig.SectionJPanel.jTextPane.getText();
			text="\r\n"+ "������� PLSQL���ݿ� ӳ��������ϣ�"+ text;
			text="\r\n"+ "----Author: ������"+ text;
			text="\r\n"+ "----������������������޹�˾��Դ��Ŀ"+ text;
			text="\r\n"+ "..."+ text;
			app.appConfig.SectionJPanel.jTextPane.setText(text);
		}
		TimeProcess timeProcess= new TimeProcess();
		timeProcess.begin();
		SleeperHall sleeperHall = new SleeperHall();
		initService(app.appConfig.SectionJPanel.jTextPane);
		timeProcess.end();
		if(app.appConfig.SectionJPanel.jTextPane!= null) {
			String text= app.appConfig.SectionJPanel.jTextPane.getText();
			text="\r\n"+ "----����VPCS���ݿ����������һ������-�ܺ�ʱ:" 
					+ timeProcess.duration()+ "����"+ text;
			text="\r\n"+ "..."+ text;
			app.appConfig.SectionJPanel.jTextPane.setText(text);
		}
		System.out.println("----����VPCS���ݿ����������һ������-�ܺ�ʱ:" 
		+ timeProcess.duration()+ "����");
		app.ready= true;
		while(true){
			if(sleeperHall.getThreadsCount()< StableData.SLEEPERS_RANGE){
				Sleeper sleeper= new Sleeper(app);
				try {
					sleeper.hugPillow(sleeperHall, server.accept()
							, sleeper.hashCode());
					sleeper.start();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}else {
				haoHiYooFaker(sleeperHall);
			}
		}
	}
}