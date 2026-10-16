package com.example.springcore;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringcoreApplication {

    public static void main(String[] args) {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
        Employee emp=ctx.getBean(Employee.class);
        Employee emp2=ctx.getBean(Employee.class);

        emp.display();
    }

}
