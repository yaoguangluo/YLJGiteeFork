package ME.APM.VSQ.zhongYao;
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
import ME.S.stables.PathLinkFile;
import PEU.S.verbal.VerbalSource;
public class Dictionary{	
	public List<String> dic_list;
	public Map<String,Object> dic_map;
	public Map<String,Object> dic_li;
	public Map<String,Object> dic_hai;
	public Map<String,Object> dic_xz;
	public Map<String,Object> dic_xw;
	public Map<String,Object> dic_jm;
	public Map<String,Object> dic_ya;
	public Map<String,Object> dic_cy;
	public Map<String,Object> dic_cj;
	public Map<String,Object> dic_jj;
	public Map<String,Object> dic_zf;
	public List<String> txtToList() throws IOException{
		List<String> dic_list= new ArrayList<>();
		InputStream in= this.getClass().getResourceAsStream(PathLinkFile.bcqj_txt);
		BufferedReader cReader= new BufferedReader(new InputStreamReader(in));  
		String ctempString= null; 
		while ((ctempString= cReader.readLine()) != null) {  
			if(!ctempString.replace(" ","").equals(""))
				dic_list.add(ctempString);
		}
		cReader.close();
		return dic_list;
	}
	
	@SuppressWarnings("unused")
	public Map<String, Object> listToMap(List<String> dic_list) throws IOException{
		Map<String, Object> dic_map = new ConcurrentHashMap<String, Object>();
		for(int i = 0; i < dic_list.size(); i++) {
			if(dic_list.get(i).contains("ժҪ")) {
				if(i+3 < dic_list.size()) {
					String med_name = dic_list.get(i+3).replace("[��ҩ����]", "");
					String med_text = "";
					int j = i+2;				
					while(++j < dic_list.size() && !dic_list.get(j).contains("ժҪ")) {
						med_text += "\n" + dic_list.get(j);
					}
					med_name= med_name.replaceAll(" ", "").replace("��","").replace("��",":");	
					dic_map.put(med_name, med_text+"����");
				}
			}
		}
		return dic_map;
	}
	
	public Map<String, Object> mapToIndex(Map<String, Object> dic_map) {
		Map<String,String> pinyin= new HashMap<>();
		try {
			InputStream inputStreamp= new VerbalSource().getClass().getResourceAsStream(PathLinkFile.PinYinCN_lyg);
    		BufferedReader cReaderp= new BufferedReader(new InputStreamReader(inputStreamp, "GBK"));
    		//index
    		String cInputStringp;
    		while ((cInputStringp= cReaderp.readLine())!= null) {
    			String[] words= cInputStringp.split("->");
    			if(words.length>1) {
    				pinyin.put(words[0], words[1]);
    			}
    		}
    		cReaderp.close();
		}catch(Exception e) {
			//
		}		
		Map<String, Object> dic_index= new HashMap<>();
		Iterator<String> iter= dic_map.keySet().iterator();
		while (iter.hasNext()) {
			String index= iter.next().replaceAll(" ", "").replace("��","").replace("��",":");
			StringBuilder stringBuilder= new StringBuilder() ;
			for(int l= 0; l< index.length(); l++) {
				if(pinyin.containsKey(""+ index.charAt(l))) {
					stringBuilder.append(""+ pinyin.get(""+ index.charAt(l)).toUpperCase().charAt(0));
				}
			}
			//med_name= stringBuilder.toString()+ ":"+ index;	
			dic_index.put(index, stringBuilder.toString());
		}
		return dic_index;
	}
	
	public Map<String, Object> mapToMap_yw(Map<String, Object> dic_map) {
		Map<String,Object> dic_yw = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name.trim()).toString().replace("\n", "");	
			Pattern p=Pattern.compile("�ʼ�ԭ��(.*?)\\["); 
			Matcher m = p.matcher(med_text); 
			String temp = "";
			if (m.find()) {
				temp=m.group(0);
				temp=temp.replace("�ʼ�ԭ��]", "").replace("[", ".");
			}
//			if(!dic_yw.containsKey(med_name.replaceAll("\\s*", "").replace("��","").replace("��",":"))) {
//				dic_yw.put(med_name.replaceAll("\\s*", "").replace("��","").replace("��",":")
//						, temp.replaceAll("\\s*", "").replace("��","").replace("��",":"));
//			}
			
			med_name= med_name.replaceAll("\\s*", "").replace("��","").replace("��",":");
			if(!dic_yw.containsKey(med_name)) {
				dic_yw.put(med_name
						, temp.replaceAll("\\s*", "").replace("��","").replace("��",":"));
			}else {
				dic_yw.put(med_name
						, dic_yw.get(med_name)+ "���ӣ�"+ temp.replaceAll("\\s*", "").replace("��","").replace("��",":"));
			}
		}
		return dic_yw;
	}
	
	public Map<String, Object> mapToMap_li(Map<String, Object> dic_map) {
		Map<String,Object> dic_li = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name.trim()).toString().replace("\n", "");	
			Pattern p=Pattern.compile("��Ч(.*?)\\["); 
			Matcher m = p.matcher(med_text); 
			String temp = "";
			if (m.find()) {
				temp=m.group(0);
				temp=temp.replace("��Ч]", "").replace("[", ".");
			}
			med_name= med_name.replaceAll("\\s*", "").replace("��","").replace("��",":");
			if(!dic_li.containsKey(med_name)) {
				dic_li.put(med_name
						, temp.replaceAll("\\s*", "").replace("��","").replace("��",":"));
			}else {
				dic_li.put(med_name
						, dic_li.get(med_name)+ "���ӣ�"+ temp.replaceAll("\\s*", "").replace("��","").replace("��",":"));
			}
		}
		return dic_li;
	}
	
	public Map<String, Object> mapToMap_hai(Map<String, Object> dic_map) {
		Map<String,Object> dic_hai = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());	
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name.trim()).toString().replace("\n", "");	
			Pattern p=Pattern.compile("���չ��(.*?)\\["); 
			Matcher m = p.matcher(med_text); 
			String temp = "";
			if (m.find()) {
				temp=m.group(0);
				temp=temp.replace("���չ��]", "").replace("[", "");
			}
//			if(!dic_hai.containsKey(med_name.replaceAll("\\s*", "").replace("��","").replace("��",":"))) {
//				dic_hai.put(med_name.replaceAll("\\s*", "").replace("��","").replace("��",":")
//						, temp.replaceAll("\\s*", "").replace("��","").replace("��",":"));
//				
//			}
//			
			med_name= med_name.replaceAll("\\s*", "").replace("��","").replace("��",":");
			if(!dic_hai.containsKey(med_name)) {
				dic_hai.put(med_name
						, temp.replaceAll("\\s*", "").replace("��","").replace("��",":"));
			}else {
				dic_hai.put(med_name
						, dic_hai.get(med_name)+ "���ӣ�"+ temp.replaceAll("\\s*", "").replace("��","").replace("��",":"));
			}
		}
		return dic_hai;
	}
	
	public Map<String, Object> mapToMap_xz(Map<String, Object> dic_map) {
		Map<String,Object> dic_xz = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name.trim()).toString().replace("\n", "");	
			Pattern p=Pattern.compile("��ҽ��ҩ��(.*?)\\["); 
			Matcher m = p.matcher(med_text); 
			String temp = "";
			if (m.find()) {
				temp=m.group(0);
				temp=temp.replace("��ҽ��ҩ��]", "").replace("[", "");
			}
//			if(!dic_xz.containsKey(med_name.replaceAll("\\s*", "").replace("��", "").replace("��",":"))) {
//				dic_xz.put(med_name.replaceAll("\\s*", "").replace("��", "").replace("��", ":")
//						, temp.replaceAll("\\s*", "").replace("��","").replace("��",":"));
//			}
			med_name= med_name.replaceAll("\\s*", "").replace("��","").replace("��",":");
			if(!dic_xz.containsKey(med_name)) {
				dic_xz.put(med_name
						, temp.replaceAll("\\s*", "").replace("��","").replace("��",":"));
			}else {
				dic_xz.put(med_name
						, dic_xz.get(med_name)+ "���ӣ�"+ temp.replaceAll("\\s*", "").replace("��","").replace("��",":"));
			}
		}
		return dic_xz;
	}

	public Map<String, Object> mapToMap_zf(Map<String, Object> dic_map) {
		Map<String,Object> dic_zf = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p=Pattern.compile("����(.*?)\\["); 
			Matcher m = p.matcher(med_text); 
			String temp = "";
			if (m.find()) {
				temp=m.group(0);
				temp=temp.replace("����]", "").replace("[", "");
			}
			dic_zf.put(med_name.replaceAll("\\s*", "").replace("��","").replace("��",":")
					, temp.replaceAll("\\s*", "").replace("��","").replace("��",":"));
		}
		return dic_zf;
	}
	
	public Map<String, Object> mapToMap_cj(Map<String, Object> dic_map) {
		Map<String,Object> dic_cj = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p=Pattern.compile("����ҩ(.*?)ҩС����"); 
			Matcher m = p.matcher(med_text); 
			String temp = "";
			if (m.find()) {
				temp=m.group(0).replace("����ҩ]", "");
			}
			dic_cj.put(med_name.replaceAll("\\s*", "").replace("��","").replace("��",":")
					, temp.replaceAll("\\s*", "").replace("��","").replace("��",":"));
		}
		return dic_cj;
	}
	

	public Map<String, Object> mapToMap_jj(Map<String, Object> dic_map) {
		Map<String,Object> dic_jj = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p=Pattern.compile("����(.*?)\\["); 
			Matcher m = p.matcher(med_text); 
			String temp = "";
			if (m.find()) {
				temp=m.group(0);
				temp=temp.replace("����]", "").replace("[", "");
			}
			dic_jj.put(med_name.replaceAll("\\s*", "").replace("��","").replace("��",":")
					, temp.replaceAll("\\s*", "").replace("��","").replace("��",":"));
		}
		return dic_jj;
	}

	public Map<String, Object> mapToMap_cy(Map<String, Object> dic_map) {
		Map<String,Object> dic_cy = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p=Pattern.compile("��Դ(.*?)\\["); 
			Matcher m = p.matcher(med_text); 
			String temp = "";
			if (m.find()) {
				temp=m.group(0);
				temp=temp.replace("��Դ]", "").replace("[", "");
			}
			dic_cy.put(med_name.replaceAll("\\s*", "").replace("��","").replace("��",":")
					, temp.replaceAll("\\s*", "").replace("��","").replace("��",":"));
		}
		return dic_cy;
	}

	public Map<String, Object> mapToMap_ya(Map<String, Object> dic_map) {
		Map<String,Object> dic_ya = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p=Pattern.compile("�ް�(.*?)\\["); 
			Matcher m = p.matcher(med_text); 
			String temp = "";
			if (m.find()) {
				temp=m.group(0);
				temp=temp.replace("�ް�]", "").replace("[", "");
			}
			dic_ya.put(med_name.replaceAll("\\s*", "").replace("��","").replace("��",":")
					, temp.replaceAll("\\s*", "").replace("��","").replace("��",":"));
		}
		return dic_ya;
	}

	public Map<String, Object> mapToMap_jm(Map<String, Object> dic_map) {
		Map<String,Object> dic_jm = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p=Pattern.compile("����/����(.*?)\\["); 
			Matcher m = p.matcher(med_text); 
			String temp = "";
			if (m.find()) {
				temp=m.group(0);
				temp=temp.replace("����/����]", "").replace("[", "");
			}
			dic_jm.put(med_name.replaceAll("\\s*", "").replace("��","").replace("��",":")
					, temp.replaceAll("\\s*", "").replace("��","").replace("��",":"));
		}
		return dic_jm;
	}

	public Map<String, Object> mapToMap_xw(Map<String, Object> dic_map) {
		Map<String,Object> dic_xw = new java.util.concurrent.ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p=Pattern.compile("��ζ(.*?)\\["); 
			Matcher m = p.matcher(med_text); 
			String temp = "";
			if (m.find()) {
				temp=m.group(0);
				temp=temp.replace("��ζ]", "").replace("[", "");
			}
			//if(!dic_xw.containsKey(med_name.replaceAll("\\s*", "").replace("��","").replace("��",":"))) {
			//dic_xw.put(med_name.replaceAll("\\s*", "").replace("��","").replace("��",":")
			//		, temp.replace("����", "").replaceAll("\\s*", "").replace("��","").replace("��",":"));
			med_name= med_name.replaceAll("\\s*", "").replace("��","").replace("��",":");
			if(!dic_xw.containsKey(med_name)) {
				dic_xw.put(med_name
						, temp.replaceAll("\\s*", "").replace("��","").replace("��",":"));
			}else {
				dic_xw.put(med_name
						, dic_xw.get(med_name)+ "���ӣ�"+ temp.replaceAll("\\s*", "").replace("��","").replace("��",":"));
			}
		}
		//}
		return dic_xw;
	}

	public Map<String, Object> mapToMap_yl(Map<String, Object> dic_map, Map<String, Object> dic_xw,
			Map<String, Object> dic_li, Map<String, Object> dic_xz, Map<String, Object> dic_jm) throws IOException {
		Map<String,Object> dic_yl = new java.util.concurrent.ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p=Pattern.compile("����/��, ��������������ע(.*?)\\["); 
			Matcher m = p.matcher(med_text); 
			String temp = "";
			if (m.find()) {
				temp=m.group(0);
				temp=temp.replace("����/��, ��������������ע]", "").replace("[", "");
			}
//			if(!dic_yl.containsKey(med_name.replaceAll("\\s*", "").replace("��","").replace("��",":"))) {
//				dic_yl.put(med_name.replaceAll("\\s*", "").replace("��","").replace("��",":")
//						, temp.replace("����", "").replaceAll("\\s*", "").replace("��","").replace("��",":")+":");
//			}
			med_name= med_name.replaceAll("\\s*", "").replace("��","").replace("��",":");
			if(!dic_yl.containsKey(med_name)) {
				dic_yl.put(med_name
						, temp.replaceAll("\\s*", "").replace("��","").replace("��",":"));
			}else {
				dic_yl.put(med_name
						, dic_yl.get(med_name)+ "���ӣ�"+ temp.replaceAll("\\s*", "").replace("��","").replace("��",":"));
			}
		}
		return dic_yl;	
	}	
}