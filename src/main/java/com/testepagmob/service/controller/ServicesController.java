package com.testepagmob.service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/services")
public class ServicesController {
  @GetMapping
  public ServicesDTO servicesResults() {
    String URL = "https://api.cittamobi.com.br/m3p/js/prediction/stop/5208036,5195544";
    RestTemplate restTemplate = new RestTemplate();
    ResponseEntity<ServicesDTO> res = restTemplate.getForEntity(URL, ServicesDTO.class);
    return res.getBody();
  }
}
