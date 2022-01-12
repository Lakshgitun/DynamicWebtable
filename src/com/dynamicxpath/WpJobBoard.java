package com.dynamicxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WpJobBoard {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lakshmipathy\\Desktop\\makemytripproject\\DynamicWebTable\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.wpjobboard.net/wp-admin/admin.php?page=wpjb-application");
		
		WebElement usrName = driver.findElement(By.id("user_login"));
		
		usrName.sendKeys("user");
		
		WebElement pasWord = driver.findElement(By.id("user_pass"));
		
		pasWord.clear();
		
		pasWord.sendKeys("user");
		
		WebElement logBtn = driver.findElement(By.id("wp-submit"));
		
		logBtn.click();
		
		WebElement statusClk = driver.findElement(By.xpath("//a[@title='Edit  \"Dick Barslow\"']//following::td//following::td//following::span//following::span//following::span [1]"));
		
		statusClk.click();
		
		System.out.println("test case pased");
		
		
	}

}
