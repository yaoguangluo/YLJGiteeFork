package OSI.PCI.ASQ.hint;
import java.util.List;

import OSI.PCI.ASQ.basic.Euclid;
import OSI.PCI.ASQ.demension.Line2D;
import OSI.PCI.ASQ.demension.Line3D;
import OSI.PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import OSI.PCI.ASQ.demension.AMV_MVS_VSQ_3D;
public class AMV_MVS_VSQ_HintDirection{
	//���꼯�����˶�����Ԥ���㷨��
	//����������������������й۲� ���� �����ĵ� ���� ��Ԥ�������ŵ��ȶ�״̬�͹켣Ԥ�С�
	//������ ��Ϸ�����ݽ�ģ����ѧ�����������
	//˼�룺�����ڲ������� ͳ��
	//ʵ�֣�������
	public static Line2D getHintDirectionTrendFromPosition2Ds(List<AMV_MVS_VSQ_2D> inputs) {
		AMV_MVS_VSQ_2D mid= Euclid.findMidPosition2D(inputs);
		AMV_MVS_VSQ_2D heart= Euclid.findHeartPosition2D(inputs);
		Line2D line2D= new Line2D();
		line2D.setBegin(mid);
		line2D.setEnd(heart);
		return line2D;	
	} 
	
	public static Line3D getHintDirectionTrendFromPosition3Ds(List<AMV_MVS_VSQ_3D> inputs) {
		AMV_MVS_VSQ_3D mid= Euclid.findMidPosition3D(inputs);
		AMV_MVS_VSQ_3D heart= Euclid.findHeartPosition3D(inputs);
		Line3D line3D= new Line3D();
		line3D.setBegin(mid);
		line3D.setEnd(heart);
		return line3D;	
	} 
}