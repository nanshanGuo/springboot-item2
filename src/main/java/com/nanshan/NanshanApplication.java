package com.nanshan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableAsync
@SpringBootApplication
@EnableSwagger2
public class NanshanApplication {
    public static void main(String[] args){
        SpringApplication.run(NanshanApplication.class,args);
    }
}
