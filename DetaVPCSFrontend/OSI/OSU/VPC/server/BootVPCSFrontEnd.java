package OSI.OSU.VPC.server;
import java.io.IOException;

import ME.sample.App;
import OSI.OSU.VPC.controller.ServerInitControllerVPCSFrontEnd;
//VPCS���Ϻ�����, �Ժ��Ż�.
public class BootVPCSFrontEnd extends Thread{
	private App app;
	public BootVPCSFrontEnd(App app) {
		this.app= app;
	}
	public static void main(String[] args) throws IOException {
		new BootVPCSFrontEnd(null).bootFrontEnd();
	}
	public void bootFrontEnd() throws IOException {
		new ServerInitControllerVPCSFrontEnd().initServer(this.app);
	}
	public void run() {
		try {
			new ServerInitControllerVPCSFrontEnd().initServer(this.app);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}