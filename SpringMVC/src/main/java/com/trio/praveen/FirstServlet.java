package com.trio.praveen;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstServlet
{
	/*
	  @RequestMapping(path="/FirstServlet",method=RequestMethod.GET)
	 
	public String login(HttpServletRequest req,HttpServletResponse resp) throws IOException
	{
		PrintWriter out=resp.getWriter();
		String userName=req.getParameter("username");
		String psw=req.getParameter("psw");
		System.out.println(userName);
		System.out.println(psw);
		out.println(userName);
		out.println(psw);
		return " ";
	}
	*/
	/*@RequestMapping(path="/FirstServlet",method=RequestMethod.GET)
	public String login(
							@RequestParam(name="username",required=true) String userName,
							@RequestParam("psw") String psw,
			            Model model)
	{
		System.out.println(userName.toUpperCase());
		System.out.println(psw);
		model.addAttribute("username",userName);
		model.addAttribute("psw", psw);
		return "home";
	}*/
	@RequestMapping("/home")
	public ModelAndView home()
	{
		ModelAndView mav = new ModelAndView();
		mav.addObject("username","Praveen");
		mav.addObject("psw",1240);
		mav.setViewName("home");
		return mav;
	}
	 
	
	
}
