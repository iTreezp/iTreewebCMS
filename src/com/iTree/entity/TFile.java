package com.iTree.entity;

// Generated 2015-10-14 15:24:19 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TFile generated by hbm2java
 */
public class TFile implements java.io.Serializable {

	private Integer id;
	private TUser TUser;
	private TPhoto TPhoto;
	private String fileProfile;
	private String fileTittle;
	private String filePath;
	private String fileType;
	private Date uploadTime;
	private int fileStatus;
	private Set TRecords = new HashSet(0);

	public TFile() {
	}

	public TFile(TUser TUser, String fileProfile, String fileTittle,
			String filePath, String fileType, Date uploadTime, int fileStatus) {
		this.TUser = TUser;
		this.fileProfile = fileProfile;
		this.fileTittle = fileTittle;
		this.filePath = filePath;
		this.fileType = fileType;
		this.uploadTime = uploadTime;
		this.fileStatus = fileStatus;
	}

	public TFile(TUser TUser, TPhoto TPhoto, String fileProfile,
			String fileTittle, String filePath, String fileType,
			Date uploadTime, int fileStatus, Set TRecords) {
		this.TUser = TUser;
		this.TPhoto = TPhoto;
		this.fileProfile = fileProfile;
		this.fileTittle = fileTittle;
		this.filePath = filePath;
		this.fileType = fileType;
		this.uploadTime = uploadTime;
		this.fileStatus = fileStatus;
		this.TRecords = TRecords;
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

	public TPhoto getTPhoto() {
		return this.TPhoto;
	}

	public void setTPhoto(TPhoto TPhoto) {
		this.TPhoto = TPhoto;
	}

	public String getFileProfile() {
		return this.fileProfile;
	}

	public void setFileProfile(String fileProfile) {
		this.fileProfile = fileProfile;
	}

	public String getFileTittle() {
		return this.fileTittle;
	}

	public void setFileTittle(String fileTittle) {
		this.fileTittle = fileTittle;
	}

	public String getFilePath() {
		return this.filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getFileType() {
		return this.fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public Date getUploadTime() {
		return this.uploadTime;
	}

	public void setUploadTime(Date uploadTime) {
		this.uploadTime = uploadTime;
	}

	public int getFileStatus() {
		return this.fileStatus;
	}

	public void setFileStatus(int fileStatus) {
		this.fileStatus = fileStatus;
	}

	public Set getTRecords() {
		return this.TRecords;
	}

	public void setTRecords(Set TRecords) {
		this.TRecords = TRecords;
	}

}
