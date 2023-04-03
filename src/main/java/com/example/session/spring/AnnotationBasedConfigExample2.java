package com.example.session.spring;

import com.example.session.core.HelloWorldGreeter;
import com.example.session.spring.config.HelloworldConfigurationConstructorExample;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Reads the provided configuration file creates the beans defined using @Bean annotations and
 * injects the dependencies based using constructor injection.
 */
public class AnnotationBasedConfigExample2 {

    public static void main(String [] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloworldConfigurationConstructorExample.class);
        HelloWorldGreeter helloWorldGreeter = context.getBean("helloWorldStreamWriter", HelloWorldGreeter.class);
        helloWorldGreeter.write("Say Hello using construction injected bean creation from configuration");
    }

}
