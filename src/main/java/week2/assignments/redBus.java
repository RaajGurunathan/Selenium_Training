package week2.assignments;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class redBus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElementById("src").clear();
		driver.findElementById("src").sendKeys("Chennai");
		Thread.sleep(2000);
		driver.findElementById("src").sendKeys(Keys.TAB);
		driver.findElementById("dest").clear();
		driver.findElementById("dest").sendKeys("Trichy");
		Thread.sleep(2000);
		driver.findElementById("dest").sendKeys(Keys.TAB);
		driver.findElementByXPath("(//td[@class='current day'])[2]").click();
		driver.findElementByXPath("//label[@for='return_cal']").click();
		driver.findElementByXPath("(//td[@class='current day'])[2]").click();
		Thread.sleep(2000);
		driver.findElementById("search_btn").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//label[@for='dtAfter 6 pm']").click();
		driver.findElementByXPath("//label[@for='bt_AC']").click();
		Thread.sleep(2000);
		WebElement busCount = driver.findElementByXPath("//span[@class='f-bold busFound']");
		String totBusfound = busCount.getText();
		System.out.println("Total Number of buses found: " + totBusfound);
	}
}
