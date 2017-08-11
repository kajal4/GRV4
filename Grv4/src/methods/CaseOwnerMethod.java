package methods;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

import pom.CaseOwner;

public class CaseOwnerMethod extends ScrutinyMethods
{
 public void CaseOwnerSection()
 {
  CaseOwner.CaseOwnerSection.click();	
 }
 public void acceptancestatus()
 {
	Select select= new Select(CaseOwner.AcceptanceStatus);
	select.selectByValue("2");
 }
 
 public void Resolutionus()
 {
	 Select select= new Select(CaseOwner.Resolution_us6);
	 select.selectByVisibleText("Acceded to request fully");
 }
 public void IsForwarding()
 {
	Select select= new Select(CaseOwner.IsForwarding);
	select.selectByVisibleText("No");
 }
 
 public void ResolutionBy()
 {
	 Select select =  new Select (CaseOwner.ResolutionBy);
	 select.selectByValue("Email");
 }
 
 public void resolutionComments(String ar) throws InterruptedException
 {
	 dr.switchTo().frame(1);
	 Thread.sleep(1000);
	 CaseOwner.ResolutionComment.sendKeys(ar);
	 dr.switchTo().defaultContent();
 }
 
 public void premium()
 {
	 CaseOwner.RequiredPremium.sendKeys("50000");
 }
 
 public void history()
 {
	 CaseOwner.CaseHistory.sendKeys("history");
 }
 
 public void delay()
 {
	 CaseOwner.delay.sendKeys("delay");
 }
 
 public void wrong()
 {
	 CaseOwner.wentwrong.sendKeys("went wrong");
 }
 
 public void Recovery()
 {
	 CaseOwner.recovery.sendKeys("Yes");
 }
 
 public void CaseOwnerIRDA()
 {
	 CaseOwner.CaseOwnerIRDA.sendKeys("case owner IRDA comments");
 }
 public void saveNproceed()
 {
	 CaseOwner.CaseOwnerSave.click();
 }

 public void resolutionLetter() throws InterruptedException
 {
	 JavascriptExecutor jse= (JavascriptExecutor)dr;
	 jse.executeScript("arguments[0].scrollIntoView(true)", CaseOwner.resolutionLetter);
	 CaseOwner.resolutionLetter.click();
	 Thread.sleep(1000);
	 Set<String> windowhandles= dr.getWindowHandles();
	 Iterator<String> I = windowhandles.iterator();
	 I.next();
	 String childwindow= I.next();
	 String resolutionletter=I.next();
	 dr.switchTo().window(resolutionletter);
	 Thread.sleep(1000);
	 CaseOwner.resolutionLetterSave.click();
	 Thread.sleep(1000);
	 dr.switchTo().window(childwindow);
	 Thread.sleep(2000);
 }
}
