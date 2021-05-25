package ME.APM.VSQ.guJiJingDian;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Map;

import OSI.AOP.MEC.SIQ.plorm.PLORMImpl;
import OSI.AOP.MEC.SIQ.plorm.PLORMInterf;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.FullDNATokenPDI;

public class DictionaryDB{	
	public List<String> txtToList() throws IOException{
		List<String> dic_list= new ArrayList<>();
		return dic_list;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Map<String, String> txtToMap(Map<String, Object> dic_shu_ming, Map<String, Object> dic_duanluo) throws IOException{
		Map<String, String> dic_map= new ConcurrentHashMap<String, String>();
		Map<String, Object> map= null;
		//for(int i=0; i<)
		//		String plsql= "setRoot:C:/DetaDB;" + 
		//				"baseName:ZYY;" + 
		//				"tableName:gjjd:select;" +
		//				"condition:or:ID|<=|3000;";
		//"condition:or:ID|==|2;";
		try {
			PLORMInterf orm= new PLORMImpl();
			map= orm.startAtRootDir("C:/DetaDB1").withBaseName("ZYY")
					.withTableSelect("gjjd").withCondition("or")
					.let("ID").lessThanAndEqualTo("3000")
					.checkAndFixPlsqlGrammarErrors()//׼������plsql orm���� ���﷨��麯�� ���޸�������
					.checkAndFixSystemEnvironmentErrors()//׼������plsql orm���� ��ϵͳ������麯�����޸�������
					.finalExec(true).returnAsMap();
			//map= org.plsql.db.plsql.imp.ExecPLSQLImp.ExecPLSQL(plsql, true);
			//map= org.plsql.db.plsql.imp.ExecPLSQLImp.ExecPLORM(orm, true);
		}catch(Exception e1) {
			//׼��д�ع�
			e1.printStackTrace();
		}
		ArrayList list= (ArrayList)map.get("obj");
		Iterator<HashMap<String, Object>> iterator= list.iterator();
		//int index= 0;
		Here:
			while(iterator.hasNext()) {
				//index++;
				HashMap<String, Object> hashmap= iterator.next();
				StringBuilder stringBuilder= new StringBuilder();
				if(hashmap.containsKey("rowValue")) {
					HashMap<String, Object> rowValue= (HashMap<String, Object>) hashmap.get("rowValue");
					String keyName= null;
					if(rowValue.containsKey("����")) {
						HashMap<String, Object> temp= (HashMap<String, Object>) rowValue.get("����");
						keyName= null== temp.get("culumnValue")?"":temp.get("culumnValue").toString().replace("@Tin@", ":");
						if(null== keyName) {
							continue Here;
						}
						String gg= null== temp.get("culumnValue")?"":temp.get("culumnValue").toString();
						gg= new FullDNATokenPDI().initonDeSect(gg);
						keyName= gg.replace("@Tin@", ":");
						dic_shu_ming.put(keyName,keyName);
						stringBuilder.append(keyName);
					}
					if(rowValue.containsKey("����")) {
						HashMap<String, Object> temp= (HashMap<String, Object>) rowValue.get("����");
						String gg= null== temp.get("culumnValue")?"":temp.get("culumnValue").toString();
						gg= new FullDNATokenPDI().initonDeSect(gg);
						dic_duanluo.put(keyName, gg.replace("@Tin@", ":"));
						stringBuilder.append(gg.replace("@Tin@", ":"));
					}
					dic_map.put(keyName, stringBuilder.toString().replace("@Tin@", ":"));
				}
			}
		return dic_map;
	}	
}