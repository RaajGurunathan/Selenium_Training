package testleaf.testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DeleteLead {
	
	public void deleteLead() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.findElementByXPath("//input[@name='USERNAME']").sendKeys("DemoSalesManager");
	driver.findElementByXPath("//input[@name='PASSWORD']").sendKeys("crmsfa");
	driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
	driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
	driver.findElementByXPath("//a[contains(text(),'Leads')]").click();
	driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();
	driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[2]").click();
	driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("9786153511");
	driver.findElementByXPath("//button[contains(text(),'Find')]").click();
	Thread.sleep(3000);
	String leadID = driver.findElementByXPath("(//a[@class='linktext'])[4]").getText();
	driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
	driver.findElementByXPath("//a[@class='subMenuButtonDangerous']").click();
	driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();
	driver.findElementByXPath("//input[@name='id']").sendKeys(leadID);
	driver.findElementByXPath("//button[contains(text(),'Find')]").click();
	Thread.sleep(3000);
	String checkNorecord = driver.findElementByXPath("//div[@class='x-paging-info']").getText();
	System.out.println(checkNorecord);
	if(checkNorecord.equals("No records to display")) {
		System.out.println("The Record is successfully deleted");
	}
	driver.close();
 }
}
