package com.binod.srping_configurationProperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

/**
 * 
 * @author Binod Suman
 *
 */

@SpringBootApplication
@EnableConfigurationProperties(Employee.class)

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World, Testing for spring configuration Properties" );
        ApplicationContext context = SpringApplication.run(App.class, args);
        EmployeeService mailService = context.getBean(EmployeeService.class);
        mailService.print();
    }
}
