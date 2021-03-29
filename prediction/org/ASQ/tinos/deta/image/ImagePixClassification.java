package org.ASQ.tinos.deta.image;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.tinos.deta.demension.Position2D;
import org.tinos.deta.demension.Position3D;
public class ImagePixClassification{
	//˼�룺ͳ���������
	//���ߣ�������
	//��shareholder�ֲ㴦���ͼƬ�������ݽ��� �������ͳ�����
	public static Map<Integer, ArrayList<Position2D>> getImagePixClassificationMap(int[][] pixMap){
		Map<Integer, ArrayList<Position2D>> output= new HashMap<>();
		for(int i= 0; i< pixMap.length; i++) {
			for(int j= 0; j< pixMap[0].length; j++) {
				if(pixMap[i][j]> 0) {
					ArrayList<Position2D> temp;
					if(output.containsKey(pixMap[i][j])) {
						temp= output.get(pixMap[i][j]);
					}else {
						temp= new ArrayList<>();
					}
					Position2D position2D= new Position2D(i, j);
					temp.add(position2D);
					output.put(pixMap[i][j], temp);
				}
			}
		}	
		return output;
	}
	
	public static Map<Integer, ArrayList<Position3D>> getImagePixClassificationMap(int[][][] pixMap){
		Map<Integer, ArrayList<Position3D>> output= new HashMap<>();
		for(int i= 0; i< pixMap.length; i++) {
			for(int j= 0; j< pixMap[0].length; j++) {
				for(int k= 0; k< pixMap[0][0].length; k++) {
					if(pixMap[i][j][k]> 0) {
						ArrayList<Position3D> temp;
						if(output.containsKey(pixMap[i][j][k])) {
							temp= output.get(pixMap[i][j][k]);
						}else {
							temp= new ArrayList<>();
						}
						Position3D position3D= new Position3D(i, j, k);
						temp.add(position3D);
						output.put(pixMap[i][j][k], temp);
					}
				}}
		}	
		return output;
	}
}