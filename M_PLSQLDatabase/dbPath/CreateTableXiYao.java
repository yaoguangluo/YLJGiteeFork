package dbPath;

import MSV.PCS.C.RequestFilter_C;
import OSI.AOP.MS.VPC.S.hall.DatabaseLogHall;
import VPC.VQS.DSU.utils.DetaUtil;

public class CreateTableXiYao{
	public static void main(String[] argv) throws Exception {
		//init
		DetaUtil.initDB("C:/DBconfig.lyg");
		System.out.println("----德塔VPCS数据库服务器DMA确认:成功！");
		RequestFilter_C.initBlockList();
		System.out.println("----德塔VPCS数据库服务器IP过滤服务启动:成功！");
		MS.OP.SM.AOP.MEC.SIQ.cache.DetaDBBufferCacheManager.reflection();
		System.out.println("----德塔VPCS数据库服务器启动整库过程映射服务:成功！");
		DatabaseLogHall.createBinLogHall();
		System.out.println("----德塔VPCS数据库服务器启动整库过程映射服务:成功！");
		//
		String plsql= "setRoot:C:/DetaDB;";
			   plsql+= "baseName:ZYY;"; 
			   plsql+= "tableName:xybg:create;" + 
			   		"culumnName:pk:ID:string;" + 
			   		"culumnName:uk:打分:string;" + 
			   		"culumnName:uk:西药名:string;" + 
			   		"culumnName:uk:介绍:string;" + 
			   		"culumnName:uk:药理:string;" + 
			   		"culumnName:uk:主要成分:string;" + 
			   		"culumnName:uk:用法:string;" + 
			   		"culumnName:uk:注意事项:string;" + 
			   		"culumnName:uk:适应症:string;" + 
			   		"culumnName:uk:不良反应:string;" + 
			   		"culumnName:uk:用量:string;" + 
			   		"culumnName:uk:药物相互作用:string;" + 
			   		"culumnName:uk:其他:string;"; 

		try {
			ME.SM.OP.SM.AOP.MEC.SIQ.E.E_PLSQL_E.E_PLSQL(plsql, true);
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	}
}