package com.example.session.spring;

import com.example.session.core.scan.CSHelloWorld;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationBasedConfigExample3 {

    public static void main(String [] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.example.session.core.scan");
        CSHelloWorld helloWorldGreeter = context.getBean("helloWorldGreeter", CSHelloWorld.class);
        helloWorldGreeter.write("Say Hello using component scanning");
    }

}
