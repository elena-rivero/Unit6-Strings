package exercises;

public class Ejercicio4 {

	public static String invierteCadena(String cadena) {
		String resultado = "";
		
		for(int i=cadena.length()-1; i>=0; i--) {
			resultado += cadena.charAt(i);
		}
		
		return resultado;
	}
	
	public static void main(String[] args) {
		String delReves = invierteCadena("Hola mundo");
		System.out.println(delReves);
	}
}
