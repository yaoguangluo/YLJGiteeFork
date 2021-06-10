package OSV.ESI.standard;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import OSI.AOP.MEC.SIQ.plorm.PLORMImpl;
import OSI.AOP.MEC.SIQ.plorm.PLORMInterf;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.FullDNATokenPDI;
//OSV PLSQL �з�, ˼��, ���: ������ 20210510
//����һ������������.
//��û�в���, �������ƾ����ò���, ���ȼ��Ժ�.
//�Ժ�ῼ�ǲ������Ĳ������ ��ֵempty ��null.
public class IU_CellStandard{	
	public List<String> txtToList() throws IOException{
		List<String> dic_list= new ArrayList<>();
		return dic_list;
	}

	public static Map<String, Object> InsertCellORM(String rootPath, String baseName, String tabKey
			, Map<String, String> rowCells, Boolean initonEncrypt) throws IOException{
		Iterator<String> iterators= rowCells.keySet().iterator();
		Map<String, Object> map= null;
		try {
			PLORMInterf orm= new PLORMImpl();
			orm= orm.startAtRootDir(rootPath)
					.withBaseName(baseName)
					.withTableInsert(tabKey);
			while(iterators.hasNext()) {
				String string= iterators.next();
				if(initonEncrypt) {
					orm= orm.withCulumnValue(string
							, new FullDNATokenPDI().initonSect(rowCells.get(string).replace(":", "@Tin@")));
				}else {
					orm= orm.withCulumnValue(string, rowCells.get(string).replace(":", "@Tin@"));	
					//���Ժ��˼��: ������ô����ʵ�廯,ʡ��Ҫ��ͨ�������.
				}	
			}
			orm.checkAndFixPlsqlGrammarErrors()//׼������plsql orm���� ���﷨��麯�� ���޸�������
			.checkAndFixSystemEnvironmentErrors()//׼������plsql orm���� ��ϵͳ������麯�����޸�������
			.finalE(true);
			//map= org.plsql.db.plsql.imp.E_PLSQLImp.E_PLORM(orm, true);
		}catch(Exception e1) {
			//׼��д�ع�
			e1.printStackTrace();
		}
		return map;
	}	

	public static Map<String, Object> InsertCellPLSQL(String rootPath, String baseName, String tabKey
			, Map<String, String> rowCells, Boolean initonEncrypt) throws IOException{
		Iterator<String> iterators= rowCells.keySet().iterator();
		Map<String, Object> map= null;
		try {
			String plsql= "setRoot:"+ rootPath+ ";";
			plsql+= "baseName:"+ baseName+ ";"; 
			plsql+= "tableName:"+ tabKey+ ":insert;";
			while(iterators.hasNext()) {
				String string= iterators.next();
				if(initonEncrypt) {
					plsql+= "culumnValue:"+ string+ ":"
							+ new FullDNATokenPDI().initonSect(rowCells.get(string).replace(":", "@Tin@"))+ ";";
				}else {
					plsql+= "culumnValue:"+ string+ ":"+ rowCells.get(string).replace(":", "@Tin@")+ ";";
				}
			}	
			map= ME.SM.OP.SM.AOP.MEC.SIQ.E.E_PLSQL_E.E_PLSQL(plsql, true);
		}catch(Exception e1) {
			//׼��д�ع�
			e1.printStackTrace();
		}
		return map;
	}	
}