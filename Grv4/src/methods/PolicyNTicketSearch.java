package methods;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pom.PolicySearch;
import pom.TicketSearch;

public class PolicyNTicketSearch extends LoginMethods
{
 public void Policysearchlink()
 {
	Actions action = new Actions(dr);
	action.moveToElement(PolicySearch.quicklink).click().build().perform();
	action.moveToElement(PolicySearch.searchPolicy).click().build().perform();
 }
 
 public void enterpolicynum(String ar)
 {
	 PolicySearch.policyNumber.sendKeys(ar);
 }
 
 public void fetchButton()
 {
	 PolicySearch.FetchButton.click();
 }
 
 public void checkboxes()
 {
	 PolicySearch.policyNumCheck.click();
	 PolicySearch.clientIdCheck.click();
	 PolicySearch.DOB.click();
 }
 
 public void Validate()
 {
	 PolicySearch.BtnValidate.click();
 }
 public void Continue()
 {
	 dr.switchTo().activeElement();
	 PolicySearch.Continue.click();
 }
 
 public void Ticketsearchlink1()
 {
	WebDriverWait wait= new WebDriverWait(dr, 800);
	wait.until(ExpectedConditions.visibilityOf(PolicySearch.quicklink));
	Actions action = new Actions(dr);
	action.moveToElement(PolicySearch.quicklink).click().build().perform();
	action.moveToElement(TicketSearch.TicketSearchLink).click().build().perform();
 }
 
 public void EnterTcktNum(String ar)
 {
	 TicketSearch.TicketNum.sendKeys(ar);
 }
}
