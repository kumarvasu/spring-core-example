package com.example.session.core;

public class HelloWorldGreeter {

    private Writer writer;

    public HelloWorldGreeter(){}

    public HelloWorldGreeter(Writer writer){
        this.writer = writer;
    }

    public void write(String text){
        writer.write(text);
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }
}
