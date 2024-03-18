package com.klef.jfsd.sdpproject.service;

import java.util.List;

import com.klef.jfsd.sdpproject.model.Faculty;
import com.klef.jfsd.sdpproject.model.Project;
import com.klef.jfsd.sdpproject.model.Student;
import com.klef.jfsd.sdpproject.model.Admin;


public interface AdminService
{
	public List<Faculty>viewallfaculty();
	public List<Student>viewallstudents();
	public List<Project> viewallprojects();
	public Faculty viewfacultybyid(int fid);
	public String deletefaculty(int fid);
	public String deletestudent(int sid);
	public String deleteproject(int pid);
	public Admin checkadminlogin(String uname, String pwd);
	
	public String addstudent(Student s);
	public long facultycount();
	public long studentcount();
	public int updatestatus(int fid,boolean status);

	public String insertproject(Project p);
	
	public Project viewprojectbyid(int pid);
	public long projectcount();
}