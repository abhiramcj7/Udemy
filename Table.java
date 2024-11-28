package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
      public static void main(String args[]) {
    	  ChromeDriver driver= new ChromeDriver();
    	  driver.get("https://testautomationpractice.blogspot.com/");    
    	  int row= driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
          System.out.println(row);
          int col=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
          System.out.println(col);
    	 WebElement w= driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[3]/div[1]/table/tbody/tr[5]/td[1]"));
    	 //alternative //table[@name='BookTable']//tr[5]//td[1]
    	 String s=w.getText();
    	 System.out.println(s);
    	 for(int r=2;r<row;r++) {
    		 for(int c=2;c<col;c++) {
    			String text= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
    			System.out.println(text);
    	 }
      }
}
}
