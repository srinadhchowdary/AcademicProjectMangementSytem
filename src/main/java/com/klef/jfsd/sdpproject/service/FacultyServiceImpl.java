package com.klef.jfsd.sdpproject.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.sdpproject.model.Faculty;
import com.klef.jfsd.sdpproject.repository.FacultyRepository;
import com.klef.jfsd.sdpproject.model.Faculty;


@Service
public class FacultyServiceImpl implements FacultyService {
	
	@Autowired
	private FacultyRepository facultyRepository;

	
	@Override
	public String addfaculty(Faculty faculty) {
		facultyRepository.save(faculty);
		return "Faculty Added Successfully";
	}

	
	
	@Override
	public String updatefaculty(Faculty faculty) {
	Faculty f = facultyRepository.findById(faculty.getId()).get();    
	        
	        f.setName(faculty.getName());
	        f.setDateofbirth(faculty.getDateofbirth());
	        f.setDepartment(faculty.getDepartment());
	        f.setSalary(faculty.getSalary());
	        f.setEmail(faculty.getEmail());
	        f.setPassword(faculty.getPassword());
	        f.setLocation(faculty.getLocation());
	        f.setContact(faculty.getContact());
	        f.setDepartment(faculty.getDepartment());
//	        f.setExperience(faculty.getExperience());
//	        f.setSubjects(faculty.getSubjects());
	      facultyRepository.save(f);
	      
	      return "Faculty Updated Successfully";
		}


	
	@Override
	public Faculty viewfacultybyid(int fid) {
		Optional<Faculty> obj =  facultyRepository.findById(fid);
	    if(obj.isPresent())
	    {
	      Faculty fac = obj.get();
	      
	      return fac;
	    }
	    else
	    {
	      return null;
	    }
	}

	
	
	@Override
	public Faculty checkfacultylogin(String email, String pwd)
	{
		return facultyRepository.checkfacultylogin(email, pwd);
	}

}
