package OSV.VCQ.standard;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import OSI.AOP.MEC.SIQ.plorm.PLORMImpl;
import OSI.AOP.MEC.SIQ.plorm.PLORMInterf;
//OSV PLSQL �з�, ˼��, ���: ������ 20210506
public class DictionaryPLSQLStandardDB{	
	public List<String> txtToList() throws IOException{
		List<String> dic_list= new ArrayList<>();
		return dic_list;
	}

	public static Map<String, Object> bootORMReadDBInCommonWay(String tabKey) throws IOException{
		Map<String, Object> map= null;
		try {
			PLORMInterf orm= new PLORMImpl();
			map= orm.startAtRootDir("C:/DetaDB1").withBaseName("ZYY")
					.withTableSelect(tabKey).withCondition("or")
					.let("ID").lessThanAndEqualTo("3000")
					.checkAndFixPlsqlGrammarErrors()//׼������plsql orm���� ���﷨��麯�� ���޸�������
					.checkAndFixSystemEnvironmentErrors()//׼������plsql orm���� ��ϵͳ������麯�����޸�������
					.finalExec(true).returnAsMap();
			//map= org.plsql.db.plsql.imp.ExecPLSQLImp.ExecPLORM(orm, true);
		}catch(Exception e1) {
			//׼��д�ع�
			e1.printStackTrace();
		}
		return map;
	}	

	public static Map<String, Object> bootORMReadDBByRangeRowID(String rootPath, String baseName, boolean unTest
			, String tabKey, String RangeRowIDCount) throws IOException{
		Map<String, Object> map= null;
		try {
			PLORMInterf orm= new PLORMImpl();
			map= orm.startAtRootDir(rootPath).withBaseName(baseName)
					.withTableSelect(tabKey).withCondition("or")
					.let("ID").lessThanAndEqualTo(RangeRowIDCount)
					.checkAndFixPlsqlGrammarErrors()//׼������plsql orm���� ���﷨��麯�� ���޸�������
					.checkAndFixSystemEnvironmentErrors()//׼������plsql orm���� ��ϵͳ������麯�����޸�������
					.finalExec(unTest).returnAsMap();
			//map= org.plsql.db.plsql.imp.ExecPLSQLImp.ExecPLORM(orm, true);
		}catch(Exception e1) {
			//׼��д�ع�
			e1.printStackTrace();
		}
		return map;
	}	


	public static Map<String, Object> bootPLSQLReadDBInCommonWay(String tabKey) throws IOException{
		Map<String, Object> map= null;
		try {
			String plsql= "setRoot:C:/DetaDB1;" + 
					"baseName:ZYY;" + 
					"tableName:"+ tabKey +":select;" +
					"condition:or:ID|<=|3000;";
			map= OSI.OPE.ME.SM.OP.SM.AOP.MEC.SIQ.imp.ExecPLSQLImp.ExecPLSQL(plsql, true);
		}catch(Exception e1) {
			//׼��д�ع�
			e1.printStackTrace();
		}
		return map;
	}	
}