package org.deta.bootFrontEnd.vpc.controller;
import java.io.IOException;

import java.net.ServerSocket;
import java.util.Properties;
import org.deta.bootFrontEnd.vpc.process.TimeProcess;
import org.deta.bootFrontEnd.vpc.sleeper.Sleeper;
import org.deta.bootFrontEnd.vpc.sleeper.SleeperHall;
import org.lygFrontend.common.utils.DetaUtil;
public class ServerInitControllerVPCSFrontEnd {
	private ServerSocket server;
	@SuppressWarnings("unused")
	private Properties properties;
	private int port;
	{
		properties= new Properties();
		//try {
			//properties.load(new FileInputStream(new File("src/main/resourcesFrontEnd/property.proterties")));
			System.out.println("----����VPCSǰ�˷�������Դ����:�ɹ���");
		//}catch (IOException e) {
		//	e.printStackTrace();
		//}
	}

	public void init() throws IOException {
		try {
			port= 80;
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

	public void initServer() throws IOException {
		System.out.println("----DETA VPCS--1.7");
		System.out.println("----Author: ������");
		System.out.println("----������������������޹�˾��Դ��Ŀ");
		TimeProcess timeProcess= new TimeProcess();
		timeProcess.begin();
		SleeperHall sleeperHall= new SleeperHall();
		init();
		timeProcess.end();
		System.out.println("----����VPCSǰ�˷���������һ������-�ܺ�ʱ:"+ timeProcess.duration()+ "����");
		while(true){	
			if(sleeperHall.getThreadsCount()< 500){
				Sleeper sleeper= new Sleeper();
				sleeper.hugPillow(sleeperHall, server.accept(), sleeper.hashCode());
				sleeper.start();
			}else {
				haoHiYooFaker(sleeperHall);
			}
		}
	}
}