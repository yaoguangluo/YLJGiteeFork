package OSI.OSU.MSQ.ASU.OSU.PSU.MSU.AVQ.ASQ.OPE.xlsReaderNode;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.*;

import OSI.OPE.AOPM.VECS.IDUQ.OVU.PQE.flash.ThisCanvas;
import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.*;
public class XlsReaderNodeInterface extends OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI{	
	public XlsReaderNodeInterface() throws IOException{
		thisIcon = new ImageIcon(this.getClass().getResource("image.jpg"));
		SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS = new String("XlsReader");
		AMV_MVS_VSQ = new String("BI");
		Image img = ((ImageIcon) thisIcon).getImage();  
		Image newimg = img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisImage = img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisIcon = new ImageIcon(newimg);
 	}
	//config Ԫ���ڵ�����// ��Ϊ �ڵ���¼���cavas����Ϣ���� ��validation, �Ѿ����ɵĽڵ㶼������.
	public void MEI_MSU(JTextPane jTextPane, ThisCanvas canvas) throws IOException {
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ = new XlsReaderOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ();
		SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI = new XlsReaderOSU_MSQ_OPE_OPC_ECI();
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES = new XlsReaderOSU_MSQ_AOI_AOD_AOU_AOQ_VES((XlsReaderOSU_MSQ_OPE_OPC_ECI) SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI);
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.config();
		showed = false;
	}
	//execute Ԫ���ڵ�ִ��
	public void OPE_E(JTextPane jTextPane) throws FileNotFoundException, IOException{
		((XlsReaderOSU_MSQ_OPE_OPC_ECI) SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI).run((XlsReaderOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ);
	}
	//execute Ԫ���ڵ����
	public void AVQ_ASQ_OVQ_OSQ_VSQ(JTextPane jTextPane)  throws Exception{
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.view();
		showed=true;
	}
	//execute Ԫ���ڵ㸴��
	public OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI AOP_MVE_CSI_DUQ() throws CloneNotSupportedException, IOException {  
	        SQ_OSU_MSQ_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI = new XlsReaderNodeInterface();   
	        //this.MEI_MSU(null, null);
	        return SQ_OSU_MSQ_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI;  
	}
}
