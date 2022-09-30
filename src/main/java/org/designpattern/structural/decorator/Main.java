package org.designpattern.structural.decorator;

import org.designpattern.structural.decorator.CompressorDecorator;
import org.designpattern.structural.decorator.DataSource;
import org.designpattern.structural.decorator.EncryptDecorator;
import org.designpattern.structural.decorator.FileDataSource;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");

        String fileName = "/TestFile.txt";
        String result;

        /*DataSource dataSource = new FileDataSource();
        result = dataSource.readData(fileName);*/

        /*DataSource dataSource = new EncryptDecorator(new FileDataSource());
        result = decorator.readData(fileName);*/

        DataSource dataSource = new EncryptDecorator(
                new CompressorDecorator(
                        new FileDataSource()
                ));
        result = dataSource.readData(fileName);

        System.out.print(result);
    }
}