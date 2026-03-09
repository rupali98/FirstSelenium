package testing_operations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex01_HandleChromeBrowser 
{
  @Test
  public void f() throws Exception
  {
	  String projectPath = System.getProperty("user.dir");
	  System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  Thread.sleep(5000);
	  driver.quit();
	  
	  
	  
	  
	  
	  
  }
}
