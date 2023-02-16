package assignment8.assignment8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		//WebDriver driver= new ChromeDriver();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(2000);
		
		List<WebElement> links=driver.findElements(By.xpath("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']//a"));
		int lnk=links.size();
		System.out.println(lnk);
		
		for (int i = 1;i<=lnk;i++)
		{
			WebElement alnks=links.get(i);
			String a1=alnks.getText();
			System.out.println(a1);
			
			if (a1.contains("Create Page"))
			{
				System.out.println("Create Page is available");
				driver.findElement(By.xpath("//a[@title='Create a page']")).click();
			}
			
		}
		
		

	}

}
