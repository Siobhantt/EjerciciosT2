package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {
/*Escribe una aplicación que solicite al usuario un número comprendido entre 0 y 9999.
	La aplicación tendrá que indicar si el número introducido es capicúa.*/
	public static void main(String[] args) {
		//Establecemos los variables donde guardaremos el numero que introducirá el usuario
		int numUser;
		
		//Iniciamos el scanner
		Scanner lee = new Scanner(System.in);
		
		
		//procedemos a leer el numero del usuario
		
		System.out.println("Introduzca un numero entre 0 y 9999 para verificar si es capicúa: ");
		numUser= lee.nextInt();
		
		//establecemos el limite en el que el usuario debe introducir los numeros
		
		if (numUser<0 || numUser>9999) {
			System.out.println("ERROR! Por favor introduzca un numero entre 0 y 9999");
		}
		
		else {
			if (numUser <=9) {
				System.out.println("El numero es capicua");
			}
			
			/*Para la segunda comprobacion comprobamos que las 2 cifras sean iguales
			para esto sacamos el modulo entre 10 del numero y tambien la divison entre 10,
			 el modulo por 10 nos da la unidad, la division entre 10 nos da la decena,
			  la division entre 100 y el modulo de ese resultado entre 10 nos da la centena
			  y la division entre 1000 nos da los millares*/
			
			else if (numUser<=99 && numUser%10 == numUser/10) {
				System.out.println("El numero es capicua");
			}
			
			else if (numUser<=999 && numUser%10 == numUser/100%10) {
				System.out.println("El numero es capicua");
			} 

			else if (numUser<=9999 && (numUser%10 == (int)numUser/1000) && (numUser/10 == (numUser/100)%10)) {
				System.out.println("El numero es capicua"); 
			}
			
			else {
				System.out.println("El numero no es capicua");
			}
			
		}
	
		
		
		
		
	}
		
}

	
