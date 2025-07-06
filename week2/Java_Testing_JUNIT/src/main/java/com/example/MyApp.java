package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        // Load Spring configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Get the HelloWorld bean
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

        // Call the method
        obj.sayHello();
    }
}
