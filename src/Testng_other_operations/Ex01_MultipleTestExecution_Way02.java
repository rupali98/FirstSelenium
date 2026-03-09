package Testng_other_operations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex01_MultipleTestExecution_Way02 
{
	String projectPath = System.getProperty("user.dir");
	String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath +"\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url = "https://parabank.parasoft.com/parabank/index.htm";
	
//	Test01-launch the browser,launch the app,click about us link,capture the page title
//	Test02 - launch the app,click services link,capture the page title,close the browser
	
  @Test(enabled=false)
  public void f() throws InterruptedException
  {
	  driver.get(url);
	  Thread.sleep(1000);
	  WebElement aboutUsLink = driver.findElement(By.linkText("AboutUss"));
	  aboutUsLink.click();
	  System.out.println(driver.getTitle());
	  Thread.sleep(1000);
	  driver.quit();
 
  }
  
  @Test
  public void test02() throws InterruptedException
{
	  driver.get(url);
	  
	  try
	  {
		  Thread.sleep(10000);
	  }
	  catch(InterruptedException e)
	  {
		  e.printStackTrace();
	  }
	  
	  WebElement servicesLink = driver.findElement(By.linkText("Services"));
	  servicesLink.click();
	  System.out.println(driver.getTitle());
	  driver.quit();
}
}
