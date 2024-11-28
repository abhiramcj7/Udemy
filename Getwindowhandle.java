package Udemy;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getwindowhandle {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/p[2]/a[1]")).click();
		Set<String> s1=driver.getWindowHandles();
		List<String> l1=new ArrayList(s1);
		String parent=l1.get(0);
		String child=l1.get(1);
		System.out.println(driver.getTitle());
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
	}

}
