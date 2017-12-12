package com.lenovo.scm.dao;

import java.util.List;

import com.lenovo.scm.beans.AppBean;

public interface Appdao {

	List<AppBean> selectAll();
}
