package com.trio.praveen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.trio.praveen.service.EmailSenderService;

@RestController
@RequestMapping("/email")
public class EmailSenderController
{
	@Autowired
    private EmailSenderService emailSenderService;

    @PostMapping("/send")
    public String sendEmail() 
    {
    	String to="praveengutta653@gmail.com";
    	String subject="Password";
    	String body="Welcome to Spring boot mail sender";
    	boolean res=emailSenderService.sendEmail(to, body, subject);
    	
    	if(res)
    		return "Email sent successfully!";
    	else
    		return "Failure Email Sending"; 
    }
}
