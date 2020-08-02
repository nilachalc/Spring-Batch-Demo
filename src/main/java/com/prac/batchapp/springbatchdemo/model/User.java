package com.prac.batchapp.springbatchdemo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User_Info")
public class User {
	@Id
	private Integer id;
	private String name;
	private String department;
	private String address;
	private String emailId;
	private String mobile;
	
	public User() {}
	
	public User(Integer id, String name, String department, String address, String emailId, String mobile) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.address = address;
		this.emailId = emailId;
		this.mobile = mobile;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
}
