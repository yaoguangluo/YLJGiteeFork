package OSV.VCQ.standard;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Map;

import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.FullDNATokenPDI;
//�з�,˼��,���: ������ 20210504
//@�͸�54����ڵ�����
public class DictionaryStandardDB{	
	public List<String> txtToList() throws IOException{
		List<String> dic_list= new ArrayList<>();
		return dic_list;
	}
	//gg����˼������С��� GG һ��temp ���� ��
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Map<String, Map<String, Object>> dbToMap(String primaryKey, String tabKey) throws IOException{
		Map<String, Object> dic_map= new ConcurrentHashMap<String, Object>();
		Map<String, Map<String, Object>> dbMap= new HashMap<>();
		Map<String, Object> map= DictionaryPLSQLStandardDB.bootORMReadDBInCommonWay(tabKey);
		//Map<String, Object> map= DictionaryPLSQLStandardDB.bootPLSQLReadDBInCommonWay(tabKey);
		ArrayList list= (ArrayList)map.get("obj");
		Iterator<HashMap<String, Object>> iterator= list.iterator();
		Here:
			while(iterator.hasNext()) {
				HashMap<String, Object> hashmap= iterator.next();
				StringBuilder stringBuilder= new StringBuilder();
				if(hashmap.containsKey("rowValue")) {
					HashMap<String, Object> rowValue= (HashMap<String, Object>) hashmap.get("rowValue");
					String keyName= null;
					HashMap<String, Object> temp= (HashMap<String, Object>) rowValue.get(primaryKey);
					keyName= null== temp.get("culumnValue")?"":temp.get("culumnValue").toString().replace("@Tin@", ":").replace("@biky@", ":");
					if(null== keyName) {
						continue Here;
					}
					String stringGG= null== temp.get("culumnValue")? "": temp.get("culumnValue").toString();
					//��Ϊzybc�������Ĵ洢, �����ȼӸ�ע��,�Ժ�����.
					String gg= new FullDNATokenPDI().initonDeSect(stringGG);
					gg= gg.isEmpty()?stringGG.replace("null", ""): gg;//  �������򵥵��Ż�,�Ժ���й淶��OSV.
					keyName= gg.replace("@Tin@", ":").replace("@biky@", ":");
					if(dbMap.containsKey(primaryKey)) {
						//��ȡhashmap �Ӽ�;
						Map<String, Object> hashMap= dbMap.get(primaryKey);
						//hashmap �Ӽ��������
						if(null== hashMap) {
							hashMap= new HashMap<>();	
						}
						hashMap.put(keyName, keyName);
						//hashmap �Ӽ��浵
						dbMap.put(primaryKey, hashMap);
					}else {
						Map<String, Object> hashMap= new HashMap<>();
						hashMap.put(keyName, keyName);
						dbMap.put(primaryKey, hashMap);
					}
					stringBuilder.append(keyName);
					Iterator<String> iterators= rowValue.keySet().iterator();
					while(iterators.hasNext()) {
						String string= iterators.next();//�б���
						if(!string.equalsIgnoreCase(primaryKey)) {
							temp= (HashMap<String, Object>) rowValue.get(string);
							gg= null== temp.get("culumnValue")? "": temp.get("culumnValue").toString();	
							//ȥnull//ȥempty �Ժ�
							try {
								stringGG= new FullDNATokenPDI().initonDeSect(gg.replace("null", ""));
								gg= stringGG.isEmpty()?gg.replace("null", ""): stringGG;//  �������򵥵��Ż�,�Ժ���й淶��OSV.
							}catch(Exception e) {
								e.printStackTrace();
							}
							if(dbMap.containsKey(string)&& null!= dbMap.get(string)) {
								//��ȡhashmap �Ӽ�;
								Map<String, Object> hashMap= dbMap.get(string);
								//hashmap �Ӽ��������
								hashMap.put(keyName, gg.replace("@Tin@", ":").replace("@biky@", ":"));
								//hashmap �Ӽ��浵
								dbMap.put(string, hashMap);
							}else {
								Map<String, Object> hashMap= new HashMap<>();
								hashMap.put(keyName, gg.replace("@Tin@", ":").replace("@biky@", ":"));
								dbMap.put(string, hashMap);
							}
							stringBuilder.append(gg.replace("@Tin@", ":").replace("@biky@", ":"));
						}
					}
					dic_map.put(keyName, stringBuilder.toString().replace("@Tin@", ":").replace("@biky@", ":"));
				}
			}
		dbMap.put("dic_map", dic_map);
		return dbMap;
	}	
}