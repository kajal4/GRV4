package testcases;

import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import connectivity.TestConnectivity;
import pom.CaseOwner;
import methods.CaseOwnerMethod;

public class GRV4_TS106 extends CaseOwnerMethod
{
	@Test
 public void DNC() throws InterruptedException, SQLException
 {
	 TestConnectivity con = new TestConnectivity();
	 con.setup();
	 username("cse");
	 password("acid_qa");
	 login1();
	 Policysearchlink();
	 enterpolicynum("000003632");
	 fetchButton();
	 checkboxes();
	 Validate();
	 Continue();
	 cseflow();
	 windowHandling();
	 maximize();
	 callertype();
	
	 callerName("kajali");
	 ProblemBox("cse comments for problem");
	 SSC("Miss-selling / Fraud by Agen");
	 Nextbtn();
	 Thread.sleep(2000);
	 try
	   {
		Boolean el = dr.findElement(By.xpath(".//*[@id='popupcontainer']/div[4]/div/ul/li[2]/a")).isEnabled();
		System.out.println(el);
	   }
	 catch(Exception e)
		{
		  dr.switchTo().alert().accept();
		}
	 
	 CR("DNC Registry");
	 GODate("21","Feb","2016");
	 SaveNProceed();
	 Thread.sleep(1000);
	 String caseid=caseid();
	 System.out.println("Case Id :"+" "+caseid);
	 String assignedto=assignedto();
	 System.out.println("Assigned To :"+" "+assignedto);
	 String status=status();
	 System.out.println("Case Status :"+" "+status);
	 String SubStatus=substatus();
	 System.out.println("Case sub status :"+" "+SubStatus);
	 logout();
	 String abc= con.querry("select loginid from az_user where UserID=(select CurrentOwnerID from cases where caseid="+caseid+")");
	 System.out.println("assignee by db "+abc);
	 
	 username(abc); 
	 password("acid_qa");
	 login1();
	 Ticketsearchlink1();
	 EnterTcktNum(caseid);
	 fetchButton();
	 Validate();
	 edit();
	 scrutinySection();
	 CD("Not Applica");
	 RCAType("Asking for interest");
	 RCAComment("comments by scrutiny");
	 DNCRequest();
	 IRDAProblem();
	 save1();
	 Thread.sleep(2000);
	 String assignedto1=assignedto();
	 while(assignedto1.equalsIgnoreCase(assignedto))
	 {
		 dr.navigate().refresh();
		 Thread.sleep(2000);
		 assignedto1=assignedto();
	 }
	 assignedto=assignedto1;
	 System.out.println("Assigned To :"+" "+assignedto);
	 status=status();
	 System.out.println("Case Status :"+" "+status);
	 SubStatus=substatus();
	 System.out.println("Case sub status :"+" "+SubStatus);
	 logout();
	 abc= con.querry("select loginid from az_user where UserID=(select CurrentOwnerID from cases where caseid="+caseid+")");
	 System.out.println("assignee by db "+abc);
	 
	 username(abc); 
	 password("acid_qa");
	 login1();
	 Ticketsearchlink1();
	 EnterTcktNum(caseid);
	 fetchButton();
	 Validate();
	 Thread.sleep(4000);
	 status=status();
	 System.out.println("Case Status :"+" "+status);
	 SubStatus=substatus();
	 System.out.println("Case sub status :"+" "+SubStatus);
	 while(status.equalsIgnoreCase("Acknowledged"))
	 {
		Thread.sleep(5000);
	 	dr.navigate().refresh();
	 	System.out.println("in status if..");
	 	status=status();
	 	System.out.println("Case Status :"+" "+status);
		SubStatus=substatus();
		System.out.println("Case sub status :"+" "+SubStatus);
	 }
	 Thread.sleep(10000);
	 System.out.println("before edit");
	 edit();
	 CaseOwnerSection();
	 acceptancestatus();
	 Resolutionus();
	 IsForwarding();
	 ResolutionBy();
	 resolutionComments("comments by non-grv");
	 CaseOwner.CaseOwnerSave.sendKeys(Keys.ENTER);
	 Thread.sleep(1000);
	 status=status();
	 System.out.println("Case Status :"+" "+status);
	 SubStatus=substatus();
	 System.out.println("Case sub status :"+" "+SubStatus);
 }
}
//complete.............