package com.zyfy.util;


import com.zyfy.util.util.EncoderHandler;
import com.zyfy.util.util.Token;
import com.zyfy.util.util.Tools;

/**
 * 系统工具类
 * 
 * @author Matthew
 *
 */
public class Util {
	
	/**
	 * 获得加密对象
	 * @return 加密对象
	 */
	public EncoderHandler getEncoderHandler(){
		return EncoderHandler.getEncoderHandler();
	}
	
	/**
	 * 获得Token对象
	 * @return Token对象
	 */
	public Token getToken(){
		return Token.getToken();
	}
	
	/**
	 * 获得Token对象
	 * @return Token对象
	 */
	public Tools getTools(){
		return Tools.getTools();
	}
	
}
