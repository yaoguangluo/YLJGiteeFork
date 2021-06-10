package PCI.ASQ.pca;
import java.util.Iterator;
import java.util.List;

import OEU.LYG4DQS4D.LYG9DWithDoubleQuickSort4D;
//import OSI.PCI.ASQ.statistic.LYG4DWithDoubleQuickSort4D;
import PCI.ASQ.basic.Distance;
import PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import PCI.ASQ.demension.AMV_MVS_VSQ_3D;

public class FindPCAMeanDistance{
	//oberserverPCAScale��ȷ����Ҫ��Ч���·���Ĺ۲���
	//sortRangeScale��ȷ�������������ʱ�����Ƴɷݶ�����ȷ����ջ����ȣ������ջ�����
	//�������ŵ���Ҫ��Ч����ɷݼ���ƽ��ѹǿ�㷨
	//������ �۲�/Ԥ�����꼯��ĳ�����ڽ����꼯�� ƽ������ ��ȷ�� ���նȣ�ѹ����ѹǿ�������ȡ�
	//˼�룺������ 20191225
	//ʵ�֣�������
	public static double findMeanDistanceFromPositions2D(List<AMV_MVS_VSQ_2D> position2Ds
			, double oberserverPCAScale, int sortRangeScale) {
		Iterator<AMV_MVS_VSQ_2D> outPosition2DIterator= position2Ds.iterator();
		double outMean= 0;
		while(outPosition2DIterator.hasNext()) {
			AMV_MVS_VSQ_2D outPosition2D= outPosition2DIterator.next();
			double[] distance= new double[position2Ds.size()];
			int i= 0;
			Iterator<AMV_MVS_VSQ_2D> inPosition2DIterator= position2Ds.iterator();
			//ȡ��������о��뼯����
			while(inPosition2DIterator.hasNext()) {
				AMV_MVS_VSQ_2D inPosition2D= inPosition2DIterator.next();
				distance[i++]= Distance.getDistance2D(outPosition2D, inPosition2D);
			}
			//����ǶԳ�ȱ��С�߷���˼��ٿ��� ��С����
			//distance= new LYG4DWithDoubleQuickSort4D().sort(distance, sortRangeScale);
			distance= new LYG9DWithDoubleQuickSort4D().sort(distance, sortRangeScale, 4);//�㷨Ӧ�ø���
			//����ȡ����������������ƽ��ֵ��0 Ϊ�������Դ� 1 ��ʼ
			double inMean= 0;
			oberserverPCAScale= oberserverPCAScale>= position2Ds.size()
					? position2Ds.size()- 1: oberserverPCAScale;
			oberserverPCAScale= oberserverPCAScale< 0? 0: oberserverPCAScale;	
			for(i= 1; i<= oberserverPCAScale; i++) {
				inMean+= distance[i];
			}
			inMean/= oberserverPCAScale;
			outMean+= inMean;
		}
		return outMean/ position2Ds.size();
	}
	
	public static double findMeanDistanceFromPositions3D(List<AMV_MVS_VSQ_3D> position3Ds
			, double oberserverPCAScale, int sortRangeScale) {
		Iterator<AMV_MVS_VSQ_3D> outPosition3DIterator= position3Ds.iterator();
		double outMean= 0;
		while(outPosition3DIterator.hasNext()) {
			AMV_MVS_VSQ_3D outPosition3D= outPosition3DIterator.next();
			double[] distance= new double[position3Ds.size()];
			int i= 0;
			Iterator<AMV_MVS_VSQ_3D> inPosition3DIterator= position3Ds.iterator();
			//ȡ��������о��뼯����
			while(inPosition3DIterator.hasNext()) {
				AMV_MVS_VSQ_3D inPosition3D= inPosition3DIterator.next();
				distance[i++]= Distance.getDistance3D(outPosition3D, inPosition3D);
			}
			//����ǶԳ�ȱ��С�߷���˼��ٿ��� ��С����
			//distance= new LYG4DWithDoubleQuickSort4D().sort(distance, sortRangeScale);
			distance= new LYG9DWithDoubleQuickSort4D().sort(distance, sortRangeScale, 4);//�㷨Ӧ�ø���
			//����ȡ����������������ƽ��ֵ��0 Ϊ�������Դ� 1 ��ʼ
			double inMean= 0;
			oberserverPCAScale= oberserverPCAScale>= position3Ds.size()
					? position3Ds.size()- 1: oberserverPCAScale;
			oberserverPCAScale= oberserverPCAScale< 0? 0: oberserverPCAScale;	
			for(i= 1; i<= oberserverPCAScale; i++) {
				inMean+= distance[i];
			}
			inMean/= oberserverPCAScale;
			outMean+= inMean;
		}
		return outMean/ position3Ds.size();
	}
	
	//2D�������� ÿһ������ĳ���Ԥ���㷨��
	public static double[] findPascalMeanDistanceByEachPositions2D(List<AMV_MVS_VSQ_2D> position2Ds
			, double oberserverPCAScale, int sortRangeScale) {
		double[] pascal= new double[position2Ds.size()];
		Iterator<AMV_MVS_VSQ_2D> outPosition2DIterator= position2Ds.iterator();
		double outMean= 0;
		int positionPoint=0;
		while(outPosition2DIterator.hasNext()) {
			AMV_MVS_VSQ_2D outPosition2D= outPosition2DIterator.next();
			double[] distance= new double[position2Ds.size()];
			int i= 0;
			Iterator<AMV_MVS_VSQ_2D> inPosition2DIterator= position2Ds.iterator();
			//ȡ��������о��뼯����
			while(inPosition2DIterator.hasNext()) {
				AMV_MVS_VSQ_2D inPosition2D= inPosition2DIterator.next();
				distance[i++]= Distance.getDistance2D(outPosition2D, inPosition2D);
			}
			//����ǶԳ�ȱ��С�߷���˼��ٿ��� ��С����
			//distance= new LYG4DWithDoubleQuickSort4D().sort(distance, sortRangeScale);
			distance= new LYG9DWithDoubleQuickSort4D().sort(distance, sortRangeScale, 4);//�㷨Ӧ�ø���
			//����ȡ����������������ƽ��ֵ��0 Ϊ�������Դ� 1 ��ʼ
			double inMean= 0;
			oberserverPCAScale= oberserverPCAScale>= position2Ds.size()
					? position2Ds.size()- 1: oberserverPCAScale;
			oberserverPCAScale= oberserverPCAScale< 0? 0: oberserverPCAScale;	
			for(i= 1; i<= oberserverPCAScale; i++) {
				inMean+= distance[i];
			}
			inMean/= oberserverPCAScale;
			outMean+= inMean;
			//�ɼ�������γɳ������յ���Ҫ���·���ɷݡ�
			pascal[positionPoint++]= inMean;
		}
		outMean/= position2Ds.size();
		for(int i= 0; i< pascal.length; i++) {
			//��ֵ��ȡ ���ȶ� �۲����ݡ�
			pascal[i]/= outMean;
		}
		return pascal;
	}
	
	//3D�������� ÿһ������ĳ���Ԥ���㷨��
	public static double[] findPascalMeanDistanceByEachPositions3D(List<AMV_MVS_VSQ_3D> position3Ds
			, double oberserverPCAScale, int sortRangeScale) {
		double[] pascal= new double[position3Ds.size()];
		Iterator<AMV_MVS_VSQ_3D> outPosition3DIterator= position3Ds.iterator();
		double outMean= 0;
		int positionPoint=0;
		while(outPosition3DIterator.hasNext()) {
			AMV_MVS_VSQ_3D outPosition3D= outPosition3DIterator.next();
			double[] distance= new double[position3Ds.size()];
			int i= 0;
			Iterator<AMV_MVS_VSQ_3D> inPosition3DIterator= position3Ds.iterator();
			//ȡ��������о��뼯����
			while(inPosition3DIterator.hasNext()) {
				AMV_MVS_VSQ_3D inPosition3D= inPosition3DIterator.next();
				distance[i++]= Distance.getDistance3D(outPosition3D, inPosition3D);
			}
			//����ǶԳ�ȱ��С�߷���˼��ٿ��� ��С����
			//distance= new LYG4DWithDoubleQuickSort4D().sort(distance, sortRangeScale);
			distance= new LYG9DWithDoubleQuickSort4D().sort(distance, sortRangeScale, 4);//�㷨Ӧ�ø���
			//����ȡ����������������ƽ��ֵ��0 Ϊ�������Դ� 1 ��ʼ
			double inMean= 0;
			oberserverPCAScale= oberserverPCAScale>= position3Ds.size()
					? position3Ds.size()- 1: oberserverPCAScale;
			oberserverPCAScale= oberserverPCAScale< 0? 0: oberserverPCAScale;	
			for(i= 1; i<= oberserverPCAScale; i++) {
				inMean+= distance[i];
			}
			inMean/= oberserverPCAScale;
			outMean+= inMean;
			//�ɼ�������γɳ������յ���Ҫ���·���ɷݡ�
			pascal[positionPoint++]= inMean;
		}
		outMean/= position3Ds.size();
		for(int i= 0; i< pascal.length; i++) {
			//��ֵ��ȡ ���ȶ� �۲����ݡ�
			pascal[i]/= outMean;
		}
		return pascal;
	}
}