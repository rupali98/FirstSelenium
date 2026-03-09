package testing_operations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Ex04_2_HandleHeadleddChromeBrowser {
  @Test
  public void f() throws InterruptedException
  {
	  String projectPath = System.getProperty("user.dir");
      System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
      
      
     ChromeOptions opt = new ChromeOptions();
     opt.addArguments("--headless");
     
     WebDriver driver = new ChromeDriver(opt);
     
     driver.quit();
  
  }
}
