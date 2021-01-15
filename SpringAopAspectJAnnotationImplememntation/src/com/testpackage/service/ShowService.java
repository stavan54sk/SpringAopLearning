package com.testpackage.service;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.testpackage.dto.ThreeDShow;
import com.testpackage.exception.InsufficientFundsException;

@Service
@Component
public interface ShowService  {

	public String playingShow(ThreeDShow threeDShow) ;

}

