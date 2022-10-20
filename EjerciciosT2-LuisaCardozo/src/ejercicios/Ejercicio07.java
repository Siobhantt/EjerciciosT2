package ejercicios;

import java.util.Scanner;

public class Ejercicio07 {
/*Dada una hora por teclado, (horas, minutos y segundos) 
 * realiza un algoritmo que muestre la hora después de incrementarle un segundo.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaramos las variables
		int horaU, minutosU, segundosU;//en hora user es donde el usuario va a introducir la hora
		
		//iniciamos el scanner
		Scanner lee = new Scanner(System.in);
		
		System.out.println("Por favor introduzca la hora: ");//guardamos la hora que va a introducir el usuario en la variable horaU
		horaU = lee.nextInt();
		
		//guardamos los minutos que va a introducir el usuario en la variable minutosU
		System.out.println("Por favor introduzca los minutos: ");
		minutosU = lee.nextInt();
		
		//guardamos los minutos que va a introducir el usuario en la variable segundosU
		System.out.println("Por favor introduzca los segundos: ");
		segundosU = lee.nextInt();
		
		if (horaU>23 && horaU<25) {
			System.out.println("00");
		}
		else if (minutosU>59 && minutosU<60) {
			System.out.println("00");
		}
		
		else if(segundosU>59 && segundosU<60) {
			System.out.println("00");
		}
	}
	}

