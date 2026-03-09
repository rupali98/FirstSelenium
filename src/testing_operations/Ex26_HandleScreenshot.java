package testing_operations;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex26_HandleScreenshot 
{
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver.exe");
	String url = "https://parabank.parasoft.com/parabank/index.htm";
	String filePath = projectPath+"\\screenshots\\";
	
	
  @Test
  public void f() throws InterruptedException,IOException
  {
	  driver = new ChromeDriver();
	  driver.get(url);
	  
	  Thread.sleep(1000);
	  
	  Date currentDate = new Date(0);
	  
	  System.out.println(currentDate);
	  
	  String screenshotFileName = currentDate.toString().replace(",", "-").replace(":", "-");
	  
	  TakesScreenshot ts = (TakesScreenshot) driver;
	  
	  File binaryFile = ts.getScreenshotAs(OutputType.FILE);
	  
//	  Make sure screenshot folder is already created at the project level
	  
	  File imageFile = new File(filePath + screenshotFileName +".png");
	  
	  FileUtils.copyFile(binaryFile,imageFile);
	  
	  Thread.sleep(1000);
	  driver.quit(); 
	 
	  
  }
}
