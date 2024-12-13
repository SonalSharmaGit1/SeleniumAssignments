package AssignmentDay3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page9 {

	public void run()
	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonal\\eclipse-workspace\\Practice\\PrepJob\\src\\test\\resources\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://automationexercise.com/login");
	
	
	WebElement  orderPlacedText= driver.findElement(By.xpath("//b[contains(text(),'Order Placed!')]"));
	WebElement  congratulationText= driver.findElement(By.xpath("//p[contains(text(),'Congratulations!')]"));
	WebElement  downloadInvoice= driver.findElement(By.xpath("//a[contains(text(),'Download') and @href=\"/download_invoice/1500\"]"));
	WebElement  continueButton= driver.findElement(By.xpath("//a[contains(text(),'Continue') and @href=\"/\"]"));
	WebElement  deleteAccountButton= driver.findElement(By.xpath("//a[contains(text(),' Delete Account')]"));
	WebElement  logoutButton= driver.findElement(By.xpath("//a[contains(text(),' Logout')]"));
	
	
	driver.close();
	}
}
