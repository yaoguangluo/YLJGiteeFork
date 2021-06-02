package PEU.P.classification;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
//������
//�������˺ϲ�����,�������Ʒ��ຯ��
public class ObjectClassification {
	public static Map<String, Map<String, Object>> mapClassification(Map<String, Object> input, String[] keywords) {
		Map<String, Map<String, Object>> output= new HashMap<>();
		Iterator<String> iterator= input.keySet().iterator();
		while(iterator.hasNext()) {
			String string= iterator.next();
			for(int i= 0; i< keywords.length; i++) {
				if(string.contains(keywords[i])) {
					Map<String, Object> map;
					if(output.containsKey(keywords[i])) {
						map= output.get(keywords[i]);
					}else {
						map= new HashMap<>(); 
					}
					map.put(string, input.get(string));
					output.put(keywords[i], map);
				}
			}
		}
		return output;
	}
	
	public static void main(String[] ARGS) {
		Map<String, Object> input= new HashMap<String, Object>();
		String[] keywords= new String[3];
		input.put("��", "��");
		input.put("��", "��");
		input.put("��", "��");
		input.put("��", "��");
		input.put("��", "��");
		input.put("��", "��");
		
		keywords[0]="��";
		keywords[1]="��";
		keywords[2]="��";
		mapClassification(input, keywords);
	}
}