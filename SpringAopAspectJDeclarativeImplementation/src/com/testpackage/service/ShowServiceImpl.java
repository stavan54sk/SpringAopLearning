package com.testpackage.service;

import com.testpackage.dto.ThreeDShow;
import com.testpackage.exception.InsufficientFundsException;

public class ShowServiceImpl implements ShowService{
	
	public String playingShow(ThreeDShow threeDShow) {
		// TODO Auto-generated method stub
		System.out.println("#######################################################################");
		System.out.println("Playing Show"+threeDShow);
		if(!threeDShow.getName().equals("3D"))
		{
		throw new InsufficientFundsException("Funds are Insufficient");
		}
		return threeDShow.getTime();
	}
	

}

