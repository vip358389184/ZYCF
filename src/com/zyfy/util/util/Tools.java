package com.zyfy.util.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


import net.sf.json.JSONException;
import net.sf.json.JSONObject;

public class Tools {
	
	private static Tools tools;
	
	private Tools() {}
	
	public static Tools getTools() {
		if(tools==null){
			tools=new Tools();
		}
		return tools;
	}
	
	// Json生成Map  
    public Map<String, Object> jsonToMap(String jsonString) throws JSONException {  
        //JSONObject必须以"{"开头  
        JSONObject jsonObject =JSONObject.fromObject(jsonString);  
        Map<String, Object> resultMap = new HashMap<String, Object>();  
        Iterator<String> iter = jsonObject.keys();  
        String key=null;  
        Object value=null;  
        while (iter.hasNext()) {  
            key=iter.next();  
            value=jsonObject.get(key);  
            resultMap.put(key, value);  
        }  
        return resultMap;  
    }

		
}
