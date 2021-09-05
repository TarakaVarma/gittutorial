package com.te.springmvc.emp.service;

import java.util.List;

import com.te.springmvc.emp.dto.EmployeeDto;

public interface Service {
public boolean addEmployee(EmployeeDto dto);
	
	public List<EmployeeDto> getEmployee();
	
	public boolean deleteEmployee(String name);
	

	 
	
}
