package AssignmentDay3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page8 {

	public void run()
	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonal\\eclipse-workspace\\Practice\\PrepJob\\src\\test\\resources\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://automationexercise.com/login");
	

	WebElement  paymentHeading= driver.findElement(By.xpath("//h2[contains(text(),'Payment')]"));
	WebElement  paymentBox= driver.findElement(By.xpath("//div[@class=\"col-md-12 form-group\"]"));//whole payment box
	WebElement  nameTextbox= driver.findElement(By.xpath("//input[@fdprocessedid=\"i9uw3c\"]"));
	WebElement  cardNumberTextbox= driver.findElement(By.xpath("//input[@fdprocessedid=\"i9uw3c\"]//following::input[1]"));
	WebElement  cvvTextbox= driver.findElement(By.xpath("//input[@fdprocessedid=\"i9uw3c\"]//following::input[2]"));
	WebElement  expirationMonth= driver.findElement(By.xpath("//input[@fdprocessedid=\"i9uw3c\"]//following::input[3]"));
	WebElement  expirationYear= driver.findElement(By.xpath("//input[@fdprocessedid=\"i9uw3c\"]//following::input[4]"));
	WebElement  payButton= driver.findElement(By.xpath("//button[@id=\"submit\"]"));
	WebElement  loggedInText= driver.findElement(By.xpath("//a[contains(text(),' Logged in as ')]"));
	
	driver.close();
}
	
}
