package com.testpackage.dto;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class ThreeDShow {
	private String name;
	private String time;
	private String tktCost;

}
