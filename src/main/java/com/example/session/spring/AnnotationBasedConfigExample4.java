package com.example.session.spring;

import com.example.session.core.scan.CSHelloWorld;
import com.example.session.core.scan.CSHelloWorldConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Scans the package provided and creates the beans defined using @Component annotations and
 * injects the dependencies based on @Autowired annotation.
 */
public class AnnotationBasedConfigExample4 {

    public static void main(String [] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CSHelloWorldConfig.class);
        CSHelloWorld helloWorldGreeter = context.getBean("helloWorldGreeter", CSHelloWorld.class);
        helloWorldGreeter.write("Say Hello using component scanning from config file");
    }

}
