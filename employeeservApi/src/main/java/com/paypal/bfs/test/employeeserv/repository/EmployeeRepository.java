package com.paypal.bfs.test.employeeserv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paypal.bfs.test.employeeserv.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
