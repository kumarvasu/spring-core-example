package com.example.session.core.scan;

import org.springframework.stereotype.Component;

@Component("streamWriter")
public class CSStreamWriter implements CSWriter {

    @Override
    public void write(String text) {
        System.out.println("text: "+ text);
    }
}
