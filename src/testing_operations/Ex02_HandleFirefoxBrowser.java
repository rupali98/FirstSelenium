package testing_operations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Ex02_HandleFirefoxBrowser 
{
  @Test
  public void f() throws Exception
  {
	  String projectPath = System.getProperty("user.dir");
	  System.setProperty("webdriver.gecko.driver", projectPath +"\\drivers\\geckodriver.exe");
	  WebDriver driver = new FirefoxDriver();
	  Thread.sleep(2000);
	  driver.quit();
  }
}
