package day7.classroom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertandFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[.='Try it']").click();
		Alert testAlert = driver.switchTo().alert();
		testAlert.sendKeys("Rajkumar");
		testAlert.accept();
		WebElement namewebele = driver.findElementById("demo");
		String text = namewebele.getText();
		if(text.contains("Rajkumar")) {
			System.out.println("Alert and Frame handled successfully");
		}
		
	}

}
