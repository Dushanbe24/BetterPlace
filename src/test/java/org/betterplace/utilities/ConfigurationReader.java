package org.betterplace.utilities;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * reads the properties file configuration.properties
 */
public class ConfigurationReader {

    private static Properties properties;

    static {

        String path = "configuration.properties";

        try {
            FileInputStream input = new FileInputStream(path);
            properties = new Properties();
            properties.load(input);
            input.close();

        } catch (Exception e) {
            e.printStackTrace();

        } }

    public static String getValue(String keyName) {
        return properties.getProperty(keyName);
    }

}

