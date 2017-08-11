package testcases;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import connectivity.TestConnectivity;
import methods.ForwardeeMethods;

public class ByNEFT extends ForwardeeMethods
{
  @Test
  public void RefundByNEFT() throws InterruptedException, IOException, SQLException
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
		 CR("Cancellation and Refund");
		 NEFTForm();
		 RefundMethod("By NEFT");  
		 sameAsIngenium("No");
		 accountHolderName("kajali");
		 accountNo("1234567890");
		 accountType();
		 bankName("hdfc");
		 IFSC("UTIB0000359");
		 MICR("281211002");
		
		 
		 GODate("21","Feb","2016");
		 GOTime();
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
		 jse.executeScript("window.scrollBy(0,2600)","");
		 
		 edit();
		 scrutinySection();
		 refundReason();
		 accountFrom();
//		 when automatch is yes
		 ScrutinyAccHolderName("kajal");
		 ScrutinyAccNum("1234567898");
		 ScrutinyAccType();
		 ScrutinyBankName("icici");
		 ScrutinyIFSC("UTIB0000396");
		 ScrutinyMICR("281211000");
		 
		 CD("Tamper");
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
		 jse.executeScript("window.scrollBy(0,2500)","");
		 edit();
  }
}
