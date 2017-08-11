package connectivity;

import java.sql.SQLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

import pom.CSEFlow;
import pom.CaseOwner;
import pom.Forwardee;
import pom.LoginObjects;
import pom.Policy360;
import pom.PolicySearch;
import pom.ScrutinyFlow;
import pom.TicketSearch;

public class InitBrowser
{
public static WebDriver dr=null;

@BeforeTest
public void browser() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException
{
	// Browser Initialization
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kajali Agrawal\\Desktop\\chromedriver.exe");
	ChromeOptions option = new ChromeOptions();
	option.addArguments("start-maximized");
	dr= new ChromeDriver (option);
	dr.get("http://maxprodsa/sn/app/Login/Login");
	

	// Object Initialization
	
	new LoginObjects(dr);
	new PolicySearch(dr);
	new TicketSearch(dr);
	new Policy360(dr);
	new CSEFlow(dr);
	new ScrutinyFlow(dr);
	new CaseOwner(dr);
	new Forwardee(dr);
}
}
