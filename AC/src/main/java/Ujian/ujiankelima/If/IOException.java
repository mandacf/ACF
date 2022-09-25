package Ujian.ujiankelima.If;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOException {
	public static void main(String[] args) {
	FileInputStream readFile = null;	
	try {
		readFile = new FileInputStream("C:\\Users\\NEXSOFT\\Documents\\ACF\\Ujian_Keempat\\jMeter\\ACF_User_Manual.docx");
		readFile.close();
	}catch(Exception e)
	{
		System.out.println("FILE TIDAK DITEMUKAN !!");
		
	}        
	System.out.println("");
	System.out.println("Next Statment.....");
}

}
