package edu.npu.domain;

import java.util.List;

public class Student {

	private String name;
	private int id;
	public boolean isInternationalStudent;
	private List<Course> courseList;
	
	
	@SuppressWarnings("unchecked")
	public Student(String name, int id, boolean isInternationalStudent, List courseList) {
		this.name = name;
		this.id = id;
		this.isInternationalStudent = isInternationalStudent;
		this.courseList = courseList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}

	

}
