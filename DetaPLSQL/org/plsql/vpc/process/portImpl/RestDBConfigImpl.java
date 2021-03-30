package org.plsql.vpc.process.portImpl;
import cacheProcessor.Cache;
import cacheProcessor.CacheManager;

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

import org.plsql.vpc.process.companyImpl.LoginServiceImpl;
public class RestDBConfigImpl {
	public static Map<String, String> setDBPath(String basePath
			, String token, String auth) throws Exception {
		Map<String, String> output= new HashMap<String, String>();
		String checkStatus = LoginServiceImpl.checkTokenStatus(token, "level");
		if(checkStatus.contains("invalid")&&(auth.contains("1"))) {
			output.put("loginInfo", "unsuccess");
			output.put("returnResult", checkStatus);
			return output;
		}
		//��������ļ�
		File config = new File("C:/DBconfig.lyg");
		if (config.exists()) {
			config.delete();	
		}
		//��д�����ļ�
		FileWriter fw = null;
		fw = new FileWriter("C:/DBconfig.lyg", true);
		fw.write("path->" + basePath);	
		fw.close();
		//д����
		Cache c = new Cache();
		c.setValue(basePath);
		CacheManager.putCache("DBPath", c);
		//������
		File fileDBPath = new File(basePath);
		if (fileDBPath.isDirectory()) {
			output.put("info", "isDirectory" + CacheManager.getCacheInfo("DBPath")
			.getValue().toString());
		}else {
			fileDBPath.mkdir();
			output.put("info", "isCreated" + CacheManager.getCacheInfo("DBPath")
			.getValue().toString());
		}
		return output;
	}

	public static Map<String, String> setDBTable(String tableName, String token
			, String auth) throws Exception {
		Map<String, String> output = new HashMap<String, String>();
		String checkStatus = LoginServiceImpl.checkTokenStatus(token, "level");
		if(checkStatus.contains("invalid")&&(auth.contains("1"))) {
			output.put("loginInfo", "unsuccess");
			output.put("returnResult", checkStatus);
			return output;
		}
		//�Ƿ���
		String DBPath = CacheManager.getCacheInfo("DBPath").getValue().toString() +"/"+ tableName;
		//������
		File fileDBPath = new File(DBPath);
		if (fileDBPath.isDirectory()) {
			output.put("info", "isDirectory:"+DBPath);
		}else {
			fileDBPath.mkdir();
			output.put("info", "isCreated:"+DBPath);
		}
		//�о����	
		//û�оʹ���
		return output;
	}
}