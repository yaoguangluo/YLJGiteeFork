package OP.SM.AOP.MEC.SIQ.VPC.PP.port.E;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

import OP.SM.AOP.MEC.SIQ.VPC.PP.company.E.LoginService_E;
import PEU.P.cache.*;
public class RestDBConfig_E {
	public static Map<String, String> setDBPath(String basePath
			, String token, String auth) throws Exception {
		Map<String, String> output= new HashMap<String, String>();
		String checkStatus = LoginService_E.checkTokenStatus(token, "level");
		if(checkStatus.contains("invalid")&&(auth.contains("1"))) {
			output.put("loginInfo", "unsuccess");
			output.put("returnResult", checkStatus);
			return output;
		}
		//检查配置文件
		File config = new File("C:/DBconfig.lyg");
		if (config.exists()) {
			config.delete();	
		}
		//重写配置文件
		FileWriter fw = null;
		fw = new FileWriter("C:/DBconfig.lyg", true);
		fw.write("path->" + basePath);	
		fw.close();
		//写缓存
		Cache c = new Cache();
		c.setValue(basePath);
		CacheManager.putCache("DBPath", c);
		//锁定表
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
		String checkStatus = LoginService_E.checkTokenStatus(token, "level");
		if(checkStatus.contains("invalid")&&(auth.contains("1"))) {
			output.put("loginInfo", "unsuccess");
			output.put("returnResult", checkStatus);
			return output;
		}
		//是否有
		String DBPath = CacheManager.getCacheInfo("DBPath").getValue().toString() +"/"+ tableName;
		//锁定表
		File fileDBPath = new File(DBPath);
		if (fileDBPath.isDirectory()) {
			output.put("info", "isDirectory:"+DBPath);
		}else {
			fileDBPath.mkdir();
			output.put("info", "isCreated:"+DBPath);
		}
		//有就输出	
		//没有就创建
		return output;
	}
}