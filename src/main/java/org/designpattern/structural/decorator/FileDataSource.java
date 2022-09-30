package org.designpattern.structural.decorator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

public class FileDataSource implements DataSource {
    @Override
    public String readData(String name) throws IOException {
        Class clazz = FileDataSource.class;
        InputStream inputStream = clazz.getResourceAsStream(name);
        String text = new BufferedReader(
                new InputStreamReader(inputStream, StandardCharsets.UTF_8))
                .lines()
                .collect(Collectors.joining("\n"));
        return text;
    }
}
