package com.pooja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.out.println("hi");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Modulr_scenario\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://secure-sandbox.modulrfinance.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("username-inp")).sendKeys("pooja.jha91");
		Thread.sleep(2000);
		driver.findElement(By.id("password-inp")).sendKeys("Vinita6@654321");
		driver.findElement(By.xpath("//*[contains(text(),'Sign in ')]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@class='right-margin-2']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='menu-action'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("username-inp")).sendKeys("pooja.jha91");
		Thread.sleep(2000);
		driver.findElement(By.id("password-inp")).sendKeys("1234");
		driver.findElement(By.xpath("//*[contains(text(),'Sign in ')]")).click();
		Thread.sleep(2000);
		driver.get("https://secure-sandbox.modulrfinance.com/sandbox/onboarding");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@role='button'])[1]")).click();
		
		

	}

}
