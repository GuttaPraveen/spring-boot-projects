package com.trio.praveen.service;

import org.springframework.stereotype.Service;

import com.trio.praveen.bindin.DashBoard;
import com.trio.praveen.entity.Counsellor;

@Service
public interface CounsellorService
{
	public String saveCounsellor(Counsellor c);
	public Counsellor loginCheck(String email, String pwd);

	public boolean recoverPwd(String email);

	public DashBoard getDashboardInfo(Integer cid);
	
}
