package com.example.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Properties;

@SpringBootApplication
public class App {

    public static final Properties myProps = new Properties();

	public static void main(String[] args) {

	    myProps.setProperty("server.address", "localhost");
	    myProps.setProperty("server.port", "8080");


	    SpringApplication app = new SpringApplication(App.class);
	    app.setDefaultProperties(myProps);
	    app.run(args);
	}
}
