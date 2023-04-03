package com.example.session.spring;

import com.example.session.core.HelloWorldGreeter;
import com.example.session.spring.config.HelloworldConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Reads the provided configuration file creates the beans defined using @Bean annotations and
 * injects the dependencies based using Setter injection.
 */
public class AnnotationBasedConfigExample1 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloworldConfiguration.class);
        HelloWorldGreeter helloWorldGreeter = context.getBean("helloWorldStreamWriter", HelloWorldGreeter.class);
        helloWorldGreeter.write("Say Hello using annotations from configuration");
    }

}
