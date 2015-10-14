package com.itree.entity;
// Generated 2015-10-14 15:25:59 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * TUser generated by hbm2java
 */
public class TUser implements java.io.Serializable {

	private Integer id;
	private TPhoto TPhoto;
	private TDuty TDuty;
	private String userName;
	private int userSex;
	private String userHoby;
	private String userMotto;
	private int userTel;
	private String userProfile;
	private int userStatus;
	private Set TLogins = new HashSet(0);
	private Set TFiles = new HashSet(0);
	private Set TRecords = new HashSet(0);
	private Set TPlans = new HashSet(0);
	private Set TTeacherwrotes = new HashSet(0);

	public TUser() {
	}

	public TUser(TPhoto TPhoto, TDuty TDuty, String userName, int userSex,
			int userTel, String userProfile, int userStatus) {
		this.TPhoto = TPhoto;
		this.TDuty = TDuty;
		this.userName = userName;
		this.userSex = userSex;
		this.userTel = userTel;
		this.userProfile = userProfile;
		this.userStatus = userStatus;
	}

	public TUser(TPhoto TPhoto, TDuty TDuty, String userName, int userSex,
			String userHoby, String userMotto, int userTel, String userProfile,
			int userStatus, Set TLogins, Set TFiles, Set TRecords, Set TPlans,
			Set TTeacherwrotes) {
		this.TPhoto = TPhoto;
		this.TDuty = TDuty;
		this.userName = userName;
		this.userSex = userSex;
		this.userHoby = userHoby;
		this.userMotto = userMotto;
		this.userTel = userTel;
		this.userProfile = userProfile;
		this.userStatus = userStatus;
		this.TLogins = TLogins;
		this.TFiles = TFiles;
		this.TRecords = TRecords;
		this.TPlans = TPlans;
		this.TTeacherwrotes = TTeacherwrotes;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TPhoto getTPhoto() {
		return this.TPhoto;
	}

	public void setTPhoto(TPhoto TPhoto) {
		this.TPhoto = TPhoto;
	}

	public TDuty getTDuty() {
		return this.TDuty;
	}

	public void setTDuty(TDuty TDuty) {
		this.TDuty = TDuty;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserSex() {
		return this.userSex;
	}

	public void setUserSex(int userSex) {
		this.userSex = userSex;
	}

	public String getUserHoby() {
		return this.userHoby;
	}

	public void setUserHoby(String userHoby) {
		this.userHoby = userHoby;
	}

	public String getUserMotto() {
		return this.userMotto;
	}

	public void setUserMotto(String userMotto) {
		this.userMotto = userMotto;
	}

	public int getUserTel() {
		return this.userTel;
	}

	public void setUserTel(int userTel) {
		this.userTel = userTel;
	}

	public String getUserProfile() {
		return this.userProfile;
	}

	public void setUserProfile(String userProfile) {
		this.userProfile = userProfile;
	}

	public int getUserStatus() {
		return this.userStatus;
	}

	public void setUserStatus(int userStatus) {
		this.userStatus = userStatus;
	}

	public Set getTLogins() {
		return this.TLogins;
	}

	public void setTLogins(Set TLogins) {
		this.TLogins = TLogins;
	}

	public Set getTFiles() {
		return this.TFiles;
	}

	public void setTFiles(Set TFiles) {
		this.TFiles = TFiles;
	}

	public Set getTRecords() {
		return this.TRecords;
	}

	public void setTRecords(Set TRecords) {
		this.TRecords = TRecords;
	}

	public Set getTPlans() {
		return this.TPlans;
	}

	public void setTPlans(Set TPlans) {
		this.TPlans = TPlans;
	}

	public Set getTTeacherwrotes() {
		return this.TTeacherwrotes;
	}

	public void setTTeacherwrotes(Set TTeacherwrotes) {
		this.TTeacherwrotes = TTeacherwrotes;
	}

}
