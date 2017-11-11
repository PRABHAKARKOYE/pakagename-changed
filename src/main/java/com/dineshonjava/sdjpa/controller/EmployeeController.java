/**
 * 
 */
package com.dineshonjava.sdjpa.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dineshonjava.sdjpa.dto.EmployeeDto;

import com.dineshonjava.sdjpa.models.Employee;
import com.dineshonjava.sdjpa.models.EmployeeRepository;
import com.dineshonjava.sdjpa.service.EmployeeService;

/**
 * @author prabhakar
 *
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value="/read",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<EmployeeDto>> read(@PathVariable("id") Integer id) throws Exception {
		List<EmployeeDto> employeeDto = employeeService.read(id);
		return new ResponseEntity<List<EmployeeDto>>(employeeDto, HttpStatus.OK);
	}
	@RequestMapping(value="/readall",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<EmployeeDto>> readall() throws Exception {
		List<EmployeeDto> employeeDto = employeeService.readAll();
		return new ResponseEntity<List<EmployeeDto>>(employeeDto, HttpStatus.OK);
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value="/create",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity getArticleById(@RequestBody EmployeeDto dto) {
		String res = employeeService.create(dto);
		return new ResponseEntity(res, HttpStatus.OK);
	}
	
	@RequestMapping(value="/update",
            method = RequestMethod.PUT,
            produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity update(@PathVariable("id") Integer id,@RequestBody EmployeeDto dto) {
		String res  = employeeService.update(id,dto);
		return new ResponseEntity(res, HttpStatus.OK);
	}
	
	@RequestMapping(value="/delete",
            method = RequestMethod.DELETE,
            produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity delete(@PathVariable("id") Integer id) {
		String res = employeeService.delete(id);
		return new ResponseEntity(res, HttpStatus.OK);
	}

	
	
	
	
}
