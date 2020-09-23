package com.example.demo;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Staff {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String department;
	@Embedded
	private Address staffAddress;
	public Staff() {}
	public Staff(String name, String department, Address staffAddress) {
		this.name = name;
		this.department = department;
		this.staffAddress = staffAddress;
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
	public Address getStaffAddress() {
		return staffAddress;
	}
	public void setStaffAddress(Address staffAddress) {
		this.staffAddress = staffAddress;
	}
	public Long getId() {
		return id;
	}
}
