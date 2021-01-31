package ma.s.gcm.selenium;

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

public class CustomerScenarioAddTest {
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
		//ajout
		driver.findElement(By.id("ajout")).click();
		driver.findElement(By.id("firstName")).click();
		driver.findElement(By.id("firstName")).sendKeys("manal");
		driver.findElement(By.id("lastName")).click();
		driver.findElement(By.id("lastName")).sendKeys("ait dik");
		driver.findElement(By.id("address")).click();
		driver.findElement(By.id("address")).sendKeys("08 safi, maroc");
		driver.findElement(By.id("cin")).click();
		driver.findElement(By.id("cin")).sendKeys("H1236987");
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).sendKeys("manalaitdik@gmail.com");
		driver.findElement(By.id("tel")).click();
		driver.findElement(By.id("tel")).sendKeys("0682545458");
		driver.findElement(By.id("sexe")).click();
		driver.findElement(By.id("femme")).click();
		driver.findElement(By.id("amount")).click();
		driver.findElement(By.id("amount")).sendKeys("1588");
		driver.findElement(By.id("accountType")).click();
		driver.findElement(By.id("accountType")).sendKeys("type1");
		driver.findElement(By.id("submitAjout")).click();
		
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
