package projectday;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//input[@id='twotabsearchtextbox']").sendKeys("oneplus 7 pro mobiles", Keys.ENTER);
		String firstMobPrize = driver.findElementByXPath("(//span[@class='a-price-whole'])[1]").getText();
		System.out.println(firstMobPrize);
		driver.findElementByXPath("//div[@class='a-section aok-relative s-image-fixed-height']//following::img[1]").click();
		Thread.sleep(2000);
		Set<String> winSet = driver.getWindowHandles();
		List<String> winLis = new ArrayList<>(winSet);
		driver.switchTo().window(winLis.get(1));
		String numofRating = driver.findElementByXPath("(//span[@id='acrCustomerReviewText'])[1]").getText();
		System.out.println("The number of Rating is: " + numofRating); 
		driver.findElementByXPath("//input[@id='add-to-cart-button']").click();
		driver.findElementByXPath("//a[@id='hlb-ptc-btn-native']").click();
		driver.findElementByXPath("//input[@id='continue']").click();
		Thread.sleep(2000);
		String errMsg = driver.findElementByXPath("(//div[@class='a-alert-content'])[2]").getText();
		if(errMsg.equals("Enter your email or mobile phone number")){
			System.out.println("The Error message Occured");
		}
		driver.quit();
}

}
