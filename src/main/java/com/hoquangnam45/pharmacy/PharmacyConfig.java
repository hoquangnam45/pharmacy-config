package com.hoquangnam45.pharmacy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PharmacyConfig {
  public static void main(String[] args) {
    SpringApplication.run(PharmacyConfig.class, args);
  }
}
