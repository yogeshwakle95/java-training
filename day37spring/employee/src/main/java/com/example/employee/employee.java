package com.example.employee;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class employee {
	@Id
	private String email,name,address;
	private int phone,eid;
	private double salary;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public employee(String email, String name, String address, int phone, int eid, double salary) {
		//super();
		this.email = email;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.eid = eid;
		this.salary = salary;
	}
	
	
	public employee()
	{
		
	}
	
	
}
