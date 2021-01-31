package ma.s.gcm.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CustomerScenarioDeleteTest {
	public String baseUrl = "http://localhost:4200/#/login";
	String driverPath = "D://webDriver/geckodriver.exe";
	public WebDriver driver;

	@Test
	public void LoginConsultCustomerTest(){
		System.setProperty("webdriver.gecko.driver", driverPath);
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
        //login
		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys("1234567890");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("123");
		driver.findElement(By.id("login")).click();
		//delete
		driver.findElement(By.id("delete")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(By.id("submitDelete")).click();
		
	}
    

	@BeforeTest
	public void beforeTest() {
		System.out.println("before test");
	}

	@AfterTest
	public void afterTest() {
		// driver.quit();
		System.out.println("after test");
	}
}
