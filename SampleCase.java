package com.example.toy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleCase {
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver1= new EdgeDriver();
		String url="https://demo.opencart.com/";
		//Launchig the url
		driver1.navigate().to(url);
		driver1.manage().window().maximize();
		WebElement search=driver1.findElement(By.name("search"));
		search.sendKeys("mobiles");
		Thread.sleep(3000);
		//to scroll down
		JavascriptExecutor js = (JavascriptExecutor)driver1;
		js.executeScript("window.scrollBy(0,2000)", "");
		//returns 
		Thread.sleep(3000);
		WebElement returns =driver1.findElement(By.linkText("Returns"));
		  returns.click();
		  driver1.navigate().back();
		  driver1.quit();
	}
}
