package OSI.AOP.VPC.controller;
import java.io.IOException;

import java.net.ServerSocket;
import java.util.Properties;

import ME.APM.VSQ.App;
import OSI.OPE.MS.VPC.PP.TimeProcess;
import OSI.OPE.MS.VPC.sleeper.Sleeper;
import OSI.OPE.MS.VPC.sleeper.SleeperHall;
import OSI.OPE.VPC.VQS.DSU.utils.DetaUtil;
import OSI.config.Config;
public class ServerInitControllerVPCSFrontEnd {
	private ServerSocket server;
	@SuppressWarnings("unused")
	private Properties properties;
	private App app;
	private int port;{
		properties= new Properties();
			System.out.println("----����VPCSǰ�˷�������Դ����:�ɹ���");
	}

	public void init() throws IOException {
		try {
			port= Config.detaVPCSFrontEndPort;
			server= new ServerSocket(port);
			System.out.println("----����VPCSǰ�˷������˿�����:" + port);
			DetaUtil.initDB();
			System.out.println("----����VPCSǰ�˷�����DMAȷ��:�ɹ���");	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void haoHiYooFaker(SleeperHall sleeperHall) {
		sleeperHall.callSkivvy(); 
	}

	public void initServer(App app) throws IOException {
		this.app= app;
		System.out.println("");
		System.out.println("----DETA VPCS--2.0");
		System.out.println("----Author: ������");
		System.out.println("----�����������������޹�˾��Դ��Ŀ");
		TimeProcess timeProcess= new TimeProcess();
		timeProcess.begin();
		SleeperHall sleeperHall= new SleeperHall();
		init();
		timeProcess.end();
		System.out.println("----����VPCSǰ�˷���������һ������-�ܺ�ʱ:"+ timeProcess.duration()+ "����");
		while(true){	
			if(sleeperHall.getThreadsCount()< 500){
				Sleeper sleeper= new Sleeper(this.app);
				sleeper.hugPillow(sleeperHall, server.accept(), sleeper.hashCode());
				sleeper.start();
			}else {
				haoHiYooFaker(sleeperHall);
			}
		}
	}
}