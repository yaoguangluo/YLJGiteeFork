package org.ASQ.tinos.deta.image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.ASQ.tinos.deta.classification.FissileWithMatch;
import org.ASQ.tinos.deta.demension.Position2D;
public class ImagePixGroupFilter{
	//˼�룺������
	//���ߣ�������
	//��shareholder�ֲ㴦���ͼƬ�������� ��ָ���ľ��ȺͶ�Ӧ���ؽ��а������ŵĴ�С�����ض����ˡ�
	public static int[][] getImagePix2DGroupFilter(int[][] inputPixMatrix, int RBG, int distanceScale,int max, int min){
		//���ط���
		Map<Integer, ArrayList<Position2D>> map= ImagePixClassification.getImagePixClassificationMap(inputPixMatrix);
		//��ȡ�������Ŵ�
		Map<Double, ArrayList<Position2D>> mid= FissileWithMatch.fissilePosition2DWithMatch(map.get(RBG), distanceScale);
		//ɸѡ�Ŵأ������Ŵ�
		Iterator<Double> iteratorMid= mid.keySet().iterator();
		while(iteratorMid.hasNext()) {
			ArrayList<Position2D> list= mid.get(iteratorMid.next());
			if(null!= list) {
				if(list.size()< min|| list.size()> max) {
					Iterator< Position2D> iterator= list.iterator();
					while(iterator.hasNext()) {
						Position2D AMV_MVS_VSQ2D= iterator.next();
						inputPixMatrix[(int) AMV_MVS_VSQ2D.getX()][(int) AMV_MVS_VSQ2D.getY()]= 0;
					}
				}
			}
		}
		return inputPixMatrix;
	}
}
//�ű�
							