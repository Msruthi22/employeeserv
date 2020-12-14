package com.paypal.bfs.test.employeeserv.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.paypal.bfs.test.employeeserv.api.EmployeeResource;
import com.paypal.bfs.test.employeeserv.entity.Employee;
import com.paypal.bfs.test.employeeserv.exceptions.NoRecordFoundException;
import com.paypal.bfs.test.employeeserv.repository.EmployeeRepository;

/**
 * Implementation class for employee resource.
 */
@RestController
public class EmployeeResourceImpl implements EmployeeResource {

	@Autowired
	EmployeeRepository rep;
	
    @Override
    public ResponseEntity<Employee> employeeGetById(String id) throws NoRecordFoundException {
    	Optional<Employee> rec = rep.findById(Integer.parseInt(id));
    	return new ResponseEntity<>(rec.isPresent()?rec.get():null, HttpStatus.OK);
    }

	@Override
	public ResponseEntity<String> create(Employee emp) {
		try {
			rep.save(emp);
			return new ResponseEntity<>(" Employee saved to database. Emp Id="+  emp.getId(), HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(" Failed to save emplayee to database.", HttpStatus.OK);
		}
	}

	
}
