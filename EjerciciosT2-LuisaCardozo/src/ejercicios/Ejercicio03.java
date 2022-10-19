package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {
/*En una granja se compra diariamente una cantidad de comida para los animales.
 *  Los animales son todos de la misma especie y sabemos que cada animal come los mismos kilos de comida de media diariamente.
Diseña un programa que solicite al usuario los valores anteriores
 (cantidad de comida comprada, número de animales y kilos de comida que comen todos los animales en total)
, y determine si disponemos de alimento suficiente para cada animal.
 En caso negativo, ha de calcular cuál es la ración que corresponde a cada uno de los animales.
*/
	public static void main(String[] args) {
		//establecemos las variables donde guardaremos los kilos de comida que comen los animales, los animales, la comida comprada
	
		double comidaComprada, kgComidaTotal;
		int nAnimales;
		
		//Establecemos el scanner
		Scanner lee = new Scanner(System.in);
		
		//solicitamos al usuario que introduzca los valores que necesitamos
		System.out.println("Por favor introduzca el numero de animales: ");
		nAnimales = lee.nextInt();	
		
		System.out.println("Por favor introduzca cuanto comen los animales diariamente: ");
		kgComidaTotal = lee.nextDouble();
		
		System.out.println("Por favor introduzca cuanta comida ha comprado: ");
		comidaComprada = lee.nextDouble();
		
		
		//en operacion comida guardamos la division de la comida total que comen los animales y la comida que ha comprado el usuario
		if (comidaComprada >= kgComidaTotal) {
			System.out.println("Hay comida suficiente");
		}
		else {
			System.out.println("Como no hay suficiente comida a cada animal le corresponde: " + (comidaComprada / nAnimales) + "kg");
		}
		
		//cerramos el scanner
		lee.close();
	}

}
