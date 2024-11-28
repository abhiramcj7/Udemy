package Udemy;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//String s=driver.getWindowHandle();
	   // System.out.println(s);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> s1=driver.getWindowHandles();
		System.out.println(s1);

	}

}
