package com.binod.srping_configurationProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * 
 * @author Binod Suman
 *
 */


@Component
public class EmployeeService {
	
	
	  @Autowired
	  private Employee employee;

	  public void print() {
	    System.out.println("Employee Id : " + employee.getId());
	    System.out.println("Employee Name : " + employee.getName());
	    System.out.println("Department Id : " + employee.getDepartmentId());
	    System.out.println();
	    
	  
	    System.out.println("Working Project : " + String.join(", ", employee.getProjects()));
	    System.out.println();
	    
	    System.out.println("Employee User Name : " + employee.getCredential().getUserName());
	    System.out.println("Employee Password : " + employee.getCredential().getPassword());
	  }
	  

}
