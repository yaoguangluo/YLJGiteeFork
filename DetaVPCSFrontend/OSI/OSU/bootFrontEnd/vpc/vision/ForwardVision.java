package OSI.OSU.bootFrontEnd.vpc.vision;

import java.io.IOException;

import java.net.Socket;

import OSI.OSU.bootFrontEnd.rest.VPC;

public class ForwardVision {
	public static void main(String[] args){
	}

	public static void getForwardType(Socket socket) {
	}

	public static void forwardToRestMap(Socket socket) {
	}

	public static void getForwardType(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) throws IOException {
		if(vPCSRequest.getRequestIsRest()){
			String filePath = VPC.getFilePath(vPCSRequest.getRequestLink());
			if(filePath.contains(".ttf")||filePath.contains(".eot")||filePath.contains(".svg")
					||filePath.contains(".woff")||filePath.contains(".woff2")||filePath.contains(".otf")){
				String code = VPC.getCode(filePath);
				vPCSRequest.setRequestFilePath(filePath);
				vPCSRequest.setRequestFileCode(code);
				vPCSRequest.setRequestForwardType("buffer");
				vPCSResponse.setResponseContentType("content-type: application/font-woff \n\n");
				return;
			}	
			vPCSRequest.setRequestForwardType("rest");
		}else{
			String filePath = VPC.getFilePath(vPCSRequest.getRequestLink());
			String code = VPC.getCode(filePath);
			vPCSRequest.setRequestFilePath(filePath);
			vPCSRequest.setRequestFileCode(code);
			if(filePath.contains(".png")){ 
				vPCSRequest.setRequestForwardType("bytes");
				vPCSResponse.setResponseContentType("content-type: image/png \n\n");
			}
			if(filePath.contains(".jpeg")){ 
				vPCSRequest.setRequestForwardType("bytes");
				vPCSResponse.setResponseContentType("content-type: image/jpeg \n\n");
			}
			if(filePath.contains(".gif")){ 
				vPCSRequest.setRequestForwardType("bytes");
				vPCSResponse.setResponseContentType("content-type: image/gif \n\n");
			}
			if(filePath.contains(".js") && code.equalsIgnoreCase("UTF-8")){	
				vPCSRequest.setRequestForwardType("bytesBuffer");
				vPCSResponse.setResponseContentType("content-type: text/javascript; charset:UTF-8  \n\n");
			}
			if(filePath.contains(".css")){
				vPCSRequest.setRequestForwardType("buffer");
				vPCSResponse.setResponseContentType("content-type: text/css \n\n");
			}
			if(filePath.contains(".html")){
				vPCSRequest.setRequestForwardType("buffer");
				vPCSResponse.setResponseContentType("content-type: text/html \n\n");
			}
			if(filePath.contains(".wav")){
				vPCSRequest.setRequestForwardType("bytesWithoutZip");
				vPCSResponse.setResponseContentType("content-type: audio/wav \n\n");
			}
			if(filePath.contains(".txt")){
				vPCSRequest.setRequestForwardType("bytesWithoutZip");
				vPCSResponse.setResponseContentType("content-type: text/plain \n\n");
			}
			if(filePath.contains(".xml")){
				vPCSRequest.setRequestForwardType("bytesWithoutZip");
				vPCSResponse.setResponseContentType("content-type: application/xml \n\n");
			}
			if(filePath.contains(".pdf")){
				vPCSRequest.setRequestForwardType("bytesWithoutZip");
				vPCSResponse.setResponseContentType("content-type: application/pdf \n\n");
			}
			if(filePath.contains(".zip")){
				vPCSRequest.setRequestForwardType("bytesWithoutZip");
				vPCSResponse.setResponseContentType("content-type: application/zip \n\n");
			}
			if(filePath.contains(".rar")){
				vPCSRequest.setRequestForwardType("bytesWithoutZip");
				vPCSResponse.setResponseContentType("content-type: application/rar \n\n");
			}
		}
	}

	public static void forwardToRestMap(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) throws Exception {
		if(vPCSRequest.getRequestForwardType() == null){
			vPCSResponse.return404();
			return;
		}
		if(vPCSRequest.getRequestForwardType().equalsIgnoreCase("rest")){
			RestMapVision.processRest(vPCSRequest, vPCSResponse);
		}
		if(vPCSRequest.getRequestForwardType().equalsIgnoreCase("bytes")){
			RestMapVision.processBytes(vPCSRequest, vPCSResponse);
		}
		if(vPCSRequest.getRequestForwardType().equalsIgnoreCase("buffer")){
			RestMapVision.processBuffer(vPCSRequest, vPCSResponse);
		}
		if(vPCSRequest.getRequestForwardType().equalsIgnoreCase("bytesBuffer")){
			RestMapVision.processBufferBytes(vPCSRequest, vPCSResponse);
		}
		if(vPCSRequest.getRequestForwardType().equalsIgnoreCase("bytesWithoutZip")){
			RestMapVision.processBytesWithoutZip(vPCSRequest, vPCSResponse);
		}
	}
}