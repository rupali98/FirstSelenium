package testing_operations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex06_HandleURLLaunching 
{
	
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	String chromeDriverPath = System.setProperty("webdriver.chrome.drive", projectPath +"\\drivers\\chromedriver.exe");
    String url = "https://parabank.parasoft.com/parabank/index.htm";
    
  @Test
  public void f() throws Exception
  {
	  driver = new ChromeDriver();
	  driver.get(url);
	  Thread.sleep(1000);
	  driver.quit();
	  
  }
}
