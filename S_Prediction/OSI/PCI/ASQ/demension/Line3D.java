package OSI.PCI.ASQ.demension;
//Theory: �޷���֤
//Application: Yaoguang.luo
public class Line3D{
	public Position3D getBegin() {
		return begin;
	}
	public void setBegin(Position3D begin) {
		this.begin = begin;
	}
	public Position3D getEnd() {
		return end;
	}
	public void setEnd(Position3D end) {
		this.end = end;
	}
	private Position3D begin;
	private Position3D end;
}