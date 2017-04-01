package pageLibrary;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver ldriver){
		this.driver = ldriver;
	}
	
	static Logger log = Logger.getLogger(LoginPage.class.getName());
	 	
	@FindBy(xpath=".//*[@id='email']") WebElement userNameInput;
	
	@FindBy(xpath= ".//*[@id='passwd']") WebElement passwordInput;
	
	@FindBy(xpath=".//*[@id='SubmitLogin']") WebElement signInButton;

	@FindBy(xpath=".//*[@id='login_form']/div/p[1]/a") WebElement forgotPassword;
	
	@FindBy(xpath=".//*[@id='form_forgotpassword']/fieldset/p/button") WebElement retrivepass;
	
	@FindBy(xpath=".//*[@id='header']/div[2]/div/div/nav/div[1]/a") WebElement signInPage;
	
	public void logIn(String userName,String Password){
		
	  signInPage.click();
	 
	  userNameInput.sendKeys(userName);
	  log.info("userName entered");
	  passwordInput.sendKeys(Password);
	  log.info("password entered");
	  signInButton.click();
	  log.info("clicked on signIn button");
	}
		
	public void forgotPass(String email){
		forgotPassword.click();
		userNameInput.sendKeys(email);
		retrivepass.click();
		
	}
}
