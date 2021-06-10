package MSQ.OP.SM.AOP.MEC.SIQ.SM.OSQ.E;

import java.io.BufferedInputStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import ME.SM.OP.SM.AOP.MEC.SIQ.E.P_AggregationPLSQL;
import ME.SM.OP.SM.AOP.MEC.SIQ.E.P_ConditionPLSQL;
import ME.SM.OP.SM.AOP.MEC.SIQ.E.P_GetCulumnsPLSQL;
import MS.OP.SM.AOP.MEC.SIQ.cache.DetaDBBufferCacheManager;
import OP.SM.AOP.MEC.SIQ.SM.reflection.Spec;
import PEU.P.cache.*;
@SuppressWarnings({ "unused", "unchecked" })
public class Q_Rows_E {
	public static List<Map<String, Object>> selectRowsByAttribute(String currentDB
			, String tableName, String culmnName, Object value) throws IOException{
		if(value==null) {
			value="";
		}
		String objectType = "";
		List<Map<String, Object>> output = new ArrayList<>();
		//�������ݿ�
		String DBPath = CacheManager.getCacheInfo("DBPath").getValue().toString() + "/" + currentDB;
		//������
		File fileDBPath = new File(DBPath);
		if (fileDBPath.isDirectory()) {
			String DBTablePath = DBPath + "/" + tableName;
			File fileDBTable = new File(DBTablePath);
			if (fileDBTable.isDirectory()) {
				String DBTableCulumnPath = DBTablePath + "/spec/" + culmnName;
				File fileDBTableCulumn = new File(DBTableCulumnPath);
				if (fileDBTableCulumn.isDirectory()) {
					//��ȡ�����ݸ�ʽ
					String[] fileList = fileDBTableCulumn.list();
					File readDBTableSpecCulumnFile = new File(DBTableCulumnPath + "/" + fileList[0]);
					BufferedReader reader = new BufferedReader(new FileReader(readDBTableSpecCulumnFile));  
					String tempString = null;
					while ((tempString = reader.readLine()) != null) {  
						objectType = tempString;			
					}
					reader.close();
					if(objectType.contains("string")) {
						String DBTableRowsPath = DBTablePath + "/rows";	
						File fileDBTableRowsPath = new File(DBTableRowsPath);
						if (fileDBTableRowsPath.isDirectory()) {
							String[] rowList = fileDBTableRowsPath.list();
							NextRow:
								for(String row: rowList) {
									Map<String, Object> rowMap = new HashMap<>();
									String DBTableRowIndexPath = DBTablePath + "/rows/" + row;	
									File readDBTableRowIndexFile = new File(DBTableRowIndexPath);
									if (readDBTableRowIndexFile.isDirectory()) {	
										String isDelete = DBTableRowIndexPath + "/is_delete_1" ;	
										File isDeleteFile = new File(isDelete);
										if(isDeleteFile.exists()) {
											continue NextRow;
										}
										String DBTableRowIndexCulumnPath = DBTableRowIndexPath + "/" + culmnName;	
										File readDBTableRowIndexCulumnFile = new File(DBTableRowIndexCulumnPath);
										if (readDBTableRowIndexCulumnFile.isDirectory()) {
											reader = new BufferedReader(new FileReader(readDBTableRowIndexCulumnFile + "/" + "value.lyg"));  
											String temp="";
											while ((tempString = reader.readLine()) != null) {
												temp += tempString;
											}
											reader.close();
											if(temp.equalsIgnoreCase(value.toString())) {
												String[] culumnList = readDBTableRowIndexFile.list();
												NextFile:
													for(String culumn: culumnList) {
														if(culumn.contains("is_delete")) {
															continue NextFile;
														}
														String DBTableCulumnIndexPath = DBTableRowIndexPath + "/" + culumn;	
														File readDBTableCulumnIndexPathFile 
														= new File(DBTableCulumnIndexPath);
														if (readDBTableRowIndexCulumnFile.isDirectory()) {
															reader = new BufferedReader(
																	new FileReader(readDBTableCulumnIndexPathFile + "/" + "value.lyg"));  
															temp="";
															while ((tempString = reader.readLine()) != null) {
																temp += tempString;
															}
															reader.close();
															rowMap.put(culumn, temp);
														}else {
															rowMap.put(culumn, null);
														}
													}
												output.add(rowMap);
											}
										}
									}
								} 
						}
					}
				}
			}
		}
		return output;
	}
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		try {
			new Q_Rows_E().selectRowsByAttribute("backend", "login"
					, "usr_name", "yaoguangluo");
			// deletefile("D:/file");
		} catch (FileNotFoundException ex) {
		} catch (IOException ex) {
		}
		System.out.println("ok");
	}

	public static Map<String, Object> selectRowsByTablePath(String tablePath, String pageBegin
			, String pageEnd, String direction) throws IOException {
		Map<String, Object> output = new HashMap<>();
		int totalPages = 0;
		output.put("tablePath", tablePath);
		int rowBeginIndex = Integer.valueOf(pageBegin);
		int rowEndIndex = Integer.valueOf(pageEnd);
		String objectType = "";
		List<Object> rowMapList = new ArrayList<>();
		File fileDBTable = new File(tablePath);
		if (fileDBTable.isDirectory()) {
			String DBTableRowsPath = tablePath + "/rows";	
			File fileDBTableRowsPath = new File(DBTableRowsPath);
			if (fileDBTableRowsPath.isDirectory()) {
				File[] files = fileDBTableRowsPath.listFiles();
				totalPages = files.length;
				int i = 0;
				int index = 0;
				Here:
					while(i<15) {
						String DBTableRowIndexPath = DBTableRowsPath + "/row" + (direction.contains("next")? rowEndIndex++: --rowBeginIndex);	
						File readDBTableRowIndexFile = new File(DBTableRowIndexPath);
						if (!readDBTableRowIndexFile.exists()) {
							break;
						}
						File deleteTest = new File(DBTableRowIndexPath + "/is_delete_1");
						if (deleteTest.exists()) {
							continue Here;
						}
						i++;
						Map<String, Object> rowMap = new HashMap<>();
						String[] readDBTableRowCulumnsIndexFile = readDBTableRowIndexFile.list();
						Map<String, Object> culumnMaps = new HashMap<>();
						NextFile:
							for(String readDBTableRowCulumnIndexFile: readDBTableRowCulumnsIndexFile) {
								if(readDBTableRowCulumnIndexFile.contains("is_delete")) {
									continue NextFile;
								}
								Map<String, Object> culumnMap = new HashMap<>();
								String DBTableRowIndexCulumnPath = DBTableRowIndexPath + "/" + readDBTableRowCulumnIndexFile;	
								File readDBTableRowIndexCulumnFile = new File(DBTableRowIndexCulumnPath);
								if (readDBTableRowIndexCulumnFile.exists()) {
									String temp = "";
									FileInputStream fis = new FileInputStream(new File(DBTableRowIndexCulumnPath + "/value.lyg"));
									BufferedInputStream bis = new BufferedInputStream(fis);
									byte[] buffer = new byte[1024];
									int cnt;
									while((cnt = bis.read(buffer)) != -1) {
										temp += new String(buffer, 0, cnt);
									}
									fis.close();
									bis.close(); 
									culumnMap.put("culumnName", readDBTableRowCulumnIndexFile);
									culumnMap.put("culumnValue", temp);
									culumnMaps.put(readDBTableRowCulumnIndexFile, culumnMap);
								}
							} 
						rowMap.put("rowValue", culumnMaps);
						if(direction.contains("next")) {
							rowMap.put("rowIndex", rowEndIndex-1);
							rowMapList.add(rowMap);
						}else {
							rowMap.put("rowIndex", rowBeginIndex);
							rowMapList.add(0, rowMap);
						}
					}
			}
		}
		if(direction.contains("next")) {
			output.put("pageBegin", Integer.valueOf(pageEnd));
			output.put("pageEnd", rowEndIndex);
			output.put("totalPages", totalPages);
		}else {
			output.put("pageBegin", rowBeginIndex);
			output.put("pageEnd", Integer.valueOf(pageBegin));
			output.put("totalPages", totalPages);
		}
		output.put("obj", rowMapList);
		List<Object> spec= new ArrayList<>();
		Map<String, Object> row = (Map<String, Object>) rowMapList.get(0);
		Map<String, Object> culumns = (Map<String, Object>) row.get("rowValue");

		Iterator<String> it=culumns.keySet().iterator();
		while(it.hasNext()) {
			spec.add(((Map<String, Object>)culumns.get(it.next())).get("culumnName").toString());
		}
		output.put("spec", spec);
		return output;
	}

	//��Ϊ����id�Ĳ���, ���쿪ʼ������Ӧ��debug��֤  ������20210405
	public static Object selectRowsByAttributesOfCondition(Map<String, Object> object) throws IOException {
		if(!object.containsKey("recordRows")) {
			Map<String, Boolean> recordRows = new ConcurrentHashMap<>();
			object.put("recordRows", recordRows);
		}
		Spec spec = new Spec();
		spec.setCulumnTypes(new ConcurrentHashMap<String, String>());
		String objectType = "";
		List<Map<String, Object>> output = new ArrayList<>();
		//�������ݿ�
		String DBPath = CacheManager.getCacheInfo("DBPath").getValue().toString() + "/" 
		+ object.get("baseName").toString();
		//������
		File fileDBPath = new File(DBPath);
		if (fileDBPath.isDirectory()) {
			String DBTablePath = DBPath + "/" + object.get("tableName").toString();
			File fileDBTable = new File(DBTablePath);
			if (fileDBTable.isDirectory()) {
				String DBTableCulumnPath = DBTablePath + "/spec";
				File fileDBTableCulumn = new File(DBTableCulumnPath);
				if (fileDBTableCulumn.isDirectory()) {
					//��ȡ�����ݸ�ʽ
					String[] fileList = fileDBTableCulumn.list();
					for(int i=0; i<fileList.length; i++) {
						File readDBTableSpecCulumnFile = new File(DBTableCulumnPath + "/" 
					+ fileList[0]+"/value.lyg");
						BufferedReader reader = new BufferedReader(new FileReader(readDBTableSpecCulumnFile));  
						String tempString = null;
						while ((tempString = reader.readLine()) != null) {  
							objectType = tempString;			
						}
						reader.close();
						spec.setCulumnType(fileList[i], objectType);
					}
					List<String[]> conditionValues = (List<String[]>) object.get("condition");
					Iterator<String[]> iterator = conditionValues.iterator();
					while(iterator.hasNext()) {
						boolean overMap = output.size() == 0? false: true;
						String[] conditionValueArray = iterator.next();
						String type = conditionValueArray[1];
						boolean andMap = type.equalsIgnoreCase("and")?true:false;
						for(int i = 2; i < conditionValueArray.length; i++) {
							String[] sets = conditionValueArray[i].split("\\|");
							if(overMap&& andMap) {
								P_ConditionPLSQL.P_Map(sets, output, DBTablePath);//1
							}else if(DetaDBBufferCacheManager.dbCache){
								P_ConditionPLSQL.P_Cache(sets, output, object.get("tableName").toString()
										, object.get("baseName").toString(), object);//1
							}else {
								//DMA�ı����, �ҵ���ͬ����������,2��ı�д����ȫ��˷Դ. 20210405 ��è�� ������.
								P_ConditionPLSQL.P_Table(sets, output, DBTablePath, object);//1
							}
						}
					}
				}
			}
		}
		return output;
	}

	public static List<Map<String, Object>> selectRowsByAttributesOfAggregation(Map<String, Object> object) {
		if(!object.containsKey("obj")) {
			return new ArrayList<>();
		}
		List<Map<String, Object>> obj = ((List<Map<String, Object>>)(object.get("obj")));
		List<String[]> aggregationValues = (List<String[]>) object.get("aggregation");
		Iterator<String[]> iterator = aggregationValues.iterator();
		while(iterator.hasNext()) {
			boolean overMap = obj.size() == 0? false: true;
			String[] aggregationValueArray = iterator.next();
			String type = aggregationValueArray[1];
			boolean limitMap = type.equalsIgnoreCase("limit")?true:false;
			for(int i = 2; i < aggregationValueArray.length; i++) {
				String[] sets = aggregationValueArray[i].split("\\|");
				String DBPath = CacheManager.getCacheInfo("DBPath").getValue().toString() 
						+ "/" + object.get("baseName").toString();
				String dBTablePath = DBPath + "/" + object.get("tableName").toString();
				if(limitMap) {
					P_AggregationPLSQL.P_AggregationLimitMap(sets, obj);
				}
				//����sort key ǰ��treeMap ֮�����������
				//����sort key ����treeMap
			}
		}
		return obj;
	}

	public static Object selectRowsByAttributesOfGetCulumns(Map<String, Object> object) {
		if(!object.containsKey("obj")) {
			return new ArrayList<>();
		}
		List<Map<String, Object>> obj = ((List<Map<String, Object>>)(object.get("obj")));
		List<String[]> getCulumnsValues = (List<String[]>) object.get("getCulumns");
		Iterator<String[]> iterator = getCulumnsValues.iterator();
		while(iterator.hasNext()) {
			boolean overMap = obj.size() == 0? false: true;
			String[] getCulumnsValueArray = iterator.next();
			if(overMap) {
				P_GetCulumnsPLSQL.P_GetCulumnsMap(obj, getCulumnsValueArray);
			}
		}
		return obj;
	}
}