package com.cdac.myproject1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;






@Entity
@Table(name="EMP_TBL")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer empid;
	String firstname;
	String lastname;
	
	public Employee()
	{
		this.firstname="";
		this.lastname="";
	}
	public Employee(String fname,String lname)
	{
		this.firstname=fname;
		this.lastname=lname;
	}
	public String toString()
	{
		return this.empid+" "+this.firstname+" "+this.lastname;
	}
	public void setfirstname(String fname) {
		this.firstname=fname;
	}
	public void setlastname(String lname) {
		this.lastname=lname;
	}
	public String getFirstname()
	{
		return this.firstname;
	}
	public String getLastname()
	{
		return this.lastname;
	}
	public Integer getEmpid()
	{
		return this.empid;
	}
}

