package Ujian.ujianKedua;
import java.util.Scanner;
public class Wrapper {
	public static void main(String[] args) {
		

    }
    public int inputDataExpect(String data){ //void tidak mengembalikan nilai
        System.out.println("String to Integer Expect: "+dataTemp(data));
        System.out.println("---------------------------");
        return dataTemp(data);
    }
    public static int dataTemp(String data){ //fungsi dieksekusi langsung tanpa harus buat intansiasi objek

    	Integer objInt = Integer.parseInt(data);
        return objInt;
    }
    
    public int inputDataActual(String data2) {
        System.out.println("String to Integer actual: "+dataTemp2(data2));
        System.out.println("---------------------------");
        return dataTemp2(data2);
    }
    
    public static int dataTemp2(String data2){
    	Integer value = Integer.valueOf(data2);
        return value;
    }
    
    
    

}

