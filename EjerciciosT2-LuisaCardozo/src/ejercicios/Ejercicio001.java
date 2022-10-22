package ejercicios;
/*Las pruebas que he realizado han sido con los numeros: 
 *66
 *4114
 *9
 *131*/
import java.util.Scanner;

public class Ejercicio001 {
/*Escribe una aplicación que solicite al usuario un número comprendido entre 0 y 9999.
	La aplicación tendrá que indicar si el número introducido es capicúa.*/
	public static void main(String[] args) {
		
		//Establecemos los variables donde guardaremos el numero que introducirá el usuario
		int numUser, unidad, centena, decena, millar; /*Aqui vamos a guardar lo que va a introducir el usuario y tambien 
		en las variables de u,d,c y m, guardaremos la manera de identificar cada uno*/
		
		//Iniciamos el scanner
		Scanner lee = new Scanner(System.in);
		
		
		//procedemos a leer el numero del usuario
		
		System.out.println("Introduzca un numero entre 0 y 9999 para verificar si es capicúa: ");
		numUser= lee.nextInt();
		
		/*Sabiendo que la unidad se obtiene con el modulo de 10 guardamos esto en una variable*/
		unidad = numUser%10;
		
		/*para conseguir la decena dentro de un parentesis dividimos el numero introducido entre 10 y a eso le sacamos modulo 10*/
		decena = (numUser/10)%10;
		
		/*para conseguir la centena dividimos el numero introducido entre 100 y a eso le sacamos el modulo 10*/
		centena = (numUser/100)%10;
		
		/*para conseguir el millar dividimos el numero introducido entre 1000 y a eso le sacamos modulo 10*/
		millar = (numUser/1000)%10;
		
		//establecemos el limite en el que el usuario debe introducir los numeros
		
		if (numUser<0 || numUser>9999) {
			System.out.println("ERROR! Por favor introduzca un numero entre 0 y 9999");
		}
		
		//establecemos las condiciones 
		
		else {
		//en este if establecemos que si el numero es de una cifra automaticamente es capicua
		if (numUser <=9) {
			System.out.println("El numero es capicua.");
		}
		//aqui estblecemos que si el numUser es menor o igual a 99 y la unidad es igual a la decena entonces el numero es capicua
		else if (numUser<=99 && unidad == decena){
			System.out.println("El numero es capicua.");
		}
		//aqui establecemos que si el numUser es menor o igual que 999 y la unidad y la centena son iguales entonces el numero es capicua
		else if (numUser <=999 && unidad == centena) {
			System.out.println("El numero es capicua.");
		}
		/*aqui establecemos que si el numUser es mayor o igual a 1000 Y menor o igual a 9999 
		 * Y la unidad y el millar son iguales pero tambien son iguales la decena y la centena entonces el numero es capicua*/
		else if (numUser >= 1000 && numUser<=9999 && unidad == millar && decena == centena) {
			System.out.println("El numero es capicua.");
		}
		/*en caso de que no se cumpla nada de lo anterior se le hace saber al usuario que el numero no es capicúa*/
		else {
		System.out.println("El numero no es capicua.");
		}
		
		//cerramos el scanner
		lee.close();
		}
	}
	}


