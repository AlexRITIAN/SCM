package com.lenovo.scm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lenovo.scm.Utils.ParseJSON;
import com.lenovo.scm.dao.Appdao;

import net.sf.json.JSONArray;

@Service(value = "appservice")
public class AppServiceImpl implements IAppService {

	@Autowired
	private Appdao appdao;

	@Override
	public JSONArray getAll() throws Exception {
		return ParseJSON.list2JSONArray(appdao.selectAll());
	}

}
