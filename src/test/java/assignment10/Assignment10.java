package assignment10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assignment10 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ineuron-courses.vercel.app/login");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("ineuron@ineuron.ai");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("ineuron");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		Thread.sleep(7000);
		
		//Mouse Hover
		WebElement links=driver.findElement(By.xpath("//div[@class='nav-menu-item-manage']/span"));
		Actions act=new Actions(driver);
		act.moveToElement(links).perform();
		WebElement user=driver.findElement(By.xpath("//div[@class='nav-menu-item-hover-div']//a[1]"));
		user.click();
		Thread.sleep(2000);
		
		WebElement mhvr=driver.findElement(By.xpath("//h1[@class='title']"));
		Actions act1=new Actions(driver);
		act1.moveToElement(mhvr).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Add New Course ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\LENOVO\\Pictures\\Saved Pictures\\image.jpg");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Selenium Java");
		driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys("Adarsh Course");
		driver.findElement(By.xpath("//input[@id='instructorNameId']")).sendKeys("Mukesh");
		driver.findElement(By.xpath("//input[@id='price']")).clear();
		driver.findElement(By.xpath("//input[@id='price']")).sendKeys("8000");
		Thread.sleep(2000);
				
		/*driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--021 react-datepicker__day--selected react-datepicker__day--today']"));
		driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--021 react-datepicker__day--selected']"));
		*/
		driver.findElement(By.xpath("//div[normalize-space()='Select Category']")).click();
		driver.findElement(By.xpath("//button[text()='Testing']")).click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,550)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[text()='Delete']")).click();
		String value=driver.findElement(By.xpath("//table[contains(@class, courses-table)]//tr")).getText();
				
		if(value.contains(value))
		{
			System.out.println(value);
		}
		else
			System.out.println("Not Deleted");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Sign out']")).click();

	}

}
