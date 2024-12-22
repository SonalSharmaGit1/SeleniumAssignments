package NaukriPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import DriverInit.DriverInit;

public class NaukriPage extends DriverInit {

WebDriver driver;
	
	public NaukriPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@src=\"https://static.naukimg.com/s/0/0/i/naukri-identity/naukri_gnb_logo.svg\"]")
	WebElement naukriLogo;
	@FindBy(xpath="//a[@id='login_Layer']")
	WebElement loginButton;
	@FindBy(xpath="//input[@placeholder=\"Enter your active Email ID / Username\"]")
	WebElement usernametextbox;
	@FindBy(xpath="//input[@placeholder=\"Enter your password\"]")
	WebElement passwordtextbox;
	@FindBy(xpath="//button[@fdprocessedid='nuf28']")
	WebElement loginSubmitButton;
	@FindBy(xpath="//div[@class='nI-gNb-drawer__icon']")
	WebElement profileButton;
	@FindBy(xpath="//a[@class='nI-gNb-info__sub-link']")
	WebElement updateButton;
	@FindBy(xpath="(//div[@class='widgetHead'])[1]/span[2]")
	WebElement editResumeHeadline;
	@FindBy(xpath="//textarea[@id='resumeHeadlineTxt']")
	WebElement headingTextbox;
	@FindBy(xpath="//button[@fdprocessedid=\"62z5nc\"]")
	WebElement saveButton;
	@FindBy(xpath="")
	WebElement ;
	@FindBy(xpath="")
	WebElement ;
	
	
	public void naukriUpdate() throws InterruptedException {
		();
	}
	
	
	public void verifyHomepage() {
		if(naukriLogo.equals("Naukri"))
		{
			System.out.println("User has entered Homepage");
		}
	}	
	public void clickLoginButton() {
		loginButton.click();
	}

	public void setUsername() {
		usernametextbox.clear();
		usernametextbox.sendKeys("sonalssharma06@gmail.com");
	}
	public void setPassword() {
		passwordtextbox.clear();
		passwordtextbox.sendKeys("123qqqwwW&");
	}
	public void clickLoginSubmitButton() {
		loginSubmitButton.click();
		String actualUrl="https://www.naukri.com/mnjuser/homepage";
		String expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
	}
	public void openProfile() {
	profileButton.click();
	updateButton.click();
	String actualUrl="https://www.naukri.com/mnjuser/profile?id=&altresid";
	String expectedUrl= driver.getCurrentUrl();
	Assert.assertEquals(expectedUrl,actualUrl);
	}
	public void editResumeHeadline() {
		editResumeHeadline.click();
		String actualUrl="https://www.naukri.com/mnjuser/profile?id=&altresid&action=modalOpen";
		String expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
	}
	public void removeDot() {
		String currentText = headingTextbox.getAttribute("3.8 Years Exp. in Automation Testing Selenium,WebDriver,Java,TestNG,Maven,Jenkins,SVN,API Testing,Regression,Mobile Testing,Page Object Model,Agile,Automation testing,Manual Testing,Framework Design,SQL,Web Services,Grid,JIRA,Cucumber,Git,MS Excel.");
		String updatedText = currentText.replace(".", "").trim();
		headingTextbox.clear();
		headingTextbox.sendKeys("3.8 Years Exp. in Automation Testing Selenium,WebDriver,Java,TestNG,Maven,Jenkins,SVN,API Testing,Regression,Mobile Testing,Page Object Model,Agile,Automation testing,Manual Testing,Framework Design,SQL,Web Services,Grid,JIRA,Cucumber,Git,MS Excel");
		saveButton.click();
		String actualUrl="https://www.naukri.com/mnjuser/profile?id=&altresid";
		String expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
		
		
	}
		
	
	
	
	
}
