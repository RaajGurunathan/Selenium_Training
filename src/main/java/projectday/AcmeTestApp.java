package projectday;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AcmeTestApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://acme-test.uipath.com/account/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//input[@id='email']").sendKeys("kumar.testleaf@gmail.com", Keys.TAB);
		driver.findElementByXPath("//input[@id='password']").sendKeys("leaf@12");
		driver.findElementByXPath("//button[@id='buttonLogin']").click();
		Thread.sleep(2000);
		Actions build = new Actions(driver);
		WebElement vendor = driver.findElementByXPath("//preceding::button//i[@class='fa fa-truck']");
		build.moveToElement(vendor).perform();
		driver.findElementByXPath("//parent::ul//a[text()='Search for Vendor']").click();
		driver.findElementByXPath("//input[@id='vendorName']").sendKeys("Blue Lagoon");
		driver.findElementByXPath("//button[@id='buttonSearch']").click();
		WebElement elevendorName = driver.findElementByXPath("//table[@class='table']//tr[2]//td[1]");
		String vendorName = elevendorName.getText();
		if(vendorName.equals("Blue Lagoon")) {
			String vendorCountryName = driver.findElementByXPath("//table[@class='table']//tr[2]//td[5]").getText();
			System.out.println("The Country name for Blue Lagoon is: " + (vendorCountryName));
		}
		driver.findElementByXPath("//parent::li//a[text()='Log Out']").click();
		driver.close();
}

}
