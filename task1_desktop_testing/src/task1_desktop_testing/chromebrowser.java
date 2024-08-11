package task1_desktop_testing;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class chromebrowser {
protected WebDriver driver;
	
	@BeforeClass
	public void google_setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        
        
    }
	@AfterClass
	public void empty()
	{
		if(driver!=null)
		{
			driver.quit();
		}
	}
}
