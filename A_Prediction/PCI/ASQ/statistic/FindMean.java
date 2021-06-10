package PCI.ASQ.statistic;
import java.util.Iterator;
import java.util.List;

import OEU.LYG4DQS4D.LYG9DWithDoubleQuickSort4D;
public class FindMean{
	//�������������� ���˰ٷֱ����������С������ֵ��� mean��
	//sortRangeScale��ȷ�������������ʱ�����Ƴɷݶ�����ȷ����ջ����ȣ������ջ�����
	//˼�룺������ 20191226
	//ʵ�֣�������
	public static double findMeanOfFilterDoubleArrayWithScale(double[] input, double filterScale, int sortRangeScale) {
		int rangeScale= (int)(filterScale* input.length);
		//input= new LYG4DWithDoubleQuickSort4D().sort(input, sortRangeScale);
		input= new LYG9DWithDoubleQuickSort4D().sort(input, sortRangeScale, 4);//�㷨Ӧ�ø���
		double output= 0;
		for(int i= rangeScale; i< input.length- rangeScale; i++) {
			output+= input[i];
		}
		return output/ (input.length- 2* rangeScale);
	}
	
	public static double findMeanOfDoubleArray(double[] input) {
		double output= 0;
		for(int i= 0; i< input.length; i++) {
			output+= input[i];
		}
		return output/ input.length;
	}
	
	public static Double[] findMeanOfTwoDoubleArray(Double[] origin, Double[] input) {
		Double[] output= new Double[origin.length];
		for(int i= 0; i< input.length; i++) {
			output[i]= (origin[i]+ input[i])/ 2;
		}
		return output;
	}
	
	public static Double[][] findMeanOfTwoDoubleArray2D(Double[][] origin, Double[][] input) {
		Double[][] output= new Double[origin.length][origin[0].length];
		for(int i= 0; i< input.length; i++) {
			for(int j= 0; j< input[0].length; j++) {
				output[i][j]= (origin[i][j]+ input[i][j])/ 2;
			}
		}
		return output;
	}
	
	public static double findMeanOfDoubleMatrix2D(double[][] input) {
		double output= 0;
		for(int i= 0; i< input.length;i++) {
			for(int j= 0; j< input[0].length;j++) {
				output+= input[i][j];
			}
		}
		return output/(input.length* input[0].length);
	}
	
	public static double[] findRowMeanOfDoubleMatrix2D(double[][] input) {
		double[] output= new double[input[0].length];
		for(int i= 0; i< input[0].length; i++) {
			for(int j= 0; j< input.length; j++) {
				output[i]+= input[j][i];
			}
			output[i]/= input.length;
		}
		return output;
	}
	
	public static double[] findCulumnMeanOfDoubleMatrix2D(double[][] input) {
		double[] output= new double[input.length];
		for(int i= 0; i< input.length; i++) {
			for(int j= 0; j< input[0].length; j++) {
				output[i]+= input[i][j];
			}
			output[i]/= input[0].length;
		}
		return output;
	}
	
	public static double findMeanOfDoubleMatrix3D(double[][][] input) {
		double output= 0;
		for(int i= 0; i< input.length;i++) {
			for(int j= 0; j< input[0].length; j++) {
				for(int k= 0; k< input[0][0].length; k++) {
					output+= input[i][j][k];
				}
			}
		}
		return output/(input.length* input[0].length* input[0][0].length);
	}
	
	public static double findMeanOfDoubleList(List<Double> input) {
		double output= 0;
		Iterator<Double> iterator= input.iterator();
		while(iterator.hasNext()) {
			output+= iterator.next();
		}
		return output/ input.size();
	}
	
	public static Double[] findMeanOfMartrix1DList(List<Double[]> input) {
		Double[] output= new Double[input.get(0).length];
		Iterator<Double[]> iterator= input.iterator();
		while(iterator.hasNext()) {
			Double[] table= iterator.next();
			output= findMeanOfTwoDoubleArray(output, table);
		}
		return output;
	}
	
	public static Double[][] findMeanOfMartrix2DList(List<Double[][]> input) {
		Double[][] output= new Double[input.get(0).length][input.get(0)[0].length];
		Iterator<Double[][]> iterator= input.iterator();
		while(iterator.hasNext()) {
			Double[][] table= iterator.next();
			output= findMeanOfTwoDoubleArray2D(output, table);
		}
		return output;
	}
}