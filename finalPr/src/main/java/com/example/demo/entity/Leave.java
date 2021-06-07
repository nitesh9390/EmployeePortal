package com.example.demo.entity;
import lombok.Data;

@Data
public class Leave {
	
	private int id;
	//private int days;
	private String date;
	private String description;
	
	
	public Leave() {
		super();
	}
	
	
	/*public Leave(int id, int days) {
		super();
		this.id = id;
		this.days = days;
	}*/
	
	
	public Leave(int id, String date, String description) {
		super();
		this.id = id;
		this.date = date;
		this.description = description;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	/*public int getDays() {
		return days;
	}


	public void setDays(int days) {
		this.days = days;
	}*/


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public String toString() {
		return "Leave [id=" + id + ", days=" + "unknown" + ", date=" + date + ", description=" + description + "]";
	}
	
	
	
	
	

}
