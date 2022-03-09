package com.adactin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hotel1 {
	@Parameters({"username","password"})
	@Test
	private void test1(String S1,String S2) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement textuser = driver.findElement(By.id("username"));
		textuser.sendKeys(S1);
		WebElement textpass = driver.findElement(By.id("password"));
		textpass.sendKeys(S2);
		WebElement login = driver.findElement(By.id("login"));
         login.click();
		
	}

}



