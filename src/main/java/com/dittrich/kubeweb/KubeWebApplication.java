package com.dittrich.kubeweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class KubeWebApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(KubeWebApplication.class, args);
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
	}

}
