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
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	
	public boolean sendEmail(String toMail,String body,String subject)
	{
		boolean isSent=false;
		try 
		{
				MimeMessage mimeMessage = javaMailSender.createMimeMessage();
				MimeMessageHelper helper = new MimeMessageHelper(mimeMessage);
 

				helper.setTo(toMail);
				helper.setText(body,true);
				helper.setSubject(subject);
				helper.setFrom("praveengutta654@gmail.com");
 
				javaMailSender.send(mimeMessage);
				isSent=true;
		 }
		 catch (Exception e)
		 {
				logger.info(String.format("Error sending Message %s", e.getMessage()));
		 }
		return isSent;
	}
	
}
/*
 		
 		@Autowired
		private JavaMailSender mailSender;


		public void sendEmailWithAttachment() throws Exception
		{
		
			MimeMessage mimeMsg = mailSender.createMimeMessage();
			
			MimeMessageHelper helper = new MimeMessageHelper(mimeMsg);
			helper.setTo("ashokitschool@gmail.com");
			helper.setSubject("Hi");
			helper.setText("hello");
			helper.addAttachment("Report", new File(""));
			
			mailSender.send(mimeMsg);
		
		}

		public void sendEmail() 
		{
		
			SimpleMailMessage msg = new SimpleMailMessage();
			
			msg.setTo("ashokitschool@gmail.com");
			msg.setSubject("Spring Boot - Email");
			msg.setText("This is test body");
			
			mailSender.send(msg);
		}
*/