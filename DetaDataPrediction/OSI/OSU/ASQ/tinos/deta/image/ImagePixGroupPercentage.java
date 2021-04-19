package OSI.OSU.ASQ.tinos.deta.image;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import OSI.OSU.ASQ.tinos.deta.demension.Position2D;

public class ImagePixGroupPercentage{
	//˼�룺ͳ���������
	//���ߣ�������
	//Ŀ�ģ��������� ɸѡ�� ���� �� ��Ҫ�ɷ� ������
	//�������������ָ��������ͼƬ�е�����ռ�ȡ�
	public static double getPixPercentByDeterPix(int[][] imagePix, int scaleRBG){
		double output= 0;
		for(int i=0; i<imagePix.length; i++) {
			for(int j=0; j<imagePix[0].length; j++) {
				if(scaleRBG== imagePix[i][j]) {
					output++;
				}
			}
		}
		return output/(imagePix.length* imagePix[0].length);
	}
	
	//�����������Fissile����ִ�����Ѻ����ͬ������ ����ɸѡ���� �� ������еĴ�����ռ�ȡ�
	public static double getClusterPercentByDeterPixGroup(Map<Double, List<Position2D>> imagePix, int scaleSUM){
		double output= 0;
		Iterator<Double> iterator= imagePix.keySet().iterator();
		while(iterator.hasNext()) {
			List<Position2D> list= imagePix.get(iterator.next());
			if(list.size()> scaleSUM) {
				output++;
			}
		}
		return output/ imagePix.size();
	}
	
	//�����������Fissile����ִ�����Ѻ����ͬ������ ����ɸѡ���� �� ������е�����ռ�ȡ�
	public static double getPixPercentByDeterPixGroup(Map<Double, List<Position2D>> imagePix, int scaleSUM){
		double output= 0;
		double sum= 0;
		Iterator<Double> iterator= imagePix.keySet().iterator();
		while(iterator.hasNext()) {
			 List<Position2D> list= imagePix.get(iterator.next());
			 if(list.size()> scaleSUM) {
				 output+= list.size();
			 }
			 sum+= list.size();	 
		}
		return output/ sum;
	}
}