package com.example.demo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinProjectFirstApplicationTests {
	  private static final Logger logger = LoggerFactory.getLogger(Test.class);

	  @Test
		void contextLoads() {
		   System.out.println("hello welocimw to next commmit");
		   logger.info("hello welocimw to next commmit using logger");
	   
	
	}

}
