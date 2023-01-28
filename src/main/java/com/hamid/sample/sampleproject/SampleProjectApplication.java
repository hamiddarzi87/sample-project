package com.hamid.sample.sampleproject;

import com.hamid.sample.sampleproject.bean.Simple;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SampleProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SampleProjectApplication.class, args);
		Simple bean = context.getBean(Simple.class);
		System.out.println("hi");

	}

}
