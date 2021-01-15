package com.testpackage.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.testpackage.aspect.AspectClass;
import com.testpackage.dto.ThreeDShow;
import com.testpackage.service.ShowService;
import com.testpackage.service.ShowServiceImpl;



@EnableAspectJAutoProxy
@ComponentScan(basePackages={"com.testpackage.aspect","com.testpackage.dto","com.testpackage.service"})
@Configuration
public class ConfigurationClass {
	
	@Bean
	public AspectClass aspectClass()
	{
		return new AspectClass();
	}
	
	@Bean
	public ShowService showService()
	{
		ShowService showService=new ShowServiceImpl();
		return showService;
	}
	
	@Bean
	public ThreeDShow threeDShow()
	{
		ThreeDShow  threeDShow =new ThreeDShow();
		threeDShow.setName("3D");
		threeDShow.setTime("9-6");
		threeDShow.setTktCost("1000/- INR");
		return threeDShow;
	}

}
