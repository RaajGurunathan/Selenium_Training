package day6.classroom;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningListandSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);		
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("SBC",Keys.TAB);		
		driver.findElementById("chkSelectDateOnly").click();
		List<WebElement> trainNames = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//td[2]");
		System.out.println("All Train Names "+trainNames.size());
		Set<String> uniqueTrainNames = new HashSet<String>();
		
		for (WebElement eachTrainName : trainNames) {
			String name = eachTrainName.getText();
			uniqueTrainNames.add(name);
		}
		int size = uniqueTrainNames.size();
		System.out.println("Unique Train Names " +size);	
	}

}
