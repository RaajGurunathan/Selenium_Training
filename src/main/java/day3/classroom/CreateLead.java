package day3.classroom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import okio.Options;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {

		// Set the property for ChromeDriver
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		// Initiate the ChromeBroswer
		ChromeDriver driver = new ChromeDriver();
		// Maximize the browser
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		// Enter the UserName
		driver.findElementById("username").sendKeys("DemoSalesManager");
		// Enter the Password
		driver.findElementById("password").sendKeys("crmsfa");
		// Click on Login Button
		driver.findElementByClassName("decorativeSubmit").click();
		// Click on crm/sfa button
		driver.findElementByLinkText("CRM/SFA").click();
		// Click on Leads
		driver.findElementByLinkText("Leads").click();
		// Click on Create Lead button
		driver.findElementByLinkText("Create Lead").click();
		// Enter Company Name
		driver.findElementById("createLeadForm_companyName").sendKeys("Accenture");
		// Enter First Name
		driver.findElementById("createLeadForm_firstName").sendKeys("Rajkumar");
		// Enter Last Name
		driver.findElementById("createLeadForm_lastName").sendKeys("Gurunathan");
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select dd1= new Select(source);
		dd1.selectByVisibleText("Cold Call");
		WebElement campaign = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dd2= new Select(campaign);
		dd2.selectByValue("9002");
		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		Select dd3= new Select(industry);
		dd3.selectByIndex(3);
		WebElement owner = driver.findElementById("createLeadForm_ownershipEnumId");
		Select dd4= new Select(owner);
		List<WebElement> options = dd4.getOptions();
		int option = options.size();
		dd4.selectByIndex(option-2);
		WebElement currency = driver.findElementById("createLeadForm_currencyUomId");
		Select dd5 = new Select(currency);
		dd5.selectByVisibleText("ADP - Andoran peseta");
		WebElement state = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select dd6 = new Select(state);
		dd6.selectByVisibleText("Alaska");
		//Click on Create Lead (Submit) button
		driver.findElementByClassName("smallSubmit").click();
		// Verify the Lead is created by checking the Company or First Name
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//input[@name='firstName'])[last()]").sendKeys("Rajkumar");
		driver.findElementByXPath("//button[contains(text(),'Find')]").click();
		Thread.sleep(2000);
		//String createLeadcheck = 
			driver.findElementByXPath("((//a[text()='Rajkumar'])[position()=1])").click();
			//System.out.println("Lead is created successfully");
		//}
			
	}
}