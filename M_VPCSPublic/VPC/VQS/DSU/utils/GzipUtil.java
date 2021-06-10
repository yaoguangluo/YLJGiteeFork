package VPC.VQS.DSU.utils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
public class GzipUtil {
	// ѹ��
	public static byte[] compress(byte[] data) throws IOException {
		if (data == null || data.length == 0) {
			return null;
		}
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		GZIPOutputStream gzip = new GZIPOutputStream(out);
		gzip.write(data);
		gzip.finish();
		gzip.close();
		byte[] ret = out.toByteArray();
		out.close();
		return  ret;//out.toString("ISO-8859-1");
	}

	public static byte[] compress(String str, String stringTypes) throws IOException {
		if (str == null || str.length() == 0) {
			return null;
		}
		return compress(str.getBytes(stringTypes));
	}

	public static byte[] uncompress(byte[] data) throws IOException {
		if (data == null || data.length == 0) {
			return data;
		}
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		ByteArrayInputStream in = new ByteArrayInputStream(data);
		GZIPInputStream gunzip = new GZIPInputStream(in);
		byte[] buffer = new byte[256];
		int n;
		while ((n = gunzip.read(buffer)) >= 0) {
			out.write(buffer, 0, n);
		}
		gunzip.close();
		in.close();
		return out.toByteArray();
	}
}
//apache 2.0: refer GZIP �ٷ�ѹ�� demo
//����refer ������ ����.
//--------------------- 
//���ߣ�������i ,�����������������
//��Դ��CSDN 
//ԭ�ģ�https://blog.csdn.net/qq_18895659/article/details/72190322 
//��Ȩ����������Ϊ����ԭ�����£�ת���븽�ϲ������ӣ�