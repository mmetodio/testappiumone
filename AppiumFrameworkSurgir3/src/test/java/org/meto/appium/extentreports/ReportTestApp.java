package org.meto.appium.extentreports;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportTestApp {
	static ExtentReports extent;
	
	@BeforeTest
	public static ExtentReports getReporterObject()
	{
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("APP Automation Resutl");
		reporter.config().setDocumentTitle("Test Result");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester","Meto");
		return extent;
		
		
	}
	
	/*
	@Test
	public void initialRepo()
	{
		ExtentTest test = extent.createTest("Initial Test");
		System.setProperty("Webdriver.chrome.driver", "C://Users//Praxis//OneDrive//Documents//automatizedTests//src//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.print(driver.getTitle());
		driver.close();
		
		extent.flush();
		
	}*/

}
