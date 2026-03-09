package firstselenium;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTest
{
  @Test
public void f() throws InterruptedException
  
  {
//	 1.launch the chrome browser
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\RUBIRAJD\\eclipse-workspace\\FirstSelenium\\drivers\\chromedriver.exe");
	 
//	  way2
	  String projectPath = System.getProperty("user.dir");
	  System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
	  
	  
	  WebDriver driver = new ChromeDriver();
	  Thread.sleep(2000);
	  
	  
//	  launch the para bank app
	  driver.get("https://parabank.parasoft.com/parabank/index.htm");
	  Thread.sleep(2000);
	  
//	  3.verify the page title
	  
	  String expectedResult = "ParaBank | Welcome | Online Banking";
	  String actualResult = driver.getTitle();
	  
	  assertEquals(actualResult,expectedResult);
	  
if(expectedResult.equals(actualResult))
{
	System.out.println("Test is passed");
}
else
{
	System.out.println("Test is Failed");
}

Thread.sleep(2000);

//close the chrome browser
	  
//driver.close();
driver.quit();

  }
}
