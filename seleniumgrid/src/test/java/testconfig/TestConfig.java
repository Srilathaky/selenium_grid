package testconfig;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import utility.BrowserOperation;
import utility.ScreenShot;

public class TestConfig {
	protected WebDriver driver;

	@BeforeTest
	@Parameters({ "browser", "browser1", "runmode" })
	public void initial_setup(@Optional("chrome") String browser, @Optional("firefox") String browser1,
			@Optional("remote") String runmode) throws InterruptedException, IOException {
		driver = BrowserOperation.openBrowser(browser, runmode);
	}

	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException {
		ScreenShot.takeScreenShot(result.getMethod().getMethodName(), driver);

	}

	@AfterTest
	public void after_test() {
		BrowserOperation.closeDriver(driver);
	}
}
