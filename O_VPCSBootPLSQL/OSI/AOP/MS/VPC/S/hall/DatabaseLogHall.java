package OSI.AOP.MS.VPC.S.hall;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import ME.SM.OP.SM.AOP.MEC.SIQ.E.E_PLSQL_E;
import OP.SM.AOP.MEC.SIQ.stable.StableData;
import PEU.P.cache.*;
import PEU.P.zip.*;

@SuppressWarnings("unused")
public class DatabaseLogHall {
	static String logCategoryPath;
	static String logCurrentFilePath;
	static String logCurrentFile;
	public static void createBinLogHall() throws Exception {
		//db write operation
		initLogCategoryPath();
		initCurrentFilePath();
		//write error rollback
		//binlog
	}

	private static void initCurrentFilePath() {
		long yearMonthDay = System.currentTimeMillis();
		long day = yearMonthDay/(1000 * 60 * 60 * 24);
		logCurrentFilePath = logCategoryPath + "/log/logger" + day + ".det";
	}

	private static void initLogCategoryPath() throws Exception {
		if(null != CacheManager.getCacheInfo("DBPath")) {
			logCategoryPath = CacheManager.getCacheInfo("DBPath").getValue().toString();	
		}else {
			throw new Exception();
		}
	}

	public static void writeLogFile(long when, String who, String plsql) {
		checkCurrentFileRange();
		//zip text string and write; im thinking about a new method to make string write small.
		String logString ="#@:" + when + "@:" + who + "@:" + plsql;
		FileWriter fw = null;
		try {
			fw = new FileWriter(logCurrentFilePath, true);
			fw.write("\n\r\n");
			fw.write(new String(GzipUtil.compress(logString.getBytes(StableData.CHARSET_UTF8))
					, StableData.CHARSET_UTF8));
			//	fw.write(logString);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void checkCurrentFileRange() {
		long yearMonthDay = System.currentTimeMillis();
		long day = yearMonthDay/(1000 * 60 * 60 * 24);
		String willMakeFile = logCategoryPath + "/log/logger" + day + ".det";
		String willMakeFilePath = logCategoryPath + "/log";
		File file = new File(willMakeFile);
		File fileWillMakeFilePath = new File(willMakeFilePath);
		if(!fileWillMakeFilePath.exists()) {
			fileWillMakeFilePath.mkdirs();
			//dont make new for this class, will get memory leakage
		}
		if(!file.exists()) {
			//dont make new for this class, will get memory leakage
			logCurrentFilePath = willMakeFile;
		}
		//if currentfiletime - currenttime > 1 day
		//if currentfilesize > 100mb will make discussion later,now just make one file per day.
		//makenew file;
	}

	private static void coverageByTime(long time) throws Exception {
		//	1ɾ�����𻵵����ݿ� �����
		File needClear = new File("C:/DetaDB");
		needClear.delete();
		//	2��ѹ�������ݿ� �����
		UnZip.unZipWithPath("C:/DetaLog/zipCover/zip_1549583065203.zip", "C:/DetaLog/zipCover/cover");
		//	3ѭ��ִ�б���plsql���ֱ�����ڴ���ʱ�����ɷ��ء�	
		BufferedReader reader = new BufferedReader(new FileReader("C:/DetaLog/log/logger.det"));
		String tempString;
		while ((tempString = reader.readLine()) != null) {
			//��gzipѹ����ִ�����ݿ�ָ�
			tempString = new String(GzipUtil.uncompress(tempString.getBytes(StableData.CHARSET_UTF8))
					, StableData.CHARSET_UTF8);
			long currentTime =Long.valueOf(tempString.split("@:")[1]);
			if(currentTime < time) {//�����ָ����㡣
				E_PLSQL_E.E_PLSQL(tempString.split("@:")[3], true);
			}
		}
		reader.close();
	}
}