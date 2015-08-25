package com.zyfy.util;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
/**
 * 系统工具类
 * @author Matthew
 *
 */
public interface Util {

	public String encoderPwdByMd5(String string)
			throws NoSuchAlgorithmException, UnsupportedEncodingException;
}
