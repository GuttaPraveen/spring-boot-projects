package com.trio.praveen.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.trio.praveen.bindin.SearchCriteria;
import com.trio.praveen.entity.StudentEnq;

@Service
public interface EnquiryService 
{
	public boolean addEnq(StudentEnq se);

	public List<StudentEnq> getEnquiries(Integer cid, SearchCriteria s);

}
