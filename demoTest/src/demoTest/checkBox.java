package demoTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class checkBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.setProperty("webdriver.chrome.driver", "C://selenium//chromedriver.exe");
   
   WebDriver value =new  ChromeDriver();
    value.get("https://rahulshettyacademy.com/dropdownsPractise/");
    
   System.out.println(value.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
	   value.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
	  System.out.println(value.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
	 
	  Assert.assertFalse(value.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
	 System.out.println(value.findElements(By.cssSelector("input[type='checkbox']")).size());
	
	}

	
}
