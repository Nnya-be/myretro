package com.apress.myretro;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class MyretroApplication {

	private static final Logger log = LoggerFactory.getLogger(MyretroApplication.class);

	public static void main(String[] args) {
		new SpringApplicationBuilder().sources(MyretroApplication.class)
				.logStartupInfo(false).bannerMode(Banner.Mode.OFF)
				.lazyInitialization(true).web(WebApplicationType.NONE)
				.profiles("cloud").listeners(event -> log.info("Event: {}",
						event.getClass().getCanonicalName())).run(args);
	}

}
