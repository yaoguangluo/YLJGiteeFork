package dbPath;

import OSI.AOP.MS.VPC.S.hall.DatabaseLogHall;
import OSI.OPE.MSV.PCS.controller.RequestFilterController;
import OSI.OPE.VPC.VQS.DSU.utils.DetaDBUtil;
import OSI.OPE.VPC.VQS.DSU.utils.DetaUtil;

public class CreateTableZhongYiShengZhi{
	public static void main(String[] argv) throws Exception {
		//init
		DetaUtil.initDB();
		System.out.println("----����VPCS���ݿ������DMAȷ��:�ɹ���");
		RequestFilterController.initBlockList();
		System.out.println("----����VPCS���ݿ������IP���˷�������:�ɹ���");
		OSI.OPE.MS.OP.SM.AOP.MEC.SIQ.cache.DetaDBBufferCacheManager.reflection();
		System.out.println("----����VPCS���ݿ�����������������ӳ�����:�ɹ���");
		DatabaseLogHall.createBinLogHall();
		System.out.println("----����VPCS���ݿ�����������������ӳ�����:�ɹ���");
		DetaDBUtil.initCulumnNameType();
		//
		String plsql= "setRoot:C:/DetaDB1;";
			   plsql+= "baseName:ZYY;"; 
			   plsql+= "tableName:zysz:create;"+ 
			   		"culumnName:pk:ID:string;"+ 
			   		"culumnName:uk:���:string;"+ 
			   		"culumnName:uk:����:string;"+ 
			   		"culumnName:uk:��ҩ:string;";
		try {
			OSI.OPE.ME.SM.OP.SM.AOP.MEC.SIQ.imp.ExecPLSQLImp.ExecPLSQL(plsql, true);
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	}
}