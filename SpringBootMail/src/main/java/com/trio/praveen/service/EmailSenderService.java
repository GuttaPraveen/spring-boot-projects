package com.trio.praveen.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;

@Service
public class EmailSenderService
{
	private final Log logger = LogFactory.getLog(getClass());
	private JavaMailSender javaMailSender;
	
	@Autowired
	public EmailSenderService(JavaMailSender javaMailSender)
	{
		this.javaMailSender = javaMailSender;
	}
	public void sendEmail(String toMail,String body,String subject)
	{
		try 
		{
				MimeMessage message = javaMailSender.createMimeMessage();
				MimeMessageHelper helper = new MimeMessageHelper(message,MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED);
 

				helper.setTo(toMail);
				helper.setText(body);
				helper.setSubject(subject);
				helper.setFrom("praveengutta653@gmail.com");
 
				javaMailSender.send(message);
		 }
		 catch (Exception e)
		 {
				logger.info(String.format("Error sending Message %s", e.getMessage()));
		 }
	}
	
}
