package com.zyfy.util.util;

import java.io.FileInputStream;
import java.util.Properties;

public class ProFile {
	private static String creditMarket;
	private static String creditManager;
	private static String weixinTempleate;
	
	static{
		String path = ProFile.class.getClassLoader().getResource("com/zyfy/config/server.properties").getPath();
		Properties properties = new Properties();
		try {
            properties.load(new FileInputStream(path));
            creditMarket = properties.getProperty("CreditMarket");
            creditManager = properties.getProperty("CreditManager");
            weixinTempleate=properties.getProperty("weixinTemplate");
        } catch (Exception e) {
            e.printStackTrace();
            throw new ExceptionInInitializerError(e);
        }
	}

	public static String getCreditMarket() {
		return creditMarket;
	}
	public static void setCreditMarket(String creditMarket) {
		ProFile.creditMarket = creditMarket;
	}
	public static String getCreditManager() {
		return creditManager;
	}
	public static void setCreditManager(String creditManager) {
		ProFile.creditManager = creditManager;
	}
	public static String getWeixinTempleate() {
		return weixinTempleate;
	}
	public static void setWeixinTempleate(String weixinTempleate) {
		ProFile.weixinTempleate = weixinTempleate;
	}
}
