package PCI.ASQ.trace;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import PCI.ASQ.basic.Distance;
import PCI.ASQ.basic.Euclid;
import PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import PCI.ASQ.demension.AMV_MVS_VSQ_3D;

public class TraceFissile_AMV_MVS_VSQ_Hearts{
	//Source: ��2ά 3ά ���꼯 ���� ���� �켣 �����㷨JAVAԴ�롷
	//��������2019 �� 12 �� 21 ��  ��Ʒ˵��Gitee, Github, DetaOSS
	//��Ʒ˵�������� ������ ��̬�����������켣������������Ϣ��Ԫ��¼��
	//���� ������
	public static Map<Double, List<AMV_MVS_VSQ_2D>> 
	trackTracePosition2DHeartsWithFissileGroups(List<AMV_MVS_VSQ_2D> coods, double distanceScale){
		Map<Double, List<AMV_MVS_VSQ_2D>> output= new HashMap<>(); 
		Map<Double, List<AMV_MVS_VSQ_2D>> distanceGroups= new HashMap<>();
		Iterator<AMV_MVS_VSQ_2D> iterator= coods.iterator();
		double i= 0.0;
		Here:
			while(iterator.hasNext()) {
				AMV_MVS_VSQ_2D position2D= iterator.next();
				if(distanceGroups.isEmpty()) {
					List<AMV_MVS_VSQ_2D> list= new ArrayList<>();
					list.add(position2D);
					distanceGroups.put(i, list);
					//
					List<AMV_MVS_VSQ_2D> listHeartsTrace= output.get(i);
					listHeartsTrace.add(position2D);
					output.put(i, listHeartsTrace);
				}else {
					//����������
					//������ƥ������������´棬���Ǿ����롣
					Iterator<Double> iteratorScale= output.keySet().iterator();
					boolean isFind= false;
					while(iteratorScale.hasNext()) {
						Double doubleScale= iteratorScale.next();
						AMV_MVS_VSQ_2D currenctHeart= output.get(doubleScale).get(output.get(doubleScale).size()- 1);						
						double distance= Distance.getDistance2D(currenctHeart, position2D);
						if(distance< distanceScale) {
							//����õ��µ�����
							AMV_MVS_VSQ_2D newHeart= Euclid.findCryptionPosition2D(currenctHeart, position2D);
							//ɾ����ǰ�������꼯���������꼯
							List<AMV_MVS_VSQ_2D> list= distanceGroups.get(doubleScale);
							list.add(position2D);
							distanceGroups.put(doubleScale, list);
							//ɾ����ǰ�������ݣ������������ݹ켣
							List<AMV_MVS_VSQ_2D> listHeartsTrace= output.get(doubleScale);
							listHeartsTrace.add(newHeart);
							output.put(doubleScale, listHeartsTrace);
							//�ҵ�
							isFind= true;
							//���Ԥ�� ������Ӧ״̬ ���԰� continue ʡ�ԡ�
							continue Here;
						}	
					}
					//�´�
					if(!isFind) {
						List<AMV_MVS_VSQ_2D> list= new ArrayList<>();
						list.add(position2D);
						distanceGroups.put(++i, list);
						//����hearts	
						List<AMV_MVS_VSQ_2D> listHeartsTrace= output.get(i);
						listHeartsTrace.add(position2D);
						output.put(i, listHeartsTrace);
					}
				}
			}
		return output;
	}
	
	public static Map<Double, List<AMV_MVS_VSQ_3D>> 
	trackTracePosition3DHeartsWithFissileGroups(List<AMV_MVS_VSQ_3D> coods, double distanceScale){
		Map<Double, List<AMV_MVS_VSQ_3D>> output= new HashMap<>(); 
		Map<Double, List<AMV_MVS_VSQ_3D>> distanceGroups= new HashMap<>();
		Iterator<AMV_MVS_VSQ_3D> iterator= coods.iterator();
		double i= 0.0;
		Here:
			while(iterator.hasNext()) {
				AMV_MVS_VSQ_3D position3D= iterator.next();
				if(distanceGroups.isEmpty()) {
					List<AMV_MVS_VSQ_3D> list= new ArrayList<>();
					list.add(position3D);
					distanceGroups.put(i, list);
					//
					List<AMV_MVS_VSQ_3D> listHeartsTrace= output.get(i);
					listHeartsTrace.add(position3D);
					output.put(i, listHeartsTrace);
				}else {
					//����������
					//������ƥ������������´棬���Ǿ����롣
					Iterator<Double> iteratorScale= output.keySet().iterator();
					boolean isFind= false;
					while(iteratorScale.hasNext()) {
						Double doubleScale= iteratorScale.next();
						AMV_MVS_VSQ_3D currenctHeart= output.get(doubleScale).get(output.get(doubleScale).size()- 1);						
						double distance= Distance.getDistance3D(currenctHeart, position3D);
						if(distance< distanceScale) {
							//����õ��µ�����
							AMV_MVS_VSQ_3D newHeart= Euclid.findCryptionPosition3D(currenctHeart, position3D);
							//ɾ����ǰ�������꼯���������꼯
							List<AMV_MVS_VSQ_3D> list= distanceGroups.get(doubleScale);
							list.add(position3D);
							distanceGroups.put(doubleScale, list);
							//ɾ����ǰ�������ݣ������������ݹ켣
							List<AMV_MVS_VSQ_3D> listHeartsTrace= output.get(doubleScale);
							listHeartsTrace.add(newHeart);
							output.put(doubleScale, listHeartsTrace);
							//�ҵ�
							isFind= true;
							//���Ԥ�� ������Ӧ״̬ ���԰� continue ʡ�ԡ�
							continue Here;
						}	
					}
					//�´�
					if(!isFind) {
						List<AMV_MVS_VSQ_3D> list= new ArrayList<>();
						list.add(position3D);
						distanceGroups.put(++i, list);
						//����hearts	
						List<AMV_MVS_VSQ_3D> listHeartsTrace= output.get(i);
						listHeartsTrace.add(position3D);
						output.put(i, listHeartsTrace);
					}
				}
			}
		return output;
	}
}
