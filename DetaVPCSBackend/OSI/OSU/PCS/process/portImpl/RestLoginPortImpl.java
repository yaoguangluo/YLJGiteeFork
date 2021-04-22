package OSI.OSU.PCS.process.portImpl;
//import lombok.extern.slf4j.Slf4j;

import org.json.JSONObject;

import OSI.OSU.ASQ.PSU.OCI.engine.analysis.Analyzer;
import OSI.OSU.ASQ.PSU.OEI.engine.analysis.imp.CogsBinaryForestAnalyzerImp;
import OSI.OSU.ASQ.PSU.test.DemoEX;
import OSI.OSU.ASQ.PSU.test.TimeCheck;
import OSI.OSU.ASQ.PSU.view.obj.WordFrequency;
import OSI.OSU.PCS.common.maps.VtoV;
import OSI.OSU.PCS.transaction.TransactionDelegate;
import OSI.OSU.VPC.common.utils.DetaDBUtil;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
@SuppressWarnings("unused")
//@RestController
//@Slf4j
public class RestLoginPortImpl{// implements RestLoginPort {
//	@Autowired
//	private TransactionDelegate transactionDelegate;
//
//	@Autowired
//	private LoginService loginService;
	
	public static Map<String, Object> login(String uEmail, String uPassword) throws Exception {
		Map<String, Object> map = TransactionDelegate.transactionLogin(uEmail, uPassword);
		return map;
	}

	public static Map<String, Object> logout(String uEmail, String uToken) throws IOException {
		Map<String, Object> output = new HashMap<String, Object>();
		output.put("userEmail", "friend");
		output.put("userToken", "123456");
		return output;
	}

	public static Map<String, Object> register(String uEmail, String uEmailEnsure, String uName, String uPassword,
			String uPassWDEnsure, String uAddress, String uPhone, String uWeChat,
			String uQq, String uAge, String uSex) throws Exception {
		Map<String, Object> output = TransactionDelegate.transactionRegister(uEmail, uEmailEnsure, uName, uPassword,
				uPassWDEnsure, uAddress, uPhone, uWeChat,
				uQq, uAge, uSex);
		return output;
	}

	public static Map<String, Object> change(String uEmail, String uChange, String uChangeEnsure, String uToken,
			String uPassword) throws IOException {
		return null;
	}

	public static Map<String, Object> find(String uEmail) throws IOException {
		return null;
	}

	@SuppressWarnings("deprecation")
	public static Map<String, Object> checkStatus(String token) throws IOException {
		String json = DetaDBUtil.DBRequest("/checkStatus?token=" + URLEncoder.encode(token));
		Map<String, Object> output = null;
		boolean jsonCheck = true;
		if(null == json){
			output = new HashMap<String, Object>();
			output.put("loginInfo", "unsuccess");
			jsonCheck = false;
		}
		if(json.contains("unsuccess")){
			output = VtoV.JsonObjectToMap(new JSONObject(json));
			jsonCheck = false;
		}
		if(jsonCheck){
			output = VtoV.JsonObjectToMap(new JSONObject(json));
			return output;
		}
		output = new HashMap<String, Object>();
		output.put("loginInfo", "unsuccess");
		return output;
	}
}