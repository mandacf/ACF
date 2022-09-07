package Ujian.ujianKedua;

public class Mfloor {
	
	
	
	public double MathActual (double a) {
		double nilai = (int)Math.floor(a);
		System.out.println("Menguji method actual Math Floor " + a  );
		System.out.println("hasil -> " + (int)nilai );
		return nilai;
	}
	
	public double MathExpect (double a) {
		double value = (int) a;
		System.out.println("Menguji method expect Math Floor " + a );
		System.out.println("hasil -> " + (int)value );
		return value;
		
		
	}

}
