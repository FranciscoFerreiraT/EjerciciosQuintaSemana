import java.util.Scanner;
public class Ejercicio3 {
	 public static void main( String[] args )
	    {
	    	String palabra;
	    	
	    
	       
	        Scanner keyboard = new Scanner( System.in );

	        System.out.printf( "Introduzca uan palabra: " );
	        palabra = keyboard.nextLine();
	        
	        for (int i=0;i<palabra.length();i++) {
	        	System.out.println( palabra.charAt(i) );
	        }
}
}