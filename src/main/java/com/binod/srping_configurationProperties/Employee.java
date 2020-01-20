package com.binod.srping_configurationProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;


/**
 * 
 * @author Binod Suman
 *
 */

@ConfigurationProperties(prefix="emp.detail")
@Data
public class Employee {

  private String id;
  private String name;
  private int departmentId;
  private String[] projects;
  private Credential credential = new Credential();
  
  @Data
  public class Credential {

	    private String userName;
	    private String password;

	  }
}