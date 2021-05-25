package OSI.PCI.ASQ.trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import OSI.PCI.ASQ.demension.Position2D;
import OSI.PCI.ASQ.demension.Position3D;

public class TraceFissilePositionByHearts{
	//Source: ��2ά 3ά ���꼯 ���� ���� �켣 �����㷨JAVAԴ�롷
	//��������2020 �� 04 �� 14 �� ��Ʒ˵��Gitee, Github, DetaOSS
	//����㷨֮ǰ����������������صĸ�������������Ĺ켣���㷨
	//������������䷴�ݺ�����������������Ĺ켣����������꼯��
	//��Ʒ˵�������� ������ ��̬�����������켣������������Ϣ��Ԫ��¼��
	//���� ������
	public static List<Position2D> trackTracePosition2DByHearts(List<Position2D> hearts){
		List<Position2D> trackTracePositions= new ArrayList<>(); 
		Iterator<Position2D> iterator= hearts.iterator();
		Position2D lastPosition2D= null;
		if(iterator.hasNext()) {
			lastPosition2D= iterator.next();
			trackTracePositions.add(lastPosition2D);	
		}
		while(iterator.hasNext()) {
			Position2D heartPostion= iterator.next();
			//position2D.setX((heart.getX()+ oneMore.getX())/ 2);
			//newHeart= (lastHeart+ newp)/2    =>  newp= newHeart*2 -lastHeart  
			//add section 1234
			Position2D newPosition2D= new Position2D(heartPostion.getX()*2- lastPosition2D.getX()
												   , heartPostion.getY()*2- lastPosition2D.getY());
			trackTracePositions.add(newPosition2D);
			lastPosition2D= heartPostion;
		}
		return trackTracePositions;
	}
	
	public static List<Position3D> trackTracePosition3DByHearts(List<Position3D> hearts){
		List<Position3D> trackTracePositions= new ArrayList<>(); 
		Iterator<Position3D> iterator= hearts.iterator();
		Position3D lastPosition3D= null;
		if(iterator.hasNext()) {
			lastPosition3D= iterator.next();
			trackTracePositions.add(lastPosition3D);	
		}
		while(iterator.hasNext()) {
			Position3D heartPostion= iterator.next();
			//position3D.setX((heart.getX()+ oneMore.getX())/ 2);
			//newHeart= (lastHeart+ newp)/2    =>  newp= newHeart*2 -lastHeart  
			//add section 1234
			Position3D newPosition3D= new Position3D(heartPostion.getX()* 2- lastPosition3D.getX()
												   , heartPostion.getY()* 2- lastPosition3D.getY()
												   , heartPostion.getZ()* 2- lastPosition3D.getZ());
			trackTracePositions.add(newPosition3D);
			lastPosition3D= heartPostion;
		}
		return trackTracePositions;
	}
}
