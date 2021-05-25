package OSI.PCI.ASQ.demension;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import OSI.PCI.ASQ.basic.Euclid;
public class FindHeartPositions{
	//�������ŵ����ġ�
	public static Map<Double, Position2D> getPosition2DGroupsHearts(Map<Double, ArrayList<Position2D>> groups){
		Map<Double, Position2D> output= new HashMap<>(); 
		Iterator<Double> iterator= output.keySet().iterator();
		while(iterator.hasNext()){
			double value= iterator.next();
			output.put(value, Euclid.findHeartPosition2D(groups.get(value)));
		}
		return output;
		
	}
	
	public static Map<Double, Position3D> getPosition3DGroupsHearts(Map<Double, ArrayList<Position3D>> groups){
		Map<Double, Position3D> output= new HashMap<>(); 
		Iterator<Double> iterator= output.keySet().iterator();
		while(iterator.hasNext()){
			double value= iterator.next();
			output.put(value, Euclid.findHeartPosition3D(groups.get(value)));
		}
		return output;
		
	}
}