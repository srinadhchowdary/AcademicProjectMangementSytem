package com.klef.jfsd.sdpproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.klef.jfsd.SDPProject"} )
public class SdpProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SdpProjectApplication.class, args);
		System.out.println("JFSD SPD PROJECT ACADEMIC MANAGEMENT SYSTEM");
	}

}
