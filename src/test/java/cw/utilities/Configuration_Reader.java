package cw.utilities;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class Configuration_Reader {

    public static Properties properties;   //Create Properties instance

    static{
        String filePath="configuration.properties";  //path of the configuration file
        try {
            FileInputStream fis=new FileInputStream(filePath);
            properties=new Properties();
            properties.load(fis);
            //close the file
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String getProperty(String key){

        return properties.getProperty(key);
    }
}
