package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Policy360 extends LoginObjects
{

	public Policy360(WebDriver dr) 
	{
		super(dr);
		
	}

	@FindBy(id="flowIconId")
	public static WebElement journeyBtn;
	
	@FindBy(xpath="//div[contains(@title,'Customer Service Request Final')]")
	public static WebElement cseflow;
	
//	@FindBy(id="flowIconId")
//	public static WebElement journeyBtn;
}
