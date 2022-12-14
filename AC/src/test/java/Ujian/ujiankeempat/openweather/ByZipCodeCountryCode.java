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

public class ByZipCodeCountryCode {
	
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
		String sheetName = "ByZipCodeCountryCode";
		excelReader = new ExcelReader(excelPath, sheetName);
		intRowNums = excelReader.getRowCount();
		intColumnNums = excelReader.getColCount();
	}
	
	@DataProvider(name = "DataProviderFirst")
	public Object[][] dataDrivenGet()
	{
		
		dDriven = new Object[intRowNums][intColumnNums];
		
		Iterator<Row> readExcel = excelReader.getIter();
		int jmlBaris=0;
		int urutanNumber =1;
		while(readExcel.hasNext())
		{
			System.out.println("");
			System.out.println("Data Ke-"+urutanNumber);
			Row rows = readExcel.next();
			for(int j=0;j<intColumnNums;j++)
			{
				
				dDriven[jmlBaris][j] = excelReader.getCellData(jmlBaris, j);
				if( j==0) {
					System.out.println("ZIP : "+dDriven[jmlBaris][j]);
				}else {
					System.out.println("Country Code: "+dDriven[jmlBaris][j]);
				}
			}
			System.out.println("=========================");
			jmlBaris++;
			urutanNumber++;
		}
		
		return dDriven;		
	}
	
	@Test(priority = 0,dataProvider="DataProviderFirst")
	public void testGet(String zip, String code)
	{		
		given().
		param("zip", zip+","+code).and().
		param("appid", "3def9748479d0cb1922243d6fb8fef7a").
		when().
		get("/data/2.5/weather").
		then().
		statusCode(200).log().all();
	}

}
