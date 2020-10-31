package com.staxrt.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import io.swagger.annotations.SwaggerDefinition;

/**
 * The type Application.
 *
 * @author Givantha Kalansuriya
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.staxrt.tutorial")
public class Application {

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
