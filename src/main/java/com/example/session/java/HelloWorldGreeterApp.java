package com.example.session.java;

import com.example.session.core.HelloWorldGreeter;
import com.example.session.core.StreamWriter;

public class HelloWorldGreeterApp {

    public static void main(String[] args){
        HelloWorldGreeter helloWorldGreeter = new HelloWorldGreeter();
        helloWorldGreeter.setWriter(new StreamWriter());
        helloWorldGreeter.write("Without Spring");
    }
}
