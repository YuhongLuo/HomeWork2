package edu.npu.mockDao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


import edu.npu.dao.NationalTuitionCalculatorService;
import edu.npu.domain.Student;


@Component("national")
public class NationalTuitionCalculatorImpl implements NationalTuitionCalculatorService{

	public double nationalTuitionCalculatorImpl(Student stu, List courseList) {
		double sum=0;
	    for(int i=0; i < courseList.size(); i++) {
		if( stu.getCourseList().get(i).isGraduate) {
			
			sum+= 500;
		    
		}else {
			sum+= 230;
	    }
	    }
	    return sum;
	}
	   
}
