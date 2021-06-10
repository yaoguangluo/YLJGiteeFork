package PCI.ASQ.ratio;
import PCI.ASQ.basic.Compute_S;
import PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import PCI.ASQ.demension.AMV_MVS_VSQ_3D;
//Theory: Yaoguang.luo
//һ�ֽ���ͨ�������ֵ�������������������ʹ�÷�����
//Application: Yaoguang.luo
public class DistanceRatio{
	//��ȡб���ݶ�
	public static double getDistanceRatio2D(AMV_MVS_VSQ_2D begin, AMV_MVS_VSQ_2D end) {
		double x= begin.getX()- end.getX();
		double y= begin.getY()- end.getY();
		//1����
		if(x>=0&& y>=0) {
			return Math.abs(x)/ Math.abs(y);
		}
		//4����
		if(x>= 0 && y<0) {
			return 1+ Math.abs(x)/ Math.abs(y);
		}
		//2����
		if(x< 0 && y>= 0) {
			return Math.abs(x)/ Math.abs(y);
		}
		//3����
		if(x< 0&& y< 0) {
			return -1 - Math.abs(x)/ Math.abs(y);
		}
		return 0;
	}
	
	//���ͼ����ٶ�����ȡ��׼ȷб���ݶ� (���ڸ���Ҷ˼��)
	public static double getARCDistanceRatio2D(AMV_MVS_VSQ_2D begin, AMV_MVS_VSQ_2D end) {
		double x= begin.getX()- end.getX();
		double y= begin.getY()- end.getY();
		double z= Math.sqrt(x* x+ y* y);	
		return Math.asin(x/z)+ Math.acos(y/z);
	}
	
	//���ͼ����ٶ�����ȡ������ߵ���ʵ�Ƕ� 
	public static double getTrueARCDistanceRatio2D(AMV_MVS_VSQ_2D begin, AMV_MVS_VSQ_2D end) {
		double x= begin.getX()- end.getX();
		double y= begin.getY()- end.getY();
		double z= Math.sqrt(x* x+ y* y);
		//1����
		if(x>=0&& y>=0) {
			return Math.asin(Math.abs(x)/z);
		}
		//4����
		if(x>= 0 && y<0) {
			return 2* Compute_S.getPi()- Math.asin(Math.abs(x)/z);
		}
		//2����
		if(x< 0 && y>= 0) {
			return Compute_S.getPi()- Math.asin(Math.abs(x)/z);
		}
		//3����
		if(x< 0&& y< 0) {
			return Compute_S.getPi()+ Math.asin(Math.abs(x)/z);
		}
		return 0;
	}
	//��ȡ��������ݶ�
	public static double getDistanceRatio3D(AMV_MVS_VSQ_3D begin, AMV_MVS_VSQ_3D end) {
		double pi= 3.1415926;
		double x= begin.getX()- end.getX();
		double y= begin.getY()- end.getY();
		double z= begin.getZ()- end.getZ();
		//1����
		if(x>= 0&& y>= 0) {
			if(z>= 0) {
				return Math.abs(x)/ Math.abs(y);	
			}else {
				return pi+ Math.abs(x)/ Math.abs(y);
			}
		}
		//4����
		if(x>= 0&& y< 0) {
			if(z>= 0) {
				return pi*6+ Math.abs(x)/ Math.abs(y);	
			}else {
				return pi*7+ Math.abs(x)/ Math.abs(y);
			}
		}
		//2����
		if(x< 0&& y>= 0) {
			if(z>= 0) {
				return pi*2+ Math.abs(x)/ Math.abs(y);	
			}else {
				return pi*3+ Math.abs(x)/ Math.abs(y);
			}
		}
		//3����
		if(x< 0&& y< 0) {
			if(z>= 0) {
				return pi*4+ Math.abs(x)/ Math.abs(y);
			}else {
				return pi*5+ Math.abs(x)/ Math.abs(y);
			}
		}
		return 0;
	}
	
	//��ȡ��ʵ��ά�н�
	public static double getTrueARCDistanceRatio3D(AMV_MVS_VSQ_3D begin, AMV_MVS_VSQ_3D end) {
		return 0;
		//���������Ч���Ժ��о�����ʲô��׼�淶û��
	}
}