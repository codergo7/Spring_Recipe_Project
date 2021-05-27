package com.go.recipe;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class RecipeProjectApplication {

    public static void main(String[] args) {
        log.debug("Testing for Logging Debug ");
        SpringApplication.run(RecipeProjectApplication.class, args);
    }

}
