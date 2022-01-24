package com.xworkz.Company.CompanyEntity;

public class CompanyEntity {
	String cname ;
	int cId ;
	String location ;
	float no_Of_emp ;
	float no_of_branches;
	String grade  ;
	public CompanyEntity(String cname, int cId, String location, float no_Of_emp, float no_of_branches, String grade) {
		super();
		this.cname = cname;
		this.cId = cId;
		this.location = location;
		this.no_Of_emp = no_Of_emp;
		this.no_of_branches = no_of_branches;
		this.grade = grade;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public float getNo_Of_emp() {
		return no_Of_emp;
	}
	public void setNo_Of_emp(float no_Of_emp) {
		this.no_Of_emp = no_Of_emp;
	}
	public float getNo_of_branches() {
		return no_of_branches;
	}
	public void setNo_of_branches(float no_of_branches) {
		this.no_of_branches = no_of_branches;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "CompanyEntity [cname=" + cname + ", cId=" + cId + ", location=" + location + ", no_Of_emp=" + no_Of_emp
				+ ", no_of_branches=" + no_of_branches + ", grade=" + grade + "]";
	}
	
}
