package OSI.OSU.ASQ.tinos.deta.isolation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import OSI.OSU.ASQ.tinos.deta.basic.Distance;
import OSI.OSU.ASQ.tinos.deta.demension.Position2D;
import OSI.OSU.ASQ.tinos.deta.demension.Position3D;
public class ForestIsolation{
	//������ 2ά ����·���Ŵ� ɭ�ֵ�Ԫ ���� �㷨
	//Theory ��������: Ȩ�ࡷ��ŷ����£� Yaoguang.Luo 20191220
	//Application Yaoguang.Luo 
	//������ ���·������С���룬���÷���Ԥ�⣬����Ŀ��
	public static Map<Double, List<Position2D>> getTSPForestIsolationGroups2D(
			List<Position2D> groups, double scale) {
		Map<Double, List<Position2D>> output= new HashMap<>(); 
		Iterator<Position2D> iterator= groups.iterator();
		double i= 0;
		while(iterator.hasNext()) {
			i++;
			Position2D AMV_MVS_VSQ2D= iterator.next();
			Iterator<Position2D> inIterator= groups.iterator();
			double j= 0;
			Here:
				while(inIterator.hasNext()) {
					j++;
					Position2D inPosition2D= inIterator.next();
					//����
					if(i== j) {
						continue Here;
					}
					double distance= Distance.getDistance2D(AMV_MVS_VSQ2D, inPosition2D);
					if(distance> scale) {
						continue Here;
					}
					//���
					List<Position2D> list;
					if(output.containsKey(i)) {
						list= output.get(i);
					}else {
						list= new ArrayList<>();
						list.add(AMV_MVS_VSQ2D);
					}
					list.add(inPosition2D);
					output.put(i, list);
				}
		}
		return output;	
	}

	//������ 3ά ����·���Ŵ� ɭ�ֵ�Ԫ ���� �㷨
	//Theory ��������: Ȩ�ࡷ��ŷ����£� Yaoguang.Luo 20191220
	//Application Yaoguang.Luo 
	//������ ���·������С���룬���÷���Ԥ�⣬����Ŀ��
	public static Map<Double, List<Position3D>> getTSPIsolationGroups3D(
			List<Position3D> groups, double scale) {
		Map<Double, List<Position3D>> output= new HashMap<>(); 
		Iterator<Position3D> iterator= groups.iterator();
		double i= 0;
		while(iterator.hasNext()) {
			i++;
			Position3D AMV_MVS_VSQ3D= iterator.next();
			Iterator<Position3D> inIterator= groups.iterator();
			double j= 0;
			Here:
				while(inIterator.hasNext()) {
					j++;
					Position3D inPosition3D= inIterator.next();
					//����
					if(i== j) {
						continue Here;
					}
					double distance= Distance.getDistance3D(AMV_MVS_VSQ3D, inPosition3D);
					if(distance> scale) {
						continue Here;
					}
					//���
					List<Position3D> list;
					if(output.containsKey(i)) {
						list= output.get(i);
					}else {
						list= new ArrayList<>();
						list.add(AMV_MVS_VSQ3D);
					}
					list.add(inPosition3D);
					output.put(i, list);
				}
		}
		return output;	
	}
}