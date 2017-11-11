package com.dineshonjava.sdjpa.models;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	
	
}
