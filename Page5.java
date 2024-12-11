package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page5 {
	public void run()
	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonal\\eclipse-workspace\\Practice\\heyyyy\\src\\test\\resources\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://automationexercise.com/login");
	
	WebElement productsButton = driver.findElement(By.xpath("//ol[@class=\"breadcrumb\"]/li[1]"));
	WebElement menJeansProductTitle = driver.findElement(By.xpath("//h2[contains(text(),'Men - ')]"));

	
	driver.close();
	
	}
	

}
