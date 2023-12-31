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
	String phoneno;
	String address;
	String email;
	String password;
	String role;
	
	public Employee()
	{
		this.firstname="";
		this.lastname="";
	}
	public Employee(String fname,String lname,String email,String pass,String phn,String role,String add)
	{
		this.firstname=fname;
		this.lastname=lname;
		this.email=email;
		this.password=pass;
		this.phoneno=phn;
		this.address=add;
		this.role=role;
	}
	public Employee(String email,String password)
	{
		this.email=email;
		this.password=password;
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
	public void setemail(String email) {
		this.email=email;
	}
	public void setpassword(String password) {
		this.password=password;
	}
	
	public void setphoneno(String phoneno) {
		this.phoneno=phoneno;
	}
	public void setrole(String role) {
		this.role=role;
	}
	public void setaddress(String add) {
		this.address=add;
	}
	public String getFirstname()
	{
		return this.firstname;
	}
	public String getLastname()
	{
		return this.lastname;
	}
	
	public String getPhoneno()
	{
		return this.phoneno;
	}
	public String geteEmail()
	{
		return this.email;
	}
	public String getPassword()
	{
		return this.password;
	}
	public String getRole()
	{
		return this.role;
	}
	
	
	public Integer getEmpid()
	{
		return this.empid;
	}
}

