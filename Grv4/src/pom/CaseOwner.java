package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CaseOwner extends LoginObjects
{

	public CaseOwner(WebDriver dr)
	{
		super(dr);
	}

	@FindBy (xpath="//p[contains(@title,'Case Owner Comments')]")
	public static WebElement CaseOwnerSection;
	
	@FindBy(id="Cas_ex4_43")
	public static WebElement AcceptanceStatus;
	
	@FindBy(id="Cas_ex1_67")
	public static WebElement Resolution_us6;
	
	@FindBy(id="cas_ex8_57")
	public static WebElement IsForwarding;
	
	@FindBy(id="Cas_ex1_40")
	public static WebElement ResolutionBy;
	
	@FindBy(xpath="//body[contains(@class,'cke_editable cke_editable_themed cke_contents_ltr cke_show_borders')]")
	public static WebElement ResolutionComment;
	
	@FindBy(id="cas_ex6_68")
	public static WebElement RequiredPremium;
	
	@FindBy(id="Cas_ex5_95")
	public static WebElement CaseHistory;
	
	@FindBy(id="cas_ex9_65")
	public static WebElement delay;
	
	@FindBy(id="cas_ex9_66")
	public static WebElement wentwrong;
	
	@FindBy(id="XMLField_24747")
	public static WebElement recovery;
	
	@FindBy(id="cas_ex6_67")
	public static WebElement CaseOwnerIRDA;
	
	@FindBy(xpath=".//*[@class='object-action-btn']/ul/li[2]/a")
	public static WebElement CaseOwnerSave;
	
	@FindBy(id="cust_50252")
	public static WebElement resolutionLetter;
	
	@FindBy(id="m_bs_btnSave")
	public static WebElement resolutionLetterSave;
	
}
