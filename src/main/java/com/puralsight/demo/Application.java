package com.puralsight.demo;

import com.pluralsight.demo.config.PersistenceConfiguration;
import com.pluralsight.demo.controllers.SessionsController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackageClasses = PersistenceConfiguration.class)
@ComponentScan(basePackageClasses = SessionsController.class)

public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

