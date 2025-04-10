package com.example.datthu.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(DemoApplication.class, args);
		// Dev obj=new Dev(); MANUAL CREATION OF OBJECT
		// obj.build();
	    // Dev obj=null;NULL POINTER EXPECTATION
		// obj.build();
		// Dev obj=context.getBean(Dev.class);  No qualifying bean of type 'com.example.datthu.demo.Dev' available in IOC container here it searches for object of Dev class in Ioc ,but spring doesnot create object directly we have to tell the configuration or Annotaions
		// obj.build();
		Dev obj=context.getBean(Dev.class);
		obj.build();

	}

}
