package OSI.OVU.OSU.MSQ.MV.SQ.houghTransform;
import java.io.IOException;

import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.*;
import PEU.P.image.*;
public class HoughTransformRun extends OSU_AVQ_ASQ_OPE_OPC_ECI{
	private static final long serialVersionUID = 1L;
	public int value=0;
	public String filepath;
	public HoughTransformRun( ) throws IOException{	
		super();
	}
	public void run(final HoughTransformView SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ) throws IOException{
		System.out.println("runed"+value); 
		int out[][] = new int[topgin.length][topgin[0].length];
		for (int i = 0; i < topgin.length; i++) {
			for (int j = 0; j < topgin[0].length; j++) {
				out[i][j]=topgin[i][j];
			}
		}		
		RegionGet thisfile =new RegionGet(out);
		int []region=thisfile.new_region;
		HoughTransform ht = new HoughTransform();
		ht.initHTMatrix(out);
		for(int i=1;i<region.length;i++){
			ht.HoughTransformLoop(out,region[i],1);
		}
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.gout=ht.HTMatrix;
	}
}
