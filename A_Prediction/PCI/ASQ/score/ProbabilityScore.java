package PCI.ASQ.score;
import java.util.Iterator;
import java.util.List;
//theory: �������� 
//application: Yaoguang.Luo
public class ProbabilityScore{
	//�ú��������ܷ�list������
	public static boolean encodeEstimateSumOfScoresList(List<Double> scores, double estimateValue) {
		double sum= 0;
		Iterator<Double> iterator= scores.iterator();
		while(iterator.hasNext()) {
			sum+= iterator.next();
		}
		return sum> estimateValue? true: false;	
	}
	//�ú��������ֱܷ��������
	public static boolean encodeEstimateSumOfScoresArray(double[] scores, double estimateValue) {
		double sum= 0;
		for(int i= 0; i< scores.length; i++) {
			sum+= scores[i];
		}
		return sum> estimateValue? true: false;	
	}
	//refer �ѿ��� �ú������� ��Ȩֵ�����͵�������
	public static boolean getEstimateCartesianSumOfScoresArray(double input
			, double[] EstimateRatios, double estimateValue) {
		double sum= 0;
		for(int i= 0; i< EstimateRatios.length; i++) {
			sum+= EstimateRatios[i]* input;
		}
		return sum> estimateValue? true: false;	
	}

	//refer �ѿ��� �ú������� ��Ȩֵ�����ѿ����͵�������
	public static boolean getEstimateCartesian1DSumOfScoresArray(double[] inputs
			, double[] EstimateRatios, double estimateValue) {
		double sum= 0;
		for(int i= 0; i< EstimateRatios.length; i++) {
			for(int j= 0; j< EstimateRatios.length; j++) {
				sum+= inputs[i]* EstimateRatios[j];
			}
		}
		return sum> estimateValue? true: false;	
	}

	public static boolean[] encodeEstimateInitonsScore(double[] input
			, double[] estimateRatios, double estimateValue[]) {
		boolean dnaInitons[]= new boolean[input.length];
		for(int i= 0; i< estimateRatios.length; i++) {
			double sum= 0;
			for(int j= 0; j< input.length; j++) {
				sum+= input[j]* estimateRatios[i];
			}
			dnaInitons[i]= sum> estimateValue[i]? true: false;
		}
		return dnaInitons;
	}  

	public static boolean[] decodeEstimateInitonsScore(double input
			, double[] estimateRatios, double estimateValue[]) {
		boolean dnaInitons[]= new boolean[estimateRatios.length];
		for(int i= 0; i< estimateRatios.length; i++) {
			double sum= input* estimateRatios[i];
			dnaInitons[i]= sum> estimateValue[i]? true: false;
		}
		return dnaInitons;
	} 
	//�ú��������������� ���Զ�Ӧ��Ȩֵϵ���˻� ��֡�
	public static double[] getRightsEstimateScore(double[] inputs, double[] rights) {
		double[] outputs= new double[inputs.length];
		for(int i= 0; i< outputs.length; i++) {
			outputs[i]= inputs[i]* rights[i];
		}
		return outputs;
	}
}