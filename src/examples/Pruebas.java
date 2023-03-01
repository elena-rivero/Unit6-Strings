package examples;

import java.util.Scanner;

public class Pruebas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String operacion = sc.next();
		
		String[] array = operacion.split(";");
		
		if(array.length==3) {
			int num1 = Integer.parseInt(array[0]);
			int num2 = Integer.parseInt(array[2]);
			int res=0;
			switch(array[1]) {
			case "+":
				res = num1+num2;
				break;
			}
		} else {
			System.out.println("El formato es erróneo");
		}
		
		sc.close();
		
	}

	
}
