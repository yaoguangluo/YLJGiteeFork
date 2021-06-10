package OSI.AOP.MSV.PCS.controller;
import java.io.IOException;
import java.net.ServerSocket;

import javax.swing.JTextPane;

import ME.APM.VSQ.App;
import MS.OP.SM.AOP.MEC.SIQ.cache.DetaDBBufferCacheManager;
import MS.VPC.PP.Time_P;
import MS.VPC.SH.Sleeper;
import MS.VPC.SH.SleeperHall;
import MSV.PCS.C.RequestFilter_C;
import OM.config.Config;
import OP.SM.AOP.MEC.SIQ.stable.StableData;
import OSI.AOP.MS.VPC.S.hall.DatabaseLogHall;
import VPC.VQS.DSU.utils.DetaUtil;
public class ServerInit_C {
	private static ServerSocket server;
	//private static Properties properties;
	private static int port;
	private static String dbConfigPath;
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
			if(null!= dbConfigPath && !dbConfigPath.isEmpty()) {
				dbConfigPath.replace("\\", "/"); //֧�� linux reg ��ʽ
				DetaUtil.initDB(dbConfigPath);
			}else {
				dbConfigPath= "C:/DBconfig.lyg";
				DetaUtil.initDB(dbConfigPath);
			}
			System.out.println("----����VPCS���ݿ������DMAȷ��:�ɹ���");
			if(jTextPane!= null) {
				String text= jTextPane.getText();
				text="\r\n"+ "----����VPCS���ݿ������DMAȷ��:�ɹ���"+ text;
				text="\r\n"+ "...";
				jTextPane.setText(text);
			}
			RequestFilter_C.initBlockList();
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
		dbConfigPath= app.dbConfigPath;
		System.out.println("----DETA VPCS--2.0");
		System.out.println("----Author: ������");
		System.out.println("----�����������������޹�˾��Դ��Ŀ");
		if(app.appConfig.SectionJPanel.jTextPane!= null) {
			String text= app.appConfig.SectionJPanel.jTextPane.getText();
			text="\r\n"+ "������� PLSQL���ݿ� ӳ�������ϣ�"+ text;
			text="\r\n"+ "----Author: ������"+ text;
			text="\r\n"+ "----�����������������޹�˾��Դ��Ŀ"+ text;
			text="\r\n"+ "..."+ text;
			app.appConfig.SectionJPanel.jTextPane.setText(text);
		}
		Time_P timeProcess= new Time_P();
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