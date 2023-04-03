package com.example.session.core.scan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("helloWorldGreeter")
public class CSHelloWorld {

    @Qualifier("streamWriter")
    @Autowired
    private CSWriter writer;

    public void write(String text){
        writer.write(text);
    }

}
