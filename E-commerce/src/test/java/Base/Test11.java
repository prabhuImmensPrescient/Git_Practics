package Base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Test11 {
	public static WebDriver driver;
	@Test
	public void LoginPage() throws Exception {
		driver=new ChromeDriver();
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
		
		Actions action = new Actions(driver);
		driver.switchTo().frame(0);
		//Mouse hovers
		action.moveToElement(loginbtn).perform();
		loginbtn.click();
		//Double click
		action.doubleClick(loginbtn).perform();
		
		//Right click
		action.contextClick(loginbtn).build().perform();
		
		//Drag and drop
		action.dragAndDrop(password, loginbtn).build().perform();
		action.clickAndHold(loginbtn).moveToElement(loginbtn).release(loginbtn).build().perform();
		
		//Drop_down
		Select select=new Select(loginbtn);
		select.selectByIndex(0);
		select.selectByValue("Hello World");
		select.selectByVisibleText("Login");
		
		
		driver.navigate().refresh();
		driver.navigate().forward();
	
	Thread.sleep(5000);
	driver.quit();
	}
}
