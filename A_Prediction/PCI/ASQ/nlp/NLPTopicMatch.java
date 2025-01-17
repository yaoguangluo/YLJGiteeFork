package PCI.ASQ.nlp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import AVQ.ASQ.OVQ.OSQ.VSQ.stable.StableData;
import ESU.list.List_ESU;
import OCI.ME.analysis.C.A;
import OEI.ME.analysis.E.CogsBinaryForest_AE;
import OEU.LYG4DQS4D.LYG9DWithDoubleQuickSort4D;
//import OSI.PCI.ASQ.statistic.LYG4DWithDoubleQuickSort4D;
public class NLPTopicMatch{
	//<<NLP Algorithm of Matching The POS Scored Sentence>>.
	//This prediction algorithm mostly used for matching the best sample sentence by using score method.  
	//Theory: Yaoguang.Luo 20191228
	//Application: Yaoguang.Luo
	//Attention: need Deta Parser API OSS 
	public static String NLPBestSentenceMatch(String searchString
			, String[] sampleSentences) throws IOException {
		//init the deta mixed parser engine.
		A _A= new CogsBinaryForest_AE();
		_A.initMixed();
		//init the nlp POS(part of speech) functions.
		Map<String, String> nlp = _A.getPosCnToCn();
		List<String> keys= _A.parserMixedString(searchString);
		//find a appear frequency from the keys of search string.
		Map<String, WordFrequency> keyMap= _A.getWordFrequencyMap(keys);
		//get a POS score rights array from keyMap.
		String[] stringKeys= List_ESU.listToArray(keys);
		// I create a new algorithm of 'list to array' in my Data Swap Project. 20191228 Yaoguang. Luo
		//	public static String[] listToArray(List<String> list) {
		//		String[] output= new String[list.size()];
		//		int outputPoint= 0;
		//		Iterator<String> iterator= list.iterator();
		//		while(iterator.hasNext()) {
		//			output[outputPoint++]= iterator.next();
		//		}
		//		return output;
		//	}
		double[] scoreRights= getNLPBestSentencesMatchScoreRights(searchString
				, sampleSentences, _A, nlp, keyMap);
		//loop score array
		double[] matchScore= new double[sampleSentences.length];
		double max= 0;
		int maxPoint= 0;
		for(int i= 0; i< sampleSentences.length; i++) {
			List<String> matchList= _A.parserMixedString(sampleSentences[i]);
			Map<String, WordFrequency> matchMap= _A.getWordFrequencyMap(matchList);
			for(int j= 0; j< stringKeys.length; j++) {
				if(matchMap.containsKey(stringKeys[j])) {
					matchScore[i]+= scoreRights[j]* matchMap.get(stringKeys[j]).getFrequency();
				}
			}
			if(max< matchScore[i]) {
				max= matchScore[i];
				maxPoint= i;
			}
		}
		//output
		return sampleSentences[maxPoint];	
	}

	//<<NLP Algorithm of Matching The POS Scored Sentences>>.
	//This prediction algorithm mostly used for matching the ranged sample sentences by using score method.  
	//Theory: Yaoguang.Luo 20191229
	//Application: Yaoguang.Luo
	//Attention: need Deta Parser API OSS 
	//sortStackRange: for the sort stacks filter scale
	//filterRate: for how many sets need to delete 
	public static List<String> NLPBestSentencesMatch(String searchString
			, String[] sampleSentences, int sortStackRange, double filterRate) throws IOException {
		double[] matchScore= getNLPBestSentencesMatchScore(searchString, sampleSentences);
		//get iden key 
		Map<Double, List<String>> tempBase= new HashMap<>(); 
		for(int i= 0; i< matchScore.length; i++) {
			List<String> tempList;
			if(tempBase.containsKey(matchScore[i])) {
				tempList= tempBase.get(matchScore[i]);
			}else {
				tempList= new ArrayList<>();
			}
			tempList.add(sampleSentences[i]);
			tempBase.put(matchScore[i], tempList);
		}
		//sort
		//matchScore= new LYG4DWithDoubleQuickSort4D().sort(matchScore, sortStackRange);
		matchScore= new LYG9DWithDoubleQuickSort4D().sort(matchScore, sortStackRange, 4);//算法应用更新
		double filterCount= filterRate* matchScore.length;
		//filter
		List<String> output= new ArrayList<>();
		for(int i= (int)filterCount; i< matchScore.length; i++) {
			if(tempBase.containsKey(matchScore[i])) {
				Iterator<String> iterator= tempBase.get(matchScore[i]).iterator();
				while(iterator.hasNext()) {
					output.add(iterator.next());	
				}
				tempBase.remove(matchScore[i]);
			}
		}
		//output
		return output;	
	}

	private static double[] getNLPBestSentencesMatchScore(String searchString
			, String[] sampleSentences) throws IOException {
		//init the deta mixed parser engine.
		A _A= new CogsBinaryForest_AE();
		_A.initMixed();
		//init the nlp POS(part of speech) functions.
		Map<String, String> nlp = _A.getPosCnToCn();
		List<String> keys= _A.parserMixedString(searchString);
		//find a appear frequency from the keys of search string.
		Map<String, WordFrequency> keyMap= _A.getWordFrequencyMap(keys);
		//get a POS score rights array from keyMap.
		String[] stringKeys= List_ESU.listToArray(keys);
		double[] scoreRights= getNLPBestSentencesMatchScoreRights(searchString
				, sampleSentences, _A, nlp, keyMap);
		//loop score array
		double[] matchScore= new double[sampleSentences.length];
		for(int i= 0; i< sampleSentences.length; i++) {
			List<String> matchList= _A.parserMixedString(sampleSentences[i]);
			Map<String, WordFrequency> matchMap= _A.getWordFrequencyMap(matchList);
			for(int j= 0; j< stringKeys.length; j++) {
				if(matchMap.containsKey(stringKeys[j])) {
					matchScore[i]+= scoreRights[j]* matchMap.get(stringKeys[j]).getFrequency();
				}
			}
		}
		return matchScore;
	}

	private static double[] getNLPBestSentencesMatchScoreRights(String searchString
			, String[] sampleSentences, A _A, Map<String, String> nlp
			, Map<String, WordFrequency> keyMap) throws IOException {
		double[] scoreRights= new double[keyMap.size()];
		int scoreRightsPoint= 0;
		Iterator<String> keyIterator= keyMap.keySet().iterator();
		while(keyIterator.hasNext()) {
			String key= keyIterator.next();
			if(nlp.containsKey(key)) {
				String pos= nlp.get(key);
				//init rights of POS {30,20,10,3,1}
				if(pos.contains(StableData.NLP_CI_MING)) {// n.
					scoreRights[scoreRightsPoint]= 30* keyMap.get(key).getFrequency();
				}else if(pos.contains(StableData.NLP_CI_DONG)) {//v
					scoreRights[scoreRightsPoint]= 20* keyMap.get(key).getFrequency();
				}else if(pos.contains(StableData.NLP_CI_XING_RONG)) {//adj
					scoreRights[scoreRightsPoint]= 10* keyMap.get(key).getFrequency();
				}else {
					scoreRights[scoreRightsPoint]= 3* keyMap.get(key).getFrequency();
				}
			}else {
				scoreRights[scoreRightsPoint]= 1* keyMap.get(key).getFrequency();
			}
			scoreRightsPoint++;
		}
		return scoreRights;
	}
}