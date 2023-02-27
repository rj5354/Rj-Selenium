package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filpkartfindelement {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.flipkart.com/");
		//Driver.findElement(By.cssSelector("button[class=\"_2KpZ6l _2doB4z\"]")).click();
		//Thread.sleep(2000);
		//Driver.findElement(By.cssSelector("img[alt=\"Grocery\"]")).click();


	}

}
