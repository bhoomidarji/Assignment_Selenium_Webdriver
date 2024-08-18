package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class W_A_J_Script_To_find_the_total_hyperlink_from_this_web_page
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selanium_automation\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(2000);
		
	
	}
}
