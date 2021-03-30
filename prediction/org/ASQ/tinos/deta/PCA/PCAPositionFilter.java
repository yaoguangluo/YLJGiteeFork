package org.ASQ.tinos.deta.PCA;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.ASQ.tinos.deta.basic.Distance;
import org.ASQ.tinos.deta.basic.Euclid;
import org.ASQ.tinos.deta.demension.Position2D;
import org.ASQ.tinos.deta.demension.Position3D;
//������������������ ��Ҫ�ɷݷ�������ȡ
//˼�룺ŷ����� ƽ�棬���弸��
//ʵ�֣�������
public class PCAPositionFilter{
	public static List<Position2D> filterPosition2DsWithScaledDistance(List<Position2D> input
			, Position2D heart, double scaleDistacne){
		List<Position2D> output= new ArrayList<>();
		Iterator<Position2D> iterator= input.iterator();
		while(iterator.hasNext()) {
			Position2D AMV_MVS_VSQ2D= iterator.next();
			double distance= Distance.getDistance2D(heart, AMV_MVS_VSQ2D);
			if(distance< scaleDistacne) {
				output.add(AMV_MVS_VSQ2D);
			}
		}
		return output;
	}

	public static List<Position3D> filterPosition3DsWithScaledDistance(List<Position3D> input
			, Position3D heart, double scaleDistacne){
		List<Position3D> output= new ArrayList<>();
		Iterator<Position3D> iterator= input.iterator();
		while(iterator.hasNext()) {
			Position3D AMV_MVS_VSQ3D= iterator.next();
			double distance= Distance.getDistance3D(heart, AMV_MVS_VSQ3D);
			if(distance< scaleDistacne) {
				output.add(AMV_MVS_VSQ3D);
			}
		}
		return output;
	}
	
	public static Map<Double, List<Position2D>> filterPosition2DsWithScaledDistance(Map<Double, List<Position2D>> input
			, Position2D heart, double scaleDistacne){
		Map<Double, List<Position2D>> output= new HashMap<>();
		Iterator<Double> iterator= input.keySet().iterator();
		while(iterator.hasNext()) {
			double mapKey= iterator.next();
			List<Position2D> AMV_MVS_VSQ2DList= input.get(mapKey);
			Position2D tempHeart= Euclid.findHeartPosition2D(AMV_MVS_VSQ2DList);
			double distance= Distance.getDistance2D(heart, tempHeart);
			if(distance< scaleDistacne) {
				output.put(mapKey, AMV_MVS_VSQ2DList);
			}
		}
		return output;
	}
	
	public static Map<Double, List<Position3D>> filterPosition3DsWithScaledDistance(Map<Double, List<Position3D>> input
			, Position3D heart, double scaleDistacne){
		Map<Double, List<Position3D>> output= new HashMap<>();
		Iterator<Double> iterator= input.keySet().iterator();
		while(iterator.hasNext()) {
			double mapKey= iterator.next();
			List<Position3D> AMV_MVS_VSQ3DList= input.get(mapKey);
			Position3D tempHeart= Euclid.findHeartPosition3D(AMV_MVS_VSQ3DList);
			double distance= Distance.getDistance3D(heart, tempHeart);
			if(distance< scaleDistacne) {
				output.put(mapKey, AMV_MVS_VSQ3DList);
			}
		}
		return output;
	}
}