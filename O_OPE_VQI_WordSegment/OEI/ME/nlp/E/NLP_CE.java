package OEI.ME.nlp.E;
import java.util.List;
import java.util.Map;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import AVQ.ASQ.OVQ.OSQ.VSQ.stable.StableData;
import AVQ.ASQ.OVQ.OSQ.VSQ.stable.StableMaps;
import ME.utils.WordForestUtil;
import OCI.ME.nlp.C.NLP_C;
import OCI.ME.pos.C.POS_C;
public class NLP_CE implements NLP_C{
	public int doSlangPartAndPOSCheckForTwoChar(int countInputStringLength, List<String> outputList
			, StringBuilder stringBuilder, Map<String, String> wordsForest, StringBuilder[] prefixWord
			, POS_C posUtils, int charPosition, String textInputString){
		String countWordNode= stringBuilder.toString();
		if (prefixWord[StableData.INT_ZERO].length()== StableData.INT_ZERO){
			if(StableMaps.CiTwo.containsKey(countWordNode)) {
				prefixWord[StableData.INT_ZERO].delete(StableData.INT_ZERO, prefixWord[StableData.INT_ZERO].length());
				prefixWord[StableData.INT_ZERO].append(countWordNode);
				outputList.add(countWordNode);
				return countInputStringLength;
			}
			prefixWord[StableData.INT_ZERO].delete(StableData.INT_ZERO, prefixWord[StableData.INT_ZERO].length());
			prefixWord[StableData.INT_ZERO].append(stringBuilder.charAt(StableData.INT_ZERO));
			outputList.add(StableData.EMPTY_STRING+ stringBuilder.charAt(StableData.INT_ZERO));
			return countInputStringLength- StableData.INT_ONE;
		}
		String[] strings= new String[StableData.INT_TWO];
		strings[StableData.INT_ZERO]= String.valueOf(countWordNode.charAt(StableData.INT_ZERO));
		strings[StableData.INT_ONE]= countWordNode;
		if (StableMaps.mingCi.containsKey(strings[StableData.INT_ZERO])){
			countInputStringLength= posUtils.chuLiMingCiOfTwo(wordsForest, outputList, countInputStringLength
					, strings, prefixWord, charPosition, textInputString);
			return countInputStringLength;
		}
		if (StableMaps.baDongCi.containsKey(strings[StableData.INT_ZERO])){
			countInputStringLength = posUtils.chuLiBaDongCiOfTwo(wordsForest, outputList, countInputStringLength
					, strings, prefixWord);
			return countInputStringLength;
		}
		if (StableMaps.jieCi.containsKey(strings[StableData.INT_ZERO].toString())){
			if (StableMaps.dongCi.containsKey(prefixWord[StableData.INT_ZERO].toString())){
				if (!StableMaps.jieCi.containsKey(countWordNode)){
					countInputStringLength= posUtils.parserFirstCharOfTwo(countInputStringLength, outputList, strings, prefixWord);
					return countInputStringLength;
				}
			}
		}
		if (StableMaps.CiTwo.containsKey(countWordNode)){
			prefixWord[StableData.INT_ZERO].delete(StableData.INT_ZERO, prefixWord[StableData.INT_ZERO].length());
			prefixWord[StableData.INT_ZERO].append(countWordNode);
			outputList.add(countWordNode);
			return countInputStringLength;
		}
		countInputStringLength= posUtils.parserFirstCharOfTwo(countInputStringLength, outputList, strings, prefixWord);
		return countInputStringLength;
	}

	public int doPOSAndEMMCheckOfThree(int countInputLength, List<String> outputList
			, Map<String, String> wordsForest, StringBuilder stringBuilder, StringBuilder[] prefixWord
			, POS_C posUtils, int charPosition, String textInputString){
		String inputString= stringBuilder.toString();
		if (StableMaps.CiThree.containsKey(inputString)){
			prefixWord[StableData.INT_ZERO].delete(StableData.INT_ZERO, prefixWord[StableData.INT_ZERO].length());
			prefixWord[StableData.INT_ZERO].append(inputString);
			outputList.add(inputString);
			return countInputLength;
		}
		String[] strings= new String[StableData.INT_FOUR];
		strings[StableData.INT_ZERO]= String.valueOf(inputString.charAt(StableData.INT_ZERO));
		strings[StableData.INT_ONE]= String.valueOf(inputString.charAt(StableData.INT_ZERO)) 
				+ inputString.charAt(StableData.INT_ONE);
		strings[StableData.INT_TWO]= String.valueOf(inputString.charAt(StableData.INT_ONE)) 
				+ inputString.charAt(StableData.INT_TWO);
		strings[StableData.INT_THREE]= String.valueOf(inputString.charAt(StableData.INT_TWO));
		if (null== prefixWord[StableData.INT_ZERO]){
			if (StableMaps.CiThree.containsKey(inputString)){
				prefixWord[StableData.INT_ZERO].delete(StableData.INT_ZERO, prefixWord[StableData.INT_ZERO].length());
				prefixWord[StableData.INT_ZERO].append(inputString);
				outputList.add(inputString);
				return countInputLength;
			} 
			StringBuilder stringsBuilder= new StringBuilder();
			countInputLength= doSlangPartAndPOSCheckForTwoChar(--countInputLength, outputList
					, stringsBuilder.append(strings[StableData.INT_ONE]), wordsForest, prefixWord, posUtils, charPosition, textInputString);
			return countInputLength;
		}
		if (!StableMaps.CiOne.containsKey(strings[StableData.INT_ZERO])){
			StringBuilder stringsBuilder= new StringBuilder();
			countInputLength= doSlangPartAndPOSCheckForTwoChar(--countInputLength, outputList
					, stringsBuilder.append(strings[StableData.INT_ONE]), wordsForest, prefixWord, posUtils, charPosition, textInputString);
			return countInputLength;
		}
		if(StableMaps.lianCi.containsKey(strings[StableData.INT_THREE])) {
			countInputLength = posUtils.chuLiLianCiPostFixOfThree(wordsForest, outputList, countInputLength, strings, prefixWord);
			return countInputLength;
		}
		if (StableMaps.lianCi.containsKey(strings[StableData.INT_ZERO])){
			countInputLength = posUtils.chuLiLianCiOfThree(wordsForest, outputList, countInputLength, strings, prefixWord);
			return countInputLength;
		}
		if (StableMaps.jieCi.containsKey(strings[StableData.INT_ZERO])){
			countInputLength = posUtils.chuLiJieCiOfThree(wordsForest, outputList, countInputLength, strings, prefixWord);
			return countInputLength;
		}
		if (StableMaps.zhuCi.containsKey(strings[StableData.INT_ZERO])){
			countInputLength = posUtils.chuLiZhuCiOfThree(wordsForest, outputList, countInputLength, strings, prefixWord);
			return countInputLength;
		}
		if (StableMaps.liangCi.containsKey(strings[StableData.INT_ZERO])){
			countInputLength = posUtils.chuLiLiangCiOfThree(wordsForest, outputList, countInputLength, strings, prefixWord);
			return countInputLength;
		}
		if (StableMaps.mingCi.containsKey(strings[StableData.INT_ZERO])){
			countInputLength= posUtils.chuLiMingCiOfThree(wordsForest, outputList, countInputLength, strings, prefixWord);
			return countInputLength;
		}
		if (StableMaps.shiTaiCi.containsKey(strings[StableData.INT_ZERO])){
			countInputLength= posUtils.chuLiShiTaiCiOfThree(wordsForest, outputList, countInputLength, strings, prefixWord);
			return countInputLength;
		}
		if (StableMaps.dongCi.containsKey(strings[StableData.INT_ZERO])||StableMaps.fuCi.containsKey(strings[StableData.INT_ZERO])){
			if(StableMaps.zhuCi.containsKey(prefixWord[StableData.INT_ZERO].toString())
					&& (StableMaps.liangCi.containsKey(strings[StableData.INT_TWO])
					|| StableMaps.jieCi.containsKey(strings[StableData.INT_TWO]))) {
				countInputLength = posUtils.parserFirstCharOfThree(countInputLength, outputList, strings, prefixWord);
				return countInputLength;
			}
			if(StableMaps.fuCi.containsKey(strings[StableData.INT_TWO])||StableMaps.mingCi.containsKey(strings[StableData.INT_TWO])
					||StableMaps.daiCi.containsKey(strings[StableData.INT_TWO])) {
				countInputLength = posUtils.parserFirstCharOfThree(countInputLength, outputList, strings, prefixWord);
				return countInputLength;
			}
		}
		if (StableMaps.fuCi.containsKey(strings[StableData.INT_ZERO])){
			countInputLength= posUtils.chuLiFuCiOfThree(wordsForest, outputList, countInputLength, strings, prefixWord);
			return countInputLength;
		}
		if(StableMaps.CiTwo.containsKey(strings[StableData.INT_ONE])) {
			StringBuilder stringsBuilder= new StringBuilder();
			countInputLength= doSlangPartAndPOSCheckForTwoChar(--countInputLength, outputList, stringsBuilder.append(strings[StableData.INT_ONE])
					, wordsForest, prefixWord, posUtils, charPosition, textInputString);
			return countInputLength;
		}
		outputList.add(strings[StableData.INT_ZERO]);
		prefixWord[StableData.INT_ZERO].delete(StableData.INT_ZERO, prefixWord[StableData.INT_ZERO].length());
		prefixWord[StableData.INT_ZERO].append(strings[StableData.INT_ZERO]);
		return StableData.INT_ONE;
	} 
// 2�����о����� ����Խ��Խ��, ���ݵ�Ħ������, �Ȱ�δ֪�ʻ�Ҳ��ӵ�������. ֮����� �ų����Ż�.
//	if(StableMaps.jieCi.containsKey(preRegister)|| StableMaps.mingCi.containsKey(preRegister)|| StableMaps.xingRongCi.containsKey(preRegister)
//	|| StableMaps.fuCi.containsKey(preRegister)|| StableMaps.dongCi.containsKey(preRegister)|| StableMaps.lianCi.containsKey(preRegister)
//	|| StableMaps.liangCi.containsKey(preRegister)|| StableMaps.xingWeiCi.containsKey(preRegister)|| StableMaps.shiTaiCi.containsKey(preRegister)
//	|| StableMaps.zhuCi.containsKey(preRegister)) {
//if(StableMaps.mingCi.containsKey(postRegister)|| StableMaps.dongCi.containsKey(postRegister)|| StableMaps.lianCi.containsKey(postRegister)
//		|| StableMaps.xingRongCi.containsKey(postRegister)|| StableMaps.xingWeiCi.containsKey(postRegister)|| StableMaps.liangCi.containsKey(preRegister)
//		|| StableMaps.fuCi.containsKey(postRegister)|| StableMaps.jieCi.containsKey(postRegister)) {
	public int doSlangCheck(int countInputStringLength, List<String> output, StringBuilder stringBuilder,
			Map<String, String> wordsForest, StringBuilder[] prefixWord, POS_C posUtils, int charPosition, String textInputString){
		String inputString = stringBuilder.toString();
		if (StableMaps.CiFour.containsKey(inputString)){
			output.add(inputString);
			prefixWord[StableData.INT_ZERO].delete(StableData.INT_ZERO, prefixWord[StableData.INT_ZERO].length());
			prefixWord[StableData.INT_ZERO].append(inputString);
			return countInputStringLength;
		}//will make pre 3 or post 3 check. now finished pre 3 .20190330
		String preRegister= StableData.EMPTY_STRING+ inputString.charAt(StableData.INT_ZERO)+ inputString.charAt(StableData.INT_ONE);
		String inRegister= StableData.EMPTY_STRING+ inputString.charAt(StableData.INT_ONE)+ inputString.charAt(StableData.INT_TWO);
		String postRegister= StableData.EMPTY_STRING+ inputString.charAt(StableData.INT_TWO)+ inputString.charAt(StableData.INT_THREE);
		if(StableMaps.dongCi.containsKey(StableData.EMPTY_STRING+ inputString.charAt(StableData.INT_THREE)
		+ prefixWord[StableData.INT_ONE].charAt(StableData.INT_ZERO))) {
			countInputStringLength= doPOSAndEMMCheckOfThree(--countInputStringLength, output, wordsForest
					, stringBuilder.delete(StableData.INT_THREE, StableData.INT_FOUR), prefixWord, posUtils, charPosition, textInputString);
			return countInputStringLength;
		}	
		if (StableMaps.CiTwo.containsKey(preRegister)){
			if (StableMaps.CiTwo.containsKey(postRegister)){
				String string= StableData.EMPTY_STRING+ inputString.charAt(StableData.INT_ZERO);
				if(StableMaps.xingWeiCi.containsKey(prefixWord[StableData.INT_ZERO].toString())
						&&StableMaps.shiTaiCi.containsKey(string)) {
					output.add(string);
					prefixWord[StableData.INT_ZERO].delete(StableData.INT_ZERO, prefixWord[StableData.INT_ZERO].length());
					prefixWord[StableData.INT_ZERO].append(string);
					return countInputStringLength- StableData.INT_THREE;
				}
				if(StableMaps.zhuCi.containsKey(string)){
					String[] strings= new String[StableData.INT_FOUR];
					strings[StableData.INT_ZERO]= String.valueOf(inputString.charAt(StableData.INT_ZERO));
					strings[StableData.INT_ONE]= String.valueOf(inputString.charAt(StableData.INT_ZERO)) 
							+ inputString.charAt(StableData.INT_ONE);
					strings[StableData.INT_TWO]= String.valueOf(inputString.charAt(StableData.INT_ONE)) 
							+ inputString.charAt(StableData.INT_TWO);
					strings[StableData.INT_THREE]= String.valueOf(inputString.charAt(StableData.INT_TWO));
					countInputStringLength= posUtils.chuLiZhuCiOfThree(wordsForest, output, countInputStringLength-StableData.INT_ONE, strings, prefixWord);
					return countInputStringLength;
				}
				output.add(preRegister);
				prefixWord[StableData.INT_ZERO].delete(StableData.INT_ZERO, prefixWord[StableData.INT_ZERO].length());
				prefixWord[StableData.INT_ZERO].append(preRegister);
				return countInputStringLength-StableData.INT_TWO;
			}
		}
		if(StableMaps.CiThree.containsKey(preRegister+ inputString.charAt(StableData.INT_TWO))&& !StableMaps.CiTwo.containsKey(postRegister)) {
			prefixWord[StableData.INT_ZERO].delete(StableData.INT_ZERO, prefixWord[StableData.INT_ZERO].length());
			prefixWord[StableData.INT_ZERO].append(preRegister+ inputString.charAt(StableData.INT_TWO));
			output.add(preRegister+ inputString.charAt(StableData.INT_TWO));
			return countInputStringLength- StableData.INT_ONE ;
		}
		if(StableMaps.CiTwo.containsKey(preRegister)&& StableMaps.CiTwo.containsKey(inRegister)) {
			countInputStringLength= doPOSAndEMMCheckOfThree(--countInputStringLength, output, wordsForest
					, stringBuilder.delete(StableData.INT_THREE, StableData.INT_FOUR), prefixWord, posUtils, charPosition, textInputString);
			return countInputStringLength;
		}	
		if(StableMaps.CiTwo.containsKey(preRegister)) {
			countInputStringLength= doSlangPartAndPOSCheckForTwoChar(countInputStringLength- StableData.INT_TWO, output
					, stringBuilder.delete(StableData.INT_TWO, StableData.INT_FOUR), wordsForest, prefixWord, posUtils, charPosition, textInputString);
			return countInputStringLength;
		}
		output.add(StableData.EMPTY_STRING+ inputString.charAt(StableData.INT_ZERO));
		prefixWord[StableData.INT_ZERO].delete(StableData.INT_ZERO, prefixWord[StableData.INT_ZERO].length());
		prefixWord[StableData.INT_ZERO].append(StableData.EMPTY_STRING+ inputString.charAt(StableData.INT_ZERO));
		return countInputStringLength= StableData.INT_ONE;
	}
//��ŵͼ����.PCA���ŷ���. ����߻�, .ԭ����ע���� ,20190523
//	if(!wordsForest.containsKey(preRegister)&& (wordsForest.containsKey(inRegister)||wordsForest.containsKey(postRegister))) {
//	if(wordsForest.containsKey(preRegister+ inputString.charAt(StableData.INT_TWO))) {
//		output.add(preRegister+ inputString.charAt(StableData.INT_TWO));
//		prefixWord[StableData.INT_ZERO].delete(StableData.INT_ZERO, prefixWord[StableData.INT_ZERO].length());
//		prefixWord[StableData.INT_ZERO].append(preRegister+ inputString.charAt(StableData.INT_TWO));
//		return countInputStringLength- StableData.INT_ONE;
//	}
//	output.add(StableData.EMPTY_STRING+ inputString.charAt(StableData.INT_ZERO));
//	prefixWord[StableData.INT_ZERO].delete(StableData.INT_ZERO, prefixWord[StableData.INT_ZERO].length());
//	prefixWord[StableData.INT_ZERO].append(StableData.EMPTY_STRING+ inputString.charAt(StableData.INT_ZERO));
//	return countInputStringLength- StableData.INT_THREE;
//}

//if(wordsForest.containsKey(preRegister)&& wordsForest.containsKey(inRegister+ inputString.charAt(StableData.INT_THREE))) {
//	countInputStringLength= doPOSAndEMMCheckOfThree(--countInputStringLength, output, wordsForest
//			, stringBuilder.delete(StableData.INT_THREE, StableData.INT_FOUR), prefixWord, posUtils, charPosition, textInputString);
//	return countInputStringLength;
//}
//if(wordsForest.containsKey(preRegister)) {
//	countInputStringLength= doPOSAndEMMCheckOfThree(--countInputStringLength, output, wordsForest
//			, stringBuilder.delete(StableData.INT_THREE, StableData.INT_FOUR), prefixWord, posUtils, charPosition, textInputString);
//	return countInputStringLength;
//}
	public int doSlangCheckForMap(int countInputStringLength, List<String> output, StringBuilder stringBuilder
			, Map<String, String> wordsForest, StringBuilder[] prefixWord, POS_C posUtils, int charPosition, String textInputString){
		String inputString= stringBuilder.toString();
		if (wordsForest.containsKey(inputString)){
			output.add(inputString);
			prefixWord[StableData.INT_ZERO].delete(StableData.INT_ZERO, prefixWord[StableData.INT_ZERO].length());
			prefixWord[StableData.INT_ZERO].append(inputString);
			return countInputStringLength;
		}
		countInputStringLength= doPOSAndEMMCheckOfThree(--countInputStringLength, output, wordsForest
				, stringBuilder.delete(StableData.INT_THREE, StableData.INT_FOUR), prefixWord, posUtils, charPosition, textInputString);
		return countInputStringLength;
	}

	public int doSlangPartAndPOSCheckForTwoCharForMap(int countInputStringLength, Map<String, WordFrequency> outputList
			, StringBuilder stringBuilder, Map<String, String> wordsForest, StringBuilder[] prefixWord
			, POS_C posUtils){
		String countWordNode= stringBuilder.toString();
		if (!wordsForest.containsKey(countWordNode)){
			WordForestUtil.wordsForestNotContainsKey(outputList, countWordNode, prefixWord);
			return --countInputStringLength;
		}
		if (prefixWord[StableData.INT_ZERO].length()== StableData.INT_ZERO){
			WordForestUtil.prefixWordEqualZero(outputList, countWordNode, prefixWord);
			return countInputStringLength;
		}
		String[] strings= new String[StableData.INT_TWO];
		strings[StableData.INT_ZERO]= String.valueOf(countWordNode.charAt(StableData.INT_ZERO));
		strings[StableData.INT_ONE]= String.valueOf(countWordNode.charAt(StableData.INT_ZERO))
				+ String.valueOf(countWordNode.charAt(StableData.INT_ONE));
		if (wordsForest.containsKey(strings[StableData.INT_ZERO])){
			if (wordsForest.get(strings[StableData.INT_ZERO]).contains(StableData.NLP_CI_MING)){
				countInputStringLength= posUtils.chuLiMingCiOfTwoForMap(wordsForest, outputList, countInputStringLength
						, strings, prefixWord);
				return countInputStringLength;
			}
		}
		if (wordsForest.containsKey(strings[StableData.INT_ONE])){
			WordForestUtil.wordsForestContainsKey(outputList, countWordNode, prefixWord);
			return countInputStringLength;
		}
		return StableData.INT_ZERO;
	}

	public int doPOSAndEMMCheckOfThreeForMap(int countInputLength, Map<String, WordFrequency> outputList
			, Map<String, String> wordsForest, StringBuilder stringBuilder, StringBuilder[] prefixWord
			, POS_C posUtils){
		String inputString= stringBuilder.toString();
		if (wordsForest.containsKey(inputString)){
			WordForestUtil.wordsForestContainsKey(outputList, inputString, prefixWord);
			return countInputLength;
		}
		String[] strings= new String[StableData.INT_FOUR];
		strings[StableData.INT_ZERO]= String.valueOf(inputString.charAt(StableData.INT_ZERO));
		strings[StableData.INT_ONE]= String.valueOf(inputString.charAt(StableData.INT_ZERO)) 
				+ inputString.charAt(StableData.INT_ONE);
		strings[StableData.INT_TWO]= String.valueOf(inputString.charAt(StableData.INT_ONE) 
				+ inputString.charAt(StableData.INT_TWO));
		strings[StableData.INT_THREE]= String.valueOf(inputString.charAt(StableData.INT_TWO));
		if (null== prefixWord[StableData.INT_ZERO]){
			if (wordsForest.containsKey(inputString)){
				WordForestUtil.wordsForestContainsKey(outputList, inputString, prefixWord);
				return countInputLength;
			} 
			StringBuilder stringsBuilder= new StringBuilder();
			countInputLength= doSlangPartAndPOSCheckForTwoCharForMap(--countInputLength, outputList
					, stringsBuilder.append(strings[StableData.INT_ONE]), wordsForest, prefixWord, posUtils);
			return countInputLength;
		}
		if (!wordsForest.containsKey(strings[StableData.INT_ZERO])){
			StringBuilder stringsBuilder= new StringBuilder();
			countInputLength= doSlangPartAndPOSCheckForTwoCharForMap(--countInputLength, outputList
					, stringsBuilder.append(strings[StableData.INT_ONE]), wordsForest, prefixWord, posUtils);
			return countInputLength;
		}
		if (StableMaps.zhuCi.containsKey(strings[StableData.INT_ZERO])){
			countInputLength= posUtils.chuLiZhuCiOfThreeForMap(wordsForest, outputList, countInputLength
					, strings, prefixWord);
			return countInputLength;
		}
		if (StableMaps.liangCi.containsKey(strings[StableData.INT_ZERO])){
			countInputLength= posUtils.chuLiLiangCiOfThreeForMap(wordsForest, outputList, countInputLength
					, strings, prefixWord);
			return countInputLength;
		}
		if (StableMaps.zhuCi.containsKey(strings[StableData.INT_ZERO])){
			countInputLength= posUtils.chuLiJieCiOfThreeForMap(wordsForest, outputList, countInputLength
					, strings, prefixWord);
			return countInputLength;
		}
		if (StableMaps.lianCi.containsKey(strings[StableData.INT_ZERO])){
			countInputLength= posUtils.chuLiLianCiOfThreeForMap(wordsForest, outputList, countInputLength
					, strings, prefixWord);
			return countInputLength;
		}
		StringBuilder stringsBuilder= new StringBuilder();
		countInputLength= doSlangPartAndPOSCheckForTwoCharForMap(--countInputLength, outputList
				, stringsBuilder.append(strings[StableData.INT_ONE]), wordsForest, prefixWord, posUtils);
		return countInputLength;
	} 

	public int doSlangCheckForMap(int countInputStringLength, Map<String, WordFrequency> output, StringBuilder stringBuilder
			, Map<String, String> wordsForest, StringBuilder[] prefixWord, POS_C posUtils){
		String inputString= stringBuilder.toString();
		if (wordsForest.containsKey(inputString)){
			WordForestUtil.wordsForestContainsKey(output, inputString, prefixWord);
			return countInputStringLength;
		}
		if(StableMaps.mingCi.containsKey(StableData.EMPTY_STRING+ inputString.charAt(StableData.INT_ZERO)+ inputString.charAt(StableData.INT_ONE))) {
			if(StableMaps.mingCi.containsKey(StableData.EMPTY_STRING+ inputString.charAt(StableData.INT_TWO)+ inputString.charAt(StableData.INT_THREE))) {
				WordForestUtil.wordsForestContainsKey(output, StableData.EMPTY_STRING+ inputString.charAt(StableData.INT_ZERO)+ inputString.charAt(StableData.INT_ONE), prefixWord);
				return countInputStringLength;
			}
		}
		countInputStringLength= doPOSAndEMMCheckOfThreeForMap(--countInputStringLength, output, wordsForest
				, stringBuilder.delete(StableData.INT_THREE, StableData.INT_FOUR), prefixWord, posUtils);
		return countInputStringLength;
	}
}