package generic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllLinkPresentOnGmail {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.gmail.com");
		
		driver.manage().window().maximize();
		
		List<WebElement> link = driver.findElements(By.tagName("a"));
		
		for(WebElement link2 :link)
		{
			System.out.println(link2.getAttribute("href"));
			System.out.println(link2.getText());
			
			link2.click();
			
			
		}
		
		Thread.sleep(5000);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_2);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_2);
		
		Thread.sleep(5000);
		
       driver.close();
       driver.quit();

	}

}
