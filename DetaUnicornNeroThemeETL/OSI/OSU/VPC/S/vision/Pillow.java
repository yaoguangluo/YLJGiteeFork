package OSI.OSU.VPC.S.vision;
import java.util.HashMap;
import java.util.Map;

import OSI.OSU.PSQ.OEU.SOI.SMQ.neroCell.BootNeroDoc;
public class Pillow{
	public static Map<Long, Object> pillowBase;
	public static void register(BootNeroDoc bootNeroDoc) {
		//bootNeroDoc ��Ҫ�ó�����������Դ��������������ݣ���ά���ݣ��ɿ����ݵȡ�
		Map<String, Object>map= new HashMap<>(); 
		//...
		bootNeroDoc.setPillow(map);
		pillowBase.put(bootNeroDoc.getId(), map);
	}
}