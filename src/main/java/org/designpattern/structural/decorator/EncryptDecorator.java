package org.designpattern.structural.decorator;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

import java.io.IOException;

public class EncryptDecorator extends DataSourceDecorator {
    public EncryptDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public String readData(String name) throws IOException {
        String data = super.readData(name);
        return encryptData(data);
    }

    private String encryptData(String data) {
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setPassword("1234");
        String encryptedData = encryptor.encrypt(data);
        return encryptedData;
    }
}
