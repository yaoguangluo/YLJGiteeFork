package OSI.OSU.MSU.tcp.http;

import java.util.Date;

import OSI.OSU.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.catalytic.procedure.pde.FullDNATokenPDI;
import OSI.OSU.VPC.common.utils.TokenUtil;
import dnaProcessor.Token;
import dnaProcessor.TokenCerts;
//��� ������
//˼�� ������
public class SessionValidation{
	//����ʱ�䳬ʱ���
    public void sessionTimeoutCheck() {
		
	}
    
    //���г�ʼ����
    public TokenCerts sessionTokenCertsInitWithHumanWordsByDNA(String humanWordsPassword) {
    	FullDNATokenPDI pDE_RNA_FullFormular= new FullDNATokenPDI();
    	//String a= "luoyaoguang";
    	//pDE_RNA_FullFormular.encodeDNA(a);
    	pDE_RNA_FullFormular.key[0]= 0.6;
    	pDE_RNA_FullFormular.key[1]= 0.3;
    	pDE_RNA_FullFormular.key[2]= 0.5;
    	pDE_RNA_FullFormular.key[3]= 0.632;

    	pDE_RNA_FullFormular.text= humanWordsPassword;
    	pDE_RNA_FullFormular.pdw= pDE_RNA_FullFormular.initonSect(pDE_RNA_FullFormular.text);
    	System.out.println("ԭ��: "+ pDE_RNA_FullFormular.text);
    	//pDE_RNA_FullFormular.pdw= "�ֵ䱣�ܣ�MSIOCUOCIPCUPCI";
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

    	for(i= 0; i< pDE_RNA_FullFormular.pdw.length(); i++) {
    		pDE_RNA_FullFormular.code+= pDE_RNA_FullFormular.lock + pDE_RNA_FullFormular.pdw.charAt(i);
    	}
    	System.out.println("����: "+ pDE_RNA_FullFormular.pdw);
    	System.out.println("����: "+ pDE_RNA_FullFormular.lock);
    	System.out.println("ɢ������:"+ pDE_RNA_FullFormular.code);
    	TokenCerts tokenCerts= new TokenCerts();
    	tokenCerts.setPdnKey(pDE_RNA_FullFormular.text);
    	tokenCerts.setPdnLock(pDE_RNA_FullFormular.lock);
    	tokenCerts.setPassword(humanWordsPassword);
    	tokenCerts.setPdnPassword(pDE_RNA_FullFormular.code);
    	return tokenCerts;
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
    
    //����ʱ�䳬ʱ����
    public void sessionUpdateByDNA() {
		
   	}
    //���� �������ļ��
    public void sessionCheckWithOrderPDSKey() {
		
 	}
    //���� �������ļ��
    public void sessionCheckWithPostPDSKey() {
		
 	}
}