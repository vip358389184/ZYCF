package com.zyfy.service.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHeader;
import org.apache.http.protocol.HTTP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zyfy.service.WeiWinService;
import com.zyfy.util.Util;
import com.zyfy.util.util.ProFile;
import com.zyfy.util.util.Token;
import com.zyfy.util.util.Tools;
import com.zyfy.vo.TemplateData;
import com.zyfy.vo.WxTemplate;

import net.sf.json.JSONObject;

@Service
public class WeiWinServiceImpl implements WeiWinService {

	@Autowired
	private static Util util;

	private static final String APPLICATION_JSON = "application/json";

	private static final String CONTENT_TYPE_TEXT_JSON = "text/json"; 
	
	private static String access_token;
	
	private	static String path;
	
	private String[] openid={"oyzHSwFX1ykdUKcWZpekFUsNuSOY","oyzHSwJLZcQXXCEpToSxOW7JIKKc","oyzHSwDr0Vh41N5JODFMUDbFo7C0","oyzHSwBKhky1nnr2KanCf0W9hmKo","oyzHSwKixME4b0szqtqgAtQ5VpJo"};
	
	private String[] template_id={"-w0kbACktCjU0BTSmDwrO-jKopOhNu_IIYMI4Gxhsow"};
	
	static {
		String tokens=Token.getToken().getWeiWinTonken();
		JSONObject jsonObject = JSONObject.fromObject(tokens);
		Map<String,Object> map = Tools.getTools().jsonToMap(tokens);
		access_token=(String) map.get("access_token");
		path=ProFile.getWeixinTempleate();
	}
	
	
	/**
	 * 获得用户OPenID
	 */
	@Override
	public void getUserOpenId() {
		try {
			// String weiWinToken = 
			HttpClient httpClient = new DefaultHttpClient();
			HttpPost httpost = new HttpPost("https://api.weixin.qq.com/cgi-bin/user/get?access_token="+access_token+"&next_openid=");
			httpost.addHeader(HTTP.CONTENT_TYPE, APPLICATION_JSON);
			String encoderJson = URLEncoder.encode(HTTP.UTF_8);
			StringEntity se = new StringEntity(encoderJson);
	        se.setContentType(CONTENT_TYPE_TEXT_JSON);
	        se.setContentEncoding(new BasicHeader(HTTP.CONTENT_TYPE, APPLICATION_JSON));
			httpost.setEntity(se);
			HttpResponse resp = httpClient.execute(httpost);
			InputStream content = resp.getEntity().getContent();
			BufferedReader in = new BufferedReader(new InputStreamReader(content, "UTF-8"));
			String inputLine;
			StringBuffer bankXmlBuffer = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				bankXmlBuffer.append(inputLine);
			}
			in.close();
			System.out.println(bankXmlBuffer);
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 设置行业
	 */
	@Override
	public void industry() {
		try {
			HttpClient httpClient = new DefaultHttpClient();
			HttpPost httpost = new HttpPost("https://api.weixin.qq.com/cgi-bin/template/api_set_industry?access_token="+access_token);
			httpost.addHeader(HTTP.CONTENT_TYPE, APPLICATION_JSON);
			Map<String,Object> requestMap=new HashMap<String,Object>();
			requestMap.put("industry_id1", "7");
			requestMap.put("industry_id2", "8");
			JSONObject	jsonObject=JSONObject.fromObject(requestMap);
			StringEntity se = new StringEntity(jsonObject.toString());
	        se.setContentType(CONTENT_TYPE_TEXT_JSON); 
	        se.setContentEncoding(new BasicHeader(HTTP.CONTENT_TYPE, APPLICATION_JSON));
	        se.setContentEncoding("UTF-8");
			se.setContentType("application/json");
			httpost.setEntity(se);
			HttpResponse resp = httpClient.execute(httpost);
			InputStream content = resp.getEntity().getContent();
			BufferedReader in = new BufferedReader(new InputStreamReader(content,"UTF-8"));
			String inputLine;
			StringBuffer bankXmlBuffer = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				bankXmlBuffer.append(inputLine);
			}
			in.close();
			System.out.println(bankXmlBuffer.toString());
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 获得模版ID
	 */
	@Override
	public void template() {
		try {
			HttpClient httpClient = new DefaultHttpClient(); 
			HttpPost httpost = new HttpPost("https://api.weixin.qq.com/cgi-bin/template/api_add_template?access_token="+access_token);
			httpost.addHeader(HTTP.CONTENT_TYPE, APPLICATION_JSON);
			Map<String,Object> requestMap=new HashMap<String,Object>();
			requestMap.put("template_id_short", "TM00197");
			JSONObject	jsonObject=JSONObject.fromObject(requestMap);
			StringEntity se = new StringEntity(jsonObject.toString());
	        se.setContentType(CONTENT_TYPE_TEXT_JSON); 
	        se.setContentEncoding(new BasicHeader(HTTP.CONTENT_TYPE, APPLICATION_JSON));
	        se.setContentEncoding("gbk");
			se.setContentType("application/json");
			httpost.setEntity(se);
			HttpResponse resp = httpClient.execute(httpost);
			InputStream content = resp.getEntity().getContent();
			BufferedReader in = new BufferedReader(new InputStreamReader(content,"UTF-8"));
			String inputLine;
			StringBuffer bankXmlBuffer = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				bankXmlBuffer.append(inputLine);
			}
			in.close();
			System.out.println(bankXmlBuffer.toString());
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 发送模版消息
	 */
	@Override
	public void massageModel(WxTemplate wx) {
		try {
			HttpClient httpClient = new DefaultHttpClient();
			HttpPost httpost = new HttpPost("https://api.weixin.qq.com/cgi-bin/message/template/send?access_token="+access_token);
			httpost.addHeader(HTTP.CONTENT_TYPE, APPLICATION_JSON);
			JSONObject	jsonObject=JSONObject.fromObject(wx);
			StringEntity se = new StringEntity(new String(jsonObject.toString().getBytes(),"ISO8859_1"));
	        se.setContentType(CONTENT_TYPE_TEXT_JSON); 
	        se.setContentEncoding(new BasicHeader(HTTP.CONTENT_TYPE, APPLICATION_JSON));
	        se.setContentEncoding("UTF-8");
			se.setContentType("application/json");
			httpost.setEntity(se);
			HttpResponse resp = httpClient.execute(httpost);
			InputStream content = resp.getEntity().getContent();
			BufferedReader in = new BufferedReader(new InputStreamReader(content,"UTF-8"));
			String inputLine;
			StringBuffer bankXmlBuffer = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				bankXmlBuffer.append(inputLine);
			}
			in.close();
			System.out.println(bankXmlBuffer.toString());
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void getWeiXinPro(){
		
	}
	
	public static void main(String[] args) {
		WeiWinServiceImpl wei=new WeiWinServiceImpl();
		WxTemplate wx=new WxTemplate();
		wx.setUrl("http://www.baidu.com");
		wx.setTemplate_id("-w0kbACktCjU0BTSmDwrO-jKopOhNu_IIYMI4Gxhsow");
		wx.setTouser("oyzHSwDr0Vh41N5JODFMUDbFo7C0");
		TemplateData templateData=new TemplateData();
		templateData.setValue("恭喜你借款成功！");
		templateData.setColor("#173177");
		TemplateData templateData1=new TemplateData();
		templateData1.setValue("陈倩芸");
		templateData1.setColor("#173177");
		TemplateData templateData2=new TemplateData();
		templateData2.setValue("借款");
		templateData2.setColor("#173177");
		TemplateData templateData3=new TemplateData();
		templateData3.setValue("1000000.0$");
		templateData3.setColor("#173177");
		TemplateData templateData4=new TemplateData();
		templateData4.setValue("美女 陈倩芸 于2015-10-22向于文扬 借款100万$ 以此为证");
		templateData4.setColor("#173177");
		Map<String,TemplateData> dataMap=new HashMap<String,TemplateData>();
		dataMap.put("first", templateData);
		dataMap.put("RightName", templateData1);
		dataMap.put("DealType", templateData2);
		dataMap.put("Money", templateData3);
		dataMap.put("remark", templateData4);
		wx.setData(dataMap);
		wei.massageModel(wx);
	}
}