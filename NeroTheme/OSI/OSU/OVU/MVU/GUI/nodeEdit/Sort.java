package OSI.OSU.OVU.MVU.GUI.nodeEdit;
public class Sort{
	public static LinkNode sort(LinkNode first){
		while(null != first && null != first.pre){
			first = first.pre;
		}
		return first;
	}
}