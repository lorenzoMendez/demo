package com.demo.microservice.openshift.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {
  
  @GetMapping
  public ResponseEntity<String> demo() {
    return new ResponseEntity<String>("OK", HttpStatus.OK);
  }

}
