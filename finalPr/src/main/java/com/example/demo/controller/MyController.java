package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Appraisal;
import com.example.demo.entity.Employee;
import com.example.demo.entity.Leave;
import com.example.demo.entity.Salary;
import com.example.demo.service.EmployeeService;

@Controller
public class MyController {

	 @Autowired
		private EmployeeService employeeService;

@RequestMapping("/")
public String home(HttpSession session)
{
	session.invalidate();

return "home";

}


@RequestMapping("/welcome")
public ModelAndView mainpage(@RequestParam("name") String name,@RequestParam("password") String password, HttpSession session)
{
ModelAndView mv = new ModelAndView();
List<Employee>list= employeeService.loginUser(name,password);

if(list.isEmpty())
{
	mv.setViewName("home");
	mv.addObject("failmsg","login fail, try again!!!");
	return mv;
}
Employee emp=list.get(0);
int id=emp.getId();
session.setAttribute("id", id);
session.setAttribute("name", name);
mv.addObject("list", list);
mv.setViewName("welcome");

return mv;

}


@RequestMapping("/salarypage")
public ModelAndView salaryPage( HttpSession session)
{
	
	int id=(int) session.getAttribute("id");
	String name=(String) session.getAttribute("name");
ModelAndView mv = new ModelAndView();
List<Salary>list= employeeService.getSalary(id);

if(name == null)
{
	mv.setViewName("home");
	return mv;
}
else {
mv.addObject("salaries", list);
mv.setViewName("salarypage");

return mv;
}
}


@RequestMapping("/leavepage")
public ModelAndView leavePage( HttpSession session)
{
	
	int id=(int) session.getAttribute("id");
ModelAndView mv = new ModelAndView();
int day= employeeService.getAvailableLeave(id);
session.setAttribute("leavedays", day);

if(day<=0)
{
	mv.addObject("leavemsg","cant apply for leave");
	
}

mv.addObject("leaves", day);
mv.setViewName("leavepage");

return mv;

}

@RequestMapping("/leavesuccess")
public ModelAndView leaveSuccess(@RequestParam("date") String date,@RequestParam("description") String description, HttpSession session)
{
	
	int id=(int) session.getAttribute("id");
	int day=((int) session.getAttribute("leavedays"))-1;
	
ModelAndView mv = new ModelAndView();
mv.setViewName("leavepage");
if(day<=0)
{
	mv.addObject("leavemsg","cant apply for leave");
	return mv;
	
}
int insert= employeeService.getLeave(id,date,description);

employeeService.updateLeaveDay(id,day);




session.setAttribute("leavedays", day);

mv.addObject("leaves", day);



return mv;

}



@RequestMapping("/leavedetails")
public ModelAndView leavedetails( HttpSession session)
{

	int id=(int) session.getAttribute("id");
	List<Leave> leaves=employeeService.getLeaveDetails(id);
	ModelAndView mv = new ModelAndView();
	
	mv.addObject("viewLeave", leaves);
	mv.setViewName("leavedetails");
	return mv;
}



@RequestMapping("/appraisalpage")
public ModelAndView getAppraisal( HttpSession session)
{

	int id=(int) session.getAttribute("id");
	Appraisal appraisal=employeeService.getAppraisal(id);
	ModelAndView mv = new ModelAndView();
	mv.addObject("app",appraisal);
	mv.setViewName("appraisalpage");
	return mv;
}

@RequestMapping("/backtohome")
public ModelAndView backToHome()
{
	ModelAndView mv=new ModelAndView("welcome");
	return mv;
}



}