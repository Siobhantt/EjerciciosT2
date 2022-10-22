package ejercicios;
/*Las pruebas que he realizado han sido con los numeros: 
 * 6277465 
 * 29504688
 * 67
 * 5
 * 26386973*/
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		//Introducimos la variable donde guardaremos lo que va introducir el usuario
		
		int dniUser;
		
		//iniciamos el scanner 
		
		Scanner lee = new Scanner (System.in);
		
		//leemos el numero de 8 digitos que introducirá el usuario
		System.out.println("Por favor introduzca su numero de DNI, solo los numeros: ");
		System.out.println("El numero de DNI debe contener 8 digitos!");
		dniUser = lee.nextInt();
		
		/*Verificamos que el usuario introduzca un numero correcto poniendo como minimo 10000000 y como tope 99999999*/
		
		if (dniUser>99999999 || dniUser<10000000) {
			System.out.println("El numero de dni es incorrecto.");
	}
		/*Ahora en un switch hacemos un modulo 23 del numero introducido por el usuario*/
		else {
		
		switch (dniUser%23) {
		
		/*A cada posible caso le asignamos la letra correspondiente a la tabla que nos han dado*/
		case 0 -> {
			System.out.println(dniUser + "T");
		}
		
		case 1 -> {
			System.out.println(dniUser + "R");
		}
		
		case 2 -> {
			System.out.println(dniUser + "W");
		}
		
		case 3 -> {
			System.out.println(dniUser + "A");
		}
		
		case 4 -> {
			System.out.println(dniUser + "G");
		}
		
		case 5 -> {
			System.out.println(dniUser + "M");
		}
		
		case 6 -> {
			System.out.println(dniUser + "Y");
		}
		
		case 7 -> {
			System.out.println(dniUser + "F");
		}
		
		case 8 -> {
			System.out.println(dniUser + "P");
		}
		case 9 -> {
			System.out.println(dniUser + "D");
		}
		case 10 -> {
			System.out.println(dniUser + "X");
		}
		case 11 -> {
			System.out.println(dniUser + "B");
		}
		case 12 -> {
			System.out.println(dniUser + "N");
		}
		case 13 -> {
			System.out.println(dniUser + "J");
		}
		case 14 -> {
			System.out.println(dniUser + "Z");
		}
		case 15 -> {
			System.out.println(dniUser + "S");
		}
		case 16 -> {
			System.out.println(dniUser + "Q");
		}
		case 17 -> {
			System.out.println(dniUser + "V");
		}
		case 18 -> {
			System.out.println(dniUser + "H");
		}
		case 19 -> {
			System.out.println(dniUser + "L");
		}
		case 20 -> {
			System.out.println(dniUser + "C");
		}
		case 21 -> {
			System.out.println(dniUser + "K");
		}
		case 22 -> {
			System.out.println(dniUser + "E");
		}
		/*Establecemos el default por cualquier cosa que salga de los 23 casos */
		default -> {
			System.out.println("Error, introduzca el numero correctamente");
		}
	}
}

//cerramos el scanner
		lee.close();
}
}
