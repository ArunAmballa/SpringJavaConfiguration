package com.arun.beans;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"com.arun.beans"})
public class JavaConfig 
{
	public JavaConfig()
	{
		System.out.println("Java Config Object is Created");
	}
	
	
	

}
