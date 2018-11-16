package test_one;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import testconfig.TestConfig;
import utility.BrowserOperation;
import utility.ScreenShot;

public class Example1 extends TestConfig {
	@Test
	@Parameters({ "browser", "runmode" })
	public void test1() throws InterruptedException, IOException {
		// WebDriver driver = super.driver;
		// driver = BrowserOperation.openBrowser(browser, runmode);
		driver.get("https://www.google.com/");
		// ScreenShot.takeScreenShot("Test", driver);
		Thread.sleep(30000);

	}

	@Test(enabled = false)
	@Parameters({ "browser", "runmode" })
	public void test2() throws InterruptedException, IOException {
		// WebDriver driver = super.driver;
		// driver = BrowserOperation.openBrowser(browser, runmode);
		driver.get("https://www.guru99.com/");
		// ScreenShot.takeScreenShot("Test_ff", driver);
		Thread.sleep(30000);
		// BrowserOperation.closeDriver(driver);
	}
}
