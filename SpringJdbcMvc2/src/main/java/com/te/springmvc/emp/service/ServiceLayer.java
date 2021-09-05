package com.te.springmvc.emp.service;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.te.springmvc.emp.dao.*;
import com.te.springmvc.emp.dto.EmployeeDto;

@Component
public class ServiceLayer   {
ApplicationContext context=new ClassPathXmlApplicationContext("com/te/springmvc/emp/service/Config.xml");
	
	EmpDaoImpl dao=context.getBean("daoOperationimpl",  EmpDaoImpl.class );
	public boolean addEmployee(EmployeeDto dto) {
		
		return dao.addEmployee(dto, dto.getName(), dto.getId());
	}

	public List<EmployeeDto> getEmployee() {
      List<EmployeeDto> employeeDetails=dao.getEmployee();
	
		return employeeDetails;
	}

	public boolean deleteEmployee(String name) {
      dao.deleteEmployee(name);
		
		return true;
	}


	}
	


