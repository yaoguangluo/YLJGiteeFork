package OSI.OSU.LYG.vpcs.hallKeeper;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.swing.JTextPane;

import OSI.OSU.AOPM.VECS.IDUQ.GUI.flash.ThisCanvas;
import OSI.OSU.LYG.vpcs.sets.Sets;
import OSI.OSU.LYG.vpcs.skivvy.Skivvy;
import OSI.OSU.LYG.vpcs.vision.Pillow;
import OSI.OSU.LYG.vpcs.vision.Vision;
import OSI.OSU.OVU.MVQ.GUI.nodeView.NodeShow;
import OSI.OSU.OVU.MVU.GUI.nodeEdit.LinkList;
import OSI.OSU.PSQ.OEU.document.neroCell.BootNeroDoc;
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