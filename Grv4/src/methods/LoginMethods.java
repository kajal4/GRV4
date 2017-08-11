package methods;

import pom.LoginObjects;
import connectivity.InitBrowser;

public class LoginMethods extends InitBrowser
{
   public void username(String ar)
   {
	   LoginObjects.UserName.sendKeys(ar);
   }
   
   public void password(String ar)
   {
	   LoginObjects.Password.sendKeys(ar);
   }
   
   public void login1()
   {
	   LoginObjects.Login.click();
   }
   
   public void logout()
   {
	   LoginObjects.LogOut.click();
   }
}
