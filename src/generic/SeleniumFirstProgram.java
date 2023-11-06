package generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirstProgram {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com");
//		driver.close();
		Navigation nav = driver.navigate();
		nav.to("https://www.facebook.com");
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		nav.refresh();
		Thread.sleep(2000);
		nav.back();
		Thread.sleep(2000);
		nav.forward();
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
