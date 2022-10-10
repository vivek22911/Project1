package org.linora;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Myntra {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\VIVEK\\eclipse-workspace\\SeleniumBrowser\\driver\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.myntra.com/register?");
		
		driver.manage().window().maximize();					
		
		WebElement p = driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
		p.sendKeys("9442251206");
		
		WebElement q = driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
		q.click();
		
		System.out.println("vivek");
			
	}
}
