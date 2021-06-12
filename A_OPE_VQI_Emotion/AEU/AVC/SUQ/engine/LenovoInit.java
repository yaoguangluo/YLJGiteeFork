package AEU.AVC.SUQ.engine;
import java.io.IOException;

import java.util.Map;

import AEU.OCI.AVC.SUQ.estimation.C.EmotionSample;
import OCI.AMV.ECS.SVQ.MPC.fhmm.C.SensingMap;
import OCI.ME.analysis.C.A;
import OEI.AMV.ECS.SVQ.MPC.SOQ.OEM.E.SensingMap_E;
public class LenovoInit{
	public SensingMap getSensingMap() {
		return sensingMap;
	}

	public void setSensingMap(SensingMap sensingMap) {
		this.sensingMap = sensingMap;
	}

	public EnvironmentInit getEnvironmentInit() {
		return environmentInit;
	}

	public void setEnvironmentInit(EnvironmentInit environmentInit) {
		this.environmentInit = environmentInit;
	}

	private SensingMap sensingMap;
	private EnvironmentInit environmentInit;

	@SuppressWarnings("unused")
	public static void main(String[] argv) throws IOException {
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

		LenovoInit lenovoInit = new LenovoInit();
		lenovoInit.init(text);
		Map<String, EmotionSample> environmentSampleMap = lenovoInit.getEnvironmentInit().getEmotionSampleMap();
		Map<String, Object> lenovo = lenovoInit.getSensingMap().getLenovoMap();
	}

	public void init(String text) throws IOException {
		environmentInit = new EnvironmentInit();
		environmentInit.init(text);
		sensingMap = new SensingMap_E();
		sensingMap.initLenovoMap(environmentInit.getAnalyzer());	
	}
	
	public void initExcludeAnalyzer(String text, A _A) throws IOException {
		environmentInit = new EnvironmentInit();
		environmentInit.initExcludeAnalyzer(text, _A);
		sensingMap = new SensingMap_E();
		sensingMap.initLenovoMap(environmentInit.getAnalyzer());	
	}
}