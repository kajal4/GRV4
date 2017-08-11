package testcases;

import java.sql.SQLException;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import pom.CaseOwner;
import connectivity.TestConnectivity;
import methods.ForwardeeMethods;

public class Revival_Reinstatement extends ForwardeeMethods
{
 @Test
   public void Reinstatement() throws InterruptedException, SQLException
    {
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
	 CR("Revival / Reinstatement");
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
	 CD("Tampering");
	 RCAType("Asking for interest");
	 RCAComment("comments by scrutiny");
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
	 assignedto=assignedto();
	 System.out.println("Assigned To :"+" "+assignedto);
	 System.out.println("Case Status :"+" "+status);
	 SubStatus=substatus();
	 System.out.println("Case sub status :"+" "+SubStatus);
	 edit();
	 CaseOwnerSection();
	 CaseOwner.CaseOwnerSave.sendKeys(Keys.ENTER);
	 
	 assignedto=assignedto();
	 System.out.println("Assigned To :"+" "+assignedto);
	 status=status();
	 System.out.println("Case Status :"+" "+status);
	 SubStatus=substatus();
	 System.out.println("Case sub status :"+" "+SubStatus);
	 logout();
	 abc= con.querry("select loginid from az_user where UserID=(select CurrentOwnerID from cases where caseid="+caseid+")");
	 System.out.println("assignee by db "+ abc);
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
	 edit();
	 supervisorcomment();
	 supervisordecision("Approved");
	 CaseOwner.CaseOwnerSave.sendKeys(Keys.ENTER);
	 
	 assignedto=assignedto();
	 System.out.println("Assigned To :"+" "+assignedto);
	 status=status();
	 System.out.println("Case Status :"+" "+status);
	 SubStatus=substatus();
	 System.out.println("Case sub status :"+" "+SubStatus);
	 logout();
	 
	 abc= con.querry("select loginid from az_user where UserID=(select CurrentOwnerID from cases where caseid="+caseid+")");
	 System.out.println("assignee by db "+ abc);
	 
	 username(abc);
	 password("acid_qa");
	 login1();
	 Ticketsearchlink1();
	 EnterTcktNum(caseid);
	 fetchButton();
	 Validate();
	 Thread.sleep(4000);
	 status=status();
	 assignedto=assignedto1;
	 System.out.println("Assigned To :"+" "+assignedto);
	 System.out.println("Case Status :"+" "+status);
	 SubStatus=substatus();
	 System.out.println("Case sub status :"+" "+SubStatus);
	 edit();
	 underwritercomment();
	 underwriterdecision();
	 CaseOwner.CaseOwnerSave.sendKeys(Keys.ENTER);
	 
	 assignedto=assignedto();
	 System.out.println("Assigned To :"+" "+assignedto);
	 status=status();
	 System.out.println("Case Status :"+" "+status);
	 SubStatus=substatus();
	 System.out.println("Case sub status :"+" "+SubStatus);
	 logout();
	 
	 abc= con.querry("select loginid from az_user where UserID=(select CurrentOwnerID from cases where caseid="+caseid+")");
	 System.out.println("assignee by db "+ abc);
	 
	 username(abc);
	 password("acid_qa");
	 login1();
	 Ticketsearchlink1();
	 EnterTcktNum(caseid);
	 fetchButton();
	 Validate();
	 Thread.sleep(4000);
	 status=status();
	 assignedto=assignedto1;
	 System.out.println("Assigned To :"+" "+assignedto);
	 System.out.println("Case Status :"+" "+status);
	 SubStatus=substatus();
	 System.out.println("Case sub status :"+" "+SubStatus);
	 edit();
	 forwardeeSection();
	 forwardeeComment();
	 forwardeeDecision();
	 CaseOwner.CaseOwnerSave.sendKeys(Keys.ENTER);
	 
	 assignedto=assignedto();
	 System.out.println("Assigned To :"+" "+assignedto);
	 status=status();
	 System.out.println("Case Status :"+" "+status);
	 SubStatus=substatus();
	 System.out.println("Case sub status :"+" "+SubStatus);
	 logout();
	 
	 abc= con.querry("select loginid from az_user where UserID=(select CurrentOwnerID from cases where caseid="+caseid+")");
	 System.out.println("assignee by db "+ abc);
	 
	 username(abc);
	 password("acid_qa");
	 login1();
	 Ticketsearchlink1();
	 EnterTcktNum(caseid);
	 fetchButton();
	 Validate();
	 Thread.sleep(4000);
	 status=status();
	 assignedto=assignedto1;
	 System.out.println("Assigned To :"+" "+assignedto);
	 System.out.println("Case Status :"+" "+status);
	 SubStatus=substatus();
	 System.out.println("Case sub status :"+" "+SubStatus);
	 edit();
	 CaseOwnerSection();
	 acceptancestatus();
	 Resolutionus();
	 IsForwarding();
	 ResolutionBy();
	 resolutionComments("comments by grv");
	 CaseOwnerIRDA();
	 CaseOwner.CaseOwnerSave.sendKeys(Keys.ENTER);
	 status=status();
	 assignedto=assignedto1;
	 System.out.println("Assigned To :"+" "+assignedto);
	 System.out.println("Case Status :"+" "+status);
	 SubStatus=substatus();
	 System.out.println("Case sub status :"+" "+SubStatus);
	}
}

// complete
