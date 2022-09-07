package Ujian.ujianKedua;

public class Geometri {
	
	public static int luasPersegiExpect (int sisi) {
		int luasPersegi = sisi*sisi;
		System.out.println("Menguji method luasPersegiExpect" + sisi + "x" + sisi + "=" + luasPersegi );
		return luasPersegi;
	}
	
	public static int luasPersegiActual (int sisi) {
		int luasPersegi = sisi*sisi *(sisi/sisi);
		System.out.println("Menguji method luasPersegiActual" + sisi + "x" + sisi + "=" + luasPersegi );
		return luasPersegi;
	}
        
        public static double luasSegitigaExpect (int alas, int tinggi) {
		double luasSegitiga = (alas*tinggi)/2;
		System.out.println("Menguji method luasSegitigaExpect dengan alas = " + alas + " dan tinggi " + tinggi + " adalah " + luasSegitiga );
		return luasSegitiga;
	}
	
	public static double luasSegitigaActual (int alas, int tinggi) {
		double luasSegitiga = ((alas*tinggi)/2) * (tinggi/tinggi);
		System.out.println("Menguji method luasSegitigaActual dengan alas = " + alas + " dan tinggi " + tinggi + " adalah " + luasSegitiga );
		return luasSegitiga;
	}
        
        public static double luasTrapesiumExpect (int a, int b, int t) {
		double luasTrapesium = 0.5 * (t *(a+b));
		System.out.println("Menguji method luasTrapesiumExpect dengan sisi atas = " + a + ", sisi bawah = " +b+" dan tinggi " + t + " adalah " + luasTrapesium );
		return luasTrapesium;
	}
	
	public static double luasTrapesiumActual (int a, int b, int t) {
		double luasTrapesium = (t *(a+b))/2;
		System.out.println("Menguji method luasTrapesiumActual dengan sisi atas = " + a + ", sisi bawah = " +b+" dan tinggi " + t + " adalah " + luasTrapesium );
		return luasTrapesium;
	}
        
        public static void main(String[] args) { 
            System.out.println(luasTrapesiumExpect(2,2,3));
            System.out.println(luasTrapesiumActual(2,2,3));
            System.out.println("=====================");
            System.out.println(luasPersegiExpect(3));
            System.out.println(luasPersegiActual(3));
            System.out.println("=====================");
            System.out.println(luasSegitigaExpect(3,2));
            System.out.println(luasSegitigaActual(3,2));
        }
        
       

}
