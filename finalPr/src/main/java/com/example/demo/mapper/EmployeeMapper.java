package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.entity.Appraisal;
import com.example.demo.entity.Employee;
import com.example.demo.entity.Leave;
import com.example.demo.entity.Salary;

@Mapper
public interface EmployeeMapper {
	
	@Select("select * from employeedetial where name=#{name} and password=#{password} ")
	List<Employee> loginUser(String name,String password);
	
	
	
	@Select("select * from employeesalary where id=#{id} order by timestamp desc")
	List<Salary> getSalary(int id);
	
	
	@Select("select days from leaveavailable where id=#{id}")
	int getAvailableLeave(int id);
	
	
	@Select("select * from leavetable where id=#{id} order by date desc")
	List<Leave> getLeaveDetails(int id);
	
	
	@Insert("insert into leavetable(id,date,description) values(#{id},#{date},#{description})")
	int getLeave(int id,String date,String description);
	
	
	@Update("update leaveavailable set days=#{days} where id=#{id}")
	public void updateLeaveDay(int id,int days);
	
	
	
	@Select("select * from appraisaltable where id=#{id}")
	Appraisal getAppraisal(int id);
	
	
	
	

}
