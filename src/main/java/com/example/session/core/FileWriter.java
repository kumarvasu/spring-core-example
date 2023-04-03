package com.example.session.core;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileWriter implements Writer {

    @Override
    public void write(String text) {
        try {
            Files.write(Paths.get("test.txt"), text.getBytes());
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
