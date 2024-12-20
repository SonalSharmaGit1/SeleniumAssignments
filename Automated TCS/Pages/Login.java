package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import DriverPackage.DriverInit;

public class Login extends DriverInit{

	WebDriver driver;
	
	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h2[contains(text(),'website for Automation Engineers')]")
	WebElement automationText;
	@FindBy(xpath="//a[contains(text(),' Signup / Login')]")
	WebElement SignupLogin;
	@FindBy(xpath="//input[@data-qa='login-email']")
	WebElement loginEmail;
	@FindBy(xpath="//input[@data-qa='login-password']")
	WebElement loginPassword;
	@FindBy(xpath="//button[contains(text(),'Login')]")
	WebElement loginButton;
	@FindBy(xpath="//a[contains(text(),' Logged in as ')]")
	WebElement loggedInText;
	@FindBy(xpath="//a[contains(text(),' Logout')]")
	WebElement logoutButton;
	
	
	public void login() throws InterruptedException {
		verifyHomepage();
		clickLoginSignupButton();
		verifyLoginText();
		setLoginEmail();
		setPassword();
		clickloginButton();
		verifyLogin();
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
	
	public void verifyLoginText()
	{
	String LoginString = driver.findElement(By.tagName("h2")).getText();
	
		if(LoginString.equals("Login to your account"))
		{
			System.out.println("User has entered login box");
		}
	}
	private void setLoginEmail() throws InterruptedException {
		loginEmail.sendKeys("sonalssharma06@gmail.com");
		Thread.sleep(2000);
	}
	public void setPassword() throws InterruptedException {
		loginPassword.sendKeys("123qqqwwW&");
		Thread.sleep(2000);
	}
	public void clickloginButton() {
		loginButton.click();
		String actualUrl="https://automationexercise.com/";
		String expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
	}
	
	public void verifyLogin() {
		if(loggedInText.equals("Logged in as SonalSharma123"));
	    {
	    	System.out.println("Login Successful");
	    }
	}
	
	public void verifyLogoutButton() throws InterruptedException {
		if(logoutButton.equals("Logout")) {
			System.out.println("Logout button is visible ensuring successful login");
		}
		Thread.sleep(2000);
	}
	
}
