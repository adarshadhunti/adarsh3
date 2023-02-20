package assignment9.assignment9;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment9 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ineuron-courses.vercel.app/signup");
		Thread.sleep(6000);
		
		WebElement sign=driver.findElement(By.xpath("//button[@class='submit-btn']"));
		Boolean btn=sign.isEnabled();
		System.out.println(btn);
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Adarsh");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("adarsh23@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("abcd1234");
		driver.findElement(By.xpath("//label[text()='Testing']")).click();
		Thread.sleep(2000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,350)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		
		WebElement states=driver.findElement(By.xpath("//select[@id='state']"));
		Select sts=new Select(states);
		sts.selectByValue("Telangana");
		
		WebElement signup=driver.findElement(By.xpath("//button[text()='Sign up']"));
		boolean sup=signup.isEnabled();
		System.out.println(sup);
		
		driver.findElement(By.xpath("//button[text()='Sign up']")).click();
		Thread.sleep(3000);
		
		
		
		
		
	}
}
