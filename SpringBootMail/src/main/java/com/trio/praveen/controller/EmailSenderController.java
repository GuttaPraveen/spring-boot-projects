package com.trio.praveen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
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
    public String sendEmail(@RequestParam String to, @RequestParam String subject, @RequestParam String body) 
    {
        emailSenderService.sendEmail(to, subject, body);
        return "Email sent successfully!";
    }
}
