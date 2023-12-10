package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String args[]){
       ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
      // Teacher student = context.getBean(Teacher.class);//or
        Teacher school = (Teacher) context.getBean("teacher");//using the id of the bean we can create the object but here we have to do typecasting (Teacher) beacuse it will receive the type as object
       school.detail();
       System.out.println(school.getCourse());
    }
}
