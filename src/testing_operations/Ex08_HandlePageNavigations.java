package testing_operations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex08_HandlePageNavigations 
{
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	String chromeDriverPAth = System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
	String url = "https://parabank.parasoft.com/parabank/index.htm";
	
  @Test
  public void f() throws Exception
  {
	  driver = new ChromeDriver();
	  driver.get(url);
	  Thread.sleep(1000);
	  
	  driver.navigate().back();
	  Thread.sleep(1000);
	  
	  driver.navigate().forward();
	  Thread.sleep(1000);
	  
	  driver.navigate().refresh();
	  Thread.sleep(1000);
	  
	  driver.quit();
			  
  }
}
