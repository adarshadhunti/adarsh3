package assignment6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		/*Xpath
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Adarsh");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("iNeuron");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();*/
		//cssSelector
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Adarsh");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("iNeuron");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
	}

}
