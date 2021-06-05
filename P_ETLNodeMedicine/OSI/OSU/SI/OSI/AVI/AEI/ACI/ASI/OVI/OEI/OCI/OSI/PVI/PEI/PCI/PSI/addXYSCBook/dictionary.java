package OSI.OSU.SI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addXYSCBook;
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

public class dictionary{	
	public void txtToMap(Map<String, Object> dic_yao_ming, Map<String, Object> dic_chengfen_danwei,
			Map<String, Object> dic_yong_fa, Map<String, Object> dic_yao_li, Map<String, Object> dic_zhu_yi,
Map<String, Object> dic_shi_ying, Map<String, Object> dic_bu_liang_fan_ying, Map<String, Object> dic_yao_wu_xiang_hu_zuo_yong,
Map<String, Object> dic_qi_ta, Map<String, Object> dic_yong_liang, Map<String, Object> dic_jie_shao) throws IOException{
		InputStream in = this.getClass().getResourceAsStream("127����ҽ����ҩƷ��������.txt");
		BufferedReader cReader = new BufferedReader(new InputStreamReader(in, "UTF-8"));  
		String ctempString = null; 
		while ((ctempString = cReader.readLine()) != null) {  
			if(!ctempString.replace(" ", "").equals("")) {
				String temps[] = ctempString.split("��");
				dic_yao_ming.put(temps[0].split("��")[1], 1);
				dic_yao_li.put(temps[0].split("��")[1], "");
				dic_chengfen_danwei.put(temps[0].split("��")[1], "");
				dic_yong_fa.put(temps[0].split("��")[1], "");
				dic_zhu_yi.put(temps[0].split("��")[1], "");
				dic_shi_ying.put(temps[0].split("��")[1], temps[1]);
				dic_bu_liang_fan_ying.put(temps[0].split("��")[1], "");
				dic_yao_wu_xiang_hu_zuo_yong.put(temps[0].split("��")[1], "");
				dic_qi_ta.put(temps[0].split("��")[1], "");
				dic_yong_liang.put(temps[0].split("��")[1], "");
				dic_jie_shao.put(temps[0].split("��")[1], "");
			}
		}
		cReader.close();
		in.close();
		in = this.getClass().getResourceAsStream("��ҽ����ҩ.txt");
		cReader = new BufferedReader(new InputStreamReader(in, "UTF-8"));  
		ctempString = null; 
		String yaoming = "";
		while ((ctempString = cReader.readLine()) != null) {  
			if(!ctempString.replace(" ","").equals("")) {
				if(ctempString.contains("��ҩ��")) {
					String temps[]=ctempString.replace("��ҩ��", "").split("��");
					yaoming =temps[0].replaceAll("\\s*", "").replace("��","").replace("��",":");
					dic_yao_ming.put(yaoming, 1);
					if(!dic_yao_li.containsKey(yaoming))
						dic_yao_li.put(yaoming, "");
					if(!dic_chengfen_danwei.containsKey(yaoming))
						dic_chengfen_danwei.put(yaoming, "");
					if(!dic_yong_fa.containsKey(yaoming))
						dic_yong_fa.put(yaoming, "");
					if(!dic_zhu_yi.containsKey(yaoming))
						dic_zhu_yi.put(yaoming, "");
					if(!dic_shi_ying.containsKey(yaoming))
						dic_shi_ying.put(yaoming, "");
					if(!dic_bu_liang_fan_ying.containsKey(yaoming))
						dic_bu_liang_fan_ying.put(yaoming, "");
					if(!dic_yao_wu_xiang_hu_zuo_yong.containsKey(yaoming))
						dic_yao_wu_xiang_hu_zuo_yong.put(yaoming, "");
					if(!dic_qi_ta.containsKey(yaoming))
						dic_qi_ta.put(yaoming, "");
					if(!dic_yong_liang.containsKey(yaoming))
						dic_yong_liang.put(yaoming, "");
					if(!dic_jie_shao.containsKey(yaoming))
						dic_jie_shao.put(yaoming, "");
					if(temps.length > 1) {
						if(!dic_jie_shao.containsKey(yaoming))
							dic_jie_shao.put(yaoming, temps[1].replaceAll("\\s*", "").replace("��","").replace("��",":"));
						else 
							dic_jie_shao.put(yaoming, dic_jie_shao.get(yaoming) + temps[1].replaceAll("\\s*", "").replace("��","").replace("��",":"));
					} 
				}
				if(ctempString.contains("�÷�")) {
					if(!dic_yong_fa.containsKey(yaoming.replaceAll("\\s*", "").replace("��","").replace("��",":")))
						dic_yong_fa.put(yaoming.replaceAll("\\s*", "").replace("��","").replace("��",":"), ctempString.replaceAll("\\s*", "").replace("��","").replace("��",":"));
					else
						dic_yong_fa.put(yaoming.replaceAll("\\s*", "").replace("��","").replace("��",":"), 
								dic_yong_fa.get(yaoming.replaceAll("\\s*", "").replace("��","").replace("��",":"))
								+ctempString.replaceAll("\\s*", "").replace("��","").replace("��",":"));	
				}
				if(ctempString.contains("ע������")) {
					if(!dic_zhu_yi.containsKey(yaoming.replaceAll("\\s*", "").replace("��","").replace("��",":")))
						dic_zhu_yi.put(yaoming.replaceAll("\\s*", "").replace("��","").replace("��",":"), ctempString.replaceAll("\\s*", "").replace("��","").replace("��",":"));
					else
						dic_zhu_yi.put(yaoming.replaceAll("\\s*", "").replace("��","").replace("��",":"), 
								dic_zhu_yi.get(yaoming.replaceAll("\\s*", "").replace("��","").replace("��",":"))
								+ctempString.replaceAll("\\s*", "").replace("��","").replace("��",":"));	
				}
				if(ctempString.contains("����")) {	
					if(!dic_qi_ta.containsKey(yaoming.replaceAll("\\s*", "").replace("��","").replace("��",":")))
						dic_qi_ta.put(yaoming.replaceAll("\\s*", "").replace("��","").replace("��",":"), ctempString.replaceAll("\\s*", "").replace("��","").replace("��",":"));
					else
						dic_qi_ta.put(yaoming.replaceAll("\\s*", "").replace("��","").replace("��",":"), 
								dic_qi_ta.get(yaoming.replaceAll("\\s*", "").replace("��","").replace("��",":"))
								+ctempString.replaceAll("\\s*", "").replace("��","").replace("��",":"));			
				}
			}
		}
		cReader.close();
		in= this.getClass().getResourceAsStream("ҩ��ѧ(���߰�-).txt");
		cReader= new BufferedReader(new InputStreamReader(in, "GBK"));  
		ctempString= null; 
		yaoming= "";
		String temps= "";
		while ((ctempString= cReader.readLine()) != null) {  
			if(!ctempString.replace(" ", "").equals("")) {
				if(ctempString.contains("��ҩ��")) {
					if(!yaoming.equals("")) {//ȷ����ҩ��
						dic_yao_ming.put(yaoming, 1);
						if(!dic_chengfen_danwei.containsKey(yaoming))
							dic_chengfen_danwei.put(yaoming, "");
						if(!dic_yong_fa.containsKey(yaoming))
							dic_yong_fa.put(yaoming, "");
						if(!dic_zhu_yi.containsKey(yaoming))
							dic_zhu_yi.put(yaoming, "");
						if(!dic_shi_ying.containsKey(yaoming))
							dic_shi_ying.put(yaoming, "");
						if(!dic_bu_liang_fan_ying.containsKey(yaoming))
							dic_bu_liang_fan_ying.put(yaoming, "");
						if(!dic_yao_wu_xiang_hu_zuo_yong.containsKey(yaoming))
							dic_yao_wu_xiang_hu_zuo_yong.put(yaoming, "");
						if(!dic_qi_ta.containsKey(yaoming))
							dic_qi_ta.put(yaoming, "");
						if(!dic_yong_liang.containsKey(yaoming))
							dic_yong_liang.put(yaoming, "");
						if(!dic_jie_shao.containsKey(yaoming))
							dic_jie_shao.put(yaoming, "");
						if(!dic_yao_li.containsKey(yaoming))
							dic_yao_li.put(yaoming, temps.replace(" ", ""));
						else
							dic_yao_li.put(yaoming, dic_yao_li.get(yaoming) + temps.replace(" ", ""));
						temps="";
					}
					yaoming = ctempString.replace("��ҩ��", "").replaceAll("\\s*", "").replace("��","").replace("��",":");
					temps += yaoming;
				}else {
					temps += ctempString.replaceAll("\\s*", "").replace("��","").replace("��",":");
				}
			}
		}
		cReader.close();
		List<String> TEMP_list = new ArrayList<>();
		in = this.getClass().getResourceAsStream("�ٴ�ҩ���ֲ�.txt");
		cReader = new BufferedReader(new InputStreamReader(in, "UTF8"));  
		ctempString = null; 
		while ((ctempString = cReader.readLine()) != null) {  
			if(!ctempString.replace(" ","").equals("")) {
				if(ctempString.contains("��")&&ctempString.contains("��")) {
					ctempString = "����"+ctempString;
				}
				TEMP_list.add(ctempString);
			}
		}
		cReader.close();
		Map<String, Object> dic_map= new ConcurrentHashMap<>();
		for(int i = 0; i< TEMP_list.size(); i++) {
			if(TEMP_list.get(i).contains("��ҩ��")) {
				String med_name= TEMP_list.get(i).replace("��ҩ��", "")+ TEMP_list.get(i+1)+ TEMP_list.get(i+2);
				String med_text= "" + med_name;
				int j = i;				
				while(++j< TEMP_list.size()&& !(TEMP_list.get(j).contains("��ҩ��"))) {
					med_text += TEMP_list.get(j);
				}
				med_name=med_name.replaceAll("\\s*", "").replace("��","").replace("��",":");
				if(!dic_map.containsKey(med_name))
					dic_map.put(med_name, (med_text+"����").replace("\\s+", " "));
				else
					dic_map.put(med_name, dic_map.get(med_name)+(med_text+"����").replace("\\s+", " "));	
				dic_yao_ming.put(med_name, 1);
				if(!dic_chengfen_danwei.containsKey(med_name))
					dic_chengfen_danwei.put(med_name, "");
				if(!dic_yong_fa.containsKey(med_name))
					dic_yong_fa.put(med_name, "");
				if(!dic_zhu_yi.containsKey(med_name))
					dic_zhu_yi.put(med_name, "");
				if(!dic_shi_ying.containsKey(med_name))
					dic_shi_ying.put(med_name, "");
				if(!dic_bu_liang_fan_ying.containsKey(med_name))
					dic_bu_liang_fan_ying.put(med_name, "");
				if(!dic_yao_wu_xiang_hu_zuo_yong.containsKey(med_name))
					dic_yao_wu_xiang_hu_zuo_yong.put(med_name, "");
				if(!dic_qi_ta.containsKey(med_name))
					dic_qi_ta.put(med_name, "");
				if(!dic_yong_liang.containsKey(med_name))
					dic_yong_liang.put(med_name, "");
				if(!dic_jie_shao.containsKey(med_name))
					dic_jie_shao.put(med_name, "");	
				if(!dic_yao_li.containsKey(med_name))
					dic_yao_li.put(med_name, temps.replaceAll("\\s*", "").replace("��","").replace("��",":"));
				else
					dic_yao_li.put(med_name, dic_yao_li.get(med_name) + temps.replaceAll("\\s*", "").replace("��","").replace("��",":"));	
			}
		}
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i).replaceAll("\\s*", "").replace("��","").replace("��",":");
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p = Pattern.compile("����Ҫ(.*?)����"); 
			Matcher m = p.matcher(med_text); 	
			Pattern p1 = Pattern.compile("����Ӧ(.*?)����"); 
			Matcher m1 = p1.matcher(med_text); 
			Pattern p2 = Pattern.compile("��ע��(.*?)����"); 
			Matcher m2 = p2.matcher(med_text); 
			Pattern p3 = Pattern.compile("���÷�(.*?)����"); 
			Matcher m3 = p3.matcher(med_text); 
			Pattern p4 = Pattern.compile("��ҩ��(.*?)����"); 
			Matcher m4 = p4.matcher(med_text); 
			Pattern p5 = Pattern.compile("������(.*?)����"); 
			Matcher m5 = p5.matcher(med_text); 
			Pattern p6 = Pattern.compile("������(.*?)����"); 
			Matcher m6 = p6.matcher(med_text); 	
			Pattern p7 = Pattern.compile("������(.*?)����"); 
			Matcher m7 = p7.matcher(med_text); 	
			
			String temp ="";
			if (m.find()) {
				temp = m.group(0);	
				if(!dic_chengfen_danwei.containsKey(med_name))
					dic_chengfen_danwei.put(med_name, temp.replaceAll("\\s*", "").replace("��","").replace("��",":"));	
				else
					dic_chengfen_danwei.put(med_name, dic_chengfen_danwei.get(med_name) + temp.replaceAll("\\s*", "").replace("��","").replace("��",":"));	
			}	
			if (m1.find()) {
				temp = m1.group(0);	
				while (m1.find()) {
					temp = m1.group(0);	
					}
				if(!dic_shi_ying.containsKey(med_name))
					dic_shi_ying.put(med_name, temp.replaceAll("\\s*", "").replace("��","").replace("��",":"));		
				else
					dic_shi_ying.put(med_name, dic_shi_ying.get(med_name) + temp.replaceAll("\\s*", "").replace("��","").replace("��",":"));	
			}	
			if (m2.find()) {
				temp = m2.group(0);	
				if(!dic_zhu_yi.containsKey(yaoming))
					dic_zhu_yi.put(med_name, temp.replaceAll("\\s*", "").replace("��","").replace("��",":"));	
				else
					dic_zhu_yi.put(med_name, dic_zhu_yi.get(med_name) + temp.replaceAll("\\s*", "").replace("��","").replace("��",":"));	
			}	
			if (m3.find()) {
				temp = m3.group(0);	
				if(!dic_yong_liang.containsKey(med_name))
					dic_yong_liang.put(med_name, temp.replaceAll("\\s*", "").replace("��","").replace("��",":"));	
				else
					dic_yong_liang.put(med_name, dic_yong_liang.get(med_name) + temp.replaceAll("\\s*", "").replace("��","").replace("��",":"));	
			}	
			if (m4.find()) {
				temp = m4.group(0);	
				if(!dic_yao_wu_xiang_hu_zuo_yong.containsKey(med_name))
					dic_yao_wu_xiang_hu_zuo_yong.put(med_name, temp.replaceAll("\\s*", "").replace("��","").replace("��",":"));		
				else
					dic_yao_wu_xiang_hu_zuo_yong.put(med_name, dic_yao_wu_xiang_hu_zuo_yong.get(med_name) + temp.replaceAll("\\s*", "").replace("��","").replace("��",":"));	
			}	
			if (m5.find()) {
				temp = m5.group(0);	
				if(!dic_bu_liang_fan_ying.containsKey(med_name))
					dic_bu_liang_fan_ying.put(med_name, temp.replaceAll("\\s*", "").replace("��","").replace("��",":"));		
				else
					dic_bu_liang_fan_ying.put(med_name, dic_bu_liang_fan_ying.get(med_name) + temp.replaceAll("\\s*", "").replace("��","").replace("��",":"));	
			}
			if (m6.find()) {
				temp = m6.group(0);	
				if(!dic_shi_ying.containsKey(med_name))
					dic_shi_ying.put(med_name, temp.replaceAll("\\s*", "").replace("��","").replace("��",":"));		
				else
					dic_shi_ying.put(med_name, dic_shi_ying.get(med_name) + temp.replaceAll("\\s*", "").replace("��","").replace("��",":"));	
			}	
			if (m7.find()) {
				temp = m7.group(0);	
				if(!dic_chengfen_danwei.containsKey(med_name))
					dic_chengfen_danwei.put(med_name, temp.replaceAll("\\s*", "").replace("��","").replace("��",":"));	
				else
					dic_chengfen_danwei.put(med_name, dic_chengfen_danwei.get(med_name) + temp.replaceAll("\\s*", "").replace("��","").replace("��",":"));	
		}	
		}	
	}
}