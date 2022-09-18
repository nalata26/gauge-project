package common;

import java.io.*;
import java.util.Properties;

public class loadConfig {
    public static String getProperties(String nameFileProperties, String key) {
        try {
            InputStream inputStream = new FileInputStream("env/dataProperties/" + nameFileProperties);
            Properties prop = new Properties();
            prop.load(inputStream);
            return prop.getProperty(key);
        } catch (Exception e) {
            return  null;
        }
    }
}

