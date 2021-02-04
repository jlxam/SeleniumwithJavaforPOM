package Antony;

import java.io.IOException; // TestBase.java
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Util {
	public static WebDriver driver = null;
	@BeforeSuite
	public void initialize() throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\antony.j\\eclipse-workspace\\practice\\src\\main\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 basepage ba = PageFactory.initElements(driver, basepage.class);
		String URL=ba.url();
		driver.get(URL);
	}

	@AfterSuite
	public void TeardownTest() {
		Util.driver.quit();
	}
}
