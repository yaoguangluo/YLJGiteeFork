package MSU.OEI.ME.SMS.SEU.OSD.OSI.E;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.Verbal;
import AVQ.ASQ.OVQ.OSQ.VSQ.stable.StableData;
import MSU.OCI.ME.SMS.translator.C.Translator;
import OCI.ME.analysis.C.A;
public class Translator_E implements Translator{
	public Map<String, String> poscc;
	public Map<String, String> posec;
	public Map<String, String> posee;
	public Map<String, String> etc;
	public Map<String, String> cte;
	public Map<String, String> fulletc;
	public Map<String, String> fullcte;
	public void init(A _A) throws IOException {
		posec = _A.getPosEnToCn();
		posee = _A.getPosEnToEn();
		poscc = _A.getPosCnToCn();
		etc = _A.getEnToCn();
		cte = _A.getCnToEn();
		fulletc = _A.getFullEnToCn();
		fullcte = _A.getFullCnToEn();
	}

	public String EnglishStringToChineseString(A _A, String EnglishString) {
		String[] nodes = _A.parserEnglishString(EnglishString);
		StringBuilder sb = new StringBuilder();
		for(String temp:nodes) {
			char[] caseTemp = temp.toCharArray();
			caseTemp[StableData.INT_ONE] = String.valueOf(caseTemp[StableData.INT_ONE])
					.toUpperCase().charAt(StableData.INT_ONE);
			if(etc.containsKey(temp)) {
				sb.append(etc.get(temp).split(StableData.NLP_DOT)[StableData.INT_ONE]);
			}else if(fulletc.containsKey(String.valueOf(caseTemp))){
				sb.append(fulletc.get(String.valueOf(caseTemp)));
			}else {
				sb.append(temp);
			}
			sb.append(StableData.SPACE_STRING);
		}
		return sb.toString();
	}
	
	public String ChineseStringToEnglishString(A _A, String ChineseString) {
		List<String> nodes = _A.parserString(ChineseString);
		StringBuilder sb = new StringBuilder();
		Iterator<String> it = nodes.iterator();
		while(it.hasNext()) {
			String temp = it.next();
			if(cte.containsKey(temp)) {
				sb.append(cte.get(temp));
			}else if(fullcte.containsKey(temp)){
				sb.append(fullcte.get(temp));
			}else {
				sb.append(temp);
			}
			sb.append(StableData.SPACE_STRING);
		}
		return sb.toString();
	}

	public String MixedStringToChineseString(A _A, String mixedString) {
		List<String> nodes = _A.parserMixedString(mixedString.toLowerCase());
		StringBuilder sb = new StringBuilder();
		Iterator<String> it = nodes.iterator();
		while(it.hasNext()) {
			String temp = it.next();
			if(poscc.containsKey(temp)) {
				sb.append(temp);
			}else {
				String[] strings = _A.parserEnglishString(temp);
				for(String string:strings) {
					if(string == null || string.length() < StableData.INT_ONE) {
						string = StableData.EMPTY_STRING;
					}
					if(etc.containsKey(string)) {
						sb.append(etc.get(string).split(StableData.NLP_DOT)[StableData.INT_ZERO]);
					}else if(fulletc.containsKey(string)){
						sb.append(fulletc.get(string));
					}else {
						sb.append(temp);
					}
				}
			}
		}
		return sb.toString();
	}

	public String ChineseStringToEnglishStringWithPOS(A _A, String ChineseString) {
		List<String> nodes = _A.parserString(ChineseString);
		StringBuilder sb = new StringBuilder();
		Iterator<String> it = nodes.iterator();
		while(it.hasNext()) {
			String temp = it.next();
			if(cte.containsKey(temp)) {
				sb.append(cte.get(temp));
			}else if(fullcte.containsKey(temp)){
				sb.append(fullcte.get(temp));
			}else {
				sb.append(temp);
			}
			if(poscc.containsKey(temp)) {
				sb.append(StableData.NLP_SYMBO_SLASH);
				sb.append(poscc.get(temp));
			}
			sb.append(StableData.SPACE_STRING);
		}
		return sb.toString();
	}

	public List<Verbal> index(A _A, String mixedString) {
		List<Verbal> verbals = new CopyOnWriteArrayList<>();
		List<String> nodes = _A.parserMixedString(mixedString.toLowerCase());
		Iterator<String> it = nodes.iterator();
		while(it.hasNext()) {
			String word = it.next();
			Verbal verbal = new Verbal();
			if(poscc.containsKey(word)) {
				verbal.setChinese(word);
				verbal.setPartOfSpeech(poscc.get(word));
				if(cte.containsKey(word)) {
					verbal.setEnglish(cte.get(word));
					if(etc.containsKey(cte.get(word))) {
						verbal.setExplain(etc.get(cte.get(word)));
					}
				}else if(fullcte.containsKey(word)){
					verbal.setEnglish(fullcte.get(word));
					verbal.setExplain(fullcte.get(word));
				}
			}else if(posee.containsKey(word)) {
				verbal.setEnglish(word);
				if(fulletc.containsKey(word)) {
					verbal.setChinese(fulletc.get(word));
				}
				if(poscc.containsKey(fulletc.get(word))) {
					verbal.setPartOfSpeech(poscc.get(fulletc.get(word)));
				}
				if(etc.containsKey(word)) {
					verbal.setExplain(etc.get(word));
				}
			}else {
				verbal.setEnglish(word);
				verbal.setChinese(fulletc.get(word));
				verbal.setPartOfSpeech(StableData.NLP_NULL);
				verbal.setExplain(StableData.NLP_NULL);
			}	
			verbals.add(verbal);
		}
		return verbals;
	}

	public List<Verbal> fixPos(List<Verbal> verbals) {
		for(int i = 0; i < verbals.size(); i++) {
			if(verbals.get(i).getPartOfSpeech() != null) {
				if(verbals.get(i).getPartOfSpeech().contains(StableData.NLP_ZI_DONG)){
					if(!verbals.get(i).getPartOfSpeech().contains(StableData.NLP_ZI_MING)){
						if(i - StableData.INT_ONE > StableData.INT_ZERO && verbals.get(i - StableData.INT_ONE)
								.getEnglish().contains(StableData.NLP_ENGLISH_OF)) {
							Verbal temp = verbals.get(i);
							temp.setPartOfSpeech(StableData.NLP_CI_DONG_MING);
							String english = temp.getEnglish().replace(StableData.SPACE_STRING, StableData.EMPTY_STRING);
							if(english.charAt(english.length() - StableData.INT_ONE) == StableData.NLP_CHAR_E) {
								english = StableData.NLP_ENGLISH_THE + StableData.SPACE_STRING 
										+ english.substring(StableData.INT_ZERO, english.length() - StableData.INT_ONE) 
										+ StableData.NLP_ENGLISH_ING;
							}else {
								english = StableData.NLP_ENGLISH_THE + StableData.SPACE_STRING + english + StableData.NLP_ENGLISH_ING;
							}
							temp.setEnglish(english);
						}else if(verbals.get(i + StableData.INT_ONE).getPartOfSpeech().contains(StableData.NLP_ZI_MING)){
							if(i - StableData.INT_ONE >= StableData.INT_ZERO && !verbals.get(i - StableData.INT_ONE).getPartOfSpeech()
									.contains(StableData.NLP_ZI_MING)){
								if(!verbals.get(i - StableData.INT_ONE).getPartOfSpeech().contains(StableData.NLP_ZI_DAI)){
									if(verbals.get(i - StableData.INT_ONE).getPartOfSpeech().contains(StableData.NLP_ZI_JIE)){
										if(verbals.get(i - StableData.INT_ONE).getChinese().contains(StableData.NLP_ZI_ZAI)){
											if(verbals.get(i + StableData.INT_ONE).getChinese().contains(StableData.NLP_ZI_ZHONG)){
												Verbal temp = verbals.get(i + StableData.INT_ONE);
												temp.setEnglish(StableData.NLP_ENGLISH_STATUS);
											}
										}
									}
									Verbal temp = verbals.get(i);
									temp.setPartOfSpeech(StableData.NLP_CI_DONG_MING);
									String english = temp.getEnglish().replace(StableData.SPACE_STRING, StableData.EMPTY_STRING);
									if(english.charAt(english.length()-StableData.INT_ONE) == StableData.NLP_CHAR_E) {
										english = StableData.NLP_ENGLISH_THE + StableData.SPACE_STRING 
												+ english.substring(StableData.INT_ZERO, english.length() - StableData.INT_ONE) 
												+ StableData.NLP_ENGLISH_ING;
									}else {
										english = StableData.NLP_ENGLISH_THE + StableData.SPACE_STRING + english + StableData.NLP_ENGLISH_ING;
									}
									temp.setEnglish(english);
								}
							}
							if(verbals.get(i + StableData.INT_TWO).getPartOfSpeech().contains(StableData.NLP_ZI_DONG)){
								if(!verbals.get(i + StableData.INT_TWO).getPartOfSpeech().contains(StableData.NLP_ZI_MING)){
									if(verbals.get(i + StableData.INT_THREE).getPartOfSpeech().contains(StableData.NLP_ZI_MING)){
										Verbal temp = verbals.get(i + StableData.INT_TWO);
										temp.setPartOfSpeech(StableData.NLP_CI_DONG_MING);
										String english = temp.getEnglish().replace(StableData.SPACE_STRING, StableData.EMPTY_STRING);
										if(english.charAt(english.length() - StableData.INT_ONE) == StableData.NLP_CHAR_E) {
											english = StableData.NLP_ENGLISH_OF + StableData.SPACE_STRING +
													StableData.NLP_ENGLISH_THE + StableData.SPACE_STRING 
													+ english.substring(StableData.INT_ZERO, english.length()-StableData.INT_ONE) 
													+ StableData.NLP_ENGLISH_ING;
										}else {
											english = StableData.NLP_ENGLISH_OF + StableData.SPACE_STRING +
													StableData.NLP_ENGLISH_THE + StableData.SPACE_STRING + english + StableData.NLP_ENGLISH_ING;
										}
										temp.setEnglish(english);
									}
								}
							}
						}else if(i - StableData.INT_ONE >= StableData.INT_ZERO && verbals.get(i - StableData.INT_ONE)
								.getPartOfSpeech().contains(StableData.NLP_ZI_JIE)){
							Verbal temp = verbals.get(i);
							temp.setPartOfSpeech(StableData.NLP_CI_DONG_MING);
							String english = temp.getEnglish().replace(StableData.SPACE_STRING, StableData.EMPTY_STRING);
							if(english.charAt(english.length() - StableData.INT_ONE) == StableData.NLP_CHAR_E) {
								english = StableData.NLP_ENGLISH_THE + StableData.SPACE_STRING + english.substring(StableData.INT_ZERO
										, english.length() - StableData.INT_ONE) + StableData.NLP_ENGLISH_ING;
							}else {
								english = StableData.NLP_ENGLISH_THE + StableData.SPACE_STRING  + english + StableData.NLP_ENGLISH_ING;
							}
							temp.setEnglish(english);
						}else if(i - StableData.INT_ONE >= StableData.INT_ZERO && verbals.get(i - StableData.INT_ONE).getPartOfSpeech()
								.contains(StableData.NLP_ZI_FU)){
							Verbal temp = verbals.get(i);
							temp.setPartOfSpeech(StableData.NLP_CI_DONG_MING);
							String english = temp.getEnglish().replace(StableData.SPACE_STRING, StableData.EMPTY_STRING);
							if(english.charAt(english.length() - StableData.INT_ONE) == StableData.NLP_CHAR_E) {
								english = english.substring(StableData.INT_ZERO, english.length() - StableData.INT_ONE) 
										+ StableData.NLP_ENGLISH_ING;
							}else {
								english += StableData.NLP_ENGLISH_ING;
							}
							temp.setEnglish(english);
						}
					}
				}else if(verbals.get(i).getPartOfSpeech().contains(StableData.NLP_ZI_MING)){
					if(i - StableData.INT_ONE >= StableData.INT_ZERO && verbals.get(i - StableData.INT_ONE)
							.getPartOfSpeech().contains(StableData.NLP_FU_SHU)){
						Verbal temp = verbals.get(i);
						String english = temp.getEnglish().replace(StableData.SPACE_STRING, StableData.EMPTY_STRING);
						if(english.charAt(english.length()-1) == StableData.NLP_CHAR_H || english.charAt(english.length()-1) 
								== StableData.NLP_CHAR_S) {
							english += StableData.NLP_ENGLISH_ES;
						}else {
							english += StableData.NLP_ENGLISH_S;
						}
						temp.setEnglish(english);
					}
				}else if(verbals.get(i).getPartOfSpeech().contains(StableData.NLP_CI_FU)){
					if(i - StableData.INT_ONE >= StableData.INT_ZERO && (verbals.get(i-StableData.INT_ONE)
							.getPartOfSpeech().contains(StableData.NLP_ZI_DAI)
							||verbals.get(i - StableData.INT_ONE).getPartOfSpeech().contains(StableData.NLP_ZI_MING))){
						if(i-StableData.INT_ONE >= StableData.INT_ZERO&&verbals.get(i - StableData.INT_ONE).getPartOfSpeech()
								.contains(StableData.NLP_ZI_��)
								||(verbals.get(i-StableData.INT_ONE).getPartOfSpeech().contains(StableData.NLP_ZI_��)
										&& verbals.get(i-StableData.INT_ONE).getPartOfSpeech().contains(StableData.NLP_ZI_һ))){
							if(verbals.get(i).getEnglish().contains(StableData.NLP_HAVE_HAS)) {
								Verbal temp = verbals.get(i);
								String english = temp.getEnglish().replace(StableData.NLP_HAVE_HAS, StableData.NLP_HAVE);
								temp.setEnglish(english);
							}
						}else {
							if(verbals.get(i).getEnglish().contains(StableData.NLP_HAVE_HAS)) {
								Verbal temp = verbals.get(i);
								String english = temp.getEnglish().replace(StableData.NLP_HAVE_HAS, StableData.NLP_HAS);
								temp.setEnglish(english);
							}
						}
					}	
					if(i-StableData.INT_TWO>= StableData.INT_ZERO && (verbals.get(i-StableData.INT_TWO).getPartOfSpeech()
							.contains(StableData.NLP_ZI_DAI) || verbals.get(i-StableData.INT_TWO).getPartOfSpeech()
							.contains(StableData.NLP_ZI_MING))){
						if(verbals.get(i-StableData.INT_TWO).getPartOfSpeech().contains(StableData.NLP_ZI_��)
							||(verbals.get(i-StableData.INT_TWO).getPartOfSpeech().contains(StableData.NLP_ZI_��)
									&&verbals.get(i-StableData.INT_TWO).getPartOfSpeech().contains(StableData.NLP_ZI_һ))){
							if(verbals.get(i).getEnglish().contains(StableData.NLP_HAVE_HAS)) {
								Verbal temp = verbals.get(i);
								String english = temp.getEnglish().replace(StableData.NLP_HAVE_HAS, StableData.NLP_HAVE);
								temp.setEnglish(english);
							}
						}else {
							if(verbals.get(i).getEnglish().contains(StableData.NLP_HAVE_HAS)) {
								Verbal temp = verbals.get(i);
								String english = temp.getEnglish().replace(StableData.NLP_HAVE_HAS, StableData.NLP_HAS);
								temp.setEnglish(english);
							}
						}
					}	 
				}	
			}
		}
		return verbals;
	}

	public String getChineseSentenseFromVerbalList(List<Verbal> verbals) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < verbals.size(); i++) {
			sb.append(verbals.get(i).getChinese() == null ? StableData.EMPTY_STRING : verbals.get(i).getChinese());
		}
		return sb.toString().replaceAll(StableData.NLP_SPASE_REP, StableData.SPACE_STRING);
	}

	public String getEnglishSentenseFromVerbalFixList(List<Verbal> verbalsFix) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<verbalsFix.size(); i++) {
			sb.append(verbalsFix.get(i).getEnglish()==null ? StableData.EMPTY_STRING : verbalsFix.get(i).getEnglish().toLowerCase());
			sb.append(StableData.SPACE_STRING);
		}
		return sb.toString().replaceAll(StableData.NLP_SPASE_REP, StableData.SPACE_STRING);
	}
}