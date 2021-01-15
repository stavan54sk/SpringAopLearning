package com.testpackage.service;

import com.testpackage.dto.MovieTicket;

public class BookMovieTicketServiceImpl implements BookMovieTicketService {
	
	public void bookMovie(MovieTicket movieticket)
	{
		System.out.println("###########################################################################################");
		System.out.println("Movie Ticket details booked are:"+movieticket.getMoviename());
		System.out.println("Movie Ticket details booked are:"+movieticket.getPrice());
		throw new RuntimeException("Movie Ticketing Booking Exception");
	}

}
