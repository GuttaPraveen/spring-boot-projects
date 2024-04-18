package com.trio.praveen.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trio.praveen.entity.Course;
import com.trio.praveen.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService
{
	
	@Autowired
	private CourseRepository courseRepo;
	
	@Override
	public String upsert(Course course)
	{
		courseRepo.save(course);  //upsert (insert / update method )
		return "Success";
	}

	@Override
	public Course getById(Integer cid)
	{ 
		// TODO Auto-generated method stub
		Optional<Course> course = courseRepo.findById(cid);
		if(course.isPresent())
		  return course.get();
		return null;
	}

	@Override
	public List<Course> getAllCourses()
	{
		
		return courseRepo.findAll();
	}

	@Override
	public String deleteById(Integer cid)
	{
		if(courseRepo.existsById(cid))
		{
			courseRepo.deleteById(cid);
			return "Delete Success";
		}
		else
			return "No Record Found";
	}

}
