package OPM.ESU.admin;

import ME.APM.VSQ.App;

//���� ������
//׼�����һ�� ���ݿ��ȡfrequency ��������, ֮�����ݱ༭ҳ�����������.
public class DBReadMode{

	public static void aCommonReadWay(App app, Object inputBuffer) {
		//1�������������,������������
		//1.1��������txt����ѡ����txt
		if(app.bootDBInTXTWay) {
			//...
			readDBInTXTWay(app, inputBuffer);
			return;
		}
		//�����ݱ�����ѡ���Ͷ����ݱ�
		if(app.bootDBInBaseWay) {
			//...
			readDBInBaseWay(app, inputBuffer);
			return;
		}
		//��web�ӿ���������ѡ���Ͷ�web�ϵ�rest��������
		if(app.bootDBInWebWay) {
			readDBInWebWay(app, inputBuffer);
			//...
			return;
		}

		//2���û�����þͰ���ˮ�߶���
		//2.1 ��txt�ȶ�txt
		readDBInTXTWay(app, inputBuffer);
		//2.2 �����ݱ�Ͷ������ݱ�
		readDBInBaseWay(app, inputBuffer);
		//2.3 ��web�ӿ�����Ͷ�web�ϵ�rest��������
		readDBInWebWay(app, inputBuffer);
		//2.4 ������.
	}

	public static void readDBInTXTWay(App app, Object inputBuffer) {
		//...
	}

	public static void readDBInBaseWay(App app, Object inputBuffer) {
		//...
	}

	public static void readDBInWebWay(App app, Object inputBuffer) {
		//...
	}
}