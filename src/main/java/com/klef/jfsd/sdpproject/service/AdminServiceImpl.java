package com.klef.jfsd.sdpproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.sdpproject.model.Admin;
import com.klef.jfsd.sdpproject.model.Faculty;
import com.klef.jfsd.sdpproject.model.Project;
import com.klef.jfsd.sdpproject.model.Student;
import com.klef.jfsd.sdpproject.repository.AdminRepository;
import com.klef.jfsd.sdpproject.repository.FacultyRepository;
import com.klef.jfsd.sdpproject.repository.ProjectRepository;
import com.klef.jfsd.sdpproject.repository.StudentRepository;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository adminRepository;
	
	@Autowired
	private FacultyRepository facultyRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private ProjectRepository projectRepository;
	@Override
	public List<Faculty> viewallfaculty() {
		
		return facultyRepository.findAll();
	}

	@Override
	public Faculty viewfacultybyid(int fid) {
		
		Optional<Faculty> obj =  facultyRepository.findById(fid);
        if(obj.isPresent())
        {
          Faculty faculty = obj.get();
          
          return faculty;
        }
        else
        {
          return null;
        }
	}

	@Override
	public String deletefaculty(int fid) {
		Optional<Faculty> obj =  facultyRepository.findById(fid);
	       
	       String msg = null;
	       
	       if(obj.isPresent())
	       {
	         Faculty faculty = obj.get();
	         facultyRepository.delete(faculty);
	         msg = "Faculty Deleted Successfully";
	       }
	       else
	       {
	         msg = "Faculty Not Found";
	       }
	       return msg;
	}
	@Override
	public String deletestudent(int sid) {
		Optional<Student> obj =  studentRepository.findById(sid);
	       
	       String msg = null;
	       
	       if(obj.isPresent())
	       {
	         Student student= obj.get();
	         studentRepository.delete(student);
	         msg = "Student Deleted Successfully";
	       }
	       else
	       {
	         msg = "Student Not Found";
	       }
	       return msg;
	}

	@Override
	public Admin checkadminlogin(String uname, String pwd) {
		
		return adminRepository.checkadminlogin(uname, pwd);
	}

	@Override
	public String addstudent(Student s) {
		studentRepository.save(s);
		return "Student Added Successfully";
	}
	

	@Override
	public long facultycount() {
		return facultyRepository.count();
	}

	@Override
	public long studentcount() {
		return studentRepository.count();
		}

	@Override
	public int updatestatus(int fid, boolean status) {
		return adminRepository.updatestatus(fid, status);
		
	}

	@Override
	public String insertproject(Project p) {
		projectRepository.save(p);
		return "Project Added Successfully";
	}

	@Override
	public List<Project> viewallprojects() {
		return projectRepository.findAll();
	}

//	@Override
//	public Project viewprojectbyid(int pid) {
//		Optional<Project> obj = projectRepository.findById(pid);
//		if(obj.isPresent())
//		{
//			Project p = obj.get();
//			return p;
//		}
//		return null;
//	}

	@Override
	public String deleteproject(int pid) {
		Optional<Project> obj = projectRepository.findById(pid);
		if(obj.isPresent())
		{
			Project p = obj.get();
			projectRepository.delete(p);
			return "Project Deleted Successfully";
		}
		return "Project ID Not found!!!";
	}

	@Override
	public long projectcount() {
		return projectRepository.count();
	}

	@Override
	public List<Student> viewallstudents() {
		return studentRepository.findAll();
	}

	@Override
	public Project viewprojectbyid(int pid) {
		// TODO Auto-generated method stub
		return null;
	}
	
	}
