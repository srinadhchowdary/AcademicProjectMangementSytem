package com.klef.jfsd.sdpproject.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.klef.jfsd.sdpproject.service.AdminService;
import com.klef.jfsd.sdpproject.service.FacultyService;
import com.klef.jfsd.sdpproject.service.StudentService;
import com.klef.jfsd.sdpproject.model.Faculty;
import com.klef.jfsd.sdpproject.model.Project;
import com.klef.jfsd.sdpproject.model.Student;
import com.klef.jfsd.sdpproject.model.Admin;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class Clientcontroller {
	
	@Autowired
	private AdminService adminService;
	
	@Autowired
	private FacultyService facultyService;
	
	@Autowired
	private StudentService studentService;
	
	
	@GetMapping("/")
	public String main() {
		return "index";
	}
	@GetMapping("addfaculty")
	public String main1() {
		return "addfaculty";
	}
	
	@GetMapping("facultyreg")
	public ModelAndView facultyregistration()
	  {
	    ModelAndView mv = new ModelAndView();
	    mv.setViewName("facultyreg");
	    return mv;
	  }
	
	@GetMapping("facultylogin")
	public ModelAndView facultylogin() {
		ModelAndView mv = new ModelAndView();
	    mv.setViewName("facultylogin");
	    return mv;
	}
	
	@GetMapping("otp")
	public ModelAndView otpfaculty() {
		ModelAndView mv = new ModelAndView();
	    mv.setViewName("otp");
	    return mv;
	}
	

	@GetMapping("studentlogin")
	public ModelAndView studentlogin() {
		ModelAndView mv = new ModelAndView();
	    mv.setViewName("studentlogin");
	    return mv;
	}
	
	@PostMapping("checkstudentlogin")
	  public ModelAndView checkstudentlogin(HttpServletRequest request)
	  {
	   ModelAndView mv=new ModelAndView();
	   String email=request.getParameter("email");
	   String pwd=request.getParameter("pwd");
	   Student s = studentService.checkstudentlogin(email, pwd);
	   if(s!=null)
	   {
	    //session
	    HttpSession session = request.getSession();
	    mv.setViewName("studenthome");
	    session.setAttribute("sid", s.getId());  //sid is a session variable
	    session.setAttribute("sname",s.getName()); //sname is session variable
	   }
	   else
	   {
	   mv.setViewName("studentlogin"); 
	   mv.addObject("message","Login Failed");
	   }
	   return mv;
	  }
	@GetMapping("studenthome")
	  public ModelAndView studenthome(HttpServletRequest request)
	  {
	    ModelAndView mv = new ModelAndView();
	    mv.setViewName("studenthome");
	    HttpSession session = request.getSession();
	    int sid = (int)session.getAttribute("sid");  //fid is a session variable
	    String sname = (String)session.getAttribute("sname");  //ename is a session variable
	    
	    mv.addObject("sid",sid);
	    mv.addObject("sname",sname);
	    
	    return mv;
	    
	  }
	/*
	@GetMapping("studentupdateprofile")
	public ModelAndView updatestudent(HttpServletRequest request)
	{
	  ModelAndView mv = new ModelAndView();
	  
	  HttpSession session = request.getSession();
	  
	  mv.setViewName("updatestudentprofile");
	  
	  mv.addObject("sid", session.getAttribute("sid"));
	  mv.addObject("sname", session.getAttribute("sname"));
	  
	  int id = (int) session.getAttribute("sid");
	  
	  Student s = studentService.viewstudentbyid(id);
	  
	  mv.addObject("s", s);
	  
	  return mv;
	}

	@PostMapping("updateprofile")
	public ModelAndView updateaction(HttpServletRequest request)
	{
	  String msg = null;
	  ModelAndView mv = new ModelAndView();
	    HttpSession session = request.getSession();
	  
	  mv.addObject("fid", session.getAttribute("fid"));
	  mv.addObject("fname", session.getAttribute("fname"));
	  
	  int id = (int) session.getAttribute("fid");
	  
	 try
	 {
	   String name = request.getParameter("name");
	   String dob = request.getParameter("dob");
	   String dept = request.getParameter("dept");
	   String sal = request.getParameter("salary");
	   double salary = Double.parseDouble(sal);
	   String email = request.getParameter("email");
	   String pwd = request.getParameter("pwd");
	   
	   String location = request.getParameter("location");
	   String contact = request.getParameter("contact");
	   
	   Faculty f = new Faculty();
	    f.setId(id);
	    f.setName(name);
	    f.setDateofbirth(dob);
	    f.setDepartment(dept);
	    f.setSalary(salary);
	    f.setEmail(email);
	    f.setPassword(pwd);
	    f.setLocation(location);
	    f.setContact(contact);
	    
	    
	    msg = facultyService.updatefaculty(f);
	    
	    mv.setViewName("facultylogin");
	    mv.addObject("message",msg);
	   
	 }
	 catch(Exception e)
	 {
	   msg = e.getMessage();
	   
	   mv.setViewName("updateerror");
	    mv.addObject("message",msg);
	 }
	  return mv;
	}*/
	@GetMapping("projectselection")
	public ModelAndView projectselection() {
		ModelAndView mv = new ModelAndView();
	    mv.setViewName("projectselection");
	    return mv;
	}
	@GetMapping("mentorselection")
	public ModelAndView mentorselection() {
		ModelAndView mv = new ModelAndView();
	    mv.setViewName("mentorselection");
	    return mv;
	}
	@GetMapping("teamformation")
	public ModelAndView teamformation() {
		ModelAndView mv = new ModelAndView();
	    mv.setViewName("teamformation");
	    return mv;
	}
	
	
	
	@PostMapping("checkfacultylogin")
	  public ModelAndView checkfacultylogin(HttpServletRequest request)
	  {
	   ModelAndView mv=new ModelAndView();
	   String email=request.getParameter("email");
	   String pwd=request.getParameter("pwd");
	   Faculty f=facultyService.checkfacultylogin(email, pwd);
	   if(f!=null)
	   {
	    //session
	    HttpSession session = request.getSession();
	    mv.setViewName("facultyhome");
	    session.setAttribute("fid", f.getId());  //fid is a session variable
	    session.setAttribute("fname",f.getName()); //fname is session variable
	   }
	   else
	   {
	   mv.setViewName("facultylogin"); 
	   mv.addObject("message","Login Failed");
	   }
	   return mv;
	  }
	
	
	
	@GetMapping("facultyhome")
	  public ModelAndView facultyhome(HttpServletRequest request)
	  {
	    ModelAndView mv = new ModelAndView();
	    mv.setViewName("facultyhome");
	    HttpSession session = request.getSession();
	    int fid = (int)session.getAttribute("fid");  //fid is a session variable
	    String fname = (String)session.getAttribute("fname");  //ename is a session variable
	    
	    mv.addObject("fid",fid);
	    mv.addObject("fname",fname);
	    
	    return mv;
	    
	  }
	
	
	@GetMapping("updateprofile")
	public ModelAndView updatefaculty(HttpServletRequest request)
	{
	  ModelAndView mv = new ModelAndView();
	  
	  HttpSession session = request.getSession();
	  
	  mv.setViewName("updateprofile");
	  
	  mv.addObject("fid", session.getAttribute("fid"));
	  mv.addObject("fname", session.getAttribute("fname"));
	  
	  int id = (int) session.getAttribute("fid");
	  
	  Faculty f = facultyService.viewfacultybyid(id);
	  
	  mv.addObject("f", f);
	  
	  return mv;
	}

	@PostMapping("updateprofile")
	public ModelAndView updateaction(HttpServletRequest request)
	{
	  String msg = null;
	  ModelAndView mv = new ModelAndView();
	    HttpSession session = request.getSession();
	  
	  mv.addObject("fid", session.getAttribute("fid"));
	  mv.addObject("fname", session.getAttribute("fname"));
	  
	  int id = (int) session.getAttribute("fid");
	  
	 try
	 {
	   String name = request.getParameter("name");
	   String dob = request.getParameter("dob");
	   String dept = request.getParameter("dept");
	   String sal = request.getParameter("salary");
	   double salary = Double.parseDouble(sal);
	   String email = request.getParameter("email");
	   String pwd = request.getParameter("pwd");
	   
	   String location = request.getParameter("location");
	   String contact = request.getParameter("contact");
	   
	   Faculty f = new Faculty();
	    f.setId(id);
	    f.setName(name);
	    f.setDateofbirth(dob);
	    f.setDepartment(dept);
	    f.setSalary(salary);
	    f.setEmail(email);
	    f.setPassword(pwd);
	    f.setLocation(location);
	    f.setContact(contact);
	    
	    
	    msg = facultyService.updatefaculty(f);
	    
	    mv.setViewName("facultylogin");
	    mv.addObject("message",msg);
	   
	 }
	 catch(Exception e)
	 {
	   msg = e.getMessage();
	   
	   mv.setViewName("updateerror");
	    mv.addObject("message",msg);
	 }
	  return mv;
	}
	
	
	
	@GetMapping("adminlogin")
	public ModelAndView adminlogin() {
		ModelAndView mv = new ModelAndView();
	    mv.setViewName("adminlogin");
	    return mv;
	}
	
	@PostMapping("checkadminlogin")
	  public ModelAndView checkadminlogin(HttpServletRequest request)
	  {
	   ModelAndView mv=new ModelAndView();
	   String uname=request.getParameter("uname");
	   String pwd=request.getParameter("pwd");
	   Admin a=adminService.checkadminlogin(uname, pwd);
	   if(a!=null)
	   {
	    mv.setViewName("adminhome");
	   }
	   else
	   {
	    mv.setViewName("adminlogin");
	    mv.addObject("message","Login Failed");
	   }
	   return mv;
	  }
	
	
	@GetMapping("viewallfaculty")
	  public ModelAndView viewallfaculty()
	  {
	   ModelAndView mv=new ModelAndView();
	   mv.setViewName("viewallfaculty");
	   List<Faculty> flist =adminService.viewallfaculty();
	   mv.addObject("fdata", flist);
	      return mv;
	  }
	
	@GetMapping("viewallstudents")
	  public ModelAndView viewallstudents()
	  {
	   ModelAndView mv=new ModelAndView();
	   mv.setViewName("viewallstudents");
	   List<Student> slist =adminService.viewallstudents();
	   mv.addObject("sdata", slist);
	      return mv;
	  }
	@GetMapping("viewallprojects")
	  public ModelAndView viewallprojects()
	  {
	   ModelAndView mv=new ModelAndView();
	   mv.setViewName("viewallprojects");
	   List<Project> plist =adminService.viewallprojects();
	   mv.addObject("pdata", plist);
	      return mv;
	  }
	
	@GetMapping("view")
	  public ModelAndView viewempdemo(@RequestParam("id") int fid)
	  {
		Faculty faculty = adminService.viewfacultybyid(fid);
	  ModelAndView mv = new ModelAndView();
	  mv.setViewName("viewfacultybyid");
	  mv.addObject("faculty", faculty);
	  return mv;
	}
	
	@PostMapping("insertfaculty")
	public ModelAndView insertaction(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
	    String msg = null;
	    
	    try {
	    	 String name = request.getParameter("name");
	    	    String gender = request.getParameter("gender");
	    	    String dob = request.getParameter("dob");
	    	    String dept = request.getParameter("dept");
	    	    String sal = request.getParameter("salary");
	    	    double salary = Double.parseDouble(sal);
	    	    String email = request.getParameter("email");
	    	    String pwd = request.getParameter("pwd");
	    	    String exp = request.getParameter("experience");
	    	    String subjects = request.getParameter("subjects");
	    	    String location = request.getParameter("location");
	    	    String contact = request.getParameter("contact");
	    	    
	    	    Faculty faculty = new Faculty();
	    	        faculty.setName(name);
	    	        faculty.setGender(gender);
	    	        faculty.setDateofbirth(dob);
	    	        faculty.setDepartment(dept);
	    	        faculty.setSalary(salary);
	    	        faculty.setEmail(email);
	    	        faculty.setPassword(pwd);
	    	        faculty.setExperience(exp);
	    	        faculty.setSubjects(subjects);
	    	        faculty.setLocation(location);
	    	        faculty.setContact(contact);
	    	        faculty.setActive(true);
	    	        
	    	        msg=facultyService.addfaculty(faculty);
	    	        mv.setViewName("facultymsg");
	    	        mv.addObject("message",msg);
	    }
	    catch(Exception e) {
	    	  mv.setViewName("displayerror");
	    	  msg=e.getMessage();
	    	  mv.addObject("message",msg);
	    	  }
	    return mv;
	}
	
	
	 @GetMapping("adminhome")
	  public ModelAndView adminhome()
	  {
		 
		 long facultycount = adminService.facultycount();
		 long studentcount  = adminService.studentcount();
	    ModelAndView mv = new ModelAndView();
	    mv.setViewName("adminhome");
	    mv.addObject("fcount", facultycount);
	    mv.addObject("scount", studentcount);
	    return mv;
	  }
	
	 
	 @GetMapping("deletefaculty")
	 public ModelAndView deletefaculty()
	 {
	   ModelAndView mv = new ModelAndView();
	   mv.setViewName("deletefaculty");
	   
	   List<Faculty> flist =  adminService.viewallfaculty();
	   
	   mv.addObject("facultydata", flist);
	   
	   return mv;
	 }
	 
	 
	 
	 @GetMapping("delete/{id}")
	 public String deleteaction(@PathVariable("id") int fid)
	 {
	   adminService.deletefaculty(fid);
	   return "redirect:/deletefaculty";
	 }
	 
	 @GetMapping("deletestudent")
	 public ModelAndView deletestudent()
	 {
	   ModelAndView mv = new ModelAndView();
	   mv.setViewName("deletestudent");
	   
	   List<Student> slist =  adminService.viewallstudents();
	   mv.addObject("studentdata", slist);
	   return mv;
	 }
	 @GetMapping("delete2/{id}")
	 public String deleteaction2(@PathVariable("id") int sid)
	 {
	   adminService.deletestudent(sid);
	   return "redirect:/deletestudent";
	 }
	 
	 @GetMapping("deleteproject")
	 public ModelAndView deleteproject()
	 {
	   ModelAndView mv = new ModelAndView();
	   mv.setViewName("deleteproject");
	   
	   List<Project> plist =  adminService.viewallprojects();
	   
	   mv.addObject("projectdata", plist);
	   
	   return mv;
	 }
	 
	 @GetMapping("delete3/{id}")
	 public String deleteaction3(@PathVariable("id") int pid)
	 {
	   adminService.deleteproject(pid);
	   return "redirect:/deleteproject";
	 }
	 
	 @GetMapping("addstudent")
	 public String addstudent(Model m) { //pojo class means model
	 	//model -> to create a form 
	 	
	 	m.addAttribute("student",new Student());
	 	return "addstudent";
	 }
	 
	 @PostMapping("insertstudent")
	 public ModelAndView insertstudent(@ModelAttribute("student") Student s)
	 {
	   ModelAndView mv = new ModelAndView();
	   
	   mv.setViewName("studentmsg");
	   
	   String msg = adminService.addstudent(s);
	   mv.addObject("message", msg);
	   
	   return mv;
	 }
	 
	 @GetMapping("updatestatus")
	 public ModelAndView updatestatus()
	 {
	   ModelAndView mv = new ModelAndView();
	   mv.setViewName("updatestatus");
	   
	   List<Faculty> facultylist = adminService.viewallfaculty();
	   mv.addObject("facultydata", facultylist);
	   
	   return mv;
	 }
	 
	 
	 @GetMapping("setstatus")
	 public ModelAndView setstatus(@RequestParam("id")int fid,@RequestParam("status") boolean status)
	 {
	 	int n = adminService.updatestatus(fid, status);
	     
	     ModelAndView mv = new ModelAndView();
	     mv.setViewName("updatestatus");
	     
	     List<Faculty> flist = adminService.viewallfaculty();
	     mv.addObject("facultydata", flist);
	     
	     if(n>0)
	     {
	       mv.addObject("message", "Status Updated Successfully");
	     }
	     else
	     {
	       mv.addObject("message", "Failed to Update Status");
	     }
	     return mv;
	 }
	 
	 
	 @GetMapping("facultylogout")
	 public ModelAndView facultylogout() {
	 	ModelAndView mv=new ModelAndView();
	 	mv.setViewName("facultylogin");
	 	mv.addObject("message", "Logout Successfully");
	 	return mv;
	 }
	 @GetMapping("addproject")
		public String addprojects()
		{
			return "addproject";
		}
	 @PostMapping("insertproject")
		public ModelAndView insertproject(HttpServletRequest request)
		{
			ModelAndView mv = new ModelAndView();
			String msg = null;
			try 
			{
				String pid = request.getParameter("id");
				int id = Integer.parseInt(pid);
				String name = request.getParameter("name");
				String desc = request.getParameter("desc");
				
				
				Project p = new Project();
				p.setId(id);
				p.setName(name);
				p.setDesc(desc);
				msg = adminService.insertproject(p);
				mv.setViewName("addproject");
				mv.addObject("message", msg);
			}
			catch (Exception e) 
			{
				mv.setViewName("showerror");
				msg = e.getMessage();
				mv.addObject("message", msg);
			}
			return mv;
		}
	 
}
