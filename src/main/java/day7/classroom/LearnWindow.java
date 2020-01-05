package day7.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Window.html");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//button[.='Open Multiple Windows']").click();
		Set<String> windowHandles = driver.getWindowHandles();	
		System.out.println("The Total number of windows open is :" +windowHandles.size());
		List<String> lstWindowHandles = new ArrayList<String>(windowHandles);
		WebDriver lastWindow = driver.switchTo().window(lstWindowHandles.get(windowHandles.size()-1));
		String lastWindowTitle = lastWindow.getTitle();
		System.out.println("The Last Window title is: " +lastWindowTitle);
		driver.quit();	
	}

}
