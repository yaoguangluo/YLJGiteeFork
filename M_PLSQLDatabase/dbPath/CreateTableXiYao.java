package dbPath;

import OSI.AOP.MS.VPC.S.hall.DatabaseLogHall;
import OSI.OPE.MSV.PCS.C.RequestFilter_C;
import OSI.OPE.VPC.VQS.DSU.utils.DetaUtil;

public class CreateTableXiYao{
	public static void main(String[] argv) throws Exception {
		//init
		DetaUtil.initDB("C:/DBconfig.lyg");
		System.out.println("----����VPCS���ݿ������DMAȷ��:�ɹ���");
		RequestFilter_C.initBlockList();
		System.out.println("----����VPCS���ݿ������IP���˷�������:�ɹ���");
		OSI.OPE.MS.OP.SM.AOP.MEC.SIQ.cache.DetaDBBufferCacheManager.reflection();
		System.out.println("----����VPCS���ݿ�����������������ӳ�����:�ɹ���");
		DatabaseLogHall.createBinLogHall();
		System.out.println("----����VPCS���ݿ�����������������ӳ�����:�ɹ���");
		//
		String plsql= "setRoot:C:/DetaDB;";
			   plsql+= "baseName:ZYY;"; 
			   plsql+= "tableName:xybg:create;" + 
			   		"culumnName:pk:ID:string;" + 
			   		"culumnName:uk:���:string;" + 
			   		"culumnName:uk:��ҩ��:string;" + 
			   		"culumnName:uk:����:string;" + 
			   		"culumnName:uk:ҩ��:string;" + 
			   		"culumnName:uk:��Ҫ�ɷ�:string;" + 
			   		"culumnName:uk:�÷�:string;" + 
			   		"culumnName:uk:ע������:string;" + 
			   		"culumnName:uk:��Ӧ֢:string;" + 
			   		"culumnName:uk:������Ӧ:string;" + 
			   		"culumnName:uk:����:string;" + 
			   		"culumnName:uk:ҩ���໥����:string;" + 
			   		"culumnName:uk:����:string;"; 

		try {
			OSI.OPE.ME.SM.OP.SM.AOP.MEC.SIQ.E.E_PLSQLImp.E_PLSQL(plsql, true);
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	}
}