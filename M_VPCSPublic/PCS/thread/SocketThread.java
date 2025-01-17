package PCS.thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import OCI.AVC.SUQ.SVQ.MPC.fhmm.C.EmotionMap;
import OCI.ME.analysis.C.A;
import OSI.AOP.PCS.rest.RestMap;

public class SocketThread extends Thread implements Runnable{
	private Socket socket;
	private A _A;
	private EmotionMap emotionMap;
	private String sid;
	private SocketThreadPool socketThreadPool;
	public SocketThread(EmotionMap emotionMap, A _A, SocketThreadPool socketThreadPool
			, Socket socket, String id){
		this.socket= socket;
		this.sid= id;
		this._A= _A;
		this.emotionMap= emotionMap;
		this.socketThreadPool= socketThreadPool;
	}

	public void run(){
		try{
			BufferedReader br= new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String mess= br.readLine();
			if(null== mess){
				error500();
			}
			if(mess.equalsIgnoreCase("")){
				error500();
			}
			String[] type = mess.split(" ");
			if(type.length<2){
				error500();
			}
			String[] content = type[1].split("\\?");
			if(content.length!=2){
				error500();
			}
			if(content[1]==null){
				error500();
			}
			RestMap.P(content, socket, this._A, this.emotionMap);
			socket.close();
		}catch(Exception e){
			try {
				error500();
			} catch (IOException e1) {
				if(!socket.isClosed()){
					try {
						socket.close();
					} catch (IOException e12) {
						socket = null;
					}
				}else{
					//socket = null;
				}
			}
		}
		socketThreadPool.removeThreadById(this.sid);
	}

	private void error500() throws IOException {
		PrintWriter pw= new PrintWriter(socket.getOutputStream(), true);
		pw.println("HTTP/1.1 500 OK\n\n"); 
		pw.flush();
		pw.close();
		socket.close();
		socketThreadPool.removeThreadById(this.sid);
		return;
	}

	public String getSid() {
		return this.sid;
	}
}