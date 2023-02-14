package assignment7_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();	
		
		
	driver.findElement(By.xpath("//input[@placeholder='Username']")).click();
	Thread.sleep(2000);
	String un=driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span "
			+ "oxd-input-field-error-message oxd-input-group__message']")).getText();
	System.out.println(un);
	
	driver.findElement(By.xpath("//i[@class='oxd-icon bi-key oxd-input-group__label-icon']")).click();
	Thread.sleep(2000);
	String pswd=driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")).getText();
	System.out.println(pswd);
	}

	
	
}
