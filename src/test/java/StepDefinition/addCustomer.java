package StepDefinition;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagesObjects.addCustomerInfo;

public class addCustomer {


	WebDriver driver = null;
	addCustomerInfo ac = new addCustomerInfo(driver);



		@Given("Login as a Bank Manager")
		public void login_as_a_bank_manager() throws IOException, InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vignesh\\eclipse-workspace\\BankingProject\\Drivers\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject");
			
			driver.manage().window().maximize();
			
			Thread.sleep(3000L);
			
			ac = new addCustomerInfo(driver);
			ac.Manager();
			ac.SnapShot();
			
		}

		@When("Click Add Customer Tab")
		public void click_add_customer_tab() throws IOException, InterruptedException {
			Thread.sleep(3000L);
			ac.AddCustomer();
			ac.SnapShot();


		}

		@Then("Enter the Customer Details")
		public void enter_the_customer_details() throws InterruptedException, IOException {
			ac.CustomerName();
			ac.SnapShot();
		
		}


		@And("Click the Add Customer Icon")
		public void click_the_add_customer_icon() throws IOException, InterruptedException {
			ac.SnapShot();
			ac.SubmitDetails();
	
		}

	}
