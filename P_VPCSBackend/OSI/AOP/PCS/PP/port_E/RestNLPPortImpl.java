package OSI.AOP.PCS.PP.port_E;
import PEQ.AMV.ECS.test.ANNTest;
import PEQ.AMV.ECS.test.DNNTest;
import PEQ.AMV.ECS.test.RNN_IDETest;
import PEQ.AMV.ECS.test.SensingTest;
import PEQ.OPM.VEC.test.SuccessICATest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import AEU.AVC.SUQ.engine.LenovoInit;
import AEU.OCI.AVC.SUQ.estimation.C.EmotionSample;
import AEU.OPM.VEC.ica.InitBehaviorICAKernel;
import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import MSV.OSQ.sets.DetaDouble;
import OCI.AVC.SUQ.SVQ.MPC.fhmm.C.EmotionMap;
import OCI.ME.analysis.C.A;
import OEU.LYG4DQS4D.Quick_7D_luoyaoguang_Sort;
public class RestNLPPortImpl{// implements RestLoginPort {
	public static Map<String, Object> dataWS(A _A, String string) throws IOException {
		//System.out.printntln(string);
		//List<String> sets = _A.parserString(string);
		List<String> sets = _A.parserMixedString(string);
		Map<String, Object> output = new HashMap<>();
		String ws="";
		Iterator<String> iterator=sets.iterator();
		while(iterator.hasNext()) {
			String token=iterator.next();
			ws += token+" ";
		}
		output.put(URLEncoder.encode("ws","UTF-8"), URLEncoder.encode(ws,"UTF-8"));
		return output;
	}

	public static Map<String, Object> dataCX(A _A, String string) throws UnsupportedEncodingException {
		//System.out.printntln(string);
		Map<String, String> pos = _A.getPosCnToCn();
		List<String> sets = _A.parserString(string);
		Iterator<String> iterator = sets.iterator();
		String cx = "";
		while(iterator.hasNext()) {
			String token=iterator.next();
			if(pos.containsKey(token)) {
				cx += token + "/"+pos.get(token)+" ";
			}
		}
		Map<String, Object> outputMap = new HashMap<>();
		outputMap.put(URLEncoder.encode("cx","UTF-8"), URLEncoder.encode(cx,"UTF-8"));
		return outputMap;
	}

	public static Map<String, Object> dataCY(A _A, String string) throws IOException {
		//System.out.printntln(string);
		LenovoInit lenovoInit = new LenovoInit();
		lenovoInit.initExcludeAnalyzer(string, _A);	
		Map<String, EmotionSample> environmentSampleMap = lenovoInit.getEnvironmentInit().getEmotionSampleMap();
		Map<String, Object> lenovo = lenovoInit.getSensingMap().getLenovoMap();
		Map<String, Object> output = new HashMap<>();
		List<String> ciyi = new LinkedList<>();
		ciyi.add("\r\n��    ����");
		Iterator<String> Iterator = environmentSampleMap.keySet().iterator();
		while(Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample= environmentSampleMap.get(word);
			if(null != emotionSample.getDistinction()) {
				if(lenovo.containsKey(emotionSample.getDistinction())) {
					//System.out.printnt(lenovo.get(emotionSample.getDistinction()).toString()+" ");
					ciyi.add(lenovo.get(emotionSample.getDistinction()).toString()+" ");
				}else {
					//System.out.printnt(emotionSample.getDistinction()+" ");
					ciyi.add(emotionSample.getDistinction()+" ");
				}
			}
		}
		ciyi.add("\r\n��������");
		Iterator = environmentSampleMap.keySet().iterator();
		while(Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = environmentSampleMap.get(word);
			if(null != emotionSample.getMotivation()) {
				if(lenovo.containsKey(emotionSample.getMotivation())) {
					//System.out.printnt(lenovo.get(emotionSample.getMotivation()).toString()+" ");
					ciyi.add(lenovo.get(emotionSample.getMotivation()).toString()+" ");
				}else {
					//System.out.printnt(emotionSample.getMotivation()+" ");
					ciyi.add(emotionSample.getMotivation()+" ");
				}
			}
		}
		ciyi.add("\r\n����̽��");
		Iterator = environmentSampleMap.keySet().iterator();
		while(Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = environmentSampleMap.get(word);
			if(null != emotionSample.getTrending()) {
				if(lenovo.containsKey(emotionSample.getTrending())) {
					ciyi.add(lenovo.get(emotionSample.getTrending()).toString()+" ");
				}else {
					ciyi.add(emotionSample.getTrending()+" ");
				}
			}
		}
		ciyi.add("\r\n�����ھ�");
		Iterator = environmentSampleMap.keySet().iterator();
		while(Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = environmentSampleMap.get(word);
			if(null != emotionSample.getPrediction()) {
				if(lenovo.containsKey(emotionSample.getPrediction())) {
					ciyi.add(lenovo.get(emotionSample.getPrediction()).toString()+" ");
				}else {
					ciyi.add(emotionSample.getPrediction()+" ");
				}
			}
		}
		String cy = "";
		Iterator<String> iterator = ciyi.iterator();
		while(iterator.hasNext()) {
			cy += iterator.next() + " ";
		}
		output.put(URLEncoder.encode("cy", "UTF-8"), URLEncoder.encode(cy, "UTF-8"));
		return output;
	}

	public static Map<String, Object> dataCG(A _A, String string) throws InstantiationException
	, IllegalAccessException, IOException {
		//System.out.printntln(string);
		SensingTest sensingTest = _A.getSensingTest();
		DNNTest dNNTest= new DNNTest();
		ANNTest aNNTest= new ANNTest();
		String[][] ann= aNNTest.getANNMatrix(sensingTest, string, _A);
		String[][] dnn= dNNTest.getDNNMatrix(sensingTest, ann, _A, string);
		Map<String, Object> output = new HashMap<>();
		List<String> cigan = new LinkedList<>();
		Here:
		for(int i=0; i<dnn.length; i++) {
			double dnn_lwa = 0;
			if(null == dnn[i][3]) {
				continue Here;
			}
			dnn_lwa = DetaDouble.parseDouble(dnn[i][3]);
			if(dnn_lwa>0) {
				String line="";
				line+=ann[i][0] + ":";
				line+=dnn[i][3] + ":";
				cigan.add(line);
			}
		}
		String[][] value = new String[cigan.size()][2];
		Iterator<String> iterator = cigan.iterator();
		int count = 0;
		while(iterator.hasNext()) {
			String iteratorString = iterator.next();
			value[count][0] = iteratorString.split(":")[0];
			value[count++][1] = iteratorString.split(":")[1];
		}
		//value = new Quick_6D_luoyaoguang_Sort().sort(value);
		value = new Quick_7D_luoyaoguang_Sort().sort(value);
		String cg= "����/����";
	    cg+= "\r\n";
		for(int i = 0; i<value.length; i++) {
			cg += value[i][0] + ":" + value[i][1] + "\r\n";
		}
		output.put(URLEncoder.encode("cg", "UTF-8"), URLEncoder.encode(cg, "UTF-8"));
		return output;
	}

	public static Map<String, Object> dataCJ(EmotionMap emotionMap, A _A, String string) throws IOException {
		//System.out.printntln(string);
		double[][] kernel = new double[1][];
		InitBehaviorICAKernel InitBehaviorICAKernel = new InitBehaviorICAKernel();
		kernel[0] = InitBehaviorICAKernel.getBehaviorICAKernel(string, _A, emotionMap);
		SuccessICATest successICATest=new SuccessICATest();
		successICATest.getKernelCNN(kernel);
		Map<String, Object> output = new HashMap<>();
		String cj = "\r\n";
		Iterator<String> iterator = InitBehaviorICAKernel.getForRestReturn().iterator();
		while(iterator.hasNext()) {
			cj += iterator.next() + "\r\n";
		}
		output.put(URLEncoder.encode("cj", "UTF-8"), URLEncoder.encode(cj, "UTF-8"));
		return output;
	}

	public static Map<String, Object> dataCL(A _A, String string) {
		return null;
	}

	public synchronized static Object dataXX(A _A, String string) throws IOException {
		//System.out.printntln(string);
		Map<String, String> pos = _A.getPosCnToCn();
		Map<String, String> studyPos = _A.getStudyPos();
		List<String> sets = _A.parserString(string);
		Iterator<String> iterator = sets.iterator();
		String xx = "";
		String pres = "";
		String study= "";
		String posStudy= "";
		while(iterator.hasNext()) {
			String token = iterator.next();
			if(!pos.containsKey(token)) {
				xx += pres+ "("+token +")";
				xx += "\r\n";
				//ApplicationBoot.luoyaoguang.study(token);
			}else {
				pres = token + "/"+pos.get(token)+" ";
			}
			//record
			int find=0;
			if(pos.containsKey(token)) {
				String posToken= pos.get(token);
				if(pos.containsKey(study)) {
					if(study.length()== 1&& token.length()== 1&& posStudy.equals(posToken)) {
						//write
						if(!pos.containsKey(study+ token)) {
							if(studyPos.containsKey(study)&&studyPos.containsKey(token)) {
								if(studyPos.get(study).contains("��")|| studyPos.get(study).contains("��")|| studyPos.get(study).contains("ʱ")
										|| studyPos.get(study).contains("��")|| studyPos.get(study).contains("��")) {
									_A.studyNewWord(study, token, posStudy);
									String stringFile= "C:/Users/Administrator/git/Deta_Parser/wordSegment/org/tinos/ortho/fhmm/imp/poscc.lyg";
									FileOutputStream fileOutputStream= new FileOutputStream(stringFile, true);
									OutputStreamWriter fileWriter= new OutputStreamWriter(fileOutputStream, "UTF-8");
									fileWriter.write("\r\n"+study+token+"/"+posStudy);
									fileWriter.flush();
									fileWriter.close();	
									studyPos.put(study+token, posStudy);
									posToken= "";
									token= "";
								}
							}						
							pos.put(study+token, posStudy);
						}
					}
				}
				find=1;
				posStudy= posToken.toString();
			}
			study=token;
			if(find==0) {
				posStudy="";
			}
		}
		Map<String, Object> outputMap = new HashMap<>();
		outputMap.put(URLEncoder.encode("xx","UTF-8"), URLEncoder.encode(xx,"UTF-8"));
		return outputMap;
	}

	public static Object dataHF(A _A, String string) throws UnsupportedEncodingException {
		//System.out.printntln(string);
		List<String> sets= _A.parserMixedString(string);
		Map<String, Object> output= new HashMap<>();
		String hf= "";
		Iterator<String> iterator= sets.iterator();
		while(iterator.hasNext()) {
			hf += iterator.next()+ " ";
		}
		output.put(URLEncoder.encode("hf","UTF-8"), URLEncoder.encode(hf,"UTF-8"));
		return output;
	}

	public static Object dataCP(A _A, String string) throws IOException {
		List<String> sets= _A.parserMixedString(string);
		Map<Integer, WordFrequency> fwa = _A.getWordFrequencyByReturnSortMap(sets);
		Map<String, Object> output = new HashMap<>();
		String cp= "";
		for (int i= fwa.size() - 1; i >= 0; i--) {
			cp +=fwa.get(i).getWord() + ":" + fwa.get(i).getFrequency() + "----";
		}
		output.put(URLEncoder.encode("cp","UTF-8"), URLEncoder.encode(cp,"UTF-8"));
		return output;
	}

	public static Object dataZF(A _A, String string) throws UnsupportedEncodingException {
		//System.out.printntln(string);
		List<String> sets= _A.parserMixedString(string);
		Map<String, String> pos= _A.getPosCnToCn();
		String zf= "";
		Iterator<String> iterator= sets.iterator();
		double mingCi= 0;
		double dongCi= 0;
		double mingCiDuo= 0;
		double dongCiDuo= 0;
		double importantCiDuo= 0;
		double importantCi= 0;
		double uninportantCi= 0;
		double uninportantCiDuo= 0;
		double danCi= 0;
		double duoCi= 0;
		double sanCi= 0;
		double siCi= 0;
		while(iterator.hasNext()) {
			String temp= iterator.next();
			if(temp.length()>3) {
				siCi+= 1;
			}else if(temp.length()>2){
				sanCi+= 1;
			}else if(temp.length()>1){
				duoCi+= 1;
			}else{
				danCi+= 1;
			}
			if(pos.containsKey(temp)) {
				if(pos.get(temp).contains("��")) {
					mingCi+= 1;
					if(temp.length()> 1) {
						mingCiDuo+= 1;
					}
				}else if(pos.get(temp).contains("��")) {
					dongCi+= 1;
					if(temp.length()> 1) {
						dongCiDuo+= 1;
					}
				}else if(pos.get(temp).contains("��")||pos.get(temp).contains("ν")||pos.get(temp).contains("��")) {
					importantCi+= 1;
					if(temp.length()> 1) {
						importantCiDuo+= 1;
					}
				}else {
					uninportantCi+= 1;
					if(temp.length()> 1) {
						uninportantCiDuo+= 1;
					}
				}
			}
		}
		zf+= "�ο�����:"+ "\r\n";
		zf+= "����:"+mingCi;
		zf+= "״��:"+dongCi;
		zf+= "����:"+importantCi;
		zf+= "��׺:"+uninportantCi;
		zf+= "�߼�����:"+mingCiDuo;
		zf+= "�߼�״��:"+dongCiDuo;
		zf+= "�߼�����:"+importantCiDuo;
		zf+= "�߼���׺:"+uninportantCiDuo;
		zf+= "\r\n";
		zf+= "��Ҫָ��:"+ "\r\n";
		double pca= (mingCi+ dongCi+ importantCi);
		double zy= (mingCi+ dongCi)/pca;
		zf+= zy+ "\r\n";
		
		zf+= "ɢ������:"+ "\r\n";
		double sy= (0+ importantCi)/pca;
		zf+= sy+ "\r\n";
		
		zf+= "��������:"+ "\r\n";
		double xs= (0+ dongCi)/pca;
		zf+= xs+ "\r\n";
		
		zf+= "��������:"+ "\r\n";
		double yl= (0+ mingCi)/pca;
		zf+= yl+ "\r\n";
		
		zf+= "��������:"+ "\r\n";
		double fx= (0+ uninportantCi)/(1+ pca+ uninportantCi);
		zf+= fx+ "\r\n";
		
		zf+= "ѧϰ����:"+ "\r\n";
		double xx= (0+ duoCi+ sanCi+ siCi)/(1+ danCi+ duoCi+ sanCi+ siCi);
		zf+= xx+ "\r\n";
		
		zf+= "��ѧ����:"+ "\r\n";
		double level= pca/(pca+ uninportantCi);
		zf+= level+ "\r\n";
		
		zf+= "����:"+ "\r\n";
		String pj= "�����������"+(zy<0.20?"һ��":(zy<0.30?"����":(zy<0.40?"����":(zy<0.65?"׿Խ":"�����ױ�"))))+";";
		pj+= "����"+(sy<0.20?"һ��":(sy<0.30?"����":(sy<0.40?"����":(sy<0.65?"׿Խ":"�����ױ�"))))+";";
		pj+= "�̻�"+(xs<0.20?"һ��":(xs<0.30?"����":(xs<0.40?"����":(xs<0.65?"׿Խ":"�����ױ�"))))+";";
		pj+= "����"+(yl<0.20?"һ��":(yl<0.30?"����":(yl<0.40?"����":(yl<0.65?"׿Խ":"�����ױ�"))))+";";
		pj+= "��֯"+(fx<0.20?"һ��":(fx<0.30?"����":(fx<0.40?"����":(fx<0.65?"׿Խ":"�����ױ�"))))+";";
		pj+= "����ˮƽ"+(xx<0.20?"һ��":(xx<0.30?"����":(xx<0.40?"����":(xx<0.65?"׿Խ":"�����ױ�"))))+";";
		pj+= "��ѧ����"+(level<0.20?"һ��":(level<0.30?"����":(level<0.40?"����":(level<0.65?"׿Խ":"�����ױ�"))))+";";
		zf+= pj+ "\r\n";
		Map<String, Object> outputMap = new HashMap<>();
		outputMap.put(URLEncoder.encode("zf","UTF-8"), URLEncoder.encode(zf,"UTF-8"));
		return outputMap;
	}

	public static Object dataXL(A _A, String string) throws IOException, InstantiationException, IllegalAccessException{
		//System.out.printntln(string);
		ANNTest aNNTest= new ANNTest();
		String[][] ann= aNNTest.getANNMatrix(string, _A);
		Map<String, Object> output= new HashMap<>();
		String xl= "����/���/����/��Ȩ/����/����/Ԥ��/����/��ʶ/";
	    xl+= "\r\n";
		for(int i=0;i<ann.length;i++) {
			if(ann[i].length>7) {
				xl+= ann[i][0]+"/";
				for(int j=7;j<ann[i].length;j++) {
					xl+= ann[i][j]+"/";
				}
			}
			xl+="\r\n";
		}
		output.put(URLEncoder.encode("xl", "UTF-8"), URLEncoder.encode(xl, "UTF-8"));
		return output;
	}

	public static Object dataRN(A _A, String string) throws IOException {
		RNN_IDETest rNN_IDETest= new RNN_IDETest();
		String[][] rnn= rNN_IDETest.getIDEMatrixExcludeAnalyzer(_A, string);
		Map<String, Object> output= new HashMap<>();
		String rn= "����/pos����/covex����/euclid����";
	    rn+= "\r\n";
		
		for(int i=0;i<rnn.length;i++) {
			for(int j=0;j<rnn[i].length;j++) {
				rn+= rnn[i][j]+"/";
			}
			rn+= "\r\n";
		}
		output.put(URLEncoder.encode("rn", "UTF-8"), URLEncoder.encode(rn, "UTF-8"));
		return output;
	}

	public static Object dataYL(A _A, String string) throws UnsupportedEncodingException {
		//System.out.printntln(string);
		List<String> sets= _A.parserMixedString(string);
		Map<String, Object> output= new HashMap<>();
		String yl= "";
		Iterator<String> iterator= sets.iterator();
		while(iterator.hasNext()) {
			String token= iterator.next();
			yl+= token+ " ";
		}
		output.put(URLEncoder.encode("yl","UTF-8"), URLEncoder.encode(yl,"UTF-8"));
		return output;
	}
}