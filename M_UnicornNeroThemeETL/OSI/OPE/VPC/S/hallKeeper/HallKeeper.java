package OSI.OPE.VPC.S.hallKeeper;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.swing.JTextPane;

import OSI.OPE.AOPM.VECS.IDUQ.OVU.PQE.flash.ThisCanvas;
import OSI.OPE.OVU.MVQ.OVU.PQE.nodeView.NodeShow;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkList;
import OSI.OPE.PSQ.OEU.SOI.SMQ.neroCell.BootNeroDoc;
import OSI.OPE.VPC.S.V.Pillow;
import OSI.OPE.VPC.S.V.Vision;
import OSI.OPE.VPC.S.sets.Sets;
import OSI.OPE.VPC.S.skivvy.Skivvy;
public class HallKeeper{
	public static Map<Long, BootNeroDoc> hallKeeper;
	public static void vpcsRegister(LinkList first, String fileCurrentpath, NodeShow nodeView
			, JTextPane rightBotJTextPane, ThisCanvas canvas) {
		if(null== hallKeeper) {
			hallKeeper= new ConcurrentHashMap<>();
		}
		
		if(200> hallKeeper.size()) {
			try {
				BootNeroDoc bootNeroDoc= new BootNeroDoc(first, fileCurrentpath, nodeView
						, rightBotJTextPane, canvas);
				Sets.register(bootNeroDoc.getId());//sets ��sleeper����ʱ��������Է�����������ݡ�
				Pillow.register(bootNeroDoc);//pillow����Щ���ݵķ���洢��
				Vision.registerVision(bootNeroDoc);//vision��sleeper���еľ����ξ���
				hallKeeper.put(bootNeroDoc.getId(), bootNeroDoc);
				bootNeroDoc.start();
			}catch(Exception e) {
				Skivvy.working(hallKeeper, e);//skivvy����vision�� pillow��sets��sleeper ȫ�̹���ͷ�����
			}
		}
	}
}