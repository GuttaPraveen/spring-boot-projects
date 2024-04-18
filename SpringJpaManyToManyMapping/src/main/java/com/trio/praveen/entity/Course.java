package com.trio.praveen.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="course")
@Entity
public class Course
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="course_id")
	private Integer courseId;
	
	@Column(name="course_name")
	private String courseName;
	
	@Column(name="course_cost")
	private int courseCost;

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCourseCost() {
		return courseCost;
	}

	public void setCourseCost(int courseCost) {
		this.courseCost = courseCost;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseCost=" + courseCost + "]";
	}
	
	
	
}
