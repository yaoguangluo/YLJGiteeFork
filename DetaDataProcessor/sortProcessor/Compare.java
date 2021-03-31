package sortProcessor;
public class Compare{
	public int getMiddle(int[] list, int low, int high) {
		//int tmp= list[low]<list[low]?list[low]:list[low];    //����ĵ�һ����Ϊ����
		int tmp= list[low];    //����ĵ�һ����Ϊ����
		while (low < high) {
			while (!(low >= high || list[high] < tmp)) {
			//while (low < high && list[high] >= tmp) {
				high--;
			}
			list[low] = list[high];   //������С�ļ�¼�Ƶ��Ͷ�
			while (!(low >= high || list[low] > tmp)) {
				//	while (low < high && list[low] <= tmp) {
				low++;
			}
			list[high] = list[low];   //�������ļ�¼�Ƶ��߶�
		}
		list[low] = tmp;              //�����¼��β
		return low;                   //���������λ��
	}

	public void _quickSort(int[] a, int lp, int rp) {
		if(lp < rp){
			int c = rp - lp; if(c < 7){ int j;
			for(int i = 1 + lp; i <= lp + c; i++){
				j = i;while(j>=1+lp){
					if(a[j]<a[j-1]){
						int temp=a[j];a[j]=a[j-1];a[j-1]=temp;
					}
					j--;
				}
			}	
			return;
			}
			int pos = getMiddle(a, lp, rp);
			_quickSort(a, lp, pos-1);
			_quickSort(a, pos+1, rp);
		}
	}

	public int[] quick(int[] str) {
		if (str.length > 0) {    //�鿴�����Ƿ�Ϊ��
			_quickSort(str, 0, str.length - 1);
		}
		return str;
	}	
}
