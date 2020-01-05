package week2.assignments;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementByXPath("//input[@name='USERNAME']").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//input[@name='PASSWORD']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
		driver.findElementByXPath("//a[contains(text(),'Leads')]").click();
		driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();
		driver.findElementByXPath("(//input[@name ='firstName'])[3]").sendKeys("Rajkumar");
		driver.findElementByXPath("//button[contains(text(),'Find')]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		String title = driver.getTitle();
		if(title.equals("View Lead | opentaps CRM")) {
			driver.findElementByXPath("//a[contains(text(),'Edit')]").click();
		}
		driver.findElementByXPath("(//input[@name ='companyName'])[2]").clear();
		driver.findElementByXPath("(//input[@name ='companyName'])[2]").sendKeys("Accenture Solutions");
		driver.findElementByXPath("(//input[@name='submitButton'])[1]").click();
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
		driver.close();
	}

}
