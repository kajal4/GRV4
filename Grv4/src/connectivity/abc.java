package connectivity;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class abc 
{
  static java.sql.Connection con= null;
  private static java.sql.Statement stmt;
  public static String DB_URL= "jdbc:msql://192.168.0.26:1433;database=Max_Uno_Gold_SA";
  public static String DB_USER = "crmnext";
  public static String DB_PASSWORD = "abc123";
  public static String database="Max_Uno_Gold_SA";
  @BeforeMethod
  public void setup()
  {
	  try
	  {
		  String dbClass = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		  Class.forName(dbClass).newInstance();
		  con=DriverManager.getConnection("jdbc:sqlserver://192.168.0.26:1433;user=crmnext;password=abc123;database=Max_Uno_Gold_SA");
          System.out.println("Database sucessfully connected.");
		  stmt = con.createStatement();
	  }
	  catch(Exception e)
	  {
		  System.out.println("first catch");
		  e.printStackTrace();
	  }
  }
  @Test
  public void querry(String ar)
  {
	  try
	  {
		  String query= ar;
		  ResultSet res = stmt.executeQuery(query);
		  ResultSetMetaData rsMetaData = res.getMetaData();
	      int numberOfColumns = rsMetaData.getColumnCount();
	      for(int i = 1; i <= numberOfColumns; i++)
          {
               System.out.print(rsMetaData.getColumnLabel(i) + " ");
          }
	      System.out.println();
          while (res.next())
          {
               for(int e = 1; e <= rsMetaData.getColumnCount(); e++)
            {
             System.out.print(res.getString(e) + " ");
            }
           System.out.println();
          }
	  }
	  catch(Exception e)
	  {
		  System.out.println("second catch");
		  e.printStackTrace();
	  }
	  {
		  
	  }
  }
 
  @AfterMethod
  public void teardown () throws SQLException
  {
	  if(con!=null)
	  {
		  con.close();
	  }
  }
}
