package OPM.ESU.admin;

import ME.APM.VSQ.App;

//���� ������
//׼�����һ�� ���ݿ��ȡfrequency ��������, ֮�����ݱ༭ҳ�����������.
public class DBReadMode{

	public void aCommonReadWay(App app, Object inputBuffer) {
		//1�������������,������������
		//1.1��������txt����ѡ����txt
		if(app.bootDBInTXTWay) {
			//...
			return;
		}
		//�����ݱ�����ѡ���Ͷ����ݱ�
		if(app.bootDBInBaseWay) {
			//...
			return;
		}
		//��web�ӿ���������ѡ���Ͷ�web�ϵ�rest��������
		if(app.bootDBInWebWay) {
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

	public void readDBInTXTWay(App app, Object inputBuffer) {
		//...
	}

	public void readDBInBaseWay(App app, Object inputBuffer) {
		//...
	}

	public void readDBInWebWay(App app, Object inputBuffer) {
		//...
	}
}