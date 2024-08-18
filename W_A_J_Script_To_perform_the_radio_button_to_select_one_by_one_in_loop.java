package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class W_A_J_Script_To_perform_the_radio_button_to_select_one_by_one_in_loop 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selanium_automation\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		Thread.sleep(2000);
		
		for(int i=1;i<=3;i++)
		{
			driver.findElement(By.cssSelector("input[value='option "+i+"']")).click();
			Thread.sleep(2000);
		}		
		driver.close();
	}
}
