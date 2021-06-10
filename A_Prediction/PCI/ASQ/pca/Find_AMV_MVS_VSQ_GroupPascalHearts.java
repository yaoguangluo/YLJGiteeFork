package PCI.ASQ.pca;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Map;

import PCI.ASQ.classification.FissileWithMatch;
import PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import PCI.ASQ.demension.AMV_MVS_VSQ_3D;
import PCI.ASQ.demension.FindHeart_AMV_MVS_VSQ;
import PCI.ASQ.demension.FindMid_AMV_MVS_VSQ;
import PCI.ASQ.demension.Line2D;
import PCI.ASQ.demension.Line3D;

public class Find_AMV_MVS_VSQ_GroupPascalHearts{
	//ͨ�������ŵ� ����ƥ��ָ���ڲ���������� ���� ÿ�������ŵ� ���ĺ����ľ��� ��� ��ȡ��Ч�����ȶ��۲�����ģ��
	//˼�� ��˹����ŷ����£������ھ򣬱�Ҷ˹�����弸�Σ�������ѧ������������ѧ����ɢ��ѧ��ͳ��������� 20191227
	//ʵ�� ������ 
	public static Map<Double, AMV_MVS_VSQ_2D> getPosition2DsGroupPascalHearts(ArrayList<AMV_MVS_VSQ_2D> groups, double scale) {
		Map<Double, ArrayList<AMV_MVS_VSQ_2D>> pascalGroups= FissileWithMatch.fissilePosition2DWithMatch(groups, scale);
		Map<Double, AMV_MVS_VSQ_2D> pascalHearts= FindHeart_AMV_MVS_VSQ.getPosition2DGroupsHearts(pascalGroups);
		return pascalHearts;
	}
	
	public static Map<Double, AMV_MVS_VSQ_3D> getPosition3DsGroupPascalHearts(ArrayList<AMV_MVS_VSQ_3D> groups, double scale) {
		Map<Double, ArrayList<AMV_MVS_VSQ_3D>> pascalGroups= FissileWithMatch.fissilePosition3DWithMatch(groups, scale);
		Map<Double, AMV_MVS_VSQ_3D> pascalHearts= FindHeart_AMV_MVS_VSQ.getPosition3DGroupsHearts(pascalGroups);
		return pascalHearts;
	}
	
	public static Map<Double, AMV_MVS_VSQ_2D> getPosition2DsGroupPascalMids(ArrayList<AMV_MVS_VSQ_2D> groups, double scale) {
		Map<Double, ArrayList<AMV_MVS_VSQ_2D>> pascalGroups= FissileWithMatch.fissilePosition2DWithMatch(groups, scale);
		Map<Double, AMV_MVS_VSQ_2D> pascalMids=  FindMid_AMV_MVS_VSQ.getPosition2DGroupsMids(pascalGroups);
		return pascalMids;
	}
	
	public static Map<Double, AMV_MVS_VSQ_3D> getPosition3DsGroupPascalMids(ArrayList<AMV_MVS_VSQ_3D> groups, double scale) {
		Map<Double, ArrayList<AMV_MVS_VSQ_3D>> pascalGroups= FissileWithMatch.fissilePosition3DWithMatch(groups, scale);
		Map<Double, AMV_MVS_VSQ_3D> pascalMids= FindMid_AMV_MVS_VSQ.getPosition3DGroupsMids(pascalGroups);
		return pascalMids;
	}
	
	public static Map<Double, Line2D> getPosition2DsGroupPascalDirection(Map<Double, AMV_MVS_VSQ_2D> pascalHearts
			, Map<Double, AMV_MVS_VSQ_2D> pascalMids) {
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
	
	public static Map<Double, Line3D> getPosition3DsGroupPascalDirection(Map<Double, AMV_MVS_VSQ_3D> pascalHearts
			, Map<Double, AMV_MVS_VSQ_3D> pascalMids) {
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
	
	public static Map<Double, Line3D> getPosition3DsGroupPascalDirection(ArrayList<AMV_MVS_VSQ_3D> groups, double scale){
		return	getPosition3DsGroupPascalDirection(getPosition3DsGroupPascalHearts(groups, scale)
				,getPosition3DsGroupPascalMids(groups, scale)); 
	}
	
	public static Map<Double, Line2D> getPosition2DsGroupPascalDirection(ArrayList<AMV_MVS_VSQ_2D> groups, double scale){
		return	getPosition2DsGroupPascalDirection(getPosition2DsGroupPascalHearts(groups, scale)
				,getPosition2DsGroupPascalMids(groups, scale)); 
	}
}