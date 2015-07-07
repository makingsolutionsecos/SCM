/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.scm.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 *
 * @author Camilo Marroquin
 */
public class ApiKeyReader extends Reader {
    
    private FileReader reader;

    public ApiKeyReader() {
        try {
            String osName = System.getProperty("os.name");
            if(osName.contains("Mac OS") || osName.contains("linux")) {
                reader = new FileReader("/Users/camilomarroquin/apiKey-6HXSABEVR2KTICIOBAJHMNWSO.properties");
            } else if(osName.contains("windows")) {
                reader = new FileReader("C:\\llave/apiKey-6HXSABEVR2KTICIOBAJHMNWSO.properties");
            } else {
                throw new RuntimeException("Unrecognized OS: " + osName);
            }
        } catch (FileNotFoundException e) {
            
        }

    }

    @Override
    public int read(char[] chars, int i, int i2) throws IOException {
        return reader.read(chars, i, i2);
    }

    @Override
    public void close() throws IOException {
        reader.close();
    }
}
