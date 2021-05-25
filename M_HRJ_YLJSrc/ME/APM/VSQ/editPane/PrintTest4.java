package ME.APM.VSQ.editPane;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.print.Book;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.List;
public class PrintTest4 implements Printable{
	private Object[] prePrint;
	public PrintTest4(List<String> string) {
		prePrint = string.toArray();
		//ͨ���������顢�ĵ�
		Book book = new Book();
		//���ó�����
		PageFormat pf = new PageFormat();
		pf.setOrientation(PageFormat.PORTRAIT);
		//ͨ��Paper����ҳ��Ŀհױ߾�Ϳɴ�ӡ���򡣱�����ʵ�ʴ�ӡֽ�Ŵ�С�����
		Paper p = new Paper();
		p.setSize(590,840);//ֽ�Ŵ�С 
		p.setImageableArea(10,10, 590,840);//A4(595 X 842)���ô�ӡ������ʵ0��0Ӧ����72��72����ΪA4ֽ��Ĭ��X,Y�߾���72
		pf.setPaper(p);
		//�� PageFormat �� Printable ��ӵ����У����һ��ҳ��
		book.append(this, pf);
		//��ȡ��ӡ�������
		PrinterJob job = PrinterJob.getPrinterJob();
		//���ô�ӡ��
		job.setPageable(book);
		try {
			//������printDialog��ʾ��ӡ�Ի������û�ȷ�Ϻ��ӡ��Ҳ����ֱ�Ӵ�ӡ
			boolean a=job.printDialog();
			if(a){
				job.print();
			}
		} catch (PrinterException e) {
			e.printStackTrace();
		}
	}
	/**
	 * @param Graphicָ����ӡ��ͼ�λ���
	 * @param PageFormatָ����ӡҳ��ʽ��ҳ���С�Ե�Ϊ������λ��1��Ϊ1Ӣ�ŵ�1/72��1Ӣ��Ϊ25.4���ס�A4ֽ����Ϊ595��842��
	 * @param pageIndexָ��ҳ��
	 * @param ������Ƭ�λ���lisany30201314������ѷ����Ĵ�������������������ģ�������лл���� 
	 */
	@Override
	public int print(Graphics graphics, PageFormat pageFormat, int pageIndex)throws PrinterException {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>ָ��ҳ�ţ�"+pageIndex);
		Component c = null;
		//print string
		//String str = prePrint.toString();
		//ת����Graphics2D
		Graphics2D g2 = (Graphics2D) graphics;
		//���ô�ӡ��ɫΪ��ɫ
		g2.setColor(Color.black);
		//��ӡ�������
		double x = pageFormat.getImageableX();
		double y = pageFormat.getImageableY();
		switch(pageIndex){
		case 0:
			Font font = new Font("������", Font.PLAIN, 16);
			g2.setFont(font);//�������� 
			float[] dash1 = {2.0f}; 
			//���ô�ӡ�ߵ����ԡ�
			//1.�߿� 2��3����֪����4���հ׵Ŀ�ȣ�5�����ߵĿ�ȣ�6��ƫ����
			g2.setStroke(new BasicStroke(0.5f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER
					, 2.0f, dash1, 0.0f));  
			//g2.setStroke(bs_3);//�����߿�
			float heigth = font.getSize2D();//����߶�
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>x="+x);
			Image src = Toolkit.getDefaultToolkit().getImage("D:/����ͼƬ/yesorno.jpg");
			g2.drawImage(src,(int)x,(int)y,c);
			int img_Height=src.getHeight(c);
			g2.drawImage(src,(int)x,(int)(y+1*heigth+img_Height+11),c);
			//String[] lines = str.split("\r\n\r\n");
			int countOut = 0;
			for(int i = 0; i < prePrint.length; i++) {
				String lineOfStrings =prePrint[i].toString().replace(" ", "").replaceAll(";+", ";");
				g2.drawString(lineOfStrings
						, (float)x+30,
						(float)y+((countOut++)+1)*heigth+img_Height);
			}
			return PAGE_EXISTS;
		default:
			return NO_SUCH_PAGE;
		}
	}

	public static void main(String[] args) {
		//new PrintTest4("��ô�죿 ");
	}
}