package AssignmentDay4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import DriverInit.DriverStart;

public class SignupTC4 {
	
	WebDriver driver;
	public SignupTC4(WebDriver driver) {
        this.driver = driver;
	}
	
	SignupTC4(){
		DriverStart obj= new DriverStart();
		driver= obj.init();
		PageFactory.initElements(driver, this);	
	}	

	WebElement SignupLogin= driver.findElement(By.linkText("/login"));//signup-login button
	WebElement SignupString= driver.findElement(By.xpath("//h2[contains(text(),'New User Signup!')]"));
	WebElement nameSignup=driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")); // SignUp name
	WebElement emailSignUp=driver.findElement(By.xpath("//input[@data-qa=\"signup-email\"]")); //SignUp email
	WebElement signupButton=driver.findElement(By.xpath("//button[contains(text(),'Signup')]")); //SignUp button
	WebElement accountHeading= driver.findElement(By.xpath("//b[contains(text(),'Enter Account Information')]"));
	WebElement radioButtonMr= driver.findElement(By.xpath("//input[@id=\"id_gender1\"]"));
	WebElement radioButtonMrs= driver.findElement(By.xpath("//input[@id=\"id_gender2\"]"));	
	WebElement accountNameTextbox= driver.findElement(By.xpath("//input[@id=\"name\"]"));
	WebElement accountEmailTextbox= driver.findElement(By.xpath("//input[@id=\"email\"]"));
	WebElement accountPasswordTextbox= driver.findElement(By.xpath("//input[@id=\"password\"]"));
	WebElement daysDropdown= driver.findElement(By.xpath("//select[@id=\"days\"]"));
	WebElement monthsDropdown= driver.findElement(By.xpath("//select[@id=\"months\"]"));
	WebElement yearsDropdown= driver.findElement(By.xpath("//select[@id=\"years\"]"));
	WebElement NewsletterCheckbox= driver.findElement(By.xpath("//input[@id=\"newsletter\"]"));
	WebElement offersCheckbox= driver.findElement(By.xpath("//input[@id=\"optin\"]"));
	WebElement AddressInfoTitle= driver.findElement(By.xpath("//b[contains(text(),'Address Information')]"));
	WebElement firstNameTextbox= driver.findElement(By.xpath("//input[@id=\"first_name\"]"));
	WebElement lastNameTextbox= driver.findElement(By.xpath("//input[@id=\"last_name\"]"));
	WebElement companyTextbox = driver.findElement(By.xpath("//input[@id=\"company\"]"));
	WebElement address1Textbox= driver.findElement(By.xpath("//input[@id=\"address1\"]"));
	WebElement address2Textbox= driver.findElement(By.xpath("//input[@id=\"address2\"]"));
	WebElement countryDropdown= driver.findElement(By.xpath("//select[@id='country']"));
	WebElement stateTextbox= driver.findElement(By.xpath("//input[@id='state']"));
	WebElement cityTextbox= driver.findElement(By.xpath("//input[@id='state']/following::input[1]")); //used following xpath
	WebElement zipcodeTextbox= driver.findElement(By.xpath("//input[@id='state']/following::input[2]"));
	WebElement mobileNoTextbox= driver.findElement(By.xpath("//input[@id='state']/following::input[3]"));
	WebElement createAccountButton= driver.findElement(By.xpath("//button[contains(text(),'Create Account')]"));
	
	
	public void navigation() throws InterruptedException {
		driver.get("https://automationexercise.com/category_products/6");
	}
	
	public void clickLoginSignupButton() {
		SignupLogin.click();
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
	}
	
	public void verifyAccountInfo() {
		if(accountHeading.equals("Enter Account Information"))
		{
			System.out.println("User has entered Account Info Page");
		}
	}
	
	public void selectTitle() {
		if (radioButtonMr.isSelected()) {
			radioButtonMr.click();
        } 
		else if (radioButtonMrs.isSelected()) {
			radioButtonMrs.click();
		}	
	}
	
	public void setAccountName() {
		accountNameTextbox.sendKeys("Sonal Sharma");
	}
	
	public void setAccountEmail() {
		accountEmailTextbox.sendKeys("sonalssharma06@gmail.com");
	}
	public void setAccountPassword() {
		accountPasswordTextbox.sendKeys("Testing@12345");
	}
	public void selectDOBDay() {
		daysDropdown.click();
	}
	public void selectDOBMonth() {
		monthsDropdown.click();
	}
	public void selectDOBYear() {
		yearsDropdown.click();
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
	
	public void setAccountLastName() {
		lastNameTextbox.sendKeys("Sharma");
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
	}
	public void setState() {
		stateTextbox.sendKeys("Maharashtra");
	}
	public void setCity() {
		cityTextbox.sendKeys("Pune");
	}
	public void setZipcode() {
		zipcodeTextbox.sendKeys("411036");
	}
	public void setMobileNo() {
		mobileNoTextbox.sendKeys("1234567890");
	}
	public void clickCreateAccountButton() {
		createAccountButton.click();
	}
	public void driverClose() {
		driver.close();
	}
	
}
	



