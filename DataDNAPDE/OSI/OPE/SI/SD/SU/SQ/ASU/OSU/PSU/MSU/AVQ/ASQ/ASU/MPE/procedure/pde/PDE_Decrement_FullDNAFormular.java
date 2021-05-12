package OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde;
//ע��: �� �ļ���Ӧ�������������� DNA ���� �� ���������  ���������� ˼��ı��� ʵ��. 
//������ �� ֪ʶ��ȨίԱ�� �Ѿ����� , ���Ķ� ��� ����Ȩ ԭ��  �����߼����.  
public class PDE_Decrement_FullDNAFormular {
	//A = V + S LINK ���ݽṹ���� (�򵥲���)
	//���÷�����A ��initon����VPCS��չ��. ������ ӡ�� ANSI C��������б�д��ʽ.
	public Initon PDE_DecrementA(InitonLinkDNA initonLinkDNA) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		while(null!= initonLink) {
			if(initonLink.getStore().equalsIgnoreCase("A")) {
				Initon initonIncrementV= new Initon();
				initonIncrementV.setV(); //����һ������V
				Initon initonIncrementS= new Initon();
				initonIncrementS.setS(); //����һ������S

				initonIncrementV.next= initonIncrementS;  //V��ʼ
				initonIncrementV.prev= initonLink.prev;
				if(null!= initonIncrementV.prev) {
					initonIncrementV.prev.next= initonIncrementV;
				}

				initonIncrementS.prev= initonIncrementV;  //S��ʼ
				initonIncrementS.next= initonLink.next;
				if(null!= initonIncrementS.next) { 
					initonIncrementS.next.prev= initonIncrementS;
				}
				initonLink= initonIncrementS;//���S����
			}
			if(!initonLink.hasNext()) {
				return initonLink;
			}
			initonLink= initonLink.next;//while loop ����.
		}
		return initonLink;
	}

	//O = E + S LINK ���ݽṹ���� (�򵥲���)
	public Initon PDE_DecrementO(InitonLinkDNA initonLinkDNA) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		while(null!= initonLink) {
			if(initonLink.getStore().equalsIgnoreCase("O")) {
				Initon initonIncrementE= new Initon();
				initonIncrementE.setE(); //����һ������E
				Initon initonIncrementS= new Initon();
				initonIncrementS.setS(); //����һ������S

				initonIncrementE.next= initonIncrementS;  //E��ʼ
				initonIncrementE.prev= initonLink.prev;
				if(null!= initonIncrementE.prev) {
					initonIncrementE.prev.next= initonIncrementE;
				}

				initonIncrementS.prev= initonIncrementE;  //S��ʼ
				initonIncrementS.next= initonLink.next;
				if(null!= initonIncrementS.next) {
					initonIncrementS.next.prev= initonIncrementS;
				}
				initonLink= initonIncrementS;//���S����
			}
			if(!initonLink.hasNext()) {
				return initonLink;
			}
			initonLink= initonLink.next;//while loop ����.
		}
		return initonLink;
	}

	//P = E + C LINK ���ݽṹ���� (�򵥲���)
	public Initon PDE_DecrementP(InitonLinkDNA initonLinkDNA) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		while(null!= initonLink) {
			if(initonLink.getStore().equalsIgnoreCase("P")) {
				Initon initonIncrementE= new Initon();
				initonIncrementE.setE(); //����һ������E
				Initon initonIncrementC= new Initon();
				initonIncrementC.setC(); //����һ������C

				initonIncrementE.next= initonIncrementC;  //E��ʼ
				initonIncrementE.prev= initonLink.prev;
				if(null!= initonIncrementE.prev) {
					initonIncrementE.prev.next= initonIncrementE;
				}

				initonIncrementC.prev= initonIncrementE;  //C��ʼ
				initonIncrementC.next= initonLink.next;
				if(null!= initonIncrementC.next) {
					initonIncrementC.next.prev= initonIncrementC;
				}
				initonLink= initonIncrementC;//���C����
			}
			if(!initonLink.hasNext()) {
				return initonLink;
			}
			initonLink= initonLink.next;//while loop ����.
		}
		return initonLink;
	}
	//M = C + S
	public Initon PDE_DecrementM(InitonLinkDNA initonLinkDNA) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		while(null!= initonLink) {
			if(initonLink.getStore().equalsIgnoreCase("M")) {
				Initon initonIncrementC= new Initon();
				initonIncrementC.setC(); //����һ������C
				Initon initonIncrementS= new Initon();
				initonIncrementS.setS(); //����һ������S

				initonIncrementC.next= initonIncrementS;  //C��ʼ
				initonIncrementC.prev= initonLink.prev;
				if(null!= initonIncrementC.prev) {
					initonIncrementC.prev.next= initonIncrementC;
				}

				initonIncrementS.prev= initonIncrementC;  //s��ʼ
				initonIncrementS.next= initonLink.next;
				if(null!= initonIncrementS.next) {
					initonIncrementS.next.prev= initonIncrementS;
				}
				initonLink= initonIncrementS;//���S����
			}
			if(!initonLink.hasNext()) {
				return initonLink;
			}
			initonLink= initonLink.next;//while loop ����.
		}
		return initonLink;
	}
	//V = U + Q
	public Initon PDE_DecrementV(InitonLinkDNA initonLinkDNA) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		while(null!= initonLink) {
			if(initonLink.getStore().equalsIgnoreCase("V")) {
				Initon initonIncrementU= new Initon();
				initonIncrementU.setU(); //����һ������U
				Initon initonIncrementQ= new Initon();
				initonIncrementQ.setQ(); //����һ������Q

				initonIncrementU.next= initonIncrementQ;  //U��ʼ
				initonIncrementU.prev= initonLink.prev;
				if(null!= initonIncrementU.prev) {
					initonIncrementU.prev.next= initonIncrementU;
				}

				initonIncrementQ.prev= initonIncrementU;  //Q��ʼ
				initonIncrementQ.next= initonLink.next;
				if(null!= initonIncrementQ.next) {
					initonIncrementQ.next.prev= initonIncrementQ;
				}
				initonLink= initonIncrementQ;//���Q����
			}
			if(!initonLink.hasNext()) {
				return initonLink;
			}
			initonLink= initonLink.next;//while loop ����.
		}
		return initonLink;
	}
	//E = D + U
	//��չ��ʽ�ĸ�������, ����������,֮������ ��IU����DU
	//E = D + U
	//��չ��ʽ�ĸ�������, ����������,֮������ ��IU����DU
	//2021��2��10�� �Ż��λ����� ��Ӧ D �� U ����ǿ��. �����⡣����������Ũ�ȿ��� ���� S= I�� S= Q ǿ�����ᡣ
	//֮���о� u�Ƿ������ȥ�������E= D �� E= U
	public Initon PDE_DecrementE_DU(InitonLinkDNA initonLinkDNA, FullDNATokenPDI pDE_RNA_Formular, boolean bYS) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		int index= 0;
		while(null!= initonLink) {
			if(initonLink.getStore().equalsIgnoreCase("E")) {
				Initon initonIncrementI= new Initon();
				if(bYS) {
					try {
						if(pDE_RNA_Formular.pdedeKey.charAt(index)== '0') { 
							initonIncrementI.setD(); //����һ������D
						}if(pDE_RNA_Formular.pdedeKey.charAt(index)== '1') { 
							initonIncrementI.setU(); //����һ������U
						}
						//else {
						//	initonIncrementI.setE(); //����һ������E
						//}		
						index++;
					}catch(Exception e) {
						e.printStackTrace();
					}
						
				}else {
					if(Math.random()< pDE_RNA_Formular.key[1]) { 
						pDE_RNA_Formular.pdedeKey+= "0";
						initonIncrementI.setD();
					}else {
						pDE_RNA_Formular.pdedeKey+= "1";
						initonIncrementI.setU();
					}
				}
				initonIncrementI.prev= initonLink.prev;
				if(null!= initonIncrementI.prev) {
					initonIncrementI.prev.next= initonIncrementI;
				}

				initonIncrementI.next= initonLink.next;
				if(null!= initonIncrementI.next) {
					initonIncrementI.next.prev= initonIncrementI;
				}
				initonLink= initonIncrementI;//���I����
			}
			//else if(initonLink.getStore().equalsIgnoreCase("D")) {
			//	pDE_RNA_Formular.pdedeKey+= "2";
			//}else if(initonLink.getStore().equalsIgnoreCase("U")) {
			//	pDE_RNA_Formular.pdedeKey+= "2";
			//}
			if(!initonLink.hasNext()) {
				//System.out.println(pDE_RNA_Formular.pdedsKey);
				return initonLink;
			}
			initonLink= initonLink.next;//while loop ����.
		}
		//System.out.println(pDE_RNA_Formular.pdedsKey);
		return initonLink;
	}
	//C = I + D
	public Initon PDE_DecrementC(InitonLinkDNA initonLinkDNA) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		while(null!= initonLink) {
			if(initonLink.getStore().equalsIgnoreCase("C")) {
				Initon initonIncrementI= new Initon();
				initonIncrementI.setI(); //����һ������I
				Initon initonIncrementD= new Initon();
				initonIncrementD.setD(); //����һ������D

				initonIncrementI.next= initonIncrementD;  //I��ʼ
				initonIncrementI.prev= initonLink.prev;
				if(null!= initonIncrementI.prev) {
					initonIncrementI.prev.next= initonIncrementI;
				}

				initonIncrementD.prev= initonIncrementI;  //D��ʼ
				initonIncrementD.next= initonLink.next;
				if(null!= initonIncrementD.next) {
					initonIncrementD.next.prev= initonIncrementD;
				}
				initonLink= initonIncrementD;//���D����
			}
			if(!initonLink.hasNext()) {
				return initonLink;
			}
			initonLink= initonLink.next;//while loop ����.
		}
		return initonLink;
	}

	//S = I
	//��չ��ʽ�ĸ�������, ����������,֮������ ��I, Q����I + Q
	public Initon PDE_DecrementS_IQ(InitonLinkDNA initonLinkDNA, FullDNATokenPDI pDE_RNA_Formular, boolean bYS) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		int index= 0;
		while(null!= initonLink) {
			if(initonLink.getStore().equalsIgnoreCase("S")) {
				Initon initonIncrementI= new Initon();
				if(bYS) {
					try {
						if(pDE_RNA_Formular.pdedsKey.charAt(index)== '0') { 
							initonIncrementI.setI(); //����һ������D
						}if(pDE_RNA_Formular.pdedsKey.charAt(index)== '1') { 
							initonIncrementI.setQ(); //����һ������U
						}
//						else {
//							initonIncrementI.setS(); //����һ������E
//						}		
						index++;
					}catch(Exception e) {
						e.printStackTrace();
					}
						
				}else {
					if(Math.random()< pDE_RNA_Formular.key[1]) { 
						pDE_RNA_Formular.pdedsKey+= "0";
						initonIncrementI.setI();
					}else {
						pDE_RNA_Formular.pdedsKey+= "1";
						initonIncrementI.setQ();
					}
				}
				initonIncrementI.prev= initonLink.prev;
				if(null!= initonIncrementI.prev) {
					initonIncrementI.prev.next= initonIncrementI;
				}

				initonIncrementI.next= initonLink.next;
				if(null!= initonIncrementI.next) {
					initonIncrementI.next.prev= initonIncrementI;
				}
				initonLink= initonIncrementI;//���I����
			}
//			else if(initonLink.getStore().equalsIgnoreCase("I")) {
//				pDE_RNA_Formular.pdedsKey+= "2";
//			}else if(initonLink.getStore().equalsIgnoreCase("Q")) {
//				pDE_RNA_Formular.pdedsKey+= "2";
//			}
			if(!initonLink.hasNext()) {
				System.out.println(pDE_RNA_Formular.pdedsKey);
				return initonLink;
			}
			initonLink= initonLink.next;//while loop ����.
		}
		//System.out.println(pDE_RNA_Formular.pdedsKey);
		return initonLink;
	}
}