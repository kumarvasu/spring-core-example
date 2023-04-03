package com.example.session.spring;

import com.example.session.core.HelloWorldGreeter;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLBasedConfigExample {

    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        HelloWorldGreeter helloWorld = context.getBean("helloWorldStreamWriter", HelloWorldGreeter.class);
        helloWorld.write("Say Hello!");
    }
}
