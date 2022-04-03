package pagesObjects;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class addCustomerInfo {

	WebDriver driver;

	By Bank_Manager = By.xpath("//button[contains(text(),'Bank Manager Login')]");

	By Bank_AddCustomer = By.xpath("//button[contains(text(),'Add Customer')]");

	By Bank_FirstName = By.xpath("//input[@placeholder='First Name']");

	By Bank_LastName = By.xpath("//input[@placeholder='Last Name']");

	By Bank_PostCode =	By.xpath("//input[@placeholder='Post Code']");

	By Bank_Button = By.xpath("//button[@type='submit']");


	public addCustomerInfo(WebDriver driver) {
		this.driver=driver;
	}

	public void Manager ()
	{
		driver.findElement(Bank_Manager).click();
	}

	public void AddCustomer ()
	{
		driver.findElement(Bank_AddCustomer).click();
	}

	public void CustomerName() throws InterruptedException
	{
		Thread.sleep(3000L);
		driver.findElement(Bank_FirstName).sendKeys("Vicky");
		Thread.sleep(4000L);
		driver.findElement(Bank_LastName).sendKeys("James");
		Thread.sleep(4000L);
		driver.findElement(Bank_PostCode).sendKeys("600 033");
	}

	public void SubmitDetails() throws InterruptedException
	{
		driver.findElement(Bank_Button).click();
		Thread.sleep(3000L);
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000L);
		
		driver.quit();
	
		
	}

	
	public void SnapShot() throws IOException {
		
		Date currentdate = new Date(0);
		String snapShotname=currentdate.toString().replace(" ","-").replace(":", "-");
		
		File snap = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(snap, new File("C:/Users/Vignesh/eclipse-workspace/BankingProject/Screenshot/" + snapShotname + ".png"));
	}


	// Real Time usage for login

	/*
	 * public void testername (String username, String passowrd) {
	 * driver.findElement(tester_name).sendKeys(username);
	 * driver.findElement(tester_pass).sendKeys(passowrd);
	 * driver.findElement(submit_button).click(); }
	 */

}
