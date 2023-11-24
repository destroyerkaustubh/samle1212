package UtilityLayer;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClass {

	public static String getproperty(String keyname)
	{
		Properties prop =new Properties();
		
		String path=System.getProperty("user.dir")+"\\src\\main\\resources\\Config.properties";
		
		
		try {
			FileInputStream fis= new FileInputStream(path);
			prop.load(fis);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		    String Value=prop.getProperty(keyname);
		    return Value;
	}
}
