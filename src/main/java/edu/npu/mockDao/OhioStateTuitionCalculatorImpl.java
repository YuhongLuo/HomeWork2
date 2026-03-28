package edu.npu.mockDao;

import java.util.List;

import edu.npu.dao.OhioStateTuitionCalculatorService;
import edu.npu.domain.Student;


public class OhioStateTuitionCalculatorImpl implements OhioStateTuitionCalculatorService {

	public double ohioStateTuitionCalculatorImpl(Student stu, List courseList) {
		double sum = 0;
		for(int i=0; i < courseList.size(); i++) {
		if(stu.getCourseList().get(i).isGraduate) {
			if(stu.isInternationalStudent) {
			sum+= (120 * stu.getCourseList().get(i).getNumberOfUnits() + 50) * 1.1;
		    }else {
			sum+= 120 * stu.getCourseList().get(i).getNumberOfUnits()+ 50;
		    }
		}else {
			if(stu.isInternationalStudent) {
				sum+= (120 * stu.getCourseList().get(i).getNumberOfUnits() + 50) * 1.1;
		     }else {
			    sum+= 120 * stu.getCourseList().get(i).getNumberOfUnits() + 50;
		     }
	    }
		
	}
		return sum;
}
}
