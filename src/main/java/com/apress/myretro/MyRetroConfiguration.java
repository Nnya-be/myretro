package com.apress.myretro;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class MyRetroConfiguration {
    Logger log = LoggerFactory.getLogger(MyretroApplication.class);


    @Bean
    CommandLineRunner commandLineRunner(){
        return args -> {
            log.info("[CLR] Args: {}", Arrays.toString(args));
        };
    }
    @Bean
    ApplicationRunner applicationRunner(){
        return args -> {
            log.info("[AR] Option Args: {}", args.getOptionNames());
            log.info("[AR] Option Arg Values: {}", args.getOptionValues("option"));
            log.info("[AR] Non Option: {}", args.getNonOptionArgs());
        };
    }
    @Bean
    ApplicationListener<ApplicationReadyEvent>
    applicationReadyEventApplicationListener(){
        return event -> {
            log.info("[AL] Im ready to interact...");
        };
    }
}
