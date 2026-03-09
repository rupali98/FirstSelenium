package testing_operations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.Dimension;

public class Ex05_HandleManageWindow {
  @Test
  public void f() throws Exception
  {
	  String projectPath = System.getProperty("user.dir");
	  System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      
      Thread.sleep(1000);
      
      System.out.println(driver.manage().window().getSize());
      
      Thread.sleep(1000);
      
      driver.manage().window().maximize();
      Thread.sleep(1000);
      
      
//      Width & Height
      Dimension dim = new Dimension(750,650);
      driver.manage().window().setSize(dim);
      
//      OR
//      driver.manage().setSize(new Dimension(750,650);
       Thread.sleep(1000);
       
       driver.manage().window().fullscreen();
       Thread.sleep(1000);
       
       driver.quit();
      
      
  
  }
}
