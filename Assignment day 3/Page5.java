package AssignmentDay3;

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
	
	WebElement textTitle= driver.findElement(By.xpath("//b[contains(text(),'Enter Account Information')]"));
	WebElement radiobuttonMr= driver.findElement(By.xpath("//input[@id=\"id_gender1\"]"));
	WebElement  radioBoxMrs= driver.findElement(By.xpath("//input[@id=\"id_gender2\"]"));
	WebElement nameTextbox= driver.findElement(By.xpath("//input[@id=\"name\"]"));
	WebElement  emailTextbox= driver.findElement(By.xpath("//input[@id=\"email\"]"));
	WebElement  passwordTextbox= driver.findElement(By.xpath("//input[@id=\"password\"]"));
	WebElement  daysdropdown= driver.findElement(By.xpath("//select[@id=\"days\"]"));
	WebElement  monthsdropdown= driver.findElement(By.xpath("//select[@id=\"months\"]"));
	WebElement  yearsdropdown= driver.findElement(By.xpath("//select[@id=\"years\"]"));
	WebElement  checkboxNewsletter= driver.findElement(By.xpath("//input[@id=\"newsletter\"]"));
	WebElement  textNewsletter= driver.findElement(By.xpath("//label[@for='newsletter']"));
	WebElement offersCheckbox= driver.findElement(By.xpath("//input[@id=\"optin\"]"));
	WebElement  offersText= driver.findElement(By.xpath("//label[@for=\"optin\"]"));
	WebElement  AddressInfoTitle= driver.findElement(By.xpath("//b[contains(text(),'Address Information')]"));
	WebElement  firstNameTextbox= driver.findElement(By.xpath("//input[@id=\"first_name\"]"));
	WebElement  lastNameTextbox= driver.findElement(By.xpath("//input[@id=\"last_name\"]"));
	WebElement companyTextbox = driver.findElement(By.xpath("//input[@id=\"company\"]"));
	WebElement  address1Textbox= driver.findElement(By.xpath("//input[@id=\"address1\"]"));
	WebElement  address1Text= driver.findElement(By.xpath("//span[contains(text(),'(Street address, P.O. Box, ')]"));
	WebElement  address2Textbox= driver.findElement(By.xpath("//input[@id=\"address2\"]"));
	WebElement  countryDropdown= driver.findElement(By.xpath("//select[@id='country']"));
	WebElement  stateTextbox= driver.findElement(By.xpath("//input[@id='state']"));
	WebElement  cityTextbox= driver.findElement(By.xpath("//input[@id='state']/following::input[1]")); //used following xpath
	WebElement  zipcodeTextbox= driver.findElement(By.xpath("//input[@id='state']/following::input[2]"));
	WebElement  mobileNoTextbox= driver.findElement(By.xpath("//input[@id='state']/following::input[3]"));
	WebElement  createAccountButton= driver.findElement(By.xpath("//button[contains(text(),'Create Account')]"));
	
	driver.close();
	
	}
	
}
