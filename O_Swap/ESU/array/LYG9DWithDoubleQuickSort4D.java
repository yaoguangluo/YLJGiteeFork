package ESU.array;
//�����㷨���ۿ���4��������С�߷�ȱ�ݹ������ۿ��������8�� ���������������򷨺���Java�����汾ʵ�֡�
//˼�룺�㷨���ۿ���4���ۣ�������С�߷�������ۡ�
//ʵ�֣�������
//ʱ�䣺20140101~ 20200711
public class LYG9DWithDoubleQuickSort4D{
	int range;
	int deeps;
	public double[] sort(double[] array, int range, int deeps) {
		this.range= range;
		this.deeps= deeps;
		processDouble(array, 0, array.length- 1, 0);
		return array;
	}

	private void processDouble(double[] array, int leftPoint, int rightPoint, int deep) {
		int c= rightPoint- leftPoint+ 1;
		if(!(c< this.range|| deep> this.deeps)) {//������deep
			int pos= partition(array, leftPoint, rightPoint);
			if(leftPoint< pos- 1) {
				processDouble(array, leftPoint, pos- 1, deep+ 1);
			}
			if(pos+ 1< rightPoint) {
				processDouble(array, pos+ 1, rightPoint, deep+ 1);
			}
			return;
		}
		int i= leftPoint;
		for(int j= i+ 1; j< leftPoint+ c; j= i++){
			while(j> leftPoint){
				if(array[j]< array[--j]){
					double temp= array[j+ 1];
					array[j+ 1]= array[j];
					array[j]= temp;
				}
			}
		}	
	}

	private int partition(double[] array, int leftPoint, int rightPoint) {
		double x= array[leftPoint]< array[rightPoint]? array[leftPoint]: array[rightPoint];
		int leftPointReflection= leftPoint;
		while(leftPointReflection< rightPoint){
			while(!(array[leftPointReflection++]> x|| leftPointReflection> rightPoint)) {}
			while(array[rightPoint--]> x) {}
			if(--leftPointReflection< ++rightPoint){
				double temp= array[rightPoint];
				array[rightPoint]= array[leftPointReflection];
				array[leftPointReflection]= temp;
			}
		}
		array[leftPoint]= array[rightPoint];
		array[rightPoint]= x;
		return rightPoint;
	}
}