package com.green.greengram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class GreenGramSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(GreenGramSecurityApplication.class, args);
    }

}
