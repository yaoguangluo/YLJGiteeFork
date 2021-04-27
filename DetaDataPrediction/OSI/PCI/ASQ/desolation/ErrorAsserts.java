package OSI.PCI.ASQ.desolation;

import OSI.PCI.ASQ.statistic.LYG4DWithDoubleQuickSort4D;

public class ErrorAsserts{
	//����������ڽ��о������ƥ�� ��ȡ�����Ƿ����ںϸ�״̬��
	//inputValue ����۲�ɷݡ�
	//matchValues ����۲����������
	//scale�������ȡ�
	//sortStackRange ������������ͬ�������ȷ����ջ������ʺϼ��ٵݹ�������
	public boolean getErrorAsserts(double inputValue, double[] matchValues, double scale) {
		double max= inputValue+ scale;
		double min= inputValue- scale;
		for(int i= 0; i< matchValues.length; i++) {
			if(!(matchValues[i]> max|| matchValues[i]< min)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean getBinaryErrorAsserts(double inputValue, double[] matchValues
			, double scale, int sortStackRange, boolean isSort) {
		if(!isSort) {
			matchValues= new LYG4DWithDoubleQuickSort4D().sort(matchValues, sortStackRange);	
		}
		double max= inputValue+ scale;
		double min= inputValue- scale;
		int big= matchValues.length;
		int mid= matchValues.length/ 2;
		while(big> 0) {
			if(!(matchValues[mid]> max|| matchValues[mid]< min)) {
				return true;
			}
			if(inputValue> matchValues[mid]) {
				mid= (mid+ big)/ 2;
			}else {
				big= mid;
				mid= mid/ 2;
			}
		}
		return false;
	}
}
