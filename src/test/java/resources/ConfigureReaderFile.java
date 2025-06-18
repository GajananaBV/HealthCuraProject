package resources;

import java.util.Properties;

import java.io.FileInputStream;
import java.io.IOException;

public class ConfigureReaderFile

{
	
	private static Properties prop=new Properties();
	
	static {
	 try {
		FileInputStream file = new FileInputStream("src/test/java/resources/config.properties");
		 
		prop.load(file);
		
		
	} catch (IOException e) {
		
		e.printStackTrace();
	}}
	
	public static String getProperty(String key) 
	{
		return prop.getProperty(key);
		
	}

	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
