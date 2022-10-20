package ejercicios;

import java.util.Scanner;

public class Ejercicio06 {
/*Realiza el “juego de la suma”, que consiste en que aparezcan dos números aleatorios (comprendidos entre 1 y 99)
 *  que el usuario tiene que sumar. La aplicación debe indicar si el resultado de la operación es correcto o incorrecto.
 *   Para calcular números aleatorios debes usar la función Math.random(),
 *  que devuelve un número aleatorio comprendido entre 0 y 1.*/
	public static void main(String[] args) {
		
		//declaramos las variables 
		int num1,num2, respuestaUser; //num1 y num2 son los dos numeros que el usuario tendrá que sumar
		
		//iniciamos el scanner
		Scanner lee = new Scanner(System.in);
		
		//casteamos el numero random que se nos dará en decimal y lo multiplicamos *99 
		num1 = (int)(Math.random()*99);
		num2 = (int)(Math.random()*99);
		
		//Mostramos el inicio del juego y los dos numeros a suma
		System.out.println("Este es el juego de la suma! Debe introducir la suma de los 2 numeros que aparecerán: " + num1 + " + " + num2);
		
		//Guardamos la respuesta en la variable 
		respuestaUser = lee.nextInt();
		
		//Hacemos la condicion de que si la respuesta del usuario es igual a la suma de los 2 numeros aleatorios el usuario gana
		if (respuestaUser == (num1 + num2)) {
			System.out.println("Has ganado!");
		}
		else {//en caso contrario le animamos al usuario a jugar de nuevo
			System.out.println("Intentalo de nuevo :( ");
		}

		//Cerramos el Scanner
	lee.close();
	}

}
