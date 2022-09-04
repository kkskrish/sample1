package com.alertday9;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\eclipse-workspace\\Selenium1\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		
		driver.manage().window().maximize();
		
		WebElement btnName = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		btnName.click();
		
		WebElement btnStart = driver.findElement(By.xpath("//button[contains(text(),'demonstrate')]"));
		btnStart.click();
		Alert al = driver.switchTo().alert();
		al.sendKeys("krishna");
		al.accept();
		WebElement txtAlert = driver.findElement(By.xpath("//p[@id='demo1']"));
		String text = txtAlert.getText();
		System.out.println(text);
	
	
		
		
		
		
	}

}
