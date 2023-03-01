package exercises;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Frase resultante de concatenar las palabras leídas de teclado
		String frase = "";
		
		// En esta variable iré guardando las palabras por separado
		String palabra;
		
		// Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca una palabra");
		palabra = sc.next();
		
		while(!palabra.equalsIgnoreCase("fin")) {
			frase += palabra + " ";
			
			System.out.println("Introduzca una palabra");
			palabra = sc.next();
		}
		System.out.println("FRASE: " + frase);
		
		sc.close();
	}

}
