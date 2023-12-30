package com.cdac.myproject1.service;

import java.util.List;


import com.cdac.myproject1.model.Employee;

public interface IEmployeeService {
	List<Employee> getAllEmpDetails();
	Employee saveEmpDetails(Employee TransientPojo);
	String deleteEmpDetails(int empid);
	Employee  getEmpDetails(int empid);
	Employee updateEmpDetails(int empid,Employee emp);
	
}
