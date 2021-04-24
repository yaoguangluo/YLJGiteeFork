package OSI.OSU.AEU.AVC.SUQ.engine;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import OSI.OSU.AEU.OCI.AVC.SUQ.estimation.EmotionSample;
import OSI.OSU.AEU.OCI.AVC.SUQ.estimation.RatioMap;
import OSI.OSU.AEU.OEI.AVC.SUQ.estimation.imp.RatioMapImp;
import OSI.OSU.ASQ.PSU.OCI.ME.analysis.Analyzer;
import OSI.OSU.ASQ.PSU.OEI.ME.analysis.imp.CogsBinaryForestAnalyzerImp;
import OSI.OSU.ASQ.PSU.view.obj.WordFrequency;
import OSI.OSU.OCI.AVC.SUQ.ortho.fhmm.EmotionMap;
import OSI.OSU.OEI.AVC.SUQ.ortho.fhmm.imp.EmotionMapImp;
public class EnvironmentInit{
	public EmotionMap getEmotionMap() {
		return emotionMap;
	}

	public void setEmotionMap(EmotionMap emotionMap) {
		this.emotionMap = emotionMap;
	}

	public Analyzer getAnalyzer() {
		return analyzer;
	}

	public void setAnalyzer(Analyzer analyzer) {
		this.analyzer = analyzer;
	}

	public Map<String, Object> getPositive() {
		return positive;
	}

	public void setPositive(Map<String, Object> positive) {
		this.positive = positive;
	}

	public Map<String, Object> getNegative() {
		return negative;
	}

	public void setNegative(Map<String, Object> negative) {
		this.negative = negative;
	}

	public Map<String, Object> getMotivation() {
		return motivation;
	}

	public void setMotivation(Map<String, Object> motivation) {
		this.motivation = motivation;
	}

	public Map<String, Object> getTrending() {
		return trending;
	}

	public void setTrending(Map<String, Object> trending) {
		this.trending = trending;
	}

	public Map<String, Object> getPrediction() {
		return prediction;
	}

	public void setPrediction(Map<String, Object> prediction) {
		this.prediction = prediction;
	}

	public List<String> getSets() {
		return sets;
	}

	public void setSets(List<String> sets) {
		this.sets = sets;
	}

	public RatioMap getRationMap() {
		return rationMap;
	}

	public void setRationMap(RatioMap rationMap) {
		this.rationMap = rationMap;
	}

	public Map<Integer, WordFrequency> getWordFrequencyMap() {
		return wordFrequencyMap;
	}

	public void setWordFrequencyMap(Map<Integer, WordFrequency> wordFrequencyMap) {
		this.wordFrequencyMap = wordFrequencyMap;
	}

	public Map<String, EmotionSample> getEmotionSampleMap() {
		return emotionSampleMap;
	}

	public void setEmotionSampleMap(Map<String, EmotionSample> emotionSampleMap) {
		this.emotionSampleMap = emotionSampleMap;
	}

	public double getPositiveCount() {
		return positiveCount;
	}

	public void setPositiveCount(double positiveCount) {
		this.positiveCount = positiveCount;
	}

	public double getNegativeCount() {
		return negativeCount;
	}

	public void setNegativeCount(double negativeCount) {
		this.negativeCount = negativeCount;
	}

	public double getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(double totalCount) {
		this.totalCount = totalCount;
	}

	public Map<String, Object> getDistinction() {
		return distinction;
	}

	public void setDistinction(Map<String, Object> distinction) {
		this.distinction = distinction;
	}
	private EmotionMap emotionMap;
	private Analyzer analyzer;
	private Map<String, Object> positive;
	private Map<String, Object> negative;
	private Map<String, Object> motivation;
	private Map<String, Object> trending;
	private Map<String, Object> prediction;
	private Map<String, Object> distinction;
	private List<String> sets;
	private RatioMap rationMap;
	private Map<Integer, WordFrequency> wordFrequencyMap;
	private Map<String, EmotionSample> emotionSampleMap;
	private double positiveCount;
	private double negativeCount;
	private double totalCount;
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

		EnvironmentInit environmentInit = new EnvironmentInit();
		environmentInit.init(text);
		Map<String, EmotionSample> environmentSampleMap = environmentInit.getEmotionSampleMap();
	}

	public void init(String text) throws IOException {
		emotionMap = new EmotionMapImp(); 
		emotionMap.initMotivationMap();
		emotionMap.initTrendingMap();
		emotionMap.initPredictionMap();
		emotionMap.initDistinctionMap();
		analyzer = new CogsBinaryForestAnalyzerImp();
		analyzer.init();
		motivation = emotionMap.getMotivationMap();
		trending = emotionMap.getTrendingMap();
		prediction = emotionMap.getPredictionMap();
		distinction = emotionMap.getDistinctionMap();
		sets = analyzer.parserString(text);
		wordFrequencyMap = analyzer.getWordFrequencyByReturnSortMap(sets);
		rationMap = new RatioMapImp();
		emotionSampleMap = rationMap.getEnvironmentSampleMap(wordFrequencyMap);
		rationMap.getMotivation(emotionSampleMap, motivation);
		rationMap.getTrending(emotionSampleMap, trending);
		rationMap.getPrediction(emotionSampleMap, prediction);
		rationMap.getDistinction(emotionSampleMap, distinction);
	}
	
	public void initExcludeAnalyzer(String text, Analyzer analyzerInput) throws IOException {
		emotionMap = new EmotionMapImp(); 
		emotionMap.initMotivationMap();
		emotionMap.initTrendingMap();
		emotionMap.initPredictionMap();
		emotionMap.initDistinctionMap();
		analyzer = analyzerInput;
		motivation = emotionMap.getMotivationMap();
		trending = emotionMap.getTrendingMap();
		prediction = emotionMap.getPredictionMap();
		distinction = emotionMap.getDistinctionMap();
		sets = analyzerInput.parserString(text);
		wordFrequencyMap = analyzerInput.getWordFrequencyByReturnSortMap(sets);
		rationMap = new RatioMapImp();
		emotionSampleMap = rationMap.getEnvironmentSampleMap(wordFrequencyMap);
		rationMap.getMotivation(emotionSampleMap, motivation);
		rationMap.getTrending(emotionSampleMap, trending);
		rationMap.getPrediction(emotionSampleMap, prediction);
		rationMap.getDistinction(emotionSampleMap, distinction);
	}
	
	public void initFromEmotion(Map<Integer, WordFrequency> getWordFrequencyMap) throws IOException {
		emotionMap = new EmotionMapImp(); 
		emotionMap.initMotivationMap();
		emotionMap.initTrendingMap();
		emotionMap.initPredictionMap();
		emotionMap.initDistinctionMap();
		//parser sentence
		motivation = emotionMap.getMotivationMap();
		trending = emotionMap.getTrendingMap();
		prediction = emotionMap.getPredictionMap();
		distinction = emotionMap.getDistinctionMap();
		//map
		rationMap = new RatioMapImp();
		emotionSampleMap = rationMap.getEnvironmentSampleMap(getWordFrequencyMap);
		rationMap.getMotivation(emotionSampleMap, motivation);
		rationMap.getTrending(emotionSampleMap, trending);
		rationMap.getPrediction(emotionSampleMap, prediction);
		rationMap.getDistinction(emotionSampleMap, distinction);
	}
	
	public void initFromEmotionExcludeEmotion(Map<Integer, WordFrequency> getWordFrequencyMap, EmotionMap emotionMapInput) throws IOException {
		emotionMap = emotionMapInput;
		motivation = emotionMap.getMotivationMap();
		trending = emotionMap.getTrendingMap();
		prediction = emotionMap.getPredictionMap();
		distinction = emotionMap.getDistinctionMap();
		rationMap = new RatioMapImp();
		emotionSampleMap = rationMap.getEnvironmentSampleMap(getWordFrequencyMap);
		rationMap.getMotivation(emotionSampleMap, motivation);
		rationMap.getTrending(emotionSampleMap, trending);
		rationMap.getPrediction(emotionSampleMap, prediction);
		rationMap.getDistinction(emotionSampleMap, distinction);
	}
	
}