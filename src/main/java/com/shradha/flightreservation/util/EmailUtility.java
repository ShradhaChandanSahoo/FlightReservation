package com.shradha.flightreservation.util;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailUtility {
	
	@Autowired
	private JavaMailSender sender;
	
	public void sendItinerary(String toAddress,String filePath) {
		
		MimeMessage message = sender.createMimeMessage();
		
		try {
			MimeMessageHelper messageHelper = new MimeMessageHelper(message,true);
			messageHelper.setTo(toAddress);
			messageHelper.setSubject("Itinerary for your Flight");
			messageHelper.setText("Please Find Your Itinerary attached");
			messageHelper.addAttachment("Itinerary", new File(filePath));
			
		} catch (MessagingException e) {
			
			e.printStackTrace();
		}
		
		sender.send(message);
	}

}