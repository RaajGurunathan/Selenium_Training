package week2.assignments;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipKart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Actions builder = new Actions(driver);
		WebElement eleElement = driver.findElementByXPath("(//li[@class='Wbt_B2 _1YVU3_'])[1]");
		builder.moveToElement(eleElement).perform();
		Thread.sleep(2000);
		driver.findElementByLinkText("Mi").click();
		Thread.sleep(2000);
		List<WebElement> elePhonenames = driver.findElementsByXPath("//div[@class='_3wU53n']");
		for (int i = 1; i < elePhonenames.size(); i++) {
		WebElement phoneName = elePhonenames.get(i);
		String eachPhoneName = phoneName.getText();
		System.out.println(eachPhoneName);
		}
		
	}

}
