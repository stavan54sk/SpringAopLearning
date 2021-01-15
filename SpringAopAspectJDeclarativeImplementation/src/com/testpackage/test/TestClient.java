package com.testpackage.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.testpackage.dto.ThreeDShow;
import com.testpackage.service.ShowService;

public class TestClient {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com\\testpackage\\configuration\\appplicationContext.xml");
		ShowService showService = (ShowService) context.getBean("showService");
		ThreeDShow threeDShow = (ThreeDShow) context.getBean("show");
		showService.playingShow(threeDShow);

	}
}
