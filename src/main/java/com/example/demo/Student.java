package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Student {
	@Id	
    private String rollnumber;
    private String name;
    private String dob;
    private String year;
    private String branch;
    private String phonenumber;
    private String emailid;
    @Column(name="studentphoto",length=1000000)
    private byte[] image;
    
   
    
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String rollnumber, String name, String dob, String year, String branch, String phonenumber,
			String emailid, byte[] image) {
		super();
		this.rollnumber = rollnumber;
		this.name = name;
		this.dob = dob;
		this.year = year;
		this.branch = branch;
		this.phonenumber = phonenumber;
		this.emailid = emailid;
		this.image = image;
	}
	public Student(int id, String rollnumber, String name, String dob, String year, String branch, String phonenumber,
			String emailid, byte[] image) {
		super();
		this.rollnumber = rollnumber;
		this.name = name;
		this.dob = dob;
		this.year = year;
		this.branch = branch;
		this.phonenumber = phonenumber;
		this.emailid = emailid;
		this.image = image;
	}
	public String getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(String rollnumber) {
		this.rollnumber = rollnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}    
    
    
}   