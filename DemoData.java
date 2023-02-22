package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;


public class DemoData {
	
	@Test (dataProvider="getData")
	public void setData(String username,String password)
	
	
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com");
		//Reporter.log("We used Google Chrome Ver 80 for this test");
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		
		System.out.println("Login clicked");
				
     }
	
	@DataProvider(name= "getData")
	 Object[][] getData1()
	 {
		 Object [][] data = new Object[3][2];
		
		 data[0][0]="standard_user";
		 data[0][1]="secret_sauce";
		 
		 data[1][0]= "problem_user";
		 data[1][1] = "secret_sauce";
		 
		 data[2][0] ="performance_glitch_user";
		 data[2][1] ="secret_sauce";
		 return data;
		 
	 }
	 
	}



//}
