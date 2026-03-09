package Testng_other_operations;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Ex09_TestDependency 
{
//	we should use this test dependency approach only when we really need it.
//	ideally tests should be independent from each other
	
  @Test
  public void f() 
  {
	  System.out.println("Launch the browser");
  }
  
  @Test(dependsOnMethods="f")
  public void test02()
  {
	  System.out.println("Launch the app");
  }
  
  @Test(dependsOnMethods="test02")
 public void test03()
 {
    System.out.println("Capture page title");
 }
  
 @Test(dependsOnMethods="test03")
 public void test04()
 {
	 System.out.println("Check page element visibility");
	 assertTrue(false);
 }
  
 @Test(dependsOnMethods= {"test04","test03"})
 public void test05()
 {
	 System.out.println("Check page element enabled");
 }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
