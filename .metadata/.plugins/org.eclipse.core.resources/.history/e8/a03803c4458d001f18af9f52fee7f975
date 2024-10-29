package Base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test11 {

	@Test
	public void LoginPage() throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.manage().deleteAllCookies();
		
		driver.get("https://rahulshettyacademy.com/client");
		
		WebElement username = driver.findElement(By.xpath("//input[@id='userEmail']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='userPassword']"));
		WebElement loginbtn = driver.findElement(By.xpath("//input[@id='login']"));
		
		username.sendKeys("prabhusingh12296@gmail.com");
		password.sendKeys("Prabhu123@");
		loginbtn.click();
		System.out.println("Hello world");
		
	Thread.sleep(5000);
	driver.quit();
	}
}
