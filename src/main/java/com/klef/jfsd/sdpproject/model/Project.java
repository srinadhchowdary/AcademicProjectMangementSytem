package com.klef.jfsd.sdpproject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "project_table")
public class Project 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pid",unique = true, nullable = false)
	private int id;
	@Column(name = "pname",length = 40,unique = true, nullable = false)
	private String name;
	@Column(name = "pdesc",length = 1000,nullable = false)
	private String desc;
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
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", desc=" + desc + "]";
	}
	
}
