package com.cric.base;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import com.Cricinfo.HomeCric;

public class RunCricPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\ecl sel\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.espncricinfo.com/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		// driver.findElement(By.className("wzrk-button-container[id='wzrk-cancel']")).click();
		driver.findElement(By.cssSelector("div.wzrk-button-container [id='wzrk-cancel']")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		HomeCric hm = new HomeCric(driver);

		hm.findFeatures();
		Thread.sleep(3000);

		hm.findSeries();
		Thread.sleep(30000);

		hm.findTeams();
		Thread.sleep(30000);

		hm.findFeatures();
		Thread.sleep(30000);

		hm.findVideos();
		Thread.sleep(30000);

		hm.findStats();
		Thread.sleep(30000);

	}
}
