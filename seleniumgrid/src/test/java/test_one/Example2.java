package test_one;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import testconfig.TestConfig;
import utility.BrowserOperation;
import utility.ScreenShot;

public class Example2 extends TestConfig {
	@Test(enabled=true)
	// @Parameters({ "browser1", "runmode" })
	public void test3() throws InterruptedException, IOException {
		WebDriver driver = super.driver;
		// driver = BrowserOperation.openBrowser(browser1, runmode);
		driver.get("https://www.guru99.com/");
		Thread.sleep(30000);
		// BrowserOperation.closeDriver(driver);
	}
}
