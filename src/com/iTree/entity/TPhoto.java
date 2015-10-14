package com.iTree.entity;

// Generated 2015-10-14 15:24:19 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TPhoto generated by hbm2java
 */
public class TPhoto implements java.io.Serializable {

	private Integer id;
	private String photoProfile;
	private String photoPath;
	private Date upTime;
	private int photoStatus;
	private Set TNewses = new HashSet(0);
	private Set TFiles = new HashSet(0);
	private Set TRecords = new HashSet(0);
	private Set TPlans = new HashSet(0);
	private Set TUsers = new HashSet(0);

	public TPhoto() {
	}

	public TPhoto(String photoProfile, String photoPath, Date upTime,
			int photoStatus) {
		this.photoProfile = photoProfile;
		this.photoPath = photoPath;
		this.upTime = upTime;
		this.photoStatus = photoStatus;
	}

	public TPhoto(String photoProfile, String photoPath, Date upTime,
			int photoStatus, Set TNewses, Set TFiles, Set TRecords, Set TPlans,
			Set TUsers) {
		this.photoProfile = photoProfile;
		this.photoPath = photoPath;
		this.upTime = upTime;
		this.photoStatus = photoStatus;
		this.TNewses = TNewses;
		this.TFiles = TFiles;
		this.TRecords = TRecords;
		this.TPlans = TPlans;
		this.TUsers = TUsers;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPhotoProfile() {
		return this.photoProfile;
	}

	public void setPhotoProfile(String photoProfile) {
		this.photoProfile = photoProfile;
	}

	public String getPhotoPath() {
		return this.photoPath;
	}

	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}

	public Date getUpTime() {
		return this.upTime;
	}

	public void setUpTime(Date upTime) {
		this.upTime = upTime;
	}

	public int getPhotoStatus() {
		return this.photoStatus;
	}

	public void setPhotoStatus(int photoStatus) {
		this.photoStatus = photoStatus;
	}

	public Set getTNewses() {
		return this.TNewses;
	}

	public void setTNewses(Set TNewses) {
		this.TNewses = TNewses;
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

	public Set getTUsers() {
		return this.TUsers;
	}

	public void setTUsers(Set TUsers) {
		this.TUsers = TUsers;
	}

}
