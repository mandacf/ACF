package Ujian.testUjianKedua;
import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Latihan.latihanGenerate.DataGenerate;
import Ujian.ujianKedua.Geometri;
public class GeometriTest {
	
	
	
	Geometri geo;
	Random rm = new Random();
	DataGenerate dg = new DataGenerate();
	int loopbeff = 1;
	int loopaf = 1;
	
	@BeforeClass
	public void instance() {
		System.out.println();
		geo= new Geometri();
		System.out.println("=============================================");
		System.out.println("Mulai Lakukan Testing Class Geometri");
		
	}
	
	@BeforeMethod
	public void befmet() {
		System.out.println("=============================================");
		System.out.println(" ");
		System.out.println("Ini adalah Before Method yang ke " + loopbeff);
		System.out.println(" ");
		System.out.println("=============================================");
		loopbeff++;
	}
	

  @Test(priority=0)
  public void luasPersegiTest() {
	  int x = 1;
		int y = 50;
		int luasPersegi = dg.intRdm(x, y);
	  System.out.println("ini adalah nilai luas persegi = " +luasPersegi);
	  System.out.println(" ");
	  System.out.println("Ini adalah Test Case Luas Persegi");
	  System.out.println(" ");
	  assertEquals(Geometri.luasPersegiActual(luasPersegi),(Geometri.luasPersegiExpect(luasPersegi))," KEDUA DATA TIDAK COCOK ");
  }


  @Test(priority=1)
  public void luasSegitigaTest() {
	  	int x = 1;
		int y = 50;
		int alas = dg.intRdm(x, y);
		int tinggi = dg.intRdm(x, y);
	  System.out.println("ini adalah nilai alas segitiga = " +alas);
	  System.out.println("ini adalah nilai tinggi segitiga = " +tinggi);
	  System.out.println(" ");
	  System.out.println("Ini adalah Test Case Luas Segitiga");
	  System.out.println(" ");
	  assertEquals(Geometri.luasSegitigaActual(alas, tinggi),(geo.luasSegitigaExpect(alas, tinggi))," KEDUA DATA TIDAK COCOK ");
  }


  @Test(priority=2)
  public void luasTrapesiumTest() {
	  	int x = 1;
		int y = 50;
		int a = dg.intRdm(x, y);
		int b = dg.intRdm(x, y);
		int t = dg.intRdm(x, y);
	  System.out.println("ini adalah nilai a trapesium = " +a);
	  System.out.println("ini adalah nilai b trapesium = " +b);
	  System.out.println("ini adalah nilai t trapesium = " +t);
	  System.out.println(" ");
	  System.out.println("Ini adalah Test Case Luas Trapesium");
	  System.out.println(" ");
	  assertEquals(geo.luasTrapesiumActual(a, b, t),(geo.luasTrapesiumExpect(a, b, t))," KEDUA DATA TIDAK COCOK ");
  }
  
  
 

}
