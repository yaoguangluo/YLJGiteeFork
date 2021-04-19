package OSI.OSU.ASQ.tinos.deta.pca;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Map;

import OSI.OSU.ASQ.tinos.deta.classification.FissileWithMatch;
import OSI.OSU.ASQ.tinos.deta.demension.FindHeartPositions;
import OSI.OSU.ASQ.tinos.deta.demension.FindMidPositions;
import OSI.OSU.ASQ.tinos.deta.demension.Line2D;
import OSI.OSU.ASQ.tinos.deta.demension.Line3D;
import OSI.OSU.ASQ.tinos.deta.demension.Position2D;
import OSI.OSU.ASQ.tinos.deta.demension.Position3D;

public class FindPositionsGroupPascalHearts{
	//ͨ�������ŵ� ����ƥ��ָ���ڲ���������� ���� ÿ�������ŵ� ���ĺ����ľ��� ��� ��ȡ��Ч�����ȶ��۲�����ģ��
	//˼�� ��˹����ŷ����£������ھ򣬱�Ҷ˹�����弸�Σ�������ѧ������������ѧ����ɢ��ѧ��ͳ��������� 20191227
	//ʵ�� ������ 
	public static Map<Double, Position2D> getPosition2DsGroupPascalHearts(ArrayList<Position2D> groups, double scale) {
		Map<Double, ArrayList<Position2D>> pascalGroups= FissileWithMatch.fissilePosition2DWithMatch(groups, scale);
		Map<Double, Position2D> pascalHearts= FindHeartPositions.getPosition2DGroupsHearts(pascalGroups);
		return pascalHearts;
	}
	
	public static Map<Double, Position3D> getPosition3DsGroupPascalHearts(ArrayList<Position3D> groups, double scale) {
		Map<Double, ArrayList<Position3D>> pascalGroups= FissileWithMatch.fissilePosition3DWithMatch(groups, scale);
		Map<Double, Position3D> pascalHearts= FindHeartPositions.getPosition3DGroupsHearts(pascalGroups);
		return pascalHearts;
	}
	
	public static Map<Double, Position2D> getPosition2DsGroupPascalMids(ArrayList<Position2D> groups, double scale) {
		Map<Double, ArrayList<Position2D>> pascalGroups= FissileWithMatch.fissilePosition2DWithMatch(groups, scale);
		Map<Double, Position2D> pascalMids=  FindMidPositions.getPosition2DGroupsMids(pascalGroups);
		return pascalMids;
	}
	
	public static Map<Double, Position3D> getPosition3DsGroupPascalMids(ArrayList<Position3D> groups, double scale) {
		Map<Double, ArrayList<Position3D>> pascalGroups= FissileWithMatch.fissilePosition3DWithMatch(groups, scale);
		Map<Double, Position3D> pascalMids= FindMidPositions.getPosition3DGroupsMids(pascalGroups);
		return pascalMids;
	}
	
	public static Map<Double, Line2D> getPosition2DsGroupPascalDirection(Map<Double, Position2D> pascalHearts
			, Map<Double, Position2D> pascalMids) {
		Map<Double, Line2D> pascalDirections= new HashMap<>();
		Iterator<Double> iterator= pascalHearts.keySet().iterator();
		while(iterator.hasNext()) {
			double key= iterator.next();
			Line2D value= new Line2D();
			value.setBegin(pascalMids.get(key));
			value.setEnd(pascalHearts.get(key));
			pascalDirections.put(key, value);
		}
		return pascalDirections;
	}
	
	public static Map<Double, Line3D> getPosition3DsGroupPascalDirection(Map<Double, Position3D> pascalHearts
			, Map<Double, Position3D> pascalMids) {
		Map<Double, Line3D> pascalDirections= new HashMap<>();
		Iterator<Double> iterator= pascalHearts.keySet().iterator();
		while(iterator.hasNext()) {
			double key= iterator.next();
			Line3D value= new Line3D();
			value.setBegin(pascalMids.get(key));
			value.setEnd(pascalHearts.get(key));
			pascalDirections.put(key, value);
		}
		return pascalDirections;
	}
	
	public static Map<Double, Line3D> getPosition3DsGroupPascalDirection(ArrayList<Position3D> groups, double scale){
		return	getPosition3DsGroupPascalDirection(getPosition3DsGroupPascalHearts(groups, scale)
				,getPosition3DsGroupPascalMids(groups, scale)); 
	}
	
	public static Map<Double, Line2D> getPosition2DsGroupPascalDirection(ArrayList<Position2D> groups, double scale){
		return	getPosition2DsGroupPascalDirection(getPosition2DsGroupPascalHearts(groups, scale)
				,getPosition2DsGroupPascalMids(groups, scale)); 
	}
}