package com.lenovo.scm.Utils;


import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class ParseJSON {
	public static JSONObject getJSON(Object obj){
		JSONObject jsonObj = JSONObject.fromObject(obj);
		return jsonObj;
	}
	
	public static JSONArray getJSONArray(Object obj){
		return JSONArray.fromObject(obj);
	}
	
	public static JSONArray list2JSONArray(List<?> list){
		StringBuffer buffer = new StringBuffer();
		buffer.append("[");
		for (Object object : list) {
			buffer.append(getJSON(object).toString());
			buffer.append(",");
		}
		buffer.append("]");
		return getJSONArray(buffer.toString());
	}

}
