package com.example.session.core.scan;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Component
public class CSFileWriter implements CSWriter {

    @Override
    public void write(String text) {
        try {
            Files.write(Paths.get("test.txt"), text.getBytes());
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
