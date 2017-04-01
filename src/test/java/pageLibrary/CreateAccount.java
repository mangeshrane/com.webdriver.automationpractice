package pageLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	WebDriver driver;
	
	public CreateAccount(WebDriver driver){
		this.driver = driver;
	}
	//WebElements
	@FindBy(xpath=".//*[@id='email_create']") WebElement createMail;	
	@FindBy(xpath=".//*[@id='SubmitCreate']") WebElement createAcBtn;	
	@FindBy(xpath=".//*[@id='id_gender1']") WebElement genderMale;	
	@FindBy(xpath=".//*[@id='id_gender2']") WebElement genderFemale;	
	@FindBy(xpath=".//*[@id='customer_firstname']") WebElement firstName;	
	@FindBy(xpath=".//*[@id='customer_lastname']") WebElement lastName;	
	@FindBy(xpath=".//*[@id='email']") WebElement email;	
	@FindBy(xpath=".//*[@id='passwd']") WebElement password;	
	@FindBy(xpath=".//*[@id='newsletter']") WebElement newsletterCheckbox;	
	@FindBy(xpath=".//*[@id='optin']") WebElement specialOffersCheckbox;
	@FindBy(xpath=".//*[@id='optin']") WebElement day;
	@FindBy(xpath=".//*[@id='optin']") WebElement month;
	@FindBy(xpath=".//*[@id='optin']") WebElement year;
	
	@FindBy(xpath=".//*[@id='firstname']") WebElement Name;
	@FindBy(xpath=".//*[@id='lastname']") WebElement lastname;
	@FindBy(xpath=".//*[@id='company']") WebElement company;
	@FindBy(xpath=".//*[@id='address1']") WebElement address;
	@FindBy(xpath=".//*[@id='address2']") WebElement address2;
	@FindBy(xpath=".//*[@id='city']") WebElement city;
	@FindBy(xpath=".//*[@id='id_state']") WebElement state;
	@FindBy(xpath=".//*[@id='postcode']") WebElement zip;
	@FindBy(xpath=".//*[@id='id_country']") WebElement country;
	@FindBy(xpath=".//*[@id='other']") WebElement additionalInfo;
	@FindBy(xpath=".//*[@id='phone']") WebElement homePhone;
	@FindBy(xpath=".//*[@id='phone_mobile']") WebElement mobilePhone;
	@FindBy(xpath=".//*[@id='alias']") WebElement addressForRef;
	@FindBy(xpath=".//*[@id='submitAccount']") WebElement regButtom;
	
	
	//basic operations
	public void createAccount(String email){
		   createMail.sendKeys(email);
		   createAcBtn.click();
		}
	
	public void selectDOB(String day,String Month,String year){
		Select d = new Select(this.day);
		d.deselectByVisibleText(day);
		Select m = new Select(this.month);
		m.deselectByVisibleText("Month");
		Select y = new Select(this.year);
		y.selectByVisibleText(year);
	}
	
	public void selectCountry(String country){
		Select c = new Select(this.country);
		c.deselectByVisibleText(country);
	}

}
