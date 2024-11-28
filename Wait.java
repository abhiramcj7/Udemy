package Udemy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  Implicit wait
		
		//Explicit wait declaration
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement w1=wait.until(ExpectedConditions.visibilityOfElementLocated( By.xpath("//input[@placeholder='Username']")));
		//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		w1.sendKeys("Admin");

	}

}
