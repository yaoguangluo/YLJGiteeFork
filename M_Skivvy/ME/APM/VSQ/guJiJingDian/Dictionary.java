package ME.APM.VSQ.guJiJingDian;
import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

import ME.S.stables.PathLinkFile;

import java.util.List;
import java.util.Map;
public class Dictionary{	
	public List<String> dic_list;
	public Map<String, String> dic_map;
	public List<String> txtToListName() throws IOException{
		List<String> TEMP_list = new ArrayList<>();
		TEMP_list.add(PathLinkFile.�Ƶ��ھ�_txt);
		TEMP_list.add(PathLinkFile.����ȫ��_txt);
		TEMP_list.add(PathLinkFile.���в���_��_��˼��_txt);
		TEMP_list.add(PathLinkFile.����_txt);
		TEMP_list.add(PathLinkFile.��ʮһ�Ѿ�_��_��ȵ_txt);
		TEMP_list.add(PathLinkFile.�вؾ�_txt);
		TEMP_list.add(PathLinkFile.����Ҫ��_txt);
		return TEMP_list;
	}
	
	public Map<String, String> listNameToMap(List<String> dic_list) throws IOException{
		Map<String, String> dic_map = new ConcurrentHashMap<String, String>();
		for(int i = 0; i < dic_list.size(); i++) {
			String para = "";
			String name = dic_list.get(i).toString();
			InputStream in = this.getClass().getResourceAsStream(name);
			BufferedReader cReader;
//			if(name.equalsIgnoreCase(PathLinkFile.��Ӥ��Ҫ_��_Ѧ��_txt) 
//					|| name.equalsIgnoreCase(PathLinkFile.���ױ���_��_����_txt)) {
//				 cReader = new BufferedReader(new InputStreamReader(in, "UTF-16"));  
//			}else {
				 cReader = new BufferedReader(new InputStreamReader(in, "GBK"));  
			//}
			String ctempString = null; 
			int index = 0;
			while ((ctempString = cReader.readLine()) != null) {  
				if(!ctempString.replace(" ", "").equals("")) {
					para += ctempString;
					if(ctempString.replace(" ", "").contains("^^")) {	
						dic_map.put(name+(index++), para.replace("\\s+", " "));
						para="";
					}
				}
			}
			cReader.close();
		}
		return dic_map;
	}
}