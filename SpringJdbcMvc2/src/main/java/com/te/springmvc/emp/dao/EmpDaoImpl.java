package com.te.springmvc.emp.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.te.springmvc.emp.dto.EmployeeDto;

public class EmpDaoImpl {
	JdbcTemplate template;


	public boolean addEmployee(EmployeeDto dto,String name, String id) {
		String query="insert into user values(?,?)";
		int add=template.update(query,name,id);
		return true;
	}

	public List<EmployeeDto> getEmployee() {
		RowMapper<EmployeeDto> rowmap=new Emprowmapper();
		String query1="select * from emp";
		List<EmployeeDto> list=template.query(query1, rowmap);
		return list;
	}

	public boolean deleteEmployee(String name) {
		String query="delete from emp where NAME?";
		template.update(query,name);
		return true;
	}

}
	


