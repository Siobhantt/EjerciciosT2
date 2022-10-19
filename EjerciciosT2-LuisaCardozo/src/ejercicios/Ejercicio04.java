package ejercicios;

import java.util.Scanner;

public class Ejercicio04 {
/*Escribe un programa que solicite al usuario un número entero entre 1 y 99. 
 * El programa debe mostrarlo con letras, por ejemplo, para 56 se verá: “cincuenta y seis”.
*/
	public static void main(String[] args) {
		//Declaramos la variable donde el usuario va a guardar el numero que quiere convertir a letra
		int numUser;
		
		//declaramos el scanner y leemos el numero
		
		Scanner lee = new Scanner(System.in);
		
		//imprimimos la solicitud
		System.out.println("Por favor introduzca un numero entre 0 y 99:");
		numUser = lee.nextInt();
		
		if (numUser< 0 || numUser>99) {
			System.out.println("Por favor introduzca un numero dentro del rango.");
		}
		
		//Inicamos un Switch donde primero vamos a establecer los primeros numeros del 1 al 9
		
		else {
			
		switch (numUser) {
		
		case 1 -> {
			System.out.println("uno");
		}
		
		case 2 -> {
			System.out.println("dos");
		}
		
		case 3 -> {
			System.out.println("tres");		
		}
		
		case 4 -> {
			System.out.println("cuatro");
		}
		
		case 5 -> {
			System.out.println("cinco");
		}
		
		case 6 -> {
			System.out.println("seis");
		}
		
		case 7 -> {
			System.out.println("siete");
		}
		
		case 8 -> {
			System.out.println("ocho");
		}
	
		case 9 -> {
			System.out.println("nueve");
		}
		
	
		}
}

}

}
