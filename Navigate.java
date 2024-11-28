package Udemy;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws MalformedURLException {
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//URL myurl=new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.navigate().to(myurl);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().to("https://www.nopcommerce.com/en/demo");
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().refresh(); //refreshing page

	}

}
