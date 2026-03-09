package testing_operations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Ex23_2_HandleNotification 
{
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver.exe");
	String url = "https://www.yatra.com";
	
  @Test
  public void f() throws InterruptedException
  {
//	  Notification Alert
	  ChromeOptions opt = new ChromeOptions();
	  opt.addArguments("--disable-notifications");
	  
	  
	  driver = new ChromeDriver(opt);
	  driver.get(url);
	  
	  Thread.sleep(1000);
	  driver.quit(); 
	  
  }
}
