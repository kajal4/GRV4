package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginObjects 
{
  public LoginObjects(WebDriver dr)
  {
	 PageFactory.initElements(dr, this);	  
  }
  
  @FindBy(id="TxtName")
  public static WebElement UserName;
  
  @FindBy(id="TxtPassword")
  public static WebElement Password;
  
  @FindBy(xpath=".//*[@id='registration']/ul/li[5]/input")
  public static WebElement Login;
  
  @FindBy(xpath="//a[contains(@title,'Logout')]")
  public static WebElement LogOut;
}
