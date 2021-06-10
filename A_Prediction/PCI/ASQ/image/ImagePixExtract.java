package PCI.ASQ.image;
public class ImagePixExtract{
	//˼�룺ƽ�漸�Σ� ģʽʶ��
	//���ߣ�������
	//�����ڲ���ͼ�任����.
	//�����ؾ���ָ����RBG��ɫֵ�ó����γɲ����������
	public static int[] getVWaveFromImagePix(int[][] pixMap, int RGB){
		int[] output= new int[pixMap.length];
		Next:
		for(int i= 0; i< pixMap.length; i++) {
			for(int j= 0; j< pixMap[0].length; j++) {
				if(RGB== pixMap[i][j]) {
					output[i]= j;
					continue Next;
				}
			}
		}
		return output;
	}
	
	public static int[] getHWaveFromImagePix(int[][] pixMap, int RGB){
		int[] output= new int[pixMap[0].length];
		Next:
		for(int i= 0; i< pixMap[0].length; i++) {
			for(int j= 0; j< pixMap.length; j++) {
				if(RGB== pixMap[j][i]) {
					output[i]= j;
					continue Next;
				}
			}
		}
		return output;
	}
}