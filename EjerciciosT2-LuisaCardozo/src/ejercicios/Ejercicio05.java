package ejercicios;
/*Las pruebas que he realizado han sido con los numeros:
 * -546
 * 2
 * */
import java.util.Scanner;

public class Ejercicio05 {
//Utiliza un operador ternario para calcular el valor absoluto de un número que se solicita al usuario por teclado.
	public static void main(String[] args) {
		
		//declaramos la variable conde guardaremos el numero que introducirá el usuario
		
		int numUser;
		
		//iniciamos el scanner
		Scanner lee = new Scanner(System.in);
		
		//leemos el numero del usuario 
		System.out.println("Por favor introduzca un numero: ");
		numUser = lee.nextInt();
		
		/*establecemos en el ternario que si el numero introducido es menor que 0 se multipique por -1 
		 * y asi nos muestre el numero absoluto, en caso contrario que muestre el mismo numero introducido */
		System.out.println(numUser<0 ? numUser*(-1) : numUser);
	
		//Cerramos el scanner
		lee.close();
	}

}
