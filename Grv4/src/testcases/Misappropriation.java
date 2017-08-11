package testcases;

import java.sql.SQLException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import pom.CaseOwner;
import connectivity.TestConnectivity;
import methods.ForwardeeMethods;

public class Misappropriation extends ForwardeeMethods
{
	@Test 
	public void Misapprop() throws InterruptedException, SQLException
	{
		 JavascriptExecutor jse = (JavascriptExecutor)dr;
		 TestConnectivity con =  new TestConnectivity();
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
		 SSC("Miss-selling / Fraud by Agent");
		 Nextbtn();
		 CR("Misappropriation of Premium");
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
		 jse.executeScript("window.scrollBy(0,2500)","");
		 edit();
		 scrutinySection();
		 CD("Misappropriation of premiums");
		 RCAType("Asking for interest");
		 RCAComment("comments by scrutiny");
		 GOSearch();
		 GOCode();
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
		 jse.executeScript("window.scrollBy(0,2500)","");
		 edit();
		 CaseOwnerSection();
		 premium();
		 history();
		 delay();
		 wrong();
		 Recovery();
		 save1();         
		 Thread.sleep(2000);
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
		 jse.executeScript("window.scrollBy(0,2500)","");
		 edit();
		 supervisorcomment();
		 supervisordecision("Approved");
		 save1();
		 Thread.sleep(2000);
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
		 jse.executeScript("window.scrollBy(0,2500)","");
		 edit();
	     approverComment();
	     approverDecision();
	     save1();
	     assignedto=assignedto();
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
		 jse.executeScript("window.scrollBy(0,2500)","");
		 edit();
	     forwardeeSection();
	     forwardeeComment();
	     forwardeeDecision();
	     save1();
	     Thread.sleep(2000);
		 assignedto=assignedto();
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
		 jse.executeScript("window.scrollBy(0,2500)","");
		 edit();
		 CaseOwnerSection();
		 acceptancestatus();
		 Resolutionus();
		 IsForwarding();
		 Thread.sleep(4000);
		 ResolutionBy();
		 resolutionComments("comments by grv");
		 CaseOwnerIRDA();
		 Thread.sleep(4000);
		 CaseOwner.CaseOwnerSave.sendKeys(Keys.ENTER);

		 Thread.sleep(1000);
		 status=status();
		 System.out.println("Case Status :"+" "+status);
		 SubStatus=substatus();
		 System.out.println("Case sub status :"+" "+SubStatus);
		 
	}
}

// completed
