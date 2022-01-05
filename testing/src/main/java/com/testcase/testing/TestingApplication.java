package com.testcase.testing;

import myPackage.dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class TestingApplication implements CommandLineRunner {

	@Autowired
	@Qualifier("student1")
	private Student student;

	@Autowired
	private Date date;

	@Autowired
	private Emp emp;

	@Autowired
	private myPackage.dog dog;

	public static void main(String[] args) {
		SpringApplication.run(TestingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.student.studying();
		this.emp.whatsyourname();
		this.dog.eating();

	}
}
