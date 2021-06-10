package MSV.OSU.date;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

import ESU.stable.Stable;
//refer www.bjtime.com �� 12��13��14�� ������
//ע�����bjtime ��վ�ر���������ܣ��ú�������Ч�����ٻ��������������ṩʱ��У�����ַ��
public class DateValidation{
	public static boolean currentSystemTimeCheck(long offsetUTC8
			, long miliSecondsDistinction) throws IOException {
		URL url= new URL(Stable.STRING_BJTIME);
		URLConnection uRLConnection= url.openConnection();
		uRLConnection.connect();
		long bjtime= uRLConnection.getDate();
		long system= currentSystemTimeToUTC(offsetUTC8);
		if(miliSecondsDistinction< Math.abs(bjtime- system)) {
			return false;
		}
		return true;	
	}

	public static long currentSystemTimeToUTC(long offsetUTC8) {
		return new Date().getTime()+ offsetUTC8;
	}
}