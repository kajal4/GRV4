package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ScrutinyFlow extends LoginObjects
{

	public ScrutinyFlow(WebDriver dr) 
	{
		super(dr);
	}
 @FindBy (id="BTN_EDIT")
 public static WebElement Edit;
 
 @FindBy (xpath="//p[contains(@title,'Scrutiny')]")
 public static WebElement scrutinySection;
 
 @FindBy (xpath=".//*[@id='Cas_ex1_87']")
 public static WebElement CD;
 
 @FindBy (xpath=".//*[@id='XMLField_35278']")
 public static WebElement RCAType;
 
 @FindBy (xpath=".//*[@id='cas_ex6_72']")
 public static WebElement RCAComment;
 
 @FindBy (id="Cas_ex4_27")
 public static WebElement DNCRequest;
 
// @FindBy (xpath="//i[contains(@class,'icon icon-SaveProceed')]")
 @FindBy (xpath=".//*[@id='divContents']/div[3]/div/ul/li[2]/a")
 public static WebElement save1;
 
 
 
 @FindBy (id="HtmlText_24598")
 public static WebElement ConversationHeld;
 
 @FindBy (id="XMLField_35053")
 public static WebElement CallNo;
 
 @FindBy (id="XMLField_35054")
 public static WebElement CSETeam;
 
 @FindBy (id="XMLField_35055")
 public static WebElement ReceiverName;
 
 @FindBy (id="XMLField_35056")
 public static WebElement ReceiverNo;
 
 @FindBy (id="XMLField_35057")
 public static WebElement payment;
 
 @FindBy(id="cas_ex8_22imgpick")
 public static WebElement GoSearch;
 
 @FindBy(id="iv_0")
 public static WebElement GOCode;

 @FindBy(id="TxtSearch")
 public static WebElement txtsearch;
 
 @FindBy(id="Cas_ex4_32")
 public static WebElement IRDAProblem;
 
 @FindBy(id="cas_ex10_61")
 public static WebElement IncorrectInfo;
 
 @FindBy(id="cas_ex10_21")
 public static WebElement CorrectInfo;
 
 @FindBy(id="cas_ex10_12imgpick")
 public static WebElement RefundReasonPicker;
 
 @FindBy(id="cas_ex10_30")
 public static WebElement AccountFrom;
 
 @FindBy(id="cas_ex7_52")
 public static WebElement ScrutinyAccountHoldername;
 
 @FindBy(id="Cas_ex1_88")
 public static WebElement ScrutinyAccountNumber;
 
 @FindBy(id="cas_ex10_67")
 public static WebElement ScrutinyAccountType;
 
 @FindBy(id="Cas_ex5_89")
 public static WebElement ScrutinyBankName;
 
 @FindBy(id="Cas_ex3_65")
 public static WebElement ScrutinyIFSC;
 
 @FindBy(id="cas_ex7_54")
 public static WebElement ScrutinyMICR;
 
}
