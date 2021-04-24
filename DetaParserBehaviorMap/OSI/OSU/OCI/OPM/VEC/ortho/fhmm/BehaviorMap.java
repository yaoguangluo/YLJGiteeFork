package OSI.OSU.OCI.OPM.VEC.ortho.fhmm;
import java.io.IOException;
import java.util.Map;
public interface BehaviorMap{
	Map<String, String> initBusinessMap() throws IOException;
	Map<String, String> initTradeMap() throws IOException;
	Map<String, String> initFacilityMap() throws IOException;
	Map<String, String> initAckuisitionMap() throws IOException;
	Map<String, String> initCoorporationMap() throws IOException;
	Map<String, String> initPromiseMap() throws IOException;
}