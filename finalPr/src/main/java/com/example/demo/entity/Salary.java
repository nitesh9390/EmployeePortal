package com.example.demo.entity;

import java.security.Timestamp;

public class Salary {
	
	private int id;
	private float salary;
	private String timestamp;
	
	
	public Salary() {
		super();
	}
	
	
	public Salary(int id, float salary, String timestamp) {
		super();
		this.id = id;
		this.salary = salary;
		this.timestamp = timestamp;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}


	@Override
	public String toString() {
		return "Salary [id=" + id + ", salary=" + salary + ", timestamp=" + timestamp + "]";
	}
	
	

}
