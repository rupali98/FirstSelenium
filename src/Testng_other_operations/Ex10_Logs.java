package Testng_other_operations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex10_Logs 
{
  @Test
  public void f() 
  {
//	  logs will be generated in emailable-report.html under test-output folder
	  
	  System.out.println("Launching chrome browser");
	  Reporter.log("chrome browser is launched");
	  
	  System.out.println("AUT App1 is launched");
  }
  
  @Test
  public void test02()
  {
	  System.out.println("Launching firefox browser");;
	  Reporter.log("Firefox vrowser is launched");
	  
	  System.out.println("Launching AUT App2");
	  Reporter.log("AUT App2 is launched");
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
