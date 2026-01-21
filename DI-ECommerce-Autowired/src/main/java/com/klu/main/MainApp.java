package com.klu.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.klu.model.Order;
import com.klu.config.AppConfig;
public class MainApp {
    
 public static void main(String args[]) {
  ApplicationContext cn=new AnnotationConfigApplicationContext(AppConfig.class);
     Order or=cn.getBean(Order.class);
     or.display();
 }
}