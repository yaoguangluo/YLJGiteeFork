package org.ASQ.tinos.deta.basic;

import org.tinos.deta.demension.Position2D;
import org.tinos.deta.demension.Position3D;

//Theory: ���ɶ���
//һ�ֽ���ͨ�������ֵ�������������������ʹ�÷�����
//Application: Yaoguang.luo
public class Distance{
	public static double getDistance2D(Position2D begin,Position2D end) {
		double x= begin.getX()- end.getX();
		double y= begin.getY()- end.getY();
		return Math.abs(x)+ Math.abs(y);
	}
	
	public static double getDistance3D(Position3D begin,Position3D end) {
		double x= begin.getX()- end.getX();
		double y= begin.getY()- end.getY();
		double z= begin.getZ()- end.getZ();
		return Math.abs(x)+ Math.abs(y)+ Math.abs(z);
	}
	
	public static double getPythagoreanDistance2D(Position2D begin,Position2D end) {
		double x= begin.getX()- end.getX();
		double y= begin.getY()- end.getY();
		return Math.sqrt(x* x+ y* y);
	}
	
	public static double getPythagoreanDistance3D(Position3D begin,Position3D end) {
		double x= begin.getX()- end.getX();
		double y= begin.getY()- end.getY();
		double z= begin.getZ()- end.getZ();
		return Math.sqrt(x* x+ y* y+ z* z);
	}
	
}