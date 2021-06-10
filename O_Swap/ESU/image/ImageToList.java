package ESU.image;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.imageio.ImageIO;

public class ImageToList {
	//�ú������ڹ��еȲ���ͼƬ�ļ�ת�������顣
	public static List<Integer> waveImageFileToArrayWithBlack(
			String FilePath) throws IOException {
		BufferedImage bufferedImage= ImageIO.read(new File(FilePath)); 
		List<Integer> output= new ArrayList<>();
		for (int i= 0; i< bufferedImage.getWidth(); ++i) {
			for (int j= 0; j< bufferedImage.getHeight(); ++j) {
				int color= bufferedImage.getRGB(i, j);
				color= color& 0Xff;
				if(0== color) {
					output.add(j);
				}
			}
		}
		return output;
	}
	//�ú������ڹ��еȲ��λ���ת�������顣
	public static List<Integer> waveImageToArrayWithBlack(
			BufferedImage bufferedImage) {
		List<Integer> output= new ArrayList<>();
		for (int i= 0; i< bufferedImage.getWidth(); ++i) {
			for (int j= 0; j< bufferedImage.getHeight(); ++j) {
				int color= bufferedImage.getRGB(i, j);
				color= color& 0Xff;
				if(0== color) {
					output.add(j);
				}
			}
		}
		return output;
	}
	//�ú������ڹ��еȲ��λ���ת�������顣����������ɫ����
	public static List<Integer> waveImageToArrayWithColor(
			BufferedImage bufferedImage, int colorRange) {
		List<Integer> output= new ArrayList<>();
		for (int i= 0; i< bufferedImage.getWidth(); ++i) {
			for (int j= 0; j< bufferedImage.getHeight(); ++j) {
				int color= bufferedImage.getRGB(i, j);
				color= color& 0Xff;
				if(colorRange== color) {
					output.add(j);
				}
			}
		}
		return output;
	}
	//�ú������ڹ��еȲ���ͼƬ�ļ�ת�������顣����������ɫ����
	public static List<Integer> waveImageFileToArrayWithColor(
			String FilePath, int colorRange) throws IOException {
		BufferedImage bufferedImage= ImageIO.read(new File(FilePath)); 
		List<Integer> output= new ArrayList<>();
		for (int i= 0; i< bufferedImage.getWidth(); ++i) {
			for (int j= 0; j< bufferedImage.getHeight(); ++j) {
				int color= bufferedImage.getRGB(i, j);
				color= color& 0Xff;
				if(colorRange== color) {
					output.add(j);
				}
			}
		}
		return output;
	}
	//�ú������ڹ��еȲ���ͼƬ�ļ�ת������ͬ��ɫ������༯�ϡ�
	public static HashMap<Integer, List<Integer>> waveImageFileToArrayMapWithBlack(
			String FilePath) throws IOException {
		HashMap<Integer, List<Integer>> output= new HashMap<>();
		BufferedImage bufferedImage= ImageIO.read(new File(FilePath)); 
		for (int i= 0; i< bufferedImage.getWidth(); ++i) {
			for (int j= 0; j< bufferedImage.getHeight(); ++j) {
				int color= bufferedImage.getRGB(i, j);
				color= color& 0Xff;
				List<Integer> pointRange;
				if(output.containsKey(color)) {
					pointRange= output.get(color);
				}else {
					pointRange= new ArrayList<>();;
				}
				pointRange.add(j);
				output.put(color, pointRange);
			}
		}
		return output;
	}
	//�ú������ڹ��еȲ��λ���ת�������顣
	public static HashMap<Integer, List<Integer>> waveImageToArrayMapWithBlack(
			BufferedImage bufferedImage) {
		HashMap<Integer, List<Integer>> output= new HashMap<>();
		for (int i= 0; i< bufferedImage.getWidth(); ++i) {
			for (int j= 0; j< bufferedImage.getHeight(); ++j) {
				int color= bufferedImage.getRGB(i, j);
				color= color& 0Xff;
				List<Integer> pointRange;
				if(output.containsKey(color)) {
					pointRange= output.get(color);
				}else {
					pointRange= new ArrayList<>();;
				}
				pointRange.add(j);
				output.put(color, pointRange);
			}
		}
		return output;
	}
	public static void main(String[] argv) throws IOException {
		List<Integer> out= ImageToList.waveImageFileToArrayWithBlack("D:\\detaoss\\DETA_FREE1.0.2\\src\\sample\\sc\\a.png");
		for(int i=0; i<out.size(); i++) {
			System.out.print(out.get(i)+" ");
		}
	}
}