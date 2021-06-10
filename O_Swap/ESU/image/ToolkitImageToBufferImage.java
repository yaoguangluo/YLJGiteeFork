package ESU.image;


import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import javax.swing.ImageIcon;
//����һ��ToolkitImage �任
//sun ��������ʱ��ѻ�ͼ�;���ֲ�����,toolkit�� image ��ע���ĵ����ǰ�toolkit���ģ�����дͼƬ����Ҫ����һ�¡����ڷֳ�����
//������
public class ToolkitImageToBufferImage{
	public BufferedImage toolkitImageIconToBufferImage(int positionX, int positionY, ImageIcon imageIcon) {
		BufferedImage  bufferedImage= new BufferedImage(imageIcon.getIconWidth(),
				imageIcon.getIconHeight(), BufferedImage.TYPE_INT_RGB);
		Graphics2D graphics2D= bufferedImage.createGraphics();
		graphics2D.drawImage(imageIcon.getImage(), positionX, positionY, imageIcon.getImageObserver());
		return bufferedImage;
	}
	
	public BufferedImage toolkitImageToBufferImage(Image image, int positionX, int positionY
			, int width, int height, ImageObserver imageObserver) {
		BufferedImage  bufferedImage= new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		bufferedImage.getGraphics().drawImage(image, positionX, positionY, imageObserver);
		return bufferedImage;
	}

}