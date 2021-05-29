package OEU.LYG4DQS4D;
import java.io.BufferedReader;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
//20200314 ���������µ�С�߷���˴߻�����5��˼�롣

//20200818 ���������µ�С�߷���˴߻�����9��˼�롣
//����ͬƴ��ͬ�ʻ����ְ�char��int��С����20210529
//������
import java.util.Map;

import ME.S.stables.PathLinkFile;
import PEU.S.verbal.VerbalSource;
public class LYG10DWithChineseMixStringSort13D{
	Map<String, Boolean> find= new HashMap<>();
	Map<String, String> pinyin;
	Map<String, Integer> filter= new HashMap<>();
	int range;
	int deeps;
	String numbers= "0123456789.Ee";
	private Map<String, Integer> bihua;
	public void quick4DChineseStringArray1D(String[] strings, int scale, Map<String, String> map
			, int range, int deeps, Map<String, Integer> bihua) {
		this.pinyin= map;
		this.range= range;
		this.deeps= deeps;
		this.bihua= bihua;
		processKernel(strings, 0, strings.length- 1, scale, 0);
	}

	public boolean quick4DChineseStringArrayWithSmallInTwoChar(String[] strings, int leftPosition
			, int rightPosition, int scale, Map<String, String> map, int range, int deeps) {
		this.pinyin= map;
		this.range= range;
		this.deeps= deeps;
		String oldValue=strings[0].toString();
		processKernel(strings, leftPosition, rightPosition, scale, 0);
		if(oldValue.equalsIgnoreCase(strings[0])){
			return true;
		}else {
			return false;
		}
	}

	public int quick4DChineseStringArrayWithSmallInTwoChar3Returns(String[] strings, int leftPosition
			, int rightPosition, int scale, Map<String, String> map, int range, int deeps) {
		this.pinyin= map;
		this.range= range;
		this.deeps= deeps;
		String oldValue=strings[0].toString();
		processKernel(strings, leftPosition, rightPosition, scale, 0);

		//��1 �� ��1    �� 1�� ��2
		//��1 �� ��1    �� 1 ���� ��2
		//��1 ���� ��1    �� 1�� ��2
		//��1 ���� ��1    �� 1���� ��2

		if(strings[0].equals(strings[1])) {
			return 0;
		}
		if(oldValue.equalsIgnoreCase(strings[0])) {
			return 1;
		}
		if(!oldValue.equalsIgnoreCase(strings[0])) {
			return -1;
		}
		if(oldValue.equalsIgnoreCase(strings[1])) {
			return -1;
		}
		if(!oldValue.equalsIgnoreCase(strings[1])) {
			return 1;
		}
		return 0;
	}

	public int quick4DChineseStringArrayWithSmallInTwoChar3bihuaReturns(String[] strings, int leftPosition
			, int rightPosition, int scale, Map<String, String> map, Map<String, Integer> bihua, int range, int deeps) {
		this.pinyin= map;
		this.range= range;
		this.deeps= deeps;
		this.bihua= bihua;
		String oldValue=strings[0].toString();
		processKernel(strings, leftPosition, rightPosition, scale, 0);

		//��1 �� ��1    �� 1�� ��2
		//��1 �� ��1    �� 1 ���� ��2
		//��1 ���� ��1    �� 1�� ��2
		//��1 ���� ��1    �� 1���� ��2
		if(strings[0].equals(strings[1])) {
			return 0;
		}
		if(oldValue.equalsIgnoreCase(strings[0])) {
			return 1;
		}
		if(!oldValue.equalsIgnoreCase(strings[0])) {
			return -1;
		}
		if(oldValue.equalsIgnoreCase(strings[1])) {
			return -1;
		}
		if(!oldValue.equalsIgnoreCase(strings[1])) {
			return 1;
		}
		return 0;
	}

	private void processKernel(String[] kernel, int leftPosition
			, int rightPosition, int scale, int point) {
		int rightPositionReflection= rightPosition;
		if(point> scale) {
			return;
		}
		processQS4DLYG9D(kernel, leftPosition, rightPosition, scale, point, 0);
		int i;
		for(i= leftPosition; i<= rightPosition; i++) {
			if(!(kernel[i].length()<= point|| kernel[leftPosition].length()<= point)) {
				if(kernel[i].charAt(point)!= kernel[leftPosition].charAt(point)){
					rightPositionReflection= i- 1;
					processKernel(kernel, leftPosition, rightPositionReflection, scale, point+ 1);
					leftPosition= i;
				}
			}
		}
		if(leftPosition!= rightPosition) {
			processKernel(kernel, leftPosition, i- 1, scale, point+ 1);
		}
	}

	private void processSort(String[] kernel, int leftPosition
			, int rightPosition, int scale, int point) {
		if(point> scale) {
			return;
		}
		for(int i= leftPosition; i<= rightPosition; i++) {
			Here:
				for(int j= i; j<= rightPosition; j++) {
					if(i== j) {
						continue Here;
					}
					if(kernel[i].length()<= point|| kernel[j].length()<= point) {
						if(kernel[i].length()< kernel[j].length()) {
							for(int p= 0; p< scale; p++) {
								if(!(kernel[i].length()<= p|| kernel[j].length()<= p)) {
									if(kernel[i].charAt(p)!= kernel[j].charAt(p)) {
										continue Here;
									}
								}
							}
							String temp= kernel[i].toString();;
							kernel[i]= kernel[j].toString();;
							kernel[j]= temp;
						}
						continue Here;
					}else {
						boolean hasXi= pinyin.containsKey(""+ kernel[i].charAt(point));
						boolean hasXj= pinyin.containsKey(""+ kernel[j].charAt(point));
						boolean hasBi= bihua.containsKey(""+ kernel[i].charAt(point));
						boolean hasBj= bihua.containsKey(""+ kernel[j].charAt(point));
						if(!(!hasXi|| !hasXj)){//����ƴ��
							String[] js= new String[2];
							js[0]= this.pinyin.get(""+ kernel[i].charAt(point));
							js[1]= this.pinyin.get(""+ kernel[j].charAt(point));
							if(js[0].equalsIgnoreCase(js[1])) {
								if(!(!hasBi|| !hasBj)){//���бʻ�
									if(this.bihua.get(""+ kernel[i].charAt(point))
											> this.bihua.get(""+ kernel[j].charAt(point))) {
										String temp= kernel[i].toString();
										kernel[i]= kernel[j].toString();
										kernel[j]= temp;
										continue Here;
									}else if(this.bihua.get(""+ kernel[i].charAt(point))
											== this.bihua.get(""+ kernel[j].charAt(point))) {
										int asci=kernel[i].charAt(point);
										int ascj=kernel[j].charAt(point);
										if(asci< ascj) {//����ǰ��select��sort�������淶,äĿ�ĳɴ��ڻ����.
											String temp= kernel[i].toString();
											kernel[i]= kernel[j].toString();
											kernel[j]= temp;
											continue Here;
										}
									}
								}
							}
							boolean change= processSortpinyin(js, 3);	
							if(!(!change|| i>= j)) {
								String temp= kernel[i].toString();
								kernel[i]= kernel[j].toString();
								kernel[j]= temp;
							}
							continue Here;
						}else if(!(hasXi|| !hasXj)){//����һ����ƴ��
							if(i< j) {
								if(!(i== rightPosition+1 || j== rightPosition+1)) {
									String temp= kernel[i].toString();
									kernel[i]= kernel[j].toString();
									kernel[j]= temp;
								}
							}
							continue Here;
						}else if(!(!hasXi|| hasXj)){
							if(i> j) {
								if(!(i== rightPosition+1 || j== rightPosition+1)) {
									String temp= kernel[i].toString();
									kernel[i]= kernel[j].toString();
									kernel[j]= temp;
								}
							}
							continue Here;
						}else if(!(hasXi|| hasXj)){//��û��ƴ��
							if(kernel[i].toLowerCase().charAt(point)
									> kernel[j].toLowerCase().charAt(point)) {
								if(i< j) {
									String temp= kernel[i].toString();
									kernel[i]= kernel[j].toString();
									kernel[j]= temp;
								}
								continue Here;
							}
							if(kernel[i].toLowerCase().charAt(point)
									== kernel[j].toLowerCase().charAt(point)) {
								if(kernel[i].charAt(point)> kernel[j].charAt(point)) {
									if(i< j) {
										String temp= kernel[i].toString();
										kernel[i]= kernel[j].toString();
										kernel[j]= temp;
									}
								}
								continue Here;
							}
						}
					}
				}
		}
	}

	private void processQS4DLYG9D(String[] kernel, int leftPosition
			, int rightPosition, int scale, int point, int deep) {
		if(leftPosition< rightPosition){
			int c= rightPosition- leftPosition+ 1;
			if(!(c< this.range|| deep> this.deeps)) {//������deep
				int pos= partition(kernel, leftPosition, rightPosition, scale, point);
				if(leftPosition< pos- 1) {
					processQS4DLYG9D(kernel, leftPosition, pos- 1, scale, point, deep+ 1);
				}
				if(pos+ 1< rightPosition) {
					processQS4DLYG9D(kernel, pos+ 1, rightPosition, scale, point, deep+ 1);
				}
				return;
			}
			processSort(kernel, leftPosition, rightPosition, scale, point);
			return;
		}
	}

	private boolean findSmall(String[] kernel, int scale, int point
			, int i, int j, int rightPosition) {
		if(kernel[i].length()<= point|| kernel[j].length()<= point) {
			if(kernel[i].length()< kernel[j].length()) {
				for(int p= 0; p< scale; p++) {
					if(!(kernel[i].length()<= p|| kernel[j].length()<= p)) {
						if(kernel[i].charAt(p)!= kernel[j].charAt(p)) {
							return false;
						}
					}
				}
				return true;
			}
			return false;
		}else {
			boolean hasXi= pinyin.containsKey(""+ kernel[i].charAt(point));
			boolean hasXj= pinyin.containsKey(""+ kernel[j].charAt(point));
			if(!(!hasXi|| !hasXj)){
				String[] js= new String[2];
				js[0]= this.pinyin.get(""+ kernel[i].charAt(point));
				js[1]= this.pinyin.get(""+ kernel[j].charAt(point));
				boolean change= processSortpinyin(js, 3);	
				if(!(!change|| i>= j)) {
					return true;
				}
				return false;
			}else if(!(hasXi|| hasXj)){
				if(kernel[i].toLowerCase().charAt(point)
						> kernel[j].toLowerCase().charAt(point)) {
					if(i< j) {
						return true;
					}
					return false;
				}else if(kernel[i].toLowerCase().charAt(point)
						== kernel[j].toLowerCase().charAt(point)) {
					if(kernel[i].charAt(point)> kernel[j].charAt(point)) {
						if(i< j) {
							return true;
						}
						return false;
					}
					return false;
				}
				return false;
			}else if(!(hasXi|| !hasXj)){
				if(i< j) {
					if(!(i== rightPosition || j== rightPosition)) {
						return true;
					}
					return false;
				}
				return false;
			}
		}
		return false;
	}

	private boolean findSmallWithTwoChar(String x1, String x2
			, int scale, int point) {
		if(x1.length()<= point|| x2.length()<= point) {
			if(x1.length()< x2.length()) {
				for(int p= 0; p< scale; p++) {
					if(!(x1.length()<= p|| x2.length()<= p)) {
						if(x1.charAt(p)!= x2.charAt(p)) {
							return false;
						}
					}
				}
				return true;
			}
			return false;
		}else { 
			boolean hasX1= pinyin.containsKey(""+ x1.charAt(point));
			boolean hasX2= pinyin.containsKey(""+ x2.charAt(point));
			if(!(!hasX1|| !hasX2)){
				String[] js= new String[2];
				js[0]= this.pinyin.get(""+ x1.charAt(point));
				js[1]= this.pinyin.get(""+ x2.charAt(point));
				boolean changepinyin= processSortpinyin(js, 3);
				if(changepinyin) {
					return true;
				}
				return false;
			}else if(!(hasX1|| hasX2)){
				if(x1.toLowerCase().charAt(point)> x2.toLowerCase().charAt(point)) {
					return true;
				}else if(x1.toLowerCase().charAt(point)== x2.toLowerCase().charAt(point)) {
					if(x1.charAt(point)> x2.charAt(point)) {
						return true;
					}
					return false;
				}
				return false;
			}else if(!(hasX1|| !hasX2)){
				return true;
			}
		}
		return false;
	}

	private int partition(String[] array, int leftPosition, int rightPosition, int scale, int point) {
		String x= findSmall(array, scale, point, leftPosition, rightPosition, rightPosition)
				? array[rightPosition]: array[leftPosition];
				int leftPositionReflection= leftPosition;
				while(leftPositionReflection++ < rightPosition) {
					while(!(findSmallWithTwoChar(array[leftPositionReflection++]
							, x, scale, point)|| leftPositionReflection> rightPosition)) {} 
					while(findSmallWithTwoChar(array[rightPosition--], x, scale, point)){}
					if(--leftPositionReflection< ++rightPosition){
						String temp= array[rightPosition].toString();;
						array[rightPosition]= array[leftPositionReflection].toString();;
						array[leftPositionReflection]= temp;
					}
				}
				array[leftPosition]= array[rightPosition].toString();
				array[rightPosition]= x;
				return rightPosition;
	}

	private boolean processSortpinyin(String[] kernel, int scale) {
		for(int k= 0; k< scale; k++) {
			if(kernel[0].length()<= k|| kernel[1].length()<= k) {
				if(kernel[0].length()< kernel[1].length()) {
					return true;
				}
				return false;
			}
			if(kernel[0].toLowerCase().charAt(k)
					> kernel[1].toLowerCase().charAt(k)) {
				return true;
			}
			if(kernel[0].toLowerCase().charAt(k)
					< kernel[1].toLowerCase().charAt(k)) {
				return false;
			}
		}
		if(kernel[0].length()< kernel[1].length()) {
			return true;
		}
		return false;
	}

	public boolean findSmallWithTwoCharWithpinyin(Map<String, String> pinyinMap, String x1, String x2
			, int scale, int point){
		if(x1.length()<= point|| x2.length()<= point) {
			if(x1.length()< x2.length()) {
				for(int p= 0; p< scale; p++) {
					if(!(x1.length()<= p|| x2.length()<= p)) {
						if(x1.charAt(p)!= x2.charAt(p)) {
							return false;
						}
					}
				}
				return true;
			}
			return false;
		}else { 
			boolean hasX1= pinyinMap.containsKey(""+ x1.charAt(point));
			boolean hasX2= pinyinMap.containsKey(""+ x2.charAt(point));
			if(!(!hasX1|| !hasX2)){
				String[] js= new String[2];
				js[0]= pinyinMap.get(""+ x1.charAt(point));
				js[1]= pinyinMap.get(""+ x2.charAt(point));
				boolean change= processSortpinyin(js, 3);
				if(change) {
					return true;
				}
				return false;
			}else if(!(hasX1|| hasX2)){
				if(x1.toLowerCase().charAt(point)> x2.toLowerCase().charAt(point)) {
					return true;
				}else if(x1.toLowerCase().charAt(point)== x2.toLowerCase().charAt(point)) {
					if(x1.charAt(point)> x2.charAt(point)) {
						return true;
					}
					return false;
				}
				return false;
			}else if(!(hasX1|| !hasX2)){
				return true;
			}
		}
		return false;
	}

	public static void main(String []v) {
		new LYG10DWithChineseMixStringSort13D().test();
	}
	
	public void test() {
		try {
			InputStream inputStreamp= new VerbalSource().getClass().getResourceAsStream(PathLinkFile.PinYinCN_lyg);
    		BufferedReader cReaderp= new BufferedReader(new InputStreamReader(inputStreamp, "GBK"));
    		//index
    		String cInputStringp;
    		Map<String, String> map= new HashMap<>();
    		bihua= new HashMap<>();
    		while ((cInputStringp= cReaderp.readLine())!= null) {
    			String[] words= cInputStringp.split("->");
    			if(words.length>1) {
    				map.put(words[0], words[1]);
    			}
    		}
    		InputStream inputStreamb= new VerbalSource().getClass().getResourceAsStream(PathLinkFile.BiHuaCN_lyg);
    		BufferedReader cReaderb= new BufferedReader(new InputStreamReader(inputStreamb, "GBK"));
    		//index
    		String cInputStringb;
    		while ((cInputStringb= cReaderb.readLine())!= null) {
    			String[] words= cInputStringb.split("->");
    			if(words.length>1) {
    				bihua.put(words[0], Integer.valueOf(words[1]));
    			}
    		}
    		Map<String, String> pinyin= map;
    		
			String[] strings1D= new String[16];
//			strings1D[0]= "dh��31����";
//			strings1D[1]= "dh��11����";
//			strings1D[2]= "dh��2����";
//			strings1D[3]= "dh��4����";
//			strings1D[2]= "dh��2Ң��";
//			strings1D[3]= "dh��4����";
//			strings1D[4]= "dh��6��d��";
//			strings1D[5]= "dh����0.6��";
			strings1D[10]= "dh����0.3f��";
			strings1D[11]= "dh����0.61e7��";
			strings1D[12]= "dh����0.3e61��";
//			strings1D[6]= "dh����0.3e6��";
//			strings1D[7]= "dh����0.6e2��";
			strings1D[8]= "dh����0.3e1��";
			strings1D[9]= "dh����111.21��";
			strings1D[13]= "dh����15.21��";
			strings1D[14]= "dh����g��";
			strings1D[15]= "dhv��1.09����";
			strings1D[0]= "������";
			strings1D[1]= "������";
			strings1D[2]= "������";
			strings1D[3]= "������";
			strings1D[4]= "������";
			strings1D[5]= "������";
			strings1D[6]= "������";
			strings1D[7]= "������";
			
			LYG10DWithChineseMixStringSort13D lYG10DWithChineseMixStringSort10D= new LYG10DWithChineseMixStringSort13D();
			lYG10DWithChineseMixStringSort10D.quick4DChineseStringArray1D(strings1D, 30, pinyin, 7, 70, bihua);
			for(String string:strings1D) {
				System.out.println(string);
			}
//			String[][] strings2D= new String[14][3];
//			strings2D[0][1]= "dh��1����";
//			strings2D[1][1]= "dh��5��d��";
//			strings2D[2][1]= "dh��31����";
//			strings2D[3][1]= "dh��11����";
//			strings2D[4][1]= "dh��5��g��";
//			strings2D[5][1]= "dhv������";
//			strings2D[6][1]= "dh������";
//			strings2D[7][1]= "";
//			//strings2D[8][1]="";
//			strings2D[9][1]= "dh������";
//			strings2D[10][1]= "dh����m��";
//			strings2D[11][1]= "dh������";
//			strings2D[12][1]= "dh��b����";
//			strings2D[13][1]= "dh������";
			//lYG10DWithChineseMixStringSort10D.quick4DChineseStringArray2D(strings2D, 30, map, 7, 70, 1, this.bihua);
			//for(String[] string:strings2D) {
			//	System.out.println(string[1]);
			//}
			cReaderb.close();
			cReaderp.close();
		}catch(Exception e) {
e.printStackTrace();
		}
	}

	public void quick4DChineseStringArray2D(String[][] strings2d, int scale, Map<String, String> map
			, int range, int deeps, int culumn, Map<String, Integer> bihua) {
		this.pinyin= map;
		this.range= range;
		this.deeps= deeps;
		this.bihua= bihua;
		processKernel2D(strings2d, 0, strings2d.length- 1, scale, 0, culumn);
	}

	private void processKernel2D(String[][] kernel, int leftPosition
			, int rightPosition, int scale, int point, int culumn) {
		int rightPositionReflection= rightPosition;
		if(point> scale) {
			return;
		}
		processQS4DLYG9D2D(kernel, leftPosition, rightPosition, scale, point, 0, culumn);
		int i;
		for(i= leftPosition; i<= rightPosition; i++) {
			if(!(kernel[i][culumn].length()<= point
					|| kernel[leftPosition][culumn].length()<= point)) {
				if(kernel[i][culumn].charAt(point)
						!= kernel[leftPosition][culumn].charAt(point)){
					rightPositionReflection= i- 1;
					processKernel2D(kernel, leftPosition, rightPositionReflection, scale, point+ 1, culumn);
					leftPosition= i;
				}
			}
		}
		if(leftPosition!= rightPosition) {
			processKernel2D(kernel, leftPosition, i- 1, scale, point+ 1, culumn);
		}
	}

	private void processQS4DLYG9D2D(String[][] kernel, int leftPosition
			, int rightPosition, int scale, int point, int deep, int culumn) {
		if(leftPosition< rightPosition){
			int c= rightPosition- leftPosition+ 1;
			if(!(c< this.range|| deep> this.deeps)) {//������deep
				int pos= partition2D(kernel, leftPosition, rightPosition, scale, point, culumn);
				if(leftPosition< pos- 1) {
					processQS4DLYG9D2D(kernel, leftPosition, pos- 1, scale, point, deep+ 1, culumn);
				}
				if(pos+ 1< rightPosition) {
					processQS4DLYG9D2D(kernel, pos+ 1, rightPosition, scale, point, deep+ 1, culumn);
				}
				return;
			}
			processSort2D(kernel, leftPosition, rightPosition, scale, point, culumn);
			return;
		}
	}

	private int partition2D(String[][] array, int leftPosition, int rightPosition
			, int scale, int point, int culumn) {
		String[] x= findSmall2D(array, scale, point, leftPosition, rightPosition, rightPosition, culumn)
				? array[rightPosition]: array[leftPosition];
				int leftPositionReflection= leftPosition;
				while(leftPositionReflection++ < rightPosition) {
					while(!(findSmallWithTwoChar(array[leftPositionReflection++][culumn]
							, x[culumn], scale, point)|| leftPositionReflection> rightPosition)) {} 
					while(findSmallWithTwoChar(array[rightPosition--][culumn]
							, x[culumn], scale, point)){}
					if(--leftPositionReflection< ++rightPosition){
						String[] temp= array[rightPosition].clone();;
						array[rightPosition]= array[leftPositionReflection].clone();;
						array[leftPositionReflection]= temp.clone();
					}
				}
				array[leftPosition]= array[rightPosition].clone();
				array[rightPosition]= x.clone();
				return rightPosition;
	}

	private boolean findSmall2D(String[][] kernel, int scale, int point
			, int i, int j, int rightPosition, int culumn) {
		if(kernel[i][culumn].length()<= point
				|| kernel[j][culumn].length()<= point) {
			if(kernel[i][culumn].length()< kernel[j][culumn].length()) {
				for(int p= 0; p< scale; p++) {
					if(!(kernel[i][culumn].length()<= p|| kernel[j][culumn].length()<= p)) {
						if(kernel[i][culumn].charAt(p)!= kernel[j][culumn].charAt(p)) {
							return false;
						}
					}
				}
				return true;
			}
			return false;
		}else {
			boolean hasXi= pinyin.containsKey(""+ kernel[i][culumn].charAt(point));
			boolean hasXj= pinyin.containsKey(""+ kernel[j][culumn].charAt(point));
			if(!(!hasXi|| !hasXj)){
				String[] js= new String[2];
				js[0]= this.pinyin.get(""+ kernel[i][culumn].charAt(point));
				js[1]= this.pinyin.get(""+ kernel[j][culumn].charAt(point));
				boolean change= processSortpinyin(js, 3);
				if(!(!change|| i>= j)) {
					return true;
				}
				return false;
			}else if(!(hasXi|| hasXj)){
				if(kernel[i][culumn].toLowerCase().charAt(point)
						> kernel[j][culumn].toLowerCase().charAt(point)) {
					if(i< j) {
						return true;
					}
					return false;
				}else if(kernel[i][culumn].toLowerCase().charAt(point)
						== kernel[j][culumn].toLowerCase().charAt(point)) {
					if(kernel[i][culumn].charAt(point)
							> kernel[j][culumn].charAt(point)) {
						if(i< j) {
							return true;
						}
						return false;
					}
					return false;
				}
				return false;
			}else if(!(hasXi|| !hasXj)){
				if(i< j) {
					if(!(i== rightPosition || j== rightPosition)) {
						return true;
					}
					return false;
				}
				return false;
			}
		}
		return false;
	}

	private void processSort2D(String[][] kernel, int leftPosition
			, int rightPosition, int scale, int point, int culumn) {
		if(point> scale) {
			return;
		}
		for(int i= leftPosition; i<= rightPosition; i++) {
			Here:
				for(int j= i; j<= rightPosition; j++) {
					if(i== j) {
						continue Here;
					}
					if(kernel[i][culumn].length()<= point
							|| kernel[j][culumn].length()<= point) {
						if(kernel[i][culumn].length()< kernel[j][culumn].length()) {
							for(int p= 0; p< scale; p++) {
								if(!(kernel[i][culumn].length()<= p
										|| kernel[j][culumn].length()<= p)) {
									if(kernel[i][culumn].charAt(p)
											!= kernel[j][culumn].charAt(p)) {
										continue Here;
									}
								}
							}
							String[] temp= kernel[i].clone();;
							kernel[i]= kernel[j].clone();;
							kernel[j]= temp.clone();
						}
						continue Here;
					}else {
						boolean hasXi= pinyin.containsKey(""+ kernel[i][culumn].charAt(point));
						boolean hasXj= pinyin.containsKey(""+ kernel[j][culumn].charAt(point));
						if(!(!hasXi|| !hasXj)){
							String[] js= new String[2];
							js[0]= this.pinyin.get(""+ kernel[i][culumn].charAt(point));
							js[1]= this.pinyin.get(""+ kernel[j][culumn].charAt(point));
							boolean change= processSortpinyin(js, 3);
							if(!(!change|| i>= j)) {
								String[] temp= kernel[i].clone();
								kernel[i]= kernel[j].clone();
								kernel[j]= temp.clone();
							}
							continue Here;
						}else if(!(hasXi|| !hasXj)){
							if(i< j) {
								if(!(i== rightPosition+1 || j== rightPosition+1)) {
									String[] temp= kernel[i].clone();
									kernel[i]= kernel[j].clone();
									kernel[j]= temp.clone();
								}
							}
							continue Here;
						}else if(!(hasXi|| hasXj)){
							if(kernel[i][culumn].toLowerCase().charAt(point)
									> kernel[j][culumn].toLowerCase().charAt(point)) {
								if(i< j) {
									String[] temp= kernel[i].clone();
									kernel[i]= kernel[j].clone();
									kernel[j]= temp.clone();
								}
								continue Here;
							}
							if(kernel[i][culumn].toLowerCase().charAt(point)
									== kernel[j][culumn].toLowerCase().charAt(point)) {
								if(kernel[i][culumn].charAt(point)> kernel[j][culumn].charAt(point)) {
									if(i< j) {
										String[] temp= kernel[i].clone();
										kernel[i]= kernel[j].clone();
										kernel[j]= temp.clone();
									}
								}
							}
						}
					}
				}
		}
	}
}