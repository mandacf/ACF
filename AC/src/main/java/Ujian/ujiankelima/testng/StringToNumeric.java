package Ujian.ujiankelima.testng;

public class StringToNumeric {
	
	public boolean parseToIntActual (String strInput)
	{
		boolean isEror  = true;
		int intInput = 0;
		try {
			intInput = Integer.valueOf(strInput);
			
		}catch (Exception e)
		{
			System.out.println(e);
			isEror = false;
		}

		System.out.println("Ini Adalah Data Actual : " + intInput);
		System.out.println("===========================================");
		System.out.println(" ");
		return isEror;
	}
	
	public boolean parseToIntExpect(String strInput)
	{
		boolean isEror  = true;
		int intInput = 0;
		try {
			intInput = Integer.parseInt(strInput);
			
		}catch (Exception e)
		{
			System.out.println(e);
			isEror = false;
		}
		
		System.out.println("Ini Adalah Data Expect : " + intInput);
		System.out.println("===========================================");
		System.out.println(" ");
		return isEror;
	}
    
	public boolean parseToFloatActual (String strInput)
	{
		boolean isEror  = true;
		Float floInput = (float) 0.0;
		try {
			floInput = Float.valueOf(strInput);
			
		}catch (Exception e)
		{
			System.out.println(e);
			isEror = false;
		}

		System.out.println("Ini Adalah Data Actual : " + floInput);
		System.out.println("===========================================");
		System.out.println(" ");
		return isEror;
	}
	
	public boolean parseToFloatExpect(String strInput)
	{
		boolean isEror  = true;
		Float floInput = (float) 0.0;
		try {
			floInput = Float.parseFloat(strInput);
			
		}catch (Exception e)
		{
			System.out.println(e);
			isEror = false;
		}
		
		System.out.println("Ini Adalah Data Expect : " + floInput);
		System.out.println("===========================================");
		System.out.println(" ");
		return isEror;
	}
	
	public boolean parseToDoubleActual (String strInput)
	{
		boolean isEror  = true;
		double douInput = 0.0;
		try {
			douInput = Float.valueOf(strInput);
			
		}catch (Exception e)
		{
			System.out.println(e);
			isEror = false;
		}

		System.out.println("Ini Adalah Data Actual : " + douInput);
		System.out.println("===========================================");
		System.out.println(" ");
		return isEror;
	}
	
	public boolean parseToDoubleExpect(String strInput)
	{
		boolean isEror  = true;
		double douInput = 0.0;
		try {
			douInput = Float.parseFloat(strInput);
			
		}catch (Exception e)
		{
			System.out.println(e);
			isEror = false;
		}
		
		System.out.println("Ini Adalah Data Expect : " + douInput);
		System.out.println("===========================================");
		System.out.println(" ");
		return isEror;
	}
		

  }
    
    
   
	
    
    


