package org.designpattern.structural.decorator;

import java.io.IOException;

public abstract class  DataSourceDecorator implements DataSource{
    private DataSource dataSource;

    public DataSourceDecorator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public String readData(String name) throws IOException{
        return dataSource.readData(name);
    }
}
