package OSI.OPE.OP.SM.AOP.MEC.SIQ.VPC.PP.port.E;


import java.util.HashMap;
import java.util.Map;

import OSI.OPE.MSD.OP.SM.AOP.MEC.SIQ.SM.OSD.E.D_RowsImp;
import OSI.OPE.OP.SM.AOP.MEC.SIQ.VPC.PP.company.E.LoginServiceImpl;

public class RestDB_D_Impl {
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
		return D_RowsImp.deleteRowByTablePathAndIndex(tablePath, pageIndex, true);
	}
}