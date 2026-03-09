package config_utility_base_2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseClass extends UtilityClass
{
  @Test
  public void f() {
  }
  
  @BeforeClass
  public void setUp() throws InterruptedException 
  {
	 launchBrowser("CHROME");
	 launchApp(url);
	login();
}

  @AfterClass
  
 public void tearDown()
{
  logout();
   closeBrowser();
}
}