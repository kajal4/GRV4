package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Forwardee extends LoginObjects
{

	public Forwardee(WebDriver dr)
	{
		super(dr);
	}

	@FindBy(xpath="//p[contains(@title,'Forwardee Section')]")
	public static WebElement ForwardeeSection;
	
	@FindBy(id="HtmlText_24594")
	public static WebElement Forwardee1Comment;
	
	@FindBy(id="cas_ex10_11")
	public static WebElement Forwardee1Decision;
	
	@FindBy(id="XMLField_35087")
	public static WebElement SupervisorComment;
	
	@FindBy(id="CAS_EX5_51")
	public static WebElement SupervisorDecision;
	
	@FindBy(id="XMLField_35085")
	public static WebElement UnderWriterComment;
	
	@FindBy(id="Cas_ex2_91")
	public static WebElement UnderWriterDecision;
	
	@FindBy(xpath="//div[contains(@class,'object-action-btn')]/ul[1]/li[2]/a")
	public static WebElement FICUSave;
	
	@FindBy(id="cas_ex10_89")
	public static WebElement approverComment;
	
	@FindBy(id="cas_ex10_88")
	public static WebElement approverRCA;
	
	@FindBy(xpath=".//*[@id='cas_ex6_94imgpick']/i")
	public static WebElement policyStatusSearch;
	
	@FindBy(id="TxtSearch")
	public static WebElement policyStatusText;
	
	@FindBy(id="iv_0")
	public static WebElement policyStatus;
	
	@FindBy(id="Cas_ex5_54")
	public static WebElement policyNum;
	
	@FindBy(id="Cas_ex4_34")
	public static WebElement GOApproverDecision;
	
	@FindBy(id="HtmlText_24595")
	public static WebElement forwardee2Commnets;
	
	@FindBy(id="cas_ex10_35")
	public static WebElement forwardee2Decision;
	
	@FindBy(xpath=".//*[@id='collap-on1_15']/div[2]/div[2]/div")
	public static WebElement NTUResult;
	
	@FindBy(id="cas_ex7_63")
	public static WebElement ManualNTU;
	
	@FindBy(id="cas_ex10_64")
	public static WebElement IsSucessIngenium;
	
	@FindBy(id="Cas_ex5_97")
	public static WebElement AmtToTransfer;
}
