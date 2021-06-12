package OSI.MSQ.OPE.SIU.read;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import OCI.ME.analysis.C.A;
import OEI.ME.analysis.E.CogsBinaryForest_AE;
import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.*;
public class ReadOSU_MSQ_OPE_OPC_ECI extends OSU_AVQ_ASQ_OPE_OPC_ECI{
	private static final long serialVersionUID= 1L;
	public int value= 0;
	public String filepath;
	public File[] fileList;
	protected String addressString;
	protected String searchString;
	public List<String[]> indexResult;
	public A _A;
	public Map<String, String> pos;
	public Map<String, String> pose;
	public Map<String, String> posec;
	public Map<String, String> indexWords;
	
	public ReadOSU_MSQ_OPE_OPC_ECI() throws IOException{	
	}

	public void run(final ReadOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ) 
			throws IOException{
		_A= new CogsBinaryForest_AE();
		_A.initMixed();
		//�õ���������
		pos= _A.getPosCnToCn();
		indexResult= new ArrayList<String[]>();
		System.out.println("runed"+ value); 
		//SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.path= new String(filepath); 
		//SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.out= new JTable(content, spec); 	
		System.out.println(addressString);
		System.out.println(searchString);
		//loop category
		File category= new File(addressString);
		if(!category.isDirectory()|| !category.exists()) {
			return;
		}
		String[] fileList= category.list();
		List<String> list= _A.parserMixedString(searchString);
		//list to map
		indexWords= new HashMap<String, String>(); 
		for(String string: list) {
			indexWords.put(string, pos.containsKey(string)?pos.get(string):"δ֪");
		}
		indexFile(addressString, fileList);
		System.out.println(fileList.length);
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.indexResult= indexResult;
	}

	private void indexFile(String addressString, String[] fileList) throws IOException {
		if(null== fileList) {
			return;
		}
		
		Here:
			for(String string: fileList) {
				File file= new File(addressString+ "\\"+ string);
				if(file.isDirectory()) {
					indexFile(file.getPath(), file.list());
					continue Here;
				}
				if(!string.contains(".txt")) {
					continue Here;
				}
				score(file);
			}
	}

	private void score(File file) throws IOException {
		try {
			double rank= 0;
			double important= 0;
			String path= file.getAbsolutePath();
			System.out.println(path);
			String[] result= new String[3];
			if(!file.exists()) {
				return;
			}
			BufferedReader reader= new BufferedReader(new FileReader(file));
			String tempString;
			while ((tempString= reader.readLine())!= null) {
				List<String> list= _A.parserMixedString(tempString);
				Iterator<String> iterator= list.iterator();
				while(iterator.hasNext()) {
					String value= iterator.next();
					if(indexWords.containsKey(value)) {
						if(indexWords.get(value).contains("��")) {
							rank+= 6;
							important+= value.length();
						}else if(indexWords.get(value).contains("��")) {
							rank+= 5;
							important+= value.length();
						}else if(indexWords.get(value).contains("��")) {
							rank+= 4;
							important+= value.length();
						}else if(indexWords.get(value).contains("ν")) {
							rank+= 3;
							important+= value.length();
						}else if(indexWords.get(value).contains("��")) {
							rank+= 2;
							important+= value.length();
						}
						rank+= 0.01;
						important+= 0.01;
					}
				}
			}
			reader.close();
			result[0]= ""+ rank;
			result[1]= ""+ important;
			result[2]= path;
			indexResult.add(result);
		}catch(Exception e) {
			//e.printStackTrace();
		}
		//�ִ�
		//һ��һ��ƥ��
		//ͳ�ƴ�����
		//����
	}
}
