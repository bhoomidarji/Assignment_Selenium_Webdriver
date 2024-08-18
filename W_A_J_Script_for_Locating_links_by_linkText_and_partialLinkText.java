package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class W_A_J_Script_for_Locating_links_by_linkText_and_partialLinkText 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selanium_automation\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
	
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(500);
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(500);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sauce Labs Backpack")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button#back-to-products")).click();
		Thread.sleep(200);
		
		driver.findElement(By.partialLinkText("Bike")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button#back-to-products")).click();
		Thread.sleep(2000);
	
		driver.close();	
	}	
}
