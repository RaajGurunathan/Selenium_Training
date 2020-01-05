package day4.learnwebtable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElementByXPath("(//div[@id='match_menu_container']//following::div[@class=' cb-ovr-flo cb-text-complete'])[position()=1]").click();
		driver.findElementByXPath("//a[@class='cb-nav-tab active']//following-sibling::a[text()='Scorecard']").click();
		List<WebElement> row = driver.findElementsByXPath("//div[@id ='innings_1']//div[@class='cb-col cb-col-100 cb-scrd-sub-hdr cb-bg-gray']//following::div[@class='cb-col cb-col-100 cb-scrd-itms']");
		for (WebElement eachRow : row) {
			System.out.print(eachRow.getText());
			System.out.println();
		}	
		
		
		
		
		
		
		
		
		
		
		/*List<WebElement> scrRow = driver.findElementsByXPath("//div[@id='innings_1']//following::div[@class='cb-col cb-col-100 cb-scrd-itms']/div[@class='cb-col cb-col-8 text-right text-bold']");
		//System.out.println(scrRow.size());
		List<Integer> lis = new ArrayList<Integer>();
		for (WebElement eachRow : scrRow) {
			String text = eachRow.getText();
			int score = Integer.parseInt(text);
			lis.add(score);
			Collections.sort(lis);
			Collections.reverse(lis);
		}
		System.out.println("The Top score is :" +lis.get(0));*/
	}

}
