package Udemy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		List <WebElement>l=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
      /*   for(WebElement temp:l) {
        	System.out.println(l.size());
        	return;
         } */
		//selecting last 4  checkboxes(7-4)
		for(int i=3;i<l.size();i++) {
			l.get(i).click();
		}
		for(WebElement temp:l) {
        	if(temp.isSelected()) {
        		temp.click();
        	}else {
        		temp.click();
        	}
		}
	}

}
