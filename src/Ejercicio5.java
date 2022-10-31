import java.util.Scanner;
public class Ejercicio5 {
	 public static void main( String[] args )
	    {
		 	int numero1;
	    	int numero2;
	    	String decision;
	    int resultado;
	       
	        Scanner keyboard = new Scanner( System.in );
	      
	        System.out.printf( "Que quiere relaizar Suma,Resta,Multiplicacion o Division");
	        decision = keyboard.nextLine();
	        System.out.printf( "Escriba el primer numero");
	        numero1 = keyboard.nextInt();
	        System.out.printf( "Escriba el segundo numero");
	        numero2 = keyboard.nextInt();
	        
	        if (decision == "Suma") {
	        	 System.out.printf( "Escriba el primer numero");
	 	        numero1 = keyboard.nextInt();
	 	        System.out.printf( "Escriba el segundo numero");
	 	        numero2 = keyboard.nextInt();
	        	resultado = numero1+numero2;
	        	System.out.println("El resultado de la suma es : " + resultado);
	        }else if (decision == "Resta") {
	        	 System.out.printf( "Escriba el primer numero");
	 	        numero1 = keyboard.nextInt();
	 	        System.out.printf( "Escriba el segundo numero");
	 	        numero2 = keyboard.nextInt();
	        	resultado = numero1-numero2;
	        	System.out.println("El resultado de la resta es : " + resultado);
	        }else if (decision == "Multiplicacion") {
	        	 System.out.printf( "Escriba el primer numero");
	 	        numero1 = keyboard.nextInt();
	 	        System.out.printf( "Escriba el segundo numero");
	 	        numero2 = keyboard.nextInt();
	        	resultado = numero1*numero2;
	        	System.out.println("El resultado de la multiplicacion es : " + resultado);
	        }else if (decision == "Division") {
	        	 System.out.printf( "Escriba el primer numero");
	 	        numero1 = keyboard.nextInt();
	 	        System.out.printf( "Escriba el segundo numero");
	 	        numero2 = keyboard.nextInt();
	        	resultado = numero1/numero2;
	        	System.out.println("El resultado de la division es : " + resultado);
	        }
	        
	    }
}