package utillity;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import config.Config;


public class InitBrowser{
	    static WebDriver driver;
	    static Logger log = Logger.getLogger(InitBrowser.class.getName());
		public static WebDriver getDriver(){
			PropertyConfigurator.configure("log4j.properties");
			Properties repo = Config.getRepo();
			String browser =repo.getProperty("browser"); 
			log.info("Browser from property file is loaded");
			if(browser.equalsIgnoreCase("chrome")){
				log.info("setting system property");
				System.setProperty("webdriver.chrome.driver",repo.getProperty("chromeDriverPath"));
				log.info("Starting chrome session");
				driver = new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("firefox")){
				System.setProperty("webdriver.gecko.driver",repo.getProperty("firefoxDriverPath"));
				driver = new FirefoxDriver();
			}
			else if(browser.equalsIgnoreCase("ie")){
				System.setProperty("webdriver.ie.driver", repo.getProperty("ieDriverPath"));
				driver = new InternetExplorerDriver();
			}
			else if(browser.equalsIgnoreCase("edge")){
				System.setProperty("com.webdriver.edge", repo.getProperty("edgeDriverPath"));
				driver = new EdgeDriver();
			}
		
			return driver;
			
	
	}
	
}
