package testleaf.testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import testleaf.testcases.annotations.LaunchandCloseBrowser;

public class DuplicateLead extends LaunchandCloseBrowser {
	@BeforeClass
	public void setData() {
		FileName = "DuplicateLead";
	}
	@Test (dataProvider ="getData")
	public void duplicateLead(String email) throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElementByXPath("//a[contains(text(),'Leads')]").click();
		driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();
		driver.findElementByXPath("//preceding::em//span[contains (text(),'Email')]").click();
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys(email);
		driver.findElementByXPath("//button[contains (text(), 'Find Leads')]").click();
		Thread.sleep(1000);
		String leadFName = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[position()=1]").getText();
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[position()=1]/a").click();
		driver.findElementByXPath("//a[contains (text(),'Duplicate Lead')]").click();
		String dupTitle = driver.findElementByXPath("//div[@id='sectionHeaderTitle_leads']").getText();
		if(dupTitle.equals("Duplicate Lead")) {
			driver.findElementByXPath("//input[@value='Create Lead']").click();
		}
		String dupLeadFname = driver.findElementByXPath("//span[@id='viewLead_firstName_sp']").getText();
		if(dupLeadFname.equals(leadFName)) {
			System.out.println("Duplicate Lead is Created successfully");
		}
		driver.close();
	}

}
