package OSI.PCI.ASQ.pca;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import OSI.PCI.ASQ.basic.Distance;
import OSI.PCI.ASQ.basic.Euclid;
import OSI.PCI.ASQ.demension.Position2D;
import OSI.PCI.ASQ.demension.Position3D;
//������������������ ��Ҫ�ɷݷ�������ȡ
//˼�룺ŷ����� ƽ�棬���弸��
//ʵ�֣�������
public class PCAPositionFilter{
	public static List<Position2D> filterPosition2DsWithScaledDistance(List<Position2D> input
			, Position2D heart, double scaleDistacne){
		List<Position2D> output= new ArrayList<>();
		Iterator<Position2D> iterator= input.iterator();
		while(iterator.hasNext()) {
			Position2D position2D= iterator.next();
			double distance= Distance.getDistance2D(heart, position2D);
			if(distance< scaleDistacne) {
				output.add(position2D);
			}
		}
		return output;
	}

	public static List<Position3D> filterPosition3DsWithScaledDistance(List<Position3D> input
			, Position3D heart, double scaleDistacne){
		List<Position3D> output= new ArrayList<>();
		Iterator<Position3D> iterator= input.iterator();
		while(iterator.hasNext()) {
			Position3D position3D= iterator.next();
			double distance= Distance.getDistance3D(heart, position3D);
			if(distance< scaleDistacne) {
				output.add(position3D);
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
			List<Position2D> position2DList= input.get(mapKey);
			Position2D tempHeart= Euclid.findHeartPosition2D(position2DList);
			double distance= Distance.getDistance2D(heart, tempHeart);
			if(distance< scaleDistacne) {
				output.put(mapKey, position2DList);
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
			List<Position3D> position3DList= input.get(mapKey);
			Position3D tempHeart= Euclid.findHeartPosition3D(position3DList);
			double distance= Distance.getDistance3D(heart, tempHeart);
			if(distance< scaleDistacne) {
				output.put(mapKey, position3DList);
			}
		}
		return output;
	}
}