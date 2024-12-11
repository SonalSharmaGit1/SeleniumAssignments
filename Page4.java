package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page4 {
	
	public void run()
	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonal\\eclipse-workspace\\Practice\\heyyyy\\src\\test\\resources\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://automationexercise.com/login");
	
	//ProdcutPage Identification
	
	WebElement advertisement = driver.findElement(By.xpath("//img[@src=\"/static/images/shop/sale.jpg\"]"));
	WebElement searchIcon  = driver.findElement(By.xpath("//i[@class=\"fa fa-search\"]"));
	WebElement searchProductText  = driver.findElement(By.xpath("//input[@id='search_product']"));
	WebElement allProductsText = driver.findElement(By.xpath("//h2[contains(text(),'All Products')]"));
	driver.close();
	
	}
	
}
