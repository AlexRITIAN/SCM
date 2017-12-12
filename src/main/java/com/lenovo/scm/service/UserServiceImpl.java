package com.lenovo.scm.service;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lenovo.scm.Utils.AESUtil;
import com.lenovo.scm.beans.UserBean;
import com.lenovo.scm.dao.Userdao;

@Service(value="userService")
public class UserServiceImpl implements IUserService {

	@Autowired
	private Userdao userDao;
	
	@Override
	public Boolean matchLogin(String name, String password) throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {
		AESUtil aes = new AESUtil();
		return aes.Decryptor(userDao.selectByName(name).getPassword().getBytes()).toString().equals(password);
	}

	@Override
	public int addUser(UserBean user) throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {
		AESUtil aes = new AESUtil();
		user.setPassword(aes.Encrytor(user.getPassword()).toString());
		return userDao.insert(user);
	}

}
