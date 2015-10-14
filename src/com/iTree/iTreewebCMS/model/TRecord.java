package com.iTree.iTreewebCMS.model;

// Generated 2015-10-14 15:19:57 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * TRecord generated by hbm2java
 */
public class TRecord implements java.io.Serializable {

	private Integer id;
	private TUser TUser;
	private TPhoto TPhoto;
	private TFile TFile;
	private Date recordDate;
	private String recordContent;
	private int recordStatus;

	public TRecord() {
	}

	public TRecord(TUser TUser, Date recordDate, String recordContent,
			int recordStatus) {
		this.TUser = TUser;
		this.recordDate = recordDate;
		this.recordContent = recordContent;
		this.recordStatus = recordStatus;
	}

	public TRecord(TUser TUser, TPhoto TPhoto, TFile TFile, Date recordDate,
			String recordContent, int recordStatus) {
		this.TUser = TUser;
		this.TPhoto = TPhoto;
		this.TFile = TFile;
		this.recordDate = recordDate;
		this.recordContent = recordContent;
		this.recordStatus = recordStatus;
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

	public TFile getTFile() {
		return this.TFile;
	}

	public void setTFile(TFile TFile) {
		this.TFile = TFile;
	}

	public Date getRecordDate() {
		return this.recordDate;
	}

	public void setRecordDate(Date recordDate) {
		this.recordDate = recordDate;
	}

	public String getRecordContent() {
		return this.recordContent;
	}

	public void setRecordContent(String recordContent) {
		this.recordContent = recordContent;
	}

	public int getRecordStatus() {
		return this.recordStatus;
	}

	public void setRecordStatus(int recordStatus) {
		this.recordStatus = recordStatus;
	}

}
