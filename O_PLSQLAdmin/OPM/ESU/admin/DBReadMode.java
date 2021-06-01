package OPM.ESU.admin;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import ME.APM.VSQ.App;
import ME.APM.VSQ.zhongYao.Dictionary;
import ME.APM.VSQ.zhongYao.DictionaryFromDB;
import OSV.VCQ.standard.DictionaryStandardDB;
import PEU.P.combination.ObjectCombination;

//���� ������
//׼�����һ�� ���ݿ��ȡfrequency ��������, ֮�����ݱ༭ҳ�����������.
//���������༯��, �Ժ��𽥷ֳ��̳�����.
//�������Ϊ��ҽҩ�ļ���.
public class DBReadMode{

	public static void aCommonReadWay(App app) throws IOException {
		//1�������������,������������
		//1.1��������txt����ѡ����txt
		if(app.bootDBInTXTWay) {
			//...
			readDBInTXTWay(app);
			return;
		}
		//�����ݱ�����ѡ���Ͷ����ݱ�
		if(app.bootDBInBaseWay) {
			//...
			readDBInBaseWay(app);
			return;
		}
		//��web�ӿ���������ѡ���Ͷ�web�ϵ�rest��������
		if(app.bootDBInWebWay) {
			readDBInWebWay(app);
			//...
			return;
		}

		//2���û�����þͰ���ˮ�߶���
		//2.1 ��txt�ȶ�txt
		readDBInTXTWay(app);
		//2.2 �����ݱ�Ͷ������ݱ�
		readDBInBaseWay(app);
		//2.3 ��web�ӿ�����Ͷ�web�ϵ�rest��������
		readDBInWebWay(app);
		//2.4 ������.
	}

	public static void readDBInTXTWay(App app) throws IOException {
		Dictionary d= new Dictionary();
		List<String> dic_list= d.txtToList();
		try {
			app.dic_map= d.listToMap(dic_list);
			app.dic_yw= app.dic_map;
			app.dic_index= new DictionaryFromDB().mapToIndex(app.dic_map);
			ObjectCombination.mapCombination(app.dic_li, d.mapToMap_li(app.dic_map));
			ObjectCombination.mapCombination(app.dic_hai, d.mapToMap_hai(app.dic_map));
			ObjectCombination.mapCombination(app.dic_xz, d.mapToMap_xz(app.dic_map));
			ObjectCombination.mapCombination(app.dic_ya, d.mapToMap_ya(app.dic_map));
			ObjectCombination.mapCombination(app.dic_jm, d.mapToMap_jm(app.dic_map));
			ObjectCombination.mapCombination(app.dic_xw, d.mapToMap_xw(app.dic_map));
			ObjectCombination.mapCombination(app.dic_cy, d.mapToMap_cy(app.dic_map));
			ObjectCombination.mapCombination(app.dic_jj, d.mapToMap_jj(app.dic_map));
			ObjectCombination.mapCombination(app.dic_zf, d.mapToMap_zf(app.dic_map));
			ObjectCombination.mapCombination(app.dic_cj, d.mapToMap_cj(app.dic_map));
			ObjectCombination.mapCombination(app.dic_yl, d.mapToMap_yl(app.dic_map, app.dic_xw, app.dic_li, app.dic_xz, app.dic_jm));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void readDBInBaseWay(App app) throws IOException {
		//...
		//db
		//�����¸�д�ı�׼������.
		DictionaryStandardDB d= new DictionaryStandardDB();
		String primaryKey= "��ҩ����";
		String tabKey= "zybc";
		//�Ժ���� uniq forenkey��.
		Map<String, Map<String, Object>> map= d.dbToMap(primaryKey, tabKey);
		ObjectCombination.mapCombination(app.dic_index, map.get("��ҩ����"));
		ObjectCombination.mapCombination(app.dic_yw, map.get("�ʼ�ԭ��"));
		ObjectCombination.mapCombination(app.dic_li, map.get("��Ч"));
		ObjectCombination.mapCombination(app.dic_xz, map.get("��ҽ��ҩ��"));
		ObjectCombination.mapCombination(app.dic_ya, map.get("�ް�"));
		ObjectCombination.mapCombination(app.dic_jm, map.get("����"));
		ObjectCombination.mapCombination(app.dic_xw, map.get("��ζ"));
		ObjectCombination.mapCombination(app.dic_cy, map.get("��Դ"));
		ObjectCombination.mapCombination(app.dic_jj, map.get("����"));
		ObjectCombination.mapCombination(app.dic_zf, map.get("����"));
		ObjectCombination.mapCombination(app.dic_hai, map.get("���չ��"));
		ObjectCombination.mapCombination(app.dic_cj, map.get("����ҩ"));
		ObjectCombination.mapCombination(app.dic_yl, map.get("����"));
		ObjectCombination.mapCombination(app.dic_map, map.get("dic_map"));
	}

	public static void readDBInWebWay(App app) {
		//...
	}
}