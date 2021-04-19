package dbPath;

import org.MS.boot.vpc.controller.RequestFilterController;
import org.MS.vpcs.hall.DatabaseLogHall;

public class CreateTableXiYao{
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
			org.ME.plsql.db.plsql.imp.ExecPLSQLImp.ExecPLSQL(plsql, true);
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	}
}