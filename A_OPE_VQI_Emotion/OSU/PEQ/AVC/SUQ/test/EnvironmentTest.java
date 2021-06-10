package OSU.PEQ.AVC.SUQ.test;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import AEU.AVC.SUQ.engine.EnvironmentInit;
import AEU.OCI.AVC.SUQ.estimation.C.EmotionSample;
public class EnvironmentTest{
	public static void main(String[] argv) throws IOException {
		//init
		String text = "���ڳ���ԵĽ����ʽ�������ҽѧ���ձ鶨��Ϊһ�־��о������������ڵ��½���Σ���Ե���Ϊ��\r\n" + 
				"���ڳ�����Դ�кܶ����أ���������Ҫ������������Ϊ���ڵ�������������ĳ��ȱ����ɥʧ��\r\n" + 
				"�Գ�����������������ԡ�ͨ��������ۣ����Գ��������������������Ч�ķ�ʽ�������������\r\n" + 
				"��������Ҳ����ǿ������ԣ���Σ���ԣ�����Σ��ҪС��ԭ�ͨ�������ǿ�Ƽ��ټ����;�ϴ\r\n" + 
				"�Խ�����ͨ��һ��ʱ�����ڴﵽ������м��н�Ϸ�Ӧ����Ҫ�۲졣���������ڶ�û�г�񫲢������\r\n" + 
				"��ȾȺ����н����ʹ��ڷ�ʽ�����Ⱥ������������ų�������񫲻�������������������Ӧ���Խ�\r\n" + 
				"���Ĳ�������������ġ������һ������������ɵ����������ļ����кܶ��֡�ҽѧ������Ͻ�\r\n" + 
				"�Ĵ�ֶΣ����ж�������������񫡣����Ч�Ľ���ֶξ��ǻ��������ʽ��ѡ�񡣺ܶ�ʱ��\r\n" + 
				"�������Ǻ����ã����ʽ�������������˵ľ������������ʱ������Ϊ���ȶ�̬�����׽Ӵ�\r\n" + 
				"���Դ���������޷��ı��ʱ��������Ҫ�ı��Լ���ѡ��һ�����õ����ʽ���������������赼��\r\n" + 
				"�������ų����Դ��������Щ�ʻ��Ƿǳ��м�ֵ�ľ���ҩ����ţ������ƣ����� �ȵȡ�\r\n" + 
				"һЩ�������壬�ձ���ĳ������: ���ң�������ǿ�ȣ����� �ȵȡ����ﲻ�Ǳ��壬ֻ����Ϊ���ڵĻ���\r\n" + 
				"���ز�����ô���õ�����һЩ˼ά�����������Ƿǳ���Ҫ�ġ��ı��˵Ĳ�������������ѡ��ͻ�����\r\n" + 
				"����������Ǻ���������ôѡ��һ�����������ʽ���Ƿǳ���Ҫ�ġ�";

		EnvironmentInit environmentInit = new EnvironmentInit();
		environmentInit.init(text);
		Map<String, EmotionSample> environmentSampleMap = environmentInit.getEmotionSampleMap();
		//reduce
		System.out.println("��    ����");
		Iterator<String> Iterator = environmentSampleMap.keySet().iterator();
		while(Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = environmentSampleMap.get(word);
			if(null != emotionSample.getDistinction()) {
				System.out.print(emotionSample.getDistinction()+" ");
			}
		}
		System.out.println("");
		System.out.println("��    ����");
		Iterator = environmentSampleMap.keySet().iterator();
		while(Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = environmentSampleMap.get(word);
			if(null != emotionSample.getMotivation()) {
				System.out.print(emotionSample.getMotivation()+" ");
			}
		}
		System.out.println("");
		System.out.println("��    ��" );
		Iterator = environmentSampleMap.keySet().iterator();
		while(Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = environmentSampleMap.get(word);
			if(null != emotionSample.getTrending()) {
				System.out.print(emotionSample.getTrending()+" ");
			}
		}
		//reduce
		System.out.println("");
		System.out.println("��    �ߣ�");
		Iterator = environmentSampleMap.keySet().iterator();
		while(Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = environmentSampleMap.get(word);
			if(null != emotionSample.getPrediction()) {
				System.out.print(emotionSample.getPrediction()+" ");
			}
		}	
	}
}