package Ujian.testUjianKedua;
import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Ujian.ujianKedua.Wrapper;

public class WrapperTest {
	
	Wrapper w = new Wrapper() ;
	Random rm = new Random();

	@BeforeClass
	public void instance() {
		System.out.println();
		System.out.println("=============================================");
		System.out.println("Mulai Lakukan Testing Class Wrapper");
		System.out.println(" ");
		System.out.println("=============================================");
		
	}
	
  @Test
  public void inputDataTest() {
	  String data = genStr();
	  System.out.println("String yang di random = "+data);
	  System.out.println("=============================================");
	  System.out.println("");
//	  String data = "1";

	  
	  assertEquals(w.inputDataActual(data),(w.inputDataExpect(data))," KEDUA DATA TIDAK COCOK ");
  }
  public String genStr() {
		String b = "";
		while(b.length()<=0) {
			int rand= rm.nextInt(47,123);
			if ((rand>47&&rand<58)||(rand>96&&rand<123)) {
				StringBuilder strb = new StringBuilder();
				char c = (char) rand;
				b += strb.append(c).toString();
			}

		}
		return b;
			 
	}
  
 
  
  
}
