package methods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pom.CSEFlow;
import pom.ScrutinyFlow;

public class ScrutinyMethods extends CSEMethods
{
 public void edit()
 {
//	 Point loc= ScrutinyFlow.Edit.getLocation();
//	 int x= loc.getX();
	 JavascriptExecutor jse = (JavascriptExecutor)dr;
	 jse.executeScript("arguments[0].scrollIntoView(true);", ScrutinyFlow.Edit);
	 WebDriverWait wait= new WebDriverWait(dr,4000);
	 wait.until(ExpectedConditions.elementToBeClickable(ScrutinyFlow.Edit));
	 ScrutinyFlow.Edit.click();
 }
 
 public void scrutinySection()
 {
	 ScrutinyFlow.scrutinySection.click();
 }
 
 public void CD(String ar) throws InterruptedException
 {
	 ScrutinyFlow.CD.sendKeys(ar);
	 WebDriverWait wait = new WebDriverWait(dr, 60);
	 wait.until(ExpectedConditions.visibilityOf(CSEFlow.AutoPopulateCD));
	 ScrutinyFlow.CD.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
 }
 
 public void RCAType(String ar) throws InterruptedException
 {
	 ScrutinyFlow.RCAType.sendKeys(ar);
	 Thread.sleep(800);
	 ScrutinyFlow.RCAType.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
 }
 
 public void RCAComment(String ar)
 {
	ScrutinyFlow.RCAComment.sendKeys("comments by scrutiny"); 
 }
 
 public void DNCRequest()
 {
	 Select select = new Select(ScrutinyFlow.DNCRequest);
	 select.selectByValue("Subscribe");
 }
 
 public void save1() throws InterruptedException
 {
	 
	 WebDriverWait wait = new WebDriverWait(dr, 2000);
	 wait.until(ExpectedConditions.elementToBeClickable(ScrutinyFlow.save1));
	 ScrutinyFlow.save1.sendKeys(Keys.ENTER);
 }
 
 public void highlightElement(WebDriver driver, WebElement element) {
	    for (int i = 0; i < 2; i++) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
	                element, "color: yellow; border: 2px solid yellow;");
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
	                element, "");
	    }
	}
 
 public void GOSearch()
 {
	 ScrutinyFlow.GoSearch.click();
 }
 
 public void GOCode() throws InterruptedException
 {
//     WebDriverWait wait = new WebDriverWait(dr, 1000)
	 Thread.sleep(2000);
	 dr.switchTo().activeElement();
	 ScrutinyFlow.GOCode.click();
	 dr.switchTo().defaultContent();
	 Thread.sleep(1000);
 }
 
 public void GOtxtsearch()
 {
	 dr.switchTo().activeElement();
	 ScrutinyFlow.txtsearch.sendKeys("150 ft");
 }
 
 public void IRDAProblem()
 {
	 JavascriptExecutor jse = (JavascriptExecutor)dr;
	 jse.executeScript("window.scrollBy(250,0)", "");
	 ScrutinyFlow.IRDAProblem.sendKeys("aaaaaaa");
 }
 
 public void incorrectinfo()
 {
	 ScrutinyFlow.IncorrectInfo.sendKeys("aaaaaaa");
 }
 public void correctinfo()
 {
	 ScrutinyFlow.CorrectInfo.sendKeys("aaaaaaaaaaaa");
 }
 
 public void refundReason() throws InterruptedException
 {
	 JavascriptExecutor jse= (JavascriptExecutor)dr;
	 jse.executeScript("arguments[0].scrollIntoView(true);",ScrutinyFlow.RefundReasonPicker );
	 ScrutinyFlow.RefundReasonPicker.click();
	 Thread.sleep(800);
	 dr.switchTo().activeElement();
	 Thread.sleep(800);
	 ScrutinyFlow.GOCode.click();
 }
 
 public void accountFrom()
 {
	 Select select = new Select(ScrutinyFlow.AccountFrom);
	 select.selectByValue("ADF");
 }
 
 public void ScrutinyAccHolderName(String ar)
 {
	 ScrutinyFlow.ScrutinyAccountHoldername.sendKeys(ar);
 }
 
 public void ScrutinyAccNum(String ar)
 {
	 ScrutinyFlow.ScrutinyAccountNumber.sendKeys(ar);
 }
 
 public void ScrutinyAccType()
 {
	 Select select= new Select(ScrutinyFlow.ScrutinyAccountType);
	 select.selectByVisibleText("Saving Account");
 }
 
 public void ScrutinyBankName(String ar)
 {
	 ScrutinyFlow.ScrutinyBankName.sendKeys(ar);
 }
 
 public void ScrutinyIFSC(String ar)
 {
	 ScrutinyFlow.ScrutinyIFSC.sendKeys(ar);
 }
 public void ScrutinyMICR(String ar)
 {
	 ScrutinyFlow.ScrutinyMICR.sendKeys(ar);
 }
}
