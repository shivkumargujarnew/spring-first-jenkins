package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component

public class Test {
	   private static final Logger logger = LoggerFactory.getLogger(Test.class);

	   public void hi() {
		   System.out.println("hello welocimw to next commmit");
		   logger.info("hello welocimw to next commmit using logger");
	   }
}
