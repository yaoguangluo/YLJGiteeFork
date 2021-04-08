package org.ASQ.tinos.deta.pca;
import java.util.Iterator;
import java.util.List;

import org.ASQ.tinos.deta.basic.Distance;
import org.ASQ.tinos.deta.demension.Position2D;
import org.ASQ.tinos.deta.demension.Position3D;
import org.ASQ.tinos.deta.statistic.LYG9DWithDoubleQuickSort4D;
public class FindPCAMeanDistance{
	//oberserverPCAScale��ȷ����Ҫ��Ч���·���Ĺ۲���
	//sortRangeScale��ȷ�������������ʱ�����Ƴɷݶ�����ȷ����ջ����ȣ������ջ�����
	//�������ŵ���Ҫ��Ч����ɷݼ���ƽ��ѹǿ�㷨
	//������ �۲�/Ԥ�����꼯��ĳ�����ڽ����꼯�� ƽ������ ��ȷ�� ���նȣ�ѹ����ѹǿ�������ȡ�
	//˼�룺������ 20191225
	//ʵ�֣�������
	public static double findMeanDistanceFromPositions2D(List<Position2D> AMV_MVS_VSQ2Ds
			, double oberserverPCAScale, int sortRangeScale) {
		Iterator<Position2D> outPosition2DIterator= AMV_MVS_VSQ2Ds.iterator();
		double outMean= 0;
		while(outPosition2DIterator.hasNext()) {
			Position2D outPosition2D= outPosition2DIterator.next();
			double[] distance= new double[AMV_MVS_VSQ2Ds.size()];
			int i= 0;
			Iterator<Position2D> inPosition2DIterator= AMV_MVS_VSQ2Ds.iterator();
			//ȡ��������о��뼯����
			while(inPosition2DIterator.hasNext()) {
				Position2D inPosition2D= inPosition2DIterator.next();
				distance[i++]= Distance.getDistance2D(outPosition2D, inPosition2D);
			}
			//����ǶԳ�ȱ��С�߷���˼��ٿ��� ��С����
			distance= new LYG9DWithDoubleQuickSort4D().sort(distance, sortRangeScale, 70);
			//����ȡ����������������ƽ��ֵ��0 Ϊ�������Դ� 1 ��ʼ
			double inMean= 0;
			oberserverPCAScale= oberserverPCAScale>= AMV_MVS_VSQ2Ds.size()
					? AMV_MVS_VSQ2Ds.size()- 1: oberserverPCAScale;
			oberserverPCAScale= oberserverPCAScale< 0? 0: oberserverPCAScale;	
			for(i= 1; i<= oberserverPCAScale; i++) {
				inMean+= distance[i];
			}
			inMean/= oberserverPCAScale;
			outMean+= inMean;
		}
		return outMean/ AMV_MVS_VSQ2Ds.size();
	}
	
	public static double findMeanDistanceFromPositions3D(List<Position3D> AMV_MVS_VSQ3Ds
			, double oberserverPCAScale, int sortRangeScale) {
		Iterator<Position3D> outPosition3DIterator= AMV_MVS_VSQ3Ds.iterator();
		double outMean= 0;
		while(outPosition3DIterator.hasNext()) {
			Position3D outPosition3D= outPosition3DIterator.next();
			double[] distance= new double[AMV_MVS_VSQ3Ds.size()];
			int i= 0;
			Iterator<Position3D> inPosition3DIterator= AMV_MVS_VSQ3Ds.iterator();
			//ȡ��������о��뼯����
			while(inPosition3DIterator.hasNext()) {
				Position3D inPosition3D= inPosition3DIterator.next();
				distance[i++]= Distance.getDistance3D(outPosition3D, inPosition3D);
			}
			//����ǶԳ�ȱ��С�߷���˼��ٿ��� ��С����
			distance= new LYG9DWithDoubleQuickSort4D().sort(distance, sortRangeScale, 70);
			//����ȡ����������������ƽ��ֵ��0 Ϊ�������Դ� 1 ��ʼ
			double inMean= 0;
			oberserverPCAScale= oberserverPCAScale>= AMV_MVS_VSQ3Ds.size()
					? AMV_MVS_VSQ3Ds.size()- 1: oberserverPCAScale;
			oberserverPCAScale= oberserverPCAScale< 0? 0: oberserverPCAScale;	
			for(i= 1; i<= oberserverPCAScale; i++) {
				inMean+= distance[i];
			}
			inMean/= oberserverPCAScale;
			outMean+= inMean;
		}
		return outMean/ AMV_MVS_VSQ3Ds.size();
	}
	
	//2D�������� ÿһ������ĳ���Ԥ���㷨��
	public static double[] findPascalMeanDistanceByEachPositions2D(List<Position2D> AMV_MVS_VSQ2Ds
			, double oberserverPCAScale, int sortRangeScale) {
		double[] pascal= new double[AMV_MVS_VSQ2Ds.size()];
		Iterator<Position2D> outPosition2DIterator= AMV_MVS_VSQ2Ds.iterator();
		double outMean= 0;
		int AMV_MVS_VSQPoint=0;
		while(outPosition2DIterator.hasNext()) {
			Position2D outPosition2D= outPosition2DIterator.next();
			double[] distance= new double[AMV_MVS_VSQ2Ds.size()];
			int i= 0;
			Iterator<Position2D> inPosition2DIterator= AMV_MVS_VSQ2Ds.iterator();
			//ȡ��������о��뼯����
			while(inPosition2DIterator.hasNext()) {
				Position2D inPosition2D= inPosition2DIterator.next();
				distance[i++]= Distance.getDistance2D(outPosition2D, inPosition2D);
			}
			//����ǶԳ�ȱ��С�߷���˼��ٿ��� ��С����
			distance= new LYG9DWithDoubleQuickSort4D().sort(distance, sortRangeScale, 70);
			//����ȡ����������������ƽ��ֵ��0 Ϊ�������Դ� 1 ��ʼ
			double inMean= 0;
			oberserverPCAScale= oberserverPCAScale>= AMV_MVS_VSQ2Ds.size()
					? AMV_MVS_VSQ2Ds.size()- 1: oberserverPCAScale;
			oberserverPCAScale= oberserverPCAScale< 0? 0: oberserverPCAScale;	
			for(i= 1; i<= oberserverPCAScale; i++) {
				inMean+= distance[i];
			}
			inMean/= oberserverPCAScale;
			outMean+= inMean;
			//�ɼ�������γɳ������յ���Ҫ���·���ɷݡ�
			pascal[AMV_MVS_VSQPoint++]= inMean;
		}
		outMean/= AMV_MVS_VSQ2Ds.size();
		for(int i= 0; i< pascal.length; i++) {
			//��ֵ��ȡ ���ȶ� �۲����ݡ�
			pascal[i]/= outMean;
		}
		return pascal;
	}
	
	//3D�������� ÿһ������ĳ���Ԥ���㷨��
	public static double[] findPascalMeanDistanceByEachPositions3D(List<Position3D> AMV_MVS_VSQ3Ds
			, double oberserverPCAScale, int sortRangeScale) {
		double[] pascal= new double[AMV_MVS_VSQ3Ds.size()];
		Iterator<Position3D> outPosition3DIterator= AMV_MVS_VSQ3Ds.iterator();
		double outMean= 0;
		int AMV_MVS_VSQPoint=0;
		while(outPosition3DIterator.hasNext()) {
			Position3D outPosition3D= outPosition3DIterator.next();
			double[] distance= new double[AMV_MVS_VSQ3Ds.size()];
			int i= 0;
			Iterator<Position3D> inPosition3DIterator= AMV_MVS_VSQ3Ds.iterator();
			//ȡ��������о��뼯����
			while(inPosition3DIterator.hasNext()) {
				Position3D inPosition3D= inPosition3DIterator.next();
				distance[i++]= Distance.getDistance3D(outPosition3D, inPosition3D);
			}
			//����ǶԳ�ȱ��С�߷���˼��ٿ��� ��С����
			distance= new LYG9DWithDoubleQuickSort4D().sort(distance, sortRangeScale, 70);
			//����ȡ����������������ƽ��ֵ��0 Ϊ�������Դ� 1 ��ʼ
			double inMean= 0;
			oberserverPCAScale= oberserverPCAScale>= AMV_MVS_VSQ3Ds.size()
					? AMV_MVS_VSQ3Ds.size()- 1: oberserverPCAScale;
			oberserverPCAScale= oberserverPCAScale< 0? 0: oberserverPCAScale;	
			for(i= 1; i<= oberserverPCAScale; i++) {
				inMean+= distance[i];
			}
			inMean/= oberserverPCAScale;
			outMean+= inMean;
			//�ɼ�������γɳ������յ���Ҫ���·���ɷݡ�
			pascal[AMV_MVS_VSQPoint++]= inMean;
		}
		outMean/= AMV_MVS_VSQ3Ds.size();
		for(int i= 0; i< pascal.length; i++) {
			//��ֵ��ȡ ���ȶ� �۲����ݡ�
			pascal[i]/= outMean;
		}
		return pascal;
	}
}