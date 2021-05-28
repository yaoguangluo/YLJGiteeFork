package ME.APM.VSQ.zhongYiZhenDuanXue;
import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ME.S.stables.PathLinkFile;
public class Dictionary{	
	public List<String> dic_list;
	public Map<String,Object> dic_map;
	public Map<String,Object> dic_gn;
	public Map<String,Object> dic_lcbx;
	public Map<String,Object> dic_zhfx;
	public Map<String,Object> dic_lcyy;
	public Map<String,Object> dic_zhjb;
	public List<String> txtToList() throws IOException{
		List<String> dic_list = new ArrayList<>();
		List<String> TEMP_list = new ArrayList<>();
		InputStream in = this.getClass().getResourceAsStream(PathLinkFile.z_txt);
		BufferedReader cReader = new BufferedReader(new InputStreamReader(in, "UTF-8"));  
		String ctempString = null; 
		while ((ctempString = cReader.readLine()) != null) {  
			if(!ctempString.replace(" ","").equals(""))
				TEMP_list.add(ctempString);
		}
		cReader.close();
		for(int i = 0; i < TEMP_list.size(); i++) {
			dic_list.add(TEMP_list.get(i));
			if(TEMP_list.get(i).contains("[�ٴ�����]")) {
				if(!TEMP_list.get(i-1).contains("[����]")) {
					dic_list.add(dic_list.size()-1, "[����]");
				}	
			}	
		}	
		dic_list.add("[�����½���]");
		in = getClass().getResourceAsStream(PathLinkFile.shl_txt);
		cReader = new BufferedReader(new InputStreamReader(in, "GBK"));  
		ctempString = null; 
		while ((ctempString = cReader.readLine()) != null) {  
			if(!ctempString.replace(" ","").equals("")) {
				dic_list.add(ctempString);
			}
		}
		cReader.close();	
		return dic_list;
	}
	
	public Map<String, Object> listToMap(List<String> dic_list) throws IOException{
		Map<String, Object> dic_map = new ConcurrentHashMap<String, Object>();
		for(int i = 0; i < dic_list.size(); i++) {
			if(dic_list.get(i).contains("[����]")) {
				String med_name =dic_list.get(i-1);
				String med_text = "" + med_name;
				int j = i;				
				while(j+2 < dic_list.size() && (!dic_list.get(j).contains("[�����½���]"))&& (!dic_list.get(j+2).contains("[����]"))) {
					med_text += dic_list.get(j);
					j+=1;
				}
				dic_map.put(med_name, med_text.replace("\\s+", " "));
			}
			
			if(dic_list.get(i).contains("[ԭ��]")) {
				String med_name ="�˺���:" + dic_list.get(i+1);
				String med_text = "" + med_name;
				int j = i;				
				while(j+1 < dic_list.size() && (!dic_list.get(j+1).contains("[ԭ��]"))) {
					med_text += dic_list.get(j);
					j+=1;
				}
				dic_map.put(med_name, med_text.replace("\\s+", " "));
			}
		}
		return dic_map;
	}

	public Map<String, Object> mapToMap_zhjb(Map<String, Object> dic_map) {
		Map<String,Object> dic_zhjb = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0; i<copy.size(); i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p = Pattern.compile("֤�����(.*?)$"); 
			Matcher m = p.matcher(med_text); 
			String temp ="";
			if (m.find()) {
				temp="["+m.group(0);
			}
			dic_zhjb.put(med_name.replaceAll("\\s*", "").replace("��","").replace("��",":") , temp.replaceAll("\\s*", "").replace("��","").replace("��",":") );
		}
		return dic_zhjb;
	}

	public Map<String, Object> mapToMap_lcyy(Map<String, Object> dic_map) {
		Map<String,Object> dic_lcyy = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p = Pattern.compile("�ٴ�����(.*?)֤�����"); 

			Pattern p1 = Pattern.compile("�ٴ�����(.*?)$"); 
			Matcher m = p.matcher(med_text); 
			Matcher m1 = p1.matcher(med_text); 
			String temp ="";
			if (m.find()) {
				temp="["+m.group(0);
				temp=temp.replace("[֤�����", ".");
			}else if (m1.find()) {
				temp="["+m1.group(0);
			}
			
			dic_lcyy.put(med_name.replaceAll("\\s*", "").replace("��","").replace("��",":") , temp.replaceAll("\\s*", "").replace("��","").replace("��",":") );
		}
		
		return dic_lcyy;
	}

	public Map<String, Object> mapToMap_zhfx(Map<String, Object> dic_map) {
		Map<String,Object> dic_zhfx = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p = Pattern.compile("֤�����(.*?)�ٴ�����"); 
			Pattern p1 = Pattern.compile("֤�����(.*?)֤�����"); 
			Pattern p2 = Pattern.compile("֤�����(.*?)$"); 
			Pattern p3 = Pattern.compile("����(.*?)$"); 
			
			Matcher m = p.matcher(med_text); 
			Matcher m1 = p1.matcher(med_text); 
			Matcher m2 = p2.matcher(med_text); 
			Matcher m3 = p3.matcher(med_text); 
			String temp ="";
			if (m.find()) {
				temp="["+m.group(0);
				temp=temp.replace("[�ٴ�����", ".");
			}else if (m1.find()) {
				temp="["+m1.group(0);
				temp=temp.replace("[֤�����", ".");
			}else if (m2.find()) {
				temp=m2.group(0);
			}else if (m3.find()) {
				temp="["+m3.group(0);
				temp=temp.replace("[����]", ".");
			}
			
			dic_zhfx.put(med_name.replaceAll("\\s*", "").replace("��","").replace("��",":") , temp.replaceAll("\\s*", "").replace("��","").replace("��",":") );
		}
		
		return dic_zhfx;
	}

	public Map<String, Object> mapToMap_lcbx(Map<String, Object> dic_map) {
		Map<String,Object> dic_lcbx = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p = Pattern.compile("�ٴ�����(.*?)�ٴ�����"); 
			Pattern p1 = Pattern.compile("�ٴ�����(.*?)֤�����"); 
			Pattern p2 = Pattern.compile("�ٴ�����(.*?)֤�����"); 
			Pattern p3 = Pattern.compile("�ٴ�����(.*?)$"); 
			Pattern p4 = Pattern.compile("ע��(.*?)����"); 
			Pattern p5 = Pattern.compile("ע��(.*?)$"); 
			
			Matcher m = p.matcher(med_text); 
			Matcher m1 = p1.matcher(med_text); 
			Matcher m2 = p2.matcher(med_text); 
			Matcher m3 = p3.matcher(med_text); 
			Matcher m4 = p4.matcher(med_text); 
			Matcher m5 = p5.matcher(med_text); 
			String temp ="";
			if (m.find()) {
				temp = "[" + m.group(0);
				temp = temp.replace("[�ٴ�����", ".");
			}else if (m1.find()) {
				temp = "[" + m1.group(0);
				temp = temp.replace("[֤�����", ".");
			}else if (m2.find()) {
				temp = "[" + m2.group(0);
				temp = temp.replace("[֤�����", ".");
			}else if (m3.find()) {
				temp = "[" + m3.group(0);
			}else if (m4.find()) {
				temp = "[" + m4.group(0);
				temp = temp.replace("[ע��]", ".");
			}else if (m5.find()) {
				temp = "[" + m5.group(0);
			}
			dic_lcbx.put(med_name.replaceAll("\\s*", "").replace("��","").replace("��",":") , temp.replaceAll("\\s*", "").replace("��","").replace("��",":") );
		}
		
		return dic_lcbx;
	}

	public Map<String, Object> mapToMap_gn(Map<String, Object> dic_map) {
		Map<String,Object> dic_li = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i = 0; i < copy.size(); i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p = Pattern.compile("����(.*?)�ٴ�����"); 
			Pattern p1 = Pattern.compile("����(.*?)����"); 
			Pattern p2 = Pattern.compile("����(.*?)$"); 
			Matcher m = p.matcher(med_text); 
			Matcher m1 = p1.matcher(med_text); 
			Matcher m2 = p2.matcher(med_text); 
			String temp = "";
			if (m.find()) {
				temp = "[" + m.group(0);
				temp = temp.replace("[�ٴ�����", ".");
			}else if (m1.find()) {
				temp = "[" + m1.group(0);
				temp = temp.replace("[����]", ".");
			}else if (m2.find()) {
				temp = "[" + m2.group(0);
			}
			dic_li.put(med_name.replaceAll("\\s*", "").replace("��","").replace("��",":") , temp.replaceAll("\\s*", "").replace("��","").replace("��",":") );
		}
		return dic_li;
	}
}