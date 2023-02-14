package assignment7_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class Task5_firefox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String baseurl=driver.getCurrentUrl();
		System.out.println(baseurl);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		String uri=driver.getCurrentUrl();
		System.out.println(uri);
		
		if(uri.contains("dashboard"))
		{
			System.out.println("'dashboard' is available");
		}
		else
		{
			System.out.println("'dashboard' is not available");
		}
		
		driver.findElement(By.xpath("//img[@class='oxd-userdropdown-img']")).click();
		driver.findElement(By.xpath("//a[@href='/web/index.php/auth/logout']")).click();
		String logouturl=driver.getCurrentUrl();
		System.out.println(baseurl);
		if(logouturl==baseurl)
		{
			System.out.println("Adarsh is Learning");
		}
		else
		{
			System.out.println("Adarsh Need to Focus more on concepts");
		}
	}

}

