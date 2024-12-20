package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import DriverInit.DriverInit;

public class Signup extends DriverInit {
	
	WebDriver driver;
	
	public Signup(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h2[contains(text(),'website for Automation Engineers')]")
	WebElement automationText;
	@FindBy(xpath="//a[contains(text(),' Signup / Login')]")
	WebElement SignupLogin;
	@FindBy(xpath="//h2[contains(text(),'New User Signup!')]")
	WebElement SignupString;
	@FindBy(xpath="//input[@placeholder=\"Name\"]")
	WebElement nameSignup;
	@FindBy(xpath="//input[@data-qa=\"signup-email\"]")
	WebElement emailSignUp;
	@FindBy(xpath="//button[contains(text(),'Signup')]")
	WebElement signupButton;
	@FindBy(xpath="//b[contains(text(),'Enter Account Information')]")
	WebElement accountHeading;
	@FindBy(xpath="//input[@id=\"id_gender1\"]")
	WebElement radioButtonMr;
	@FindBy(xpath="//input[@id=\"id_gender2\"]")
	WebElement radioButtonMrs;
	@FindBy(xpath="//input[@id=\"name\"]")
	WebElement accountNameTextbox;
//	@FindBy(xpath="//input[@id=\"email\"]")
//	WebElement accountEmailTextbox;
	@FindBy(xpath="//input[@id=\"password\"]")
	WebElement accountPasswordTextbox;
	@FindBy(xpath="//select[@id=\"days\"]")
	WebElement daysDropdown;
	@FindBy(xpath="//option[@value=\"26\"]") //how to uniquely locate this?
	WebElement day26Value;
	@FindBy(xpath="//select[@id=\"months\"]")
	WebElement monthsDropdown;
	@FindBy(xpath="//select[@id='months']/option[10]") //how to uniquely locate this?
	WebElement month09Value;
	@FindBy(xpath="//select[@id=\"years\"]") 
	WebElement yearsDropdown;
	@FindBy(xpath="//select[@id='years']/option[24]") //how to uniquely locate this?
	WebElement year99Value; 
	@FindBy(xpath="//input[@id=\"newsletter\"]") 
	WebElement NewsletterCheckbox;
	@FindBy(xpath="//input[@id=\"optin\"]")
	WebElement offersCheckbox;
	@FindBy(xpath="//b[contains(text(),'Address Information')]")
	WebElement AddressInfoTitle ;
	@FindBy(xpath="//input[@id=\"first_name\"]")
	WebElement firstNameTextbox;
	@FindBy(xpath="//input[@id=\"last_name\"]")
	WebElement lastNameTextbox;
	@FindBy(xpath="//input[@id=\"company\"]")
	WebElement companyTextbox;
	@FindBy(xpath="//input[@id=\"address1\"]")
	WebElement address1Textbox;
	@FindBy(xpath="//input[@id=\"address2\"]")
	WebElement address2Textbox;
	@FindBy(xpath="//select[@id='country']")
	WebElement countryDropdown;
	@FindBy(xpath="//input[@id='state']")
	WebElement stateTextbox;
	@FindBy(xpath="//select[@id='country']/option[1]")
	WebElement countryIndia;
	@FindBy(xpath="//input[@id='state']/following::input[1]")
	WebElement cityTextbox;
	@FindBy(xpath="//input[@id='state']/following::input[2]")
	WebElement zipcodeTextbox;
	@FindBy(xpath="//input[@id='state']/following::input[3]")
	WebElement mobileNoTextbox;
	@FindBy(xpath="//button[contains(text(), 'Create Account')]")
	WebElement createAccountButton;
	@FindBy(xpath="//b[contains(text(),'Account Created!')]")
	WebElement accountCreatedText;
	@FindBy(xpath="//a[contains(text(),'Continue')]")
	WebElement continueButton;
	@FindBy(xpath="//a[contains(text(),' Logged in as ')]")
	WebElement loggedInText;
	@FindBy(xpath="//a[contains(text(),' Logout')]")
	WebElement logoutButton;
	
	
	public void signup() throws InterruptedException {
		verifyHomepage();
		clickLoginSignupButton();
		verifySignupText();
		setSignupName();
		setSignupEmail();
		clickSignupButton();
		verifyAccountInfo();
		selectMrs();
		verifySelectedTitle();
		setAccountName();
//		setAccountEmail();
		setAccountPassword();
		selectDOBDay();
		selectDOBMonth();
		selectDOBYear();
		selectCheckboxNewsletter();
		selectCheckboxOffers();
		verifyAddressInfoTitle();
		setAccountFirstName();
		setAccountLastName();
		setCompany();
		setAddress1();
		setAddress2();
		selectCountry();
		setState();
		setCity();
		setZipcode();
		setMobileNo();
		clickCreateAccountButton();
		verifyAccountCreated();
		continuePage();
		verifySignup();
		verifyLogoutButton();
		}
	
	public void verifyHomepage() {
		
		if(automationText.equals("website for Automation Engineers"))
		{
			System.out.println("User has entered Homepage");
		}
	}	
	public void clickLoginSignupButton() throws InterruptedException {
		SignupLogin.click();
		String actualUrl="https://automationexercise.com/login";
		String expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
	}
	public void verifySignupText()
	{
		if(SignupString.equals("New user Signup!"))
		{
			System.out.println("User has entered Signup box");
		}
	}
	public void setSignupName() {
		nameSignup.sendKeys("Sonal@12345");
		
	}
	
	public void setSignupEmail(){
		emailSignUp.sendKeys("sonalssharma06@gmail.com");
		
	}
	
	public void clickSignupButton() {
		signupButton.click();
		String actualUrl="https://automationexercise.com/signup";
		String expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
		
	}
	
	public void verifyAccountInfo() {
		if(accountHeading.equals("Enter Account Information"))
		{
			System.out.println("User has entered Account Info Page");
		}
	}
	public void selectMr() {
        if (!radioButtonMr.isSelected()) {
        	radioButtonMr.click();
        }
    }
	public void selectMrs() {
        if (!radioButtonMrs.isSelected()) {
        	radioButtonMrs.click();
        }
    }
	public void verifySelectedTitle() {
		if (radioButtonMr.isSelected()) {
			radioButtonMr.click();
        } 
		else if (radioButtonMrs.isSelected()) {
			radioButtonMrs.click();
		}	
	}
	
	public void setAccountName() {
		accountNameTextbox.clear();
		accountNameTextbox.sendKeys("Sonal Sharma");
	}
	
//	public void setAccountEmail() {
//		accountEmailTextbox.clear();
//		accountEmailTextbox.sendKeys("sonalssharma06@gmail.com");
//	}
	
	public void setAccountPassword() throws InterruptedException {
		accountPasswordTextbox.sendKeys("Testing@12345");
		Thread.sleep(3000);
	}
	public void selectDOBDay() {
		daysDropdown.click();
		day26Value.click();
	}
	public void selectDOBMonth() {
		monthsDropdown.click();
		month09Value.click();
	}
	public void selectDOBYear() throws InterruptedException {
		yearsDropdown.click();
		year99Value.click();
		Thread.sleep(3000);
	}
	public void selectCheckboxNewsletter() {
		NewsletterCheckbox.click();
	}
	public void selectCheckboxOffers() {
		offersCheckbox.click();
	}
	public void verifyAddressInfoTitle() {
		if(AddressInfoTitle.equals("Address Information"))
		{
			System.out.println("User has entered Address Information section");
		}
	}
	public void setAccountFirstName() {
		firstNameTextbox.sendKeys("Sonal");
	}
	
	public void setAccountLastName() throws InterruptedException {
		lastNameTextbox.sendKeys("Sharma");
		Thread.sleep(2000);
	}
	public void setCompany() {
		companyTextbox.sendKeys("XYZ");
	}
	public void setAddress1() {
		address1Textbox.sendKeys("Mantra");
	}
	public void setAddress2() {
		address2Textbox.sendKeys("Insignia");
	}
	public void selectCountry() {
		countryDropdown.click();
		countryIndia.click();
	}
	public void setState() {
		stateTextbox.sendKeys("Maharashtra");
	}
	public void setCity() {
		cityTextbox.sendKeys("Pune");
	}
	public void setZipcode() throws InterruptedException {
		zipcodeTextbox.sendKeys("411036");
		Thread.sleep(2000);
	}
	public void setMobileNo() {
		mobileNoTextbox.sendKeys("1234567890");
	}
	public void clickCreateAccountButton() throws InterruptedException {
		createAccountButton.click();
		String actualUrl="https://automationexercise.com/account_created";
		String expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
		Thread.sleep(3000);
	}
	public void verifyAccountCreated() {
		accountCreatedText.equals("Account Created!");
		{
			System.out.println("Account has been created successfully");
		}
	}
	public void continuePage() {
		continueButton.click();
		String actualUrl="https://automationexercise.com/";
		String expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
	}
	public void verifySignup() {
		if(loggedInText.equals("Logged in as SonalSharma123"));
	    {
	    	System.out.println("Signup Successful");
	    }
	}
	public void verifyLogoutButton() throws InterruptedException {
		if(logoutButton.equals("Logout")) {
			System.out.println("Logout button is visible ensuring successful signup");
		}
		Thread.sleep(2000);
	}
}
