package edu.npu.domain;

public class Course {

	private String courseName;
	private String departmentName;
	private int numberOfUnits;
	private int numberOfStudentsInrolled;
	public boolean isGraduate;
	
	public Course(String courseName, String departmentName,int numberOfUnits,int numberOfStudentsInrolled,boolean isGraduate) {
		
		this.courseName=courseName;
		this.departmentName = departmentName;
		this.numberOfUnits = numberOfUnits;
		this.numberOfStudentsInrolled=numberOfStudentsInrolled;
		this.isGraduate = isGraduate;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getNumberOfUnits() {
		return numberOfUnits;
	}

	public void setNumberOfUnits(int numberOfUnits) {
		this.numberOfUnits = numberOfUnits;
	}

	public int getNumberOfStudentsInrolled() {
		return numberOfStudentsInrolled;
	}

	public void setNumberOfStudentsInrolled(int numberOfStudentsInrolled) {
		this.numberOfStudentsInrolled = numberOfStudentsInrolled;
	}

	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", departmentName=" + departmentName + ", numberOfUnits="
				+ numberOfUnits + ", numberOfStudentsInrolled=" + numberOfStudentsInrolled + ", isGraduate="
				+ isGraduate + "]";
	}
}
