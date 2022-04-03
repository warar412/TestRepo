package GenericFunctions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class commonFunctions {
	
	WebDriver driver;
	
	
	public commonFunctions(WebDriver driver2) {
		this.driver=driver2;
	}

	
	public void SnapShot() throws IOException {
		
		File snap = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(snap, new File("/BankingProject/Screenshot/TestOutPut.png"));
			
	}

}
