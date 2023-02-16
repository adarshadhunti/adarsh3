package assignment8.assignment8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("wxyz");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("0001112220");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Password");
		
		//Birth Day Selection
		WebElement monthdd=driver.findElement(By.xpath("//select[@aria-label='Month']"));
		Select mon=new Select(monthdd);
		mon.selectByVisibleText("Sep");
		
		WebElement daydd=driver.findElement(By.xpath("//select[@aria-label='Day']"));
		Select days=new Select(daydd);
		days.selectByIndex(19);
		
		WebElement yeardd=driver.findElement(By.xpath("//select[@aria-label='Year']"));
		Select years=new Select(yeardd);
		years.selectByValue("1987");
		
		//Gender
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		Thread.sleep(2000);
		
		
		
		
		
		
		
	}

}
