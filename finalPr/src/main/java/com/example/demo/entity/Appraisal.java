package com.example.demo.entity;

public class Appraisal {
	private int id;
	private  String position ;
	private  String department;
	private  String supervisor;
	private  String reviewfrom;
	private  String reviewend;
	private  String performancereview;
	
	
	public Appraisal() {
		super();
	}


	public Appraisal(int id, String position, String department, String supervisor, String reviewfrom, String reviewend,
			String performancereview) {
		super();
		this.id = id;
		this.position = position;
		this.department = department;
		this.supervisor = supervisor;
		this.reviewfrom = reviewfrom;
		this.reviewend = reviewend;
		this.performancereview = performancereview;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String getSupervisor() {
		return supervisor;
	}


	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}


	public String getReviewfrom() {
		return reviewfrom;
	}


	public void setReviewfrom(String reviewfrom) {
		this.reviewfrom = reviewfrom;
	}


	public String getReviewend() {
		return reviewend;
	}


	public void setReviewend(String reviewend) {
		this.reviewend = reviewend;
	}


	public String getPerformancereview() {
		return performancereview;
	}


	public void setPerformancereview(String performancereview) {
		this.performancereview = performancereview;
	}


	@Override
	public String toString() {
		return "Appraisal [id=" + id + ", position=" + position + ", department=" + department + ", supervisor="
				+ supervisor + ", reviewfrom=" + reviewfrom + ", reviewend=" + reviewend + ", performancereview="
				+ performancereview + "]";
	}
	
	
	
	

}
