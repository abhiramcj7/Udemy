package Udemy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement dropElement = driver.findElement(By.xpath("//*[@id=\"country\"]"));
        Select dropSelect = new Select(dropElement);        
        //dropSelect.selectByVisibleText("India");
        //dropSelect.selectByValue("japan");
        List <WebElement>count=dropSelect.getOptions();
        //System.out.println(count.size());
        for(int i=0;i<count.size();i++) {
            System.out.println( count.get(i).getText());
    }
}
}