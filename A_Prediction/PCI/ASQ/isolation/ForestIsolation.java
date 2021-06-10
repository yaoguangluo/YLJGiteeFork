package PCI.ASQ.isolation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import PCI.ASQ.basic.Distance;
import PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import PCI.ASQ.demension.AMV_MVS_VSQ_3D;
public class ForestIsolation{
	//������ 2ά ����·���Ŵ� ɭ�ֵ�Ԫ ���� �㷨
	//Theory ��������: Ȩ�ࡷ��ŷ����£� Yaoguang.Luo 20191220
	//Application Yaoguang.Luo 
	//������ ���·������С���룬���÷���Ԥ�⣬����Ŀ��
	public static Map<Double, List<AMV_MVS_VSQ_2D>> getTSPForestIsolationGroups2D(
			List<AMV_MVS_VSQ_2D> groups, double scale) {
		Map<Double, List<AMV_MVS_VSQ_2D>> output= new HashMap<>(); 
		Iterator<AMV_MVS_VSQ_2D> iterator= groups.iterator();
		double i= 0;
		while(iterator.hasNext()) {
			i++;
			AMV_MVS_VSQ_2D AMV_MVS_VSQ2D= iterator.next();
			Iterator<AMV_MVS_VSQ_2D> inIterator= groups.iterator();
			double j= 0;
			Here:
				while(inIterator.hasNext()) {
					j++;
					AMV_MVS_VSQ_2D inPosition2D= inIterator.next();
					//����
					if(i== j) {
						continue Here;
					}
					double distance= Distance.getDistance2D(AMV_MVS_VSQ2D, inPosition2D);
					if(distance> scale) {
						continue Here;
					}
					//���
					List<AMV_MVS_VSQ_2D> list;
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
	public static Map<Double, List<AMV_MVS_VSQ_3D>> getTSPIsolationGroups3D(
			List<AMV_MVS_VSQ_3D> groups, double scale) {
		Map<Double, List<AMV_MVS_VSQ_3D>> output= new HashMap<>(); 
		Iterator<AMV_MVS_VSQ_3D> iterator= groups.iterator();
		double i= 0;
		while(iterator.hasNext()) {
			i++;
			AMV_MVS_VSQ_3D AMV_MVS_VSQ3D= iterator.next();
			Iterator<AMV_MVS_VSQ_3D> inIterator= groups.iterator();
			double j= 0;
			Here:
				while(inIterator.hasNext()) {
					j++;
					AMV_MVS_VSQ_3D inPosition3D= inIterator.next();
					//����
					if(i== j) {
						continue Here;
					}
					double distance= Distance.getDistance3D(AMV_MVS_VSQ3D, inPosition3D);
					if(distance> scale) {
						continue Here;
					}
					//���
					List<AMV_MVS_VSQ_3D> list;
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