package org.designpattern.structural.decorator;

import java.io.IOException;

public interface DataSource {
    public String readData(String name) throws IOException;
}
