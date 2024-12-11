package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page6 {

	public void run()
	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonal\\eclipse-workspace\\Practice\\heyyyy\\src\\test\\resources\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://automationexercise.com/login");
	
	//ContactUs Page Identification
	WebElement ContactUsText = driver.findElement(By.xpath("//h2[contains(text(),'Contact ')]"));
	WebElement UsText = driver.findElement(By.xpath("//strong[contains(text(),'Us')]"));
	WebElement Notetext = driver.findElement(By.xpath("//b[contains(text(),'Note: ')]"));
	WebElement NameTextbox = driver.findElement(By.xpath("//input[@placeholder=\"Name\"]"));
	WebElement EmailTextbox= driver.findElement(By.xpath("//input[@placeholder=\"Email\"]"));
	WebElement SubjectTextbox = driver.findElement(By.xpath("//input[@placeholder=\"Subject\"]"));
	WebElement textAreaTextbox = driver.findElement(By.xpath("//textarea[@id=\"message\"]"));
	WebElement  chooseFile= driver.findElement(By.xpath("//input[@name=\"upload_file\"]"));
	WebElement submitButton = driver.findElement(By.xpath("//input[@name=\"submit\"]"));
	WebElement feedbackMail = driver.findElement(By.xpath("//a[@href=\"mailto:feedback@automationexercise.com\"]"));
	
	driver.close();
}

}