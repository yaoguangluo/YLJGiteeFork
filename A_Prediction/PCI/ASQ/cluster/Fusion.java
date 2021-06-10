package PCI.ASQ.cluster;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import PCI.ASQ.basic.Distance;
import PCI.ASQ.basic.Euclid;
import PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import PCI.ASQ.demension.AMV_MVS_VSQ_3D;
//task 20191220-20191222 daytime
//ͨ��scale ���������������ż��� �ھۡ�
//Theory yaoguang.luo 20191219�� ŷ�����
//Application yaoguang.luo
//ע�⣺����������ɾ������map�������������㣬���ǿ��ǵ� java���������ָ����ʽ������ȡ��ɾ��˼�룬�����ƻ������ϲ��߼���
//С����м�����Ҫ�����������޸ġ�
public class Fusion{
	public static Map<Double, List<AMV_MVS_VSQ_2D>> fusionPosition2DwithHeart
	(Map<Double, List<AMV_MVS_VSQ_2D>> groups, Map<Double, AMV_MVS_VSQ_2D> groupsHeart, double scale){
		//��ʼ
		Map<Double, List<AMV_MVS_VSQ_2D>> output= new HashMap<>();
		Map<Double, AMV_MVS_VSQ_2D> outputHeart= new HashMap<>();
		//���űȽ����ľ���
		Iterator<Double> outLoop= groupsHeart.keySet().iterator();
		Map<Double, Double> isDelete= new HashMap<>();
		//С�ھ������ھ�
		//HereOut:
		while(outLoop.hasNext()) {
			double out= outLoop.next();
			Iterator<Double> inLoop= groupsHeart.keySet().iterator();
			HereIn:
				while(inLoop.hasNext()) {
					double in= inLoop.next();
					if(out== in|| output.containsKey(in)|| isDelete.containsKey(in)) {
						continue HereIn;//out���ھ۲����in���������ӡ�output���۲��
					}
					AMV_MVS_VSQ_2D inHeart=	groupsHeart.get(in);
					//Position2D outHeart= groupsHeart.get(out);
					//������Ϊjava��ָ�뱻���󻯣�ֱ���޸���λ������������������outputHeart����������
					AMV_MVS_VSQ_2D outHeart= outputHeart.containsKey(out)
							? outputHeart.get(out): groupsHeart.get(out);
							double distance= Distance.getDistance2D(inHeart, outHeart);
							//�Ƚ� ���ں�
							if(distance< scale) {
								List<AMV_MVS_VSQ_2D> outList;
								//�Ƚ�����ý
								if(output.containsKey(out)) {
									outList= output.get(out);
								}else {//�Ƚ�����ý
									//����ýin to out ��out��ɾ�� in
									outList= groups.get(out);
								}
								//����ýin to out ɾ�� in
								List<AMV_MVS_VSQ_2D> inList= groups.get(in);
								Iterator<AMV_MVS_VSQ_2D> iterator= inList.iterator();
								while(iterator.hasNext()) {
									outList.add(iterator.next());
								}
								output.put(out, outList);
								//����heart
								AMV_MVS_VSQ_2D newHeart= Euclid.findCryptionPosition2D(outHeart, inHeart);
								outputHeart.put(out, newHeart);
								isDelete.put(in, in);
							}else {//�Ƚ� ���ںϣ�
								//�Ƚ�����ý
								if(!output.containsKey(out)) {//�Ƚ�����ý
									//����ý out��ɾ�� out������ý in ɾ�� in
									if(!output.containsKey(out)) {
										List<AMV_MVS_VSQ_2D> outList= groups.get(out);
										output.put(out, outList);
										//����heart
										outputHeart.put(out, outHeart);	
										isDelete.put(out, out);
									}
								}
								if(!output.containsKey(in)) {
									List<AMV_MVS_VSQ_2D> inList= groups.get(in);
									output.put(in, inList);
									//����heart
									outputHeart.put(in, inHeart);
									isDelete.put(in, in);
								}
							}
				}

		}
		return output;	
	}
	
	public static Map<Double, List<AMV_MVS_VSQ_3D>> fusionPosition3DwithHeart
	(Map<Double, List<AMV_MVS_VSQ_3D>> groups, Map<Double, AMV_MVS_VSQ_3D> groupsHeart, double scale){
		//��ʼ
		Map<Double, List<AMV_MVS_VSQ_3D>> output= new HashMap<>();
		Map<Double, AMV_MVS_VSQ_3D> outputHeart= new HashMap<>();
		//���űȽ����ľ���
		Iterator<Double> outLoop= groupsHeart.keySet().iterator();
		Map<Double, Double> isDelete= new HashMap<>();
		//С�ھ������ھ�
		//HereOut:
		while(outLoop.hasNext()) {
			double out= outLoop.next();
			Iterator<Double> inLoop= groupsHeart.keySet().iterator();
			HereIn:
				while(inLoop.hasNext()) {
					double in= inLoop.next();
					if(out== in|| output.containsKey(in)|| isDelete.containsKey(in)) {
						continue HereIn;//out���ھ۲����in���������ӡ�output���۲��
					}
					AMV_MVS_VSQ_3D inHeart=	groupsHeart.get(in);
					//Position3D outHeart= groupsHeart.get(out);
					//������Ϊjava��ָ�뱻���󻯣�ֱ���޸���λ������������������outputHeart����������
					AMV_MVS_VSQ_3D outHeart= outputHeart.containsKey(out)
							? outputHeart.get(out): groupsHeart.get(out);
							double distance= Distance.getDistance3D(inHeart, outHeart);
							//�Ƚ� ���ں�
							if(distance< scale) {
								List<AMV_MVS_VSQ_3D> outList;
								//�Ƚ�����ý
								if(output.containsKey(out)) {
									outList= output.get(out);
								}else {//�Ƚ�����ý
									//����ýin to out ��out��ɾ�� in
									outList= groups.get(out);
								}
								//����ýin to out ɾ�� in
								List<AMV_MVS_VSQ_3D> inList= groups.get(in);
								Iterator<AMV_MVS_VSQ_3D> iterator= inList.iterator();
								while(iterator.hasNext()) {
									outList.add(iterator.next());
								}
								output.put(out, outList);
								//����heart
								AMV_MVS_VSQ_3D newHeart= Euclid.findCryptionPosition3D(outHeart, inHeart);
								outputHeart.put(out, newHeart);
								isDelete.put(in, in);
							}else {//�Ƚ� ���ںϣ�
								//�Ƚ�����ý
								if(!output.containsKey(out)) {//�Ƚ�����ý
									//����ý out��ɾ�� out������ý in ɾ�� in
									if(!output.containsKey(out)) {
										List<AMV_MVS_VSQ_3D> outList= groups.get(out);
										output.put(out, outList);
										//����heart
										outputHeart.put(out, outHeart);	
										isDelete.put(out, out);
									}
								}
								if(!output.containsKey(in)) {
									List<AMV_MVS_VSQ_3D> inList= groups.get(in);
									output.put(in, inList);
									//����heart
									outputHeart.put(in, inHeart);
									isDelete.put(in, in);
								}
							}
				}
		}
		return output;	
	}
} 