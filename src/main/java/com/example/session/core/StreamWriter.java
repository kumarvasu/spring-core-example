package com.example.session.core;

public class StreamWriter implements Writer {
    @Override
    public void write(String text) {
        System.out.println("text: "+ text);
        //throw new RuntimeException("retry exception");
    }
}
