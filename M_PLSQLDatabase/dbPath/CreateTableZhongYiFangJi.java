package dbPath;

import MSV.PCS.C.RequestFilter_C;
import OSI.AOP.MS.VPC.S.hall.DatabaseLogHall;
import VPC.VQS.DSU.utils.DetaDBUtil;
import VPC.VQS.DSU.utils.DetaUtil;

public class CreateTableZhongYiFangJi{
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
		DetaDBUtil.initCulumnNameType();
		//
		String plsql= "setRoot:C:/DetaDB1;";
			   plsql+= "baseName:ZYY;"; 
			   plsql+= "tableName:zyfj:create;"+ 
			   		"culumnName:pk:ID:string;"+ 
			   		"culumnName:uk:打分:string;"+ 
			   		"culumnName:uk:病症药名:string;"+ 
			   		"culumnName:uk:用药参考:string;"+ 
			   		"culumnName:uk:成人处方:string;"+ 
			   		"culumnName:uk:脉症:string;"+ 
			   		"culumnName:uk:制法:string;"+ 
			   		"culumnName:uk:应用:string;"+ 
			   		"culumnName:uk:使用:string;"+ 
			   		"culumnName:uk:讨论:string;"+ 
			   		"culumnName:uk:附方:string;"+ 
			   		"culumnName:uk:方歌:string;";
		try {
			ME.SM.OP.SM.AOP.MEC.SIQ.E.E_PLSQL_E.E_PLSQL(plsql, true);
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	}
}