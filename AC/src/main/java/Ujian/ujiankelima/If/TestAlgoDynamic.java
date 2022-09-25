package Ujian.ujiankelima.If;

import java.util.Random;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class TestAlgoDynamic {
	
	
		
	public static void main(String[] args) 
	{
		Random rand = new Random();
		int intJumlahData = rand.nextInt(10,20);
		int intIndexAwal = rand.nextInt(1,10);
		int intIndexAkhir = rand.nextInt(11,15);
		randInteger(intJumlahData, intIndexAwal,intIndexAkhir );
		randDouble(intJumlahData, intIndexAwal,intIndexAkhir);
	}
	
	
	
	public static void randInteger(int intJumlahData, int intIndexAwal, int intIndexAkhir)
	{
		
		
		Random rand = new Random();
		System.out.println("Jumlah Data = " +intJumlahData);
		System.out.println("===================================== ");
		System.out.println("  ");
		
		
		for (int j = 0; j<intJumlahData; j++)
		{
			int nilaiRandom	= rand.nextInt(intIndexAwal,intIndexAkhir);
			System.out.println("Data Integer index ke " +j+ " = "+ nilaiRandom);
		}
		System.out.println("===================================== ");
		System.out.println("  ");
	}
	
	public static void randDouble(int intJumlahData, int intIndexAwal, int intIndexAkhir)
	{

		
		Random rand = new Random();
		
	
		System.out.println("===================================== ");
		System.out.println("  ");
		
		for (int i = 0; i<intJumlahData; i++)
		{
			double nilaiRandom	= rand.nextDouble(intIndexAwal,intIndexAkhir);
			System.out.println("Data Double ke " + i + " =" + nilaiRandom + " ");
		}
		System.out.println("===================================== ");
		System.out.println("  ");
	}

}
