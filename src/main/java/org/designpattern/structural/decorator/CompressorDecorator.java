package org.designpattern.structural.decorator;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class CompressorDecorator extends DataSourceDecorator {
    public CompressorDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public String readData(String name) throws IOException {
        String data = super.readData(name);
        return compressData(data);
    }

    private String compressData(String data) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        GZIPOutputStream gzip = new GZIPOutputStream(out);
        gzip.write(data.getBytes());
        gzip.close();
        return out.toString("ISO-8859-1");
    }
}
