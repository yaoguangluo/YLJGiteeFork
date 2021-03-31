package org.ASQ.tinos.deta.trace;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.ASQ.tinos.deta.basic.Distance;
import org.ASQ.tinos.deta.basic.Euclid;
import org.ASQ.tinos.deta.demension.Position2D;
import org.ASQ.tinos.deta.demension.Position3D;
public class TraceFissilePositionHearts{
	//Source: ��2ά 3ά ���꼯 ���� ���� �켣 �����㷨JAVAԴ�롷
	//��������2019 �� 12 �� 21 ��  ��Ʒ˵��Gitee, Github, DetaOSS
	//��Ʒ˵�������� ������ ��̬�����������켣������������Ϣ��Ԫ��¼��
	//���� ������
	public static Map<Double, List<Position2D>> 
	trackTracePosition2DHeartsWithFissileGroups(List<Position2D> coods, double distanceScale){
		Map<Double, List<Position2D>> output= new HashMap<>(); 
		Map<Double, List<Position2D>> distanceGroups= new HashMap<>();
		Iterator<Position2D> iterator= coods.iterator();
		double i= 0.0;
		Here:
			while(iterator.hasNext()) {
				Position2D AMV_MVS_VSQ2D= iterator.next();
				if(distanceGroups.isEmpty()) {
					List<Position2D> list= new ArrayList<>();
					list.add(AMV_MVS_VSQ2D);
					distanceGroups.put(i, list);
					//
					List<Position2D> listHeartsTrace= output.get(i);
					listHeartsTrace.add(AMV_MVS_VSQ2D);
					output.put(i, listHeartsTrace);
				}else {
					//����������
					//������ƥ������������´棬���Ǿ����롣
					Iterator<Double> iteratorScale= output.keySet().iterator();
					boolean isFind= false;
					while(iteratorScale.hasNext()) {
						Double doubleScale= iteratorScale.next();
						Position2D currenctHeart= output.get(doubleScale).get(output.get(doubleScale).size()- 1);						
						double distance= Distance.getDistance2D(currenctHeart, AMV_MVS_VSQ2D);
						if(distance< distanceScale) {
							//����õ��µ�����
							Position2D newHeart= Euclid.findCryptionPosition2D(currenctHeart, AMV_MVS_VSQ2D);
							//ɾ����ǰ�������꼯���������꼯
							List<Position2D> list= distanceGroups.get(doubleScale);
							list.add(AMV_MVS_VSQ2D);
							distanceGroups.put(doubleScale, list);
							//ɾ����ǰ�������ݣ������������ݹ켣
							List<Position2D> listHeartsTrace= output.get(doubleScale);
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
						List<Position2D> list= new ArrayList<>();
						list.add(AMV_MVS_VSQ2D);
						distanceGroups.put(++i, list);
						//����hearts	
						List<Position2D> listHeartsTrace= output.get(i);
						listHeartsTrace.add(AMV_MVS_VSQ2D);
						output.put(i, listHeartsTrace);
					}
				}
			}
		return output;
	}
	
	public static Map<Double, List<Position3D>> 
	trackTracePosition3DHeartsWithFissileGroups(List<Position3D> coods, double distanceScale){
		Map<Double, List<Position3D>> output= new HashMap<>(); 
		Map<Double, List<Position3D>> distanceGroups= new HashMap<>();
		Iterator<Position3D> iterator= coods.iterator();
		double i= 0.0;
		Here:
			while(iterator.hasNext()) {
				Position3D AMV_MVS_VSQ3D= iterator.next();
				if(distanceGroups.isEmpty()) {
					List<Position3D> list= new ArrayList<>();
					list.add(AMV_MVS_VSQ3D);
					distanceGroups.put(i, list);
					//
					List<Position3D> listHeartsTrace= output.get(i);
					listHeartsTrace.add(AMV_MVS_VSQ3D);
					output.put(i, listHeartsTrace);
				}else {
					//����������
					//������ƥ������������´棬���Ǿ����롣
					Iterator<Double> iteratorScale= output.keySet().iterator();
					boolean isFind= false;
					while(iteratorScale.hasNext()) {
						Double doubleScale= iteratorScale.next();
						Position3D currenctHeart= output.get(doubleScale).get(output.get(doubleScale).size()- 1);						
						double distance= Distance.getDistance3D(currenctHeart, AMV_MVS_VSQ3D);
						if(distance< distanceScale) {
							//����õ��µ�����
							Position3D newHeart= Euclid.findCryptionPosition3D(currenctHeart, AMV_MVS_VSQ3D);
							//ɾ����ǰ�������꼯���������꼯
							List<Position3D> list= distanceGroups.get(doubleScale);
							list.add(AMV_MVS_VSQ3D);
							distanceGroups.put(doubleScale, list);
							//ɾ����ǰ�������ݣ������������ݹ켣
							List<Position3D> listHeartsTrace= output.get(doubleScale);
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
						List<Position3D> list= new ArrayList<>();
						list.add(AMV_MVS_VSQ3D);
						distanceGroups.put(++i, list);
						//����hearts	
						List<Position3D> listHeartsTrace= output.get(i);
						listHeartsTrace.add(AMV_MVS_VSQ3D);
						output.put(i, listHeartsTrace);
					}
				}
			}
		return output;
	}
}
