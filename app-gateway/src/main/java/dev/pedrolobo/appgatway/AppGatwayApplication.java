package dev.pedrolobo.appgatway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class AppGatwayApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppGatwayApplication.class, args);
	}

}
