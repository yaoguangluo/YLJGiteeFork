package org.ASQ.tinos.deta.trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.ASQ.tinos.deta.basic.Euclid;
import org.ASQ.tinos.deta.demension.Position2D;
import org.ASQ.tinos.deta.demension.Position3D;
public class TracePositionHearts{
	//Source: ��2ά 3ά ���꼯 ���� ���� �켣 �����㷨JAVAԴ�롷
	//��������2019 �� 12 �� 21 ��  ��Ʒ˵��Gitee, Github, DetaOSS
	//��Ʒ˵�������� ������ ��̬�����������켣������������Ϣ��Ԫ��¼��
	//���� ������
	public static List<Position2D> trackTracePosition2DHeartsWithSingerGroup(List<Position2D> coods){
		List<Position2D> hearts= new ArrayList<>();
		Iterator<Position2D> iterator= coods.iterator();
		boolean isFirst= true;
		while(iterator.hasNext()) {
			if(isFirst) {
				isFirst= !isFirst;
				hearts.add(iterator.next());
			}else {
				Position2D position2D= iterator.next();
				Position2D CryptHeart
				= Euclid.findCryptionPosition2D(hearts.get(hearts.size()- 1), position2D);
				hearts.add(CryptHeart);
			}
		}
		return hearts;
	}
	
	public static List<Position3D> trackTracePosition3DHeartsWithSingerGroup(List<Position3D> coods){
		List<Position3D> hearts= new ArrayList<>();
		Iterator<Position3D> iterator= coods.iterator();
		boolean isFirst= true;
		while(iterator.hasNext()) {
			if(isFirst) {
				isFirst= !isFirst;
				hearts.add(iterator.next());
			}else {
				Position3D position3D= iterator.next();
				Position3D CryptHeart
				= Euclid.findCryptionPosition3D(hearts.get(hearts.size()- 1), position3D);
				hearts.add(CryptHeart);
			}
		}
		return hearts;
	}
}