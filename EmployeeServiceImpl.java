package com.cdac.myproject1.service;




import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdac.myproject1.model.Employee;
import com.cdac.myproject1.repo.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl implements IEmployeeService{
	@Autowired
	EmployeeRepository empRepo;
	@Override
	public List<Employee> getAllEmpDetails() {
		
		return empRepo.findAll();
		 
	}
	@Override
	public Employee saveEmpDetails(Employee TransientPojo) {
		
		return empRepo.save(TransientPojo);
	}
	@Override
	public String deleteEmpDetails(int empid) {
		String msg="Deletion Failed!!!";
		if(empRepo.existsById(empid)) {
			empRepo.deleteById(empid);
			msg="Deletion Successful!!!!";
		}
		return msg;
	}
	@Override
	public Employee getEmpDetails(int empid) {
		
		return empRepo.findById(empid).orElseThrow();
	}
	@Override
	public Employee updateEmpDetails(int empid,Employee emp) {
		String msg="Please Enter valide id!!!";
		if(empRepo.existsById(empid)) {
			
			msg = "Trying to update employee";
			System.out.println(msg);
			return empRepo.save(emp);
		}
		return null;
		
		
	}
	@Override
	public String getRole(String email, String password) {
		Employee employee = empRepo.findByEmailAndPassword(email, password);
		if(employee!=null)
		{
			return employee.getRole();
		}
		// TODO Auto-generated method stub
		return "Invalid Login";
	}
	

	
	
	

}
