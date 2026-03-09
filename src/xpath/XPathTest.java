package xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XPathTest
{
  @Test
  public void f() throws InterruptedException
  {
	  String projectPath = System.getProperty("user.dir");
	  System.setProperty("webdriver.chrome.driver", projectPath +"\\drivers\\chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://parabank.parasoft.com/parabank/index.htm");
	  
	  Thread.sleep(1000);
	  driver.quit();
  }
}
