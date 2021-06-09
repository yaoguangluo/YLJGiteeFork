package ME.APM.VSQ.xiYiYaoCai;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import OSI.AOP.MEC.SIQ.plorm.PLORMImpl;
import OSI.AOP.MEC.SIQ.plorm.PLORMInterf;
@SuppressWarnings("unused")
public class DictionaryFromDB{	
//	public List<String> dic_list;
//	public Map<String,Object> dic_map;
//	public Map<String,Object> dic_li;
//	public Map<String,Object> dic_hai;
//	public Map<String,Object> dic_xz;
//	public Map<String,Object> dic_xw;
//	public Map<String,Object> dic_jm;
//	public Map<String,Object> dic_ya;
//	public Map<String,Object> dic_cy;
//	public Map<String,Object> dic_cj;
//	public Map<String,Object> dic_jj;
//	public Map<String,Object> dic_zf;
	public List<String> txtToList() throws IOException{
		List<String> dic_list= new ArrayList<>();
		return dic_list;
	}
	
//	@SuppressWarnings({"unchecked", "rawtypes", "unused"})
	public Map<String, Object> listToMap(List<String> dic_list) throws IOException{
		Map<String, Object> dic_map= new ConcurrentHashMap<String, Object>();
		Map<String, Object> map= null;
		//for(int i=0; i<)
		String plsql= "setRoot:C:/DetaDB;" + 
				"baseName:ZYY;" + 
				"tableName:xybg:select;" +
				"condition:or:ID|<=|3000;";
				//"condition:or:ID|==|2;";
		try {
//			Select orm= new Select().startAtRootDir("C:/DetaDB").withBaseName("ZYY")
//					.withTableSelect("xybg").withCondition("or", "ID|<=|3000");
			//map= org.plsql.db.plsql.imp.E_PLSQLImp.E_PLSQL(plsql, true);
		//	map= org.plsql.db.plsql.imp.E_PLSQLImp.E_PLORM(orm, true);
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	//	ArrayList list= (ArrayList) map.get("obj");
//		Iterator<HashMap<String, Object>> iterator= list.iterator();
		return map;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void txtToMap(Map<String, Object> dic_yao_ming, Map<String, Object> dic_chengfen_danwei,
			Map<String, Object> dic_yong_fa, Map<String, Object> dic_yao_li, Map<String, Object> dic_zhu_yi,
Map<String, Object> dic_shi_ying, Map<String, Object> dic_bu_liang_fan_ying, Map<String, Object> dic_yao_wu_xiang_hu_zuo_yong,
Map<String, Object> dic_qi_ta, Map<String, Object> dic_yong_liang, Map<String, Object> dic_jie_shao) throws IOException{
		Map<String, Object> dic_map= new ConcurrentHashMap<String, Object>();
		Map<String, Object> map= null;
		//for(int i=0; i<)
		String plsql= "setRoot:C:/DetaDB;" + 
				"baseName:ZYY;" + 
				"tableName:xybg:select;" +
				"condition:or:ID|<=|3000;";
				//"condition:or:ID|==|2;";
		try {
			PLORMInterf orm= new PLORMImpl();
			map= orm.startAtRootDir("C:/DetaDB").withBaseName("ZYY")
					.withTableSelect("xybg").withCondition("or")
					.let("ID").lessThanAndEqualTo("3000")
					.checkAndFixPlsqlGrammarErrors()//׼������plsql orm���� ���﷨��麯�� ���޸�������
					.checkAndFixSystemEnvironmentErrors()//׼������plsql orm���� ��ϵͳ������麯�����޸�������
					.finalE(true).returnAsMap();
			//map= org.plsql.db.plsql.imp.E_PLSQLImp.E_PLSQL(plsql, true);
			//map= org.plsql.db.plsql.imp.E_PLSQLImp.E_PLORM(orm, true);
		}catch(Exception e1) {
			//׼��д�ع�
			e1.printStackTrace();
		}
		ArrayList list= (ArrayList) map.get("obj");
		Iterator<HashMap<String, Object>> iterator= list.iterator();
		while(iterator.hasNext()) {
			HashMap<String, Object> hashmap= iterator.next();
			StringBuilder stringBuilder= new StringBuilder();
			if(hashmap.containsKey("rowValue")) {
				HashMap<String, Object> rowValue= (HashMap<String, Object>) hashmap.get("rowValue");
				String keyName= null;
				if(rowValue.containsKey("��ҩ��")) {
					HashMap<String, Object> temp= (HashMap<String, Object>) rowValue.get("��ҩ��");
					keyName= temp.get("culumnValue").toString().replace("@biky@", ":");
					dic_yao_ming.put(keyName, null== temp.get("culumnValue")?"":temp.get("culumnValue").toString().replace("@biky@", ":"));
					stringBuilder.append(temp.get("culumnValue").toString());
				}
				if(rowValue.containsKey("����")) {
					HashMap<String, Object> temp= (HashMap<String, Object>) rowValue.get("����");
					dic_jie_shao.put(keyName, null== temp.get("culumnValue")?"":temp.get("culumnValue").toString().replace("@biky@", ":"));
					stringBuilder.append(temp.get("culumnValue").toString());
				}
				if(rowValue.containsKey("ҩ��")) {
					HashMap<String, Object> temp= (HashMap<String, Object>) rowValue.get("ҩ��");
					dic_yao_li.put(keyName, null== temp.get("culumnValue")?"":temp.get("culumnValue").toString().replace("@biky@", ":"));
					stringBuilder.append(temp.get("culumnValue").toString());
				}
				if(rowValue.containsKey("��Ҫ�ɷ�")) {
					HashMap<String, Object> temp= (HashMap<String, Object>) rowValue.get("��Ҫ�ɷ�");
					dic_chengfen_danwei.put(keyName, null== temp.get("culumnValue")?"":temp.get("culumnValue").toString().replace("@biky@", ":"));
					stringBuilder.append(temp.get("culumnValue").toString());
				}
				if(rowValue.containsKey("�÷�")) {
					HashMap<String, Object> temp= (HashMap<String, Object>) rowValue.get("�÷�");
					dic_yong_fa.put(keyName, null== temp.get("culumnValue")?"":temp.get("culumnValue").toString().replace("@biky@", ":"));
					stringBuilder.append(temp.get("culumnValue").toString());
				}
				if(rowValue.containsKey("ע������")) {
					HashMap<String, Object> temp= (HashMap<String, Object>) rowValue.get("ע������");
					dic_zhu_yi.put(keyName, null== temp.get("culumnValue")?"":temp.get("culumnValue").toString().replace("@biky@", ":"));
					stringBuilder.append(temp.get("culumnValue").toString());
				}
				if(rowValue.containsKey("��Ӧ֢")) {
					HashMap<String, Object> temp= (HashMap<String, Object>) rowValue.get("��Ӧ֢");
					dic_shi_ying.put(keyName, null== temp.get("culumnValue")?"":temp.get("culumnValue").toString().replace("@biky@", ":"));
					stringBuilder.append(temp.get("culumnValue").toString());
				}
				if(rowValue.containsKey("������Ӧ")) {
					HashMap<String, Object> temp= (HashMap<String, Object>) rowValue.get("������Ӧ");
					dic_bu_liang_fan_ying.put(keyName, null== temp.get("culumnValue")?"":temp.get("culumnValue").toString().replace("@biky@", ":"));
					stringBuilder.append(temp.get("culumnValue").toString());
				}
				if(rowValue.containsKey("����")) {
					HashMap<String, Object> temp= (HashMap<String, Object>) rowValue.get("����");
					dic_yong_liang.put(keyName, null== temp.get("culumnValue")?"":temp.get("culumnValue").toString().replace("@biky@", ":"));
					stringBuilder.append(temp.get("culumnValue").toString());
				}
				if(rowValue.containsKey("ҩ���໥����")) {
					HashMap<String, Object> temp= (HashMap<String, Object>) rowValue.get("ҩ���໥����");
					dic_yao_wu_xiang_hu_zuo_yong.put(keyName, null== temp.get("culumnValue")?"":temp.get("culumnValue").toString().replace("@biky@", ":"));
					stringBuilder.append(temp.get("culumnValue").toString());
				}
				if(rowValue.containsKey("����")) {
					HashMap<String, Object> temp= (HashMap<String, Object>) rowValue.get("����");
					dic_qi_ta.put(keyName, null== temp.get("culumnValue")?"":temp.get("culumnValue").toString().replace("@biky@", ":"));
					stringBuilder.append(temp.get("culumnValue").toString());
				}
				dic_map.put(keyName, stringBuilder.toString().replace("@biky@", ":"));
			}
		}
	//	return dic_map;
	}	
}