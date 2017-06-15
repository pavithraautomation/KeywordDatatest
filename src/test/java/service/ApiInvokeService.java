package service;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static com.jayway.restassured.RestAssured.get;

import java.io.IOException;

import org.testng.annotations.Test;
import org.json.JSONArray;
import org.json.JSONException;
import com.jayway.restassured.response.Response;

import test.we.Readfromexcel;

import org.testng.Assert;
public class ApiInvokeService
{
	@Test
	public void getRequestFindCapital() throws JSONException
	{
		Readfromexcel.readexcel();
		//make get request to fetch capital of norway
		Response resp = get("http://citydeals-app2300-staging.snc1:39128/bs/joineddealdetails/67?key=secretUUIDKeyForDevAndTestBackendService");
		
		//Fetching response in JSON
		JSONArray jsonResponse = new JSONArray(resp.asString());
		System.out.println(jsonResponse);
		
		//Fetching value of capital parameter
		String capital = jsonResponse.getJSONObject(0).getString("inventoryProductId");
		
		//Asserting that capital of Norway is Oslos
		AssertJUnit.assertEquals(capital, "819d9c36-55fc-4a5a-975c-5d2f917303bd");
	}
	
}


