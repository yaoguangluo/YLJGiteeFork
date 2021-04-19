package OSI.OSU.plsql.vpc.process.portImpl;


import java.util.HashMap;
import java.util.Map;

import OSI.OSU.MSD.plsql.db.delete.imp.DeleteRowsImp;
import OSI.OSU.plsql.vpc.process.companyImpl.LoginServiceImpl;

public class RestDBDeleteImpl {
	public static Map<String, Object> deleteRowByTablePathAndIndex(String tablePath
			, String pageIndex, String token
			, String email, String password, String auth) throws Exception {
		Map<String, Object> output = new HashMap<String, Object>();
		if(token != null && !token.equalsIgnoreCase("")){
			String checkStatus = LoginServiceImpl.checkTokenStatus(token, "level");
			if(checkStatus.contains("invalid")&&(auth.contains("1"))) {
				output.put("loginInfo", "unsuccess");
				output.put("returnResult", checkStatus);
				return output;
			}
		}else if(email != null && !email.equalsIgnoreCase("")){
			String checkStatus = LoginServiceImpl.checkRightsStatus(email, password, "DB");
			if(checkStatus.contains("invalid")) {
				output.put("loginInfo", "unsuccess");
				output.put("returnResult", checkStatus);
				return output;
			}
		}else{
			output.put("loginInfo", "unsuccess");
			output.put("returnResult", "invalid request");
			return output;
		}
		return DeleteRowsImp.deleteRowByTablePathAndIndex(tablePath, pageIndex, true);
	}
}