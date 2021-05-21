package OSI.OSU.SI.OSQ.PVI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addChuFangPrint;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ME.APM.VSQ.editPane.PrintTest4;
import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.*;

public class AddChuFangPrintRun extends OSU_AVQ_ASQ_OPE_OPC_ECI{
	private static final long serialVersionUID= 1L;
	public int value= 0;
	public String filepath;
	public AddChuFangPrintRun() throws IOException{	
		super();
	}
	public void run(final AddChuFangPrintView SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ) throws IOException{
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.tableout = this.toptablein; 	
		// JTable table = new javax.swing.JTable();
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.tableout.setEnabled(true);		
		//ɾ���հ��� 1 �� 2 ����
		String preAdd = "������ҩ�Ƽ�����������Ȩ��������ӵ�д���Ȩְҵҩʦ���ط���ҩ����ݲ�������޸ġ�лл!";
		preAdd += "\r\n\r\n";
		int k= 0;
		Here:
			for(int i= 0; i< SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.tableout.getRowCount(); i++) {
				preAdd+= SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.tableout.getValueAt(i, 0);
				if(preAdd.isEmpty()|| preAdd.replace(" ", "").length()== 0) {
					continue Here;
				}
				preAdd+= "/";
				preAdd+= SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.tableout.getValueAt(i, 1);
				if(!SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.tableout.getValueAt(i, 1).toString().contains("����")) {
					preAdd += "g";	
				}
				preAdd += ";";
				if(k++ % 2!= 1) {
					preAdd += "\r\n\r\n";
				}else {
					preAdd += "    ";
				}
			}	
		if(preAdd.equalsIgnoreCase("")) {
			return;
		}
		//��ӡ
		String temp= preAdd;
		String[] lines= temp.split("\r\n");
		List<String> trueLines= new ArrayList<>();
		for(int i= 0; i< lines.length; i++) {
			int line_count= lines[i].length()/ 30;
			String[] lineOfStrings= new String[line_count+ 1];
			for(int j= 0; j<= line_count; j++) {
				lineOfStrings[j]= lines[i].substring(j* 30> lines[i].length()? lines[i].length(): j* 30
						, (j+ 1)* 30 > lines[i].length()? lines[i].length(): (j+ 1)* 30);
				trueLines.add(lineOfStrings[j]);
			}
		}
		int page= trueLines.size()/ 46;
		for(int i= 0; i<= page; i++) {
			new PrintTest4(trueLines.subList((i)* 46> trueLines.size()? trueLines.size(): (i)* 46
					, (i+ 1)* 46> trueLines.size()? trueLines.size(): (i+ 1)* 46));
		}
		//
	}
}
