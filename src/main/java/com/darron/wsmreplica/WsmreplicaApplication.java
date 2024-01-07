package com.darron.wsmreplica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class WsmreplicaApplication {

	public static void main(String[] args) {
		SpringApplication.run(WsmreplicaApplication.class, args);
	}

}
