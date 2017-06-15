package service;

import org.json.JSONException;
import org.testng.annotations.Test;

public class Basetest  extends ApiInvokeService
{
	 @Test
	  public void findUsersByAppDomainAndEmail()
	 {	
		 try {
			getRequestFindCapital();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	 }
}
