package selenium_test1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class selenium_test2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		//Chrome
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://qareview.fotoware.cloud/fotoweb/");
		
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		Thread.sleep(1000);
		
		// Navigate to Login button
		driver.findElement(By.xpath("//a[@class='settings-link dropdown-toggle js-login-link']")).click();
		
		// Input field username
		driver.findElement(By.id("username-page")).sendKeys("qajohan");
		// Input field password
		driver.findElement(By.id("password-page")).sendKeys("Test1234!");
		
		//Submit button
		driver.findElement(By.id("page-form-submit")).click();
		
		Thread.sleep(2000);
		
		//Search the page for Peter and submit
		driver.findElement(By.id("mainSearchField")).sendKeys("peter");
		driver.findElement(By.id("mainSearchButton")).click();
		
		Thread.sleep(2000);
		
		// Sign out part 
		driver.findElement(By.className("userAvatarSmall")).click();
		driver.findElement(By.xpath("//div[@class='userMenuOption logout']")).click();
		
		
		//=================== VERSION 2 ==================================================//
		
		Thread.sleep(1000);
		
		// Input field username
		driver.findElement(By.id("username-page")).sendKeys("qajohan");
		// Input field password
		driver.findElement(By.id("password-page")).sendKeys("Test1234!");
		driver.findElement(By.id("page-form-submit")).click();
		
		Thread.sleep(1000);
		
		//Click into the the Digital Asset Mngt
		driver.findElement(By.className("media-set-elem-in")).click();
		
		Thread.sleep(2000);
		
		// Find Peter's Element
		driver.findElement(By.xpath("//li[47]")).click();
		
		
		// Close the program
		driver.close();

	}

}
