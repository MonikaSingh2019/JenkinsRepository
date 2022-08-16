package com.cast.jenkinsdemo1;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOrgTest {
	@Test 
	public void createOrgTest() throws Throwable 
	{
	WebDriverManager.chromedriver().setup(); 
	WebDriver driver = new ChromeDriver();
//		FileInputStream fis = new FileInputStream("./Data/CommonProperty.properties");
//		Properties p = new Properties();
//		
//		p.load(fis);
		
		String URL=System.getProperty("url");
		System.out.println(URL);
		driver.get(URL);
	System.out.println("Organization Created1111");
}
}
