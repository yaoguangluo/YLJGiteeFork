package MSI.OP.SM.AOP.MEC.SIQ.SM.OSU.E;
import java.io.File;



import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.json.JSONObject;

import MS.OP.SM.AOP.MEC.SIQ.cache.DetaDBBufferCacheManager;
import OP.SM.AOP.MEC.SIQ.SM.reflection.Cell;
import OP.SM.AOP.MEC.SIQ.SM.reflection.Row;
import OP.SM.AOP.MEC.SIQ.SM.reflection.Table;
import PEU.P.cache.*;

@SuppressWarnings("unchecked")
public class IU_Rows_E {
	public static Map<String, Object> insertRowByTablePathAndIndex(String tablePath, String pageIndex, JSONObject culumnOfNewRow) throws FileNotFoundException, IOException {
		String[] sets = tablePath.split("/");
		int rowInsertIndex = Integer.valueOf(pageIndex);
		File fileDBTable = new File(tablePath);
		if (fileDBTable.isDirectory()) {
			String DBTableRowsPath = tablePath + "/rows";	
			File fileDBTableRowsPath = new File(DBTableRowsPath);
			if (fileDBTableRowsPath.isDirectory()) {
				Row row = new Row();
				ConcurrentHashMap<String, Cell> cells = new ConcurrentHashMap<>();
				row.setCells(cells);
				String DBTableRowIndexPath = DBTableRowsPath + "/row" + rowInsertIndex ;	
				File readDBTableRowIndexFile = new File(DBTableRowIndexPath);
				if (!readDBTableRowIndexFile.exists()) {
					readDBTableRowIndexFile.mkdir();
					Iterator<String> it = culumnOfNewRow.keys();
					while(it.hasNext()) {
						String culumnName = it.next();
						String culumnValue = culumnOfNewRow.getString(culumnName);
						String needCreatCulumnPath = DBTableRowIndexPath + "/" + culumnName;
						File needCreatCulumn = new File(needCreatCulumnPath);
						needCreatCulumn.mkdir();
						FileWriter fw = null;
						try {
							fw = new FileWriter(needCreatCulumnPath + "/value.lyg", true);
							fw.write(null==culumnValue?"":culumnValue);
							fw.close();
							//buffer reflection update
							Cell cell = new Cell();
							cell.setCellValue(null == culumnValue ? "" : culumnValue);
							row.putCell(culumnName, cell);
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					String needCreatCulumnPath = DBTableRowIndexPath + "/is_delete_0";
					File needCreatCulumn = new File(needCreatCulumnPath);
					needCreatCulumn.mkdir();
				}
				DetaDBBufferCacheManager.db.getBase(sets[sets.length-2]).getTable(sets[sets.length-1]).putRow("row" + rowInsertIndex, row);
			}
		}
		Map<String, Object> output = new HashMap<>();
		output.put("totalPages", rowInsertIndex);
		return output;
	}

	public static Map<String, Object> insertRowByBaseName(String baseName, String tableName, JSONObject jsobj, boolean mod) throws Exception {
		Map<String, Object> output = new HashMap<>();
		String tablePath = CacheManager.getCacheInfo("DBPath").getValue().toString();
		tablePath += "/" + baseName + "/" + tableName;
		File fileDBTable = new File(tablePath);
		if (fileDBTable.isDirectory()) {
			String DBTableRowsPath = tablePath + "/rows";	
			Row row = new Row();
			ConcurrentHashMap<String, Cell> cells = new ConcurrentHashMap<>();
			row.setCells(cells);
			File fileDBTableRowsPath = new File(DBTableRowsPath);
			if (fileDBTableRowsPath.isDirectory()) {
				int rowInsertIndex = fileDBTableRowsPath.list().length;
				output.put("totalPages", rowInsertIndex);
				String DBTableRowIndexPath = DBTableRowsPath + "/row" + rowInsertIndex ;	
				File readDBTableRowIndexFile = new File(DBTableRowIndexPath);
				if (!readDBTableRowIndexFile.exists()) {
					readDBTableRowIndexFile.mkdir();
					Iterator<String> it = jsobj.keys();
					while(it.hasNext()) {
						String culumnName = it.next();
						String culumnValue = jsobj.get(culumnName).toString();
						if(culumnValue.equalsIgnoreCase("random")){
							culumnValue = "" + rowInsertIndex;
						}
						String needCreatCulumnPath = DBTableRowIndexPath + "/" + culumnName;
						File needCreatCulumn = new File(needCreatCulumnPath);
						if(!needCreatCulumn.exists()) {
							if(mod) {
								needCreatCulumn.mkdir();
							}
						}
						File needCreatCulumnPathFile= new File(needCreatCulumnPath + "/value.lyg");
						if(needCreatCulumnPathFile.exists() && !needCreatCulumnPathFile.canWrite()) {
							throw new Exception();
						}
						if(mod) {
							FileWriter fw = null;
							try {
								fw = new FileWriter(needCreatCulumnPath + "/value.lyg", true);
								fw.write(null == culumnValue? "" : culumnValue);
								fw.close();
							} catch (IOException e) {
								e.printStackTrace();
							}
						}
						//add buffer
						Cell cell = new Cell();
						cell.setCellValue(null == culumnValue? "" : culumnValue);
						if(mod) {
							row.putCell(culumnName, cell);
						}
					}
					String needCreatCulumnPath = DBTableRowIndexPath + "/is_delete_0";
					File needCreatCulumn = new File(needCreatCulumnPath);
					if(!needCreatCulumn.exists()) {
						if(mod){
							needCreatCulumn.mkdir();
						}
					}
				}
				Table table = DetaDBBufferCacheManager.db.getBase(baseName).getTable(tableName);
				if(mod) {
					table.putRow("row" + rowInsertIndex, row);
				}
			}
		}
		return output;
	}

	public static void insertRowByAttributes(Map<String, Object> object, boolean mod) throws Exception {
		JSONObject jsobj = new JSONObject();
		//for late will make an exception record queue system, to control all of the db write;
		List<String[]> culumnValues = (List<String[]>)object.get("culumnValue");
		Iterator<String[]> iterator = culumnValues.iterator();
		//list to json
		while(iterator.hasNext()) {
			String[] strings = iterator.next();
			String string= "";
			if(strings.length> 2) {
				string= strings[2];
			}
			jsobj.put(strings[1], string);
		}	
		insertRowByBaseName(object.get("baseName").toString(), object.get("tableName").toString(), jsobj, mod);
	}
}
