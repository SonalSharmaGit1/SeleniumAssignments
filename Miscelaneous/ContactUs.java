package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import DriverInit.DriverInit;
import DriverPackage.Util;

public class ContactUs extends DriverInit{

	WebDriver driver;
	Util util;
	
	public ContactUs(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		util= new Util(driver);
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
	@FindBy(xpath="//input[@name=\"upload_file\"]")
	WebElement chooseFile;
	@FindBy(xpath="//input[@name=\"submit\"]")
	WebElement submitButton;
	@FindBy(xpath="")
	WebElement okButton;
	@FindBy(xpath="//div[text()='Success! Your details have been submitted successfully.' and @class='status alert alert-success']")
	WebElement successText;
	@FindBy(xpath="//span[text()=' Home']")
	WebElement homeButton;
	
	public void contactUs() throws InterruptedException {
		verifyHomepage();
		clickContactUsButton();
		verifyContactUsText();
		verifygetInTouchText();
		setName();
		setEmail();
		setSubject();
		setFeedback();
		uploadFile();
		clickSubmitButton();
		clickOkFromPopup();
		verifySuccessText();
		clickHomeButton();
		verifyHomepage();
	}
	
	public void verifyHomepage() {
		String value= automationText.getAttribute("innerText");		// getAttributes used instead of getText(0 to get string value
		if(value.equals("Full-Fledged practice website for Automation Engineers"))
		{
			System.out.println("User has entered Homepage successfully");
		}	
	}	
	
	public void clickContactUsButton() throws InterruptedException {
		contactUsButton.click();
		String actualUrl="https://automationexercise.com/contact_us";
		String expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
	}
	public void verifyContactUsText()
	{	String value= ContactUsText.getAttribute("innerText");	
		if(value.equals("Contact Us"))
		{
			System.out.println("User has entered Contact Us box");
		}
	}
	public void verifygetInTouchText()
	{	String value= getInTouchText.getAttribute("innerText");
		if(value.equals("Get In Touch"))
		{
			System.out.println("User has entered Get in Touch box");
		}
	}
	public void setName() throws InterruptedException {
		util.enterValueInTextbox(nameTextbox ,"Sonal Sharma");
		Thread.sleep(1000);
	}
	public void setEmail() throws InterruptedException{
		util.enterValueInTextbox(emailTextbox ,"sonalssharma06@gmail.com");
		Thread.sleep(1000);
	}
	public void setSubject() throws InterruptedException{
		util.enterValueInTextbox(subjectTextbox ,"Feedback testing");
		Thread.sleep(2000);
	}
	public void setFeedback() throws InterruptedException{
		util.enterValueInTextbox(textAreaTextbox ,"Hey there I have a testing feedback");
		Thread.sleep(2000);
	}
	public void uploadFile(){
		chooseFile.sendKeys("C:/Users/Sonal/OneDrive/Desktop/TestingSonal.txt");
	}
	public void clickSubmitButton() throws InterruptedException {
		submitButton.click();
		Thread.sleep(2000);
	}
	public void clickOkFromPopup() {
		
	}
	public void verifySuccessText() {
	String value= successText.getAttribute("innerText");
	if(value.equals("")) {
		System.out.println("Feedback submitted successfully");
	}
	}
	public void clickHomeButton() throws InterruptedException {
		homeButton.click();
		Thread.sleep(2000);
		String actualUrl="https://automationexercise.com/";
		String expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
	}
	
}
