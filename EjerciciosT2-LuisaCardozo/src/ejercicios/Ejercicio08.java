package ejercicios;
/*Las pruebas que he realizado han sido con los numeros:
 * Km recorridos: 800, 800, 800, 800, 799, 900, 300,900
 * dias de estancia: 7, 6, 3, 1, 7, 8, 8,6
 * */
import java.util.Scanner;

public class Ejercicio08 {
/*Determinar el precio de un billete de tren, conociendo la distancia a recorrer, 
 * y sabiendo que si el número de días de estancia es superior a 7 
 * y la distancia superior a 800 km el billete tiene una reducción del 30%.
 *  El precio por kilómetro es de 2,5€.
 *  La distancia a recorrer y el número de días de estancia los debes solicitar al usuario por teclado.*/
	
	public static void main(String[] args) {
		
		//establecemos las variables 
		int estanciaU, distanciaRecorrida; //en estas variables guardamos los dias de estancia y la distancia a recorrer
		double billeteUser;
		final double PRECIOKM = 2.5;
		final double DESCUENTO = 0.3;
		double descTotal;
		
		//iniciamos el scanner
		Scanner lee = new Scanner(System.in);
		
		//Le solicitamos al usuario la distancia a recorrer y el n de dias de estancia
		System.out.println("Por favor introduzca la distancia a recorrer: ");
		distanciaRecorrida = lee.nextInt();
		
		System.out.println("Por favor introduzca el numero de dias de estancia: ");
		estanciaU = lee.nextInt();
		
		//ponemos un minimo para que al usuario no se lo ocurra poner numeros negativos
		if (distanciaRecorrida < 0 || estanciaU <0) {
			System.out.println("Error, distancia y estancia no validas.");
		}
		
		else {
		//en billete user vamos a guardar la multiplicacion de la distancia por los 2,5
		billeteUser = PRECIOKM * distanciaRecorrida; 
		
		//en desTotal vamos a guardar el precio del billete menos el descuento
		descTotal = billeteUser - (billeteUser* DESCUENTO);
		
		
		//establecemos un if donde si la distancia es mayor a 800 y la estancia es mayor a 7, entonces se aplicará el descTotal
		if (estanciaU >= 7 && distanciaRecorrida >= 800) {
			System.out.println("El precio final de su billete con el descuento del 30% aplicado es : " + (descTotal) + "euros");
		}
		else { //en caso contrario solo va a imprimir el precio del billete
			System.out.println("El precio del billete es: " + billeteUser + " euros.");
		}
	}
		
	//Cerramos el scanner
		lee.close();
	}

}
