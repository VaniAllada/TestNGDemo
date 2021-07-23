package parallelpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelExecutionDemo {
	
	WebDriver driver;

	@Test

	public void googleOpen() {

	System.setProperty("webdriver.chrome.driver", "C:\\ChromeBrowser\\chromedriver.exe");

	driver = new ChromeDriver();

	driver.get("https://www.google.com/");

	}

	@Test

	public void yahooOpen() {

	System.setProperty("webdriver.chrome.driver", "C:\\ChromeBrowser\\chromedriver.exe");

	driver = new ChromeDriver();

	driver.get("https://yahoo.com/");

	}

	@Test

	public void bingOpen() {

	System.setProperty("webdriver.chrome.driver", "C:\\ChromeBrowser\\chromedriver.exe");

	driver = new ChromeDriver();

	driver.get("http://bing.com");

	}

}
