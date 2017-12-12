package com.lenovo.scm.service;

import com.lenovo.scm.beans.UserBean;

public interface IUserService {

	Boolean matchLogin(String name,String password) throws Exception;
	
	int addUser(UserBean user) throws Exception;
}
