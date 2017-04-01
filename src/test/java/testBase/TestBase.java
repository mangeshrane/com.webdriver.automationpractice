package testBase;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import config.Config;
import utillity.InitBrowser;

public class TestBase {
	public static WebDriver driver;
	static Properties repo = Config.getRepo();
	

	@BeforeClass
	public static void setUp(){
		driver = InitBrowser.getDriver();
		//driver.manage().window().maximize();
		driver.get(repo.getProperty("url"));
	}
	
	@AfterClass
	public static void tearDown(){
		driver.close();
		driver.quit();
	}
}
