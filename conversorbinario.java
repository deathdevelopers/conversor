/*
Método que devuelva un número en:
binario
	static String binario(int)
octal
	static String octal(int)
hexadecimal
	static String hexadecimal(int)

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ejercicio04 {

	public static void main(String[] args) {
		BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
		int numero = 0;
		boolean pass = false;
		
		
		do{
			try{
				pass = true;
				System.out.print("Introduce entero positivo: ");
				numero = Integer.parseInt(s.readLine());
			} catch (NumberFormatException | IOException e){
				pass = false;
				System.out.println("Error. Debe ser un entero");
			}
			if(numero <= 0){
				pass = false;
				System.out.println("Error. Debe ser positivo");
			}
		}while(!pass);
		
		
		System.out.println(numero+" en binario --> "+binario(numero));
		System.out.println(numero+" en octal --> "+octal(numero));
		System.out.println(numero+" en hexadecimal --> "+hexadecimal(numero));
	}
	
	
	public static String binario(int numero){
		int resto;
		String binario = "";
		 while(numero > 0){
		    	resto = numero % 2; 
		    	binario = resto + binario; 
		    	numero = numero / 2;
		    	}
		    
		    return binario;
	}

<<<<<<< HEAD
	static String hexadecimal(int num){
		int acum=0;
		String resultado="";
		final char[] arrayHexa={'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		while(num>0){
			acum=num%16;
			resultado=arrayOctal[acum]+resultado;
			num/=16;
		}
		return resultado;
	}
		
}
=======
	static String octal(int num){
		int acum=0;
		String resultado="";
		final char[] arrayOctal={'0', '1', '2', '3', '4', '5', '6', '7'};
		while(num>0){
			acum=num%8;
			resultado=arrayOctal[acum]+resultado;
			num/=8;
		}
		return resultado;
	}
}

>>>>>>> octal
