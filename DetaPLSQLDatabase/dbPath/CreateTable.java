package dbPath;

import org.deta.boot.vpc.controller.RequestFilterController;
import org.deta.vpcs.hall.DatabaseLogHall;

public class CreateTable{
	public static void main(String[] argv) throws Exception {
		//init
		org.plsql.common.utils.DetaUtil.initDB();
		System.out.println("----����VPCS���ݿ������DMAȷ��:�ɹ���");
		RequestFilterController.initBlockList();
		System.out.println("----����VPCS���ݿ������IP���˷�������:�ɹ���");
		org.MS.plsql.cache.DetaDBBufferCacheManager.reflection();
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
			org.ME.plsql.db.plsql.imp.ExecPLSQLImp.ExecPLSQL(plsql, true);
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	}
}