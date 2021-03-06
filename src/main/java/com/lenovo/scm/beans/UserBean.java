package com.lenovo.scm.beans;

public class UserBean {
	private int id;
	private String accountNo;
	private String name;
	private String email;
	private String password;
	private int lockStatus;
	private String expireTime;
	private String allowIps;
	private String createTime;
	private String editTime;
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getLockStatus() {
		return lockStatus;
	}
	public void setLockStatus(int lockStatus) {
		this.lockStatus = lockStatus;
	}
	public String getExpireTime() {
		return expireTime;
	}
	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}
	public String getAllowIps() {
		return allowIps;
	}
	public void setAllowIps(String allowIps) {
		this.allowIps = allowIps;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getEditTime() {
		return editTime;
	}
	public void setEditTime(String editTime) {
		this.editTime = editTime;
	}
	@Override
	public String toString() {
		return "UserBean [id=" + id + ", accountNo=" + accountNo + ", name=" + name + ", email=" + email + ", password="
				+ password + ", lockStatus=" + lockStatus + ", expireTime=" + expireTime + ", allowIps=" + allowIps
				+ ", createTime=" + createTime + ", editTime=" + editTime + "]";
	}
	
	
	
}
