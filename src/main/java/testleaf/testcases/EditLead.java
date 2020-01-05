package testleaf.testcases;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import testleaf.testcases.annotations.LaunchandCloseBrowser;

public class EditLead extends LaunchandCloseBrowser{
	@BeforeClass
	public void setData() {
		FileName = "EditLead";
	}
	@Test (dataProvider ="getData")
	public void editLead(String fName, String NewCName)throws InterruptedException  {
		driver.findElementByXPath("//a[contains(text(),'Leads')]").click();
		driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();
		driver.findElementByXPath("(//input[@name='firstName'])[last()]").sendKeys(fName);
		driver.findElementByXPath("//button[contains(text(),'Find')]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("((//a[text()='"+fName+"'])[position()=1])").click();
		String title = driver.getTitle();
		if(title.equals("View Lead | opentaps CRM")) {
			driver.findElementByXPath("//a[contains(text(),'Edit')]").click();
		}
		driver.findElementByXPath("//preceding::table//input[@name ='companyName']").clear();
		driver.findElementByXPath("//preceding::table//input[@name ='companyName']").sendKeys(NewCName);
		driver.findElementByXPath("//ancestor::form[@id='updateLeadForm']//input[@name='submitButton']").click();
		WebElement cName = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']");
		String companyName = cName.getText();
		String replacedString = companyName.replaceAll("[(\\d)]", "");
		String trimSpace = replacedString.trim();
		if(trimSpace.equals("Accenture Solutions")) {
			System.out.println("The Company Name is updated successfully");
		}
		else {
			System.out.println("The Company Name is not updated");
		}
	}

}
