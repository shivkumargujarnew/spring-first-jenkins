package com.example.demo;

import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.logging.slf4j.SLF4JLogger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class JenkinProjectFirstApplication extends SpringBootServletInitializer{
	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(JenkinProjectFirstApplication.class);
	    }
    @PostConstruct
	public void init() {
	   System.out.println("hello welocimw to next commmit");
	   logger.info("hello welocimw to next commmit using logger");
	   System.out.println("hello welocimw to next commmit");
	   logger.info("hello welocimw to next commmit using logger");
	   System.out.println("hello welocimw to next commmit");
	   System.out.println("hello welocimw to next commmit");
	   logger.info("hello welocimw to next commmit using logger");
	   System.out.println("hello welocimw to next commmit");
	   logger.info("hello welocimw to next commmit using logger");
	   System.out.println("hello welocimw to next commmit");
	   System.out.println("hello welocimw to next commmit");
	   System.out.println("hello welocimw to next commmit");
	   logger.info("hello welocimw to next commmit using logger");
	   System.out.println("hello welocimw to next commmit");
	   logger.info("hello welocimw to next commmit using logger");
	 
}
	
	
	private static  Log logger = LogFactory.getLog(JenkinProjectFirstApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(JenkinProjectFirstApplication.class, args);
	   System.out.println("hello welocomw to first jenkin project");
	    logger.info("hello welocomw to first jenkin project" );
	}

}
