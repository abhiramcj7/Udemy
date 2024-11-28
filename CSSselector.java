package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector {

	public static void main(String[] args) {
		ChromeDriver dv=new ChromeDriver();
		dv.get("https://www.amazon.in/");
		//dv.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("mobile",Keys.ENTER);
        // dv.findElement(By.cssSelector("input.nav-input")).sendKeys("laptops");
		//dv.findElement(By.cssSelector("input[type='text']")).sendKeys("bags");
		//dv.findElement(By.cssSelector("input.nav-input[placeholder='Search Amazon.in']")).sendKeys("mouse",Keys.ENTER);
		

	}

}
