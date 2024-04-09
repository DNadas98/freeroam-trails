package net.dnadas.freeroam_trails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FreeRoamTrailsApplication {
  public static void main(String[] args) {
    SpringApplication.run(FreeRoamTrailsApplication.class, args);
  }
}
