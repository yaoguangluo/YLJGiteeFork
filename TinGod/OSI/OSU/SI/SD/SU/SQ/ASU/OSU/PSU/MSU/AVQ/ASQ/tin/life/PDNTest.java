package OSI.OSU.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.tin.life;

import java.awt.HeadlessException;

import javax.swing.JFrame;

import biProcessor.coDNAAuthorForWord;

public class PDNTest{
	public static void main(String[] argv) throws InterruptedException {
		Application application= new Application();
		application.init();
		try {
			coDNAAuthorForWord app = null;
			try {
				app= new coDNAAuthorForWord(null, null, null);
				app.setSize(850, 400);
				app.setVisible(true);
				JFrame f= new JFrame();
				f.add(app);
				f.setTitle("DNA��ά�۲�");
				f.setLocationRelativeTo(null);
				f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				f.setSize(650,480);
				f.setVisible(true);
				//app.bootZynkFlowerForest("DNA��ά�۲�", DNNtext, true);
				app.bootDNAFlowerForest("DNA��ά�۲�", application, true);
				//application
			} catch (HeadlessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}   
		//	close = false;
			
		}catch(Exception e) {
		}
	}
}