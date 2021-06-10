package ESU.string;
public class StringSequency{
	public static String stringToSequency(String string){
		char[] chars= string.toCharArray();
		for(int i= 0; i< chars.length; i++) {
			for(int j= 0; j< chars.length; j++) {
				if(chars[i]< chars[j]) {
					char temp= chars[i];
					chars[i]= chars[j];
					chars[j]= temp;
				}
			}
		}	
		return String.valueOf(chars);	
	}

	public static String[] stringArrayToSequencyArrayIncrement(String[] string
			, int scale){
		//�Ƚ�ͷ
		for(int i= 0; i< string.length; i++) {
			for(int j= 0; j< string.length; j++) {
				//������ĸ
				if(string[i].toLowerCase().charAt(0)
						< string[j].toLowerCase().charAt(0)) {
					//�����Сд
					String temp= string[i].toString();
					string[i]= string[j].toString();
					string[j]= temp.toString();	
				}
			}
		}	
		//�Ƚ���
		for(int k= 1; k< scale; k++) {
			for(int i= 0; i< string.length; i++) {
				for(int j= 0; j< string.length; j++) {
					if(string[i].length()> k&& string[j].length()> k) {
						if(string[i].toLowerCase().charAt(k)
								< string[j].toLowerCase().charAt(k)) {
							boolean find= true;
							for(int p= 0; p< k; p++) {
								if(string[i].charAt(p)!= string[j].charAt(p)) {
									find= false;
								}
							}
							if(find) {
								String temp= string[i].toString();
								string[i]= string[j].toString();
								string[j]= temp.toString();
							}
						}	
					}
				}
			}		
		}
		return string;
	}

	public static String[] stringArrayToSequencyArrayDecrement(String[] string
			, int scale){
		//�Ƚ�ͷ
		for(int i= 0; i< string.length; i++) {
			for(int j= 0; j< string.length; j++) {
				//������ĸ
				if(string[i].toLowerCase().charAt(0)
						< string[j].toLowerCase().charAt(0)) {
					//�����Сд
					String temp= string[i].toString();
					string[i]= string[j].toString();
					string[j]= temp.toString();	
				}else if(string[i].toLowerCase().charAt(0)
						== string[j].toLowerCase().charAt(0)) {
					//�����Сд
					if(string[i].charAt(0)<string[j].charAt(0)) {
						String temp= string[i].toString();
						string[i]= string[j].toString();
						string[j]= temp.toString();	
					}
				}
			}
		}	
		//�Ƚ���
		for(int k= 1; k< scale; k++) {
			for(int i= 0; i< string.length; i++) {
				for(int j= 0; j< string.length; j++) {
					if(string[i].length()> k&& string[j].length()> k) {
						if(string[i].toLowerCase().charAt(k)
								< string[j].toLowerCase().charAt(k)) {
							boolean find= true;
							for(int p= 0; p< k; p++) {
								if(string[i].charAt(p)!= string[j].charAt(p)) {
									find= false;
								}
							}
							if(find) {
								String temp= string[i].toString();
								string[i]= string[j].toString();
								string[j]= temp.toString();
							}
						}else if(string[i].toLowerCase().charAt(k)
								== string[j].toLowerCase().charAt(k)) {
							//�����Сд
							if(string[i].charAt(k)<string[j].charAt(k)) {
								boolean find= true;
								for(int p= 0; p< k; p++) {
									if(string[i].charAt(p)!= string[j].charAt(p)) {
										find= false;
									}
								}
								if(find) {
									String temp= string[i].toString();
									string[i]= string[j].toString();
									string[j]= temp.toString();
								}
							}
						}	
					}
				}
			}		
		}
		return string;
	}

	//			//DEMO
	public static void main(String[] argv) {
		//1
		String testValue[]= new String[2500];
		testValue[0]= "ca��cded";
		testValue[1]= "ba��cded";
		testValue[2]= "��Bcedd";
		testValue[3]= "Ca��cded";
		testValue[4]= "��Ab";
		testValue[5]= "bCaef";
		testValue[6]= "BCAe";
		for(int i=7;i<2500;i++) {
			testValue[i]=""+ Math.random();
		}
		
//		new QuickLuoyaoguang4D().quick4DStringArray(testValue, 0
//				,testValue.length-1,16);
		//testValue= stringToSequencyArrayIncrement(testValue, 0);	
	//	testValue= stringArrayToSequencyArrayDecrement(testValue, 16);
		System.out.println(testValue[0]);
		System.out.println(testValue[1]);
		System.out.println(testValue[2]);
		System.out.println(testValue[3]);	
		System.out.println(testValue[4]);
		System.out.println(testValue[5]);
		System.out.println(testValue[6]);
		testValue= new String[2500];
		testValue[0]= "ca��cded";
		testValue[1]= "ba��cded";
		testValue[2]= "��Bcedd";
		testValue[3]= "Ca��cded";
		testValue[4]= "��Ab";
		testValue[5]= "bCaef";
		testValue[6]= "BCAe";
		for(int i=7;i<2500;i++) {
			testValue[i]=""+ Math.random();
		}
		new QuickLuoyaoguang4D().quick4DStringArray(testValue, 0
				,testValue.length-1,16);
//		testValue= stringArrayToSequencyArrayDecrement(testValue, 16);
		System.out.println(testValue[0]);
		System.out.println(testValue[1]);
		System.out.println(testValue[2]);
		System.out.println(testValue[3]);	
		System.out.println(testValue[4]);
		System.out.println(testValue[5]);
		System.out.println(testValue[6]);
		//2			
		////				String value= "AabusahudBDHDbuHgfUiGgfj";
		////				System.out.println(stringToSequency(value));
	}
}