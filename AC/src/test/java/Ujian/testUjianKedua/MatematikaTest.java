package Ujian.testUjianKedua;
import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Latihan.latihanGenerate.*;
import Ujian.ujianKedua.Matematika;

public class MatematikaTest {
	
	Matematika mat;
	Random rm = new Random();
	DataGenerate dg = new DataGenerate();
	int loopbeff = 1;
	int loopaf = 1;
	
	@BeforeClass
	public void instance() {
		System.out.println();
		mat= new Matematika();
		System.out.println("=============================================");
		System.out.println("Mulai Lakukan Testing Class Matematika");
		System.out.println(" ");
		System.out.println("=============================================");
		
	}
	
	@BeforeMethod
	public void befmet() {
		System.out.println("=============================================");
		System.out.println(" ");
		System.out.println("Ini adalah Before Method  yang ke " + loopbeff);
		System.out.println(" ");
		System.out.println("=============================================");
		loopbeff++;
	}

  @Test(priority=0)
  public void addATest() {
	  int a = 1;
	  int b = 10;
	  int x = dg.intRdm(a, b);
	  int y = dg.intRdm(a, b);
	  System.out.println("ini adalah nilai a penambahan = " +x);
	  System.out.println("ini adalah nilai b penambahan = " +y);
	  System.out.println(" ");
	  System.out.println("Ini adalah Test Case Penjumlahan");
	  System.out.println(" ");
	  assertEquals(mat.addActual(x, y),(mat.addExpect(x, y))," KEDUA DATA TIDAK COCOK ");
  }
  
  @Test(priority=1)
  public void minusTest() {
	  int a = 1;
	  int b = 10;
	  int x = dg.intRdm(a, b);
	  int y = dg.intRdm(a, b);
	  System.out.println("ini adalah nilai a pengurangan = " +x);
	  System.out.println("ini adalah nilai b pengurangan = " +y);
	  System.out.println(" ");
	  System.out.println("Ini adalah Test Case Pengurangan");
	  System.out.println(" ");
	  assertEquals(mat.minusActual(x, y),(mat.minusExpect(x, y))," KEDUA DATA TIDAK COCOK ");
  }


  @Test(priority=2)
  public void divisionTest() {
	  int a = 1;
	  int b = 10;
	  int x = dg.intRdm(a, b);
	  int y = dg.intRdm(a, b);
	  System.out.println("ini adalah nilai a pembagian = " +x);
	  System.out.println("ini adalah nilai b pembagian = " +y);
	  System.out.println(" ");
	  System.out.println("Ini adalah Test Case Pembagian");
	  System.out.println(" ");
	  assertEquals(mat.divisionActual(x, y),(mat.divisionExpect(x, y))," KEDUA DATA TIDAK COCOK ");
  }

  
  @Test(priority=3)
  public void modulusTest() {
	  int a = 1;
	  int b = 10;
	  int x = dg.intRdm(a, b);
	  int y = dg.intRdm(a, b);
	  System.out.println("ini adalah nilai a modulus = " +x);
	  System.out.println("ini adalah nilai b modulus = " +y);
	  System.out.println(" ");
	  System.out.println("Ini adalah Test Case Modulus");
	  System.out.println(" ");
	  assertEquals(mat.modulusActual(x, y),(mat.modulusExpect(x, y))," KEDUA DATA TIDAK COCOK ");
  }
  
	@AfterClass
	public void aft() {
		System.out.println();
		mat= new Matematika();
		System.out.println("Selesai Lakukan Testing Class Matematika" );
		System.out.println(" ");
		System.out.println("=============================================");
		
	}
  
 
 
  
 
}
