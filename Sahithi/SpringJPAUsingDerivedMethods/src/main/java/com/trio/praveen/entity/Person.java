package com.trio.praveen.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="tbl_person")
public class Person
{
	@Id
	//DB Only Takes Care Of Autopopulating the Primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//AUTO ==> JPA WILL CREATE A DATABASE SEQUENCE TO DB AND IT WILL GENERATE VALUE USING SEQUENCE
	//IDENTITY ==> DATABASE ONLY WILL TAKE CARE OF SEQUENCE GENERATION AUTO_INCREMENT
	
	@Column(name="person_id")
	private Integer personId;
	
	@Column(name="first_name")
	//Column is also  optional. If we want database column value other than java property name
	private String firstName;
	
	@Column(name="last_name")
	private String last_name;
	
	@Column(name="age")
	private Integer age;
	
	@Column(name="created_date")
	private Date createdDate;
	
	@Column(name="email")
	private String email;

	public Person(Integer personId, String firstName, String last_name, Integer age, String email) 
	{
		super();
		this.personId = personId;
		this.firstName = firstName;
		this.last_name = last_name;
		this.age = age;
		//this.createdDate = createdDate;
		this.email = email;
	}

	

	public Integer getPersonId()
	{
		return personId;
	}

	public void setPersonId(Integer personId)
	{
		this.personId = personId;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public String getLast_name() 
	{
		return last_name;
	}

	public void setLast_name(String last_name)
	{
		this.last_name = last_name;
	}

	public Integer getAge()
	{
		return age;
	}

	public void setAge(Integer age)
	{
		this.age = age;
	}

	public Date getCreatedDate()
	{
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = new Date();
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	@Override
	public String toString()
	{
		return "Person [personId=" + personId + ", firstName=" + firstName + ", last_name=" + last_name + ", age=" + age
				+ ", createdDate=" + createdDate + ", email=" + email + "]";
	}
	
	
	

}
