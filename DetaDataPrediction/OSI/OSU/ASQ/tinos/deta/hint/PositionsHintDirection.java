package OSI.OSU.ASQ.tinos.deta.hint;
import java.util.List;

import OSI.OSU.ASQ.tinos.deta.basic.Euclid;
import OSI.OSU.ASQ.tinos.deta.demension.Line2D;
import OSI.OSU.ASQ.tinos.deta.demension.Line3D;
import OSI.OSU.ASQ.tinos.deta.demension.Position2D;
import OSI.OSU.ASQ.tinos.deta.demension.Position3D;
public class PositionsHintDirection{
	//���꼯�����˶�����Ԥ���㷨��
	//����������������������й۲� ���� �����ĵ� ���� ��Ԥ�������ŵ��ȶ�״̬�͹켣Ԥ�С�
	//������ ��Ϸ�����ݽ�ģ����ѧ�����������
	//˼�룺�����ڲ������� ͳ��
	//ʵ�֣�������
	public static Line2D getHintDirectionTrendFromPosition2Ds(List<Position2D> inputs) {
		Position2D mid= Euclid.findMidPosition2D(inputs);
		Position2D heart= Euclid.findHeartPosition2D(inputs);
		Line2D line2D= new Line2D();
		line2D.setBegin(mid);
		line2D.setEnd(heart);
		return line2D;	
	} 
	
	public static Line3D getHintDirectionTrendFromPosition3Ds(List<Position3D> inputs) {
		Position3D mid= Euclid.findMidPosition3D(inputs);
		Position3D heart= Euclid.findHeartPosition3D(inputs);
		Line3D line3D= new Line3D();
		line3D.setBegin(mid);
		line3D.setEnd(heart);
		return line3D;	
	} 
}