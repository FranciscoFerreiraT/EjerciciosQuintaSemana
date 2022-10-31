import java.util.Scanner;
public class Ejercicio4 {
	 public static void main( String[] args )
	    {
		 	int numero;
	    	int acumulador = 0;
	    	int media ;
	    
	       
	        Scanner keyboard = new Scanner( System.in );
	                
	        for (int i=0;i<10;i++) {
	        	System.out.printf( "Introduzca uan numero: " );
	        	numero = keyboard.nextInt();
	        	acumulador = numero + acumulador;
	        	media = acumulador / i;
	        	System.out.println("La media ahora mismo es de : " + media); 
	        }
}
}