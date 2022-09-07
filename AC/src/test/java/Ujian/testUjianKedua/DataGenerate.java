package Ujian.testUjianKedua;

import java.util.Random;

public class DataGenerate {
	
	Random rdm = new Random();
	
	public String stringRdm() {
//		int batasMin = 97; // letter 'a'
		int batasMin = 48; // numeral '0'
	    int batasMax = 122; // letter 'z'
	    int targetStringLength = 2;
	    String generatedString = rdm.ints(batasMin, batasMax + 1)
	    	      .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
	    	      .limit(targetStringLength)
	    	      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
	    	      .toString();
	    System.out.println("INPUT : " +generatedString);
	    return generatedString;
	}
	
	public int intRdm(int x, int y) {
		int intGenerate = rdm.nextInt(x, y);
		return intGenerate;
	}

}
