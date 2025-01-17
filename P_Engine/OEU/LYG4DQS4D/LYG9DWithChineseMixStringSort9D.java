package OEU.LYG4DQS4D;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
//20200314 集成了最新的小高峰过滤催化排序5代思想。
//20200818 集成了最新的小高峰过滤催化排序9代思想。
//罗瑶光
import java.util.Map;

import ME.APM.VSQ.App;
import ME.S.stables.PathLinkFile;
public class LYG9DWithChineseMixStringSort9D{
	Map<String, Boolean> find= new HashMap<>();
	Map<String, String> pinyin;
	int range;
	int deeps;
	public void quick4DChineseStringArray(String[] strings, int leftPosition
			, int rightPosition, int scale, Map<String, String> map, int range, int deeps) {
		this.pinyin= map;
		this.range= range;
		this.deeps= deeps;
		processKernel(strings, leftPosition, rightPosition, scale, 0);
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
						if(!(!hasXi|| !hasXj)){
							String[] js= new String[2];
							js[0]= this.pinyin.get(""+ kernel[i].charAt(point));
							js[1]= this.pinyin.get(""+ kernel[j].charAt(point));
							boolean change= processSortPinYin(js, 3);
							if(!(!change|| i>= j)) {
								String temp= kernel[i].toString();;
								kernel[i]= kernel[j].toString();;
								kernel[j]= temp;
							}
							continue Here;
						}else if(!(hasXi|| !hasXj)){
							if(i< j) {
								if(!(i== rightPosition+1 || j== rightPosition+1)) {
									String temp= kernel[i].toString();
									kernel[i]= kernel[j].toString();
									kernel[j]= temp;
								}
							}
							continue Here;
						}else if(!(hasXi|| hasXj)){
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
							}
						}
					}
				}
		}
	}

//	private void processQS4DLYG5D(String[] kernel, int leftPosition
//			, int rightPosition, int scale, int point, int deep) {
//		if(leftPosition< rightPosition){
//			int c= rightPosition- leftPosition; 
//			if(!(c > this.range|| deep> this.deeps)) {//增加了deep
//				processSort(kernel, leftPosition, rightPosition, scale, point);
//				return;
//			}
//			int pos= partition(kernel, leftPosition, rightPosition, scale, point);
//			processQS4DLYG5D(kernel, leftPosition, pos- 1, scale, point, deep+ 1);
//			processQS4DLYG5D(kernel, pos+ 1, rightPosition, scale, point, deep+ 1);
//		}
//	}

	private void processQS4DLYG9D(String[] kernel, int leftPosition
			, int rightPosition, int scale, int point, int deep) {
		if(leftPosition< rightPosition){
			int c= rightPosition- leftPosition+ 1;
			if(!(c< this.range|| deep> this.deeps)) {//增加了deep
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
				boolean change= processSortPinYin(js, 3);
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
				boolean change= processSortPinYin(js, 3);
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

	private boolean processSortPinYin(String[] kernel, int scale) {
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
	
	public boolean findSmallWithTwoCharWithPinYin(Map<String, String> pinyinMap, String x1, String x2
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
				boolean change= processSortPinYin(js, 3);
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
		try {
    	  	InputStream inputStreamc= new App().getClass().getResourceAsStream(PathLinkFile.poscc_lyg);
    		BufferedReader cReaderc= new BufferedReader(new InputStreamReader(inputStreamc, "UTF8"));	
    		InputStream inputStreamp= new App().getClass().getResourceAsStream(PathLinkFile.poscp_lyg);
    		BufferedReader cReaderp= new BufferedReader(new InputStreamReader(inputStreamp, "UTF8"));
    		//index
    		String cInputStringc;
    		String cInputStringp;
    		Map<String,String> map= new HashMap<>();
    		while ((cInputStringp= cReaderp.readLine())!= null) {
    			cInputStringc= cReaderc.readLine();	
    			String[] words= cInputStringp.split("/")[0].split(" ");
    			for(int i=0; i<words.length; i++) {
    				if(!map.containsKey(""+ cInputStringc.charAt(i))) {
    					if(!cInputStringc.contains("字母")&&!cInputStringc.contains("标点")
    							&&!cInputStringc.contains("数字")&&!cInputStringc.contains("数词")) {
    						map.put(""+ cInputStringc.charAt(i), words[i]);
    					}
    				}
    			}
    		}
    		//this.pinYin= map;
    		String[] strings= new String[3];
    		strings[1]="dh罗瑶光";
    		strings[2]="dh罗瑶林";
    		strings[0]="dh罗韵律";
    		
    		LYG9DWithChineseMixStringSort9D lYG9DWithChineseMixStringSort9D= new LYG9DWithChineseMixStringSort9D();
    		lYG9DWithChineseMixStringSort9D.quick4DChineseStringArray(strings, 0, strings.length-1, 100, map, 7, 70);
    		for(String string:strings) {
    			System.out.println(string);
    		}
    		cReaderc.close();
			cReaderp.close();
    	}catch(Exception e) {
    		
    	}
	}
}