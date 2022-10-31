import java.util.Scanner;

public class Ejercicio2
{
	public static boolean Primo(int n) {
		for (int i=1;i<n;i++) {
			return false;
		}
		return true;
	}
    public static void main( String[] args )
    {
    	int numero1;
    	 Scanner keyboard = new Scanner( System.in );
    	 System.out.printf( "Introduzca un número: " );
         numero1 = keyboard.nextInt();
    	
         if (numero1 < 100) {
        	 System.out.println(Primo(numero1));
         }else {
        	 System.out.println("Es mayor de 100"); 
         }
    }
}