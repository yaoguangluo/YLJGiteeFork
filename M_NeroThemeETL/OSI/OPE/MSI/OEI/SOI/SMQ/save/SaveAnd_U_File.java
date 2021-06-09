package OSI.OPE.MSI.OEI.SOI.SMQ.save;

import java.io.File;
import java.io.FileWriter;

import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkNode;

public class SaveAnd_U_File{
	public static void update(String fileCurrentpath, LinkNode first) {
		//delete file 
		File file= new File(fileCurrentpath);
		if(file.exists()&& file.isFile()) {
			file.delete();
		}
		//save
		String fileSavepath= fileCurrentpath;
		System.out.println(fileSavepath);
		//create file and save
		try {
			FileWriter fileWriter= new FileWriter(fileSavepath);
			LinkNode node= first;
			while(null!= node) {
				//����ȡ��û�Ѷȡ��������Ϣд���ļ���
				//�ڵ����꣬�ڵ����� �ڵ������
				String NodeCoordinationX= ""+ node.x;
				String NodeCoordinationY= ""+ node.y;
				String NodeName= ""+ node.name;
				String NodeID=""+ node.ID;
				String flash=""+ node.flash;
				String beconnect= ""+ node.beconnect;
				String leftChoose= ""+ node.leftChoose;
				String rightChoose= ""+ node.rightChoose;
				String tBeconnect= ""+ node.tBeconnect;
				String tBeconnectX= ""+ node.tBeconnectX;
				String tBeconnectY= ""+ node.tBeconnectY;
				String tBeconnetName= ""+ node.tBeconnetName;
				String tBeconnectID= ""+ node.tBeconnectID;
				String tBeconnectPrimaryKey= ""+ node.dBeconnectPrimaryKey;
				String mBeconnect= ""+ node.mBeconnect;
				String mBeconnectX= ""+ node.mBeconnectX;
				String mBeconnectY= ""+ node.mBeconnectY;
				String mBeconnetName= ""+ node.mBeconnetName;
				String mBeconnectID= ""+ node.mBeconnectID;
				String mBeconnectPrimaryKey= ""+ node.mBeconnectPrimaryKey;
				String dBeconnect= ""+ node.dBeconnect;
				String dBeconnectX= ""+ node.dBeconnectX;
				String dBeconnectY= ""+ node.dBeconnectY;
				String dBeconnetName= ""+ node.dBeconnetName;
				String dBeconnectID= ""+ node.dBeconnectID;
				String dBeconnectPrimaryKey= ""+ node.dBeconnectPrimaryKey;
				String primaryKey= ""+ node.primaryKey;
				String nodeConfiguration= ""+ node.thisFace.nodeConfiguration;
				String isConfiged= ""+ node.thisFace.isConfiged;
				String isExecuted= ""+ node.thisFace.isExecuted;
				//����
				fileWriter.write("\r\n");
				fileWriter.write("NodeCoordinationX:"+ NodeCoordinationX);
				fileWriter.write("\r\n");
				fileWriter.write("NodeName:"+ NodeName);
				fileWriter.write("\r\n");
				fileWriter.write("NodeCoordinationY:"+ NodeCoordinationY);
				fileWriter.write("\r\n");
				fileWriter.write("NodeID:"+ NodeID);
				fileWriter.write("\r\n");
				fileWriter.write("flash:"+ flash);
				fileWriter.write("\r\n");
				fileWriter.write("beconnect:"+ beconnect);
				fileWriter.write("\r\n");
				fileWriter.write("leftChoose:"+ leftChoose);
				fileWriter.write("\r\n");
				fileWriter.write("rightChoose:"+ rightChoose);
				fileWriter.write("\r\n");
				fileWriter.write("tBeconnect:"+ tBeconnect);
				fileWriter.write("\r\n");
				fileWriter.write("tBeconnectX:"+ tBeconnectX);
				fileWriter.write("\r\n");
				fileWriter.write("tBeconnectY:"+ tBeconnectY);
				fileWriter.write("\r\n");
				fileWriter.write("tBeconnetName:"+ tBeconnetName);
				fileWriter.write("\r\n");
				fileWriter.write("tBeconnectID:"+ tBeconnectID);
				fileWriter.write("\r\n");
				fileWriter.write("tBeconnectPrimaryKey:"+ tBeconnectPrimaryKey);
				fileWriter.write("\r\n");
				fileWriter.write("mBeconnect:"+ mBeconnect);
				fileWriter.write("\r\n");
				fileWriter.write("mBeconnectX:"+ mBeconnectX);
				fileWriter.write("\r\n");
				fileWriter.write("mBeconnectY:"+ mBeconnectY);
				fileWriter.write("\r\n");
				fileWriter.write("mBeconnetName:"+ mBeconnetName);
				fileWriter.write("\r\n");
				fileWriter.write("mBeconnectID:"+ mBeconnectID);
				fileWriter.write("\r\n");
				fileWriter.write("mBeconnectPrimaryKey:"+ mBeconnectPrimaryKey);
				fileWriter.write("\r\n");
				fileWriter.write("dBeconnect:"+ dBeconnect);
				fileWriter.write("\r\n");
				fileWriter.write("dBeconnectX:"+ dBeconnectX);
				fileWriter.write("\r\n");
				fileWriter.write("dBeconnectY:"+ dBeconnectY);
				fileWriter.write("\r\n");
				fileWriter.write("dBeconnetName:"+ dBeconnetName);
				fileWriter.write("\r\n");
				fileWriter.write("dBeconnectID:"+ dBeconnectID);
				fileWriter.write("\r\n");
				fileWriter.write("dBeconnectPrimaryKey:"+ dBeconnectPrimaryKey);
				fileWriter.write("\r\n");
				fileWriter.write("primaryKey:"+ primaryKey);
				fileWriter.write("\r\n");
				fileWriter.write("nodeConfiguration:"+ nodeConfiguration);
				fileWriter.write("\r\n");
				fileWriter.write("isConfiged:"+ isConfiged);
				fileWriter.write("\r\n");
				fileWriter.write("isExecuted:"+ isExecuted);
				fileWriter.write("\r\n");
				//�ָ�
				String split="##############################";
				fileWriter.write("\r\n");
				fileWriter.write(split);
				fileWriter.flush();
				if(null== node.next) {
					break;
				}
				node= node.next;
			}	
			fileWriter.close();
		}catch(Exception saveFile) {

		}
	}
}