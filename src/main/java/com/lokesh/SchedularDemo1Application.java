package com.lokesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;



/**
 * @author lokesh
 * https://crontab.guru/ this site helps to calcular schedular timing 
 *
 */
@SpringBootApplication
@EnableScheduling
public class SchedularDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(SchedularDemo1Application.class, args);
	}

}
