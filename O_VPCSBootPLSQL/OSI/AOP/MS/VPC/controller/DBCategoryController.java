package OSI.AOP.MS.VPC.controller;
import java.util.Map;

import OSI.OPE.OP.SM.AOP.MEC.SIQ.VPC.PP.port.E.RestControllerPortImpl;
import OSI.OPE.OP.SM.AOP.MEC.SIQ.stable.StableData;
import PEU.P.map.*;
public class DBCategoryController {
	public static String exec(String string, Map<String, String> data) 
			throws Exception {
		if(string.equalsIgnoreCase(StableData.REST_GET_DB_CATEGORY)){
			return VtoV.ObjectToJsonString(RestControllerPortImpl
					.getDBCategory(data.get(StableData.DB_BASE_NAME)
					, data.get(StableData.LOGIN_TOKEN),data
					.get(StableData.LOGIN_AUTH)));	
		}
		if(string.equalsIgnoreCase(StableData.REST_GET_ALL_DB_CATEGORY)){
			return VtoV.ObjectToJsonString(RestControllerPortImpl
					.getAllDBCategory(data.get(StableData.LOGIN_TOKEN)
					, data.get(StableData.LOGIN_AUTH)));
		}
		return StableData.STRING_EMPTY;
	}
}