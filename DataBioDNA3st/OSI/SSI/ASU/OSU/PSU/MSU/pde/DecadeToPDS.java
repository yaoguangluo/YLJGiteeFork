package OSI.SSI.ASU.OSU.PSU.MSU.pde;

import java.util.HashMap;
import java.util.Map;

import OSI.SSI.ASU.OSU.PSU.MSU.pds.PDE_PDS_DL;

//������������ڽ������任��ʮ�߽���Ԫ�����֣�
//������������ڽ�ʮ�߽���Ԫ�����ֽ���Ԫ���任
//������������ڽ�Ԫ���任������չ����˿��չ��
//����������ڽ���չ˿��������ʮ�߽��ƽ���Ԫ���任
//����������ڽ���չ˿��������ʮ�߽��Ʊ任��Ԫ������
//�����������ʮ�߽���Ԫ�����ֽ���ʮ���ƻ�ԭ��
public class DecadeToPDS{
	//˼�룺��չ��ʽ 1.2.2��Ԫ�������߼��� ʮ�߽���Ԫ�������ѧ��������
	//�㷨�����Ƽ��㣬��չ����
	//����Ա�� �����⣬
	public Map<String, String> initonsMap= new HashMap<>();
	public Map<String, String> initonsCode= new HashMap<>();
	public Map<String, String> initonsSet= new HashMap<>();
	public Map<String, Integer> numberSet= new HashMap<>();
	public static void main(String[] Args) {	
		DecadeToPDS decadeToPDS= new DecadeToPDS();
		decadeToPDS.init(decadeToPDS);
		int decade= (int)(Math.random()*1000 % 256);//���дһ����
		double pDE_KEY_rate= 0.25;//���ģ��һ��0-1֮��ĸ���Կ�ף����� 0~0.5Ϊ�ᣬ0.5~1 Ϊ�		
		decadeToPDS.doPDS(decadeToPDS, decade, pDE_KEY_rate);
	}
	
//	//Ԫ�����ű�Ԫ������
//	//System.out.println("����ʮ��������"+ decade);
//	String seventeen= decadeToPDS.decadeToSeventeen(decade, decadeToPDS);
//	//System.out.println("Ԫ��������Ϊ��"+ seventeen);
//	String initons= decadeToPDS.seventeenToIntons(seventeen, decadeToPDS);
//	//System.out.println("�任ΪԪ����"+initons);
//	//initons= "AOPMVE";
//	//System.out.println("����Ԫ����"+ initons);
//	//System.out.println("������ʣ�"+ pDE_KEY_rate);
//	String pDS= decadeToPDS.initonsToPDS(initons, pDE_KEY_rate, decadeToPDS);
//	//System.out.println("�����˿:"+ pDS);
//	pDS= pDS.replace(".", "");
//	String pDSInitons= decadeToPDS.PDSToInitons(pDS, pDE_KEY_rate, decadeToPDS);
//	//System.out.println("��˿��Ԫ:"+ pDSInitons);
//	//�ڶ������չ��ʽ �����õ���
//	//String pDEInitons= decadeToPDS.PDSToPDE(pDSInitons, pDE_KEY_rate, decadeToPDS);
//	//System.out.println("��չ��Ԫ:"+ pDEInitons);
//	String pDSSeventeen= decadeToPDS.initonsToSeventeen(pDSInitons, decadeToPDS);
//	//System.out.println("Ԫ������:"+ pDSSeventeen);
//	String pDSDecade= decadeToPDS.seventeenToDecade(pDSSeventeen, decadeToPDS);
//	//System.out.println("���ʮ������:"+ pDSDecade);
//	return Integer.valueOf(pDSDecade).intValue();
	private int doPDS(DecadeToPDS decadeToPDS, int decade, double pDE_KEY_rate) {
		String seventeen= decadeToPDS.decadeToSeventeen(decade, decadeToPDS);
		String initons= decadeToPDS.seventeenToIntons(seventeen, decadeToPDS);
		String pDS= decadeToPDS.initonsToPDS(initons, pDE_KEY_rate, decadeToPDS);
		pDS= pDS.replace(".", "");
		String pDSInitons= decadeToPDS.PDSToInitons(pDS, pDE_KEY_rate, decadeToPDS);
		String pDSSeventeen= decadeToPDS.initonsToSeventeen(pDSInitons, decadeToPDS);
		int pDSDecade= decadeToPDS.seventeenToDecade(pDSSeventeen, decadeToPDS);
		return pDSDecade;
	}

	public void init(DecadeToPDS decadeToPDS) {
		decadeToPDS.initonsMap.put("A", "7");
		decadeToPDS.initonsMap.put("O", "A");
		decadeToPDS.initonsMap.put("P", "2");
		decadeToPDS.initonsMap.put("M", "8");
		decadeToPDS.initonsMap.put("V", "D");
		decadeToPDS.initonsMap.put("E", "3");
		decadeToPDS.initonsMap.put("C", "1");
		decadeToPDS.initonsMap.put("S", "9");
		decadeToPDS.initonsMap.put("I", "E");
		decadeToPDS.initonsMap.put("D", "0");
		decadeToPDS.initonsMap.put("U", "F");
		decadeToPDS.initonsMap.put("Q", "G");
		decadeToPDS.initonsMap.put("T", "C");
		decadeToPDS.initonsMap.put("X", "6");
		decadeToPDS.initonsMap.put("+", "B");
		decadeToPDS.initonsMap.put("-", "5");
		decadeToPDS.initonsMap.put("H", "4");
		//Ԫ�����ֱ�Ԫ������
		decadeToPDS.initonsCode.put("0", "D");
		decadeToPDS.initonsCode.put("1", "C");
		decadeToPDS.initonsCode.put("2", "P");
		decadeToPDS.initonsCode.put("3", "E");
		decadeToPDS.initonsCode.put("4", "H");
		decadeToPDS.initonsCode.put("5", "-");
		decadeToPDS.initonsCode.put("6", "X");
		decadeToPDS.initonsCode.put("7", "A");
		decadeToPDS.initonsCode.put("8", "M");
		decadeToPDS.initonsCode.put("9", "S");
		decadeToPDS.initonsCode.put("A", "O");
		decadeToPDS.initonsCode.put("B", "+");
		decadeToPDS.initonsCode.put("C", "T");
		decadeToPDS.initonsCode.put("D", "V");
		decadeToPDS.initonsCode.put("E", "I");
		decadeToPDS.initonsCode.put("F", "U");
		decadeToPDS.initonsCode.put("G", "Q");
		//���������ֱ�Ԫ������
		decadeToPDS.initonsSet.put("0", "0");
		decadeToPDS.initonsSet.put("1", "1");
		decadeToPDS.initonsSet.put("2", "2");
		decadeToPDS.initonsSet.put("3", "3");
		decadeToPDS.initonsSet.put("4", "4");
		decadeToPDS.initonsSet.put("5", "5");
		decadeToPDS.initonsSet.put("6", "6");
		decadeToPDS.initonsSet.put("7", "7");
		decadeToPDS.initonsSet.put("8", "8");
		decadeToPDS.initonsSet.put("9", "9");
		decadeToPDS.initonsSet.put("10", "A");
		decadeToPDS.initonsSet.put("11", "B");
		decadeToPDS.initonsSet.put("12", "C");
		decadeToPDS.initonsSet.put("13", "D");
		decadeToPDS.initonsSet.put("14", "E");
		decadeToPDS.initonsSet.put("15", "F");
		decadeToPDS.initonsSet.put("16", "G");

		//Ԫ�����ֱ䰢��������
		decadeToPDS.numberSet.put("0", 0);
		decadeToPDS.numberSet.put("1", 1);
		decadeToPDS.numberSet.put("2", 2);
		decadeToPDS.numberSet.put("3", 3);
		decadeToPDS.numberSet.put("4", 4);
		decadeToPDS.numberSet.put("5", 5);
		decadeToPDS.numberSet.put("6", 6);
		decadeToPDS.numberSet.put("7", 7);
		decadeToPDS.numberSet.put("8", 8);
		decadeToPDS.numberSet.put("9", 9);
		decadeToPDS.numberSet.put("A", 10);
		decadeToPDS.numberSet.put("B", 11);
		decadeToPDS.numberSet.put("C", 12);
		decadeToPDS.numberSet.put("D", 13);
		decadeToPDS.numberSet.put("E", 14);
		decadeToPDS.numberSet.put("F", 15);
		decadeToPDS.numberSet.put("G", 16);
	}

	//	//׼�����ɵڶ����AOPM ���� ��չ��ʽ ���Ѿ�����PDSToInitons ������
	//	private String PDSToPDE(String pds, double pDE_KEY_rate, DecadeToPDS decadeToPDS) {
	//		
	////pds= pds.replace("UQ", "V");	
	////pds= pds.replace("DI", "C");	
	////pds= pds.replace("IQ", "S");	
	////pds= pds.replace("VS", "A");
	////pds= pds.replace("ES", "O");
	////pds= pds.replace("EC", "P");
	////pds= pds.replace("CS", "M");
	////pds= pds.replace("VE", "T");
	////pds= pds.replace("VC", "X");
	////		
	//		return pds;
	//	}
	//������������ڽ������任��ʮ�߽���Ԫ�����֣�
	public String decadeToSeventeen(int decade, DecadeToPDS decadeToPDS) {
		String seventeen= "";
		int decad= decade;
		while(0< decad/ 17) {
			int seventeenth= decad% 17;
			seventeen= decadeToPDS.initonsSet.get(""+ seventeenth)+ seventeen;
			decad= decad/ 17;
		}
		seventeen= decadeToPDS.initonsSet.get(""+ decad)+ seventeen;
		//
		return seventeen;
	}
	//������������ڽ�ʮ�߽���Ԫ�����ֽ���Ԫ���任
	public String seventeenToIntons(String seventeen, DecadeToPDS decadeToPDS) {
		String initons= "";	
		for(int i= 0; i< seventeen.length(); i++) {
			initons+= decadeToPDS.initonsCode.get(""+ seventeen.charAt(i));
		}
		//
		return initons;
	}
	//������������ڽ�Ԫ���任������չ����˿��չ��
	public String initonsToPDS(String initons, double pDE_KEY_rate, DecadeToPDS decadeToPDS) {
		String PDS= "";
		StringBuilder PDEKey= new StringBuilder("");
		for(int i= 0; i< initons.length(); i++) {
			PDS+=	new PDE_PDS_DL().initonPDSwithBYS(""+ initons.charAt(i), pDE_KEY_rate, PDEKey, true)+ ".";
		}
		//System.out.println("����Կ�ף�"+ PDEKey);
		//
		return PDS;
	}
	//����������ڽ���չ˿��������ʮ�߽��ƽ���Ԫ���任
	public String PDSToInitons(String pDS, double pDE_KEY_rate, DecadeToPDS decadeToPDS) {
		String initons= "";
		//initons= new PDE_PDS_DL().initonPDIwithBYS(pDS, 0, new StringBuilder(), false);
		//initons= new PDE_PDS_DL().initonPDEwithBYS(pDS, pDE_KEY_rate, new StringBuilder(), true);
		initons= new PDE_PDS_DL().initonPDE_DCDLwithBYS(pDS, pDE_KEY_rate, new StringBuilder(), true);
		return initons;
	}
	//����������ڽ���չ˿��������ʮ�߽��Ʊ任��Ԫ������
	public String initonsToSeventeen(String initons, DecadeToPDS decadeToPDS) {
		String seventeen= "";
		//
		for(int i= 0; i< initons.length(); i++) {
			seventeen+= decadeToPDS.initonsMap.get(""+ initons.charAt(i));
		}
		return seventeen;
	}
	//�����������ʮ�߽���Ԫ�����ֽ���ʮ���ƻ�ԭ��
	public int seventeenToDecade(String seventeen, DecadeToPDS decadeToPDS) {
		int decade= 0;
		//A11         10*17*17 + 1*17 + 1
		for(int i= 0; i< seventeen.length(); i++) {
			int value= decadeToPDS.numberSet.get(""+ seventeen.charAt(i)).intValue();
			decade+= value* Math.pow(17,  seventeen.length()- 1- i);
		}
		return decade;
	}
	//�����������ʮ�߽���Ԫ�����ֽ���ʮ���ƾ���任��
	public int[][] doPDSMatrix(DecadeToPDS decadeToPDS, int[][] rp, double facx) {
		for(int i= 0; i< rp.length; i++) {
			for(int j= 0; j< rp[0].length; j++) {
				rp[i][j]= decadeToPDS.doPDS(decadeToPDS, rp[i][j], facx);
			}
		}
		return rp;
	}
}