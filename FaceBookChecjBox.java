package SelElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookChecjBox {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
	
		 
		
		// WebElement element = driver.findElement(By.xpath("//label[text()='Male']"));
		
		//WebElement element = driver.findElement(By.xpath("//label[text()='Female']"));
		
		// WebElement element = driver.findElement(By.xpath("//label[text()='Custom']"));
		
		
		
		
		// WebElement element = driver.findElement(By.xpath("//label[text()='Male']/ancestor::span[@class='_5k_2 _5dba']//input[@type='radio']"));
		
		WebElement element = driver.findElement(By.xpath("//label[text()='Female']/ancestor::span[@class='_5k_2 _5dba']//input[@type='radio']"));
		
		// WebElement element = driver.findElement(By.xpath("//label[text()='Custom']/ancestor::span[@class='_5k_2 _5dba']//input[@type='radio']"));
		
		
		
		if(element.isSelected())
		{
			System.out.println("True : Targeted Element Is Selected✅");
		}
		else
		{
			System.out.println("False : Targeted Element Is Not Selected❌");
		}
		 
		Thread.sleep(2000);
		
		element.click();
		
		Thread.sleep(2000);
		
		if(element.isSelected())
		{
			System.out.println("True : Targeted Element Is Selected✅");
		}
		else
		{
			System.out.println("False : Targeted Element Is Not-Selected❌");
		}
	
		
		//GitHub
		//Selenium
}
}
	

