package com.goIt.Homework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestHomework16Application {

	public static void main(String[] args) {
		SpringApplication.from(Homework16Application::main).with(TestHomework16Application.class).run(args);
	}

}
