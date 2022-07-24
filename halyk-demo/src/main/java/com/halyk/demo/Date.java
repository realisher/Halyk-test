package com.halyk.demo;

import java.time.LocalDate;
import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Date{

  
  @JsonFormat(pattern = "yyyy-MM-dd")
  private LocalDate date;

  @JsonFormat(pattern = "hh:mm:ss")
  private LocalTime time;

 
  
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public LocalTime getTime() {
    return time;
  }

  public void setTime(LocalTime time) {
    this.time = time;
  }

}