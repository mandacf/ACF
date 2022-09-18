package Ujian.ujiankeempat.openweather;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Latihan.restassured.ExcelReader;

public class ByCityId {
	
	private ExcelReader excelReader;
	private Object [][] dDriven ;
	private int intColumnNums;
	private int intRowNums;
	private JSONObject req ;
	
	
	@BeforeTest
	public void befTest()
	{
		baseURI = "https://api.openweathermap.org/";
		req = new JSONObject();
		String excelPath = "C:\\Users\\NEXSOFT\\Documents\\ACF\\Ujian_Keempat\\RestAssured\\ACF_Ujian_Keempat.xlsx"; 
		String sheetName = "ByCityId";
		excelReader = new ExcelReader(excelPath, sheetName);
		intRowNums = excelReader.getRowCount();
		intColumnNums = excelReader.getColCount();
	}
	
	@DataProvider(name = "DataProviderFirst")
	public Object[][] dataDrivenGet()
	{
		
		dDriven = new Object[intRowNums][intColumnNums];
		
		Iterator<Row> r = excelReader.getIter();
		int a=0;
		int b =1;
		while(r.hasNext())
		{
			System.out.println("");
			System.out.println("Data Ke-"+b);
			Row rows = r.next();
			for(int j=0;j<intColumnNums;j++)
			{
				
				dDriven[a][j] = excelReader.getCellData(a, j);
				System.out.println("id = "+dDriven[a][j]);
			}
			System.out.println("=========================");
			a++;
			b++;
		}
		
		return dDriven;		
	}
	
	@Test(priority = 0,dataProvider="DataProviderFirst")
	public void testGet(String id)
	{		
		given().
		param("id", id).and().
		param("appid", "3def9748479d0cb1922243d6fb8fef7a").
		when().
		get("/data/2.5/weather").
		then().
		statusCode(200).log().all();
	}

}
