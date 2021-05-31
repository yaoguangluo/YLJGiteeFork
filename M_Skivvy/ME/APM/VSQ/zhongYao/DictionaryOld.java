package ME.APM.VSQ.zhongYao;
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

public class DictionaryOld{	
	public  List<String> dic_list;
	public  Map<String,Object> dic_map;
	public  Map<String,Object> dic_li;
	public  Map<String,Object> dic_hai;
	public  Map<String,Object> dic_xz;
	public  Map<String,Object> dic_xw;
	public  Map<String,Object> dic_jm;
	public  Map<String,Object> dic_ya;
	public  Map<String,Object> dic_cy;
	public  Map<String,Object> dic_cj;
	public  Map<String,Object> dic_jj;
	public  Map<String,Object> dic_zf;
	public List<String> txtToList() throws IOException{
		List<String> dic_list = new ArrayList<>();
		InputStream in = getClass().getResourceAsStream("c.txt");
		BufferedReader cReader = new BufferedReader(new InputStreamReader(in));  
		String ctempString = null; 
		while ((ctempString = cReader.readLine()) != null) {  
			if(!ctempString.replace(" ","").equals(""))
				dic_list.add(ctempString);
		}
		cReader.close();
		
		in = getClass().getResourceAsStream("������֤-��-��л.txt");
		cReader = new BufferedReader(new InputStreamReader(in));  
		ctempString = null; 
		while ((ctempString = cReader.readLine()) != null) {  
			if(!ctempString.replace(" ","").equals(""))
				dic_list.add(ctempString);
		}
		cReader.close();
		
		in = getClass().getResourceAsStream("ʳ�Ʊ���.txt");
		cReader = new BufferedReader(new InputStreamReader(in));  
		ctempString = null; 
		while ((ctempString = cReader.readLine()) != null) {  
			if(!ctempString.replace(" ","").equals(""))
				dic_list.add(ctempString);
		}
		cReader.close();
		return dic_list;
	}
	
	@SuppressWarnings("unused")
	public Map<String, Object> listToMap(List<String> dic_list) throws IOException{
		Map<String,Object> dic_map = new ConcurrentHashMap<String, Object>();
		for(int i = 0; i < dic_list.size(); i++) {
			if(dic_list.get(i).contains("ժҪ")) {
				String med_name = dic_list.get(i+1);
				String med_text = "";
				int j = i;				
				while(++j < dic_list.size() && !dic_list.get(j).contains("ժҪ")
						&&!dic_list.get(j).contains("^^")) {
					med_text += "\n"+dic_list.get(j);
				}
				dic_map.put(med_name.replaceAll(" ", "").replace("��","").replace("��",":")
						, med_text+"����");
			}
			
			if(dic_list.get(i).contains("^^")) {
				String med_name = dic_list.get(i+1);
				String med_text = "";
				int j = i;				
				while(++j < dic_list.size() && !dic_list.get(j).contains("^^")
						&& !dic_list.get(j).contains("<ƪ��>")) {
					med_text += "\n"+dic_list.get(j);
				}
				if(!dic_map.containsKey(med_name.replaceAll(" ", "").replace("��","")
						.replace("��",":"))) {
					dic_map.put(med_name.replaceAll(" ", "").replace("��","").replace("��",":")
							, med_text+"����");
				} 
			}
			if(dic_list.get(i).contains("<ƪ��>")) {
				String med_name = dic_list.get(i).replace("<ƪ��>", "");
				String med_text = "" + med_name;
				med_name=med_name.replaceAll("��(.*?)��", "").replaceAll("��(.*?)��", "");
				int j = i;				
				while(++j < dic_list.size() && !dic_list.get(j).contains("<ƪ��>")) {
					med_text += "\n"+dic_list.get(j);
				}
				if(!dic_map.containsKey(med_name.replaceAll(" ", "").replace("��","")
						.replace("��",":"))) {
					dic_map.put(med_name.replaceAll(" ", "").replace("��","").replace("��",":")
							, med_text+"����");
				} 
			}
		}
		return dic_map;
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
			Pattern p=Pattern.compile("������(.*?)�����Ρ�"); 
			Pattern p1=Pattern.compile("��ר(.*?)��"); 
			Pattern p2=Pattern.compile("��ר(.*?)η"); 
			Pattern p3=Pattern.compile("��ר(.*?)��"); 
			Pattern p4=Pattern.compile("��ר(.*?)��"); 
			Pattern p7=Pattern.compile("��ר(.*?)��"); 
			Pattern p5=Pattern.compile("��(.*?)��"); 
			Pattern p6=Pattern.compile("����(.*?)����"); 
			Matcher m = p.matcher(med_text); 
			Matcher m4 = p4.matcher(med_text); 
			Matcher m5 = p5.matcher(med_text); 
			Matcher m6 = p6.matcher(med_text);
			Matcher m7 = p7.matcher(med_text); 
			String temp = "";
			if (m.find()) {
				temp=m.group(0);
				temp=temp.replace("�����Ρ�", ".");
			}
			if(m4.find()){
				String deter=m4.group(0);
				deter=deter.replace("��", ".");
				Matcher m1=p1.matcher(deter); 
				Matcher m2=p2.matcher(deter); 
				Matcher m3=p3.matcher(deter); 	
				if(m1.find()){
					temp+=m1.group(0);
					temp=temp.replace("��", ".");
				}else if(m2.find()){
					temp+=m2.group(0);
					temp=temp.replace("η", ".");
				}else if(m3.find()){
					temp+=m3.group(0);
					temp=temp.replace("��", ".");
				}else if(m7.find()){
					temp+=m7.group(0);
					temp=temp.replace("��", ".");
				}else {
					temp+=deter;
				}
			}
			if(temp.equals("")) {
				if (m5.find()) {
					temp=m5.group(0);
				}
			}
			if(temp.equals("")) {
				if (m6.find()) {
					temp=m6.group(0);
				}
			}
			
			if(!dic_li.containsKey(med_name.replaceAll("\\s*", "").replace("��","")
					.replace("��",":"))) {
				dic_li.put(med_name.replaceAll("\\s*", "").replace("��","")
						.replace("��",":"), temp.replaceAll("\\s*", "").replace("��","")
						.replace("��",":"));
			}
		}
		return dic_li;
	}
	@SuppressWarnings("unused")
	public Map<String, Object> mapToMap_hai(Map<String, Object> dic_map) {
		Map<String,Object> dic_hai = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());	
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			if(med_name.contains("������")) {
				int i22=0;
				i22+=1;
			}
			String med_text = dic_map.get(med_name.trim()).toString().replace("\n", "");	
			Pattern p=Pattern.compile("������(.*?)������"); 
			
			Pattern p1=Pattern.compile("��(.*?)������"); 
			Pattern p2=Pattern.compile("η(.*?)������"); 
			Pattern p3=Pattern.compile("��(.*?)������"); 
			Pattern p4=Pattern.compile("��(.*?)������"); 
			Pattern p5=Pattern.compile("��(.*?)��"); 
			Pattern p6=Pattern.compile("η(.*?)��"); 
			Pattern p7=Pattern.compile("��(.*?)��"); 
			Pattern p8=Pattern.compile("��(.*?)��"); 
			Pattern p9=Pattern.compile("��(.*?)��"); 
			Matcher m=p.matcher(med_text); 
			Matcher m1=p1.matcher(med_text); 
			Matcher m2=p2.matcher(med_text); 
			Matcher m3=p3.matcher(med_text); 	
			Matcher m4=p4.matcher(med_text); 
			Matcher m5=p5.matcher(med_text);
			Matcher m6=p6.matcher(med_text); 
			Matcher m7=p7.matcher(med_text); 	
			Matcher m8=p8.matcher(med_text); 
			Matcher m9=p9.matcher(med_text); 
			
			String temp ="";
			if (m.find()) {
				temp=m.group(0);
				temp=temp.replace("������", ".");
			}
			if(m1.find()){
				String temp_s = m1.group(0);
				temp_s=temp_s.replace("������", ".");
				temp+=temp_s;
			}else if(m2.find()){
				String temp_s = m2.group(0);
				temp_s=temp_s.replace("������", ".");
				temp+=temp_s;
			}else if(m3.find()){
				String temp_s = m3.group(0);
				temp_s=temp_s.replace("������", ".");
				temp+=temp_s;
			}else if(m4.find()){
				String temp_s = m4.group(0);
				temp_s=temp_s.replace("������", ".");
				temp+=temp_s;
			}else if(m5.find()){
				String temp_s = m5.group(0);
				Pattern p55=Pattern.compile("��(.*?)��"); 
				Matcher m55=p55.matcher(temp_s);
				if(m55.find()){
					temp += m55.group(0);
				}else {
					temp += temp_s.replace("��", ".");
				}
			}else if(m6.find()){
				String temp_s = m6.group(0);
				Pattern p55=Pattern.compile("η(.*?)��"); 
				Matcher m55=p55.matcher(temp_s);
				if(m55.find()){
					temp += m55.group(0);
				}else {
					temp += temp_s.replace("��", ".");
				}
			}else if(m7.find()){
				String temp_s = m7.group(0);
				Pattern p55=Pattern.compile("��(.*?)��"); 
				Matcher m55=p55.matcher(temp_s);
				if(m55.find()){
					temp += m55.group(0);
				}else {
					temp += temp_s.replace("��", ".");
				}
			}else if(m8.find()){
				String temp_s = m8.group(0);
				Pattern p55=Pattern.compile("��(.*?)��"); 
				Matcher m55=p55.matcher(temp_s);
				if(m55.find()){
					temp += m55.group(0);
				}else {
					temp += temp_s.replace("��", ".");
				}
			}else{
			}
			
			if(temp.equals("")) {
				if (m9.find()) {
					temp=m9.group(0);
				}
			}
			if(!dic_hai.containsKey(med_name.replaceAll("\\s*", "").replace("��","")
					.replace("��",":"))) {
				dic_hai.put(med_name.replaceAll("\\s*", "").replace("��","")
						.replace("��",":"), temp.replaceAll("\\s*", "").replace("��","")
						.replace("��",":"));
				
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
			Pattern p=Pattern.compile("�����Ρ�(.*?)��Դ"); 
			Matcher m=p.matcher(med_text); 
			Pattern p1=Pattern.compile("�����Ρ�(.*?)����"); 
			Matcher m1=p1.matcher(med_text); 
			Pattern p2=Pattern.compile("�����Ρ�(.*?)��"); 
			Matcher m2=p2.matcher(med_text);	
			Pattern p3=Pattern.compile("�����Ρ�(.*?)����"); 
			Matcher m3=p3.matcher(med_text);	
			
			Pattern p4=Pattern.compile("\\#\\#(.*?)����"); 
			Matcher m4=p4.matcher(med_text);	
			
			String temp ="";
			if (m.find()) {
				temp=m.group(0);
				temp=temp.replace("��Դ", ".");
			}else if(m1.find()){
				temp+=m1.group(0);
				temp=temp.replace("����", ".");
			}else if(m2.find()){
				temp=m2.group(0);
			}else if(m3.find()){
				temp=m3.group(0);
			}else if (m4.find()) {
				temp=m4.group(0);
			}
			if(!dic_xz.containsKey(med_name.replaceAll("\\s*", "").replace("��", "")
					.replace("��",":"))) {
				dic_xz.put(med_name.replaceAll("\\s*", "").replace("��", "").replace("��", ":")
						, temp.replaceAll("\\s*", "").replace("��","").replace("��",":"));
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
			Pattern p=Pattern.compile("�Ʒ�(.*?)��"); 
			//med_text.m.matches("/������*�����Ρ�/");
			Matcher m=p.matcher(med_text); 		
			String temp ="";
			if (m.find()) {
				temp=m.group(0).replace("��", "");
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
			Pattern p = Pattern.compile("����ҩƷ(.*?)ҩƷĩβ");
			Matcher m = p.matcher(med_text); 		
			String temp = "";
			if (m.find()) {
				temp = m.group(0).replace("ҩƷĩβ", "");
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
			Pattern p=Pattern.compile("����(.*?)$"); 
			Matcher m=p.matcher(med_text); 		
			String temp ="";
			if (m.find()) {
				temp=m.group(0);
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
			Pattern p=Pattern.compile("��Դ(.*?)����"); 
			Pattern p1=Pattern.compile("��Դ(.*?)$"); 
			Matcher m=p.matcher(med_text); 
			Matcher m1=p1.matcher(med_text); 		
			String temp ="";
			if (m.find()) {
				temp=m.group(0);
				temp=temp.replace("����", ".");
			}else if(m1.find()){
				temp+=m1.group(0);
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
			Pattern p=Pattern.compile("��(^��)(.*?)������"); 
			Pattern p1=Pattern.compile("�ް���(.*?)����"); 
			Pattern p2=Pattern.compile("�ް���(.*?)$"); 
			Matcher m=p.matcher(med_text); 
			Matcher m1=p1.matcher(med_text); 
			Matcher m2=p2.matcher(med_text); 
			String temp ="";
			if (m.find()) {
				temp=m.group(0);
				temp=temp.replace("������", ".");
			}
			if(m1.find()){
				temp+=m1.group(0);
				temp=temp.replace("����", ".");
			}else if(m2.find()){
				temp=m2.group(0);
				temp=temp.replace("ժҪ", ".");
			}else{
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
			Pattern p=Pattern.compile("��(.*?)��"); 
			Matcher m=p.matcher(med_text); 
			String temp ="";
			if (m.find()) {
				temp=m.group(0);
			}
		
			dic_jm.put(med_name.replaceAll("\\s*", "").replace("��","").replace("��",":")
					, temp.replaceAll("\\s*", "").replace("��","").replace("��",":"));
		}
		return dic_jm;
	}

	public Map<String, Object> mapToMap_xw(Map<String, Object> dic_map) {
		Map<String,Object> dic_xw= new java.util.concurrent.ConcurrentHashMap<String, Object>();
		Iterator<String> iter= dic_map.keySet().iterator();
		List<String> copy= new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p=Pattern.compile("ζ(.*?)��"); 
			Matcher m=p.matcher(med_text); 	
			Pattern p1=Pattern.compile("ζ(.*?)��"); 
			Matcher m1=p1.matcher(med_text); 
			Pattern p2=Pattern.compile("ζ(.*?)��"); 
			Matcher m2=p2.matcher(med_text); 
			
			Pattern p3=Pattern.compile("��(.*?)��"); 
			Matcher m3=p3.matcher(med_text.replace("<ƪ��>", "")); 
			
			String temp = "";
			if (m.find()) {
				temp = m.group(0).replace("��", "");
			}
			if (m1.find()) {
				temp = m1.group(0).replace("��", "");
			}
			if(temp.equals("")) {
				if (m2.find()) {
					temp = m2.group(0).replace("��", "");
				}
			}
			
			if(temp.equals("")) {
				if (m3.find()) {
					temp = m3.group(0);
				}
			}
			if(!dic_xw.containsKey(med_name.replaceAll("\\s*", "").replace("��","")
					.replace("��",":"))) {
				dic_xw.put(med_name.replaceAll("\\s*", "").replace("��","").replace("��",":")
						, temp.replace("����", "").replaceAll("\\s*", "").replace("��","")
						.replace("��",":"));
				
			}
		}
		return dic_xw;
	}

	public Map<String, Object> mapToMap_yl(Map<String, Object> dic_map, Map<String, Object> dic_xw,
			Map<String, Object> dic_li, Map<String, Object> dic_xz
			, Map<String, Object> dic_jm) throws IOException {
		Map<String,Object> dic_yl = new java.util.concurrent.ConcurrentHashMap<String, Object>();
		InputStream in = getClass().getResourceAsStream("��ҩѧ�ھŰ���ȫ���(���ٴ�Ӧ��).txt"); 
		BufferedReader cReader = new BufferedReader(new InputStreamReader(in, "UTF-8"));  
		String ctempString = null; 
		String temp="";
		cReader.readLine();
		while ((ctempString = cReader.readLine()) != null) {  
			if(ctempString.replace(" ", "").equals("")) {
				if(!temp.equals("")) {
					String[] ts = temp.replace("\r","").replace("\n", "").replace("\t", "").split("\\^");
					if(!dic_map.containsKey(ts[0])) {
						dic_map.put(ts[0], temp);
					}else {
						dic_map.put(ts[0], dic_map.get(ts[0]) + "������"+ temp);
					}
					
					if(!dic_xw.containsKey(ts[0])) {
						dic_xw.put(ts[0], ts[1]);
					}else {
						dic_xw.put(ts[0], dic_xw.get(ts[0]) + "������"+ ts[1]);
					}
					
					String li = ts[3];
					for(int i = 5; i < ts.length; i++) {
						li += ts[i];
					}
					if(!dic_li.containsKey(ts[0])) {
						dic_li.put(ts[0], li);
					}else {
						dic_li.put(ts[0], dic_li.get(ts[0]) + "������"+ li);
					}
					if(!dic_jm.containsKey(ts[0])) {
						dic_jm.put(ts[0], ts[2]);
					}else {
						dic_jm.put(ts[0], dic_jm.get(ts[0]) + "������"+ ts[2]);
					}
					if(!dic_yl.containsKey(ts[0])) {
						dic_yl.put(ts[0], ts[4]);
					}else {
						dic_yl.put(ts[0], dic_yl.get(ts[0]) + "������"+ li);
					}
					temp = "";
				}
			}
			temp += ctempString;
		}
		cReader.close();
		return dic_yl;	
	}

	public Map<String, Object> mapToMap_ym(Map<String, Object> dic_map) {
		Map<String,Object> dic_ym = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext()) {
			String string= iter.next();
			copy.add(string);
			dic_ym.put(string.replaceAll("\\s*", "").replace("��","").replace("��",":")
					,string.replaceAll("\\s*", "").replace("��","").replace("��",":"));
		}
		return dic_ym;
	}	
}