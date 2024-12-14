package AssignmentDay4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DriverInit.DriverStart;

public class ContactUsTC6 {

	WebDriver driver;
	public ContactUsTC6(WebDriver driver) {
        this.driver = driver;
	}
	
	ContactUsTC6(){
		DriverStart obj= new DriverStart();
		driver= obj.init();
		PageFactory.initElements(driver, this);	
	}	

	WebElement contactUsButton= driver.findElement(By.xpath("//a[contains(text(),' Contact us') and @href=\"/contact_us\"]"));
	WebElement ContactUsText = driver.findElement(By.xpath("//h2[contains(text(),'Contact ')]"));
	WebElement getInTouchText=driver.findElement(By.xpath("//h2[contains(text(), 'Get In Touch') and @class=\"title text-center\"]")); // SignUp name
	WebElement nameTextbox = driver.findElement(By.xpath("//input[@placeholder=\"Name\"]"));
	WebElement emailTextbox= driver.findElement(By.xpath("//input[@placeholder=\"Email\"]"));
	WebElement subjectTextbox = driver.findElement(By.xpath("//input[@placeholder=\"Subject\"]"));
	WebElement textAreaTextbox = driver.findElement(By.xpath("//textarea[@id=\"message\"]"));
	WebElement chooseFile= driver.findElement(By.xpath("//input[@name=\"upload_file\"]"));
	WebElement submitButton = driver.findElement(By.xpath("//input[@name=\"submit\"]"));
	
	public void navigation() throws InterruptedException {
		driver.get("https://automationexercise.com/category_products/6");
	}
	public void clickContactUsButton() {
		contactUsButton.click();
	}
	public void verifyContactUsText()
	{
		if(ContactUsText.equals("Contact Us"))
		{
			System.out.println("User has entered Contact Us box");
		}
	}
	public void verifygetInTouchText()
	{
		if(getInTouchText.equals("Get in Touch"))
		{
			System.out.println("User has entered Get in Touch box");
		}
	}
	public void setName() {
		nameTextbox.sendKeys("Sonal Sharma");
		
	}
	public void setEmail(){
		emailTextbox.sendKeys("sonalssharma06@gmail.com");
		
	}
	public void setSubject(){
		subjectTextbox.sendKeys("Feedback testing");
		
	}
	public void setFeedback(){
		emailTextbox.sendKeys("Hey there I have a testing feedback");
		
	}
	public void uploadFile(){
		
		//ASK Mama
	}
	public void clickSubmitButton() {
		submitButton.click();
	}
	public void driverClose() {
		driver.close();
	}
	
	@Test
	public void SubmitFeedback() throws InterruptedException {
		navigation();
		clickContactUsButton();
		verifyContactUsText();
		verifygetInTouchText();
		setName();
		setEmail();
		setSubject();
		setFeedback();
		uploadFile();
		clickSubmitButton();
		driverClose();
	}
}
