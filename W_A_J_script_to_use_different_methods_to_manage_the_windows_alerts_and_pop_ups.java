package assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class W_A_J_script_to_use_different_methods_to_manage_the_windows_alerts_and_pop_ups
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selanium_automation\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		
		driver.findElement(By.name("cusid")).sendKeys("123");
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		
		
		Alert alert=driver.switchTo().alert();  
		String msg1=alert.getText();
		System.out.println("your msg is "+msg1);
		alert.accept(); 

		Thread.sleep(2000);
		
		Alert alert1=driver.switchTo().alert();
		String msg2=alert1.getText();
		System.out.println("your msg is "+msg2);
		alert1.accept();

		Thread.sleep(2000);
		
		driver.close();
	}
}
