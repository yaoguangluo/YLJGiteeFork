package PCI.ASQ.pca;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import PCI.ASQ.basic.RatioMatrix;

//�������������ģ�����ʼ�ƽ��ֵ������Ҫ�ɷݷ���
//˼�룺��Ҷ˹ ģ����ѧ ͳ���ڸ�����
//ʵ�֣�������
public class PCAMeanOfFuzzPC{
	public static RatioMatrix getSimilarFuzzSetWithScale(RatioMatrix input, List<RatioMatrix> groups, double scale) {
		List<RatioMatrix> output= new ArrayList<>();
		Iterator<RatioMatrix> iterators= groups.iterator();
		while(iterators.hasNext()) {
			RatioMatrix ratio= iterators.next();
			double rightRightMean= ratio.getRightRightRatio();
			double rightErrorMean= ratio.getRightErrorRatio();
			double errorRightMean= ratio.getErrorRightRatio();
			double errorErrorMean= ratio.getErrorErrorRatio();
			double predictionRightRight= Math.abs(input.getRightRightRatio()- rightRightMean);
			double predictionRightError= Math.abs(input.getRightErrorRatio()- rightErrorMean);
			double predictionErrorRight= Math.abs(input.getErrorRightRatio()- errorRightMean);
			double predictionErrorError= Math.abs(input.getErrorErrorRatio()- errorErrorMean);
			double tempSumRight= predictionRightRight+ predictionRightError+ predictionErrorRight+ predictionErrorError;
			if(tempSumRight< scale) {
				output.add(ratio);
			}
		}
		RatioMatrix outputMean= new RatioMatrix();
		Iterator<RatioMatrix> iteratorsOutput= output.iterator();
		while(iteratorsOutput.hasNext()) {
			RatioMatrix ratio= iteratorsOutput.next();
			outputMean.setErrorErrorRatio(ratio.getErrorErrorRatio()+ outputMean.getErrorErrorRatio());
			outputMean.setErrorRightRatio(ratio.getErrorRightRatio()+ outputMean.getErrorRightRatio());
			outputMean.setRightErrorRatio(ratio.getRightErrorRatio()+ outputMean.getRightErrorRatio());
			outputMean.setRightRightRatio(ratio.getRightRightRatio()+ outputMean.getRightRightRatio());
		}
		outputMean.setErrorErrorRatio(outputMean.getErrorErrorRatio()/ output.size());
		outputMean.setErrorRightRatio(outputMean.getErrorRightRatio()/ output.size());
		outputMean.setRightErrorRatio(outputMean.getRightErrorRatio()/ output.size());
		outputMean.setRightRightRatio(outputMean.getRightRightRatio()/ output.size());
		return outputMean;	
	}	
}