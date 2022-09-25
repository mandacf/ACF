package Ujian.ujiankelima.testng;

import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestStringNumeric {
	
	String strInput = "";
    boolean bouNum = true;
    boolean bouCharacter = false;
	int intLongString =1;
	int loopTest = 1;
	int loopBefore = 1;
	int loopAfter = 1;
	StringToNumeric s;
	Random rand;
	
	@BeforeTest
	   public void beforeTest() {
		System.out.println("Test String To Numeric");
		s = new StringToNumeric();
		System.out.println("=======================================================");
		System.out.println(" ");
	   }
	
	@BeforeClass
	   public void beforeClass() {
		System.out.println("Ini Adalah Before Class ");
		System.out.println("=======================================================");
		System.out.println(" ");
	   }
	
	@BeforeMethod
	   public void beforeMethod() {
		System.out.println("Ini Adalah Before Method Ke : " + loopBefore);
		System.out.println("=========================================================");
		System.out.println(" ");
		loopBefore ++;	
	   }
	
	@Test(priority = 0)
	public void testParseToInt()
	{
		System.out.println("");
		rand = new Random();
		intLongString = rand.nextInt(5, 10);
		strInput = RandomStringUtils.random(intLongString, bouCharacter, bouNum);
		AssertJUnit.assertEquals(s.parseToIntActual(strInput), s.parseToIntExpect(strInput));
	}
	
	@Test(priority = 1)
	public void testParseToFloat()
	{
		System.out.println("");
		rand = new Random();
		intLongString = rand.nextInt(2, 10);
		strInput = RandomStringUtils.random(intLongString, bouCharacter, bouNum);
		AssertJUnit.assertEquals(s.parseToFloatActual(strInput), s.parseToFloatExpect(strInput));
	}
	
	@Test(priority = 2)
	public void testParseToDouble()
	{
		System.out.println("");
		rand = new Random();
		intLongString = rand.nextInt(5, 10);
		strInput = RandomStringUtils.random(intLongString, bouCharacter, bouNum);
		AssertJUnit.assertEquals(s.parseToDoubleActual(strInput), s.parseToDoubleExpect(strInput));
	}
	
	
	@AfterMethod
	   public void afterMethod() {
		 System.out.println("Ini Adalah After Method Ke : " + loopAfter);
		 System.out.println(" ");
		 System.out.println("===================================================");
		 loopAfter ++;
	   }
	 
	 @AfterClass
	   public void afterClass() {
		 System.out.println("Ini Adalah After Class");
		 System.out.println(" ");
		 System.out.println("====================================================");
	   }
	 
	 @AfterTest
	   public void afterTest() {
		 System.out.println("SELESAI !");
		 System.out.println(" ");
		 System.out.println("=====================================================");
	   }

}
