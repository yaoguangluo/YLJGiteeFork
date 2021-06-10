package PCI.ASQ.classification;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import PCI.ASQ.basic.Distance;
import PCI.ASQ.basic.Euclid;
import PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import PCI.ASQ.demension.AMV_MVS_VSQ_3D;

//task 20191219 daytime
//ͨ��scale ���������� ���������ѡ�
//Theory yaoguang.luo 20191219�� ŷ�����
//Application yaoguang.luo
public class Fissile{
	public static Map<Double, List<AMV_MVS_VSQ_2D>> fissilePosition2D(List<AMV_MVS_VSQ_2D> groups
			, double scale) {
		Map<Double, List<AMV_MVS_VSQ_2D>> distanceGroups= new HashMap<>();
		Map<Double, AMV_MVS_VSQ_2D> distanceHeart= new HashMap<>();
		Iterator<AMV_MVS_VSQ_2D> iterator= groups.iterator();
		double i= 0.0;
		Here:
			while(iterator.hasNext()) {
				AMV_MVS_VSQ_2D position2D= iterator.next();
				if(distanceGroups.isEmpty()) {
					List<AMV_MVS_VSQ_2D> list= new ArrayList<>();
					list.add(position2D);
					distanceGroups.put(i, list);
					distanceHeart.put(i, position2D);
				}else {
					//����������
					//������ƥ������������´棬���Ǿ����롣
					Iterator<Double> iteratorScale= distanceHeart.keySet().iterator();
					boolean isFind= false;
					while(iteratorScale.hasNext()) {
						Double doubleScale= iteratorScale.next();
						AMV_MVS_VSQ_2D currenctHeart= distanceHeart.get(doubleScale);
						double distance= Distance.getDistance2D(currenctHeart, position2D);
						if(distance< scale) {
							//����õ��µ�����
							AMV_MVS_VSQ_2D newHeart= Euclid.findCryptionPosition2D(currenctHeart, position2D);
							//ɾ����ǰ�������꼯���������꼯
							List<AMV_MVS_VSQ_2D> list= distanceGroups.get(doubleScale);
							list.add(position2D);
							distanceGroups.put(doubleScale, list);
							//ɾ����ǰ�������ݣ�������������
							distanceHeart.put(doubleScale, newHeart);
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
						distanceHeart.put(i, position2D);	
					}
				}
			}
		return distanceGroups;	
	}
	
	public static Map<Double, List<AMV_MVS_VSQ_3D>> fissilePosition3D(List<AMV_MVS_VSQ_3D> groups
			, double scale) {
		Map<Double, List<AMV_MVS_VSQ_3D>> distanceGroups= new HashMap<>();
		Map<Double, AMV_MVS_VSQ_3D> distanceHeart= new HashMap<>();
		Iterator<AMV_MVS_VSQ_3D> iterator= groups.iterator();
		double i= 0.0;
		Here:
			while(iterator.hasNext()) {
				AMV_MVS_VSQ_3D position3D= iterator.next();
				if(distanceGroups.isEmpty()) {
					List<AMV_MVS_VSQ_3D> list= new ArrayList<>();
					list.add(position3D);
					distanceGroups.put(i, list);
					distanceHeart.put(i, position3D);
				}else {
					//����������
					//������ƥ������������´棬���Ǿ����롣
					Iterator<Double> iteratorScale= distanceHeart.keySet().iterator();
					boolean isFind= false;
					while(iteratorScale.hasNext()) {
						Double doubleScale= iteratorScale.next();
						AMV_MVS_VSQ_3D currenctHeart= distanceHeart.get(doubleScale);
						double distance= Distance.getDistance3D(currenctHeart, position3D);
						if(distance< scale) {
							//����õ��µ�����
							AMV_MVS_VSQ_3D newHeart= Euclid.findCryptionPosition3D(currenctHeart, position3D);
							//ɾ����ǰ�������꼯���������꼯
							List<AMV_MVS_VSQ_3D> list= distanceGroups.get(doubleScale);
							list.add(position3D);
							distanceGroups.put(doubleScale, list);
							//ɾ����ǰ�������ݣ�������������
							distanceHeart.put(doubleScale, newHeart);
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
						distanceHeart.put(i, position3D);	
					}
				}
			}
		return distanceGroups;	
	}
}