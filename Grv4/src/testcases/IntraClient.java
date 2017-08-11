package testcases;

import java.io.IOException;
import java.sql.SQLException;

import methods.ForwardeeMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import connectivity.TestConnectivity;

public class IntraClient extends ForwardeeMethods 
{
 @Test
  public void cancellationNtransferIntra() throws InterruptedException, IOException, SQLException
 {
	 JavascriptExecutor jse = (JavascriptExecutor)dr;
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
	 CR("Cancellation and Transfer Intra client");
	 GODate("21","Feb","2016");
	 GOTime();
	 oldPolicyNum();
	 newPolicyNum();
	 amtToTransfer1();
	 PTFReason();
	 PTFFormSelect();
	 PTFFormUpload();
	 CustomerLetterSelect();
	 CustLetterUpload();
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
	 jse.executeScript("window.scrollBy(0,2700)", "");
	 edit();
	 scrutinySection();
	 CD("tampering");
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
	 System.out.println("Case Status :"+" "+status);
	 SubStatus=substatus();
	 System.out.println("Case sub status :"+" "+SubStatus);
	 jse.executeScript("window.scrollBy(0,2700)", "");
	 edit();
	 CaseOwnerSection();
	 Thread.sleep(2000);
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
	 jse.executeScript("window.scrollBy(0,2700)", "");
	 edit();
	 supervisorcomment();
	 supervisordecision("Approved");
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
	 jse.executeScript("window.scrollBy(0,2700)", "");
	 edit();
	 
	 approverComment();
	 approverDecision();
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
	 jse.executeScript("window.scrollBy(0,2700)", "");
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
	 jse.executeScript("window.scrollBy(0,2700)", "");
	 resolutionLetter();
	 jse.executeScript("window.scrollBy(0,2700)", "");
	 edit();
	 CaseOwnerSection();
	 acceptancestatus();
	 Resolutionus();
	 IsForwarding();
	 ResolutionBy();
	 resolutionComments("resolution comments...");
	 CaseOwnerIRDA();
	 save1();
	 Thread.sleep(2000);
	 assignedto=assignedto();
	 System.out.println("Assigned To :"+" "+assignedto);
	 status=status();
	 System.out.println("Case Status :"+" "+status);
	 SubStatus=substatus();
	 System.out.println("Case sub status :"+" "+SubStatus);
 }
}

// complete
