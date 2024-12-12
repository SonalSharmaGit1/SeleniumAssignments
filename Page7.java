package AssignmentDay3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page7 {
	
	public void run()
	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonal\\eclipse-workspace\\Practice\\PrepJob\\src\\test\\resources\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://automationexercise.com/login");
	
	WebElement  checkoutText= driver.findElement(By.xpath("//li[contains(text(),'Checkout')]"));
	WebElement  deliveryAddressText= driver.findElement(By.xpath("//h3[contains(text(),'Your delivery address')]"));
	WebElement  billingAddressText= driver.findElement(By.xpath("//h3[contains(text(),'Your delivery address')]/following::h3"));
	WebElement  deliveryAddressBox= driver.findElement(By.xpath("//ul[@id=\"address_invoice\"]"));
	WebElement  reviewOrderText= driver.findElement(By.xpath("//h2[contains(text(),'Review Your Order')]"));
	WebElement  totalAmountText= driver.findElement(By.xpath("//b[contains(text(),'Total Amount')]"));
	WebElement  commentText= driver.findElement(By.xpath("//label[contains(text(),'If you would like')]"));
	WebElement  commentBox= driver.findElement(By.xpath("//textarea[@class=\"form-control\" and @name=\"message\"]"));
	WebElement  placeorderButton= driver.findElement(By.xpath("//a[@href=\"/payment\"]"));

	
	driver.close();
	}

}
