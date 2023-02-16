package assignment8.assignment8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String text=driver.findElement(By.xpath("//h2[@class='_8eso']")).getText();
		//System.out.println(text);
		
		if(text.contains("Falcebook"))
		{
			System.out.println(text);
		}
		else
		{
			System.out.println("Message not present");
		}
	}

}
