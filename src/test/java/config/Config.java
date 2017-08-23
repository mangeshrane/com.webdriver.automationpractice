package config;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


 public class Config{

	 private Config(){
	 }

	    public static Properties getRepo(){
		
	    Properties pro = new Properties();
		File src = new File("src/test/java/config/config.properties");
		FileInputStream fi;
		try {
			fi = new FileInputStream(src);
			pro.load(fi);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pro;  	
	}
}
