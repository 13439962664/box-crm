package com.box.crm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication(scanBasePackages= {"com.box.**"})
@EnableAsync
@ServletComponentScan
public class BoxCrmApplication{

	public static void main(String[] args) {
		SpringApplication.run(BoxCrmApplication.class, args);
	}
}
