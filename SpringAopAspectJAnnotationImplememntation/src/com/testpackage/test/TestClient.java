package com.testpackage.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.testpackage.configuration.ConfigurationClass;
import com.testpackage.dto.ThreeDShow;
import com.testpackage.service.ShowService;

public class TestClient {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		ThreeDShow threeDShow = (ThreeDShow) context.getBean("threeDShow");
		ShowService showService = (ShowService) context.getBean("showService");
		showService.playingShow(threeDShow);
		

	}
}
