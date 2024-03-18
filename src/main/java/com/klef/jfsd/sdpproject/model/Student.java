package com.klef.jfsd.sdpproject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student_table")
public class Student {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //identity
    @Column(name="student_id") 
    private int id;
    @Column(name="student_name",nullable=false,length = 50) //
    private String name;
    @Column(name="student_gender",nullable=false,length = 10)
    private String gender;
    @Column(name="student_email",nullable=false,unique = true,length = 30)
    private String email;
    @Column(name="student_password",nullable=false,length = 30)
    private String password;
    @Column(name="student_address",nullable=false)
    private String address;
    @Column(name="student_contactno",nullable=false,unique = true)
    private String contactno;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", email=" + email + ", password="
				+ password + ", address=" + address + ", contactno=" + contactno + "]";
	}
	

}
