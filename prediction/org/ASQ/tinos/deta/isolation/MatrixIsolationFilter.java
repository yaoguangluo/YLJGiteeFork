package org.ASQ.tinos.deta.isolation;
public class MatrixIsolationFilter{
	//������ ��ά�����з���Ч�ɷ�ɸѡ�����㷨
	//Theory��ģʽʶ��ר��ϵͳ�� ������Yaoguang.Luo
	//Application ������
	//scaleDistance Ϊ ���ɸѡ�ľ��ȣ� PCARatioΪ��Ч�ڽ�����������
	//������ ������ emboss�Ⱦ��������˺󣬽����������ˡ����Ӿ�׼�ȡ�
	public int[][] getIsolationFilterMartix2D(int[][] input, int scaleDistance, double PCARatio){
		double compareRate= Math.pow(1+ scaleDistance* 2, 2)* PCARatio;
		int[][] output= new int[input.length][input[0].length];
		for(int i= scaleDistance; i< input.length- scaleDistance; i++){
			for(int j= scaleDistance; j< input[0].length- scaleDistance; j++){
				if(0< input[i][j]) {
					int PCA= 0;
					for(int p= -scaleDistance; p< scaleDistance; p++) {
						for(int q= -scaleDistance; q< scaleDistance; q++) {
							if(input[p][q]== input[i][j]) {
								PCA++;
							}
						}
					}	
					//ɸѡ����
					if(PCA> compareRate) {
						output[i][j]= input[i][j];
					}
				}
			}
		}
		return output;
	}

	public int[][][] getIsolationFilterMartix3D(int[][][] input, int scaleDistance, double PCARatio){
		double compareRate= Math.pow(1+ scaleDistance* 2, 3)* PCARatio;
		int[][][] output= new int[input.length][input[0].length][input[0][0].length];
		for(int i= scaleDistance; i< input.length- scaleDistance; i++){
			for(int j= scaleDistance; j< input[0].length- scaleDistance; j++){
				for(int k= scaleDistance; k< input[0].length- scaleDistance; k++){
					if(0< input[i][j][k]) {
						int PCA= 0;
						for(int p= -scaleDistance; p< scaleDistance; p++) {
							for(int q= -scaleDistance; q< scaleDistance; q++) {
								for(int r= -scaleDistance; r< scaleDistance; r++) {
									if(input[p][q][r]== input[i][j][r]) {
										PCA++;
									}
								}
							}
						}	
						//ɸѡ����
						if(PCA> compareRate) {
							output[i][j][k]= input[i][j][k];
						}
					}
				}
			}
		}
		return output;
	}
}