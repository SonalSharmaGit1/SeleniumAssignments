package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class signupTask {

	public static void main(String[] args)
	{
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonal\\eclipse-workspace\\Practice\\heyyyy\\src\\test\\resources\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://automationexercise.com/login");
			WebElement name=driver.findElement(By.xpath("//input[@placeholder=\"Name\"]"));
			WebElement email=driver.findElement(By.xpath("//input[@data-qa=\"signup-email\"]"));
			name.sendKeys("SonalSharma");
			email.sendKeys("sharmasonalss440@gmail.com");
			WebElement signup=driver.findElement(By.xpath("//button[contains(text(),'Signup')]"));
			signup.click();
//			String actualUrl="https://automationexercise.com/signup";
//			String expectedUrl= driver.getCurrentUrl();
//			Assert.assertEquals(expectedUrl,actualUrl);
			driver.close();
		}
	}
}
		
