package com.te.springmvc.emp.dao;

import java.util.List;

import com.te.springmvc.emp.dto.EmployeeDto;

public interface EmpDao{
 
public boolean addEmployee(EmployeeDto dto,String name, String id);
	
	public List<EmployeeDto > getEmployee();
	
	public boolean deleteEmployee(String name);
	

}
