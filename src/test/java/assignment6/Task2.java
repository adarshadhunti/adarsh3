package assignment6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("A");
		Thread.sleep(4000);
		List<WebElement> ele=driver.findElements(By.xpath("//div[@class='oxd-autocomplete-option']"));
		int auto=ele.size();
		System.out.println(auto);
		for ( WebElement auto1: ele) { 
		    System.out.println(auto1.getText());
			
		}
	}

}
