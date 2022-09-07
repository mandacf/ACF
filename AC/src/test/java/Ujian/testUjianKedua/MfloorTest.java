package Ujian.testUjianKedua;
import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Ujian.ujianKedua.Mfloor;

public class MfloorTest {
	Mfloor m = new Mfloor();
	Random rm = new Random();
	
	@BeforeClass
	public void instance() {
		System.out.println();
		System.out.println("=============================================");
		System.out.println("Mulai Lakukan Testing Class Geometri");
		System.out.println("=============================================");
		
	}

  @Test
  public void MathTest() {
    double a = rm.nextDouble(1.0, 100.0);
	  assertEquals(m.MathActual(a),m.MathExpect(a));
  }
}
