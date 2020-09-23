package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JpaEmbeddedEmbeddableApplication {
	private static EmployeeRepository erepo;
	private static StaffRepository srepo;
	private static final Logger log = LoggerFactory.getLogger(JpaEmbeddedEmbeddableApplication.class);
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(JpaEmbeddedEmbeddableApplication.class, args);
		erepo = context.getBean(EmployeeRepository.class);
		srepo = context.getBean(StaffRepository.class);
		performOperation();
	}
	public static void performOperation() {
		//Performing Employee save operation
				Employee em = new Employee("Name", "mobile", new Address("line1", "city", 445121));
				erepo.save(em);
				Employee saved = erepo.findByName("Name");
				System.out.println(saved.toString());
				log.info("Is saved object equal to received object ? "+ (em == saved));
	}
}
