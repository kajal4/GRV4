package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PolicySearch extends LoginObjects
{

	public PolicySearch(WebDriver dr)
	{
		super(dr);
		
	}

 @FindBy(xpath=" .//*[@id='js-vnav']/li[2]/a/i/span")
 public static WebElement quicklink;
 
 @FindBy (xpath=".//*[@id='js-vnav']/li[2]/div/div[2]/ul/li[3]/a/span")
 public static WebElement searchPolicy;
 
 @FindBy (id="m_c_vf_10057166_txt")
 public static WebElement policyNumber;
 
 @FindBy(id="m_c_btnFetch")
 public static WebElement FetchButton;
 
 @FindBy (id="m_c_vf_chk10057166")
 public static WebElement policyNumCheck;
 
 @FindBy (id="m_c_vf_chk23092")
 public static WebElement clientIdCheck;
 
 @FindBy (id="m_c_vf_chk21863")
 public static WebElement DOB;
 
 @FindBy (id="m_c_btnv")
 public static WebElement BtnValidate;
 
 @FindBy(id="btnok")
 public static WebElement Continue;
 
}
