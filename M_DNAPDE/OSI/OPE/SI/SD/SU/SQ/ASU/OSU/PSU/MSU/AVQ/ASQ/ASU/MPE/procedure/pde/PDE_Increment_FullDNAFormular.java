package OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
//ע��: �� �ļ���Ӧ�������������� DNA ���� �� ���������  ���������� ˼��ı��� ʵ��. 
//������ �� ֪ʶ��ȨίԱ�� �Ѿ����� , ���Ķ� ��� ����Ȩ ԭ��  �����߼����.  
public class PDE_Increment_FullDNAFormular {
	//A = V + S LINK ���ݽṹ���� (�򵥲���)
	//���������û�а�sonarģʽ �޸�,��Ϊ�ҵ��� sonar��Ǳ��ʶ �ı��ҵ�д��ģʽ, 
	//���� �����Һܶ����ANSI C��������б�д, ��Ϊ���ַ�ʽ���ҵĻ���. �Ҹ��˾�
	//�� һ���˵��з���������������ĸ��ˮƽ.��������C����, ��Ӧ�ü�����������츳.���������⺯��.
	public Initon PDE_IncrementA(InitonLinkDNA initonLinkDNA) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		while(null!= initonLink) {
			if(initonLink.getStore().equalsIgnoreCase("V")) {
				if(initonLink.hasNext()) {
					Initon initonNext= initonLink.forwardNext();
					if(initonNext.getStore().equalsIgnoreCase("S")) {					
						Initon initonIncrementA= new Initon();
						initonIncrementA.setA(); //����һ������A
						if(initonNext.hasNext()) {
							initonIncrementA.next= initonNext.next; //A�����滻
							initonIncrementA.next.prev= initonIncrementA;//A����ǰ����
						}
						if(null!= initonNext.prev.prev) {
							initonIncrementA.prev= initonNext.prev.prev;//Aǰ���滻
							initonIncrementA.prev.next= initonIncrementA;//Aǰ�������
						}		
						initonLink= initonIncrementA;//���A����
					}
				}
			}
			if(!initonLink.hasNext()) {
				return initonLink;
			}
			initonLink= initonLink.forwardNext();//while loop ����.
		}
		return initonLink;
	}

	//A = V + S LIST jdk util����, ���溯����ֱ����JDK����������� ��д��,�߼��Ƚ�����, ���и����ô�.
	public List<Initon> PDE_IncrementA(List<Initon> Initons) {
		List<Initon> output= new CopyOnWriteArrayList<>(); 
		Iterator<Initon> iterator= Initons.iterator();
		HERE:
			while(iterator.hasNext()) {
				Initon initon= iterator.next();
				if(initon.getStore().equalsIgnoreCase("V")) {
					if(iterator.hasNext()) {
						Initon initonNext= iterator.next();
						if(initonNext.getStore().equalsIgnoreCase("S")) {
							Initon initonIncrementA= new Initon();
							initonIncrementA.setA();
							output.add(initonIncrementA);
							continue HERE;
						}
						Initon initonIncrementV= new Initon();
						initonIncrementV.setV();
						Initon initonIncrementS= new Initon();
						initonIncrementS.setS();
						output.add(initonIncrementV);
						output.add(initonIncrementS);
						continue HERE;
					}
					Initon initonIncrementV= new Initon();
					initonIncrementV.setV();
					output.add(initonIncrementV);
					continue HERE;
				}
				output.add(initon);
			}
		return output;
	}

	//O = E + S LINK ���ݽṹ���� (�򵥲���)
	public Initon PDE_IncrementO(InitonLinkDNA initonLinkDNA) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		while(null!= initonLink) {
			if(initonLink.getStore().equalsIgnoreCase("E")) {
				if(initonLink.hasNext()) {
					Initon initonNext= initonLink.forwardNext();
					if(initonNext.getStore().equalsIgnoreCase("S")) {					
						Initon initonIncrementO= new Initon();
						initonIncrementO.setO(); //����һ������O
						if(initonNext.hasNext()) {
							initonIncrementO.next= initonNext.next; //O�����滻
							initonIncrementO.next.prev= initonIncrementO;//O����ǰ����
						}
						if(null!= initonNext.prev.prev) {
							initonIncrementO.prev= initonNext.prev.prev;//Oǰ���滻
							initonIncrementO.prev.next= initonIncrementO;//Oǰ�������
						}		
						initonLink= initonIncrementO;//���O����
					}
				}
			}
			if(!initonLink.hasNext()) {
				return initonLink;
			}
			initonLink= initonLink.forwardNext();//while loop ����.
		}
		return initonLink;
	}

	//P = E + C LINK ���ݽṹ���� (�򵥲���)
	public Initon PDE_IncrementP(InitonLinkDNA initonLinkDNA) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		while(null!= initonLink) {
			if(initonLink.getStore().equalsIgnoreCase("E")) {
				if(initonLink.hasNext()) {
					Initon initonNext= initonLink.forwardNext();
					if(initonNext.getStore().equalsIgnoreCase("C")) {					
						Initon initonIncrementP= new Initon();
						initonIncrementP.setP(); //����һ������P
						if(initonNext.hasNext()) {
							initonIncrementP.next= initonNext.next; //P�����滻
							initonIncrementP.next.prev= initonIncrementP;//P����ǰ����
						}
						if(null!= initonNext.prev.prev) {
							initonIncrementP.prev= initonNext.prev.prev;//Pǰ���滻
							initonIncrementP.prev.next= initonIncrementP;//Pǰ�������
						}	
						initonLink= initonIncrementP;//���P����
					}
				}
			}
			if(!initonLink.hasNext()) {
				return initonLink;
			}
			initonLink= initonLink.forwardNext();//while loop ����.
		}
		return initonLink;
	}
	//M = C + S
	public Initon PDE_IncrementM(InitonLinkDNA initonLinkDNA) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		while(null!= initonLink) {
			if(initonLink.getStore().equalsIgnoreCase("C")) {
				if(initonLink.hasNext()) {
					Initon initonNext= initonLink.forwardNext();
					if(initonNext.getStore().equalsIgnoreCase("S")) {					
						Initon initonIncrementM= new Initon();
						initonIncrementM.setM(); //����һ������M
						if(initonNext.hasNext()) {
							initonIncrementM.next= initonNext.next; //M�����滻
							initonIncrementM.next.prev= initonIncrementM;//M����ǰ����
						}
						if(null!= initonNext.prev.prev) {
							initonIncrementM.prev= initonNext.prev.prev;//Mǰ���滻
							initonIncrementM.prev.next= initonIncrementM;//Mǰ�������
						}		
						initonLink= initonIncrementM;//���M����
					}
				}
			}
			if(!initonLink.hasNext()) {
				return initonLink;
			}
			initonLink= initonLink.forwardNext();//while loop ����.
		}
		return initonLink;
	}


	//V = U + Q
	public Initon PDE_IncrementV(InitonLinkDNA initonLinkDNA) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		while(null!= initonLink) {
			if(initonLink.getStore().equalsIgnoreCase("U")) {
				if(initonLink.hasNext()) {
					Initon initonNext= initonLink.forwardNext();
					if(initonNext.getStore().equalsIgnoreCase("Q")) {					
						Initon initonIncrementV= new Initon();
						initonIncrementV.setV(); //����һ������V
						if(initonNext.hasNext()) {
							initonIncrementV.next= initonNext.next; //V�����滻
							initonIncrementV.next.prev= initonIncrementV;//V����ǰ����
						}
						if(null!= initonNext.prev.prev) {
							initonIncrementV.prev= initonNext.prev.prev;//Vǰ���滻
							initonIncrementV.prev.next= initonIncrementV;//Vǰ�������
						}		
						initonLink= initonIncrementV;//���V����
					}
				}
			}
			if(!initonLink.hasNext()) {
				return initonLink;
			}
			initonLink= initonLink.forwardNext();//while loop ����.
		}
		return initonLink;
	}

	//E = D + U
	//��չ��ʽ�ĸ�������, ����������,֮������ ��IU����DU
	public Initon PDE_IncrementE_DU(InitonLinkDNA initonLinkDNA, FullDNATokenPDI pDE_RNA_Formular, boolean bYS) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		while(null!= initonLink) {
			String initonString= initonLink.getStore();
			if(initonLink.getStore().equalsIgnoreCase("D")
					|| initonLink.getStore().equalsIgnoreCase("U")) {
				Initon initonIncrementE= new Initon();
				initonIncrementE.setE(); //����һ������S
				if(initonString.equalsIgnoreCase("D")) {
					pDE_RNA_Formular.pdeieKey+= "0";
				}else if(initonString.equalsIgnoreCase("U")) {
					pDE_RNA_Formular.pdeieKey+= "1";
				}
				if(initonLink.hasNext()) {
					initonIncrementE.next= initonLink.next; //S�����滻
					initonIncrementE.next.prev= initonIncrementE;//S����ǰ����
				}
				if(null!= initonLink.prev) {
					initonIncrementE.prev= initonLink.prev;//Sǰ���滻
					initonIncrementE.prev.next= initonIncrementE;//Sǰ�������
				}		
				initonLink= initonIncrementE;//���S����

			}
			if(!initonLink.hasNext()) {
				return initonLink;
			}
			initonLink= initonLink.forwardNext();//while loop ����.
		}
		return initonLink;
	}

	//C = I + D
	public Initon PDE_IncrementC(InitonLinkDNA initonLinkDNA) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		while(null!= initonLink) {
			if(initonLink.getStore().equalsIgnoreCase("I")) {
				if(initonLink.hasNext()) {
					Initon initonNext= initonLink.forwardNext();
					if(initonNext.getStore().equalsIgnoreCase("D")) {					
						Initon initonIncrementC= new Initon();
						initonIncrementC.setC(); //����һ������C
						if(initonNext.hasNext()) {
							initonIncrementC.next= initonNext.next; //C�����滻
							initonIncrementC.next.prev= initonIncrementC;//C����ǰ����
						}
						if(null!= initonNext.prev.prev) {
							initonIncrementC.prev= initonNext.prev.prev;//Mǰ���滻
							initonIncrementC.prev.next= initonIncrementC;//Mǰ�������
						}		
						initonLink= initonIncrementC;//���C����
					}
				}
			}
			if(!initonLink.hasNext()) {
				return initonLink;
			}
			initonLink= initonLink.forwardNext();//while loop ����.
		}
		return initonLink;
	}

	//S = I
	//��չ��ʽ�ĸ�������, ����������,֮������ ��I, Q����I + Q
	public Initon PDE_IncrementS_IQ(InitonLinkDNA initonLinkDNA, FullDNATokenPDI pDE_RNA_Formular) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		//int index= 0;
		while(null!= initonLink) {
			String initonString= initonLink.getStore();
			if(initonLink.getStore().equalsIgnoreCase("I")
					|| initonLink.getStore().equalsIgnoreCase("Q")) {
				Initon initonIncrementS= new Initon();
				initonIncrementS.setS(); //����һ������S
				if(initonString.equalsIgnoreCase("I")) {
					pDE_RNA_Formular.pdeisKey+= "0";
				}else if(initonString.equalsIgnoreCase("Q")) {
					pDE_RNA_Formular.pdeisKey+= "1";
				}
//				if(pDE_RNA_Formular.pdedsKey.charAt(index)== '0') { 
//					initonIncrementS.setS(); //����һ������S
//				}else if(pDE_RNA_Formular.pdedsKey.charAt(index)== '1') { 
//					initonIncrementS.setS(); //����һ������S
//				}else if(pDE_RNA_Formular.pdedsKey.charAt(index)== '2') { 
//					if(initonString.equalsIgnoreCase("I")) {
//						initonIncrementS.setI();
//						//pDE_RNA_Formular.pdeisKey+= "0";
//					}else if(initonString.equalsIgnoreCase("Q")) {
//						initonIncrementS.setQ();
//						//pDE_RNA_Formular.pdeisKey+= "1";
//					}
//				}	
//				index++;
				if(initonLink.hasNext()) {
					initonIncrementS.next= initonLink.next; //S�����滻
					initonIncrementS.next.prev= initonIncrementS;//S����ǰ����
				}
				if(null!= initonLink.prev) {
					initonIncrementS.prev= initonLink.prev;//Sǰ���滻
					initonIncrementS.prev.next= initonIncrementS;//Sǰ�������
				}		
				initonLink= initonIncrementS;//���S����

			}
			if(!initonLink.hasNext()) {
				return initonLink;
			}
			initonLink= initonLink.forwardNext();//while loop ����.
		}
		return initonLink;
	}
}