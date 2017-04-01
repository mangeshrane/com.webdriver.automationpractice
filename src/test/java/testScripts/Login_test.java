package testScripts;



import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageLibrary.LoginPage;
import testBase.TestBase;

public class Login_test extends TestBase{
	Logger log = Logger.getLogger(Login_test.class.getName());
	
	
	@Test
	public void check_login() throws IOException{
	PropertyConfigurator.configure("log4j.properties");
    log.info("check login test started");
    log.info("initializing page");
	LoginPage LoginPage = PageFactory.initElements(driver, LoginPage.class);
	log.info("Signing In");
	LoginPage.logIn("username@mail.com", "asdghj");
	}

}
