package OSI.OSU.ASQ.PSU.OCI.ME.nlp;
import java.util.List;
import java.util.Map;

import OSI.OSU.ASQ.PSU.AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import OSI.OSU.ASQ.PSU.OCI.ME.pos.POSController;

public interface NLPController {
	public int doSlangPartAndPOSCheckForTwoChar(int countInputStringLength, List<String> outputList
			, StringBuilder stringBuilder, Map<String, String> wordsForest, StringBuilder[] prefixWord
			, POSController posUtils, int charPosition, String textInputString);
	
	public int doPOSAndEMMCheckOfThree(int countInputLength, List<String> outputList
			, Map<String, String> wordsForest, StringBuilder stringBuilder, StringBuilder[] prefixWord
			, POSController posUtils, int charPosition, String textInputString);

	public int doSlangCheck(int countInputStringLength, List<String> output, StringBuilder stringBuilder,
			Map<String, String> wordsForest, StringBuilder[] prefixWord, POSController posUtils, int charPosition, String textInputString);

	public int doSlangCheckForMap(int countInputStringLength, List<String> output, StringBuilder stringBuilder
			, Map<String, String> wordsForest, StringBuilder[] prefixWord, POSController posUtils, int charPosition, String textInputString);

	public int doSlangPartAndPOSCheckForTwoCharForMap(int countInputStringLength, Map<String, WordFrequency> outputList
			, StringBuilder stringBuilder, Map<String, String> wordsForest, StringBuilder[] prefixWord
			, POSController posUtils);

	public int doPOSAndEMMCheckOfThreeForMap(int countInputLength, Map<String, WordFrequency> outputList
			, Map<String, String> wordsForest, StringBuilder stringBuilder, StringBuilder[] prefixWord
			, POSController posUtils);

	public int doSlangCheckForMap(int countInputStringLength, Map<String, WordFrequency> output, StringBuilder stringBuilder
			, Map<String, String> wordsForest, StringBuilder[] prefixWord, POSController posUtils);
}
