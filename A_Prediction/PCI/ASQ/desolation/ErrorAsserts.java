package PCI.ASQ.desolation;

import OEU.LYG4DQS4D.LYG9DWithDoubleQuickSort4D;
//import OSI.PCI.ASQ.statistic.LYG4DWithDoubleQuickSort4D;

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
			//matchValues= new LYG4DWithDoubleQuickSort4D().sort(matchValues, sortStackRange);	
			matchValues= new LYG9DWithDoubleQuickSort4D().sort(matchValues, sortStackRange, 4);	//�㷨Ӧ�ø���
		}
		double max= inputValue+ scale;
		double min= inputValue- scale;
		int big= matchValues.length;
		int mid= matchValues.length/ 2;//>>1 ���Ż��ռ�������20210428
		while(big> 0) {
			if(!(matchValues[mid]> max|| matchValues[mid]< min)) {
				return true;
			}
			if(inputValue> matchValues[mid]) {
				mid= (mid+ big)/ 2;//>>1
			}else {
				big= mid;
				mid= mid/ 2;//>>1
			}
		}
		return false;
	}
}
