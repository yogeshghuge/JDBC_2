package com.model;

public class Employee {
	private int eid;
	private String ename;
	private String edesignation;
	private String ecompany;
	private double esalary;
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", edesignation=" + edesignation + ", ecompany=" + ecompany
				+ ", esalary=" + esalary + "]";
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEdesignation() {
		return edesignation;
	}
	public void setEdesignation(String edesignation) {
		this.edesignation = edesignation;
	}
	public String getEcompany() {
		return ecompany;
	}
	public void setEcompany(String ecompany) {
		this.ecompany = ecompany;
	}
	public double getEsalary() {
		return esalary;
	}
	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}
	public void setCity1(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setCity(String string) {
		// TODO Auto-generated method stub
		
	}
}
