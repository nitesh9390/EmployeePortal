package com.example.demo.service;

import java.util.List;


import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Appraisal;
import com.example.demo.entity.Employee;
import com.example.demo.entity.Leave;
import com.example.demo.entity.Salary;
import com.example.demo.mapper.EmployeeMapper;

@Service
public class EmployeeDao implements EmployeeService {
	//update this methods also  task 2
	@Autowired
	private EmployeeMapper employeeMapper;

	@Transactional(readOnly = true)
	
	public List<Employee> loginUser(String name,String password) {
		// TODO Auto-generated method stub
		return employeeMapper.loginUser(name,password);
	}
	
	@Override
	public List<Salary> getSalary(int id) {
		// TODO Auto-generated method stub
		return employeeMapper.getSalary(id);
	}
	
	
	@Override
	public int getAvailableLeave(int id) {
		// TODO Auto-generated method stub
		return employeeMapper.getAvailableLeave(id);
	}
	
	@Override
	public List<Leave> getLeaveDetails(int id)
	{
		return employeeMapper.getLeaveDetails(id);
		
	}
	
	@Override
	public int getLeave(int id,String date,String description)
	{
		return employeeMapper.getLeave( id,date,description);
		
	}
	
	
	@Override
	public void updateLeaveDay(int id,int day)
	{
		employeeMapper.updateLeaveDay(id,day);
	}
	
	
	@Override
	public Appraisal getAppraisal(int id)
	{
		return employeeMapper.getAppraisal(id);
		
	}
	
	
	
	
	

	

}
