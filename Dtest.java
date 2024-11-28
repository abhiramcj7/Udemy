package Udemy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dtest {
     ChromeDriver driver;
     @Before
     public void start() 
     {
    	 driver=new ChromeDriver();
    	 driver.get("https://www.amazon.in/");
    	 
     }
     
     @Test
     public void Test() {
    	 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobile",Keys.ENTER);
    	 driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
    	 driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click(); 
    	 driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("abhir232@gmail.com",Keys.ENTER);
    	driver.findElement(By.xpath("//input[@id='continue']")).click();
 		driver.get("https://www.amazon.in/");
 		driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
    	 
     
     }
     
     @After
     public void end() {
    	 System.out.println("end");
     }
}
