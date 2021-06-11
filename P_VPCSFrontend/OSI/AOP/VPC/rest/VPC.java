package OSI.AOP.VPC.rest;
import java.io.File;
import java.io.IOException;
import java.util.Map;

import ME.APM.VSQ.App;
import MSU.AMS.VQS.SQV.SI.OSU.SMV.http.SessionValidation;
import OSI.AOP.VPC.C.Config_C;
import OSI.AOP.VPC.C.DBCategory_C;
import OSI.AOP.VPC.C.D_C;
import OSI.AOP.VPC.C.IU_C;
import OSI.AOP.VPC.C.Q_C;
import OSI.AOP.VPC.C.U_C;
import OSI.AOP.VPC.PP.port_E.RestAskPort_E;
import OSI.AOP.VPC.PP.port_E.RestLoginPort_E;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.TokenPDI;
import PEU.P.dna.TokenCerts;
import PEU.P.map.*;
public class VPC {
	public static String forward(App app, String string, Map<String, String> data) throws Exception {
		//���ƾ���DNA����չʾ ȫ�ּ����Կ �����Ѿ��ɹ�,.
		@SuppressWarnings("unused")
		String id= data.get("id");
		
		String password= data.get("password");
		String de= data.get("de");
		String ds= data.get("ds");
		String ie= data.get("ie");
		String is= data.get("is");
		TokenPDI pDE_RNA_Formular= new TokenPDI();
		TokenPDI pDE_RNA_Formular1= new TokenPDI();
		TokenPDI pDE_RNA_Formular2= new TokenPDI();
		pDE_RNA_Formular2.pdeieKey= de;
		pDE_RNA_Formular2.pdeisKey= ds;
		pDE_RNA_Formular2.pdedeKey= ie;
		pDE_RNA_Formular2.pdedsKey= is;
//		System.out.println("׼������Ԫ��DNA���У�"+ token.getmPassword());
		pDE_RNA_Formular2.doSessionKeyUnPress(password, pDE_RNA_Formular2, true);
		System.out.println("pds--2>"+ pDE_RNA_Formular2.pds);
		
		@SuppressWarnings("unused")
		String DB_id= "313699483@qq.com";
		
		//String DB_id= id;
		//ģ�Ȿ�����ݿ����DB_password �����ݿ�user����ͨ��DB_id ����ȡ. ��Һ�����. 
		String DB_password= "fengyue1985";
		
		String lock= data.get("lock");//Ҳ���ѷ����ݱ���.����rest���淢��.
		//DB_password to lock DB
		SessionValidation sessionValidation= new SessionValidation();
		TokenCerts tokenCerts= sessionValidation.sessionTokenCertsInitWithHumanWordsByDNA(DB_password, true, lock);
		pDE_RNA_Formular1.pdedeKey= de;
		pDE_RNA_Formular1.pdedsKey= ds;
		pDE_RNA_Formular1.pdeieKey= ie;
		pDE_RNA_Formular1.pdeisKey= is;
		pDE_RNA_Formular.doKeyUnPress(tokenCerts.getPdnPassword(), pDE_RNA_Formular1, true);
		System.out.println("pds--3>"+ pDE_RNA_Formular1.pds);
		//��ʼ�ȶ�
		if(!pDE_RNA_Formular1.pde.equalsIgnoreCase(password)? true: false) {
			return "";
			//�ɹ��ͷ�����,���ɹ��ͷ�����ʧ��.
			//�Ժ���ʱ���Ұ�װ�������� DNA VPCS �������ȼ����͡�
			//������ 20210422
		}
		//controller
		if(string.contains("/select")){
			return Q_C.exec(string, data);	
		}
		if(string.contains("/setDB")){
			return Config_C.exec(string, data);	
		}
		if(string.contains("/insert")){
			return IU_C.exec(string, data);	
		}
		if(string.contains("/delete")){
			return D_C.exec(string, data);	
		}
		if(string.contains("/update")){
			return U_C.exec(string, data);	
		}
		if(string.contains("DBCategory")){
			return DBCategory_C.exec(string, data);	
		}
		//restMap
		if(string.equalsIgnoreCase("/login")){
			return VtoV.ObjectToJsonString(RestLoginPort_E.login(data.get("uEmail"),data.get("uPassword")));	
		}
		if(string.equalsIgnoreCase("/find")){
			return VtoV.ObjectToJsonString(RestLoginPort_E.find(data.get("uEmail")));
		}
		if(string.equalsIgnoreCase("/logout")){
			return VtoV.ObjectToJsonString(RestLoginPort_E.logout(data.get("uEmail"), data.get("uToken")));
		}
		if(string.equalsIgnoreCase("/register")){
			return VtoV.ObjectToJsonString(RestLoginPort_E.register(data.get("uEmail"), data.get("uEmailEnsure")
					, data.get("uName"), data.get("uPassword"), data.get("uPassWDEnsure"), data.get("uAddress")
					, data.get("uPhone"), data.get("uWeChat"), data.get("uQq"), data.get("uAge"), data.get("uSex")));	
		}
		if(string.equalsIgnoreCase("/change")){
			return VtoV.ObjectToJsonString(RestLoginPort_E.change(data.get("uEmail"), data.get("uChange")
					, data.get("uChangeEnsure"),data.get("uToken"), data.get("uPassword")));	
		}
//		if(string.equalsIgnoreCase("/checkStatus")){
//			return VtoV.ObjectToJsonString(RestLoginPortImpl.checkStatus(data.get("token")));	
//		}
		if(string.equalsIgnoreCase("/ask")){
			return VtoV.ObjectToJsonString(RestAskPort_E.ask(data.get("ip"), data.get("token")
					, data.get("message"), data.get("pointIp")));
		}
		if(string.equalsIgnoreCase("/feedBack")){
			return VtoV.ObjectToJsonString(RestAskPort_E.feedBack(data.get("ip"), data.get("token")
					, data.get("pointIp")));
		}
		if(string.equalsIgnoreCase("/getAskers")){
			return VtoV.ObjectToJsonString(RestAskPort_E.getAskers(data.get("token")));
		}	
		if(string.equalsIgnoreCase("/dataWS")){
			return RestAskPort_E.dataWS(data.get("message"));
		}	
		if(string.equalsIgnoreCase("/dataCX")){
			return RestAskPort_E.dataCX(data.get("message"));
		}	
		if(string.equalsIgnoreCase("/dataCY")){
			return RestAskPort_E.dataCY(data.get("message"));
		}	
		if(string.equalsIgnoreCase("/dataXL")){
			return RestAskPort_E.dataXL(data.get("message"));
		}	
		if(string.equalsIgnoreCase("/dataRN")){
			return RestAskPort_E.dataRN(data.get("message"));
		}	
		if(string.equalsIgnoreCase("/dataCG")){
			return RestAskPort_E.dataCG(data.get("message"));
		}	
		if(string.equalsIgnoreCase("/dataCJ")){
			return RestAskPort_E.dataCJ(data.get("message"));
		}	
		if(string.equalsIgnoreCase("/dataCL")){
			return RestAskPort_E.dataCL(data.get("message"));
		}	
		if(string.equalsIgnoreCase("/dataXX")){
			return RestAskPort_E.dataXX(data.get("message"));
		}	
		if(string.equalsIgnoreCase("/dataHF")){
			return RestAskPort_E.dataHF(data.get("message"));
		}	
		if(string.equalsIgnoreCase("/dataCP")){
			return RestAskPort_E.dataCP(data.get("message"));
		}	
		if(string.equalsIgnoreCase("/dataZF")){
			return RestAskPort_E.dataZF(data.get("message"));
		}	
		if(string.equalsIgnoreCase("/dataZY")){
			return RestAskPort_E.dataZY(data.get("message"));
		}	
		if(string.equalsIgnoreCase("/dataXY")){
			return RestAskPort_E.dataXY(data.get("message"));
		}	
		if(string.equalsIgnoreCase("/dataYT")){
			return RestAskPort_E.dataYT(data.get("message"));
		}	
		if(string.equalsIgnoreCase("/dataZT")){
			return RestAskPort_E.dataZT(data.get("message"));
		}	
		if(string.equalsIgnoreCase("/dataXT")){
			return RestAskPort_E.dataXT(data.get("message"));
		}	
		return "";
	}

	public static String getCode(String filePath) throws IOException{
		if(filePath.contains(".html")||filePath.contains(".js")){
			return "UTF-8";
		}
		return "GBK";
	}

	public static String getFilePath(String string) {
		String root = new File("src/main/resources/static").getAbsolutePath().replace("\\", "/");
		if(null==string||string.equalsIgnoreCase("")||string.equalsIgnoreCase("/")){
			string = "/index.html";
		}
		return root + string;
	}
}