package day13.classroom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/TextChange.html");
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement button = driver.findElementByXPath("//button[@id='btn']");
		wait.until(ExpectedConditions.textToBePresentInElement(button, "Click ME!"));
		driver.findElementByXPath("//button[@id='btn']").click();
		String text = driver.switchTo().alert().getText();
		System.out.println(text);		
	}

}
