package testleaf.testcases.annotations;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import day10.classroom.ReadExcel;

public class LaunchandCloseBrowser {
	public static ChromeDriver driver;
	@BeforeMethod
	@Parameters({"url","uname","pswd"})
	public void lanchBroswer(String url, String uname, String pswd) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElementByXPath("//input[@name='USERNAME']").sendKeys(uname);
		driver.findElementByXPath("//input[@name='PASSWORD']").sendKeys(pswd);
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
	}
	public static String FileName;
	
	@DataProvider 
	public String[][] getData() throws IOException {
		
		/*String[][] data = new String[2][4];
		data[0][0] = "Accenture";
		data[0][1] = "Rajkumar";
		data[0][2] = "Gurunathan";
		data[0][3] = "9875612124";
		
		data[1][0] = "Photon";
		data[1][1] = "Naseed";
		data[1][2] = "Mohammed"
		data[1][3] = "9875612125"; */
		ReadExcel readexcel = new ReadExcel();
		return readexcel.readExcel(FileName);
		
	}
	@AfterMethod
	public void closeBroswer() {
		driver.close();
	}
	
	
}
