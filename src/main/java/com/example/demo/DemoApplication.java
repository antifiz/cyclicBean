package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

  public static void main(String[] args) {
   ApplicationContext ctx= SpringApplication.run(DemoApplication.class, args);
   Bean1 bean1=(Bean1)ctx.getBean("bean1");
   Bean2 bean2=(Bean2)ctx.getBean("bean2");
   bean1.hello();
   bean1.getBean2().hello();
   System.out.println("-----------------");
   bean2.hello();
   bean2.getBean1().hello();
  }

}
