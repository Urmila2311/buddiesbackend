package com.cdac.myproject1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.myproject1.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
