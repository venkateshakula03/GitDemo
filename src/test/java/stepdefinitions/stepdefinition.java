package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class stepdefinition {
	WebDriver driver;

@Given("Enter into IRCTC WEBSITE\"F:\\\\newchromedriver\\\\chromedriver.exe\"")
public void enter_into_irctc_website_f_newchromedriver_chromedriver_exe() {
	System.setProperty("WebDriver.chrome.driver" , "F:\\newchromedriver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.irctc.co.in/nget/train-search");
	throw new io.cucumber.java.PendingException();

    
}
	@Then("login into {string} and {string}")
	public void login_into_and(String string, String string2) {
	   
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Enter the source station and destination station")
	public void enter_the_source_station_and_destination_station() {
	    
	    throw new io.cucumber.java.PendingException();
	}

}
