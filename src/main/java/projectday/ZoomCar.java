package projectday;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zoomcar.com/chennai");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//a[@class='search']").click();
		driver.findElementByXPath("(//div[@class='items'])[3]").click();
		driver.findElementByXPath("//button[@class='proceed']").click();
		Date date =new Date();
		DateFormat sdf = new SimpleDateFormat("dd");
		String today = sdf.format(date);
		int tomorrow = Integer.parseInt(today)+1;
		driver.findElementByXPath("//div[contains(text(),'"+tomorrow+"')]").click();
		driver.findElementByXPath("//button[@class='proceed']").click();
		driver.findElementByXPath("//button[@class='proceed']").click();
		List<WebElement> elenumOfCars = driver.findElementsByXPath("//ancestor::div[@class='car-list-layout']//following::div[@class='details']/child::h3");
		int numOfCars = elenumOfCars.size();
		System.out.println("Total number of results displayed is: " +numOfCars);
		List<WebElement> elehighAmt = driver.findElementsByXPath("//preceding::div[@class='car-amount']//div[@class='price']");
		List<Integer> ls = new ArrayList<Integer>();
		for (int i = 0; i < elehighAmt.size(); i++) {
			String carAmt = elehighAmt.get(i).getText().replaceAll("[\\D]", "");
			int price = Integer.parseInt(carAmt);
			ls.add(price);	
		}
		Collections.sort(ls);
		Collections.reverse(ls);
		Integer highPrize = ls.get(0);
		System.out.println(highPrize);
		String lengthPrice = highPrize.toString();
		char[] charArray = lengthPrice.toCharArray();
		//System.out.println(charArray.length);
		if(charArray.length == 4) {
			String fourdigAmount = lengthPrice.replaceAll("["+charArray[0]+"]", ""+charArray[0]+",");
			//System.out.println(fourdigAmount);
			driver.findElementByXPath("//div[contains(text(),'"+fourdigAmount+"')]//following-sibling::button").click();
		}
		else {
		//System.out.println(highPrize);
		driver.findElementByXPath("//div[contains(text(),'"+highPrize+"')]//following-sibling::button").click();
		}
		driver.close();
	}
}
