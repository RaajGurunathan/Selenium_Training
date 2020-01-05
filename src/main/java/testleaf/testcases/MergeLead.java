package testleaf.testcases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementByXPath("//input[@name='USERNAME']").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//input[@name='PASSWORD']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
		driver.findElementByXPath("//a[contains(text(),'Leads')]").click();
		driver.findElementByXPath("//a[text()='Merge Leads']").click();
		driver.findElementByXPath("//input[@id='partyIdFrom']//following-sibling::a").click();
		Set<String> winSet = driver.getWindowHandles();
		List<String> winLis = new ArrayList<>(winSet);
		driver.switchTo().window(winLis.get(1));
		Thread.sleep(2000);
		String topLeadIdFrom = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[position()=1]/a").getText();
		driver.findElementByXPath("//input[@name='id']").sendKeys(topLeadIdFrom);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[position()=1]/a").click();
		driver.switchTo().window(winLis.get(0));
		Thread.sleep(1000);
		driver.findElementByXPath("//input[@id='partyIdTo']//following-sibling::a").click();
		Set<String> winSet1 = driver.getWindowHandles();
		List<String> winLis1 = new ArrayList<>(winSet1);
		driver.switchTo().window(winLis1.get(1));
		Thread.sleep(2000);
		String topLeadIdTo = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[position()=2]/a").getText();
		System.out.println(topLeadIdTo);
		driver.findElementByXPath("//input[@name='id']").sendKeys(topLeadIdTo);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.switchTo().window(winLis1.get(0));
		Thread.sleep(1000);
		driver.findElementByXPath("//a[@class='buttonDangerous']").click();
		Alert mergeAlert = driver.switchTo().alert();
		mergeAlert.accept();
		Thread.sleep(2000);
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(topLeadIdFrom);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);
		String checkNorecord = driver.findElementByXPath("//div[@class='x-paging-info']").getText();
		System.out.println(checkNorecord);
		if(checkNorecord.equals("No records to display")) {
			System.out.println("The Record is Merged Successfully");
		}
		driver.close();

}

}