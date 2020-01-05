package implementation;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLeadUsingCucumber {
	ChromeDriver driver;
	@Given("Launch the browser")
	public void launchTheBrowser() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
	}

	@Given("Maximize the broser")
	public void maximizeTheBroser() {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().window().maximize();

	}

	@Given("Load the URL")
	public void loadTheURL() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("http://leaftaps.com/opentaps/control/main");

	}

	@Given("Enter the Username as (.*)")
	public void enterTheUsernameAsDemoSalesManager(String uname) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElementById("username").sendKeys(uname);
	    
	}

	@Given("Enter the Password as (.*)")
	public void enterThePasswordAsCrmsfa(String pswd) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElementById("password").sendKeys(pswd);
	    
	}

	@Given("Click on the Login button")
	public void clickOnTheLoginButton() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElementByClassName("decorativeSubmit").click();
	    
	}

	@Given("Click on the CRM\\/SFA link")
	public void clickOnTheCRMSFALink() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElementByLinkText("CRM/SFA").click();
	    
	}

	@Given("Click on the Leads button")
	public void clickOnTheLeadsButton() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElementByLinkText("Leads").click();
	    
	}

	@Given("Click on the Create Lead Menu button")
	public void clickOnTheCreateLeadMenuButton() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElementByLinkText("Create Lead").click();
	    
	}

	@Given("Enter the Companyname as (.*)")
	public void enterTheCompanynameAsAccentureSolutions(String cName) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
	    
	}

	@Given("Enter the Firstname as (.*)")
	public void enterTheFirstnameAsRajkumar(String fName) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
	    
	}     

	@Given("Enterthe Lastname as (.*)")
	public void entertheLastnameAsGurunathan(String lName) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
	    
	}

	@When("Click on the Create Lead button")
	public void clickOnTheCreateLeadButton() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElementByClassName("smallSubmit").click();
	    
	}

	@Then("Verify Lead is created successfully")
	public void verifyLeadIsCreatedSuccessfully() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Lead is created successfully");
	    
	}

}
