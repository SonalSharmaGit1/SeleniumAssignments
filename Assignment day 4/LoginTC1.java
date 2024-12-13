package AssignmentDay4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import DriverInit.DriverStart;

public class LoginTC1 {
	WebDriver driver;
	public LoginTC1(WebDriver driver) {
        this.driver = driver;
	}
	
	 LoginTC1(){
		DriverStart obj= new DriverStart();
		driver= obj.init();
		PageFactory.initElements(driver, this);	
	}	
	
	WebElement emailLogin=driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]")); //login email
	WebElement passwordLogin=driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]")); //login password
	WebElement loginButton=driver.findElement(By.xpath("//button[contains(text(),'Login')]")); //Login button
	WebElement SignupLogin= driver.findElement(By.linkText("/login"));//signup-login button
	String LoginString =driver.findElement(By.tagName("h2")).getText();//Login to your account string
	WebElement loggedInText= driver.findElement(By.xpath("//a[contains(text(),' Logged in as ')]")); //logged in as username
	WebElement logoutButton= driver.findElement(By.xpath("//a[contains(text(),' Logout')]"));

	public void navigation() throws InterruptedException {
		driver.get("https://automationexercise.com/category_products/6");
	}
	
	public void clickLoginSignupButton() {
		SignupLogin.click();
	}
	
	public void verifyLoginText()
	{
		if(LoginString.equals("Login to your account"))
		{
			System.out.println("User has entered login box");
		}
	}
	
	public void setLoginEmail(){
		emailLogin.sendKeys("sonalssharma06@gmail.com");
		
	}
	
	public void setPassword() {
		passwordLogin.sendKeys("123qqqwwW&");
		
	}
	
	public void clickloginButton() {
		loginButton.click();
	}
	
	public void verifyLogin() {
		if(loggedInText.equals("Logged in as SonalSharma123"));
	    {
	    	System.out.println("Login Successful");
	    }
	}
	
	public void verifyLogoutButton() {
		if(logoutButton.equals("Logout")) {
			System.out.println("Login is successful");
		}
	}
	
	public void driverClose() {
	driver.close();
	}

	@Test
	public void loginToSite() throws InterruptedException {
		navigation();
		clickLoginSignupButton();
		verifyLoginText();
		setLoginEmail();
		setPassword();
		clickloginButton();
		verifyLogin();
		verifyLogoutButton();
		driverClose();
	}
}
