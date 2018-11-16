package utility;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserOperation {
	static WebDriver driver;

	public static WebDriver openBrowser(String browser, String runmode) throws InterruptedException, IOException {
		if (runmode.equalsIgnoreCase("local")) {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "Browser_exe/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "Browser_exe/geckodriver.exe");
				driver = new FirefoxDriver();
			}

		} else if (runmode.equalsIgnoreCase("remote"))

		{
			if (browser.equalsIgnoreCase("chrome")) {
				ChromeOptions ch = new ChromeOptions();
				System.setProperty("webdriver.chrome.driver", "Browser_exe/chromedriver.exe");
				driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), ch);//hub is local machine

			} else if (browser.equalsIgnoreCase("firefox")) {
				FirefoxOptions ff = new FirefoxOptions();
				System.setProperty("webdriver.gecko.driver", "Browser_exe/geckodriver.exe");
				driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), ff);

			}
		}
		return driver;
	}

	public static void closeDriver(WebDriver driver) {
		driver.quit();
	}
}
