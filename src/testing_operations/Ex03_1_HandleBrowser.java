package testing_operations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Ex03_1_HandleBrowser {
  @Test
  public void f() throws Exception
  {
	  String projectPath = System.getProperty("user.dir");
	  System.setProperty("webdriver.ie.driver", projectPath + "\\drivers\\IEDriverServer.sex");
	  WebDriver driver = new InternetExplorerDriver();
	  Thread.sleep(1000);
	  driver.quit();
  }
}
