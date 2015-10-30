package com.zyfy.util.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Base64;

public class EncoderHandler {
	
	private  static EncoderHandler eh;
	
	private static final String ALGORITHM = "MD5";

	private static final char[] HEX_DIGITS = { '0', '1', '2', '3', '4', '5','6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

	private EncoderHandler() {}
	
	public static EncoderHandler getEncoderHandler(){
		if(eh==null){
			eh = new EncoderHandler();
		}
		return eh;
	}
	
	public static String encoderByMd5Base64(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		MessageDigest md5 = MessageDigest.getInstance(ALGORITHM);
		return Base64.encodeBase64String(md5.digest(str.getBytes("utf-8")));
	}

	public static String encode(String algorithm, String str) {
		if (str == null) {
			return null;
		}
			MessageDigest messageDigest;
			try {
				messageDigest = MessageDigest.getInstance(algorithm);
				messageDigest.update(str.getBytes());
				return getFormattedText(messageDigest.digest());
			} catch (NoSuchAlgorithmException e) {
			
			}return null;
	}
	
	private static String getFormattedText(byte[] bytes) {
		int len = bytes.length;
		StringBuilder buf = new StringBuilder(len * 2);
		// 把密文转换成十六进制的字符串形式
		for (int j = 0;j<len;j++) {
			buf.append(HEX_DIGITS[(bytes[j]>>4) & 0x0f]);
			buf.append(HEX_DIGITS[bytes[j] & 0x0f]);
		}
		return buf.toString();
	}

	
	
	
	
}
