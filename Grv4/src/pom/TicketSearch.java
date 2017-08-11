package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TicketSearch extends LoginObjects
{
	public TicketSearch(WebDriver dr) 
	{
		super(dr);
	}

	@FindBy(xpath=".//*[@id='js-vnav']/li[2]/div/div[2]/ul/li[2]/a/span")
	public static WebElement TicketSearchLink;
	
	@FindBy(id="m_c_vf_10005762_txt")
	public static WebElement TicketNum;
	
	
	
}
