package Latihan.restassured;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class SampleTestAssured {
	
	JSONObject req;//ngeset data json objek dari body
	
	@BeforeTest

	public void befTest()
	{
		req=new JSONObject();
		baseURI = "http://localhost:3000";
	}
	
	@Test(priority=0)
	public void testPost()
	{
		req.put("first_name", "Manda");
		req.put("last_name", "cathartica");
		req.put("subject_id", 1);
		
		req.put("first_name", "linda");
		req.put("last_name", "sarta");
		req.put("subject_id", 4);
		
		given().//nge hide base ulr yang udh dikasih, untuk ngeset kebutuhnnya
			header("Content-Type", "application/json").
			accept(ContentType.JSON).
			contentType(ContentType.JSON).
			body(req.toJSONString()).
		when().
			post("/users").//alamat post nya
		then().
			statusCode(200).
			log().
			all();
	}
	
	@Test(priority=1)
	public void testGet()
	{
		given().
		param("first_name", "Alamanda").
		get("/users").then().statusCode(200).log().all();
	}
	
	@Test(priority=2)
	public void testPatch()
	{
		req.put("first_name", "Alamanda");
		
		
		given().//lampirkan
			header("Content-Type", "application/json").
			accept(ContentType.JSON).
			contentType(ContentType.JSON).
			body(req.toJSONString()).
		when().
			patch("/users/3").
		then().
			statusCode(200).
			log().
			all();
	}
	
	@Test(priority=3)
	public void testPut()
	{
		req.put("first_name", "ACF");
		req.put("subject", "2");
		
		
		given().//lampirkan
			header("Content-Type", "application/json").
			accept(ContentType.JSON).
			contentType(ContentType.JSON).
			body(req.toJSONString()).
		when().
			put("/users/3").
		then().
			statusCode(200).
			log().
			all();
	}
	
	@Test(priority=4)
	public void testDelete()
	{
		when().
		delete("/users/4").then().statusCode(200).log().all();
	}

}
