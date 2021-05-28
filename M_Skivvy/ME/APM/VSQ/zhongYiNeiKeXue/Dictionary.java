package ME.APM.VSQ.zhongYiNeiKeXue;
import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ME.S.stables.PathLinkFile;

import java.util.List;
import java.util.Map;
public class Dictionary{	
	public List<String> dic_list;
	public Map<String,Object> dic_map;
	public Map<String,Object> dic_chu_fang;
	public List<String> txtToList() throws IOException{
		List<String> TEMP_list = new ArrayList<>();
		InputStream in = this.getClass().getResourceAsStream(PathLinkFile.n_txt);
		BufferedReader cReader = new BufferedReader(new InputStreamReader(in));  
		String ctempString = null; 
		while ((ctempString = cReader.readLine()) != null) {  
			if(!ctempString.replace(" ", "").equals(""))
				TEMP_list.add(ctempString);
		}
		cReader.close();
		
		in = this.getClass().getResourceAsStream(PathLinkFile.wbx142f_txt);
		cReader = new BufferedReader(new InputStreamReader(in, "GBK"));  
		ctempString = null; 
		while ((ctempString = cReader.readLine()) != null) {  
			if(!ctempString.replace(" ","").equals(""))
				TEMP_list.add(ctempString);
		}
		cReader.close();
		
		in = this.getClass().getResourceAsStream(PathLinkFile.��ҽ����ѧ_txt);
		cReader = new BufferedReader(new InputStreamReader(in, "GBK"));  
		ctempString = null; 
		while ((ctempString = cReader.readLine()) != null) {  
			if(!ctempString.replace(" ","").equals(""))
				TEMP_list.add(ctempString);
		}
		cReader.close();
		
		in = this.getClass().getResourceAsStream(PathLinkFile.zydcd_txt);
		cReader = new BufferedReader(new InputStreamReader(in, "GBK"));  
		ctempString = null; 
		while ((ctempString = cReader.readLine()) != null) {  
			if(!ctempString.replace(" ","").equals(""))
				TEMP_list.add(ctempString);
		}
		cReader.close();
		
		return TEMP_list;
	}
	
	public Map<String, Object> listToMap(List<String> dic_list) throws IOException{
		Map<String,Object> dic_map = new ConcurrentHashMap<String, Object>();
		for(int i = 0; i < dic_list.size(); i++) {
			if(dic_list.get(i).contains("^")) {
				String med_name = dic_list.get(i);
				String med_text = ""+med_name;
				int j = i;				
				while(++j< dic_list.size() && !dic_list.get(j).contains("^")) {
					med_text += dic_list.get(j);
				}
				if(!med_text.contains("��ҽ��ǵ�")) {
					dic_map.put(med_name.replaceAll("\\s*", "").replace("��","").replace("��",":"), med_text.replaceAll("\\s*", "").replace("��","").replace("��",":"));
				}
			}
			
			if(dic_list.get(i).contains("..")) {
				String med_name = dic_list.get(i+1);
				String med_text = ""+med_name;
				med_text += dic_list.get(i);
				int j = i+1;				
				while(j< dic_list.size() && !dic_list.get(j).contains("..")) {
					med_text += dic_list.get(j++);
				}
				if(!med_text.contains("��ҽ��ǵ�")) {
					dic_map.put(med_name.replaceAll("\\s*", "").replace("��","").replace("��",":"), med_text.replaceAll("\\s*", "").replace("��","").replace("��",":"));
				}
			}
			
			if(dic_list.get(i).contains("^^")) {
				String med_name= dic_list.get(i+ 1);
				String med_text= "" + med_name;
				med_text += dic_list.get(i);
				int j = i+ 1;				
				while(j< dic_list.size() && !dic_list.get(j).contains("^^")&& !dic_list.get(j).contains("^L^Y^G")) {
					med_text += dic_list.get(j++);
				}
				if(!med_name.replaceAll("\\s*", "").replace("��","").replace("��",":").isEmpty()) {
					if(!med_name.contains("������")&&!med_name.contains("�������ȹ㳦����")) {
						if(!med_text.contains("��ҽ��ǵ�")) {
							dic_map.put(med_name.replaceAll("\\s*", "").replace("��","").replace("��",":"), med_text.replaceAll("\\s*", "").replace("��","").replace("��",":"));
						}
					}
				}
			}

			if(dic_list.get(i).contains("�Ϲ����")) {
				int j= i;	
				while(++j< dic_list.size()) {
					String[] med_text= dic_list.get(j).toString().split("-->");
					String temp= "";
					int k= 0;
					String med_name= "";
					for(String string: med_text) {
						if(k++ == 0) {
							med_name= string;
						}else {
							if(k> 2) {
								temp+= ",";
							}
							temp+= string;
						}
					}
					if(!temp.contains("��ҽ��ǵ�")) {
						dic_map.put(med_name.replaceAll("\\s*", "").replace("��","").replace("��",":"), temp.replaceAll("\\s*", "").replace("��","").replace("��",":"));									
					}
				}
			}
		}
		return dic_map;
	}
	
	public Map<String, Object> MapToChuFang(List<String> dic_list,Map<String, Object> dic_map) throws IOException{
		Map<String,Object> dic_chu_fang = new ConcurrentHashMap<String, Object>();
		for(int i = 0; i < dic_list.size(); i++) {
			if(dic_list.get(i).contains("^")) {
				String med_name = dic_list.get(i);
				if(dic_map.containsKey(med_name)){
					String temp = dic_map.get(med_name).toString();
					String med_text = "";
					for(int j=0; j<temp.length()-2; j++) {
						if(("" + temp.charAt(j)).equals("-")&&(""+temp.charAt(j+1)).equals("-")&&(""+temp.charAt(j+2)).equals("-")) {
							for(int k=j+2; k<temp.length()-2; k++) {
								if(("" + temp.charAt(k)).equals("-")&&(""+temp.charAt(k+1)).equals("-")&&(""+temp.charAt(k+2)).equals("-")) {
									break;
									}
								med_text+=temp.charAt(k);
							}
						}
					}
					dic_chu_fang.put(med_name.replaceAll("\\s*", "").replace("��","").replace("��",":"), med_text.replaceAll("\\s*", "").replace("��","").replace("��",":"));
				}
			}
		}
		
		Iterator<String> it = dic_map.keySet().iterator();
		while(it.hasNext()) {
			String name = it.next();
			String temp = dic_map.get(name).toString();
			Pattern p = Pattern.compile("����(.*?)Ӧ��"); 
			Pattern p1 = Pattern.compile("����(.*?)$"); 
			Matcher m = p.matcher(temp); 
			Matcher m1 = p1.matcher(temp); 
			if (m.find()) {
				dic_chu_fang.put(name, m.group(0));
			}else if (m1.find()) {
				dic_chu_fang.put(name, m1.group(0));
			}
		}
		
		it = dic_map.keySet().iterator();
		while(it.hasNext()) {
			String name = it.next();
			String temp = dic_map.get(name).toString();
			Pattern p = Pattern.compile("����(.*?)Ӧ��"); 
			Pattern p1 = Pattern.compile("����(.*?)$"); 
			Pattern p2 = Pattern.compile("��ɣ�(.*?)���ã�"); 
			Pattern p3 = Pattern.compile("��ɣ�(.*?)$��"); 
			Matcher m = p.matcher(temp); 
			Matcher m1 = p1.matcher(temp); 
			Matcher m2 = p2.matcher(temp); 
			Matcher m3 = p3.matcher(temp); 
			if (m.find()) {
				dic_chu_fang.put(name, m.group(0));
			}else if (m1.find()) {
				dic_chu_fang.put(name, m1.group(0));
			}else if (m2.find()) {
				dic_chu_fang.put(name, m2.group(0));
			}else if (m3.find()) {
				dic_chu_fang.put(name, m3.group(0));
			}
		}
		return dic_chu_fang;
	}

	public Map<String, Object> MapTomz(List<String> dic_list, Map<String, Object> dic_map) {
		Map<String,Object> dic_mz = new ConcurrentHashMap<String, Object>();
		Iterator<String> it = dic_map.keySet().iterator();
		while(it.hasNext()) {
			String name = it.next();
			String temp = dic_map.get(name).toString();
			Pattern p = Pattern.compile("��֢(.*?)�η�"); 
			Pattern p1 = Pattern.compile("��֢(.*?)$"); 
			Matcher m = p.matcher(temp); 
			Matcher m1 = p1.matcher(temp); 
			if (m.find()) {
				dic_mz.put(name, m.group(0));
			}else if (m1.find()) {
				dic_mz.put(name, m1.group(0));
			}
		}
		return dic_mz;
	}

	public Map<String, Object> MapTozf(List<String> dic_list, Map<String, Object> dic_map) {
		Map<String,Object> dic_zf = new ConcurrentHashMap<String, Object>();
		Iterator<String> it = dic_map.keySet().iterator();
		while(it.hasNext()) {
			String name = it.next();
			String temp = dic_map.get(name).toString();
			Pattern p = Pattern.compile("�η�(.*?)����"); 
			Pattern p1 = Pattern.compile("�η�(.*?)$"); 
			Pattern p2 = Pattern.compile("���⣺(.*?)ʹ�ã�"); 
			Pattern p3 = Pattern.compile("���⣺(.*?)$��"); 
			Matcher m = p.matcher(temp); 
			Matcher m1 = p1.matcher(temp); 
			Matcher m2 = p2.matcher(temp); 
			Matcher m3 = p3.matcher(temp); 
			if (m.find()) {
				dic_zf.put(name, m.group(0));
			}else if (m1.find()) {
				dic_zf.put(name, m1.group(0));
			}else if (m2.find()) {
				dic_zf.put(name, m2.group(0));
			}else if (m3.find()) {
				dic_zf.put(name, m3.group(0));
			}
		}
		return dic_zf;
	}

	public Map<String, Object> MapToyy(List<String> dic_list, Map<String, Object> dic_map) {
		Map<String,Object> dic_yy = new ConcurrentHashMap<String, Object>();
		Iterator<String> it = dic_map.keySet().iterator();
		while(it.hasNext()) {
			String name = it.next();
			String temp = dic_map.get(name).toString();
			Pattern p1 = Pattern.compile("Ӧ��(.*?)$"); 
			Pattern p2 = Pattern.compile("���Σ�(.*?)����"); 
			Pattern p3 = Pattern.compile("���Σ�(.*?)$"); 
			Matcher m1 = p1.matcher(temp); 
			Matcher m2 = p2.matcher(temp); 
			Matcher m3 = p3.matcher(temp); 
			if (m1.find()) {
				dic_yy.put(name, m1.group(0));
			}else if (m2.find()) {
				dic_yy.put(name, m2.group(0));
			}else if (m3.find()) {
				dic_yy.put(name, m3.group(0));
			}
		}
		return dic_yy;
	}

	public Map<String, Object> MapTosy(List<String> dic_list, Map<String, Object> dic_map) {
		Map<String,Object> dic_sy = new ConcurrentHashMap<String, Object>();
		Iterator<String> it = dic_map.keySet().iterator();
		while(it.hasNext()) {
			String name = it.next();
			String temp = dic_map.get(name).toString();
			Pattern p2 = Pattern.compile("ʹ�ã�(.*?)����"); 
			Pattern p3 = Pattern.compile("ʹ�ã�(.*?)$"); 
			Matcher m2 = p2.matcher(temp); 
			Matcher m3 = p3.matcher(temp); 
			if (m2.find()) {
				dic_sy.put(name, m2.group(0));
			}else if (m3.find()) {
				dic_sy.put(name, m3.group(0));
			}
		}
		return dic_sy;
	}

	public Map<String, Object> MapTotl(List<String> dic_list, Map<String, Object> dic_map) {
		Map<String,Object> dic_tl = new ConcurrentHashMap<String, Object>();
		Iterator<String> it = dic_map.keySet().iterator();
		while(it.hasNext()) {
			String name = it.next();
			String temp = dic_map.get(name).toString();
			Pattern p2 = Pattern.compile("���ۣ�(.*?)����"); 
			Pattern p3 = Pattern.compile("���ۣ�(.*?)$"); 
			Matcher m2 = p2.matcher(temp); 
			Matcher m3 = p3.matcher(temp); 
			if (m2.find()) {
				dic_tl.put(name, m2.group(0));
			}else if (m3.find()) {
				dic_tl.put(name, m3.group(0));
			}
		}
		return dic_tl;
	}

	public Map<String, Object> MapToff(List<String> dic_list, Map<String, Object> dic_map) {
		Map<String,Object> dic_ff = new ConcurrentHashMap<String, Object>();
		Iterator<String> it = dic_map.keySet().iterator();
		while(it.hasNext()) {
			String name = it.next();
			String temp = dic_map.get(name).toString();
			Pattern p2 = Pattern.compile("������(.*?)����"); 
			Pattern p3 = Pattern.compile("������(.*?)$"); 
			Matcher m2 = p2.matcher(temp); 
			Matcher m3 = p3.matcher(temp); 
			if (m2.find()) {
				dic_ff.put(name, m2.group(0));
			}else if (m3.find()) {
				dic_ff.put(name, m3.group(0));
			}
		}
		return dic_ff;
	}

	public Map<String, Object> MapTofg(List<String> dic_list, Map<String, Object> dic_map) {
		Map<String,Object> dic_fg = new ConcurrentHashMap<String, Object>();
		Iterator<String> it = dic_map.keySet().iterator();
		while(it.hasNext()) {
			String name = it.next();
			String temp = dic_map.get(name).toString();
			Pattern p3 = Pattern.compile("���裺(.*?)$"); 
			Matcher m3 = p3.matcher(temp); 
			if (m3.find()) {
				dic_fg.put(name, m3.group(0));
			}
		}
		return dic_fg;
	}	
}