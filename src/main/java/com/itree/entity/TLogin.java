package com.itree.entity;

// Generated 2015-10-14 15:25:59 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * TLogin generated by hbm2java
 */
public class TLogin implements java.io.Serializable {

	private Integer id;
	private TUser TUser;
	private Date accountNo;
	private String password;
	private int loginStatus;

	public TLogin() {
	}

	public TLogin(TUser TUser, Date accountNo, String password, int loginStatus) {
		this.TUser = TUser;
		this.accountNo = accountNo;
		this.password = password;
		this.loginStatus = loginStatus;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TUser getTUser() {
		return this.TUser;
	}

	public void setTUser(TUser TUser) {
		this.TUser = TUser;
	}

	public Date getAccountNo() {
		return this.accountNo;
	}

	public void setAccountNo(Date accountNo) {
		this.accountNo = accountNo;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getLoginStatus() {
		return this.loginStatus;
	}

	public void setLoginStatus(int loginStatus) {
		this.loginStatus = loginStatus;
	}

}
