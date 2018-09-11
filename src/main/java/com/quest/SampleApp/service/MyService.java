package com.quest.SampleApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quest.SampleApp.repository.MyRepository;

@Service
public class MyService {

  @Autowired
  MyRepository repo;

  public void doStuff() {
    repo.findByName( "steve" );
  }
}