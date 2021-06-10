package MSU.AMS.VQS.SQV.SI.OSU.SMV.http;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import ESU.stable.Stable;
import ESU.string.String_ESU;
import PEU.P.dna.Token;
import PEU.P.dna.TokenCerts;
public class RestCall {
	public static String getJson(String urlString, String jsonString) 
			throws IOException{
		String code= Stable.STRING_EMPTY;
		URL url= new URL(urlString);
		HttpURLConnection connection= (HttpURLConnection)url.openConnection();
		connection.setRequestMethod(Stable.HTTP_GET);
		connection
		.setRequestProperty(Stable.CONTENT_TYPE, Stable.APPLICATION_JSON_UTF8); 
		connection.setDoOutput(true);
		connection.setInstanceFollowRedirects(false);
		StringBuffer sbuffer= new StringBuffer();
		sbuffer.append(jsonString);
		OutputStream os= connection.getOutputStream();
		os.write(sbuffer.toString().getBytes());
		os.flush(); 
		StringBuilder stringBuilder= new StringBuilder();
		BufferedReader bufferedReader= null;
		try {
			InputStream inputStream= connection.getInputStream();
			int caherset_size= connection.getHeaderFields().size();
			for(int i= 0; i< caherset_size; i++) {
				String temp= connection.getHeaderField(i);
				if(temp.contains(Stable.CHARSET)) {
					if(temp.toUpperCase().contains(Stable.CHARSET_GBK)) {
						code= Stable.CHARSET_GBK;
					}	
					if(temp.toUpperCase().contains(Stable.CHARSET_UTF_8)
							|| temp.toUpperCase().contains(Stable.CHARSET_UTF8)) {
						code= Stable.CHARSET_UTF_8;
					}
					if(temp.toUpperCase().contains(Stable.CHARSET_GB2312)) {
						code= Stable.CHARSET_GB2312;
					}
					if(temp.toUpperCase().contains(Stable.CHARSET_ASCII)) {
						code= Stable.CHARSET_ASCII;
					}
					if(temp.toUpperCase().contains(Stable.CHARSET_UNICODE)) {
						code= Stable.CHARSET_UNICODE;
					}
					if(temp.toUpperCase().contains(Stable.CHARSET_ISO_8859_1)) {
						code= Stable.CHARSET_ISO_8859_1;
					}
				}
			}
			if (null!= inputStream) {
				bufferedReader
				=  new BufferedReader(new InputStreamReader(inputStream, code));   
				String lines;
				while ((lines= bufferedReader.readLine()) != null) {
					stringBuilder.append(lines); 	
				}
			} else {
				stringBuilder.append(Stable.STRING_EMPTY);
			}
		} catch (IOException ex) {
			//throw ex;
		} finally {
			if (null!= bufferedReader) {
				try {
					bufferedReader.close();
				} catch (IOException ex) {
					//throw ex;
				}
			}
		}
		return new String(stringBuilder.toString().getBytes(), Stable.CHARSET_UTF_8);	
	}

	
	
	public static String backEndRequest(String request) throws IOException {
		//ģ��Ӹ������˺�: 313699483@QQ.COM, ����: fengyue1985
		String id= "313699483@QQ.COM";
		String idString= String_ESU.charsetSwap(id, "GBK", "GBK");
		String idEncoder= String_ESU.stringToURIencode(idString, "UTF8");
		String password= "fengyue1985";
		//����
		SessionValidation sessionValidation= new SessionValidation();
		TokenCerts tokenCerts= sessionValidation.sessionTokenCertsInitWithHumanWordsByDNA(password, false, null);
		Token token= sessionValidation.sessionInitByTokenPDICertsDNA(tokenCerts);
		String passwordString= String_ESU.charsetSwap(token.getmPassword(), "GBK", "GBK");
		String passwordEncoder= String_ESU.stringToURIencode(passwordString, "UTF8");
		System.out.println("pds--1>"+tokenCerts.getPds());
		URL url = new URL("http://localhost/dataCG?message="+ request+
				"&id="+ idEncoder+
				"&password="+ passwordEncoder+
				"&de="+ token.getUpdsde() +
				"&ds="+ token.getUpdsds() +
				"&ie="+ token.getUpdsie() +
				"&is="+ token.getUpdsis() +
				"&lock="+ tokenCerts.getPdnLock());
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		//������url ��httpconnection, ֻ�ܷ������������������ʹ��,���Ҫ������������, �����������غ���.
		//��������޹�, �Ժ�����.
		//HttpConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Accept", "application/json");
		if (conn.getResponseCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
		}
		BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream()), "GBK"));
		String out = "";
		String out1;
		while ((out1 = br.readLine()) != null) {
			out += out1;
		}
		conn.disconnect();
		return out;
	}
	
	public static String searchLinkWord(String request) throws IOException {
		//System.out.println("http://localhost:8000" + request);
		URL url = new URL("http://localhost:8000" + request);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Accept", "application/json");
		if (conn.getResponseCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
		}
		BufferedReader br= new BufferedReader(new InputStreamReader((conn.getInputStream()), "GBK"));
		String out= "";
		String out1;
		while ((out1 = br.readLine()) != null) {
			out += out1;
		}
		conn.disconnect();
		return out;
	}
	
	public static String cacheRequest(String request) throws IOException {
		URL url= new URL("http://localhost:6379/"+ request);
		HttpURLConnection conn= (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Accept", "application/json;charset=utf-8");
		conn.setRequestProperty("Content-Type", "application/json;charset=utf-8");
		if (conn.getResponseCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
		}
		BufferedReader br= new BufferedReader(new InputStreamReader((conn.getInputStream()),"UTF-8"));
		String out= "";
		String out1;
		while ((out1 = br.readLine()) != null) {
			out += out1;
		}
		conn.disconnect();
		return out;
	}
}