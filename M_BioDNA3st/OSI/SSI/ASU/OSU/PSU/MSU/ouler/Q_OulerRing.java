package OSI.SSI.ASU.OSU.PSU.MSU.ouler;

import java.util.HashMap;
import java.util.Map;

public class Q_OulerRing{
	//��κ������ڹ۲�Ԫ��ӳ���ŷ����·ģ��
	//˼�� ������
	//�㷨 ŷ��
	//����Ա ������
	//QUIVT+OSMAX-HEPCD 9 ������ �кܶ࣬��������ѡһ�֣�������� �ο���48�С�

//���������е���������ûʱ����������档
//	HEPCD3
//	2
//	1
//	UIVT+OSMAX-11
//	10
//	9
//	8
//	Q8
//	7
//	6
//	5
//	4
//	3
//	2
//	1
//	0
//
//	AMSO+HEPCD8
//	7
//	6
//	UIVT9
//	8
//	7
//	Q7
//	6
//	5
//	-X6
//	5
//	4
//	3
//	2
//	1
//	0
//
//��������������������������������������������--������������	OSMAX-HEPCD9
//	8
//	7
//	UIVT+11
//	10
//	9
//	8
//	Q8
//	7
//	6
//	5
//	4
//	3
//	2
//	1
//	0
//
//	PEHCD3
//	2
//	+OSMAX-8
//	7
//	6
//	5
//	QUIVT9
//	8
//	7
//	6
//	5
//	4
//	3
//	2
//	1
//	0
//
//	MAX-HEPCD7
//	6
//	5
//	UIVT+OSQ12
//	11
//	10
//	9
//	8
//	7
//	6
//	5
//	4
//	3
//	2
//	1
//	0
//
//	VIUEHCP5
//	D5
//	4
//	+OSMAX-10
//	9
//	8
//	7
//	Q7
//	6
//	5
//	T5
//	4
//	3
//	2
//	1
//	0
//
//	EHCP2
//	D2
//	1
//	+OSMAX-7
//	6
//	5
//	4
//	QUIVT8
//	7
//	6
//	5
//	4
//	3
//	2
//	1
//	0
//
//	CHEP2
//	UIVT+OSMAX-12
//	11
//	10
//	9
//	Q9
//	8
//	7
//	6
//	5
//	4
//	3
//	2
//	1
//	0
//	D0
//
//	SO+HEPCD6
//	5
//	4
//	UIVT7
//	6
//	5
//	Q5
//	4
//	3
//	-MAX6
//	5
//	4
//	3
//	2
//	1
//	0
//
//	IVTEHCP5
//	D5
//	4
//	+OSMAX-10
//	9
//	8
//	7
//	QU8
//	7
//	6
//	5
//	4
//	3
//	2
//	1
//	0
//
//	DCHEP3
//	UIVT+OSMAX-13
//	12
//	11
//	10
//	Q10
//	9
//	8
//	7
//	6
//	5
//	4
//	3
//	2
//	1
//	0
//
//	UEHCP3
//	D3
//	2
//	+OSMAX-8
//	7
//	6
//	5
//	Q5
//	4
//	3
//	TVI5
//	4
//	3
//	2
//	1
//	0
//
//	QSO+HEPCD7
//	6
//	5
//	UIVT8
//	7
//	6
//	5
//	4
//	-MAX7
//	6
//	5
//	4
//	3
//	2
//	1
//	0
//
//	TVIUEHCP6
//	D6
//	5
//	+OSMAX-11
//	10
//	9
//	8
//	Q8
//	7
//	6
//	5
//	4
//	3
//	2
//	1
//	0
//
//	XAMSO+HEPCD9
//	8
//	7
//	UIVT10
//	9
//	8
//	Q8
//	7
//	6
//	-6
//	5
//	4
//	3
//	2
//	1
//	0
//
//	+HEPCD4
//	3
//	2
//	UIVT5
//	4
//	3
//	QSO5
//	MAX-8
//	7
//	6
//	5
//	4
//	3
//	2
//	1
//	0
//
//	-HEPCD4
//	3
//	2
//	UIVT+OSMAX11
//	10
//	9
//	Q9
//	8
//	7
//	6
//	5
//	4
//	3
//	2
//	1
//	0
//
//	0
	
	public static void main(String[] args) {
		//init AOPM VECS IDUQ TXH DD
		//��ʼ��·
		Map<String, Boolean> initonsLink= new HashMap<>();
		//��·̽��
		Map<String, Boolean> didInitonsLink= new HashMap<>();
		initonsLink.put("DC", true);
		initonsLink.put("CD", true);
		initonsLink.put("IV", true);
		initonsLink.put("VI", true);
		initonsLink.put("IU", true);
		initonsLink.put("UI", true);
		initonsLink.put("UE", true);
		initonsLink.put("EU", true);
		initonsLink.put("UQ", true);
		initonsLink.put("QU", true);
		initonsLink.put("QS", true);
		initonsLink.put("SQ", true);
		
		initonsLink.put("VT", true);
		initonsLink.put("TV", true);
		initonsLink.put("ET", true);
		initonsLink.put("TE", true);
		initonsLink.put("EH", true);
		initonsLink.put("HE", true);
		initonsLink.put("EP", true);
		initonsLink.put("PE", true);
		initonsLink.put("H+", true);//HE + HC -
		initonsLink.put("+H", true);
		initonsLink.put("H-", true);
		initonsLink.put("-H", true);
		initonsLink.put("HC", true);
		initonsLink.put("CH", true);
		initonsLink.put("CP", true);
		initonsLink.put("PC", true);
		initonsLink.put("SM", true);
		initonsLink.put("MS", true);
		initonsLink.put("SO", true);
		initonsLink.put("OS", true);	
			
		initonsLink.put("XA", true);	
		initonsLink.put("AX", true);	
		initonsLink.put("MA", true);	
		initonsLink.put("AM", true);	
		initonsLink.put("X-", true);	
		initonsLink.put("-X", true);	
		initonsLink.put("M-", true);	
		initonsLink.put("-M", true);	
		initonsLink.put("T+", true);	
		initonsLink.put("+T", true);	
		initonsLink.put("O+", true);	
		initonsLink.put("+O", true);	
	
		String[] initons= new String[]{"H", "A", "O", "P", "M", "V", "E", "C", "S", "I", "D", "U", "Q", "T", "X", "+", "-"};
		int[] initonsCount= new int[17]; 
		//for loop 
		//��ʼ���� ·������
		//String didInitons= "";
        int count= 0;
		for(int i= 0; i< initons.length; i++) {
			//System.out.println(temp);
			System.out.print(initons[i]);
			initonsCount[i]++;
			recur(initons[i], initonsLink, didInitonsLink, initons, initonsCount, count, i);
			//System.out.println(count);
			//��һ��
			count= 0;
			System.out.println();
			didInitonsLink.clear();
			initonsCount= new int[17]; 
		}
		// print loop initons
		//��ӡ����ģʽ
		System.out.println(count);
	}
	//�ݹ� �����޸ġ��Ȼ�� �����۲⡣
	public static void recur(String firstChar, Map<String, Boolean> initonsLink
			, Map<String, Boolean> didInitonsLink, String[] initons, int[] initonsCount, int count, int i) {
		for(int j= 0; j< initons.length; j++) {
			if(!firstChar.equals(initons[j])) {
				String temp= ""+ firstChar+ initons[j];
				//��·��                                                                                          //û�б���                                                                     //����������
				if(initonsLink.containsKey(temp)&& !didInitonsLink.containsKey(temp)&& initonsCount[j]< 1) {
					initonsCount[j]++;
					didInitonsLink.put(""+ firstChar+ initons[j], true);
					System.out.print(initons[j]);
					recur(initons[j], initonsLink, didInitonsLink, initons, initonsCount, count+ 1, j);	
					System.out.println(count);
				}
			}
		}
	}
}