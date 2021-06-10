package OCI.ME.liner.C;
import java.util.List;
import java.util.Map;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;
public interface Quick6DLuoYaoguangSort {
	void quick6DLuoYaoGuangSortWordFrequency(List<WordFrequency> list, int leftPosition, int rightPosition);
	int partition(List<WordFrequency> list, int leftPosition, int rightPosition);
	List<WordFrequency> frequencyWordMapToList(Map<String, WordFrequency> map);

	void quick6DLuoYaoGuangSortWordFrequency(Map<Integer, WordFrequency> map, int leftPosition, int rightPosition);
	int partition(Map<Integer, WordFrequency> map, int leftPosition, int rightPosition);
	Map<Integer, WordFrequency> frequencyWordMapToMap(Map<String, WordFrequency> map);
}