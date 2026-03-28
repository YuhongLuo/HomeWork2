package edu.npu.lab2;

import java.awt.List;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import edu.npu.dao.NationalTuitionCalculatorService;
import edu.npu.dao.PapalPaymentService;
import edu.npu.domain.Course;
import edu.npu.domain.Student;
import edu.npu.mockDao.NationalTuitionCalculatorImpl;
import edu.npu.mockDao.PapalPaymentImpl;

import edu.npu.services.StudentCheckoutService;


@SpringBootApplication
@ComponentScan("edu.npu.services, edu.npu.dao")

public class SmallApplication {
	
	@Bean
    public NationalTuitionCalculatorService national() {
        return new NationalTuitionCalculatorImpl();
    }
	
	@Bean
	public PapalPaymentService papal() {
		return new PapalPaymentImpl();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ApplicationContext container = new ClassPathXmlApplicationContext("application.xml");
		//StudentCheckoutService studentCheckout = (StudentCheckoutService) container.getBean("studentCheckoutService");
		
		ApplicationContext container = SpringApplication.run(SmallApplication.class, args);
		StudentCheckoutService studentCheckout = container.getBean("studentCheckoutService", StudentCheckoutService.class);
		
		Course course1 = new Course("Java", "Java Application", 3, 25, false);
		Course course2 = new Course("C++", "C++ Application", 3, 15, true);
		Course course3 = new Course("Python", "python Application", 3, 12, true);
		
		 ArrayList<Course> list1 = new <Course>ArrayList();
		list1.add(course1);
		list1.add(course2);
		
		Student student1 = new Student("lee", 122, true, list1);
		long creditNum1 = 123456789L;
		studentCheckout.checkoutStudentOfNational(student1, list1, creditNum1);
		
		//ArrayList<Course> list2 = new <Course>ArrayList();
		//list2.add(course1);
		//list2.add(course2);
		//list2.add(course3);
		
		//Student student2 = new Student("Wong", 259, false, list2);
		//long creditNum2 = 123456789L;
		//studentCheckout.checkoutStudentOfOhio(student2, list2, creditNum2);
		
		
	}

}


