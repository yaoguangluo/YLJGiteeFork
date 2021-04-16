package OSI.OSU.SI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addXYWKBook;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import javax.swing.*;

import org.ASQ.PSU.OCI.tinos.engine.analysis.Analyzer;

import ME.sample.App;
import OSI.OSU.AOPM.VECS.IDUQ.GUI.flash.ThisCanvas;
import OSI.OSU.OEQ.MCQ.GUI.OSGI.*;

public class addXYWKBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI extends OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI{	
	public addXYWKBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI() throws IOException{
		thisIcon= new ImageIcon(this.getClass().getResource("addXYWKBook.jpg"));
		SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("������ҽ���");
		AMV_MVS_VSQ= new String("MEDCINE");
		Image img= ((ImageIcon) thisIcon).getImage();
		Image newimg= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisImage= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisIcon= new ImageIcon(newimg);
		//
	}
	
	public addXYWKBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(Object[][] tableData_old, JTextPane text, App u
			, Analyzer analyzer, Map<String, String> pos) throws IOException{
		this.text= text;
		this.tableData_old= tableData_old;
		thisIcon= new ImageIcon(this.getClass().getResource("addXYWKBook.jpg"));
		SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("������ҽ���");
		AMV_MVS_VSQ= new String("MEDCINE");
		Image img= ((ImageIcon) thisIcon).getImage();
		Image newimg= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisImage= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisIcon= new ImageIcon(newimg);
		//
		this.u= u;
		this.analyzer= analyzer;
		this.pos= pos;
	}
	public void MEI_MSU(JTextPane jTextPane, ThisCanvas canvas) throws IOException{
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ= new addXYWKBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ();
		SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI= new addXYWKBookOSU_MSQ_OPE_OPC_ECI();
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES= new addXYWKBookOSU_MSQ_AOI_AOD_AOU_AOQ_VES((addXYWKBookOSU_MSQ_OPE_OPC_ECI) SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI, this.text, this.tableData_old);
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.config();
		showed= false;
	}
	public void IMP_PSU() throws IOException {
		dictionary d= new dictionary();
		u.wkxPage.dic_list= d.txtToList();
		u.wkxPage.dic_map = d.listToMap(u.wkxPage.dic_map, u.wkxPage.dic_list);
		u.wkxPage.dic_xj = d.mapToMap_xj(u.wkxPage.dic_map);
		Iterator<String> iter= u.wkxPage.dic_xj.keySet().iterator();
		u.wkxPage.copy_xj= new ArrayList<String>();
		while (iter.hasNext()) {
			u.wkxPage.copy_xj.add(iter.next());
		}
		tableData_old = new Object[u.wkxPage.dic_xj.size()][18];
		for(int i= 0; i< u.wkxPage.dic_xj.size(); i++) {
			tableData_old[i]= new Object[]{""+ (i+ 1)
					, ""+ 0
					, u.wkxPage.copy_xj.get(i).trim()
					, u.wkxPage.dic_xj.get(u.wkxPage.copy_xj.get(i)).toString().replaceAll("\\s*", "")
			};
		}	
		u.wkxPage.newTableModel.getDataVector().clear();
		for(int i= 0; i< tableData_old.length; i++) {
			u.wkxPage.newTableModel.insertRow(i, tableData_old[i]);
		}
		u.wkxPage.tableData_old= tableData_old;
		u.wkxPage.newTableModel.fireTableDataChanged();
		u.wkxPage.revalidate();
	}
	
	public void OPE_E(JTextPane jTextPane) throws FileNotFoundException, IOException{	
		((addXYWKBookOSU_MSQ_OPE_OPC_ECI) SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI).run((addXYWKBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ);
	}
	public void AVQ_ASQ_OVQ_OSQ_VSQ(JTextPane jTextPane)  throws Exception{
		((addXYWKBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).analyzer= analyzer;
		((addXYWKBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).u= u;
		((addXYWKBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).pos= pos;
		((addXYWKBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).DNNtext= ((addXYWKBookOSU_MSQ_AOI_AOD_AOU_AOQ_VES) SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES).DNNtext;
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.view();
		showed = true;
	}
	public OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI AOP_MVE_CSI_DUQ() throws CloneNotSupportedException, IOException{
		SQ_OSU_MSQ_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI = new addXYWKBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(this.tableData_old, this.text, this.u, this.analyzer, this.pos);   
		return SQ_OSU_MSQ_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI;  
	}
}