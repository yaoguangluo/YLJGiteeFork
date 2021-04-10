package org.OSU.tinos.image;


import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
//����һ��ToolkitImage �任
//sun ��������ʱ��ѻ�ͼ�;���ֲ�����,toolkit�� image ��ע���ĵ����ǰ�toolkit���ģ�����дͼƬ����Ҫ����һ�¡����ڷֳ�����
//������
public class ToolkitImageToBufferImage{
	public BufferedImage ToolkitImageIconToBufferImage(ImageIcon imageIcon) {
		BufferedImage  bufferedImage= new BufferedImage(imageIcon.getIconWidth(),
				imageIcon.getIconHeight(), BufferedImage.TYPE_INT_RGB);
		Graphics2D graphics2D= bufferedImage.createGraphics();
		graphics2D.drawImage(imageIcon.getImage(), 0, 0, imageIcon.getImageObserver());
		return bufferedImage;
	}
}