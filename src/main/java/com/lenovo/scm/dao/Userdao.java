package com.lenovo.scm.dao;

import com.lenovo.scm.beans.UserBean;

public interface Userdao {

	UserBean selectByName(String name);
	
	int insert(UserBean user);
}
