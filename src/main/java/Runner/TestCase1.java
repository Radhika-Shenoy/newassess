package Runner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestCase1 {
	@Test
	public static void TC1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\M1074287\\eclipse-workspace\\projectcheck\\Driver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		// WebDriver driver = new ChromeDriver();
		driver.get("https://www.eazydiner.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@id='login-btn']")).click();
		driver.findElement(By.xpath("//input[@class='input input-mobile']")).sendKeys("8660011372");
		driver.findElement(By.xpath("//div[@class='text-center margin-t-20'] //button[@class='button bold']"))
				.sendKeys(Keys.ENTER);
		// driver.findElement(By.cssSelector("input[name='otp']")).sendKeys("3647");
		Thread.sleep(3000L);
		// driver.findElement(By.cssSelector("//*[@id=\"form-otp\"]/div[2]/div/input")).sendKeys("3647");
		// driver.findElement(By.xpath("//*[@id=\"form-otp\"]/div[3]/div/button")).click();
		driver.close();

	}

}
