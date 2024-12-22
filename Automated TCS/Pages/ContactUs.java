package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import DriverInit.DriverInit;

public class ContactUs extends DriverInit{

	WebDriver driver;
	
	public ContactUs(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//h2[contains(text(),'website for Automation Engineers')]")
	WebElement automationText;
	@FindBy(xpath="//a[contains(text(),' Contact us') and @href=\"/contact_us\"]")
	WebElement contactUsButton;
	@FindBy(xpath="//h2[contains(text(),'Contact ')]")
	WebElement ContactUsText;
	@FindBy(xpath="//h2[contains(text(), 'Get In Touch') and @class=\"title text-center\"]")
	WebElement getInTouchText;
	@FindBy(xpath="//input[@placeholder=\"Name\"]")
	WebElement nameTextbox;
	@FindBy(xpath="//input[@placeholder=\"Email\"]")
	WebElement emailTextbox;
	@FindBy(xpath="//input[@placeholder=\"Subject\"]")
	WebElement subjectTextbox;
	@FindBy(xpath="//textarea[@id=\"message\"]")
	WebElement textAreaTextbox;
//	@FindBy(xpath="//input[@name=\\\"upload_file\\\"]")
//	WebElement chooseFile;
	@FindBy(xpath="//input[@name=\"submit\"]")
	WebElement submitButton;
//	@FindBy(xpath="")
//	WebElement ;
//	@FindBy(xpath="")
//	WebElement ;
	
	public void contactUs() throws InterruptedException {
		verifyHomepage();
		clickContactUsButton();
		verifyContactUsText();
		verifygetInTouchText();
		setName();
		setEmail();
		setSubject();
		setFeedback();
//		uploadFile();
		clickSubmitButton();
	
	}
	
	public void verifyHomepage() {
		if(automationText.equals("website for Automation Engineers"))
		{
			System.out.println("User has entered Homepage");
		}
	}	
	
	public void clickContactUsButton() throws InterruptedException {
		contactUsButton.click();
		String actualUrl="https://automationexercise.com/contact_us";
		String expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
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
	public void setName() throws InterruptedException {
		nameTextbox.sendKeys("Sonal Sharma");
		Thread.sleep(1000);
	}
	public void setEmail() throws InterruptedException{
		emailTextbox.sendKeys("sonalssharma06@gmail.com");
		Thread.sleep(1000);
	}
	public void setSubject() throws InterruptedException{
		subjectTextbox.sendKeys("Feedback testing");
		Thread.sleep(2000);
	}
	public void setFeedback() throws InterruptedException{
		textAreaTextbox.sendKeys("Hey there I have a testing feedback");
		Thread.sleep(2000);
	}
//	public void uploadFile(){
//		
//		//ASK Mama
//	}
	public void clickSubmitButton() throws InterruptedException {
		submitButton.click();
		Thread.sleep(2000);
	}

	
}
