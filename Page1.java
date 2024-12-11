package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Page1 {

	@Test
	public void run()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonal\\eclipse-workspace\\Practice\\heyyyy\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/login");
		
		//Login and signUp Identification
		WebElement emailLogin=driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]")); //login email
		WebElement password=driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]")); //login password
		WebElement loginButton=driver.findElement(By.xpath("//button[contains(text(),'Login')]")); //Login button
		WebElement name=driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")); // SignUp name
		WebElement emailSignUp=driver.findElement(By.xpath("//input[@data-qa=\"signup-email\"]")); //SignUp email
		WebElement signupButton=driver.findElement(By.xpath("//button[contains(text(),'Signup')]")); //SignUp button
		WebElement subscriptionEmail= driver.findElement(By.id("susbscribe_email")); //subscription email address
		WebElement SignupLogin= driver.findElement(By.linkText("/login")); // SignUp/login button on top by linkText
		
		//String Identification
		String LoginString1 =driver.findElement(By.tagName("h2")).getText(); //Login String by tagName and getText()
		if(LoginString1.equals("Login to your account"))
			{
			 System.out.println("TC Passed");
			}
		WebElement LoginString2= driver.findElement(By.xpath("//h2[contains(text(),'Login to your account')]")); //Login String by xPath
		WebElement ORString1= driver.findElement(By.xpath("//h2[contains(text(),\"OR\")]")); // OR String by xPath
		WebElement ORString2= driver.findElement(By.className("or")); // OR String by className
		WebElement SignupString1= driver.findElement(By.xpath("//h2[contains(text(),'New User Signup!')]")); //SignUp String by xPath
		WebElement copyrightString= driver.findElement(By.className("pull-left")); // copyright string by className
		
		driver.close();

}
}
