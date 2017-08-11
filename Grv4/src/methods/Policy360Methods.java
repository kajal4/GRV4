package methods;

import org.openqa.selenium.interactions.Actions;

import pom.Policy360;

public class Policy360Methods extends PolicyNTicketSearch
{
   public void cseflow()
   {
	   Actions action = new Actions(dr);
	   action.moveToElement(Policy360.journeyBtn).click().build().perform();
	   action.moveToElement(Policy360.cseflow).click().build().perform();

   }
}
