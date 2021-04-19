package OSI.OSU.ASQ.image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import OSI.OSU.ASQ.classification.FissileWithMatch;
import OSI.OSU.ASQ.demension.Position2D;
import OSI.OSU.ASQ.demension.Position3D;
public class ImagePixGroupFilter{
	//˼�룺������
	//���ߣ�������
	//��shareholder�ֲ㴦���ͼƬ�������� ��ָ���ľ��ȺͶ�Ӧ���ؽ��а������ŵĴ�С�����ض����ˡ�
	public static int[][] getImagePix2DGroupFilter(int[][] inputPixMatrix
			, int RBG, int distanceScale,int max, int min){
		//���ط���
		Map<Integer, ArrayList<Position2D>> map= ImagePixClassification
				.getImagePixClassificationMap(inputPixMatrix);
		//��ȡ�������Ŵ�
		Map<Double, ArrayList<Position2D>> mid= FissileWithMatch
				.fissilePosition2DWithMatch(map.get(RBG), distanceScale);
		//ɸѡ�Ŵأ������Ŵ�
		Iterator<Double> iteratorMid= mid.keySet().iterator();
		while(iteratorMid.hasNext()) {
			ArrayList<Position2D> list= mid.get(iteratorMid.next());
			if(null!= list) {
				if(list.size()< min|| list.size()> max) {
					Iterator< Position2D> iterator= list.iterator();
					while(iterator.hasNext()) {
						Position2D position2D= iterator.next();
						inputPixMatrix[(int) position2D.getX()]
								[(int) position2D.getY()]= 0;
					}
				}
			}
		}
		return inputPixMatrix;
	}

	public int[][][] getImagePix3DGroupFilter(int[][][] inputPixMatrix
			, int RBG, int distanceScale,int max, int min){
		//���ط���
		Map<Integer, ArrayList<Position3D>> map= ImagePixClassification
				.getImagePixClassificationMap(inputPixMatrix);
		//��ȡ�������Ŵ�
		Map<Double, ArrayList<Position3D>> mid= FissileWithMatch
				.fissilePosition3DWithMatch(map.get(RBG), distanceScale);
		//ɸѡ�Ŵأ������Ŵ�
		Iterator<Double> iteratorMid= mid.keySet().iterator();
		while(iteratorMid.hasNext()) {
			ArrayList<Position3D> list= mid.get(iteratorMid.next());
			if(null!= list) {
				if(list.size()< min|| list.size()> max) {
					Iterator< Position3D> iterator= list.iterator();
					while(iterator.hasNext()) {
						Position3D position3D= iterator.next();
						inputPixMatrix[(int) position3D.getX()][(int) position3D.getY()]
								[(int) position3D.getZ()]= 0;
					}
				}
			}
		}
		return inputPixMatrix;
	}
}
