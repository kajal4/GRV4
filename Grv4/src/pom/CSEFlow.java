package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CSEFlow extends LoginObjects
{

	public CSEFlow(WebDriver dr) 
	{
		super(dr);
	}

	@FindBy(id="Cas_ex1_22")
	public static WebElement CallerType;
	
	@FindBy(id="Cas_ex1_38")
	public static WebElement CallerName;
	
	@FindBy(id="SubCategory1")
	public static WebElement SSC;
	
	@FindBy (xpath="//body[contains(@class,'cke_editable cke_editable_themed cke_contents_ltr cke_show_borders')]")
	public static WebElement ProblemBox;

	@FindBy(xpath=".//*[@id='popupcontainer']/div[4]/div/ul/li/a")
	public static WebElement Next;
	
	@FindBy(id="CAS_EX3_28")
	public static WebElement CR;
	
	@FindBy(xpath=".//*[@id='collap-on1_11']/div[1]/div[1]/div/div/div/img")
	public static WebElement Calendar;
	
	@FindBy(xpath=".//*[contains(@class,'ui-datepicker-year')]")
	public static WebElement Year;

	@FindBy(xpath=".//*[contains(@class,'ui-datepicker-month')]")
	public static WebElement Month;
	
	@FindBy(xpath=".//*[@id='ui-datepicker-div']/table/tbody/tr/td/a")
	public static WebElement Dates;
	
	@FindBy(xpath=".//*[@id='popupcontainer']/div[4]/div/ul/li[2]/a")
	public static WebElement SaveandProceed;
	
	@FindBy(xpath=".//*[@id='collap-on1_1']/div[1]/div[1]/label")
	public static WebElement Header;
	
	@FindBy(xpath=".//*[@id='collap-on1_1']/div[1]/div[1]/div")
	public static WebElement CaseId;
	
	@FindBy(xpath=".//*[@id='collap-on1_1']/div[2]/div[2]/div")
	public static WebElement AssignedTo;
	
	@FindBy(xpath=".//*[@id='divContents']/div[1]/div[3]/div[3]/span")
	public static WebElement status;
	
	@FindBy(xpath=".//*[@id='divContents']/div[1]/div[3]/div[2]/span")
	public static WebElement substatus;
	
	@FindBy (xpath=".//*[@id='XMLField_35051']")
	public static WebElement TOC;
	
	@FindBy (xpath=".//*[@id='HtmlText_24598']")
	public static WebElement conversation;
	
	@FindBy (xpath=".//*[@id='XMLField_35053']")
	public static WebElement callNumber;
	
	@FindBy (xpath=".//*[@id='XMLField_35054']")
	public static WebElement csTeam;
	
	@FindBy (xpath=".//*[@id='XMLField_35055']")
	public static WebElement receiverName;
	
	@FindBy (xpath=".//*[@id='XMLField_35056']")
	public static WebElement receiverNumber;
	
	@FindBy (xpath=".//*[@id='XMLField_35057']")
	public static WebElement payment;
	
	@FindBy (xpath="//ul[contains(@class,'ui-timepicker-list')]/li[5]")
	public static WebElement Toc1;
	
	@FindBy(id="Cas_ex5_65")
	public static WebElement oldPolicyNum;
	
	@FindBy(id="cas_ex9_6")
	public static WebElement newPolicyNum;
	
	@FindBy(id="cas_ex6_28")
	public static WebElement amtToTransfer;
	
	@FindBy(id="CAS_EX3_51")
	public static WebElement PTFReason;
	
	@FindBy(id="Cas_ex4_44")
	public static WebElement GOTime;
	
	@FindBy(id="23546_pickPhoto")
	public static WebElement PTFFormSelect;
	
	@FindBy(id="23546")
	public static WebElement PTFFormUpload;
	
	@FindBy(id="23539_pickPhoto")
	public static WebElement CustomerLetterSelect;
	
	@FindBy(id="23541_pickPhoto")
	public static WebElement ProofOfPaymentSelect;
	
	@FindBy(id="23541")
	public static WebElement ProofOfPaymentUpload;
	
	@FindBy(id="23539")
	public static WebElement CustomerLetterUpload;
	
	@FindBy(xpath="html/body/div[3]/ul/li[4]")
	public static WebElement GOTimeSlot;
	
	@FindBy(id="Cas_ex5_64")
	public static WebElement InterOldPolicyNum;
	
	@FindBy(id="cas_ex8_48")
	public static WebElement InterNewPolicyNum;
	
	@FindBy(id="Cas_ex4_79")
	public static WebElement InterIsTransfer;
	
	@FindBy(id="cas_ex8_53")
	public static WebElement RefundChequeStatus;
	
	@FindBy(id="cas_ex6_59")
	public static WebElement InterAmt;
	
	@FindBy(id="cas_ex6_27")
	public static WebElement InterAmtToTransfer;
	
	@FindBy(id="cas_ex6_61")
	public static WebElement InterPTFReason;
	
	@FindBy(xpath=".//*[@id='cas_ex6_62imgpick']/i")
	public static WebElement InterPTFRequestedBy;
	
	@FindBy(id="iv_0")
	public static WebElement InterPTFRequestedByUser;
	
	@FindBy(xpath=".//*[@id='cas_ex6_63imgpick']/i")
	public static WebElement InterPTFApprovedBy;
	
	@FindBy(id="iv_0")
	public static WebElement InterPTFRApprovedByUser;
	
	@FindBy(xpath=".//*[@id='collap-on1_9']/div[6]/div[1]/div/div/div/i")
	public static WebElement InterRequestedDate;
	
	@FindBy(xpath=".//*[@id='collap-on1_9']/div[6]/div[2]/div/div/div/i")
	public static WebElement InterApprovedDate;
	
	@FindBy(id="Cas_ex5_78")
	public static WebElement RefundMethod;
	
	@FindBy(xpath=".//*[@id='ui-id-12']")
	public static WebElement AutopopulatedSSC;
	
	@FindBy(id="cas_ex8_97")
	public static WebElement SameAsIngenium;
	
	@FindBy(id="Cas_ex3_81")
	public static WebElement AccountHolderName;
	
	@FindBy(id="Cas_ex3_23")
	public static WebElement AccountNo;
	
	@FindBy(id="cas_ex6_89")
	public static WebElement AccountType;
	
	@FindBy(id="Cas_ex3_71")
	public static WebElement BankName;
	
	@FindBy(id="Cas_ex3_67")
	public static WebElement IFSC;
	
	@FindBy(id="Cas_ex3_70")
	public static WebElement MICR;
	
	@FindBy(id="23542_pickPhoto")
	public static WebElement NEFTFormSelect;
	
	@FindBy(id="23542")
	public static WebElement NEFTFormUpload;
	
	@FindBy(id="ui-id-22")
	public static WebElement AutoPopulateCD;
	
}
