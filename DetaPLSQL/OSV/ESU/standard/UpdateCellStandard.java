package OSV.ESU.standard;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//import OSI.AOP.MEC.SIQ.plorm.PLORMImpl;
//import OSI.AOP.MEC.SIQ.plorm.PLORMInterf;
//OSV PLSQL �з�, ˼��, ���: ������ 20210507
//ѡ��һ��cell ���иı�
public class UpdateCellStandard{	
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
	
	public static Map<String, Object> UpdateCellORM(String tabKey) throws IOException{
		Map<String, Object> map= null;
		try {
//			PLORMInterf orm= new PLORMImpl();
//			map= orm.startAtRootDir("C:/DetaDB1").withBaseName("ZYY")
//					.withTableSelect(tabKey).withCondition("or")
//					.let("ID").lessThanAndEqualTo("3000")
//					.checkAndFixPlsqlGrammarErrors()//׼������plsql orm���� ���﷨��麯�� ���޸�������
//					.checkAndFixSystemEnvironmentErrors()//׼������plsql orm���� ��ϵͳ������麯�����޸�������
//					.finalExec(true).returnAsMap();
			//map= org.plsql.db.plsql.imp.ExecPLSQLImp.ExecPLORM(orm, true);
		}catch(Exception e1) {
			//׼��д�ع�
			e1.printStackTrace();
		}
		return map;
	}	
	
	public static Map<String, Object> UpdateCellPLSQL(String tabKey) throws IOException{
		Map<String, Object> map= null;
		try {
//			String plsql= "setRoot:C:/DetaDB1;" + 
//					"baseName:ZYY;" + 
//					"tableName:"+ tabKey +":select;" +
//					"condition:or:ID|<=|3000;";
//			map= OSI.OPE.ME.SM.OP.SM.AOP.MEC.SIQ.imp.ExecPLSQLImp.ExecPLSQL(plsql, true);
		}catch(Exception e1) {
			//׼��д�ع�
			e1.printStackTrace();
		}
		return map;
	}	
}