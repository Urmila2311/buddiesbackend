package com.cdac.myproject1.controler;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.myproject1.model.Employee;
import com.cdac.myproject1.service.IEmployeeService;

@RestController // consistes of @ResponseBody (so that we dont need to write evrytime)+ @Controller
@RequestMapping("/")
public class EmployeeController {
	@Autowired
	IEmployeeService empServ;
	@GetMapping("/emplist")
	public List<Employee> listallEmps()
	{
		List<Employee> list=   empServ.getAllEmpDetails();
		return list;
	}
	@PostMapping("/register")
	public Employee save(@RequestBody Employee emp) {
		return empServ.saveEmpDetails(emp);
	}
	@DeleteMapping("/emplist/{empid}") //delete menthod + /emplist/empid
	public String deleEmp(@PathVariable int empid) {
		return empServ.deleteEmpDetails(empid);
	}
	@GetMapping("/emplist/{empid}")  //delete menthod + /emplist/empid
	public Employee getEmp(@PathVariable int empid)
	{
		return empServ.getEmpDetails(empid);
	}
	@PutMapping("/emplist/{empid}")   //you have to send id in /url also in body beacuse here id should not be null hence id is compulsory
	public Employee UpdateDetails(@PathVariable Integer empid , @RequestBody Employee emp)
	{
		return empServ.updateEmpDetails(empid,emp);
	}
	                     
	
}
