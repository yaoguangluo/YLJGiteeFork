package PEU.P.md5;

import java.util.Date;

public class TokenUtil {
	//引用了中科大的筛子非对称加密论文思想，这里标注下，
	public static Token getNewTokenFromUsrAndUsrToken(Usr usr, UsrToken usrToken) throws Exception {
		String key = String.valueOf(Double.valueOf(Math.random() * 10000000).intValue());
		String mPassword = TokenUtil.getFirstMD5Password(key, usrToken.getuPassword());
		Token token = new Token();
		token.setuEmail(usr.getuEmail());
		token.setuKey(key);
		token.setuTime(new Date().getTime());
		token.setmPassword(mPassword);
		return token;
	}
	public static String getSecondMD5Password(String uPassword) throws Exception {
		return StringUtil.EncoderByMd5("Author:Yaoguang Luo", uPassword, 8);
	}
	public static String getFirstMD5Password(String key, String uPassword) throws Exception {
		return StringUtil.EncoderByMd5(key, uPassword, 8);
	}
}