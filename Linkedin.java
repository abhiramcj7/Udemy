package Udemy;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkedin {
      ChromeDriver driver;
     @Before
      public void test() {
    	  driver=new ChromeDriver();
    	  driver.get("https://www.facebook.com/");
      }
      @Test
    	  public void test1() {
    		  boolean b=driver.findElement(By.xpath("//button[contains(@type,'mit')]")).isDisplayed();
    		  System.out.println(b);
    	  }
      
}
