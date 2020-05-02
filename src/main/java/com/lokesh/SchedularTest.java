package com.lokesh;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedularTest {
	

	public static final Logger logger = LoggerFactory.getLogger(SchedularTest.class);
	
	/**
	 * initialDelay is when application starts it waits for 5 seconds and after that it starts scheduling 
	 * fixedRate = after each 6 seconds it starts schedule task
	 */
	@Scheduled(fixedRate = 6000, initialDelay = 5000)
	public void testSchedular() {
		logger.info("welcome to task scheduling  "+new Date());
	}
	
	/**
	 * fixedDelay is the delay between first run and second run
	 */
	@Scheduled(fixedDelay = 10000)
	public void testSchedular2() {
		logger.info("welcome to task scheduling 1 "+new Date());
	}
	
	

	@Scheduled(cron = "${cron.expression}")
	public void testSchedular3() {
		logger.info("welcome to task scheduling 2  "+new Date());
	}


}
