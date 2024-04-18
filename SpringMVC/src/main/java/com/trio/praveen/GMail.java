package com.trio.praveen;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class GMail
{
	@RequestMapping("/reg")
	public String registrationForm()
	{
		return "registration";
	}
	@RequestMapping("/login")
	public String loginForm()
	{
		return "login";
	}
	@RequestMapping("/inbox")
	public String inboxForm()
	{
		return "inbox";
	}
	
}
