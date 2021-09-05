package com.te.springmvc.emp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.te.springmvc.emp.dto.EmployeeDto;
import com.te.springmvc.emp.service.ServiceLayer;



@Controller
public class Employe {
//	@Autowired
	ServiceLayer service;
	

	@GetMapping("/reg")
	public String register() {
		return"Reg";
	}
	
	@PostMapping("/insert")
	public String addEmployee(ModelMap map,EmployeeDto dto) {
		
		map.addAttribute("EMP",dto);
	
		service.addEmployee(dto);
		
		return"Insert";
	}
	
	@GetMapping("/getAll")
	public String display() {
		return"Display";
	}
	
	
	
	
}
