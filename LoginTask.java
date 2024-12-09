package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class LoginTask {

	@Test
	public void run()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonal\\eclipse-workspace\\Practice\\heyyyy\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/login");
		WebElement email=driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]"));
		WebElement password=driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]"));
		email.sendKeys("sharmasonalss440@gmail.com");
		password.sendKeys("PriyanshiBitch123");
		WebElement login=driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		login.click();
		driver.close();
	}
}
