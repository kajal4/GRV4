package methods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import pom.Forwardee;

public class ForwardeeMethods extends CaseOwnerMethod
{
 public void forwardeeSection()
 {
	 dr.navigate().refresh();
	 Forwardee.ForwardeeSection.click();
 }
 public void forwardeeComment()
 {
	 Forwardee.Forwardee1Comment.sendKeys("testing comments");
 }
 public void forwardeeDecision() throws InterruptedException
 {
	 Forwardee.Forwardee1Decision.clear();
	 Forwardee.Forwardee1Decision.sendKeys("accept");
	 Thread.sleep(800);
	 Forwardee.Forwardee1Decision.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
 }
 
  public void supervisorcomment()
 {
	 Forwardee.SupervisorComment.sendKeys("supervisor comments...");
 }
 public void supervisordecision(String ar)
 {
	 Select select = new Select(Forwardee.SupervisorDecision);
	 select.selectByValue(ar);
 }
 public void underwritercomment()
 {
	 Forwardee.UnderWriterComment.sendKeys("underwriter comments......");
 }
 public void underwriterdecision()
 {
	 Select select= new Select(Forwardee.UnderWriterDecision);
	 select.selectByVisibleText("Accept");
 }
 public void FICUSave()
 {
	 Forwardee.FICUSave.click();
 }
 public void approverComment()
 {
	 Forwardee.approverComment.sendKeys("approver commnets.......");
 }
 
 public void approverDecision()
 {
	 Select select = new Select(Forwardee.approverRCA);
	 select.selectByValue("Approved");
	 
 }
 
 public void policystatus() throws InterruptedException
 {
	 Forwardee.policyStatusSearch.click();
	 dr.switchTo().activeElement();
	 Thread.sleep(500);
	 Forwardee.policyStatusText.sendKeys("premium paying");
	 Forwardee.policyStatusText.sendKeys(Keys.ENTER);
	 Thread.sleep(800);
	 Forwardee.policyStatus.click();
	 dr.switchTo().defaultContent();
 }
 
 public void policynum()
 {
	 Forwardee.policyNum.sendKeys("7894561230");
 }
 
 public void GOApproverDecision()
 {
	Select select= new Select(Forwardee.GOApproverDecision);
	select.selectByValue("Accept");
 }
 
 public void forwardee2Comments()
 {
	 Forwardee.forwardee2Commnets.sendKeys("forwardee 2 comments...");
 }
 public void forwardee2Decision(String ar) throws InterruptedException
 {
	 Forwardee.forwardee2Decision.sendKeys(ar);
	 Thread.sleep(500);
	 Forwardee.forwardee2Decision.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	 Thread.sleep(500);
 }
 
 public String NTUResult()
 {
	 return(Forwardee.NTUResult.getText());
 }
 
 public void ManualNUT()
 {
	Select select= new Select(Forwardee.ManualNTU);
	select.selectByValue("00");
 }
 
 public void IsSucessIngenium()
 {
	 Select select = new Select (Forwardee.IsSucessIngenium);
	 select.selectByValue("00");
 }
 
 public void amtToTransfer()
 {
	 Forwardee.AmtToTransfer.sendKeys("30000");
 }
}
