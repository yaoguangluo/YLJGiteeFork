package OSV.ESD.standard;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//import OSI.AOP.MEC.SIQ.plorm.PLORMImpl;
//import OSI.AOP.MEC.SIQ.plorm.PLORMInterf;
//import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.FullDNATokenPDI;
//OSV PLSQL �з�, ˼��, ���: ������ 20210511
//��ɾ������������.
public class D_CellStandard{	
	public List<String> txtToList() throws IOException{
		List<String> dic_list= new ArrayList<>();
		return dic_list;
	}

	//	delete samples
	//	tableName:test:delete;
	//	condition:or:testCulumn1|<|20:testCulumn2|==|fire;
	//	condition:and:testCulumn1|>|100:testCulumn2|==|fire;

	public static Map<String, Object> DeleteCellORM(String rootPath, String baseName, String tabKey
			, Map<String, String> rowCells, Boolean initonEncrypt) throws IOException{
		//  PLORMInterf orm= new PLORMImpl();
		//	orm= orm.startAtRootDir(rootPath)
		//			.withBaseName(baseName)
		//			.withTableInsert(tabKey);
		//  condition ���ù淶, �Ժ�. ����д�����delete���
		//	condition:or:testCulumn1|<|20:testCulumn2|==|fire;
		//	condition:and:testCulumn1|>|100:testCulumn2|==|fire;
		return null;
	}	

	public static Map<String, Object> DeleteCellPLSQL(String rootPath, String baseName, String tabKey
			, Map<String, String> rowCells, Boolean initonEncrypt) throws IOException{
		Map<String, Object> map= null;
		try {
			//	String plsql= "setRoot:"+ rootPath+ ";";
			//	plsql+= "baseName:"+ baseName+ ";"; 
			//	plsql+= "tableName:"+ tabKey+ ":delete;";
			//  condition ���ù淶, �Ժ�. ����д�����delete���
			//	condition:or:testCulumn1|<|20:testCulumn2|==|fire;
			//	condition:and:testCulumn1|>|100:testCulumn2|==|fire;
			//	map= OSI.OPE.ME.SM.OP.SM.AOP.MEC.SIQ.imp.E_PLSQLImp.E_PLSQL(plsql, true);
		}catch(Exception e1) {
			//׼��д�ع�
			e1.printStackTrace();
		}
		return map;
	}	
}