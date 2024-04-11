package net.dnadas.freeroam_trails.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  @GetMapping("/protected/hello")
  public String hello() {
    return "Hello from FreeRoamTrailsApplication protected route!";
  }

  @GetMapping("/public/hello")
  public String hello2() {
    return "Hello from FreeRoamTrailsApplication public route!";
  }
}
