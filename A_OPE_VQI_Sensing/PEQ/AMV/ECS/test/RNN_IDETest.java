package PEQ.AMV.ECS.test;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import OCI.ME.analysis.C.A;
public class RNN_IDETest{
	public static void main(String[] argv) throws IOException, InstantiationException, IllegalAccessException {
		RNN_IDETest rNN_IDETest= new RNN_IDETest();
		rNN_IDETest.getIDEMatrix();	
	}

	public String[][] getIDEMatrix() throws IOException, InstantiationException, IllegalAccessException{
		SensingTest sensingTest = new SensingTest();
		String[][] sensingMatrix = sensingTest.getMatrix();
		Map<String, List<Double>> map = new HashMap<>();
		for(int i = 0; i < sensingMatrix.length; i++) {
			List<Double> list = new LinkedList<>(); 
			list.add(1.0);
			map.put(sensingMatrix[i][0], list);
		}
		String[][] ideMatrix = new String [sensingMatrix.length][4];
		List<String> sets = sensingTest.getSets();
		Map<String, String> pos = sensingTest.getPosCnToCn();
		Iterator<String> setsIterator = sets.iterator();
		double count = 1;
		//map position
		while(setsIterator.hasNext()) {
			String word = setsIterator.next();
			if(map.containsKey(word)) {
				List<Double> list  = map.get(word);
				list.add(count);
				map.put(word, list);
			}	
			count++;
		}
		//RNN LOOP position
		int ideMatrixCount = 0;
		Iterator<String> mapIterator = map.keySet().iterator();
		while(mapIterator.hasNext()) {
			String word = mapIterator.next();
			List<Double> list = map.get(word);
			double dovFactor = 1;
			double popFactor = 0;
			double eopFactor = 1;
			double dovCount = 1;
			for(int i = 0; i < list.size(); i++) {
				for(int j = i + 1; j < list.size(); j++) {
					dovCount ++;
					dovFactor += list.get(j);
				}
				dovFactor += Math.abs(list.get(i) - dovFactor);
				eopFactor += (eopFactor + list.get(i)) / 2;
			}
			//pos normalization
			if(pos.containsKey(word)) {
				popFactor += pos.get(word).contains("��")? 16: 0;
				popFactor += pos.get(word).contains("��")? 4: 0;
				popFactor += pos.get(word).contains("��")? 2: 0;	
			}
			ideMatrix[ideMatrixCount][0] = word;
			ideMatrix[ideMatrixCount][1] = "" + popFactor;
			ideMatrix[ideMatrixCount][2] = "" + dovFactor/dovCount;
			ideMatrix[ideMatrixCount][3] = "" + eopFactor;
			ideMatrixCount++;
		}
		return ideMatrix;
	}

	public String[][] getIDEMatrixExcludeAnalyzer(A _A, String string) throws IOException {
		SensingTest sensingTest = new SensingTest();
		String[][] sensingMatrix = sensingTest.getMatrix(string, _A);
		Map<String, List<Double>> map = new HashMap<>();
		for(int i = 0; i < sensingMatrix.length; i++) {
			List<Double> list = new LinkedList<>(); 
			list.add(1.0);
			map.put(sensingMatrix[i][0], list);
		}
		String[][] ideMatrix = new String [sensingMatrix.length][4];
		List<String> sets = sensingTest.getSets();
		Map<String, String> pos = sensingTest.getPosCnToCn();
		Iterator<String> setsIterator = sets.iterator();
		double count = 1;
		//map position
		while(setsIterator.hasNext()) {
			String word = setsIterator.next();
			if(map.containsKey(word)) {
				List<Double> list  = map.get(word);
				list.add(count);
				map.put(word, list);
			}	
			count++;
		}
		//RNN LOOP position
		int ideMatrixCount = 0;
		Iterator<String> mapIterator = map.keySet().iterator();
		while(mapIterator.hasNext()) {
			String word = mapIterator.next();
			List<Double> list = map.get(word);
			double dovFactor = 1;
			double popFactor = 0;
			double eopFactor = 1;
			double dovCount = 1;
			for(int i = 0; i < list.size(); i++) {
				for(int j = i + 1; j < list.size(); j++) {
					dovCount ++;
					dovFactor += list.get(j);
				}
				dovFactor += Math.abs(list.get(i) - dovFactor);
				eopFactor += (eopFactor + list.get(i)) / 2;
			}
			//pos normalization
			if(pos.containsKey(word)) {
				popFactor += pos.get(word).contains("��")? 16: 0;
				popFactor += pos.get(word).contains("��")? 4: 0;
				popFactor += pos.get(word).contains("��")? 2: 0;	
			}

			ideMatrix[ideMatrixCount][0] = word;
			ideMatrix[ideMatrixCount][1] = "" + popFactor;
			ideMatrix[ideMatrixCount][2] = "" + dovFactor/dovCount;
			ideMatrix[ideMatrixCount][3] = "" + eopFactor;
			ideMatrixCount++;
		}
		return ideMatrix;
	}

	public String[][] getIDEMatrixExcludeAnalyzer(SensingTest sensingTest, String[][] ann, A _A, String string) {
		//���ж� ��ʶ sensing
		String[][] sensingMatrix = ann;
		Map<String, List<Double>> map = new HashMap<>();
		for(int i = 0; i < sensingMatrix.length; i++) {
			List<Double> list = new LinkedList<>(); 
			list.add(1.0);
			map.put(sensingMatrix[i][0], list);
		}
		String[][] ideMatrix= new String [sensingMatrix.length][4];
		List<String> sets= sensingTest.getSets();
		Map<String, String> pos= sensingTest.getPosCnToCn();
		Iterator<String> setsIterator= sets.iterator();
		double count= 1;
		//map position
		//��ʼ����ͼ����
		while(setsIterator.hasNext()) {
			String word= setsIterator.next();
			if(map.containsKey(word)) {
				List<Double> list= map.get(word);
				list.add(count);
				map.put(word, list);
			}	
			count++;
		}
		//RNN LOOP position
		int ideMatrixCount= 0;
		Iterator<String> mapIterator= map.keySet().iterator();
		while(mapIterator.hasNext()) {
			String word= mapIterator.next();
			List<Double> list= map.get(word);
			double dovFactor= 1; //����distance�ľ��� distance of same vebals
			double popFactor= 0; // ������� part of speech
			double eopFactor= 1; // λ�ƾ��� eclid of parts ��ȫ����ע�� ������è��
			double dovCount= 1; // ����
			for(int i= 0; i< list.size(); i++) {
				for(int j= i + 1; j< list.size(); j++) {
					dovCount++;
					dovFactor+= list.get(j);
				}
				dovFactor+= Math.abs(list.get(i)- dovFactor); //ƽ���;��뿪��
				eopFactor+= (eopFactor+ list.get(i))/ 2;// ŷ�����������������
			}
			//pos normalization
			if(pos.containsKey(word)) {
				popFactor+= pos.get(word).contains("��")? 16: 0;
				popFactor+= pos.get(word).contains("��")? 5: 0;
				popFactor+= pos.get(word).contains("ҽ")? 3: 0;
				popFactor+= pos.get(word).contains("ν")? 3: 0;
				popFactor+= pos.get(word).contains("��")? 2: 0;
			}
			ideMatrix[ideMatrixCount][0]= word;
			ideMatrix[ideMatrixCount][1]= ""+ popFactor;
			ideMatrix[ideMatrixCount][2]= ""+ dovFactor/ dovCount;// ƽ��distance��
			ideMatrix[ideMatrixCount][3]= ""+ eopFactor;
			ideMatrixCount++;
		}
		//������2018�� ���ϵİ汾���õ���system������print, ������װ�ɺ����Ҿ�ע�͵���,�����Ż���ɾȥ��system �´�ӡ����,  ������20210420
		return ideMatrix;
	}
}