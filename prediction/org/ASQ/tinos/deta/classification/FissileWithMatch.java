package org.ASQ.tinos.deta.classification;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.ASQ.tinos.deta.basic.Distance;
import org.ASQ.tinos.deta.basic.Euclid;
import org.ASQ.tinos.deta.demension.Position2D;
import org.ASQ.tinos.deta.demension.Position3D;
//task 20191219 daytime
//ͨ��scale ���������� ����������, ��ƥ�����������������롣
//�㷨 ��ʱ������׼ȷ�������ӡ�
//Theory yaoguang.luo 20191219~23�� ŷ�����
//Application yaoguang.luo
public class FissileWithMatch{
	public static Map<Double, ArrayList<Position2D>> fissilePosition2DWithMatch(ArrayList<Position2D> groups
			, double scale) {
		if(null== groups) {
			return new HashMap<Double, ArrayList<Position2D>>();
		}
		Map<Double, ArrayList<Position2D>> distanceGroups= new HashMap<>();
		Map<Double, Position2D> distanceHeart= new HashMap<>();
		Iterator<Position2D> iterator= groups.iterator();
		double i= 0.0;
		while(iterator.hasNext()) {
			Position2D AMV_MVS_VSQ2D= iterator.next();
			if(distanceGroups.isEmpty()) {
				ArrayList<Position2D> list= new ArrayList<>();
				list.add(AMV_MVS_VSQ2D);
				distanceGroups.put(i, list);
				distanceHeart.put(i, AMV_MVS_VSQ2D);
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
					double distance= Distance.getDistance2D(currenctHeart, AMV_MVS_VSQ2D);
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
					Position2D newHeart= Euclid.findCryptionPosition2D(currenctHeart, AMV_MVS_VSQ2D);
					//ɾ����ǰ�������꼯���������꼯
					ArrayList<Position2D> list= distanceGroups.get(shortestDoubleScale);
					list.add(AMV_MVS_VSQ2D);
					distanceGroups.put(shortestDoubleScale, list);
					//ɾ����ǰ�������ݣ�������������
					distanceHeart.put(shortestDoubleScale, newHeart);
				}else {
					ArrayList<Position2D> list= new ArrayList<>();
					list.add(AMV_MVS_VSQ2D);
					distanceGroups.put(++i, list);
					distanceHeart.put(i, AMV_MVS_VSQ2D);	
				}
			}
		}
		return distanceGroups;	
	}
	
	public static Map<Double, List<Position3D>> fissilePosition3DWithMatch(List<Position3D> groups
			, double scale) {
		Map<Double, List<Position3D>> distanceGroups= new HashMap<>();
		Map<Double, Position3D> distanceHeart= new HashMap<>();
		Iterator<Position3D> iterator= groups.iterator();
		double i= 0.0;
		while(iterator.hasNext()) {
			Position3D AMV_MVS_VSQ3D= iterator.next();
			if(distanceGroups.isEmpty()) {
				List<Position3D> list= new ArrayList<>();
				list.add(AMV_MVS_VSQ3D);
				distanceGroups.put(i, list);
				distanceHeart.put(i, AMV_MVS_VSQ3D);
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
					double distance= Distance.getDistance3D(currenctHeart, AMV_MVS_VSQ3D);
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
					Position3D newHeart= Euclid.findCryptionPosition3D(currenctHeart, AMV_MVS_VSQ3D);
					//ɾ����ǰ�������꼯���������꼯
					List<Position3D> list= distanceGroups.get(shortestDoubleScale);
					list.add(AMV_MVS_VSQ3D);
					distanceGroups.put(shortestDoubleScale, list);
					//ɾ����ǰ�������ݣ�������������
					distanceHeart.put(shortestDoubleScale, newHeart);
				}else {
					List<Position3D> list= new ArrayList<>();
					list.add(AMV_MVS_VSQ3D);
					distanceGroups.put(++i, list);
					distanceHeart.put(i, AMV_MVS_VSQ3D);	
				}
			}
		}
		return distanceGroups;	
	}
}