package PEQ.test;
import java.io.IOException;


import java.util.List;
import java.util.Map;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.Verbal;
import MSU.OCI.ME.SMS.translator.C.Translator;
import MSU.OEI.ME.SMS.SEU.OSD.OSI.E.Translator_E;
import OCI.ME.analysis.C.A;
import OEI.ME.analysis.E.CogsBinaryForest_AE;

//import timeProcessor.TimeCheck;
public class DemoTSLT {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		A analyzer = new CogsBinaryForest_AE();
		analyzer.init();
		Map<String, String> ce = analyzer.getCnToEn();
		Map<String, String> ec = analyzer.getEnToCn();
		Map<String, String> poscc = analyzer.getPosCnToCn();
		Map<String, String> posec = analyzer.getPosEnToCn();
		Map<String, String> posee = analyzer.getPosEnToEn();
		Map<String, String> fce = analyzer.getFullCnToEn();
		Map<String, String> fec = analyzer.getFullEnToCn();
		System.out.println("����");
		 String v = "������֮��ѩ����佻�ϴ��";
////		 //String v = "����һֱ�ڸ�����";
//		String v = "�й���������ĵ�·�ϱ���";
//		String v = "��һֱ�ڱ��ܣ�����Ҫһ˫���";
//		String v = "��Ҳһֱ�ڱ��ܣ���ͬ����Ҫһ˫���";
		System.out.println(v);
		Translator ts = new Translator_E();
		ts.init(analyzer); 
//		TimeCheck t = new TimeCheck();
//		t.begin();
		List<Verbal> verbals = ts.index(analyzer, v);
		String ch = ts.getChineseSentenseFromVerbalList(verbals);
//		t.end();
		System.out.println("����");
		System.out.println(ch);
		
		for(int i=0;i<verbals.size();i++) {
			System.out.print(verbals.get(i).getChinese());
			System.out.print(verbals.get(i).getEnglish());
			System.out.print(verbals.get(i).getExplain());
			System.out.println(verbals.get(i).getPartOfSpeech());
		}
		List<Verbal> verbalsFix = ts.fixPos(verbals);
		String en = ts.getEnglishSentenseFromVerbalFixList(verbalsFix);
		System.out.println("");
		System.out.println("Ӣ��");
		System.out.println(en);

		for(int i=0;i<verbalsFix.size();i++) {
			System.out.print(verbalsFix.get(i).getChinese());
			System.out.print(verbalsFix.get(i).getEnglish());
			System.out.print(verbalsFix.get(i).getExplain());
			System.out.println(verbalsFix.get(i).getPartOfSpeech());
		}
		
		System.out.println("");
		System.out.println("���Ľ���");
		for(int i=0;i<verbals.size();i++) {
			System.out.print(verbals.get(i).getExplain()==null?verbals.get(i).getChinese():verbals.get(i).getExplain());
		}
//		t.duration();
		
//		ReadEnglish readEnglish = new ReadEnglish();
//		readEnglish.setPreReadText(en);
//		readEnglish.start();
	}
}