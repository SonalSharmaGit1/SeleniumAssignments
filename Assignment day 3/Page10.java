package AssignmentDay3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page10 {

	public void run()
	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonal\\eclipse-workspace\\Practice\\PrepJob\\src\\test\\resources\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://automationexercise.com/login");
	
	
	WebElement  reviewTextTitle= driver.findElement(By.xpath("//a[contains(text(),'Write Your Review')]"));
	WebElement  nameTextbox= driver.findElement(By.xpath("//input[@id=\"name\"]"));
	WebElement  emailtextbox= driver.findElement(By.xpath("//input[@id=\"name\"]/following::input[1]"));
	WebElement  reviewTextbox= driver.findElement(By.xpath("//textarea[@id=\"review\"]"));
	WebElement  submitButton= driver.findElement(By.xpath("//button[@id=\"button-review\"]"));
	
	driver.close();
}
}
