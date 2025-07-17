package com.simplecoding.simpledms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing       // TODO: @CreatedDate 사용하기 위해 붙입니다.
public class SimpleDmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleDmsApplication.class, args);
    }

}
