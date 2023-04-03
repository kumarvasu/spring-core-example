package com.example.session.spring.config;

import com.example.session.core.FileWriter;
import com.example.session.core.HelloWorldGreeter;
import com.example.session.core.StreamWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloworldConfigurationConstructorExample {

    @Bean
    public FileWriter fileWriter(){
        return new FileWriter();
    }

    @Bean
    public StreamWriter streamWriter(){
        return new StreamWriter();
    }

    @Bean
    public HelloWorldGreeter helloWorldStreamWriter(StreamWriter streamWriter){
        return new HelloWorldGreeter(streamWriter);
    }

    @Bean
    public HelloWorldGreeter helloWorldFileWriter(FileWriter fileWriter){
        return new HelloWorldGreeter(fileWriter);
    }

}
