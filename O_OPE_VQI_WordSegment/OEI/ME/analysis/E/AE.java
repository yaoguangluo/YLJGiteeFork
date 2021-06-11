package OEI.ME.analysis.E;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.FMHMMNode;
import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import AVQ.ASQ.OVQ.OSQ.VSQ.stable.StableData;
import ME.utils.WordFrequencyUtil;
import OCI.AVC.SUQ.SVQ.MPC.fhmm.C.EmotionMap;
import OCI.ME.analysis.C.A;
import OCI.ME.liner.C.Quick6DLuoYaoguangSort;
import OCI.ME.nero.C.NERO_C_OneTime;
import OCI.ME.nlp.C.NLP_C;
import OCI.ME.pos.C.POS_C;
import OCI.SVQ.MPC.fhmm.C.FHMMList;
import OEI.AVC.SUQ.SVQ.MPC.fhmm.E.EmotionMap_E;
import OEI.ME.liner.E.Quick6DLuoYaoguangSort3DMap_E;
import OEI.ME.nero.E.NERO_C_OneTime_E;
import OEI.ME.nlp.E.NLP_CE;
import OEI.ME.pos.E.POS_CE;
import OEI.SVQ.MPC.fhmm.E.FMHMMListOneTime_E;

import java.util.Iterator;
import java.util.LinkedList;

import PEQ.AMV.ECS.test.SensingTest;
public class AE implements A {
	protected FHMMList fHMMList;
	protected NERO_C_OneTime neroController;
	protected NLP_C nlpController;
	protected POS_C posController;
	protected Quick6DLuoYaoguangSort quick6DLuoYaoguangSort;	
	protected Map<Long, FMHMMNode> forestRoots;
	protected Map<Long, Map<String, String>> wordsForests;
	protected Map<Long, FMHMMNode> []forestsRoots;
	protected Map<String, String> wordsForest;
	protected EmotionMap emotionMap;
	protected SensingTest sensingTest;
	public void init() throws IOException {
		this.fHMMList= new FMHMMListOneTime_E();
		fHMMList.index();
		fHMMList.indexPosEnToCn();
		fHMMList.indexPosEnToEn();
		fHMMList.indexEnToCn();
		fHMMList.indexCnToEn();
		fHMMList.indexFullEnToCn();
		fHMMList.indexFullCnToEn();
		neroController= new NERO_C_OneTime_E();
		nlpController= new NLP_CE();
		posController= new POS_CE();
		quick6DLuoYaoguangSort= new Quick6DLuoYaoguangSort3DMap_E();
		forestRoots= fHMMList.getMap();
		forestsRoots= fHMMList.getMaps();
		wordsForest= fHMMList.getPosCnToCn();
		wordsForests= fHMMList.getWordsForests();
	}

	public void initMixed() throws IOException {
		this.fHMMList= new FMHMMListOneTime_E();
		fHMMList.indexMixed();
		fHMMList.indexPosEnToCn();
		fHMMList.indexPosEnToEn();
		fHMMList.indexEnToCn();
		fHMMList.indexCnToEn();
		fHMMList.indexFullEnToCn();
		fHMMList.indexFullCnToEn();
		fHMMList.indexFullCnToPy();
		fHMMList.indexFullCnToKo();;
		fHMMList.indexFullCnToJp();;
		fHMMList.indexFullCnToTt();
		fHMMList.indexFullCnToRs();
		fHMMList.indexFullCnToAb();
		neroController= new NERO_C_OneTime_E();
		nlpController= new NLP_CE();
		posController= new POS_CE();
		quick6DLuoYaoguangSort= new Quick6DLuoYaoguangSort3DMap_E();
		forestRoots= fHMMList.getMap();
		forestsRoots= fHMMList.getMaps();
		wordsForest= fHMMList.getPosCnToCn();
		wordsForests= fHMMList.getWordsForests();
		emotionMap= new EmotionMap_E(); 
		emotionMap.initMotivationMap();
		emotionMap.initNegativeMap();
		emotionMap.initPositiveMap();
		emotionMap.initTrendingMap();
		emotionMap.initPredictionMap();
		sensingTest= new SensingTest();
	}
	
	public List<String> parserMixedString(String mixedString) {
		mixedString+= StableData.SPACE_STRING_DISTINCTION;
		int inputStringLength= mixedString.length();
		List<String> outputList = new LinkedList<>();
		int forestDepth = StableData.INT_ZERO;
		int countInputStringLength;
		StringBuilder[] fixWords = new StringBuilder[StableData.INT_TWO];
		fixWords[StableData.INT_ZERO] = new StringBuilder();
		fixWords[StableData.INT_ONE] = new StringBuilder();
		StringBuilder stringBuilder = new StringBuilder();
		int find = StableData.INT_ZERO;
		Here:
			for (int charPosition = StableData.INT_ZERO;charPosition<inputStringLength;charPosition
					+=(countInputStringLength==StableData.INT_ZERO?StableData.INT_ONE:countInputStringLength)) {
				if(mixedString.charAt(charPosition) < StableData.INT_TEN_SOUTHANDS && charPosition < inputStringLength 
						- StableData.INT_ONE){
					if(find == StableData.INT_ZERO) {
						fixWords[StableData.INT_ZERO].delete(StableData.INT_ZERO, fixWords[StableData.INT_ZERO].length());
					}
					fixWords[StableData.INT_ZERO].append(mixedString.charAt(charPosition));
					countInputStringLength = StableData.INT_ONE;
					find = StableData.INT_ONE;
					continue Here;
				}
				if(StableData.INT_ONE == find) {
					find = StableData.INT_ZERO;
					Iterator<String> it = fHMMList.englishStringToWordsList(fixWords[StableData.INT_ZERO].toString()).iterator();
					StringBuilder number= new StringBuilder();
					while(it.hasNext()) {
						String temp = it.next();
						if(StableData.NUMBERS.contains(temp)) {
							number.append(temp);
						}else {
							if(number.length()>0) {
								outputList.add(number.toString());
								number.delete(0, number.length());
							}
							outputList.add(temp);	
						}	
					}
					if(number.length()>0) {
						outputList.add(number.toString());
						number.delete(0, number.length());
					}
					fixWords[StableData.INT_ZERO].delete(StableData.INT_ZERO, fixWords[StableData.INT_ZERO].length());
				}			
				stringBuilder.delete(StableData.INT_ZERO, stringBuilder.length());
				stringBuilder = neroController.getBinaryForestRecurWordOneTime(stringBuilder.append(mixedString
						.charAt(charPosition)), mixedString, charPosition, inputStringLength, forestRoots, forestDepth
						, charPosition + StableData.INT_ONE);
				String countWordNode = stringBuilder.toString();
				int compare = countInputStringLength = countWordNode.length();
				if (StableData.INT_ONE == compare) {
					outputList.add(countWordNode);
					fixWords[StableData.INT_ZERO].delete(StableData.INT_ZERO, fixWords[StableData.INT_ZERO].length());
					fixWords[StableData.INT_ZERO].append(countWordNode);
					continue Here;
				}
				if (StableData.INT_TWO == compare) {
					countInputStringLength = nlpController.doSlangPartAndPOSCheckForTwoChar(countInputStringLength, outputList
							, stringBuilder, wordsForest, fixWords, posController, charPosition, mixedString);
					continue Here;
				}
				if (StableData.INT_THREE == compare) {
					addFixWords(charPosition, mixedString, fixWords);
					countInputStringLength = nlpController.doPOSAndEMMCheckOfThree(countInputStringLength, outputList
							, wordsForest, stringBuilder, fixWords, posController, charPosition, mixedString);
					continue Here;
				}
				if (StableData.INT_FOUR == compare) {
					addFixWords(charPosition, mixedString, fixWords);
					countInputStringLength = nlpController.doSlangCheck(countInputStringLength, outputList, stringBuilder
							, wordsForest, fixWords, posController, charPosition, mixedString);
				}
			}
		return outputList;
	}

	public List<String> parserString(String inputString) {
		List<String> outputList= new LinkedList<>();
		int inputStringLength= inputString.length();
		int forestDepth= StableData.INT_ZERO;
		int countInputStringLength;
		StringBuilder[] fixWords= new StringBuilder[StableData.INT_TWO];
		fixWords[StableData.INT_ZERO]= new StringBuilder();
		fixWords[StableData.INT_ONE]= new StringBuilder();
		StringBuilder stringBuilder= new StringBuilder();
		int find= StableData.INT_ZERO;
		Here:
			for (int charPosition= StableData.INT_ZERO; charPosition< inputStringLength; charPosition
					+= (countInputStringLength!= StableData.INT_ZERO? countInputStringLength: StableData.INT_ONE)) {
				if(StableData.INT_ONE_TWO_EIGHT> inputString.charAt(charPosition)){
					if(fixWords[StableData.INT_ZERO].length()> StableData.INT_ZERO) {
						if(fixWords[StableData.INT_ZERO].charAt(fixWords[StableData.INT_ZERO].length()- StableData.INT_ONE)
								< StableData.INT_ONE_TWO_EIGHT) {
							fixWords[StableData.INT_ZERO].append(inputString.charAt(charPosition));
							countInputStringLength= StableData.INT_ONE;
							find= StableData.INT_ONE;
							continue Here;
						}
						fixWords[StableData.INT_ZERO].delete(StableData.INT_ZERO, fixWords[StableData.INT_ZERO].length());
					}
					find= StableData.INT_ONE;
					fixWords[StableData.INT_ZERO].append(inputString.charAt(charPosition));
					countInputStringLength= StableData.INT_ONE;
					continue Here;
				}
				if(find== StableData.INT_ONE) {
					find= StableData.INT_ZERO;
					outputList.add(fixWords[StableData.INT_ZERO].toString());
				}
				stringBuilder.delete(StableData.INT_ZERO, stringBuilder.length());
				stringBuilder= neroController.getBinaryForestRecurWordOneTime(stringBuilder.append(inputString
						.charAt(charPosition)), inputString, charPosition, inputStringLength, forestRoots, forestDepth
						, charPosition+ StableData.INT_ONE);
				String countWordNode= stringBuilder.toString();
				int compare= countInputStringLength= countWordNode.length();
				if (compare== StableData.INT_ONE) {
					outputList.add(countWordNode);
					fixWords[StableData.INT_ZERO].delete(StableData.INT_ZERO, fixWords[StableData.INT_ZERO].length());
					fixWords[StableData.INT_ZERO].append(countWordNode);
					continue Here;
				}
				if (compare== StableData.INT_TWO) {
					countInputStringLength= nlpController.doSlangPartAndPOSCheckForTwoChar(countInputStringLength, outputList
							, stringBuilder, wordsForest, fixWords, posController, charPosition, inputString);
					continue Here;
				}
				if (compare== StableData.INT_THREE) {
					addFixWords(charPosition, inputString, fixWords);
					countInputStringLength= nlpController.doPOSAndEMMCheckOfThree(countInputStringLength, outputList
							, wordsForest, stringBuilder, fixWords, posController, charPosition, inputString);
					continue Here;
				}
				if (compare== StableData.INT_FOUR) {
					addFixWords(charPosition, inputString, fixWords);
					countInputStringLength= nlpController.doSlangCheck(countInputStringLength, outputList, stringBuilder
							, wordsForest, fixWords, posController, charPosition, inputString);
				}
			}
		return outputList;
	}

	public Map<String, WordFrequency> parserStringByReturnFrequencyMap(String inputString) {
		Map<String, String> wordsForest = fHMMList.getPosCnToCn();
		Map<String, WordFrequency> outputList = new ConcurrentHashMap<>();
		Map<Long, FMHMMNode> forestRoots = fHMMList.getMap();
		int inputStringLength = inputString.length();
		int forestDepth = StableData.INT_ZERO;
		int countInputStringLength;
		StringBuilder[] fixWords = new StringBuilder[StableData.INT_TWO];
		fixWords[StableData.INT_ZERO] = new StringBuilder();
		fixWords[StableData.INT_ONE] = new StringBuilder();
		StringBuilder stringBuilder = new StringBuilder();
		int find = StableData.INT_ZERO;
		Here:
			for (int charPosition= StableData.INT_ZERO; charPosition< inputStringLength; charPosition
					+= (countInputStringLength== StableData.INT_ZERO? StableData.INT_ONE: countInputStringLength)) {
				if(inputString.charAt(charPosition)< StableData.INT_ONE_TWO_EIGHT){
					if(fixWords[StableData.INT_ZERO].length()> StableData.INT_ZERO) {
						if(fixWords[StableData.INT_ZERO].charAt(fixWords[StableData.INT_ZERO].length()- StableData.INT_ONE)
								< StableData.INT_ONE_TWO_EIGHT) {
							fixWords[StableData.INT_ZERO].append(inputString.charAt(charPosition));
							countInputStringLength= StableData.INT_ONE;
							find = StableData.INT_ONE;
							continue Here;
						}
						fixWords[StableData.INT_ZERO].delete(StableData.INT_ZERO, fixWords[StableData.INT_ZERO].length());
					}
					find=StableData.INT_ONE;
					fixWords[StableData.INT_ZERO].append(inputString.charAt(charPosition));
					countInputStringLength = StableData.INT_ONE;
					continue Here;
				}
				if(find == StableData.INT_ONE) {
					find = StableData.INT_ZERO;
					WordFrequencyUtil.WordFrequencyFindCheck(outputList, fixWords);
				}
				stringBuilder.delete(StableData.INT_ZERO, stringBuilder.length());
				stringBuilder = neroController.getBinaryForestRecurWordOneTime(stringBuilder.append(inputString
						.charAt(charPosition)), inputString, charPosition, inputStringLength, forestRoots, forestDepth
						, charPosition + StableData.INT_ONE);
				String countWordNode = stringBuilder.toString();
				int compare = countInputStringLength = countWordNode.length();
				if (compare == StableData.INT_ONE) {
					WordFrequencyUtil.WordFrequencyCompareCheck(outputList, fixWords, countWordNode);
					fixWords[StableData.INT_ZERO].delete(StableData.INT_ZERO, fixWords[StableData.INT_ZERO].length());
					fixWords[StableData.INT_ZERO].append(countWordNode);
					continue Here;
				}
				if (compare == StableData.INT_TWO) {
					countInputStringLength = nlpController.doSlangPartAndPOSCheckForTwoCharForMap(countInputStringLength
							, outputList, stringBuilder, wordsForest, fixWords, posController);
					continue Here;
				}
				if (compare == StableData.INT_THREE) {
					addFixWords(charPosition, inputString, fixWords);
					countInputStringLength = nlpController.doPOSAndEMMCheckOfThreeForMap(countInputStringLength, outputList
							, wordsForest, stringBuilder, fixWords, posController);
					continue Here;
				}
				if (compare == StableData.INT_FOUR) {
					addFixWords(charPosition, inputString, fixWords);
					countInputStringLength = nlpController.doSlangCheckForMap(countInputStringLength, outputList, stringBuilder
							, wordsForest, fixWords, posController);
				}
			}
		return outputList;
	}
	
	public void addFixWords(int charPosition, String inputString, StringBuilder[] fixWords) {
		fixWords[StableData.INT_ONE].delete(StableData.INT_ZERO, fixWords[StableData.INT_ONE].length());
		if (charPosition + StableData.INT_EIGHT < inputString.length()) {
			fixWords[StableData.INT_ONE].append(inputString.substring(charPosition + StableData.INT_THREE
					, charPosition + StableData.INT_EIGHT));
			return;
		}
		fixWords[StableData.INT_ONE].append(inputString.substring(charPosition + StableData.INT_THREE
				, inputString.length()));
	}

	public Map<String, String> getEnToCn() {
		return fHMMList.getEnToCn();
	}

	public Map<String, String> getCnToEn() {
		return fHMMList.getCnToEn();
	}

	public Map<String, WordFrequency> getWordFrequencyMap(List<String> sets) throws IOException {
		Map<String, WordFrequency> map = new ConcurrentHashMap<>();
		Iterator <String> iterator = sets.iterator();
		Here:
			while(iterator.hasNext()){
				String setOfi = iterator.next();
				if (map.containsKey(setOfi)) {
					WordFrequency wordFrequency = map.get(setOfi);
					wordFrequency.setFrequency(wordFrequency.getFrequency() + StableData.INT_ONE);
					map.put(setOfi, wordFrequency);
					continue Here;
				} 
				WordFrequency wordFrequency = new WordFrequency();
				wordFrequency.setFrequency(StableData.INT_ONE);
				wordFrequency.setWord(setOfi);
				map.put(setOfi, wordFrequency);
			}
		return map;
	}

	public List<WordFrequency> sortWordFrequencyMap(Map<String, WordFrequency> map) throws IOException {
		List<WordFrequency> list = quick6DLuoYaoguangSort.frequencyWordMapToList(map);
		quick6DLuoYaoguangSort.quick6DLuoYaoGuangSortWordFrequency(list, StableData.INT_ZERO
				, list.size() - StableData.INT_ONE);
		return list;
	}

	public List<WordFrequency> getWordFrequency(List<String> sets) throws IOException {
		return sortWordFrequencyMap(getWordFrequencyMap(sets));
	}	

	public Map<Integer, WordFrequency> getWordFrequencyByReturnSortMap(List<String> sets) throws IOException {
		return sortWordFrequencyMapToSortMap(getWordFrequencyMap(sets));
	}	

	public Map<Integer, WordFrequency> sortWordFrequencyMapToUnsortMap(Map<String, WordFrequency> map){
		Map<Integer, WordFrequency> listMap = quick6DLuoYaoguangSort.frequencyWordMapToMap(map);
		return listMap;
	}

	public Map<Integer, WordFrequency> sortWordFrequencyMapToSortMap(Map<String, WordFrequency> map){
		Map<Integer, WordFrequency> listMap = quick6DLuoYaoguangSort.frequencyWordMapToMap(map);
		quick6DLuoYaoguangSort.quick6DLuoYaoGuangSortWordFrequency(listMap, StableData.INT_ZERO
				, listMap.size() - StableData.INT_ONE);
		return listMap;
	}

	public String[] parserEnglishString(String englishString) {
		String[] words = englishString.replaceAll(StableData.NLP_SPASE_REP, StableData.SPACE_STRING)
				.split(StableData.SPACE_STRING);
		if(StableData.INT_ZERO == words.length ) {
			return new String[] {StableData.SPACE_STRING};
		}
		return words;
	}

	public Map<String, String> getPosEnToCn() {
		return fHMMList.getPosEnToCn();
	}

	public Map<String, String> getPosEnToEn() {
		return fHMMList.getPosEnToEn();
	}

	public Map<String, String> getPosCnToCn() {
		return fHMMList.getPosCnToCn();
	}

	public Map<String, String> getFullEnToCn() {
		return fHMMList.getFullEnToCn();
	}

	public Map<String, String> getFullCnToEn() {
		return fHMMList.getFullCnToEn();
	}

	public Map<String, WordFrequency> parserMixStringByReturnFrequencyMap(String mixedString) {
		mixedString += StableData.SPACE_STRING;
		Map<String, String> wordsForest = fHMMList.getPosCnToCn();
		Map<String, WordFrequency> outputList = new ConcurrentHashMap<>();
		Map<Long, FMHMMNode> forestRoots = fHMMList.getMap();//.getRoot();
		int inputStringLength = mixedString.length();
		int forestDepth = StableData.INT_ZERO;
		int countInputStringLength;
		StringBuilder[] fixWords = new StringBuilder[StableData.INT_TWO];
		fixWords[StableData.INT_ZERO] = new StringBuilder();
		fixWords[StableData.INT_ONE] = new StringBuilder();
		StringBuilder stringBuilder = new StringBuilder();
		int find = StableData.INT_ZERO;
		Here:
			for (int charPosition = StableData.INT_ZERO; charPosition < inputStringLength; charPosition
					+= (countInputStringLength == StableData.INT_ZERO ? StableData.INT_ONE : countInputStringLength)) {
				//luan ma
				if(mixedString.charAt(charPosition) < StableData.INT_ONE_TWO_EIGHT && charPosition < mixedString.length()
						- StableData.INT_ONE){
					if(find == StableData.INT_ZERO) {
						fixWords[StableData.INT_ZERO].delete(StableData.INT_ZERO, fixWords[StableData.INT_ZERO].length());
					}
					fixWords[StableData.INT_ZERO].append(mixedString.charAt(charPosition));
					countInputStringLength = StableData.INT_ONE;
					find = StableData.INT_ONE;
					continue Here;
				}
				if(find == StableData.INT_ONE) {
					find = StableData.INT_ZERO;	
					Iterator<String> it = fHMMList.englishStringToWordsList(fixWords[StableData.INT_ZERO].toString()).iterator();
					while(it.hasNext()) {
						String temp=it.next();
						if (outputList.containsKey(temp)) {
							WordFrequency wordFrequency = outputList.get(temp);
							wordFrequency.setFrequency(wordFrequency.getFrequency() + StableData.INT_ONE);
							outputList.put(temp, wordFrequency);
						} else {
							WordFrequency wordFrequency = new WordFrequency();
							wordFrequency.setFrequency(StableData.INT_ONE);
							wordFrequency.setWord(temp);
							outputList.put(temp, wordFrequency);
						}
					}
					fixWords[StableData.INT_ZERO].delete(StableData.INT_ZERO, fixWords[StableData.INT_ZERO].length());
				}
				stringBuilder.delete(StableData.INT_ZERO, stringBuilder.length());
				stringBuilder = neroController.getBinaryForestRecurWordOneTime(stringBuilder.append(mixedString
						.charAt(charPosition)), mixedString, charPosition, inputStringLength, forestRoots, forestDepth
						, charPosition + StableData.INT_ONE);
				String countWordNode = stringBuilder.toString();
				int compare = countInputStringLength = countWordNode.length();
				if (compare == StableData.INT_TWO) {
					countInputStringLength = nlpController.doSlangPartAndPOSCheckForTwoCharForMap(countInputStringLength
							, outputList, stringBuilder, wordsForest, fixWords, posController);
					continue Here;
				}
				if (compare == StableData.INT_THREE) {
					addFixWords(charPosition, mixedString, fixWords);
					countInputStringLength = nlpController.doPOSAndEMMCheckOfThreeForMap(countInputStringLength, outputList
							, wordsForest, stringBuilder, fixWords, posController);
					continue Here;
				}
				if (compare == StableData.INT_ONE) {
					if (outputList.containsKey(countWordNode)) {
						WordFrequency wordFrequency = outputList.get(countWordNode);
						wordFrequency.setFrequency(wordFrequency.getFrequency() + StableData.INT_ONE);
						outputList.put(countWordNode, wordFrequency);
					} else {
						WordFrequency wordFrequency = new WordFrequency();
						wordFrequency.setFrequency(StableData.INT_ONE);
						wordFrequency.setWord(fixWords[StableData.INT_ZERO].toString());
						outputList.put(countWordNode, wordFrequency);
					}
					fixWords[StableData.INT_ZERO].delete(StableData.INT_ZERO, fixWords[StableData.INT_ZERO].length());
					fixWords[StableData.INT_ZERO].append(countWordNode);
					continue Here;
				}
				if (compare == StableData.INT_FOUR) {
					addFixWords(charPosition, mixedString, fixWords);
					countInputStringLength = nlpController.doSlangCheckForMap(countInputStringLength, outputList, stringBuilder
							, wordsForest, fixWords, posController);
				}
			}
		return outputList;
	}

	public void studyNewWord(String study, String token, String posStudy) {
		//learn new word
		FMHMMNode fFHMMNode= forestRoots.get(Long.valueOf(study.charAt(StableData.INT_ZERO)));
		Map<String, Integer> map;
		if(null== fFHMMNode) {
			fFHMMNode= new FMHMMNode();
			map= new ConcurrentHashMap<>();
		}else {
			map= fFHMMNode.getNext();
		}
		map.put(token, StableData.INT_ONE);
		fFHMMNode.setNext(map);
		forestRoots.put(Long.valueOf(study.charAt(StableData.INT_ZERO)), fFHMMNode);
		//learn new pos
		fHMMList.studyNewPos(study+token, posStudy);
	}

	@Override
	public Map<String, String> getStudyPos() {
		return fHMMList.getStudyPos();
	}

	@Override
	public Map<String, String> getPinYin() {
		return fHMMList.getFullCnToPy();
	}

	@Override
	public Map<String, String> getCtT() {
		return fHMMList.getFullCnToTt();
	}

	@Override
	public Map<String, String> getCtK() {
		return fHMMList.getFullCnToKo();
	}

	@Override
	public Map<String, String> getCtJ() {
		return fHMMList.getFullCnToJp();
	}

	@Override
	public Map<String, String> getCtR() {
		// TODO Auto-generated method stub
		return fHMMList.getFullCnToRs();
	}

	@Override
	public Map<String, String> getCtA() {
		// TODO Auto-generated method stub
		return fHMMList.getFullCnToAb();
	}

	@Override
	public EmotionMap getEmotionMap() {
		return this.emotionMap;
	}

	@Override
	public SensingTest getSensingTest() {
		// TODO Auto-generated method stub
		return this.sensingTest;
	}
}