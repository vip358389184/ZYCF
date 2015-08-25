package com.zyfy.util.impl;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.binary.Base64;

import com.zyfy.util.Util;

public class UtilImpl implements Util {
	

	@Override
	public String encoderPwdByMd5(String str) throws NoSuchAlgorithmException,
			UnsupportedEncodingException {
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		return  Base64.encodeBase64String(md5.digest(str.getBytes("utf-8")));
	}

	
}
