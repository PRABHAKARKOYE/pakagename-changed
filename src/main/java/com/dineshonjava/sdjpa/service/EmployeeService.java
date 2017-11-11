package com.dineshonjava.sdjpa.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dineshonjava.sdjpa.dto.EmployeeDto;
import com.dineshonjava.sdjpa.models.Employee;
import com.dineshonjava.sdjpa.models.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Transactional
	
	
	public String create(EmployeeDto dto) {
		
		Employee e =new Employee();
		if(dto.getPkId()!=null&&dto.getFlag()==true)
		{
			e.setPkId(dto.getPkId());
		}
		if(dto.getBirthDate()!=null)
		e.setBirthDate(dto.getBirthDate());
		if(dto.getEmail()!=null)
		e.setEmail(dto.getEmail());
		
		if(dto.getFirstName()!=null)
		e.setFirstName(dto.getFirstName());
		
		if(dto.getFlag()!=null)
		e.setFlag(dto.getFlag());
		if(dto.getBirthDate()!=null)
		e.setLname(dto.getLname());
		if(dto.getBirthDate()!=null)
		e.setPinCode(dto.getPinCode());
		
		employeeRepository.save(e);
		
		return "sucess";
		
	}

	public List<EmployeeDto> read(Integer id) {
		
		Employee employee=employeeRepository.findOne(id);
		
		List<EmployeeDto> employeeList=new ArrayList<>();
		
		
		EmployeeDto employeeDto=new EmployeeDto();
		employeeDto.setBirthDate(employee.getBirthDate());
		employeeDto.setEmail(employee.getEmail());
		employeeDto.setFirstName(employee.getFirstName());
		employeeDto.setLname(employee.getLname());
		employeeDto.setFlag(employee.getFlag());
		employeeDto.setPinCode(employee.getPinCode());
		employeeDto.setPkId(employee.getPkId());
		employeeList.add(employeeDto);
		
		
		
		
		
		
		return employeeList;
	}

	public String update(Integer id, EmployeeDto dto) {
		Employee employee=employeeRepository.findOne(id);

		
		employee.setBirthDate(dto.getBirthDate());
		
		employee.setPinCode(dto.getPinCode());
		
		employeeRepository.save(employee);
		return "update success";
	}

	public String delete(Integer id) {
		Employee employee=employeeRepository.findOne(id);
		
		employee.setFlag(false);
		
		employeeRepository.save(employee);
		
		return "deactivated";
	}
	
	
	
	

}
