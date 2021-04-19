package OSI.OSU.ASQ.PSU.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import OSI.OSU.ASQ.PSU.OCI.engine.analysis.Analyzer;
import OSI.OSU.ASQ.PSU.OEI.engine.analysis.imp.CogsBinaryForestAnalyzerImp;
import OSI.OSU.ASQ.PSU.view.obj.WordFrequency;

import static java.lang.System.*;

@SuppressWarnings("unused")
public class DemoPOSMedcine {
    public static void main(String[] args) throws IOException {
        Analyzer analyzer = new CogsBinaryForestAnalyzerImp();
        analyzer.init();
        Map<String, String> nlp = analyzer.getPosCnToCn();
        List<String> sets = new ArrayList<>();
        String[] ss = new String[1];
        String[] ss1 = new String[1];
        ss[0] = "";
        ss1[0] = "";
        //ss1[0] = "�� ��ĸ �������ĸ"; 

        for (int i = 0; i < ss.length; i++) {
            System.out.println("������̬���Ӳ���-->" + ss[i]);
            Map<String, WordFrequency> map = analyzer.parserMixStringByReturnFrequencyMap(
            		ss[0]
					);
            out.print("����������ʵ���-->");
            Iterator<String> it = map.keySet().iterator();
            while(it.hasNext()) {
            	 out.println(it.next());
            }
        }
    }
}