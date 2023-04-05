package com.example.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EmailApplication {

	@Autowired
	private emailSenderService service;

	public static void main(String[] args) {
		SpringApplication.run(EmailApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void sendMail(){
		service.sendEmail("premerp1604@gmail.com","TEST","TEST MAIL");
	}

}
