package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bean2 {
  private Bean1 bean1;
  public Bean1 getBean1(){
    return bean1;
  }
  public void setBean1(Bean1 bean1){
   this.bean1=bean1;
  }
  @Autowired
  public Bean2(){}

  public void hello(){
    System.out.println("Hello bean 2");
  }

}
