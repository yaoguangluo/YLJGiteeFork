package OSI.OSU.VPC.S.hallKeeper;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.swing.JTextPane;

import OSI.OSU.AOPM.VECS.IDUQ.OVU.PQE.flash.ThisCanvas;
import OSI.OSU.OVU.MVQ.OVU.PQE.nodeView.NodeShow;
import OSI.OSU.OVU.MVU.OVU.PQE.nodeEdit.LinkList;
import OSI.OSU.PSQ.OEU.SOI.SMQ.neroCell.BootNeroDoc;
import OSI.OSU.VPC.S.sets.Sets;
import OSI.OSU.VPC.S.skivvy.Skivvy;
import OSI.OSU.VPC.S.vision.Pillow;
import OSI.OSU.VPC.S.vision.Vision;
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