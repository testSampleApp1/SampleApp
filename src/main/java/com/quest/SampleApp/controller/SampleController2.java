package com.quest.SampleApp.controller;

import org.springframework.web.bind.annotation.GetMapping;


public class SampleController2 {
	
	  @GetMapping("/result")
	  public String example() throws Exception {
		  return "I am executed";
	  }

}
