package OSI.OSU.ASQ.classification;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import OSI.OSU.ASQ.demension.Position2D;
import OSI.OSU.ASQ.demension.Position3D;
import OSI.PCI.ASQ.basic.Distance;
import OSI.PCI.ASQ.basic.Euclid;
//task 20191219 daytime
//ͨ��scale ���������� ����������, ��ƥ�����������������롣
//�㷨 ��ʱ������׼ȷ�������ӡ�
//Theory yaoguang.luo 20191219~23�� ŷ�����
//Application yaoguang.luo
public class FissileWithMatch{
	public static Map<Double, ArrayList<Position2D>> fissilePosition2DWithMatch(ArrayList<Position2D> groups
			, double scale) {
		Map<Double, ArrayList<Position2D>> distanceGroups= new HashMap<>();
		Map<Double, Position2D> distanceHeart= new HashMap<>();
		Iterator<Position2D> iterator= groups.iterator();
		double i= 0.0;
		while(iterator.hasNext()) {
			Position2D position2D= iterator.next();
			if(distanceGroups.isEmpty()) {
				ArrayList<Position2D> ArrayList= new ArrayList<>();
				ArrayList.add(position2D);
				distanceGroups.put(i, ArrayList);
				distanceHeart.put(i, position2D);
			}else {
				//����������
				//������ƥ������������´棬���Ǿ����롣
				Iterator<Double> iteratorScale= distanceHeart.keySet().iterator();
				double shortest = 0;
				double shortestDoubleScale = 0;
				boolean isFind= false;
				while(iteratorScale.hasNext()) {
					Double doubleScale= iteratorScale.next();
					Position2D currenctHeart= distanceHeart.get(doubleScale);
					double distance= Distance.getDistance2D(currenctHeart, position2D);
					if(distance< scale) {
						if(false== isFind) {
							isFind= true;
							shortest= distance;
							shortestDoubleScale= doubleScale;
						}else {
							if(shortest< distance) {
								shortest= distance;
								shortestDoubleScale= doubleScale;
							}
						}
					}	
				}
				if(true== isFind) {
					Position2D currenctHeart= distanceHeart.get(shortestDoubleScale);
					//����õ��µ�����
					Position2D newHeart= Euclid.findCryptionPosition2D(currenctHeart, position2D);
					//ɾ����ǰ�������꼯���������꼯
					ArrayList<Position2D> ArrayList= distanceGroups.get(shortestDoubleScale);
					ArrayList.add(position2D);
					distanceGroups.put(shortestDoubleScale, ArrayList);
					//ɾ����ǰ�������ݣ�������������
					distanceHeart.put(shortestDoubleScale, newHeart);
				}else {
					ArrayList<Position2D> ArrayList= new ArrayList<>();
					ArrayList.add(position2D);
					distanceGroups.put(++i, ArrayList);
					distanceHeart.put(i, position2D);	
				}
			}
		}
		return distanceGroups;	
	}
	
	public static Map<Double, ArrayList<Position3D>> fissilePosition3DWithMatch(ArrayList<Position3D> groups
			, double scale) {
		Map<Double, ArrayList<Position3D>> distanceGroups= new HashMap<>();
		Map<Double, Position3D> distanceHeart= new HashMap<>();
		Iterator<Position3D> iterator= groups.iterator();
		double i= 0.0;
		while(iterator.hasNext()) {
			Position3D position3D= iterator.next();
			if(distanceGroups.isEmpty()) {
				ArrayList<Position3D> ArrayList= new ArrayList<>();
				ArrayList.add(position3D);
				distanceGroups.put(i, ArrayList);
				distanceHeart.put(i, position3D);
			}else {
				//����������
				//������ƥ������������´棬���Ǿ����롣
				Iterator<Double> iteratorScale= distanceHeart.keySet().iterator();
				double shortest= 0;
				double shortestDoubleScale = 0;
				boolean isFind= false;
				while(iteratorScale.hasNext()) {
					Double doubleScale= iteratorScale.next();
					Position3D currenctHeart= distanceHeart.get(doubleScale);
					double distance= Distance.getDistance3D(currenctHeart, position3D);
					if(distance< scale) {
						if(false== isFind) {
							isFind= true;
							shortest= distance;
							shortestDoubleScale= doubleScale;
						}else {
							if(shortest< distance) {
								shortest= distance;
								shortestDoubleScale= doubleScale;
							}
						}
					}	
				}
				if(true== isFind) {
					Position3D currenctHeart= distanceHeart.get(shortestDoubleScale);
					//����õ��µ�����
					Position3D newHeart= Euclid.findCryptionPosition3D(currenctHeart, position3D);
					//ɾ����ǰ�������꼯���������꼯
					ArrayList<Position3D> ArrayList= distanceGroups.get(shortestDoubleScale);
					ArrayList.add(position3D);
					distanceGroups.put(shortestDoubleScale, ArrayList);
					//ɾ����ǰ�������ݣ�������������
					distanceHeart.put(shortestDoubleScale, newHeart);
				}else {
					ArrayList<Position3D> ArrayList= new ArrayList<>();
					ArrayList.add(position3D);
					distanceGroups.put(++i, ArrayList);
					distanceHeart.put(i, position3D);	
				}
			}
		}
		return distanceGroups;	
	}
}