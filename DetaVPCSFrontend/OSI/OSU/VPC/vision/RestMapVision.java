package OSI.OSU.VPC.vision;
import java.io.BufferedReader;


import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import OSI.OSU.VPC.cache.DetaCacheManager;
import OSI.OSU.VPC.common.utils.GzipUtil;
import OSI.OSU.VPC.rest.VPC;
public class RestMapVision {
	public static void main(String[] args){

	}

	public static void getResponse(Socket socket) {

	}

	public static void returnResponse(Socket socket) {

	}

	public static void getResponse(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) {

	}

	public static void returnResponse(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) {
		vPCSResponse.getSleeperHall().removeThreadById(vPCSResponse.getHashCode());
	}

	public static void processRest(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) throws Exception {
		String output = VPC.forward(vPCSRequest.getRequestLink(), vPCSRequest.getRequestValue());
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(vPCSResponse.getSocket()
				.getOutputStream(),"UTF-8")),true);
		pw.println("HTTP/1.1 200 OK\n\n"); 
		output=output.charAt(0)=='"'?output.substring(1,output.length()):output;
		output=output.charAt(output.length()-1)=='"'?output.substring(0
				, output.length()-1):output;
		output.replace("\\\"","\"");
		pw.println(output);
		pw.flush();
		pw.close();	
		vPCSResponse.getSleeperHall().removeThreadById(vPCSResponse.getSocket().hashCode());
	}

	public static void processView(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) {

	}

	public static void processBytes(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) throws IOException {
		List<byte[]> list;
		DataOutputStream dataOutputStream = new DataOutputStream(vPCSResponse.getSocket().getOutputStream());
		if(DetaCacheManager.getCacheOfBytesList(vPCSRequest.getRequestFilePath()) != null){
			list = DetaCacheManager.getCacheOfBytesList(vPCSRequest.getRequestFilePath());
		}else{
			FileInputStream fileInputStream = new FileInputStream(new File(vPCSRequest.getRequestFilePath()));
			ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
			byte[] byteArray = new byte[1024];
			int len = 0;
			list = new ArrayList<>();
			//���while����˼������ ��ƪ���£�https://blog.csdn.net/top_code/article/details/41042413
			//�ǳ����ɴ���len�ĳ��������лл��
			while((len = fileInputStream.read(byteArray, 0, 1024))!=-1){
				byteArrayOutputStream.write(byteArray, 0, len);
			}
			fileInputStream.close();
			byte[] sniper = GzipUtil.compress(byteArrayOutputStream.toByteArray());
			list.add(0, vPCSResponse.getResponseContentType().getBytes("UTF8"));
			list.add(0, ("Content-Length: " + sniper.length + " \n").getBytes("UTF8"));
			list.add(0, ("Cache-control: max-age=315360000 \n").getBytes("UTF8"));
			list.add(0, ("Content-Encoding:Gzip \n").getBytes("UTF8"));
			list.add(0, "Accept-Ranges: bytes \n".getBytes("UTF8"));
			list.add(0, "Host:deta software  \n".getBytes("UTF8"));
			list.add(0, "HTTP/1.1 200 OK \n".getBytes("UTF8"));
			list.add(sniper);
			DetaCacheManager.putCacheOfBytesList(vPCSRequest.getRequestFilePath(), list);
		}	
		Iterator<byte[]> iterator = list.iterator();
		while(iterator.hasNext()){
			byte[] bytes= null;
			int i= 0;
			try {
				bytes= iterator.next();
				if(bytes.length>10000) {
					int last= bytes.length%10000;
					for(i= 0; i< bytes.length-10000; i+= 10000) {
						byte[] serparBytes = new byte[10000];
						for(int j= 0; j< 10000; j++) {
							serparBytes[j]= bytes[i+ j];
						}
						dataOutputStream.write(serparBytes);
						dataOutputStream.flush();
					}
					byte[] serparBytes = new byte[last];
//					i-=10000;
					for(int j=0; j<last;j++) {
						serparBytes[j]= bytes[i+ j];
					}
					dataOutputStream.write(serparBytes);
				}else {
					dataOutputStream.write(bytes);
				}
			}catch(Exception e) {
				System.out.print(i);
				System.out.print(bytes.length);
				System.out.print(vPCSRequest.getRequestLink());
				System.out.print(vPCSRequest.getRequestFilePath());
				e.printStackTrace();
			}
		}	
		dataOutputStream.flush();
		dataOutputStream.close();
	}

	public static void processBuffer(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) throws IOException {
		String builderToString;
		if(DetaCacheManager.getCacheOfString(vPCSRequest.getRequestFilePath()) != null){
			builderToString = DetaCacheManager.getCacheOfString(vPCSRequest.getRequestFilePath());
		}else{
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append("HTTP/1.1 200 OK").append("\n");
			stringBuilder.append("Host:deta software  \n");
			stringBuilder.append("Cache-control: max-age=315360000 \n");
			stringBuilder.append(vPCSResponse.getResponseContentType());
			FileInputStream fileInputStream = new FileInputStream(new File(vPCSRequest.getRequestFilePath())); 
			InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, vPCSRequest.getRequestFileCode()); 
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader); 
			String line = null; 
			while ((line = bufferedReader.readLine()) != null) { 
				stringBuilder.append(line); 
			}
			bufferedReader.close();
			builderToString = stringBuilder.toString();
			DetaCacheManager.putCacheOfString(vPCSRequest.getRequestFilePath(), builderToString);
		}
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(vPCSResponse.getSocket().getOutputStream()
				, vPCSRequest.getRequestFileCode()));
		bufferedWriter.write(builderToString);
		bufferedWriter.flush();
		bufferedWriter.close();
	}

	public static void processBufferBytes(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) throws UnsupportedEncodingException, IOException {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("HTTP/1.1 200 OK").append("\n");
		stringBuilder.append("Host:deta software  \n");
		stringBuilder.append("Cache-control: max-age=315360000 \n");
		stringBuilder.append("Content-Encoding:gzip \n");
		stringBuilder.append(vPCSResponse.getResponseContentType());
		String builderToString = stringBuilder.toString();
		String contentBuilderToString;
		if(DetaCacheManager.getCacheOfString(vPCSRequest.getRequestFilePath()) != null){
			contentBuilderToString = DetaCacheManager.getCacheOfString(vPCSRequest.getRequestFilePath());
		}else{
			StringBuilder contentBuilder = new StringBuilder();
			FileInputStream fileInputStream = new FileInputStream(new File(vPCSRequest.getRequestFilePath()));
			int len = 0;
			byte[] byteArray = new byte[1024];
			while ((len = fileInputStream.read(byteArray))!=-1){
				contentBuilder.append(new String(byteArray, 0, len,"UTF-8"));
			}
			fileInputStream.close();
			contentBuilderToString = contentBuilder.toString();
			DetaCacheManager.putCacheOfString(vPCSRequest.getRequestFilePath(), contentBuilderToString);
		}	
		DataOutputStream dataOutputStream = new DataOutputStream(vPCSResponse.getSocket().getOutputStream());
		dataOutputStream.write(builderToString.getBytes("UTF8"));
		byte[] bytes= null;
		int i= 0;
		try {
			bytes=GzipUtil.compress(contentBuilderToString.getBytes("UTF8"));
			if(bytes.length>10000) {
				int last= bytes.length%10000;
				for(i= 0; i< bytes.length- 10000; i+= 10000) {
					byte[] serparBytes = new byte[10000];
					for(int j= 0; j< 10000; j++) {
						serparBytes[j]= bytes[i+ j];
					}
					dataOutputStream.write(serparBytes);
					dataOutputStream.flush();
				}
				byte[] serparBytes = new byte[last];
//				i-=10000;
				for(int j=0; j<last;j++) {
					serparBytes[j]= bytes[i+ j];
				}
				dataOutputStream.write(serparBytes);
			}else {
				dataOutputStream.write(bytes);
			}
		}catch(Exception e) {
			System.out.print(i);
			System.out.print(bytes.length);
			System.out.print(vPCSRequest.getRequestLink());
			System.out.print(vPCSRequest.getRequestFilePath());
			e.printStackTrace();
		}
		//dataOutputStream.write(GzipUtil.compress(contentBuilderToString.getBytes("UTF8")));
		dataOutputStream.flush();
		dataOutputStream.close();
	}

	public static void processBytesWithoutZip(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) throws IOException {
		List<byte[]> list;
		DataOutputStream dataOutputStream = new DataOutputStream(vPCSResponse.getSocket().getOutputStream());
		if(DetaCacheManager.getCacheOfBytesList(vPCSRequest.getRequestFilePath()) != null){
			list = DetaCacheManager.getCacheOfBytesList(vPCSRequest.getRequestFilePath());
		}else{
			FileInputStream fileInputStream = new FileInputStream(new File(vPCSRequest.getRequestFilePath()));
			ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
			byte[] byteArray = new byte[1024];
			int len = 0;
			list = new ArrayList<>();
			//���while����˼������ ��ƪ���£�https://blog.csdn.net/top_code/article/details/41042413
			//�ǳ����ɴ���len�ĳ��������лл��
			while((len = fileInputStream.read(byteArray, 0, 1024))!=-1){
				byteArrayOutputStream.write(byteArray, 0, len);
			}
			fileInputStream.close();
			byte[] sniper =byteArrayOutputStream.toByteArray();
			list.add(0, vPCSResponse.getResponseContentType().getBytes("UTF8"));
			list.add(0, ("Content-Length: " + sniper.length + " \n").getBytes("UTF8"));
			list.add(0, ("Cache-control: max-age=315360000 \n").getBytes("UTF8"));
			list.add(0, "Accept-Ranges: bytes \n".getBytes("UTF8"));
			list.add(0, "Host:deta software  \n".getBytes("UTF8"));
			list.add(0, "HTTP/1.1 200 OK \n".getBytes("UTF8"));
			list.add(sniper);
			DetaCacheManager.putCacheOfBytesList(vPCSRequest.getRequestFilePath(), list);
		}	
		Iterator<byte[]> iterator = list.iterator();
		while(iterator.hasNext()){
			byte[] bytes = null;
			int i= 0;
			try {
				bytes=iterator.next();
				if(bytes.length>10000) {
					int last= bytes.length%10000;
					for(i= 0; i< bytes.length- 10000; i+= 10000) {
						byte[] serparBytes = new byte[10000];
						for(int j= 0; j< 10000; j++) {
							serparBytes[j]= bytes[i+ j];
						}
						Thread.sleep(250);
						dataOutputStream.write(serparBytes);
						dataOutputStream.flush();
					}
					byte[] serparBytes = new byte[last];
//					i-=10000;
					for(int j=0; j<last;j++) {
						serparBytes[j]= bytes[i+ j];
					}
					dataOutputStream.write(serparBytes);
				}else {
					dataOutputStream.write(bytes);
				}
			}catch(Exception e) {
				System.out.print(i);
				System.out.print(bytes.length);
				System.out.print(vPCSRequest.getRequestLink());
				System.out.print(vPCSRequest.getRequestFilePath());
				e.printStackTrace();
			}
		}	
		dataOutputStream.flush();
		dataOutputStream.close();
	}
}