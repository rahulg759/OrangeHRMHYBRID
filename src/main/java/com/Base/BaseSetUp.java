package com.Base;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
/*import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;*/

import com.Utilities.ReadProperty;

public class BaseSetUp {

	WebDriver driver;
	
/*
	ReadProperty prop = new ReadProperty("config");

	@BeforeMethod
	public void instaliseBrowser() {

		String browser1 = prop.getProperty("browser");
		if (browser1.equalsIgnoreCase("chrome"))

		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator
					+ "Executables" + File.separator + "chromedriver.exe");

			driver = new ChromeDriver();

		}

		else if (browser1.equalsIgnoreCase("ff"))

		{
			System.setProperty("webdriver.gecko.driver", System
					.getProperty("user.dir" + File.separator + "Executables" + File.separator + "geckodriver.exe"));

			driver = new FirefoxDriver();
		}

		else if (browser1.equalsIgnoreCase("ie"))

		{
			System.setProperty("webdriver.ie.driver", System
					.getProperty("user.dir" + File.separator + "Executables" + File.separator + "IEDriverServer.exe"));

			driver = new InternetExplorerDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));

	}
	


	@BeforeMethod
	public void tearDown() {
		driver.close();

	}

*/}
