package OSI.AOP.VPC.C;
import java.io.IOException;

import java.net.ServerSocket;
import java.util.Properties;

import ME.APM.VSQ.App;
import MS.VPC.PP.Time_P;
import MS.VPC.SH.Sleeper;
import MS.VPC.SH.SleeperHall;
import OM.config.Config;
import VPC.VQS.DSU.utils.DetaUtil;
public class ServerInit_C_VPCSFrontEnd {
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
			if(null!= app.dbConfigPath&& !app.dbConfigPath.isEmpty()) {
				DetaUtil.initDB(app.dbConfigPath);//�Ժ�������
			}else {
				DetaUtil.initDB("C:/DBconfig.lyg");
			}
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
		Time_P timeProcess= new Time_P();
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