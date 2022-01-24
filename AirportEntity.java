package com.xworkz.Company.AirportDao.AirportEntity;

public class AirportEntity {
	int AP_id;
	String AP_name;
	String location;
	float no_of_emp;
	char grade;
	public AirportEntity(int aP_id, String aP_name, String location, float no_of_emp, char grade) {
		super();
		AP_id = aP_id;
		AP_name = aP_name;
		this.location = location;
		this.no_of_emp = no_of_emp;
		this.grade = grade;
	}
	public AirportEntity() {
		// TODO Auto-generated constructor stub
	}
	public int getAP_id() {
		return AP_id;
	}
	public void setAP_id(int aP_id) {
		AP_id = aP_id;
	}
	public String getAP_name() {
		return AP_name;
	}
	public void setAP_name(String aP_name) {
		AP_name = aP_name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public float getNo_of_emp() {
		return no_of_emp;
	}
	public void setNo_of_emp(float no_of_emp) {
		this.no_of_emp = no_of_emp;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "AirportEntity [AP_id=" + AP_id + ", AP_name=" + AP_name + ", location=" + location + ", no_of_emp="
				+ no_of_emp + ", grade=" + grade + "]";
	}
	
	

}
