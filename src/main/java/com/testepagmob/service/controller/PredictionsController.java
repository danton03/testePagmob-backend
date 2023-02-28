package com.testepagmob.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("predictions")
public class PredictionsController {
  @GetMapping
  public String Predictions() {
    return "Teste inicial";
  }
}
