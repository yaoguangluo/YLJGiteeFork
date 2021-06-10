package PCI.ASQ.trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import PCI.ASQ.basic.Euclid;
import PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import PCI.ASQ.demension.AMV_MVS_VSQ_3D;
public class Trace_AMV_MVS_VSQ_Hearts{
	//Source: ��2ά 3ά ���꼯 ���� ���� �켣 �����㷨JAVAԴ�롷
	//��������2019 �� 12 �� 21 ��  ��Ʒ˵��Gitee, Github, DetaOSS
	//��Ʒ˵�������� ������ ��̬�����������켣������������Ϣ��Ԫ��¼��
	//���� ������
	public static List<AMV_MVS_VSQ_2D> trackTracePosition2DHeartsWithSingerGroup(List<AMV_MVS_VSQ_2D> coods){
		List<AMV_MVS_VSQ_2D> hearts= new ArrayList<>();
		Iterator<AMV_MVS_VSQ_2D> iterator= coods.iterator();
		boolean isFirst= true;
		while(iterator.hasNext()) {
			if(isFirst) {
				isFirst= !isFirst;
				hearts.add(iterator.next());
			}else {
				AMV_MVS_VSQ_2D position2D= iterator.next();
				AMV_MVS_VSQ_2D CryptHeart
				= Euclid.findCryptionPosition2D(hearts.get(hearts.size()- 1), position2D);
				hearts.add(CryptHeart);
			}
		}
		return hearts;
	}
	
	public static List<AMV_MVS_VSQ_3D> trackTracePosition3DHeartsWithSingerGroup(List<AMV_MVS_VSQ_3D> coods){
		List<AMV_MVS_VSQ_3D> hearts= new ArrayList<>();
		Iterator<AMV_MVS_VSQ_3D> iterator= coods.iterator();
		boolean isFirst= true;
		while(iterator.hasNext()) {
			if(isFirst) {
				isFirst= !isFirst;
				hearts.add(iterator.next());
			}else {
				AMV_MVS_VSQ_3D position3D= iterator.next();
				AMV_MVS_VSQ_3D CryptHeart
				= Euclid.findCryptionPosition3D(hearts.get(hearts.size()- 1), position3D);
				hearts.add(CryptHeart);
			}
		}
		return hearts;
	}
}