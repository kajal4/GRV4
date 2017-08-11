package testcases;

import java.sql.SQLException;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import pom.CaseOwner;
import connectivity.TestConnectivity;
import methods.ForwardeeMethods;

public class GRV4_TS002 extends ForwardeeMethods
{
  @Test
  public void Spurious1() throws InterruptedException, SQLException
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
		 CR("Spurious Call/ Hoax Call");
		 toc();
		 conversation();
		 callNo();
		 csTeam();
		 Receiver();
		 ReceiverNo();
		 payment();
		 
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
		 CD("Spurious calls Or Hoax Calls");
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
		 edit();
		 
		 Thread.sleep(1000);
		 forwardeeSection();
		 forwardeeComment();
		 Thread.sleep(5000);
		 forwardeeDecision();
		 CaseOwner.CaseOwnerSave.sendKeys(Keys.ENTER);
         System.out.println("after save......");
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
		 edit();
		 CaseOwnerSection();
		 acceptancestatus();
		 Resolutionus();
		 IsForwarding();
		 ResolutionBy();
		 resolutionComments("comments by grv");
		 CaseOwnerIRDA();
		 CaseOwner.CaseOwnerSave.sendKeys(Keys.ENTER);
		 Thread.sleep(1000);
		 status=status();
		 System.out.println("Case Status :"+" "+status);
		 SubStatus=substatus();
		 System.out.println("Case sub status :"+" "+SubStatus);
		 
		 
  }
}
// complete..........
