package Ujian.ujiankelima.If;

import java.util.Random;
import java.util.Scanner;

public class FunctionMath {

	public static void main(String[] args) {
		Random rand = new Random();
		String alas, tinggi;
		double sisimiring;
		boolean isUlang = false;
		
		Scanner scn = new Scanner (System.in);
		do
		{
			try 
			{
				System.out.println("==================================");
				System.out.println("Menghitung sisimiring Segitiga");
				System.out.println("==================================");
				System.out.println(" ");
				System.out.println("Alas : ");
				alas = scn.nextLine();
				double douAlas = Double.parseDouble(alas);
				System.out.println(" ");
				System.out.println("Tinggi : ");
				tinggi = scn.nextLine();
				double douTinggi = Double.parseDouble(tinggi);
				
				sisimiring = douAlas*douAlas + douTinggi*douTinggi;
				System.out.println("============================================================");
				System.out.println("Sisi Miring dengan fungsi Math.abs = " + Math.abs(sisimiring));
				System.out.println("Sisi Miring dengan fungsi Math.round = " + Math.round(sisimiring));
				System.out.println("Sisi Miring dengan fungsi Math.sqrt = " + Math.sqrt(sisimiring));
				System.out.println("Sisi Miring dengan fungsi Math.floor = " + Math.floor(sisimiring));
				System.out.println("Sisi Miring dengan fungsi Math.ceil = " + Math.ceil(sisimiring));
				System.out.println("Sisi Miring dengan fungsi Math.exp = " + Math.exp(sisimiring));
				System.out.println("============================================================");
				
			}catch(NumberFormatException e)
			{
				System.out.println(e);
				isUlang = true;
				System.out.println("Selesai");
			}	
		}
		while(!isUlang);
	}
}
