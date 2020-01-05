package testleaf.testcases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import okio.Options;
import testleaf.testcases.annotations.LaunchandCloseBrowser;

public class CreateLead extends LaunchandCloseBrowser{
	@BeforeClass
	public void setData() {
		FileName = "CreateLead";
	}
	@Test(dataProvider="getData") 
	public void createLead(String cName, String fName, String lName, String phoneNum, String email) throws InterruptedException {
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneNumber']").sendKeys(phoneNum);
		driver.findElementByXPath("//input[@id='createLeadForm_primaryEmail']").sendKeys(email);
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
		driver.findElementByXPath("(//input[@name='firstName'])[last()]").sendKeys(fName);
		driver.findElementByXPath("//button[contains(text(),'Find')]").click();
		Thread.sleep(2000);
		String createLeadcheck = driver.findElementByXPath("((//a[text()='"+fName+"'])[position()=1])").getText();
		if(fName.equals(createLeadcheck)) {
			System.out.println("Lead is created successfully");
		}
	}
}