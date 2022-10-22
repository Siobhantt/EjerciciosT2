package ejercicios;
/*Las pruebas que he realizado han sido con los numeros: 
 * (Animales: 400, 50, 100, 2, 4)
 * (Lo que comen: 17000, 250, 1000, 10, 5)
 * (Comida Comprada: 15000, 200, 1500, 20, 50)*/
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
	
		double comidaComprada, loQueComen, ifNotEnough;
		int nAnimales;
		
		//Establecemos el scanner
		Scanner lee = new Scanner(System.in);
		
		//solicitamos al usuario que introduzca los valores que necesitamos
		System.out.println("Por favor introduzca el numero de animales: "); //el numero de animales
		nAnimales = lee.nextInt();	
		
		System.out.println("Por favor introduzca cuanto comen los animales diariamente: "); //la comida que consumen diariamente
		loQueComen = lee.nextDouble();
		
		System.out.println("Por favor introduzca cuanta comida ha comprado: "); //cuanta comida ha comprado el usuario
		comidaComprada = lee.nextDouble();
		
		ifNotEnough = comidaComprada/nAnimales; /*En esta variable guardaremos la division entre la comida que tiene el usuario 
		y los animales que hay para el caso de que no haya comida suficiente*/
		 
		
		/*Aqui establecemos que si la comida comprar dividida entre el nº de animales es mayor o igual
		 * a lo que comen entonces hay comida suficiente*/
		
		if ((comidaComprada/nAnimales) >= loQueComen) {
			System.out.println("Hay comida suficiente!");
		}
		/*En caso contrario imprimimos la variable ifNotEnough que contiene la division de la comida comprada y los animales */
		else {
			System.out.println("Como no hay suficiente comida a cada animal le corresponde: " + (ifNotEnough) + "kg");
		}
		
		//cerramos el scanner
		lee.close();
	}

}
