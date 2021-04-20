package OSI.OSU.PCS.server;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.Properties;
import java.util.Random;

import OSI.OSU.ASQ.PSU.OCI.engine.analysis.Analyzer;
import OSI.OSU.ASQ.PSU.OEI.engine.analysis.imp.CogsBinaryForestAnalyzerImp;
import OSI.OSU.OCI.emotion.ortho.fhmm.EmotionMap;
import OSI.OSU.OEI.emotion.ortho.fhmm.imp.EmotionMapImp;
import OSI.OSU.PCS.thread.SocketThread;
import OSI.OSU.PCS.thread.SocketThreadPool;
import OSI.OSU.config.Config;
public class BootVPCSBackEnd extends Thread{
	private static ServerSocket server;
	@SuppressWarnings("unused")
	private static Properties properties;
	private Analyzer analyzer;
	private EmotionMap emotionMap;
	private int port;
	static {
		properties = new Properties();
	}

	public BootVPCSBackEnd(Analyzer analyzer) throws IOException {
		if(null== analyzer) {
			this.analyzer = new CogsBinaryForestAnalyzerImp();
			this.analyzer.initMixed();
		}else {
			this.analyzer= analyzer;
		}
		
	}
	public BootVPCSBackEnd() throws IOException {	
	}
	
    // ��Ϊ��ҳ�Ѿ�init��,��֮���ĳ�analyzer���������. ������20210420
	public void init() {
		try {
			//port = Integer.parseInt(properties.getProperty("port"));
			port= Config.detaVPCSBackEndPort;
			server = new ServerSocket(port);
			if(null== this.analyzer) {
				this.analyzer = new CogsBinaryForestAnalyzerImp();
				this.analyzer.initMixed();
			}
			emotionMap = new EmotionMapImp(); 
			emotionMap.initNegativeMap();
			emotionMap.initPositiveMap();
			emotionMap.initMotivationMap();
			emotionMap.initTrendingMap();
			emotionMap.initPredictionMap();
			emotionMap.initDistinctionMap();
			System.out.println("----����VPCS��˷������˿�����:" + port);
			//MrTin.born.start();;
			System.out.println("----Tin�� VPCS-AOPM-IDUQ ��һ�����˴߻�������������:" + port);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void bootBackEnd() throws IOException {
		SocketThreadPool socketThreadPool= new SocketThreadPool();
		long before = System.currentTimeMillis();
		init();
		addRestService();
		long now = System.currentTimeMillis();
		System.out.println("----DETA VPCS BackEnd--1.7");
		System.out.println("----Author: ������");
		System.out.println("----�����������������޹�˾��Դ��Ŀ");
		System.out.println("----����VPCS��˷�����----");
		System.out.println("----����VPCS��˷���������һ������-�ܺ�ʱ:"+ (now- before)+ "����");
		while(true){
			if(socketThreadPool.getThreadsCount() < 300){
				SocketThread clientSocket= new SocketThread(emotionMap, analyzer, socketThreadPool, server.accept()
						, System.currentTimeMillis()+ "" + new Random().nextLong());
				socketThreadPool.addExecSocket(clientSocket.getSid(), clientSocket);
				clientSocket.start();
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		new BootVPCSBackEnd().bootBackEnd();
	}
	
	public void run(){
		try {
			bootBackEnd();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void addRestService() {	
	}
}