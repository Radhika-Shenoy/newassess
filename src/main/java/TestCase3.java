import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestCase3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\M1074287\\eclipse-workspace\\projectcheck\\Driver\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		//WebDriver driver = new ChromeDriver();
		driver.get("https://www.eazydiner.com/");
		driver.manage().window().maximize();
	
		WebElement e=driver.findElement(By.xpath("//input[@id='home-search']"));
		e.sendKeys("pizza");
		Thread.sleep(2000L);
		
		e.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(5000L);
		String check=driver.findElement(By.xpath("//*[text()='Pizza']")).getText();
		if(check.contains("Pizza")) {
			System.out.println("The below page has a list of differnt outlets for Pizza!!");
	}

}
}
