package OSI.OSU.deta.bootFrontEnd.vpc.controller;

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import OSI.OSU.deta.bootFrontEnd.vpc.vision.VPCSRequest;
import OSI.OSU.deta.bootFrontEnd.vpc.vision.VPCSResponse;

public class RequestRecordController {
	
	public static void requestIpRecoder(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) {
		vPCSRequest.setRequestIp(vPCSResponse.getSocket().getInetAddress().getHostAddress());
		vPCSRequest.setRequestName(vPCSResponse.getSocket().getInetAddress().getHostName());
	}

	public static void requestLinkRecoder(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(vPCSResponse.getSocket().getInputStream()));
		String mess = br.readLine();
		if(null == mess){
			vPCSResponse.returnErrorCode(200);
			return;
		}
		if(mess.length()>15000) {
			vPCSResponse.returnErrorCode(200);
			return;
		}
		if(mess.equalsIgnoreCase("") || !mess.contains("HTTP")){
			vPCSResponse.returnErrorCode(200);
			return;
		}
		String[] type = mess.split(" ");
		if(type.length < 3){
			vPCSResponse.returnErrorCode(200);
			return;
		}
		//System.out.println(type[1]);
		String[] content = type[1].split("\\?");
		if(content.length == 2) {
			if(content[0].contains(".woff")|| content[0].contains(".ttf")) {
				vPCSRequest.setRequestIsRest(false);
				vPCSResponse.returnErrorCode(200);
				int count=0;
				while((br.readLine())!=null){
					if(count++==10) {
						break;
					}
				}	
				return;
			}else if(content[0].equalsIgnoreCase("/")|| content[0].contains(".js")|| content[0].contains(".css")
					|| content[0].contains(".html")){
				vPCSRequest.setRequestIsRest(false);	
			}else {
				vPCSRequest.setRequestIsRest(true);
				if(content[1] == null ||content[1].equals("")||!content[1].contains("=")){
					vPCSResponse.returnErrorCode(200);
					return;
				}	
			}
		}else {
			vPCSRequest.setRequestIsRest(false);
		}
		if(vPCSRequest.getRequestIsRest()){
			String[] column = content[1].split("&");
			Map<String, String> data = new ConcurrentHashMap<>();
			for(String cell:column){
				String[] cells = cell.split("=");
				if(cells.length>1) {
					data.put(cells[0], URLDecoder.decode(cells[1], "UTF-8"));
				}
			}
			vPCSRequest.setRequestValue(data);	
		}
		vPCSRequest.setRequestLink(content[0]);	
	}
}