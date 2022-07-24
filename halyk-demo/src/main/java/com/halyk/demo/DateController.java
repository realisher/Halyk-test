package com.halyk.demo;


import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DateController {

  @GetMapping(path = "/date")
  public Date getHalyk() {
    final Date message = new Date();
   
    message.setDate(LocalDate.now());
    message.setTime(LocalTime.now());
    return message;
  }
}