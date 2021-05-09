package test.update;

import OSI.AOP.MS.VPC.S.hall.DatabaseLogHall;
import OSI.OPE.MSV.PCS.controller.RequestFilterController;
import OSI.OPE.VPC.VQS.DSU.utils.DetaDBUtil;
import OSI.OPE.VPC.VQS.DSU.utils.DetaUtil;
import OSV.ESU.standard.UpdateCellStandard;

public class TestUpdatePLSQL{
	public static void main(String[] argv) throws Exception {
		//init
		DetaUtil.initDB();
		System.out.println("----����VPCS���ݿ������DMAȷ��:�ɹ���");
		RequestFilterController.initBlockList();
		System.out.println("----����VPCS���ݿ������IP���˷�������:�ɹ���");
		OSI.OPE.MS.OP.SM.AOP.MEC.SIQ.cache.DetaDBBufferCacheManager.reflection();
		System.out.println("----����VPCS���ݿ�����������������ӳ�����:�ɹ���");
		DatabaseLogHall.createBinLogHall();
		System.out.println("----����VPCS���ݿ�����������������ӳ�����:�ɹ���");
		DetaDBUtil.initCulumnNameType();
		//
		//String tabKey, String rowId, String cellName, String cellValue
		//UpdateCellStandard.UpdateCellPLSQL("gjjd", "5", "����", "222");
		UpdateCellStandard.UpdateCellORM("gjjd", "5", "����", "222");
	}
}