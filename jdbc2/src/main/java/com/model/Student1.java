package com.model;

public class Student1 {
	
	private int id;
	private String name;
	private String city;
	private double percetnage;
	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", city=" + city + ", percetnage=" + percetnage + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getPercentage() {
		return percetnage;
	}
	public void setPercentage(double percentage) {
		this.percetnage = percentage;
	}
}
