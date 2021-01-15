package com.testpackage.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.testpackage.dto.MovieTicket;
import com.testpackage.service.BookMovieTicketService;

public class TestClient {

	
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("\\com\\testpackage\\configuration\\applicationContext.xml");
		BookMovieTicketService bookMovieTicketService=(BookMovieTicketService)applicationContext.getBean("proxy");
		MovieTicket movieTicket=new MovieTicket();
		bookMovieTicketService.bookMovie(movieTicket);

	}
	
	
	


}
