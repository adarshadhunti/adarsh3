package assignment8.assignment8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input.inputtext._58mg._5dba._2ph-")).sendKeys("abcd");
		driver.findElement(By.cssSelector("input[name=lastname]")).sendKeys("wxyz");
		driver.findElement(By.cssSelector("input[name=reg_email__]")).sendKeys("0001112220");
		driver.findElement(By.cssSelector("input#password_step_input")).sendKeys("Password");
		
		//Birth Day Selection
		WebElement monthdd=driver.findElement(By.cssSelector("select#month"));
		Select mon=new Select(monthdd);
		mon.selectByVisibleText("Sep");
		
		WebElement daydd=driver.findElement(By.cssSelector("select#day"));
		Select days=new Select(daydd);
		days.selectByIndex(19);
		
		WebElement yeardd=driver.findElement(By.cssSelector("select#year"));
		Select years=new Select(yeardd);
		years.selectByValue("1987");
		
		//Gender
		driver.findElement(By.cssSelector("label._58mt")).click();
		
		driver.findElement(By.cssSelector("button[name='websubmit']")).click();
		Thread.sleep(2000);
		
		
		
		
		
		
		
	}

}
