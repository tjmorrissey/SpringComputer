package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Computer;

@Configuration
public class ComputerConfiguration {
	
	@Bean
	public Computer computer() {
		Computer bean = new Computer();
		
		//defaults
		bean.setBrand("HP");
		bean.setType("Desktop");
		
		return bean;
	}

}
