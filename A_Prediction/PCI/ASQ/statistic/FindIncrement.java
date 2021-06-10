package PCI.ASQ.statistic;
public class FindIncrement{
	//�õ����ڵȱȾ��ȵ�������ֵ��
	public static double findTotalIncrementWithScale(double value, double times, double scale) {
		double input= value;
		for(double i= 0; i< times; i++) {
			value*= scale;
		}
		return value- input;
	}
	
	public static double findMeanIncrementWithScale(double value, double times, double scale) {
		double input= value;
		for(double i= 0; i< times; i++) {
			value*= scale;
		}
		return (value- input)/ times;
	}
}