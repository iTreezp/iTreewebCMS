package com.iTree.iTreewebCMS.model;

// Generated 2015-10-14 15:19:57 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * TPlan generated by hbm2java
 */
public class TPlan implements java.io.Serializable {

	private Integer id;
	private TUser TUser;
	private TPhoto TPhoto;
	private String planContent;
	private Date planStart;
	private Date planEnd;
	private Date planUpdate;
	private int planParent;
	private int planCompared;
	private int planStatus;

	public TPlan() {
	}

	public TPlan(TUser TUser, String planContent, Date planStart, Date planEnd,
			Date planUpdate, int planParent, int planCompared, int planStatus) {
		this.TUser = TUser;
		this.planContent = planContent;
		this.planStart = planStart;
		this.planEnd = planEnd;
		this.planUpdate = planUpdate;
		this.planParent = planParent;
		this.planCompared = planCompared;
		this.planStatus = planStatus;
	}

	public TPlan(TUser TUser, TPhoto TPhoto, String planContent,
			Date planStart, Date planEnd, Date planUpdate, int planParent,
			int planCompared, int planStatus) {
		this.TUser = TUser;
		this.TPhoto = TPhoto;
		this.planContent = planContent;
		this.planStart = planStart;
		this.planEnd = planEnd;
		this.planUpdate = planUpdate;
		this.planParent = planParent;
		this.planCompared = planCompared;
		this.planStatus = planStatus;
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

	public String getPlanContent() {
		return this.planContent;
	}

	public void setPlanContent(String planContent) {
		this.planContent = planContent;
	}

	public Date getPlanStart() {
		return this.planStart;
	}

	public void setPlanStart(Date planStart) {
		this.planStart = planStart;
	}

	public Date getPlanEnd() {
		return this.planEnd;
	}

	public void setPlanEnd(Date planEnd) {
		this.planEnd = planEnd;
	}

	public Date getPlanUpdate() {
		return this.planUpdate;
	}

	public void setPlanUpdate(Date planUpdate) {
		this.planUpdate = planUpdate;
	}

	public int getPlanParent() {
		return this.planParent;
	}

	public void setPlanParent(int planParent) {
		this.planParent = planParent;
	}

	public int getPlanCompared() {
		return this.planCompared;
	}

	public void setPlanCompared(int planCompared) {
		this.planCompared = planCompared;
	}

	public int getPlanStatus() {
		return this.planStatus;
	}

	public void setPlanStatus(int planStatus) {
		this.planStatus = planStatus;
	}

}