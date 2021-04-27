package OSI.PCI.ASQ.pca;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import OSI.PCI.ASQ.demension.Position2D;
import OSI.PCI.ASQ.demension.Position3D;
//����������������ھ��ŵ���Ҫ�������ˡ�
//˼�룺ͳ��������ۣ����弸�Σ������ھ�
//ʵ�֣�������
public class FusionPCAFilter{
	public static Map<Double, List<Position2D>> filterFusion2DSetsWithCountScale
	(Map<Double, List<Position2D>> groups, double countScale){
		Map<Double, List<Position2D>> output= new HashMap<>();
		Iterator<Double> iterator= groups.keySet().iterator();
		while(iterator.hasNext()) {
			double value= iterator.next();
			if(groups.get(value).size()>= countScale) {
				output.put(value, groups.get(value));
			}
		}
		return output;
	}
	
	public static Map<Double, List<Position3D>> filterFusion3DSetsWithCountScale
	(Map<Double, List<Position3D>> groups, double countScale){
		Map<Double, List<Position3D>> output= new HashMap<>();
		Iterator<Double> iterator= groups.keySet().iterator();
		while(iterator.hasNext()) {
			double value= iterator.next();
			if(groups.get(value).size()>= countScale) {
				output.put(value, groups.get(value));
			}
		}
		return output;
	}
}