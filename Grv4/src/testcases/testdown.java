package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testdown
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Kajali Agrawal\\Desktop\\Selenium\\geckodriver-v0.17.0-win32\\geckodriver.exe");
		  WebDriver driver= new FirefoxDriver();
		  driver.get("http://maxprodsa/sn/app/login/login");
		  WebDriverWait wait = new WebDriverWait(driver, 5000);
		  System.out.println("open.........");
		  driver.findElement(By.id("TxtName")).sendKeys("cse");
		  driver.findElement(By.id("TxtPassword")).sendKeys("acid_qa");
		  driver.findElement(By.xpath(".//*[@id='registration']/ul/li[5]/input")).click();
		  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(".//*[@id='js-vnav']/li[6]/a/i"))));
		  Actions action = new Actions(driver);
		  action.moveToElement(driver.findElement(By.xpath(".//*[@id='js-vnav']/li[6]/a/i"))).click();
		  action.moveToElement(driver.findElement(By.xpath(".//*[@id='js-vnav']/li[6]/div/ul/li/a/span[2]"))).click().build().perform();
		  Thread.sleep(2000);
//		  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(".//*[@id='row3jqxgrid']/div[2]/div/a"))));
		  driver.findElement(By.xpath(".//*[@id='row3jqxgrid']/div[2]/div/a")).click();
		  Runtime.getRuntime().exec("C:\\Users\\Kajali Agrawal\\Desktop\\download.exe");
		  System.out.println("end......");

	}
}
