package com.lenovo.scm.beans;

public class AppBean {

	private int id;
	private String system;
	private String enviroment;
	private String app;
	private String role;
	private String ip;
	private String owner;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSystem() {
		return system;
	}

	public void setSystem(String system) {
		this.system = system;
	}

	public String getEnviroment() {
		return enviroment;
	}

	public void setEnviroment(String enviroment) {
		this.enviroment = enviroment;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "AppBean [id=" + id + ", system=" + system + ", enviroment=" + enviroment + ", app=" + app + ", role="
				+ role + ", ip=" + ip + ", owner=" + owner + "]";
	}
	
}
