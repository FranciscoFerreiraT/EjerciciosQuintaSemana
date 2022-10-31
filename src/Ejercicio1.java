import java.util.Scanner;

public class Ejercicio1
{
    public static void main( String[] args )
    {
    	int numero1;
    	int numero2;
       boolean prueba1 = true;
       
        Scanner keyboard = new Scanner( System.in );

        System.out.printf( "Introduzca un número: " );
        numero1 = keyboard.nextInt();
        Scanner keyboard2 = new Scanner( System.in );

        System.out.printf( "Introduzca un número: " );
        numero2 = keyboard2.nextInt();

        if ( numero1 % numero2 == 0 )
        {
        	prueba1 = true;
            System.out.println( prueba1 );
        }
        else
        {
        	prueba1 = false;
            System.out.println( prueba1 );
        }
    }
}