package PEU.P.dna;
//MD5�滻DNA�Ѿ���ʼ,׼����Ƹ���¼������.
//������lombok Ҳ����ֱ��public setter getter
//������
public class TokenCerts {
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPdnKey() {
		return pdnKey;
	}
	public void setPdnKey(String pdnKey) {
		this.pdnKey = pdnKey;
	}
	public String getPdnLock() {
		return pdnLock;
	}
	public void setPdnLock(String pdnLock) {
		this.pdnLock = pdnLock;
	}
	public String getPdnPassword() {
		return pdnPassword;
	}
	public void setPdnPassword(String pdnPassword) {
		this.pdnPassword = pdnPassword;
	}
	public String getPds() {
		return pds;
	}
	public void setPds(String pds) {
		this.pds = pds;
	}
	private String password;
	private String pds;
	private String pdnKey;
	private String pdnLock;
	private String pdnPassword;
}