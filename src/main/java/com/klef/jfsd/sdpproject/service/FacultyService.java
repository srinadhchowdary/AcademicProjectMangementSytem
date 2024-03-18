package com.klef.jfsd.sdpproject.service;

import com.klef.jfsd.sdpproject.model.Faculty;

public interface FacultyService {

	public String addfaculty(Faculty faculty);
	public String updatefaculty(Faculty faculty);
	public Faculty viewfacultybyid(int fid);
	public  Faculty checkfacultylogin(String email , String pwd);
}
