package OSI.OSU.AOP.MEC.SIQ.pletl;
import java.io.File;
import java.util.HashMap;
import javax.swing.JTextPane;

import OSI.OSU.MSQ.sets.stable.StableData;
import OSI.OSU.OEI.PVI.SOI.SMQ.load.LoadFile;
import OSI.OSU.OVU.MVQ.OVU.PQE.nodeView.NodeShow;
import OSI.OSU.OVU.MVU.OVU.PQE.nodeEdit.LinkList;
import OSI.OSU.OVU.MVU.OVU.PQE.nodeEdit.LinkNode;
import OSI.OSU.PSQ.OEU.document.neroCell.BootNeroCell;
public class PLETLImpl implements PLETLIntef{
	@Override
	public boolean doNeroFlow(JTextPane rightBotJTextPane, NodeShow nodeView, LinkList first
			, String documentFlowAddress, HashMap<String, Object> inputMap) {
		//�ܺõĽ� ������socket plsql���ݿ⡷ �� ������ ETL������Եļ���ͼ���������ϡ�
		//�𼱣���������Ȼû��������ʶ�������Ѿ��γ���VPCS������Ԫ�ĵ��� ׶�Ρ�20200322 ������ 
		try {
			String fileCurrentpath= documentFlowAddress;
			File file= new File(fileCurrentpath);
			if(!file.isFile()) {
				System.out.println(StableData.ATTENSION_RECHOICE);
				return false;
			}
			LinkNode needDeleteNode= first.first;
			while(needDeleteNode!= null) {
				first.first= first.deletNode(first.first, needDeleteNode.name
						, needDeleteNode.ID, needDeleteNode.primaryKey);
				if(null== needDeleteNode.next) {
					break;
				}
				needDeleteNode= needDeleteNode.next;
			}
			first.first= LoadFile.Load(first.first, nodeView, file, first);
			BootNeroCell.bootCell(first.first, rightBotJTextPane, null);
		} catch(Exception loadE) {
			loadE.printStackTrace();
		}
		return true;
	}
	//�����
}