package edu.npu.dao;

import java.util.List;

import edu.npu.domain.Student;



public interface NationalTuitionCalculatorService {

	public double nationalTuitionCalculatorImpl(Student stu, List courseList);
}
