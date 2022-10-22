package ejercicios;
/*Las pruebas que he realizado han sido con los numeros:
 *segundos:59, 59, 4, 59, 00, 59, 59
 *minutos:59, 5, 12, 14, 59, 59, 14
 *horas:23, 15, 20, 8, 7, 59, 4*/
import java.util.Scanner;

public class Ejercicio07 {
/*Dada una hora por teclado, (horas, minutos y segundos) 
 * realiza un algoritmo que muestre la hora después de incrementarle un segundo.*/
	public static void main(String[] args) {
		
		//declaramos las variables
		int horaU, minutosU, segundosU;//en hora user es donde el usuario va a introducir la hora
		
		//iniciamos el scanner
		Scanner lee = new Scanner(System.in);
		
		//guardamos los minutos que va a introducir el usuario en la variable segundosU
		System.out.println("Por favor introduzca los segundos: ");
		segundosU = lee.nextInt();
		
		//guardamos los minutos que va a introducir el usuario en la variable minutosU
		System.out.println("Por favor introduzca los minutos: ");
		minutosU = lee.nextInt();
		
		System.out.println("Por favor introduzca la hora: ");//guardamos la hora que va a introducir el usuario en la variable horaU
		horaU = lee.nextInt();
		
		//Establecemos un if donde el usuario solo pueda colocar una hora del 0 al 24
		
		if (horaU> 24 || horaU<0 || minutosU>59 || minutosU<0 || segundosU>59 || segundosU<0) {
			System.out.println("Error, introduzca una hora valida.");
		}
		
		/*Establecemos que si hora es igual a 23, minutos es igual a 59 y
		 *  segundos es igual a 59 se reinicie el contador a 0*/
		
			else if (segundosU == 59 && minutosU == 59 && horaU == 23) {
				System.out.println("Los segundos son: " + (segundosU = 00));
				System.out.println("Los minutos son " + (minutosU = 00));
				System.out.println("Las horas son: " + (horaU = 00));
			}
		
		//establecemos que si los segundos son menores a 59 solo se sume un segundo a la variable segundos
			else if (segundosU<59) {
			System.out.println("Los segundos son: " + (segundosU+1));
			System.out.println("Los minutos son " + (minutosU));
			System.out.println("Las horas son: " + (horaU));
		}
		
		/*establecemos que si los segundos son iguales a 59 y los minutos son menores a 59
		 * se pone el contador de segundos a 00 y si incrementan los minutos en 1*/
		
			else if(segundosU == 59 && minutosU<59){
			System.out.println("Los segundos son: " + (segundosU = 00));
			System.out.println("Los minutos son " + (minutosU +1));
			System.out.println("Las horas son: " + (horaU));
			}
		
			/*En este if establecemos que si minutos es igual a 59 y segundos igual a 59 
			 * se incremente la hora en 1*/
		
		else if (minutosU == 59 && segundosU == 59) {
			System.out.println("Los segundos son: " + (segundosU = 00));
			System.out.println("Los minutos son " + (minutosU = 00));
			System.out.println("Las horas son: " + (horaU +1));
			}
			
		//cerramos el scanner
		lee.close();
		}
		
			
	}

	


