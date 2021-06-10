package MSU.AMS.VQS.SQV.SI.OSU.SMV.http;

import java.util.Date;

import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.FullDNATokenPDI;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.TokenPDI;
import PEU.P.dna.Token;
import PEU.P.dna.TokenCerts;
import VPC.VQS.DSU.utils.TokenUtil;
//DNA������� ������
//DNA����˼�� ������
//Refer <DNAԪ������>, <PDE��չ��ʽ>:  ������ ������
public class SessionValidation{
	//���м��, ���ڲ�����������û�л���������������.
	//�û�ע��, FullDNATokenPDI ����Ŀ��������DNA������, ��dna��������Ҳ������, ����, ���Ҫ��, ������޸�.
	public boolean sessionCheck(Token token, TokenCerts tokenCerts) {
		boolean infix= this.sessionCheckWithOrderPDSKey(token, tokenCerts);
		boolean postfix= this.sessionCheckWithPostPDSKey(token, tokenCerts);
		return infix&& postfix;	
	}

	//����ʹ��һ�α��������
	public Token sessionTokenUpdateByDNA(String password) {
		SessionValidation sessionValidation= new SessionValidation();
		TokenCerts tokenCerts= sessionValidation.sessionTokenCertsInitWithHumanWordsByDNA(password, false, null);
		Token token= sessionValidation.sessionInitByTokenPDICertsDNA(tokenCerts);
		return token;
	}

	//���г�ʼ����
	//���Խ������ʱ�䶼���������humanWordsPassword��, ����ʱ��Ͳ���Ҫ�ȶ���.
	//�ҽ�������ũ��͵��.
	public TokenCerts sessionTokenCertsInitWithHumanWordsByDNA(String humanWordsPassword, boolean bys, String lockBys) {
		FullDNATokenPDI pDE_RNA_FullFormular= new FullDNATokenPDI();
		//String a= "luoyaoguang";
		//pDE_RNA_FullFormular.encodeDNA(a);
		pDE_RNA_FullFormular.key[0]= 0.6;
		pDE_RNA_FullFormular.key[1]= 0.3;
		pDE_RNA_FullFormular.key[2]= 0.5;
		pDE_RNA_FullFormular.key[3]= 0.632;
		pDE_RNA_FullFormular.text= humanWordsPassword;
		pDE_RNA_FullFormular.pdw= pDE_RNA_FullFormular.initonSect(pDE_RNA_FullFormular.text);
		//		System.out.println("ԭ��: "+ pDE_RNA_FullFormular.text);
		//pDE_RNA_FullFormular.pdw= "�ֵ䱣�ܣ�MSIOCUOCIPCUPCI";
		if(bys) {
			pDE_RNA_FullFormular.lock= lockBys;
		}else {
			String[] lock= new String[12];
			lock[0] = "A"; lock[3] = "O"; lock[6] = "P"; lock[9]  = "M";
			lock[1] = "V"; lock[4] = "E"; lock[7] = "C"; lock[10] = "S";
			lock[2] = "I"; lock[5] = "D"; lock[8] = "U"; lock[11] = "Q";
			int i= (int)(Math.random()* 12)% 12;
			pDE_RNA_FullFormular.lock+= lock[i];
			i= (int)(Math.random()* 12)% 12;
			pDE_RNA_FullFormular.lock+= lock[i];
			i= (int)(Math.random()* 12)% 12;
			pDE_RNA_FullFormular.lock+= lock[i];
			i= (int)(Math.random()* 12)% 12;
			pDE_RNA_FullFormular.lock+= lock[i];
		}
		for(int i= 0; i< pDE_RNA_FullFormular.pdw.length(); i++) {
			pDE_RNA_FullFormular.code+= pDE_RNA_FullFormular.lock + pDE_RNA_FullFormular.pdw.charAt(i);
		}
		//		System.out.println("����: "+ pDE_RNA_FullFormular.pdw);
		//		System.out.println("����: "+ pDE_RNA_FullFormular.lock);
		//		System.out.println("ɢ������:"+ pDE_RNA_FullFormular.code);
		TokenCerts tokenCerts= new TokenCerts();
		tokenCerts.setPdnKey(pDE_RNA_FullFormular.pdw);
		tokenCerts.setPdnLock(pDE_RNA_FullFormular.lock);
		tokenCerts.setPassword(humanWordsPassword);
		tokenCerts.setPdnPassword(pDE_RNA_FullFormular.code);
		return tokenCerts;
	}

	//����PDI��ʼ�����߷�Util����
	public Token sessionInitByTokenPDICertsDNA(TokenCerts tokenCerts) {
		Token token= new Token();
		TokenPDI pDE_RNA_Formular= new TokenPDI();
		pDE_RNA_Formular.doKeyPress(tokenCerts.getPdnPassword(), pDE_RNA_Formular, false);
		//		System.out.println("��̬��չ��Ԫ����Կ��E: "+ pDE_RNA_Formular.pdedeKey);
		//		System.out.println("��̬��չ��Ԫ����Կ��S: "+ pDE_RNA_Formular.pdedsKey);
		//		System.out.println("��̬��չ��Ԫ: "+ pDE_RNA_Formular.pds);
		tokenCerts.setPds(pDE_RNA_Formular.pds);
		token.setUpdsde(pDE_RNA_Formular.pdedeKey);
		token.setUpdsds(pDE_RNA_Formular.pdedsKey);
		token.setUpdsie(pDE_RNA_Formular.pdeieKey);
		token.setUpdsis(pDE_RNA_Formular.pdeisKey);
		//		System.out.println("��̬��չ��Ԫ����Կ��E: "+ pDE_RNA_Formular.pdeieKey);
		//		System.out.println("��̬��չ��Ԫ����Կ��S: "+ pDE_RNA_Formular.pdeisKey);
		//		System.out.println("��̬��չ��Ԫ: "+ pDE_RNA_Formular.pde);
		pDE_RNA_Formular.time= "" + System.currentTimeMillis();
		pDE_RNA_Formular.cacheId= "ID" + Math.random() + ":" + Math.random();
		//		System.out.println("ʱ��:  " + pDE_RNA_Formular.time);
		//		System.out.println("�˺���������ַ���:  " + pDE_RNA_Formular.cacheId);
		pDE_RNA_Formular.session_key= pDE_RNA_Formular.pde;
		//		System.out.println("Session: " + pDE_RNA_Formular.session_key);
		token.setmPassword(pDE_RNA_Formular.pde);
		return token;
	}

	//���г�ʼ����
	public Token sessionInitByTokenCertsDNA(TokenCerts tokenCerts) {
		String key= "";
		String[] lock= new String[12];
		lock[0]= "A"; lock[3]= "O"; lock[6]= "P"; lock[9]= "M";
		lock[1]= "V"; lock[4]= "E"; lock[7]= "C"; lock[10]= "S";
		lock[2]= "I"; lock[5]= "D"; lock[8]= "U"; lock[11]= "Q";
		//�����Լ� TXH, ��ȫ�������.
		for(int loop= 0; loop< 4; loop++) {
			int i= (int)(Math.random()* 12)% 12;
			key+= lock[i];
		}
		Token sessiontoken= new Token();//���ע�����password ��Ԫ��, ����Ҫת����.
		String dnaPassword= TokenUtil.getFirstDNAPassword(key, tokenCerts.getPdnPassword(), sessiontoken);
		sessiontoken.setuEmail("313699483@qq.com");
		sessiontoken.setuKey(key);
		//����ע�����ʱ��Ҫ��ETC��ʱ������ʱ������.����ͳһ.
		//��׼�����������ʱ���Ժ�Ҳͬ���ļ���, ��Ȼ���˸�ʱ��һ������.
		//����Ƿ������˵Ļ�����ʱ��ʧЧ����, �ǾͿ��Բ�����.
		sessiontoken.setuTime(new Date().getTime());
		//token.setmPassword(mPassword);
		sessiontoken.setmPassword(dnaPassword);
		return sessiontoken;
	}

	//���� �������ļ��
	public boolean sessionCheckWithOrderPDSKey(Token token, TokenCerts tokenCerts) {
		TokenPDI pDE_RNA_Formular= new TokenPDI();
		//		System.out.println("Session: "+ token.getmPassword());
		//		System.out.println("=========================================================================================");
		//		System.out.println("��ʼǰ����֤��");
		//		System.out.println("��ʼSession������"+ token.getmPassword());
		//		System.out.println("��ʼ����Կ�׽�����"+ token.getUpdsde()+ token.getUpdsds()+ token.getUpdsie()+ token.getUpdsis());
		TokenPDI pDE_RNA_Formular1= new TokenPDI();
		pDE_RNA_Formular1.pdedeKey= token.getUpdsde().toString();
		pDE_RNA_Formular1.pdedsKey= token.getUpdsds().toString();
		pDE_RNA_Formular1.pdeieKey= token.getUpdsie().toString();
		pDE_RNA_Formular1.pdeisKey= token.getUpdsis().toString();
		pDE_RNA_Formular.doKeyUnPress(tokenCerts.getPdnPassword(), pDE_RNA_Formular1, true);
		//		System.out.println("�õ�ԭ��ԪԪ��DNA���У�"+ pDE_RNA_Formular.pds);
		//		System.out.println("�õ��½�ԪԪ��DNA���У�"+ pDE_RNA_Formular1.pds);
		//		System.out.println("�õ�ԭԪ��DNA���У�"+ pDE_RNA_Formular.pde);
		//		System.out.println("�õ���Ԫ��DNA���У�"+ pDE_RNA_Formular1.pde);
		return pDE_RNA_Formular1.pde.equalsIgnoreCase(token.getmPassword())? true: false;
	}

	//���� �������ļ��
	public boolean sessionCheckWithPostPDSKey(Token token, TokenCerts tokenCerts) {
		//		System.out.println("=========================================================================================");
		//		System.out.println("��ʼ������֤��");
		TokenPDI pDE_RNA_Formular2= new TokenPDI();
		pDE_RNA_Formular2.pdeieKey= token.getUpdsde().toString();
		pDE_RNA_Formular2.pdeisKey= token.getUpdsds().toString();
		pDE_RNA_Formular2.pdedeKey= token.getUpdsie().toString();
		pDE_RNA_Formular2.pdedsKey= token.getUpdsis().toString();
		//		System.out.println("׼������Ԫ��DNA���У�"+ token.getmPassword());
		pDE_RNA_Formular2.doSessionKeyUnPress(token.getmPassword(), pDE_RNA_Formular2, true);
		//		System.out.println("�õ�ԭ����ԪԪ��DNA���У�"+ tokenCerts.getPds());
		//		System.out.println("�õ�������ԪԪ��DNA���У�"+ pDE_RNA_Formular2.pds);
		//		System.out.println("��֤��ȷ��");
		System.out.println(tokenCerts.getPds().equals(pDE_RNA_Formular2.pds)? "��ȷ": "ʧ��");
		return tokenCerts.getPds().equals(pDE_RNA_Formular2.pds)? true: false;	
	}

	//д��main����������
	public static void main(String[] argv) {
		SessionValidation sessionValidation= new SessionValidation();
		TokenCerts tokenCerts= sessionValidation.sessionTokenCertsInitWithHumanWordsByDNA("��������", false, null);
		Token token= sessionValidation.sessionInitByTokenPDICertsDNA(tokenCerts);
		sessionValidation.sessionCheck(token, tokenCerts);

	}
}