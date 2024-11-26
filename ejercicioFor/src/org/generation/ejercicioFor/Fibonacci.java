package org.generation.ejercicioFor;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa un número:");
		int numero = scanner.nextInt();
		scanner.close();
		
		int segundoNumero = numero + 1;
		int contador = 0;
		int resultado = 0;
		do {
			System.out.println(numero);
			resultado = numero + segundoNumero;
			numero = segundoNumero;
			segundoNumero = resultado;
			
			contador++;
		}while(contador <=10);

	}

}
