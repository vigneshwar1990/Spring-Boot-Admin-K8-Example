package com.vignesh.sbaserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableDiscoveryClient
@EnableAdminServer
@SpringBootApplication
@EnableScheduling
public class SbaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbaserverApplication.class, args);
	}

}
