package edu.npu.dao;

import java.util.List;

import edu.npu.domain.Student;



public interface OhioStateTuitionCalculatorService {

	public double ohioStateTuitionCalculatorImpl(Student stu, List courseList);
}
