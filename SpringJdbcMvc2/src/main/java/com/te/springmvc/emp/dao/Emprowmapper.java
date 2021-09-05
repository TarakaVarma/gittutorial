package com.te.springmvc.emp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.te.springmvc.emp.dto.EmployeeDto;

public class Emprowmapper implements RowMapper<EmployeeDto> {

public EmployeeDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		EmployeeDto dto=new  EmployeeDto();
		

		dto.setName(rs.getString(1));
		dto.setId(rs.getString(2));
		
		return dto;
	}

	
	
}
