package com.demo.springconcepts;

import com.demo.springconcepts.component.DemoBean;
import com.demo.springconcepts.component.EmployeeBean;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringConceptsApplication {
	public static final Logger logger = LoggerFactory.getLogger(SpringConceptsApplication.class);

	public static void main(String[] args) {
		logger.debug("Hello Kaushal in Spring Core");
		ApplicationContext context = SpringApplication.run(SpringConceptsApplication.class, args);
		logger.debug("checking context{}  "+context.getBean(DemoBean.class));
		logger.debug("***Example using @autowire on property****");
		EmployeeBean employeeBean=context.getBean(EmployeeBean.class);
		employeeBean.setEid(104);
		employeeBean.setEname("Kaushal");
		employeeBean.showEmployeeDetails();

	}

}
