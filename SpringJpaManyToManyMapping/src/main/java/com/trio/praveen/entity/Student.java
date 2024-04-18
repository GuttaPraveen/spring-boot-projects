package com.trio.praveen.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Table(name="student")
@Entity
public class Student
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="student_id")
	private Integer studentId;
	
	@Column(name="student_name")
	private String studentName;
	
	@Column(name="student_addr")
	private String studentAddr;
	
	//@ManyToMany(fetch = FetchType.EAGER)
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="student_courses",
			   joinColumns=@JoinColumn(name="student_id",referencedColumnName="student_id"),
			   inverseJoinColumns=@JoinColumn(name="course_id",referencedColumnName="course_id"))
	private Set<Course>courses;

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddr() {
		return studentAddr;
	}

	public void setStudentAddr(String studentAddr) {
		this.studentAddr = studentAddr;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddr=" + studentAddr
				+ ", courses=" + courses + "]";
	}
	
	
}
