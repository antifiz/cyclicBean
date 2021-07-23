package com.example.demo;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bean1 {

  private final Bean2 bean2;
  public Bean2 getBean2(){
    return bean2;
  }
  @Autowired
  public Bean1(Bean2 bean2){
    this.bean2=bean2;
  };

  @PostConstruct
  private void postMethod(){
    bean2.setBean1(this);
  }
  public void hello(){
    System.out.println("Hello bean 1");
  }


}
