package org.ASQ.tinos.deta.cluster;

import java.util.List;

import org.ASQ.tinos.deta.basic.Distance;
import org.ASQ.tinos.deta.basic.Euclid;
import org.ASQ.tinos.deta.demension.Position2D;
import org.ASQ.tinos.deta.demension.Position3D;

public class ClusterAttraction{
	//�ٽ�2�������ŵ��໥�������㷨��ģ�۲⣬С��1 ����������1 �ų⡣
	//˼�룺 �����⣬ŷ����£� ���弸�Σ�20191227
	//ʵ�֣� ������
	public static double getTwoPosition2DClusterAttraction(List<Position2D> clusterOne, List<Position2D> clusterTwo) {
		Position2D midOne= Euclid.findMidPosition2D(clusterOne);
		Position2D midTwo= Euclid.findMidPosition2D(clusterTwo);
		Position2D heartOne= Euclid.findHeartPosition2D(clusterOne);
		Position2D heartTwo= Euclid.findHeartPosition2D(clusterTwo);
		double midDistance= Distance.getDistance2D(midOne, midTwo);
		double heartDistance= Distance.getDistance2D(heartOne, heartTwo);
		return heartDistance/ midDistance;
	}
	
	public static double getTwoPosition3DClusterAttraction(List<Position3D> clusterOne, List<Position3D> clusterTwo) {
		Position3D midOne= Euclid.findMidPosition3D(clusterOne);
		Position3D midTwo= Euclid.findMidPosition3D(clusterTwo);
		Position3D heartOne= Euclid.findHeartPosition3D(clusterOne);
		Position3D heartTwo= Euclid.findHeartPosition3D(clusterTwo);
		double midDistance= Distance.getDistance3D(midOne, midTwo);
		double heartDistance= Distance.getDistance3D(heartOne, heartTwo);
		return heartDistance/ midDistance;
	}
}