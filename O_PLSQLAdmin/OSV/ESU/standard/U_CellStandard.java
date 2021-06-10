package OSV.ESU.standard;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import OSI.AOP.MEC.SIQ.plorm.PLORMImpl;
import OSI.AOP.MEC.SIQ.plorm.PLORMInterf;
//OSV PLSQL �з�, ˼��, ���: ������ 20210507
//ѡ��һ��cell ���иı�
public class U_CellStandard{	
	public List<String> txtToList() throws IOException{
		List<String> dic_list= new ArrayList<>();
		return dic_list;
	}

	//  �Ժ��һ���������2��ģʽ���ORM UNSQL, �����Ǻܺ�д, ��������˼�� or and ̫�� ��ô���й淶����..
	//  �ҵĶ����ܼ�, �������ƾ����ݱ����ֱ�����ݿ�����޸�.
	//  ��DNA����������һ�� 308ҳ
	//	update samples 
	//	tableName:test:update; 
	//	condition:or:testCulumn1|<|20:testCulumn2|==|fire; 
	//	condition:and:testCulumn1|>|100:testCulumn2|==|fire;
	//	culumnValue:date0:19850525;
	//	culumnValue:date1:19850526;
	//	
	//	update samples tableName:test:update; 
	//	condition:or:testCulumn1|<|20:testCulumn2|==|fire;
	//	condition:and:testCulumn1|>|100:testCulumn2|==|fire;
	//	join:backend:utest;
	//	condition:and:uCulumn3|<|20; 
	//	relation:and:testCulumn1|==|uCulumn1:testCulumn2|!=|uCulumn2; 
	//	culumnValue:date0:19850525;
	//	culumnValue:date1:19850526;

	public static Map<String, Object> UpdateCellORM(String tabKey, String rowId, String cellName
			, String cellValue) throws IOException{
		Map<String, Object> map= null;
		try {
			PLORMInterf orm= new PLORMImpl();
			orm.startAtRootDir("C:/DetaDB1").withBaseName("ZYY")
			.withTableUpdate(tabKey).withCondition("or")
			.let("ID").equalTo(rowId)
			.checkAndFixPlsqlGrammarErrors()//׼������plsql orm���� ���﷨��麯�� ���޸�������
			.checkAndFixSystemEnvironmentErrors()//׼������plsql orm���� ��ϵͳ������麯�����޸�������
			.withCulumnValue(cellName, cellValue)
			.finalE(true);
			//map= org.plsql.db.plsql.imp.E_PLSQLImp.E_PLORM(orm, true);
		}catch(Exception e1) {
			//׼��д�ع�
			e1.printStackTrace();
		}
		return map;
	}	

	public static Map<String, Object> UpdateCellORMByRowId(String rootPath, String baseName, boolean unTest
			, String tabKey, String rowId, String cellName, String cellValue) throws IOException{
		Map<String, Object> map= null;
		try {
			PLORMInterf orm= new PLORMImpl();
			orm.startAtRootDir(rootPath).withBaseName(baseName)
			.withTableUpdate(tabKey).withCondition("or")
			.let("ID").equalTo(rowId)
			.checkAndFixPlsqlGrammarErrors()//׼������plsql orm���� ���﷨��麯�� ���޸�������
			.checkAndFixSystemEnvironmentErrors()//׼������plsql orm���� ��ϵͳ������麯�����޸�������
			.withCulumnValue(cellName, cellValue)
			.finalE(unTest);
			//map= org.plsql.db.plsql.imp.E_PLSQLImp.E_PLORM(orm, true);
		}catch(Exception e1) {
			//׼��д�ع�
			e1.printStackTrace();
		}
		return map;
	}	

	public static Map<String, Object> UpdateCellORMByEquals(String rootPath, String baseName
			, boolean unTest, String tabKey, String conditionSubject, String conditionObject
			, String cellName, String cellValue) throws IOException{
		Map<String, Object> map= null;
		try {
			PLORMInterf orm= new PLORMImpl();
			orm.startAtRootDir(rootPath).withBaseName(baseName)
			.withTableUpdate(tabKey).withCondition("or")
			.let(conditionSubject).equalTo(conditionObject)
			.checkAndFixPlsqlGrammarErrors()//׼������plsql orm���� ���﷨��麯�� ���޸�������
			.checkAndFixSystemEnvironmentErrors()//׼������plsql orm���� ��ϵͳ������麯�����޸�������
			.withCulumnValue(cellName, cellValue)
			.finalE(unTest);
			//map= org.plsql.db.plsql.imp.E_PLSQLImp.E_PLORM(orm, true);
		}catch(Exception e1) {
			//׼��д�ع�
			e1.printStackTrace();
		}
		return map;
	}	

	//	update samples tableName:test:update; 
	//	condition:or:testCulumn1|<|20:testCulumn2|==|fire;
	//	condition:and:testCulumn1|>|100:testCulumn2|==|fire;
	//	join:backend:utest;
	//	condition:and:uCulumn3|<|20; 
	//	relation:and:testCulumn1|==|uCulumn1:testCulumn2|!=|uCulumn2; 
	//	culumnValue:date0:19850525;
	//	culumnValue:date1:19850526;


	//	String plsql= "setRoot:C:/DetaDB1;" + 
	//	"baseName:ZYY;" + 
	//	"tableName:"+ tabKey+ ":update;" +
	//	"condition:or:ID|==|rowId;" +
	//	"culumnValue:cellName:cellValue;";
	//
	//  condition:"���ƺ�û�����rowid culumnid������ѡ�� ����,�Ժ󲹳���":19850526;
	//  condition ������uid in ���� uid== ��ʵ��.�����ᵼ�¼������,���� ���rowid culumnid�����ֱȽ�ѡ�����б�Ҫ��.

	public static Map<String, Object> UpdateCellPLSQL(String tabKey, String rowId, String cellName
			, String cellValue) throws IOException{
		Map<String, Object> map= null;
		try {
			String plsql= "setRoot:C:/DetaDB1;" + 
					"baseName:ZYY;" + 
					"tableName:"+ tabKey+ ":update;" +
					"condition:or:ID|==|"+ rowId+ ";" +
					"culumnValue:"+cellName+ ":"+ cellValue+ ";";
			map= ME.SM.OP.SM.AOP.MEC.SIQ.E.E_PLSQL_E.E_PLSQL(plsql, true);
		}catch(Exception e1) {
			//׼��д�ع�
			e1.printStackTrace();
		}
		return map;
	}	
}