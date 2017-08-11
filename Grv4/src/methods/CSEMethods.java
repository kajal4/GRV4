package methods;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pom.CSEFlow;

public class CSEMethods extends Policy360Methods
{
	
 public void windowHandling() throws InterruptedException
 {
   Thread.sleep(3000);	 
   Set <String> handles = dr.getWindowHandles();
   Iterator<String> I = handles.iterator();
   I.next();
   String childWindow = I.next();
   dr.switchTo().window(childWindow);
 }
	
 public void maximize()
 {
	 Actions action = new Actions(dr);
	 action.keyDown(Keys.ALT);
	 action.sendKeys(Keys.SPACE);
	 action.keyUp(Keys.ALT);
	 action.build().perform();
//	 action.sendKeys(Keys.chord("x")).build().perform();
 }
	
 public void callertype()
 {
	 WebDriverWait wait= new WebDriverWait(dr, 5000);
	 wait.until(ExpectedConditions.visibilityOf(CSEFlow.CallerType));
	 Select select= new Select (CSEFlow.CallerType);
	 select.selectByVisibleText("Customer");
 }
 
 public void callerName(String ar) throws InterruptedException
 {
	 
	 CSEFlow.CallerName.sendKeys(ar);
 }
 
 public void ProblemBox(String ar)
 {
	 WebDriverWait wait= new WebDriverWait(dr, 60);
	 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
//	 dr.switchTo().frame(0);
	 CSEFlow.ProblemBox.sendKeys(ar);
	 dr.switchTo().defaultContent();
 }
 
 public void SSC(String ar) throws InterruptedException
 {
	 CSEFlow.SSC.sendKeys(ar);
	 WebDriverWait wait = new WebDriverWait(dr, 4000);
	 wait.until(ExpectedConditions.visibilityOf(CSEFlow.AutopopulatedSSC));
	 CSEFlow.SSC.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
 }
 
 public void Nextbtn()
 {
	 CSEFlow.Next.click();
 }
 
 public void CR(String ar)
 {
	 Select select= new Select(CSEFlow.CR);
	 select.selectByVisibleText(ar);
 }
 
 public void GODate(String date1,String Month1,String Year1)
 {
	 JavascriptExecutor jse = (JavascriptExecutor)dr;
	 jse.executeScript("window.scrollBy(0,550)","");
	 
	 CSEFlow.Calendar.click();
	 
	 Select yr= new Select(CSEFlow.Year);
	 yr.selectByVisibleText(Year1);
	 
	 Select mnth= new Select(CSEFlow.Month);
	 mnth.selectByVisibleText(Month1);
	 
	 List<WebElement> dt=  dr.findElements(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr/td/a"));
	 {
		 for(WebElement k :dt)
		 {
		 if(date1.equalsIgnoreCase(k.getText()))
		 {
			 k.click();
		 }
		 }
	 }
 }
 
 public void SaveNProceed()
 {
	 CSEFlow.SaveandProceed.click();
 }
 
 public String caseid()
 {
	 return(CSEFlow.CaseId.getText());
 }
 
 public String status()
 {
	 return(CSEFlow.status.getText());
 }
 
 public String substatus()
 {
	 return(CSEFlow.substatus.getText());
 }
 
 public String assignedto() throws InterruptedException
 {
	 Thread.sleep(600);
	 return(CSEFlow.AssignedTo.getText());
 }
 
 public void toc ()
 {
	 JavascriptExecutor jse =  (JavascriptExecutor)dr;
	 jse.executeScript("window.scrollBy(0,500)", "");
	 CSEFlow.TOC.click();
	 CSEFlow.Toc1.click();
 }
 
 public void conversation()
 {
	 CSEFlow.conversation.sendKeys("testing data");
 }
 
 public void callNo()
 {
	 CSEFlow.callNumber.sendKeys("198");
 }
 public void csTeam()
 {
	 Select select = new Select(CSEFlow.csTeam);
	 select.selectByVisibleText("Yes");
 }
 public void Receiver()
 {
	 CSEFlow.receiverName.sendKeys("kajali");
 }
 public void ReceiverNo()
 {
	 CSEFlow.receiverNumber.sendKeys("7894561230");
 }
 public void payment()
 {
	 Select select= new Select(CSEFlow.payment);
	 select.selectByVisibleText("No");
  }
 public void oldPolicyNum()
 {
	 CSEFlow.oldPolicyNum.sendKeys("000003632");
 }
 public void newPolicyNum()
 {
	 CSEFlow.newPolicyNum.sendKeys("100002112");
 }
 
 public void amtToTransfer1()
 {
	 CSEFlow.amtToTransfer.sendKeys("10000");
 }
 
 public void PTFReason()
 {
	 Select select= new Select(CSEFlow.PTFReason);
	 select.selectByValue("Customer Error");
 }
 
 public void PTFFormSelect() throws IOException, InterruptedException
 {
	 CSEFlow.PTFFormSelect.click();
	 Thread.sleep(2500L);
	 Runtime.getRuntime().exec("C:\\Users\\Kajali Agrawal\\Desktop\\uploadfile.exe");
 }
 
 public void PTFFormUpload() throws InterruptedException
 {
	 Thread.sleep(2500L);
	 CSEFlow.PTFFormUpload.click();
 }
 
 public void CustomerLetterSelect() throws IOException, InterruptedException
 {
	 CSEFlow.CustomerLetterSelect.click();
	 Thread.sleep(2500L);
	 Runtime.getRuntime().exec("C:\\Users\\Kajali Agrawal\\Desktop\\uploadfile.exe");
 }
 
 public void CustLetterUpload() throws InterruptedException
 {
	 Thread.sleep(2500L);
	 CSEFlow.CustomerLetterUpload.click();
	 Thread.sleep(2500L);
 }
 
 public void GOTime()
 {
	 CSEFlow.GOTime.click();
	 CSEFlow.GOTimeSlot.click();
 }
 
 public void InterOldPolicyNum()
 {
	 CSEFlow.InterOldPolicyNum.sendKeys("000003632");
 }
 public void InterNewPolicyNum()
 {
	 CSEFlow.InterNewPolicyNum.sendKeys("000005389");
 }
 public void InterIsTransfer()
 {
	 Select select= new Select(CSEFlow.InterIsTransfer);
	 select.selectByValue("YES");
 }
 public void InterRefundChequeStatus()
 {
	 Select select= new Select(CSEFlow.RefundChequeStatus);
	 select.selectByValue("Active");
 }
 public void InterAmt()
 {
	 CSEFlow.InterAmt.sendKeys("10000");
 }
 public void InterAmtToTransfer()
 {
	 CSEFlow.InterAmtToTransfer.sendKeys("5000");
 }
 public void InterPTFReason()
 {
	 Select select = new Select(CSEFlow.InterPTFReason);
	 select.selectByValue("Customer Error");
 }
 public void PTFRequestedBy() throws InterruptedException
 {
	 CSEFlow.InterPTFRequestedBy.click();
	 Thread.sleep(1000);
	 dr.switchTo().activeElement();
	 CSEFlow.InterPTFRequestedByUser.click();
	 Thread.sleep(1000);

 }
 public void PTFApprovedBy() throws InterruptedException
 {
	 CSEFlow.InterPTFApprovedBy.click();
	 Thread.sleep(2000);
	 dr.switchTo().activeElement();
	 CSEFlow.InterPTFRApprovedByUser.click();
	 Thread.sleep(1000);

 }
 public void requestedDate()
 {
	 CSEFlow.InterRequestedDate.click();
 }
 public void approvalDate()
 {
	 CSEFlow.InterApprovedDate.click();
 }
 public void ProofOfPaymentupload() throws IOException, InterruptedException
 {
	 CSEFlow.ProofOfPaymentSelect.click();
	 Thread.sleep(2000L);
	 Runtime.getRuntime().exec("C:\\Users\\Kajali Agrawal\\Desktop\\uploadfile.exe");
	 Thread.sleep(2000L);
	 CSEFlow.ProofOfPaymentUpload.click();
	 Thread.sleep(2000L);
 }
 public void RefundMethod(String ar)
 {
	 Select select = new Select(CSEFlow.RefundMethod);
	 select.selectByVisibleText(ar);
 }
 
 public void sameAsIngenium(String ar)
 {
	 Select select = new Select(CSEFlow.SameAsIngenium);
	 select.selectByValue(ar);
 }
 
 public void accountHolderName(String ar)
 {
	 CSEFlow.AccountHolderName.sendKeys(ar);
 }
 
 public void accountNo(String ar)
 {
	 CSEFlow.AccountNo.sendKeys(ar);
 }
 
 public void accountType()
 {
	 Select select = new Select(CSEFlow.AccountType);
	 select.selectByValue("10");
 }
 public void bankName(String ar)
 {
	 CSEFlow.BankName.sendKeys(ar);
 }
 public void IFSC(String ar)
 {
	 CSEFlow.IFSC.sendKeys(ar);
 }
 public void MICR(String ar)
 {
	 CSEFlow.MICR.sendKeys(ar);
 }
 public void NEFTForm() throws IOException, InterruptedException
 {
	 CSEFlow.NEFTFormSelect.click();
	 Thread.sleep(800);
	 Runtime.getRuntime().exec("C:\\Users\\Kajali Agrawal\\Desktop\\uploadNeft.exe");
	 WebDriverWait wait= new WebDriverWait(dr, 3000);
	 wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.id("23542_thumbnaillist"))));
	 Thread.sleep(1000);
	 CSEFlow.NEFTFormUpload.click();
 }
}
