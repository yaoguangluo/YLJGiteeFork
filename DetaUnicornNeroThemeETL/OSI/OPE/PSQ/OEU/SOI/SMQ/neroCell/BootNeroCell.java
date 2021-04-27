package OSI.OPE.PSQ.OEU.SOI.SMQ.neroCell;

import java.awt.Color;
import java.awt.Dimension;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JTextPane;

import OSI.OPE.AOPM.VECS.IDUQ.OVU.PQE.flash.ThisCanvas;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkNode;
import OSI.OPE.SI.MCI.OEI.OVU.PQE.extOSGI.OSGI_chansfer;
public class BootNeroCell{
	public static void bootCell(LinkNode linkNode, JTextPane rightBotJTextPane, ThisCanvas canvas) 
			throws IOException, UnsupportedAudioFileException, InterruptedException {
		Map<String, LinkNode> bootMaps= new HashMap<>();
		LinkNode currentNode= linkNode;
		while(null!= currentNode) {
			bootMaps.put(currentNode.primaryKey, currentNode);
			currentNode= currentNode.next;
		}
		Map<String, Boolean> bootedMaps= new HashMap<>();
		//׼��д����������������������ȸ����°汾 1.0.3_beta, �⼸�����ơ�20190617 8��28 ������
		Iterator<String> iterator;
		while(0< bootMaps.size()) {
			iterator= bootMaps.keySet().iterator();
			Here:
				while(iterator.hasNext()) {
					currentNode= bootMaps.get(iterator.next());
					if(bootedMaps.containsKey(currentNode.primaryKey)) {
						continue Here;
					}
					if(currentNode.tBeconnect&& !bootedMaps.containsKey(currentNode.tBeconnectPrimaryKey)) {
						continue Here;
					}
					if(currentNode.mBeconnect&& !bootedMaps.containsKey(currentNode.mBeconnectPrimaryKey)) {
						continue Here;
					}
					if(currentNode.dBeconnect&& !bootedMaps.containsKey(currentNode.dBeconnectPrimaryKey)) {
						continue Here;
					}
					if(null!= currentNode.thisFace&& currentNode.thisFace.isConfiged) {
						//���ûظ�
						currentNode.thisFace.memoryRecovery(rightBotJTextPane);
						//ȡֵ
						new OSGI_chansfer(currentNode, linkNode);
						//����
						currentNode.thisFace.OPE_E(rightBotJTextPane);
						bootedMaps.put(currentNode.primaryKey, true);
						bootMaps.remove(currentNode.primaryKey);
					}else {
						//��û�������쳣������������壻
						currentNode.thisFace.MEI_MSU(rightBotJTextPane, canvas);
						currentNode.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.setLocation(currentNode.x
								, currentNode.y);
						currentNode.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.setSize(300, 300);
						currentNode.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.setResizable(true);
						currentNode.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.scrollPane.setBounds(0, 0
								, currentNode.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.getWidth()-10
								, currentNode.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.getHeight()-45);
						currentNode.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.panel.setPreferredSize(
								new Dimension(800, 600));
						currentNode.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.setBackground(Color.BLUE);
						currentNode.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.setVisible(true);
						currentNode.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.validate();
						return;
					}
				}
		}
	}
}