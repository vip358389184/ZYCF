package com.zyfy.util.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.IOUtils;

public class Token {
	private static Token token;
	private static String weiwinToken;
	
	private String code="JDcsai6983620UFUAN=";
	private String appid="wx20e5f88b3f2f7f16";
	private String secret="8bc708d511b93493318ef2044a202bac";
	
	private Token() {}
	
	public static Token getToken() {
		if(token==null){
			token=new Token();
		}
		return token;
	}
	
		
	public String getWeiWinTonken(){
		if(weiwinToken==null||"".equals(weiwinToken)){
		try {
			URL url=new URL("https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=wxb03d4ce5dcc83f7c&secret=bced76e566aca08c552ccc0da8865c3c ");
			InputStream in = url.openConnection().getInputStream();
			weiwinToken= IOUtils.toString(in);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		System.out.println(weiwinToken);
		return weiwinToken;
	}
		
}
