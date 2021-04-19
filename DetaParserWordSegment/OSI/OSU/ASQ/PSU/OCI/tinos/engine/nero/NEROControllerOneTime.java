package OSI.OSU.ASQ.PSU.OCI.tinos.engine.nero;
import java.util.Map;

import OSI.OSU.ASQ.PSU.tinos.view.obj.FMHMMNode;
public interface NEROControllerOneTime {
	StringBuilder getBinaryForestsRecurWordOneTime(StringBuilder inputStringWordNode, String inputString, int charPosition
			, int inputStringLength, Map<Long, FMHMMNode>[] forestsRoots, int forestDepth, int charPositionNext);
	StringBuilder getBinaryForestRecurWordOneTime(StringBuilder inputStringWordNode, String inputString, int charPosition
			, int inputStringLength, Map<Long, FMHMMNode> forestRoots, int forestDepth, int charPositionNext);
	StringBuilder getQuickForestRecurWord(StringBuilder inputStringWordNode, String inputString, int charPosition
			, int inputStringLength, Map<String, String> forestRoots, int forestDepth, int charPositionNext);
}
