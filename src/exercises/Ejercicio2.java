package exercises;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Contraseña a adivinar
		String password;
		String answer;

		// Creo el Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("JUGADOR1: Introduzca una contraseña:");
		password = sc.nextLine();

		do {
			System.out.println("JUGADOR2: Introduzca cuál es la clave");
			answer = sc.nextLine();

			for (int i = 0; i < password.length(); i++) {

				if (i < answer.length() && password.charAt(i) == answer.charAt(i)) {
					System.out.print(password.charAt(i));
				} else {
					System.out.print("*");
				}

			}
			
			System.out.println();
		} while (!answer.equals(password));

		System.out.println("ENHORABUENA: Has acertado");
		// Cierro el Scanner
		sc.close();
	}

}
