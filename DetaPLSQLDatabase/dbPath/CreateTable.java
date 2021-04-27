package dbPath;

import OSI.OPE.MSV.PCS.controller.RequestFilterController;
import OSI.OPE.VPC.VQS.DSU.utils.DetaUtil;
import OSI.OSU.MS.VPC.S.hall.DatabaseLogHall;

public class CreateTable{
	public static void main(String[] argv) throws Exception {
		//init
		DetaUtil.initDB();
		System.out.println("----����VPCS���ݿ������DMAȷ��:�ɹ���");
		RequestFilterController.initBlockList();
		System.out.println("----����VPCS���ݿ������IP���˷�������:�ɹ���");
		OSI.OSU.MS.OP.SM.AOP.MEC.SIQ.cache.DetaDBBufferCacheManager.reflection();
		System.out.println("----����VPCS���ݿ�����������������ӳ�����:�ɹ���");
		DatabaseLogHall.createBinLogHall();
		System.out.println("----����VPCS���ݿ�����������������ӳ�����:�ɹ���");
		//
		String plsql= "setRoot:C:/DetaDB;";
			   plsql+= "baseName:ZYY;"; 
			   plsql+= "tableName:zybc:create;" + 
			   		"culumnName:pk:ID:string;" + 
			   		"culumnName:uk:���:string;" + 
			   		"culumnName:uk:��ҩ����:string;" + 
			   		"culumnName:uk:�ʼ�ԭ��:string;" + 
			   		"culumnName:uk:��Ч:string;" + 
			   		"culumnName:uk:���չ��:string;" + 
			   		"culumnName:uk:����:string;" + 
			   		"culumnName:uk:��ζ:string;" + 
			   		"culumnName:uk:����:string;" + 
			   		"culumnName:uk:��ҽ��ҩ��:string;" + 
			   		"culumnName:uk:����:string;" + 
			   		"culumnName:uk:��Դ:string;" + 
			   		"culumnName:uk:�ް�:string;" + 
			   		"culumnName:uk:����:string;" + 
			   		"culumnName:uk:����ҩ:string;";
		try {
			OSI.OSU.ME.SM.OP.SM.AOP.MEC.SIQ.imp.ExecPLSQLImp.ExecPLSQL(plsql, true);
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	}
}