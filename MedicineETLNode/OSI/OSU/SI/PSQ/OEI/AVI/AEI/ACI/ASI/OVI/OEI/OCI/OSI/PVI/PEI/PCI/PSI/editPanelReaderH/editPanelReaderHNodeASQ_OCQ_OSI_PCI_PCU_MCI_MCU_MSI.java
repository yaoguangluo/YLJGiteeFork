package OSI.OSU.SI.PSQ.OEI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.editPanelReaderH;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.*;

import OSI.OSU.AOPM.VECS.IDUQ.GUI.Flash.ThisCanvas;
import OSI.OSU.OEQ.MCQ.GUI.OSGI.*;
public class editPanelReaderHNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI extends OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI{	
	public editPanelReaderHNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(JTextPane text) throws IOException{
		this.text = text;
		thisIcon = new ImageIcon(this.getClass().getResource("editPaneReader.jpg"));
		SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS = new String("��ȡ�༭ҳ����������");
		AMV_MVS_VSQ = new String("MEDCINE");
		Image img = ((ImageIcon) thisIcon).getImage();  
		Image newimg = img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisImage = img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisIcon = new ImageIcon(newimg);
	}
	public editPanelReaderHNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI() throws IOException{
		thisIcon = new ImageIcon(this.getClass().getResource("editPaneReader.jpg"));
		SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS = new String("��ȡ�༭ҳ����������");
		AMV_MVS_VSQ = new String("MEDCINE");
		Image img = ((ImageIcon) thisIcon).getImage();  
		Image newimg = img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisImage = img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisIcon = new ImageIcon(newimg);
	}
	public void MEI_MSU(JTextPane rightBotJTextPane, ThisCanvas canvas) throws IOException{
		try {
			SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ = new editPanelReaderHView();
			SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI = new editPanelReaderHRun();
			SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES = new editPanelReaderHPanel((editPanelReaderHRun) SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI, this.text);
			SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.config();
			showed = false;
		}catch(Exception e1) {
			rightBotJTextPane.setText("<��ȡ�༭ҳ����������> �ڵ�����ʧ����ע���Ƿ�������ȷ��");
			rightBotJTextPane.validate();
		} 
	}
	public void OPE_E(JTextPane rightBotJTextPane) throws FileNotFoundException, IOException{
		try {
			((editPanelReaderHRun) SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI).run((editPanelReaderHView) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ);
		}catch(Exception e1) {
			rightBotJTextPane.setText("<��ȡ�༭ҳ����������> �ڵ�����ʧ����ע���Ƿ�������ȷ��");
			rightBotJTextPane.validate();
		} 
	}
	public void AVQ_ASQ_OVQ_OSQ_VSQ(JTextPane rightBotJTextPane) throws Exception{
		try {
			SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.view();
			showed = true;
		}catch(Exception e1) {
			rightBotJTextPane.setText("<��ȡ�༭ҳ����������> �ڵ�鿴ʧ����ע���Ƿ�������ȷ��");
			rightBotJTextPane.validate();
		} 
	}
	public OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI AOP_MVE_CSI_DUQ() throws CloneNotSupportedException, IOException{
		SQ_OSU_MSQ_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI = new editPanelReaderHNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(this.text);   
		return SQ_OSU_MSQ_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI;  
	}
}
