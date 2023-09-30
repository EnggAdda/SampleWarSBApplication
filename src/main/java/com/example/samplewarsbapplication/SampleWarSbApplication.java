package com.example.samplewarsbapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SampleWarSbApplication {

	@GetMapping("/war")
	public String display(){
		return "War file Deployment is successful";
	}

	public static void main(String[] args) {
		SpringApplication.run(SampleWarSbApplication.class, args);
	}

}
