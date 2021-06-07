package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Appraisal;
import com.example.demo.entity.Employee;
import com.example.demo.entity.Leave;
import com.example.demo.entity.Salary;
import com.example.demo.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

public interface EmployeeService {
	
	
	
	List<Employee> loginUser(String name,String password);
	
	
	
	List<Salary> getSalary(int id);
	
	
	
	int getAvailableLeave(int id);
	
	
	
	List<Leave> getLeaveDetails(int id);
	
	
	
	int getLeave(int id,String date,String description);
	
	
	void updateLeaveDay(int id,int day);
	
	
	Appraisal getAppraisal(int id);
	
	
   
}
