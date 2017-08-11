package testcases;

import java.sql.SQLException;

import methods.ForwardeeMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import connectivity.TestConnectivity;

public class PlanChange extends ForwardeeMethods
{
@Test
public void planchange() throws InterruptedException, SQLException 
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
	 CR("Plan Change");
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
	 JavascriptExecutor jse = (JavascriptExecutor)dr;
	 jse.executeScript("window.scrollBy(0,2500)","");
	 edit();
	 scrutinySection();
	 CD("tampering");
	 RCAType("Asking for interest");
	 RCAComment("comments by scrutiny");
	 IRDAProblem();
	 incorrectinfo();
	 correctinfo();
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
	 jse.executeScript("window.scrollBy(0,2500)","");
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
	 jse.executeScript("window.scrollBy(0,2500)","");
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
	 jse.executeScript("window.scrollBy(0,2500)","");
	 edit();
     forwardeeSection();
     forwardeeComment();
     forwardeeDecision();
     policynum();
     policystatus();
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
	 save1();
	 Thread.sleep(1000);
	 status=status();
	 System.out.println("Case Status :"+" "+status);
	 SubStatus=substatus();
	 System.out.println("Case sub status :"+" "+SubStatus);
	 
}

}

//complete.............
